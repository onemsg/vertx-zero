/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.TVendorAssessment;
import cn.vertxup.erp.domain.tables.records.TVendorAssessmentRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVendorAssessmentDao extends AbstractVertxDAO<TVendorAssessmentRecord, cn.vertxup.erp.domain.tables.pojos.TVendorAssessment, String, Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>>, Future<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TVendorAssessmentRecord,cn.vertxup.erp.domain.tables.pojos.TVendorAssessment,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public TVendorAssessmentDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(TVendorAssessment.T_VENDOR_ASSESSMENT, cn.vertxup.erp.domain.tables.pojos.TVendorAssessment.class, new JDBCClassicQueryExecutor<TVendorAssessmentRecord,cn.vertxup.erp.domain.tables.pojos.TVendorAssessment,String>(configuration,cn.vertxup.erp.domain.tables.pojos.TVendorAssessment.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.erp.domain.tables.pojos.TVendorAssessment object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentExtension(Collection<String> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_EXTENSION.in(values));
        }

        /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentExtension(Collection<String> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_EXTENSION.in(values),limit);
        }

        /**
     * Find records that have <code>CLASSIFICATION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByClassification(Collection<String> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.CLASSIFICATION.in(values));
        }

        /**
     * Find records that have <code>CLASSIFICATION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByClassification(Collection<String> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.CLASSIFICATION.in(values),limit);
        }

        /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByStartAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.START_AT.in(values));
        }

        /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.START_AT.in(values),limit);
        }

        /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByEndAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.END_AT.in(values));
        }

        /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.END_AT.in(values),limit);
        }

        /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByDays(Collection<Integer> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.DAYS.in(values));
        }

        /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByDays(Collection<Integer> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.DAYS.in(values),limit);
        }

        /**
     * Find records that have <code>ASSESS_ON IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByAssessOn(Collection<String> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.ASSESS_ON.in(values));
        }

        /**
     * Find records that have <code>ASSESS_ON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByAssessOn(Collection<String> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.ASSESS_ON.in(values),limit);
        }

        /**
     * Find records that have <code>ASSESS_SCORE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByAssessScore(Collection<Integer> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.ASSESS_SCORE.in(values));
        }

        /**
     * Find records that have <code>ASSESS_SCORE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByAssessScore(Collection<Integer> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.ASSESS_SCORE.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT_DEPT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentDept(Collection<String> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_DEPT.in(values));
        }

        /**
     * Find records that have <code>COMMENT_DEPT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentDept(Collection<String> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_DEPT.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT_ASSESS IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentAssess(Collection<String> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_ASSESS.in(values));
        }

        /**
     * Find records that have <code>COMMENT_ASSESS IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentAssess(Collection<String> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_ASSESS.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT_LEADER IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentLeader(Collection<String> values) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_LEADER.in(values));
        }

        /**
     * Find records that have <code>COMMENT_LEADER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorAssessment>> findManyByCommentLeader(Collection<String> values, int limit) {
                return findManyByCondition(TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_LEADER.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<TVendorAssessmentRecord,cn.vertxup.erp.domain.tables.pojos.TVendorAssessment,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<TVendorAssessmentRecord,cn.vertxup.erp.domain.tables.pojos.TVendorAssessment,String>) super.queryExecutor();
        }
}
