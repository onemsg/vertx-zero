/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.ECompany;
import cn.vertxup.erp.domain.tables.records.ECompanyRecord;
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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ECompanyDao extends AbstractVertxDAO<ECompanyRecord, cn.vertxup.erp.domain.tables.pojos.ECompany, String, Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>>, Future<cn.vertxup.erp.domain.tables.pojos.ECompany>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ECompanyRecord, cn.vertxup.erp.domain.tables.pojos.ECompany, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public ECompanyDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(ECompany.E_COMPANY, cn.vertxup.erp.domain.tables.pojos.ECompany.class, new JDBCClassicQueryExecutor<ECompanyRecord, cn.vertxup.erp.domain.tables.pojos.ECompany, String>(configuration, cn.vertxup.erp.domain.tables.pojos.ECompany.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.erp.domain.tables.pojos.ECompany object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByName(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByAlias(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.ALIAS.in(values));
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByAlias(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.ALIAS.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCode(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByComment(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>TAX_CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByTaxCode(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.TAX_CODE.in(values));
    }

    /**
     * Find records that have <code>TAX_CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByTaxCode(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.TAX_CODE.in(values), limit);
    }

    /**
     * Find records that have <code>TAX_TITLE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByTaxTitle(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.TAX_TITLE.in(values));
    }

    /**
     * Find records that have <code>TAX_TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByTaxTitle(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.TAX_TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>EMAIL IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByEmail(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.EMAIL.in(values));
    }

    /**
     * Find records that have <code>EMAIL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByEmail(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.EMAIL.in(values), limit);
    }

    /**
     * Find records that have <code>FAX IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByFax(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.FAX.in(values));
    }

    /**
     * Find records that have <code>FAX IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByFax(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.FAX.in(values), limit);
    }

    /**
     * Find records that have <code>HOMEPAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByHomepage(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.HOMEPAGE.in(values));
    }

    /**
     * Find records that have <code>HOMEPAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByHomepage(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.HOMEPAGE.in(values), limit);
    }

    /**
     * Find records that have <code>LOGO IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByLogo(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.LOGO.in(values));
    }

    /**
     * Find records that have <code>LOGO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByLogo(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.LOGO.in(values), limit);
    }

    /**
     * Find records that have <code>PHONE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByPhone(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.PHONE.in(values));
    }

    /**
     * Find records that have <code>PHONE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByPhone(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>ADDRESS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByAddress(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.ADDRESS.in(values));
    }

    /**
     * Find records that have <code>ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByAddress(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>LOCATION_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByLocationId(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.LOCATION_ID.in(values));
    }

    /**
     * Find records that have <code>LOCATION_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByLocationId(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.LOCATION_ID.in(values), limit);
    }

    /**
     * Find records that have <code>CORPORATION_NAME IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCorporationName(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CORPORATION_NAME.in(values));
    }

    /**
     * Find records that have <code>CORPORATION_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCorporationName(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CORPORATION_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CORPORATION_PHONE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCorporationPhone(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CORPORATION_PHONE.in(values));
    }

    /**
     * Find records that have <code>CORPORATION_PHONE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCorporationPhone(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CORPORATION_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>CONTACT_NAME IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByContactName(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CONTACT_NAME.in(values));
    }

    /**
     * Find records that have <code>CONTACT_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByContactName(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CONTACT_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CONTACT_PHONE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByContactPhone(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CONTACT_PHONE.in(values));
    }

    /**
     * Find records that have <code>CONTACT_PHONE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByContactPhone(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CONTACT_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>CONTACT_ONLINE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByContactOnline(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CONTACT_ONLINE.in(values));
    }

    /**
     * Find records that have <code>CONTACT_ONLINE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByContactOnline(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CONTACT_ONLINE.in(values), limit);
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCompanyId(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.COMPANY_ID.in(values));
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCompanyId(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.COMPANY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCustomerId(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CUSTOMER_ID.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCustomerId(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CUSTOMER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByType(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(ECompany.E_COMPANY.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(ECompany.E_COMPANY.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(ECompany.E_COMPANY.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(ECompany.E_COMPANY.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.ECompany>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(ECompany.E_COMPANY.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<ECompanyRecord, cn.vertxup.erp.domain.tables.pojos.ECompany, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<ECompanyRecord, cn.vertxup.erp.domain.tables.pojos.ECompany, String>) super.queryExecutor();
    }
}
