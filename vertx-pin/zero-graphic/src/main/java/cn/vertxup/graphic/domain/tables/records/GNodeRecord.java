/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.records;


import cn.vertxup.graphic.domain.tables.GNode;
import cn.vertxup.graphic.domain.tables.interfaces.IGNode;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GNodeRecord extends UpdatableRecordImpl<GNodeRecord> implements VertxPojo, Record18<String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IGNode {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.KEY</code>. 「key」- 节点ID
     */
    @Override
    public GNodeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.KEY</code>. 「key」- 节点ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.NAME</code>. 「name」- 节点呈现名称
     */
    @Override
    public GNodeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.NAME</code>. 「name」- 节点呈现名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.X</code>. 「x」- 当前节点在图上的x坐标
     */
    @Override
    public GNodeRecord setX(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.X</code>. 「x」- 当前节点在图上的x坐标
     */
    @Override
    public BigDecimal getX() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.Y</code>. 「y」- 当前节点在图上的y坐标
     */
    @Override
    public GNodeRecord setY(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.Y</code>. 「y」- 当前节点在图上的y坐标
     */
    @Override
    public BigDecimal getY() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public GNodeRecord setUi(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public String getUi() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.GRAPHIC_ID</code>. 「graphicId」-
     * 它所关联的图实例ID
     */
    @Override
    public GNodeRecord setGraphicId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.GRAPHIC_ID</code>. 「graphicId」-
     * 它所关联的图实例ID
     */
    @Override
    public String getGraphicId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_DATA</code>. 「recordData」-
     * 该节点存储的数据信息
     */
    @Override
    public GNodeRecord setRecordData(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_DATA</code>. 「recordData」-
     * 该节点存储的数据信息
     */
    @Override
    public String getRecordData() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public GNodeRecord setRecordKey(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public String getRecordKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_COMPONENT</code>.
     * 「recordComponent」- 记录处理组件
     */
    @Override
    public GNodeRecord setRecordComponent(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_COMPONENT</code>.
     * 「recordComponent」- 记录处理组件
     */
    @Override
    public String getRecordComponent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_CLASS</code>. 「recordClass」-
     * 记录绑定Pojo类型
     */
    @Override
    public GNodeRecord setRecordClass(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_CLASS</code>. 「recordClass」-
     * 记录绑定Pojo类型
     */
    @Override
    public String getRecordClass() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public GNodeRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public GNodeRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public GNodeRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public GNodeRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public GNodeRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public GNodeRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public GNodeRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public GNodeRecord setUpdatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GNode.G_NODE.KEY;
    }

    @Override
    public Field<String> field2() {
        return GNode.G_NODE.NAME;
    }

    @Override
    public Field<BigDecimal> field3() {
        return GNode.G_NODE.X;
    }

    @Override
    public Field<BigDecimal> field4() {
        return GNode.G_NODE.Y;
    }

    @Override
    public Field<String> field5() {
        return GNode.G_NODE.UI;
    }

    @Override
    public Field<String> field6() {
        return GNode.G_NODE.GRAPHIC_ID;
    }

    @Override
    public Field<String> field7() {
        return GNode.G_NODE.RECORD_DATA;
    }

    @Override
    public Field<String> field8() {
        return GNode.G_NODE.RECORD_KEY;
    }

    @Override
    public Field<String> field9() {
        return GNode.G_NODE.RECORD_COMPONENT;
    }

    @Override
    public Field<String> field10() {
        return GNode.G_NODE.RECORD_CLASS;
    }

    @Override
    public Field<String> field11() {
        return GNode.G_NODE.SIGMA;
    }

    @Override
    public Field<String> field12() {
        return GNode.G_NODE.LANGUAGE;
    }

    @Override
    public Field<Boolean> field13() {
        return GNode.G_NODE.ACTIVE;
    }

    @Override
    public Field<String> field14() {
        return GNode.G_NODE.METADATA;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return GNode.G_NODE.CREATED_AT;
    }

    @Override
    public Field<String> field16() {
        return GNode.G_NODE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return GNode.G_NODE.UPDATED_AT;
    }

    @Override
    public Field<String> field18() {
        return GNode.G_NODE.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public BigDecimal component3() {
        return getX();
    }

    @Override
    public BigDecimal component4() {
        return getY();
    }

    @Override
    public String component5() {
        return getUi();
    }

    @Override
    public String component6() {
        return getGraphicId();
    }

    @Override
    public String component7() {
        return getRecordData();
    }

    @Override
    public String component8() {
        return getRecordKey();
    }

    @Override
    public String component9() {
        return getRecordComponent();
    }

    @Override
    public String component10() {
        return getRecordClass();
    }

    @Override
    public String component11() {
        return getSigma();
    }

    @Override
    public String component12() {
        return getLanguage();
    }

    @Override
    public Boolean component13() {
        return getActive();
    }

    @Override
    public String component14() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component15() {
        return getCreatedAt();
    }

    @Override
    public String component16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component17() {
        return getUpdatedAt();
    }

    @Override
    public String component18() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public BigDecimal value3() {
        return getX();
    }

    @Override
    public BigDecimal value4() {
        return getY();
    }

    @Override
    public String value5() {
        return getUi();
    }

    @Override
    public String value6() {
        return getGraphicId();
    }

    @Override
    public String value7() {
        return getRecordData();
    }

    @Override
    public String value8() {
        return getRecordKey();
    }

    @Override
    public String value9() {
        return getRecordComponent();
    }

    @Override
    public String value10() {
        return getRecordClass();
    }

    @Override
    public String value11() {
        return getSigma();
    }

    @Override
    public String value12() {
        return getLanguage();
    }

    @Override
    public Boolean value13() {
        return getActive();
    }

    @Override
    public String value14() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value15() {
        return getCreatedAt();
    }

    @Override
    public String value16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value17() {
        return getUpdatedAt();
    }

    @Override
    public String value18() {
        return getUpdatedBy();
    }

    @Override
    public GNodeRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public GNodeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GNodeRecord value3(BigDecimal value) {
        setX(value);
        return this;
    }

    @Override
    public GNodeRecord value4(BigDecimal value) {
        setY(value);
        return this;
    }

    @Override
    public GNodeRecord value5(String value) {
        setUi(value);
        return this;
    }

    @Override
    public GNodeRecord value6(String value) {
        setGraphicId(value);
        return this;
    }

    @Override
    public GNodeRecord value7(String value) {
        setRecordData(value);
        return this;
    }

    @Override
    public GNodeRecord value8(String value) {
        setRecordKey(value);
        return this;
    }

    @Override
    public GNodeRecord value9(String value) {
        setRecordComponent(value);
        return this;
    }

    @Override
    public GNodeRecord value10(String value) {
        setRecordClass(value);
        return this;
    }

    @Override
    public GNodeRecord value11(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public GNodeRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public GNodeRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public GNodeRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public GNodeRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public GNodeRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GNodeRecord value17(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public GNodeRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public GNodeRecord values(String value1, String value2, BigDecimal value3, BigDecimal value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Boolean value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IGNode from) {
        setKey(from.getKey());
        setName(from.getName());
        setX(from.getX());
        setY(from.getY());
        setUi(from.getUi());
        setGraphicId(from.getGraphicId());
        setRecordData(from.getRecordData());
        setRecordKey(from.getRecordKey());
        setRecordComponent(from.getRecordComponent());
        setRecordClass(from.getRecordClass());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IGNode> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GNodeRecord
     */
    public GNodeRecord() {
        super(GNode.G_NODE);
    }

    /**
     * Create a detached, initialised GNodeRecord
     */
    public GNodeRecord(String key, String name, BigDecimal x, BigDecimal y, String ui, String graphicId, String recordData, String recordKey, String recordComponent, String recordClass, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(GNode.G_NODE);

        setKey(key);
        setName(name);
        setX(x);
        setY(y);
        setUi(ui);
        setGraphicId(graphicId);
        setRecordData(recordData);
        setRecordKey(recordKey);
        setRecordComponent(recordComponent);
        setRecordClass(recordClass);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised GNodeRecord
     */
    public GNodeRecord(cn.vertxup.graphic.domain.tables.pojos.GNode value) {
        super(GNode.G_NODE);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setX(value.getX());
            setY(value.getY());
            setUi(value.getUi());
            setGraphicId(value.getGraphicId());
            setRecordData(value.getRecordData());
            setRecordKey(value.getRecordKey());
            setRecordComponent(value.getRecordComponent());
            setRecordClass(value.getRecordClass());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

    public GNodeRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
