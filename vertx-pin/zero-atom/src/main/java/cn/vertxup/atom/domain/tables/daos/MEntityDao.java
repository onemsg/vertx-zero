/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MEntity;
import cn.vertxup.atom.domain.tables.records.MEntityRecord;
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
public class MEntityDao extends AbstractVertxDAO<MEntityRecord, cn.vertxup.atom.domain.tables.pojos.MEntity, String, Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>>, Future<cn.vertxup.atom.domain.tables.pojos.MEntity>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MEntityRecord, cn.vertxup.atom.domain.tables.pojos.MEntity, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public MEntityDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(MEntity.M_ENTITY, cn.vertxup.atom.domain.tables.pojos.MEntity.class, new JDBCClassicQueryExecutor<MEntityRecord, cn.vertxup.atom.domain.tables.pojos.MEntity, String>(configuration, cn.vertxup.atom.domain.tables.pojos.MEntity.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.atom.domain.tables.pojos.MEntity object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByIdentifier(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.IDENTIFIER.in(values));
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByIdentifier(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.IDENTIFIER.in(values), limit);
    }

    /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByNamespace(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.NAMESPACE.in(values));
    }

    /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByNamespace(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.NAMESPACE.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByName(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByType(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>TABLE_NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByTableName(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.TABLE_NAME.in(values));
    }

    /**
     * Find records that have <code>TABLE_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByTableName(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.TABLE_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByComments(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.COMMENTS.in(values));
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByComments(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.COMMENTS.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(MEntity.M_ENTITY.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MEntity.M_ENTITY.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MEntity.M_ENTITY.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(MEntity.M_ENTITY.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MEntity>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MEntity.M_ENTITY.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<MEntityRecord, cn.vertxup.atom.domain.tables.pojos.MEntity, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<MEntityRecord, cn.vertxup.atom.domain.tables.pojos.MEntity, String>) super.queryExecutor();
    }
}
