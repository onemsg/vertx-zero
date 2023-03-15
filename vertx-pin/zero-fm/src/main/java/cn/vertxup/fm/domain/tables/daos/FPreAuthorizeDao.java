/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.daos;


import cn.vertxup.fm.domain.tables.FPreAuthorize;
import cn.vertxup.fm.domain.tables.records.FPreAuthorizeRecord;

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
public class FPreAuthorizeDao extends AbstractVertxDAO<FPreAuthorizeRecord, cn.vertxup.fm.domain.tables.pojos.FPreAuthorize, String, Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>>, Future<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FPreAuthorizeRecord,cn.vertxup.fm.domain.tables.pojos.FPreAuthorize,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public FPreAuthorizeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(FPreAuthorize.F_PRE_AUTHORIZE, cn.vertxup.fm.domain.tables.pojos.FPreAuthorize.class, new JDBCClassicQueryExecutor<FPreAuthorizeRecord,cn.vertxup.fm.domain.tables.pojos.FPreAuthorize,String>(configuration,cn.vertxup.fm.domain.tables.pojos.FPreAuthorize.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.fm.domain.tables.pojos.FPreAuthorize object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByCode(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByComment(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByExpiredAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.EXPIRED_AT.in(values));
        }

        /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByExpiredAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.EXPIRED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>BANK_NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBankName(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BANK_NAME.in(values));
        }

        /**
     * Find records that have <code>BANK_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBankName(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BANK_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>BANK_CARD IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBankCard(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BANK_CARD.in(values));
        }

        /**
     * Find records that have <code>BANK_CARD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBankCard(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BANK_CARD.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByOrderId(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.ORDER_ID.in(values));
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByOrderId(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.ORDER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>BILL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBillId(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BILL_ID.in(values));
        }

        /**
     * Find records that have <code>BILL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBillId(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BILL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>BOOK_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBookId(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BOOK_ID.in(values));
        }

        /**
     * Find records that have <code>BOOK_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByBookId(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.BOOK_ID.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FPreAuthorize>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FPreAuthorize.F_PRE_AUTHORIZE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<FPreAuthorizeRecord,cn.vertxup.fm.domain.tables.pojos.FPreAuthorize,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<FPreAuthorizeRecord,cn.vertxup.fm.domain.tables.pojos.FPreAuthorize,String>) super.queryExecutor();
        }
}
