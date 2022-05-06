package io.vertx.tp.workflow.uca.component;

import cn.zeroup.macrocosm.cv.em.TodoStatus;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.*;
import io.vertx.tp.workflow.uca.modeling.Register;
import io.vertx.up.atom.Refer;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TransferStandard extends AbstractMovement implements Transfer {
    @Override
    public Future<WRecord> moveAsync(final WRequest request, final WProcess wProcess) {
        /*
         * Capture the next task for standard workflow
         * 1. Here camunda-workflow task has been finished
         * 2. Check condition in workflow engine
         * -- 2.1. Active task is not end
         * -- 2.2. Next task is user task
         * */
        final Refer refer = new Refer();
        return this.inputAsync(request.request())


            /*
             * Entity / Extension Ticket Record Execution, ( Update )
             * Todo Updated with normalized
             * */
            .compose(refer::future)
            .compose(normalized -> this.saveAsync(
                /*
                 * Todo Data Only
                 */
                AidTodo.closeJ(normalized, wProcess), wProcess)
            )
            .compose(this.saveAsyncFn(refer.get(), wProcess))
            .compose(request::record)
            /*
             * Trigger next todo generation here
             */
            .compose(record -> wProcess.taskActive().compose(taskNext -> {
                /*
                 * Todo Generation Condition
                 * 1. Instance is not ended
                 * 2. Next task is not null
                 */
                if (wProcess.isContinue(taskNext)) {
                    /*
                     * Here the taskNext is not null
                     */
                    return Divert.event(taskNext).compose(divert -> {
                        /*
                         * Create new WProcess based on process / task and move
                         *
                         * Here instance contains previous data such as:
                         * 1. Task
                         * 2. ConfigRunner is runConfig
                         * 3. ProcessInstance
                         *
                         * The WMove should be generated by
                         * 1. Previous task definition key
                         * 2. Data with
                         */
                        divert.bind(this.rules());
                        return divert.transferAsync(request, wProcess);
                    });
                } else {
                    return Ux.future(record);
                }
            })).compose(record -> this.afterAsync(record, wProcess));
    }

    private Function<WRecord, Future<WRecord>> saveAsyncFn(final JsonObject input, final WProcess process) {
        return record -> {
            /*
             * Double check for `insert record`
             * Here will execute twice on entity record instead of one
             * 1. Insert -> Move Update
             * 2. Update -> Move Update
             * The `status` should be previous status
             * - ADD -> Inserted Status
             * - UPDATE -> Original Stored Status
             */
            final TodoStatus status = record.status();
            JsonObject request = input.copy();
            request.mergeIn(record.data());
            final MetaInstance metadataOut = MetaInstance.output(record, this.metadataIn());
            if (TodoStatus.PENDING == status) {
                /*
                 * Move Rules
                 */
                final WMoveRule moveRule = process.ruleFind();
                if (Objects.nonNull(moveRule) && Ut.notNil(moveRule.getRecord())) {
                    /*
                     * Here will fetch record auto
                     * Critical step to update `record` field here
                     */
                    request = this.recordMove(request, moveRule);
                }
            }
            /*
             * Contains record modification, do update on record.
             */
            final Register register = Register.instance(request);
            return register.saveAsync(request, metadataOut).compose(nil -> Ux.future(record));
        };
    }
}
