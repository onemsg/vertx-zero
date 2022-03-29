/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XCategoryRecord;
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
public class XCategory extends TableImpl<XCategoryRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_CATEGORY</code>
     */
    public static final XCategory X_CATEGORY = new XCategory();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.KEY</code>. 「key」- 类型主键
     */
    public final TableField<XCategoryRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 类型主键");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.NAME</code>. 「name」- 类型名称
     */
    public final TableField<XCategoryRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 类型名称");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.CODE</code>. 「code」- 类型编号
     */
    public final TableField<XCategoryRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 类型编号");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.ICON</code>. 「icon」- 类型图标
     */
    public final TableField<XCategoryRecord, String> ICON = createField(DSL.name("ICON"), SQLDataType.VARCHAR(255), this, "「icon」- 类型图标");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.TYPE</code>. 「type」- 类型的分类
     */
    public final TableField<XCategoryRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(255), this, "「type」- 类型的分类");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.SORT</code>. 「sort」- 排序信息
     */
    public final TableField<XCategoryRecord, Integer> SORT = createField(DSL.name("SORT"), SQLDataType.INTEGER, this, "「sort」- 排序信息");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.LEAF</code>. 「leaf」- 是否叶节点
     */
    public final TableField<XCategoryRecord, Boolean> LEAF = createField(DSL.name("LEAF"), SQLDataType.BIT, this, "「leaf」- 是否叶节点");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.PARENT_ID</code>. 「parentId」- 父类ID
     */
    public final TableField<XCategoryRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 父类ID");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.IDENTIFIER</code>. 「identifier」-
     * 当前类型描述的Model的标识
     */
    public final TableField<XCategoryRecord, String> IDENTIFIER = createField(DSL.name("IDENTIFIER"), SQLDataType.VARCHAR(255), this, "「identifier」- 当前类型描述的Model的标识");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.COMMENT</code>. 「comment」- 备注信息
     */
    public final TableField<XCategoryRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 备注信息");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<XCategoryRecord, String> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.VARCHAR(255), this, "「appId」- 关联的应用程序ID");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.TREE_COMPONENT</code>.
     * 「treeComponent」- 目录组件，构造树专用
     */
    public final TableField<XCategoryRecord, String> TREE_COMPONENT = createField(DSL.name("TREE_COMPONENT"), SQLDataType.CLOB, this, "「treeComponent」- 目录组件，构造树专用");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.TREE_CONFIG</code>. 「treeConfig」-
     * 目录组件运行配置，特殊场景专用
     */
    public final TableField<XCategoryRecord, String> TREE_CONFIG = createField(DSL.name("TREE_CONFIG"), SQLDataType.CLOB, this, "「treeConfig」- 目录组件运行配置，特殊场景专用");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.RUN_COMPONENT</code>.
     * 「runComponent」- 执行组件
     */
    public final TableField<XCategoryRecord, String> RUN_COMPONENT = createField(DSL.name("RUN_COMPONENT"), SQLDataType.CLOB, this, "「runComponent」- 执行组件");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.RUN_CONFIG</code>. 「runConfig」-
     * 执行组件相关配置
     */
    public final TableField<XCategoryRecord, String> RUN_CONFIG = createField(DSL.name("RUN_CONFIG"), SQLDataType.CLOB, this, "「runConfig」- 执行组件相关配置");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XCategoryRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XCategoryRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XCategoryRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XCategoryRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<XCategoryRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public final TableField<XCategoryRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<XCategoryRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_CATEGORY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public final TableField<XCategoryRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XCategory(Name alias, Table<XCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private XCategory(Name alias, Table<XCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_CATEGORY</code> table reference
     */
    public XCategory(String alias) {
        this(DSL.name(alias), X_CATEGORY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_CATEGORY</code> table reference
     */
    public XCategory(Name alias) {
        this(alias, X_CATEGORY);
    }

    /**
     * Create a <code>DB_ETERNAL.X_CATEGORY</code> table reference
     */
    public XCategory() {
        this(DSL.name("X_CATEGORY"), null);
    }

    public <O extends Record> XCategory(Table<O> child, ForeignKey<O, XCategoryRecord> key) {
        super(child, key, X_CATEGORY);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XCategoryRecord> getRecordType() {
        return XCategoryRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.X_CATEGORY_IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE, Indexes.X_CATEGORY_IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE);
    }

    @Override
    public UniqueKey<XCategoryRecord> getPrimaryKey() {
        return Keys.KEY_X_CATEGORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<XCategoryRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_CATEGORY_APP_ID, Keys.KEY_X_CATEGORY_SIGMA);
    }

    @Override
    public XCategory as(String alias) {
        return new XCategory(DSL.name(alias), this);
    }

    @Override
    public XCategory as(Name alias) {
        return new XCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XCategory rename(String name) {
        return new XCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XCategory rename(Name name) {
        return new XCategory(name, null);
    }
}
