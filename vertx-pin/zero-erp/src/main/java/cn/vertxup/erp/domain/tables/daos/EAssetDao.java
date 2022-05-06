/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.EAsset;
import cn.vertxup.erp.domain.tables.records.EAssetRecord;
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
public class EAssetDao extends AbstractVertxDAO<EAssetRecord, cn.vertxup.erp.domain.tables.pojos.EAsset, String, Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>>, Future<cn.vertxup.erp.domain.tables.pojos.EAsset>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EAssetRecord, cn.vertxup.erp.domain.tables.pojos.EAsset, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public EAssetDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(EAsset.E_ASSET, cn.vertxup.erp.domain.tables.pojos.EAsset.class, new JDBCClassicQueryExecutor<EAssetRecord, cn.vertxup.erp.domain.tables.pojos.EAsset, String>(configuration, cn.vertxup.erp.domain.tables.pojos.EAsset.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.erp.domain.tables.pojos.EAsset object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByName(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCode(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByType(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_NUMBER IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByModelNumber(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.MODEL_NUMBER.in(values));
    }

    /**
     * Find records that have <code>MODEL_NUMBER IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByModelNumber(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.MODEL_NUMBER.in(values), limit);
    }

    /**
     * Find records that have <code>UNIT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUnit(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.UNIT.in(values));
    }

    /**
     * Find records that have <code>UNIT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUnit(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.UNIT.in(values), limit);
    }

    /**
     * Find records that have <code>NUM IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNum(Collection<Long> values) {
        return findManyByCondition(EAsset.E_ASSET.NUM.in(values));
    }

    /**
     * Find records that have <code>NUM IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNum(Collection<Long> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.NUM.in(values), limit);
    }

    /**
     * Find records that have <code>NUM_DEPRECATING IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumDeprecating(Collection<Long> values) {
        return findManyByCondition(EAsset.E_ASSET.NUM_DEPRECATING.in(values));
    }

    /**
     * Find records that have <code>NUM_DEPRECATING IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumDeprecating(Collection<Long> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.NUM_DEPRECATING.in(values), limit);
    }

    /**
     * Find records that have <code>NUM_DEPRECATED IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumDeprecated(Collection<Long> values) {
        return findManyByCondition(EAsset.E_ASSET.NUM_DEPRECATED.in(values));
    }

    /**
     * Find records that have <code>NUM_DEPRECATED IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumDeprecated(Collection<Long> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.NUM_DEPRECATED.in(values), limit);
    }

    /**
     * Find records that have <code>NUM_USING IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumUsing(Collection<Long> values) {
        return findManyByCondition(EAsset.E_ASSET.NUM_USING.in(values));
    }

    /**
     * Find records that have <code>NUM_USING IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumUsing(Collection<Long> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.NUM_USING.in(values), limit);
    }

    /**
     * Find records that have <code>NUM_USED IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumUsed(Collection<Long> values) {
        return findManyByCondition(EAsset.E_ASSET.NUM_USED.in(values));
    }

    /**
     * Find records that have <code>NUM_USED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByNumUsed(Collection<Long> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.NUM_USED.in(values), limit);
    }

    /**
     * Find records that have <code>WAY_CHANGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByWayChange(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.WAY_CHANGE.in(values));
    }

    /**
     * Find records that have <code>WAY_CHANGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByWayChange(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.WAY_CHANGE.in(values), limit);
    }

    /**
     * Find records that have <code>WAY_DEPRECATE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByWayDeprecate(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.WAY_DEPRECATE.in(values));
    }

    /**
     * Find records that have <code>WAY_DEPRECATE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByWayDeprecate(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.WAY_DEPRECATE.in(values), limit);
    }

    /**
     * Find records that have <code>WAY_ACCORDING IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByWayAccording(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.WAY_ACCORDING.in(values));
    }

    /**
     * Find records that have <code>WAY_ACCORDING IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByWayAccording(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.WAY_ACCORDING.in(values), limit);
    }

    /**
     * Find records that have <code>USED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUsedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.USED_AT.in(values));
    }

    /**
     * Find records that have <code>USED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUsedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.USED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>USED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUsedBy(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.USED_BY.in(values));
    }

    /**
     * Find records that have <code>USED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUsedBy(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.USED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>USED_STATUS IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUsedStatus(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.USED_STATUS.in(values));
    }

    /**
     * Find records that have <code>USED_STATUS IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUsedStatus(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.USED_STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>V_ORIGINAL IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVOriginal(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_ORIGINAL.in(values));
    }

    /**
     * Find records that have <code>V_ORIGINAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVOriginal(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_ORIGINAL.in(values), limit);
    }

    /**
     * Find records that have <code>V_TAX IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVTax(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_TAX.in(values));
    }

    /**
     * Find records that have <code>V_TAX IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVTax(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_TAX.in(values), limit);
    }

    /**
     * Find records that have <code>V_DE_READY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVDeReady(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_DE_READY.in(values));
    }

    /**
     * Find records that have <code>V_DE_READY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVDeReady(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_DE_READY.in(values), limit);
    }

    /**
     * Find records that have <code>V_NET_JUNK IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVNetJunk(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_NET_JUNK.in(values));
    }

    /**
     * Find records that have <code>V_NET_JUNK IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVNetJunk(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_NET_JUNK.in(values), limit);
    }

    /**
     * Find records that have <code>V_NET IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVNet(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_NET.in(values));
    }

    /**
     * Find records that have <code>V_NET IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVNet(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_NET.in(values), limit);
    }

    /**
     * Find records that have <code>V_NET_AMOUNT IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVNetAmount(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_NET_AMOUNT.in(values));
    }

    /**
     * Find records that have <code>V_NET_AMOUNT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVNetAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_NET_AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>V_DEPRECATED_M IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVDeprecatedM(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_DEPRECATED_M.in(values));
    }

    /**
     * Find records that have <code>V_DEPRECATED_M IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVDeprecatedM(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_DEPRECATED_M.in(values), limit);
    }

    /**
     * Find records that have <code>V_DEPRECATED_A IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVDeprecatedA(Collection<BigDecimal> values) {
        return findManyByCondition(EAsset.E_ASSET.V_DEPRECATED_A.in(values));
    }

    /**
     * Find records that have <code>V_DEPRECATED_A IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByVDeprecatedA(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.V_DEPRECATED_A.in(values), limit);
    }

    /**
     * Find records that have <code>K_FIXED IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKFixed(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.K_FIXED.in(values));
    }

    /**
     * Find records that have <code>K_FIXED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKFixed(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.K_FIXED.in(values), limit);
    }

    /**
     * Find records that have <code>K_DEPRECATED IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKDeprecated(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.K_DEPRECATED.in(values));
    }

    /**
     * Find records that have <code>K_DEPRECATED IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKDeprecated(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.K_DEPRECATED.in(values), limit);
    }

    /**
     * Find records that have <code>K_ASSIGNMENT IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKAssignment(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.K_ASSIGNMENT.in(values));
    }

    /**
     * Find records that have <code>K_ASSIGNMENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKAssignment(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.K_ASSIGNMENT.in(values), limit);
    }

    /**
     * Find records that have <code>K_TAX IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKTax(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.K_TAX.in(values));
    }

    /**
     * Find records that have <code>K_TAX IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKTax(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.K_TAX.in(values), limit);
    }

    /**
     * Find records that have <code>K_DEVALUE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKDevalue(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.K_DEVALUE.in(values));
    }

    /**
     * Find records that have <code>K_DEVALUE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKDevalue(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.K_DEVALUE.in(values), limit);
    }

    /**
     * Find records that have <code>K_CHANGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKChange(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.K_CHANGE.in(values));
    }

    /**
     * Find records that have <code>K_CHANGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByKChange(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.K_CHANGE.in(values), limit);
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCustomerId(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.CUSTOMER_ID.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCustomerId(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.CUSTOMER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByExpiredAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.EXPIRED_AT.in(values));
    }

    /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByExpiredAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.EXPIRED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>EXPIRED_COMMENT IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByExpiredComment(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.EXPIRED_COMMENT.in(values));
    }

    /**
     * Find records that have <code>EXPIRED_COMMENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByExpiredComment(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.EXPIRED_COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.USER_ID.in(values));
    }

    /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.USER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>STORE_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByStoreId(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.STORE_ID.in(values));
    }

    /**
     * Find records that have <code>STORE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByStoreId(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.STORE_ID.in(values), limit);
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByDeptId(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.DEPT_ID.in(values));
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByDeptId(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.DEPT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCompanyId(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.COMPANY_ID.in(values));
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCompanyId(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.COMPANY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByParentId(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.PARENT_ID.in(values));
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByParentId(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.PARENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByComment(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(EAsset.E_ASSET.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ENTER_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByEnterAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.ENTER_AT.in(values));
    }

    /**
     * Find records that have <code>ENTER_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByEnterAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.ENTER_AT.in(values), limit);
    }

    /**
     * Find records that have <code>ENTER_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByEnterBy(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.ENTER_BY.in(values));
    }

    /**
     * Find records that have <code>ENTER_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByEnterBy(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.ENTER_BY.in(values), limit);
    }

    /**
     * Find records that have <code>ACCOUNT_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByAccountAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.ACCOUNT_AT.in(values));
    }

    /**
     * Find records that have <code>ACCOUNT_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByAccountAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.ACCOUNT_AT.in(values), limit);
    }

    /**
     * Find records that have <code>ACCOUNT_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByAccountBy(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.ACCOUNT_BY.in(values));
    }

    /**
     * Find records that have <code>ACCOUNT_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByAccountBy(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.ACCOUNT_BY.in(values), limit);
    }

    /**
     * Find records that have <code>SCRAP_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByScrapAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.SCRAP_AT.in(values));
    }

    /**
     * Find records that have <code>SCRAP_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByScrapAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.SCRAP_AT.in(values), limit);
    }

    /**
     * Find records that have <code>SCRAP_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByScrapBy(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.SCRAP_BY.in(values));
    }

    /**
     * Find records that have <code>SCRAP_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByScrapBy(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.SCRAP_BY.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EAsset.E_ASSET.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(EAsset.E_ASSET.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EAsset>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EAsset.E_ASSET.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<EAssetRecord, cn.vertxup.erp.domain.tables.pojos.EAsset, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<EAssetRecord, cn.vertxup.erp.domain.tables.pojos.EAsset, String>) super.queryExecutor();
    }
}
