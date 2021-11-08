/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XTodo;
import cn.vertxup.ambient.domain.tables.records.XTodoRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTodoDao extends AbstractVertxDAO<XTodoRecord, cn.vertxup.ambient.domain.tables.pojos.XTodo, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>>, Future<cn.vertxup.ambient.domain.tables.pojos.XTodo>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XTodoRecord,cn.vertxup.ambient.domain.tables.pojos.XTodo,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public XTodoDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(XTodo.X_TODO, cn.vertxup.ambient.domain.tables.pojos.XTodo.class, new JDBCClassicQueryExecutor<XTodoRecord,cn.vertxup.ambient.domain.tables.pojos.XTodo,String>(configuration,cn.vertxup.ambient.domain.tables.pojos.XTodo.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.ambient.domain.tables.pojos.XTodo object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByName(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByCode(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByIcon(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.ICON.in(values));
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByIcon(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.ICON.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>TODO_URL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByTodoUrl(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TODO_URL.in(values));
        }

        /**
     * Find records that have <code>TODO_URL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByTodoUrl(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TODO_URL.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByType(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelId(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.MODEL_ID.in(values));
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelId(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.MODEL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelKey(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.MODEL_KEY.in(values));
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelKey(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.MODEL_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_CATEGORY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelCategory(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.MODEL_CATEGORY.in(values));
        }

        /**
     * Find records that have <code>MODEL_CATEGORY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelCategory(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.MODEL_CATEGORY.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_FORM IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelForm(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.MODEL_FORM.in(values));
        }

        /**
     * Find records that have <code>MODEL_FORM IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelForm(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.MODEL_FORM.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelComponent(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.MODEL_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>MODEL_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByModelComponent(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.MODEL_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>INSTANCE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByInstance(Collection<Boolean> values) {
                return findManyByCondition(XTodo.X_TODO.INSTANCE.in(values));
        }

        /**
     * Find records that have <code>INSTANCE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByInstance(Collection<Boolean> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.INSTANCE.in(values),limit);
        }

        /**
     * Find records that have <code>TO_GROUP_MODE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToGroupMode(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TO_GROUP_MODE.in(values));
        }

        /**
     * Find records that have <code>TO_GROUP_MODE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToGroupMode(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TO_GROUP_MODE.in(values),limit);
        }

        /**
     * Find records that have <code>TO_GROUP IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToGroup(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TO_GROUP.in(values));
        }

        /**
     * Find records that have <code>TO_GROUP IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToGroup(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TO_GROUP.in(values),limit);
        }

        /**
     * Find records that have <code>TO_USER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToUser(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TO_USER.in(values));
        }

        /**
     * Find records that have <code>TO_USER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToUser(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TO_USER.in(values),limit);
        }

        /**
     * Find records that have <code>TO_ROLE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToRole(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TO_ROLE.in(values));
        }

        /**
     * Find records that have <code>TO_ROLE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByToRole(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TO_ROLE.in(values),limit);
        }

        /**
     * Find records that have <code>TRACE_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByTraceId(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.TRACE_ID.in(values));
        }

        /**
     * Find records that have <code>TRACE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByTraceId(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.TRACE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByParentId(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.PARENT_ID.in(values));
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByParentId(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.PARENT_ID.in(values),limit);
        }

        /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByDescription(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.DESCRIPTION.in(values));
        }

        /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByDescription(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.DESCRIPTION.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(XTodo.X_TODO.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByOwner(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.OWNER.in(values));
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByOwner(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.OWNER.in(values),limit);
        }

        /**
     * Find records that have <code>SUPERVISOR IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyBySupervisor(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.SUPERVISOR.in(values));
        }

        /**
     * Find records that have <code>SUPERVISOR IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyBySupervisor(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.SUPERVISOR.in(values),limit);
        }

        /**
     * Find records that have <code>ASSIGNED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAssignedBy(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.ASSIGNED_BY.in(values));
        }

        /**
     * Find records that have <code>ASSIGNED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAssignedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.ASSIGNED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>ASSIGNED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAssignedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTodo.X_TODO.ASSIGNED_AT.in(values));
        }

        /**
     * Find records that have <code>ASSIGNED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAssignedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.ASSIGNED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>ACCEPTED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAcceptedBy(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.ACCEPTED_BY.in(values));
        }

        /**
     * Find records that have <code>ACCEPTED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAcceptedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.ACCEPTED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>ACCEPTED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAcceptedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTodo.X_TODO.ACCEPTED_AT.in(values));
        }

        /**
     * Find records that have <code>ACCEPTED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByAcceptedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.ACCEPTED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>FINISHED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByFinishedBy(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.FINISHED_BY.in(values));
        }

        /**
     * Find records that have <code>FINISHED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByFinishedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.FINISHED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByFinishedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTodo.X_TODO.FINISHED_AT.in(values));
        }

        /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByFinishedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.FINISHED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByExpiredAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTodo.X_TODO.EXPIRED_AT.in(values));
        }

        /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByExpiredAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.EXPIRED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTodo.X_TODO.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTodo.X_TODO.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(XTodo.X_TODO.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTodo>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTodo.X_TODO.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<XTodoRecord,cn.vertxup.ambient.domain.tables.pojos.XTodo,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<XTodoRecord,cn.vertxup.ambient.domain.tables.pojos.XTodo,String>) super.queryExecutor();
        }
}
