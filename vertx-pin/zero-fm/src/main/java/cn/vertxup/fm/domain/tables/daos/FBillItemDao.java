/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.daos;


import cn.vertxup.fm.domain.tables.FBillItem;
import cn.vertxup.fm.domain.tables.records.FBillItemRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FBillItemDao extends AbstractVertxDAO<FBillItemRecord, cn.vertxup.fm.domain.tables.pojos.FBillItem, String, Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>>, Future<cn.vertxup.fm.domain.tables.pojos.FBillItem>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FBillItemRecord, cn.vertxup.fm.domain.tables.pojos.FBillItem, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public FBillItemDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(FBillItem.F_BILL_ITEM, cn.vertxup.fm.domain.tables.pojos.FBillItem.class, new JDBCClassicQueryExecutor<FBillItemRecord, cn.vertxup.fm.domain.tables.pojos.FBillItem, String>(configuration, cn.vertxup.fm.domain.tables.pojos.FBillItem.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.fm.domain.tables.pojos.FBillItem object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByName(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByCode(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySerial(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SERIAL.in(values));
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySerial(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SERIAL.in(values), limit);
    }

    /**
     * Find records that have <code>INCOME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByIncome(Collection<Boolean> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.INCOME.in(values));
    }

    /**
     * Find records that have <code>INCOME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByIncome(Collection<Boolean> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.INCOME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByType(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByComment(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>MANUAL_NO IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByManualNo(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.MANUAL_NO.in(values));
    }

    /**
     * Find records that have <code>MANUAL_NO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByManualNo(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.MANUAL_NO.in(values), limit);
    }

    /**
     * Find records that have <code>UNIT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByUnit(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.UNIT.in(values));
    }

    /**
     * Find records that have <code>UNIT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByUnit(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.UNIT.in(values), limit);
    }

    /**
     * Find records that have <code>PRICE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByPrice(Collection<BigDecimal> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.PRICE.in(values));
    }

    /**
     * Find records that have <code>PRICE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByPrice(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.PRICE.in(values), limit);
    }

    /**
     * Find records that have <code>QUANTITY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByQuantity(Collection<Integer> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.QUANTITY.in(values));
    }

    /**
     * Find records that have <code>QUANTITY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByQuantity(Collection<Integer> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.QUANTITY.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT_TOTAL IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByAmountTotal(Collection<BigDecimal> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.AMOUNT_TOTAL.in(values));
    }

    /**
     * Find records that have <code>AMOUNT_TOTAL IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByAmountTotal(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.AMOUNT_TOTAL.in(values), limit);
    }

    /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpBy(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_BY.in(values));
    }

    /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpBy(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_BY.in(values), limit);
    }

    /**
     * Find records that have <code>OP_NUMBER IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpNumber(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_NUMBER.in(values));
    }

    /**
     * Find records that have <code>OP_NUMBER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpNumber(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_NUMBER.in(values), limit);
    }

    /**
     * Find records that have <code>OP_SHIFT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpShift(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_SHIFT.in(values));
    }

    /**
     * Find records that have <code>OP_SHIFT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpShift(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_SHIFT.in(values), limit);
    }

    /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_AT.in(values));
    }

    /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByOpAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.OP_AT.in(values), limit);
    }

    /**
     * Find records that have <code>RELATED_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByRelatedId(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.RELATED_ID.in(values));
    }

    /**
     * Find records that have <code>RELATED_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByRelatedId(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.RELATED_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SETTLEMENT_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySettlementId(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SETTLEMENT_ID.in(values));
    }

    /**
     * Find records that have <code>SETTLEMENT_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySettlementId(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SETTLEMENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>BILL_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByBillId(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.BILL_ID.in(values));
    }

    /**
     * Find records that have <code>BILL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByBillId(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.BILL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SUBJECT_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySubjectId(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SUBJECT_ID.in(values));
    }

    /**
     * Find records that have <code>SUBJECT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySubjectId(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SUBJECT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>PAY_TERM_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByPayTermId(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.PAY_TERM_ID.in(values));
    }

    /**
     * Find records that have <code>PAY_TERM_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByPayTermId(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.PAY_TERM_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FBillItem>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FBillItem.F_BILL_ITEM.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<FBillItemRecord, cn.vertxup.fm.domain.tables.pojos.FBillItem, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<FBillItemRecord, cn.vertxup.fm.domain.tables.pojos.FBillItem, String>) super.queryExecutor();
    }
}
