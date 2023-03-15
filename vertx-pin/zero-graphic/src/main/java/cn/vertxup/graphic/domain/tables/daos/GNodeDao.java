/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.daos;


import cn.vertxup.graphic.domain.tables.GNode;
import cn.vertxup.graphic.domain.tables.records.GNodeRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.math.BigDecimal;
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
public class GNodeDao extends AbstractVertxDAO<GNodeRecord, cn.vertxup.graphic.domain.tables.pojos.GNode, String, Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>>, Future<cn.vertxup.graphic.domain.tables.pojos.GNode>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<GNodeRecord,cn.vertxup.graphic.domain.tables.pojos.GNode,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public GNodeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(GNode.G_NODE, cn.vertxup.graphic.domain.tables.pojos.GNode.class, new JDBCClassicQueryExecutor<GNodeRecord,cn.vertxup.graphic.domain.tables.pojos.GNode,String>(configuration,cn.vertxup.graphic.domain.tables.pojos.GNode.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.graphic.domain.tables.pojos.GNode object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByName(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>X IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByX(Collection<BigDecimal> values) {
                return findManyByCondition(GNode.G_NODE.X.in(values));
        }

        /**
     * Find records that have <code>X IN (values)</code> asynchronously limited
     * by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByX(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(GNode.G_NODE.X.in(values),limit);
        }

        /**
     * Find records that have <code>Y IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByY(Collection<BigDecimal> values) {
                return findManyByCondition(GNode.G_NODE.Y.in(values));
        }

        /**
     * Find records that have <code>Y IN (values)</code> asynchronously limited
     * by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByY(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(GNode.G_NODE.Y.in(values),limit);
        }

        /**
     * Find records that have <code>UI IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByUi(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.UI.in(values));
        }

        /**
     * Find records that have <code>UI IN (values)</code> asynchronously limited
     * by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByUi(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.UI.in(values),limit);
        }

        /**
     * Find records that have <code>GRAPHIC_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByGraphicId(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.GRAPHIC_ID.in(values));
        }

        /**
     * Find records that have <code>GRAPHIC_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByGraphicId(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.GRAPHIC_ID.in(values),limit);
        }

        /**
     * Find records that have <code>RECORD_DATA IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordData(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.RECORD_DATA.in(values));
        }

        /**
     * Find records that have <code>RECORD_DATA IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordData(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.RECORD_DATA.in(values),limit);
        }

        /**
     * Find records that have <code>RECORD_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordKey(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.RECORD_KEY.in(values));
        }

        /**
     * Find records that have <code>RECORD_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordKey(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.RECORD_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>RECORD_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordComponent(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.RECORD_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>RECORD_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordComponent(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.RECORD_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>RECORD_CLASS IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordClass(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.RECORD_CLASS.in(values));
        }

        /**
     * Find records that have <code>RECORD_CLASS IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByRecordClass(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.RECORD_CLASS.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(GNode.G_NODE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(GNode.G_NODE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(GNode.G_NODE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(GNode.G_NODE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(GNode.G_NODE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(GNode.G_NODE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(GNode.G_NODE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(GNode.G_NODE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<GNodeRecord,cn.vertxup.graphic.domain.tables.pojos.GNode,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<GNodeRecord,cn.vertxup.graphic.domain.tables.pojos.GNode,String>) super.queryExecutor();
        }
}
