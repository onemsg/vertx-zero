/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables;


import cn.vertxup.lbs.domain.Db;
import cn.vertxup.lbs.domain.Keys;
import cn.vertxup.lbs.domain.tables.records.LCityRecord;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LCity extends TableImpl<LCityRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.L_CITY</code>
     */
    public static final LCity L_CITY = new LCity();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.L_CITY.KEY</code>. 「key」- 主键
     */
    public final TableField<LCityRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 主键");
    /**
     * The column <code>DB_ETERNAL.L_CITY.NAME</code>. 「name」- 名称
     */
    public final TableField<LCityRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 名称");
    /**
     * The column <code>DB_ETERNAL.L_CITY.CODE</code>. 「code」- 编码
     */
    public final TableField<LCityRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 编码");
    /**
     * The column <code>DB_ETERNAL.L_CITY.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<LCityRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.L_CITY.ORDER</code>. 「order」- 排序
     */
    public final TableField<LCityRecord, Integer> ORDER = createField(DSL.name("ORDER"), SQLDataType.INTEGER, this, "「order」- 排序");
    /**
     * The column <code>DB_ETERNAL.L_CITY.STATE_ID</code>. 「stateId」- 省会ID
     */
    public final TableField<LCityRecord, String> STATE_ID = createField(DSL.name("STATE_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「stateId」- 省会ID");
    /**
     * The column <code>DB_ETERNAL.L_CITY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<LCityRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.L_CITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<LCityRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.L_CITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<LCityRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.L_CITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<LCityRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.L_CITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<LCityRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.L_CITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<LCityRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.L_CITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<LCityRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private LCity(Name alias, Table<LCityRecord> aliased) {
        this(alias, aliased, null);
    }

    private LCity(Name alias, Table<LCityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.L_CITY</code> table reference
     */
    public LCity(String alias) {
        this(DSL.name(alias), L_CITY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.L_CITY</code> table reference
     */
    public LCity(Name alias) {
        this(alias, L_CITY);
    }

    /**
     * Create a <code>DB_ETERNAL.L_CITY</code> table reference
     */
    public LCity() {
        this(DSL.name("L_CITY"), null);
    }

    public <O extends Record> LCity(Table<O> child, ForeignKey<O, LCityRecord> key) {
        super(child, key, L_CITY);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LCityRecord> getRecordType() {
        return LCityRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<LCityRecord> getPrimaryKey() {
        return Keys.KEY_L_CITY_PRIMARY;
    }

    @Override
    public List<UniqueKey<LCityRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_L_CITY_CODE);
    }

    @Override
    public LCity as(String alias) {
        return new LCity(DSL.name(alias), this);
    }

    @Override
    public LCity as(Name alias) {
        return new LCity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LCity rename(String name) {
        return new LCity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LCity rename(Name name) {
        return new LCity(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
