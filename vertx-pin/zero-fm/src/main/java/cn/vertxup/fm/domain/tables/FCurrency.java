/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Db;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FCurrencyRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FCurrency extends TableImpl<FCurrencyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB_ETERNAL.F_CURRENCY</code>
     */
    public static final FCurrency F_CURRENCY = new FCurrency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FCurrencyRecord> getRecordType() {
        return FCurrencyRecord.class;
    }

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.KEY</code>. 「key」- 币种主键
     */
    public final TableField<FCurrencyRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 币种主键");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.NAME</code>. 「name」- 币种名称
     */
    public final TableField<FCurrencyRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 币种名称");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.CODE</code>. 「code」- 币种编码
     */
    public final TableField<FCurrencyRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」- 币种编码");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.COMMENT</code>. 「comment」 - 币种备注
     */
    public final TableField<FCurrencyRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 币种备注");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.DIGIT_AMOUNT</code>.
     * 「digitAmount」- 金额小数位数
     */
    public final TableField<FCurrencyRecord, Integer> DIGIT_AMOUNT = createField(DSL.name("DIGIT_AMOUNT"), SQLDataType.INTEGER, this, "「digitAmount」- 金额小数位数");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.DIGIT_PRICE</code>. 「digitPrice」-
     * 单价小数位数
     */
    public final TableField<FCurrencyRecord, Integer> DIGIT_PRICE = createField(DSL.name("DIGIT_PRICE"), SQLDataType.INTEGER, this, "「digitPrice」- 单价小数位数");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FCurrencyRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FCurrencyRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FCurrencyRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public final TableField<FCurrencyRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<FCurrencyRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public final TableField<FCurrencyRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<FCurrencyRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>DB_ETERNAL.F_CURRENCY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public final TableField<FCurrencyRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FCurrency(Name alias, Table<FCurrencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private FCurrency(Name alias, Table<FCurrencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_CURRENCY</code> table reference
     */
    public FCurrency(String alias) {
        this(DSL.name(alias), F_CURRENCY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_CURRENCY</code> table reference
     */
    public FCurrency(Name alias) {
        this(alias, F_CURRENCY);
    }

    /**
     * Create a <code>DB_ETERNAL.F_CURRENCY</code> table reference
     */
    public FCurrency() {
        this(DSL.name("F_CURRENCY"), null);
    }

    public <O extends Record> FCurrency(Table<O> child, ForeignKey<O, FCurrencyRecord> key) {
        super(child, key, F_CURRENCY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<FCurrencyRecord> getPrimaryKey() {
        return Keys.KEY_F_CURRENCY_PRIMARY;
    }

    @Override
    public List<UniqueKey<FCurrencyRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_CURRENCY_CODE);
    }

    @Override
    public FCurrency as(String alias) {
        return new FCurrency(DSL.name(alias), this);
    }

    @Override
    public FCurrency as(Name alias) {
        return new FCurrency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FCurrency rename(String name) {
        return new FCurrency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FCurrency rename(Name name) {
        return new FCurrency(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, Integer, Integer, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
