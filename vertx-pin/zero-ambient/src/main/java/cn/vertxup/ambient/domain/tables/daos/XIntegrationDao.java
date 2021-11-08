/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XIntegration;
import cn.vertxup.ambient.domain.tables.records.XIntegrationRecord;

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
public class XIntegrationDao extends AbstractVertxDAO<XIntegrationRecord, cn.vertxup.ambient.domain.tables.pojos.XIntegration, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>>, Future<cn.vertxup.ambient.domain.tables.pojos.XIntegration>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XIntegrationRecord,cn.vertxup.ambient.domain.tables.pojos.XIntegration,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public XIntegrationDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(XIntegration.X_INTEGRATION, cn.vertxup.ambient.domain.tables.pojos.XIntegration.class, new JDBCClassicQueryExecutor<XIntegrationRecord,cn.vertxup.ambient.domain.tables.pojos.XIntegration,String>(configuration,cn.vertxup.ambient.domain.tables.pojos.XIntegration.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.ambient.domain.tables.pojos.XIntegration object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByName(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByType(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>IP_V4 IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByIpV4(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.IP_V4.in(values));
        }

        /**
     * Find records that have <code>IP_V4 IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByIpV4(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.IP_V4.in(values),limit);
        }

        /**
     * Find records that have <code>IP_V6 IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByIpV6(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.IP_V6.in(values));
        }

        /**
     * Find records that have <code>IP_V6 IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByIpV6(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.IP_V6.in(values),limit);
        }

        /**
     * Find records that have <code>HOSTNAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByHostname(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.HOSTNAME.in(values));
        }

        /**
     * Find records that have <code>HOSTNAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByHostname(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.HOSTNAME.in(values),limit);
        }

        /**
     * Find records that have <code>PORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPort(Collection<Integer> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PORT.in(values));
        }

        /**
     * Find records that have <code>PORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPort(Collection<Integer> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PORT.in(values),limit);
        }

        /**
     * Find records that have <code>PROTOCOL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByProtocol(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PROTOCOL.in(values));
        }

        /**
     * Find records that have <code>PROTOCOL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByProtocol(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PROTOCOL.in(values),limit);
        }

        /**
     * Find records that have <code>ENDPOINT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByEndpoint(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.ENDPOINT.in(values));
        }

        /**
     * Find records that have <code>ENDPOINT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByEndpoint(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.ENDPOINT.in(values),limit);
        }

        /**
     * Find records that have <code>PATH IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPath(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PATH.in(values));
        }

        /**
     * Find records that have <code>PATH IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPath(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PATH.in(values),limit);
        }

        /**
     * Find records that have <code>OS_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsKey(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_KEY.in(values));
        }

        /**
     * Find records that have <code>OS_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsKey(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>OS_SECRET IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsSecret(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_SECRET.in(values));
        }

        /**
     * Find records that have <code>OS_SECRET IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsSecret(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_SECRET.in(values),limit);
        }

        /**
     * Find records that have <code>OS_AUTHORIZE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsAuthorize(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_AUTHORIZE.in(values));
        }

        /**
     * Find records that have <code>OS_AUTHORIZE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsAuthorize(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_AUTHORIZE.in(values),limit);
        }

        /**
     * Find records that have <code>OS_TOKEN IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsToken(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_TOKEN.in(values));
        }

        /**
     * Find records that have <code>OS_TOKEN IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOsToken(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OS_TOKEN.in(values),limit);
        }

        /**
     * Find records that have <code>USERNAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByUsername(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.USERNAME.in(values));
        }

        /**
     * Find records that have <code>USERNAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByUsername(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.USERNAME.in(values),limit);
        }

        /**
     * Find records that have <code>PASSWORD IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPassword(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PASSWORD.in(values));
        }

        /**
     * Find records that have <code>PASSWORD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPassword(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PASSWORD.in(values),limit);
        }

        /**
     * Find records that have <code>PUBLIC_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPublicKey(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PUBLIC_KEY.in(values));
        }

        /**
     * Find records that have <code>PUBLIC_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByPublicKey(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.PUBLIC_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>OPTIONS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOptions(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OPTIONS.in(values));
        }

        /**
     * Find records that have <code>OPTIONS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByOptions(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.OPTIONS.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(XIntegration.X_INTEGRATION.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XIntegration>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XIntegration.X_INTEGRATION.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<XIntegrationRecord,cn.vertxup.ambient.domain.tables.pojos.XIntegration,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<XIntegrationRecord,cn.vertxup.ambient.domain.tables.pojos.XIntegration,String>) super.queryExecutor();
        }
}
