package cn.zeroup.macrocosm.cv;

import io.vertx.tp.ke.cv.KeIpc;

/**
 * To avoid duplicated with Addr class, here provide new class named 'HighWay'
 * for address value on event bus, the same usage objective for 'Addr'
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */

public interface HighWay {
    /*
     * Queue for reading
     */
    interface Queue {
        // Fetch by who created: CREATED_BY
        String TASK_QUEUE = KeIpc.Workflow.EVENT + "W-TODO/TASK/QUEUE";

        // Fetch before creation
        String TASK_FORM = KeIpc.Workflow.EVENT + "W-TODO/TASK/VIRTUAL-FORM";
    }

    /*
     * Processing for writing
     */
    interface Do {
        // Start new workflow instance
        String FLOW_START = KeIpc.Workflow.EVENT + "W-INSTANCE/START";

        // Complete and next workflow instance
        String FLOW_COMPLETE = KeIpc.Workflow.EVENT + "W-INSTANCE/COMPLETE";
    }

    /*
     * Processing for definition
     */
    interface Flow {
        // Fetch Workflow by code
        String BY_CODE = KeIpc.Workflow.EVENT + "W-FLOW/BY/CODE";
    }

    interface Todo {

        String BY_ID = KeIpc.Workflow.EVENT + "W-TODO/BY-ID";
    }
}
