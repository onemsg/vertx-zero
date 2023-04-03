/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain;


import cn.vertxup.jet.domain.tables.IJob;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in DB_ETERNAL.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index I_JOB_IDX_I_JOB_SERVICE_ID = Internal.createIndex(DSL.name("IDX_I_JOB_SERVICE_ID"), IJob.I_JOB, new OrderField[] { IJob.I_JOB.SERVICE_ID }, false);
    public static final Index I_JOB_IDX_I_JOB_SIGMA = Internal.createIndex(DSL.name("IDX_I_JOB_SIGMA"), IJob.I_JOB, new OrderField[] { IJob.I_JOB.SIGMA }, false);
    public static final Index I_JOB_IDXM_I_JOB_GROUP_SIGMA = Internal.createIndex(DSL.name("IDXM_I_JOB_GROUP_SIGMA"), IJob.I_JOB, new OrderField[] { IJob.I_JOB.SIGMA, IJob.I_JOB.GROUP }, false);
    public static final Index I_JOB_IDXM_I_JOB_GROUP_TYPE_SIGMA = Internal.createIndex(DSL.name("IDXM_I_JOB_GROUP_TYPE_SIGMA"), IJob.I_JOB, new OrderField[] { IJob.I_JOB.SIGMA, IJob.I_JOB.GROUP, IJob.I_JOB.TYPE }, false);
    public static final Index I_JOB_IDXM_I_JOB_TYPE_SIGMA = Internal.createIndex(DSL.name("IDXM_I_JOB_TYPE_SIGMA"), IJob.I_JOB, new OrderField[] { IJob.I_JOB.SIGMA, IJob.I_JOB.TYPE }, false);
}
