/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XActivityRuleRecord;
import org.jooq.*;
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
public class XActivityRule extends TableImpl<XActivityRuleRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_ACTIVITY_RULE</code>
     */
    public static final XActivityRule X_ACTIVITY_RULE = new XActivityRule();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.KEY</code>. 「key」- 规则主键
     */
    public final TableField<XActivityRuleRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 规则主键");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.DEFINITION_KEY</code>.
     * 「definitionKey」- 流程对应的 definitionKey，用于查询所有规则用
     */
    public final TableField<XActivityRuleRecord, String> DEFINITION_KEY = createField(DSL.name("DEFINITION_KEY"), SQLDataType.VARCHAR(128), this, "「definitionKey」- 流程对应的 definitionKey，用于查询所有规则用");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    public final TableField<XActivityRuleRecord, String> TASK_KEY = createField(DSL.name("TASK_KEY"), SQLDataType.VARCHAR(255), this, "「taskKey」- 和待办绑定的taskKey");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.TYPE</code>. 「type」- 规则类型
     */
    public final TableField<XActivityRuleRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(64), this, "「type」- 规则类型");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_NAME</code>. 「ruleName」-
     * 规则名称，如果 type = ATOM 时读取，并设置到 typeName 中
     */
    public final TableField<XActivityRuleRecord, String> RULE_NAME = createField(DSL.name("RULE_NAME"), SQLDataType.VARCHAR(255), this, "「ruleName」- 规则名称，如果 type = ATOM 时读取，并设置到 typeName 中");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_IDENTIFIER</code>.
     * 「ruleIdentifier」- 主模型ID
     */
    public final TableField<XActivityRuleRecord, String> RULE_IDENTIFIER = createField(DSL.name("RULE_IDENTIFIER"), SQLDataType.VARCHAR(255), this, "「ruleIdentifier」- 主模型ID");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_FIELD</code>.
     * 「ruleField」- 主字段名
     */
    public final TableField<XActivityRuleRecord, String> RULE_FIELD = createField(DSL.name("RULE_FIELD"), SQLDataType.VARCHAR(128), this, "「ruleField」- 主字段名");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_EXPRESSION</code>.
     * 「ruleExpression」- 规则触发表达式 ( 可以是多个，JsonArray格式 )
     */
    public final TableField<XActivityRuleRecord, String> RULE_EXPRESSION = createField(DSL.name("RULE_EXPRESSION"), SQLDataType.CLOB, this, "「ruleExpression」- 规则触发表达式 ( 可以是多个，JsonArray格式 )");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_TPL</code>. 「ruleTpl」-
     * 参数模板专用，JsonObject结构
     */
    public final TableField<XActivityRuleRecord, String> RULE_TPL = createField(DSL.name("RULE_TPL"), SQLDataType.CLOB, this, "「ruleTpl」- 参数模板专用，JsonObject结构");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_CONFIG</code>.
     * 「ruleConfig」- 规则对应的额外配置
     */
    public final TableField<XActivityRuleRecord, String> RULE_CONFIG = createField(DSL.name("RULE_CONFIG"), SQLDataType.CLOB, this, "「ruleConfig」- 规则对应的额外配置");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.RULE_MESSAGE</code>.
     * 「ruleMessage」- 输出消息专用, Ut.fromExpression解析（特殊解析）
     */
    public final TableField<XActivityRuleRecord, String> RULE_MESSAGE = createField(DSL.name("RULE_MESSAGE"), SQLDataType.CLOB, this, "「ruleMessage」- 输出消息专用, Ut.fromExpression解析（特殊解析）");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XActivityRuleRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XActivityRuleRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.METADATA</code>. 「metadata」-
     * 附加配置
     */
    public final TableField<XActivityRuleRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public final TableField<XActivityRuleRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public final TableField<XActivityRuleRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public final TableField<XActivityRuleRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public final TableField<XActivityRuleRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY_RULE.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public final TableField<XActivityRuleRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XActivityRule(Name alias, Table<XActivityRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private XActivityRule(Name alias, Table<XActivityRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_ACTIVITY_RULE</code> table reference
     */
    public XActivityRule(String alias) {
        this(DSL.name(alias), X_ACTIVITY_RULE);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_ACTIVITY_RULE</code> table reference
     */
    public XActivityRule(Name alias) {
        this(alias, X_ACTIVITY_RULE);
    }

    /**
     * Create a <code>DB_ETERNAL.X_ACTIVITY_RULE</code> table reference
     */
    public XActivityRule() {
        this(DSL.name("X_ACTIVITY_RULE"), null);
    }

    public <O extends Record> XActivityRule(Table<O> child, ForeignKey<O, XActivityRuleRecord> key) {
        super(child, key, X_ACTIVITY_RULE);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XActivityRuleRecord> getRecordType() {
        return XActivityRuleRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.X_ACTIVITY_RULE_IDXM_X_ACTIVITY_RULE_DEFINITION_TASK_KEY);
    }

    @Override
    public UniqueKey<XActivityRuleRecord> getPrimaryKey() {
        return Keys.KEY_X_ACTIVITY_RULE_PRIMARY;
    }

    @Override
    public XActivityRule as(String alias) {
        return new XActivityRule(DSL.name(alias), this);
    }

    @Override
    public XActivityRule as(Name alias) {
        return new XActivityRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XActivityRule rename(String name) {
        return new XActivityRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XActivityRule rename(Name name) {
        return new XActivityRule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
