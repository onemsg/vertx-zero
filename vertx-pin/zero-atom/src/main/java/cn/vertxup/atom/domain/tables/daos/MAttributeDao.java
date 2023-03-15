/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MAttribute;
import cn.vertxup.atom.domain.tables.records.MAttributeRecord;

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
public class MAttributeDao extends AbstractVertxDAO<MAttributeRecord, cn.vertxup.atom.domain.tables.pojos.MAttribute, String, Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>>, Future<cn.vertxup.atom.domain.tables.pojos.MAttribute>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MAttributeRecord,cn.vertxup.atom.domain.tables.pojos.MAttribute,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public MAttributeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(MAttribute.M_ATTRIBUTE, cn.vertxup.atom.domain.tables.pojos.MAttribute.class, new JDBCClassicQueryExecutor<MAttributeRecord,cn.vertxup.atom.domain.tables.pojos.MAttribute,String>(configuration,cn.vertxup.atom.domain.tables.pojos.MAttribute.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.atom.domain.tables.pojos.MAttribute object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByName(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByAlias(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.ALIAS.in(values));
        }

        /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByAlias(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.ALIAS.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByType(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>EXPRESSION IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByExpression(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.EXPRESSION.in(values));
        }

        /**
     * Find records that have <code>EXPRESSION IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByExpression(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.EXPRESSION.in(values),limit);
        }

        /**
     * Find records that have <code>NORMALIZE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByNormalize(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.NORMALIZE.in(values));
        }

        /**
     * Find records that have <code>NORMALIZE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByNormalize(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.NORMALIZE.in(values),limit);
        }

        /**
     * Find records that have <code>IN_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByInComponent(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IN_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>IN_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByInComponent(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IN_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>OUT_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByOutComponent(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.OUT_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>OUT_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByOutComponent(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.OUT_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByModelId(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.MODEL_ID.in(values));
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByModelId(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.MODEL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByComments(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.COMMENTS.in(values));
        }

        /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByComments(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.COMMENTS.in(values),limit);
        }

        /**
     * Find records that have <code>SOURCE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySource(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE.in(values));
        }

        /**
     * Find records that have <code>SOURCE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySource(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE.in(values),limit);
        }

        /**
     * Find records that have <code>SOURCE_FIELD IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceField(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_FIELD.in(values));
        }

        /**
     * Find records that have <code>SOURCE_FIELD IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceField(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_FIELD.in(values),limit);
        }

        /**
     * Find records that have <code>SOURCE_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceConfig(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_CONFIG.in(values));
        }

        /**
     * Find records that have <code>SOURCE_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceConfig(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>SOURCE_REFERENCE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceReference(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_REFERENCE.in(values));
        }

        /**
     * Find records that have <code>SOURCE_REFERENCE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceReference(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_REFERENCE.in(values),limit);
        }

        /**
     * Find records that have <code>SOURCE_EXTERNAL IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceExternal(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_EXTERNAL.in(values));
        }

        /**
     * Find records that have <code>SOURCE_EXTERNAL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySourceExternal(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SOURCE_EXTERNAL.in(values),limit);
        }

        /**
     * Find records that have <code>IS_ARRAY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsArray(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_ARRAY.in(values));
        }

        /**
     * Find records that have <code>IS_ARRAY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsArray(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_ARRAY.in(values),limit);
        }

        /**
     * Find records that have <code>IS_REFER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsRefer(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_REFER.in(values));
        }

        /**
     * Find records that have <code>IS_REFER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsRefer(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_REFER.in(values),limit);
        }

        /**
     * Find records that have <code>IS_SYNC_IN IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsSyncIn(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_SYNC_IN.in(values));
        }

        /**
     * Find records that have <code>IS_SYNC_IN IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsSyncIn(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_SYNC_IN.in(values),limit);
        }

        /**
     * Find records that have <code>IS_SYNC_OUT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsSyncOut(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_SYNC_OUT.in(values));
        }

        /**
     * Find records that have <code>IS_SYNC_OUT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsSyncOut(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_SYNC_OUT.in(values),limit);
        }

        /**
     * Find records that have <code>IS_LOCK IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsLock(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_LOCK.in(values));
        }

        /**
     * Find records that have <code>IS_LOCK IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsLock(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_LOCK.in(values),limit);
        }

        /**
     * Find records that have <code>IS_TRACK IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsTrack(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_TRACK.in(values));
        }

        /**
     * Find records that have <code>IS_TRACK IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsTrack(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_TRACK.in(values),limit);
        }

        /**
     * Find records that have <code>IS_CONFIRM IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsConfirm(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_CONFIRM.in(values));
        }

        /**
     * Find records that have <code>IS_CONFIRM IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByIsConfirm(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.IS_CONFIRM.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(MAttribute.M_ATTRIBUTE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<MAttributeRecord,cn.vertxup.atom.domain.tables.pojos.MAttribute,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<MAttributeRecord,cn.vertxup.atom.domain.tables.pojos.MAttribute,String>) super.queryExecutor();
        }
}
