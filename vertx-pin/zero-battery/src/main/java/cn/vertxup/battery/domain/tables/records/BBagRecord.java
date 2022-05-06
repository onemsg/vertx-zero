/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.records;


import cn.vertxup.battery.domain.tables.BBag;
import cn.vertxup.battery.domain.tables.interfaces.IBBag;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BBagRecord extends UpdatableRecordImpl<BBagRecord> implements VertxPojo, Record19<String, String, String, String, String, String, String, Long, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IBBag {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.KEY</code>. 「key」- 模块主键
     */
    @Override
    public BBagRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.KEY</code>. 「key」- 模块主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.NAME</code>. 「name」- 模块名称
     */
    @Override
    public BBagRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.NAME</code>. 「name」- 模块名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.NAME_ABBR</code>. 「nameAbbr」- 模块缩写
     */
    @Override
    public BBagRecord setNameAbbr(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.NAME_ABBR</code>. 「nameAbbr」- 模块缩写
     */
    @Override
    public String getNameAbbr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.NAME_FULL</code>. 「nameFull」- 模块全名
     */
    @Override
    public BBagRecord setNameFull(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.NAME_FULL</code>. 「nameFull」- 模块全名
     */
    @Override
    public String getNameFull() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.TYPE</code>. 「type」- 包类型
     */
    @Override
    public BBagRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.TYPE</code>. 「type」- 包类型
     */
    @Override
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_ICON</code>. 「uiIcon」- 模块图标
     */
    @Override
    public BBagRecord setUiIcon(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_ICON</code>. 「uiIcon」- 模块图标
     */
    @Override
    public String getUiIcon() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_STYLE</code>. 「uiStyle」- 模块风格
     */
    @Override
    public BBagRecord setUiStyle(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_STYLE</code>. 「uiStyle」- 模块风格
     */
    @Override
    public String getUiStyle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public BBagRecord setUiSort(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public Long getUiSort() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_CONFIG</code>. 「uiConfig」- 模块核心配置
     */
    @Override
    public BBagRecord setUiConfig(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_CONFIG</code>. 「uiConfig」- 模块核心配置
     */
    @Override
    public String getUiConfig() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public BBagRecord setAppId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.PARENT_ID</code>. 「parentId」- 父包ID
     */
    @Override
    public BBagRecord setParentId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.PARENT_ID</code>. 「parentId」- 父包ID
     */
    @Override
    public String getParentId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public BBagRecord setActive(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public BBagRecord setSigma(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public BBagRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public BBagRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public BBagRecord setCreatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public BBagRecord setCreatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public BBagRecord setUpdatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public BBagRecord setUpdatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, String, Long, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<String, String, String, String, String, String, String, Long, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BBag.B_BAG.KEY;
    }

    @Override
    public Field<String> field2() {
        return BBag.B_BAG.NAME;
    }

    @Override
    public Field<String> field3() {
        return BBag.B_BAG.NAME_ABBR;
    }

    @Override
    public Field<String> field4() {
        return BBag.B_BAG.NAME_FULL;
    }

    @Override
    public Field<String> field5() {
        return BBag.B_BAG.TYPE;
    }

    @Override
    public Field<String> field6() {
        return BBag.B_BAG.UI_ICON;
    }

    @Override
    public Field<String> field7() {
        return BBag.B_BAG.UI_STYLE;
    }

    @Override
    public Field<Long> field8() {
        return BBag.B_BAG.UI_SORT;
    }

    @Override
    public Field<String> field9() {
        return BBag.B_BAG.UI_CONFIG;
    }

    @Override
    public Field<String> field10() {
        return BBag.B_BAG.APP_ID;
    }

    @Override
    public Field<String> field11() {
        return BBag.B_BAG.PARENT_ID;
    }

    @Override
    public Field<Boolean> field12() {
        return BBag.B_BAG.ACTIVE;
    }

    @Override
    public Field<String> field13() {
        return BBag.B_BAG.SIGMA;
    }

    @Override
    public Field<String> field14() {
        return BBag.B_BAG.METADATA;
    }

    @Override
    public Field<String> field15() {
        return BBag.B_BAG.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return BBag.B_BAG.CREATED_AT;
    }

    @Override
    public Field<String> field17() {
        return BBag.B_BAG.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return BBag.B_BAG.UPDATED_AT;
    }

    @Override
    public Field<String> field19() {
        return BBag.B_BAG.UPDATED_BY;
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
    public String component3() {
        return getNameAbbr();
    }

    @Override
    public String component4() {
        return getNameFull();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public String component6() {
        return getUiIcon();
    }

    @Override
    public String component7() {
        return getUiStyle();
    }

    @Override
    public Long component8() {
        return getUiSort();
    }

    @Override
    public String component9() {
        return getUiConfig();
    }

    @Override
    public String component10() {
        return getAppId();
    }

    @Override
    public String component11() {
        return getParentId();
    }

    @Override
    public Boolean component12() {
        return getActive();
    }

    @Override
    public String component13() {
        return getSigma();
    }

    @Override
    public String component14() {
        return getMetadata();
    }

    @Override
    public String component15() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component16() {
        return getCreatedAt();
    }

    @Override
    public String component17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component18() {
        return getUpdatedAt();
    }

    @Override
    public String component19() {
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
    public String value3() {
        return getNameAbbr();
    }

    @Override
    public String value4() {
        return getNameFull();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public String value6() {
        return getUiIcon();
    }

    @Override
    public String value7() {
        return getUiStyle();
    }

    @Override
    public Long value8() {
        return getUiSort();
    }

    @Override
    public String value9() {
        return getUiConfig();
    }

    @Override
    public String value10() {
        return getAppId();
    }

    @Override
    public String value11() {
        return getParentId();
    }

    @Override
    public Boolean value12() {
        return getActive();
    }

    @Override
    public String value13() {
        return getSigma();
    }

    @Override
    public String value14() {
        return getMetadata();
    }

    @Override
    public String value15() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value16() {
        return getCreatedAt();
    }

    @Override
    public String value17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value18() {
        return getUpdatedAt();
    }

    @Override
    public String value19() {
        return getUpdatedBy();
    }

    @Override
    public BBagRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public BBagRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public BBagRecord value3(String value) {
        setNameAbbr(value);
        return this;
    }

    @Override
    public BBagRecord value4(String value) {
        setNameFull(value);
        return this;
    }

    @Override
    public BBagRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public BBagRecord value6(String value) {
        setUiIcon(value);
        return this;
    }

    @Override
    public BBagRecord value7(String value) {
        setUiStyle(value);
        return this;
    }

    @Override
    public BBagRecord value8(Long value) {
        setUiSort(value);
        return this;
    }

    @Override
    public BBagRecord value9(String value) {
        setUiConfig(value);
        return this;
    }

    @Override
    public BBagRecord value10(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public BBagRecord value11(String value) {
        setParentId(value);
        return this;
    }

    @Override
    public BBagRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public BBagRecord value13(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public BBagRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public BBagRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public BBagRecord value16(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public BBagRecord value17(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BBagRecord value18(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public BBagRecord value19(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public BBagRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Long value8, String value9, String value10, String value11, Boolean value12, String value13, String value14, String value15, LocalDateTime value16, String value17, LocalDateTime value18, String value19) {
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
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBBag from) {
        setKey(from.getKey());
        setName(from.getName());
        setNameAbbr(from.getNameAbbr());
        setNameFull(from.getNameFull());
        setType(from.getType());
        setUiIcon(from.getUiIcon());
        setUiStyle(from.getUiStyle());
        setUiSort(from.getUiSort());
        setUiConfig(from.getUiConfig());
        setAppId(from.getAppId());
        setParentId(from.getParentId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IBBag> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BBagRecord
     */
    public BBagRecord() {
        super(BBag.B_BAG);
    }

    /**
     * Create a detached, initialised BBagRecord
     */
    public BBagRecord(String key, String name, String nameAbbr, String nameFull, String type, String uiIcon, String uiStyle, Long uiSort, String uiConfig, String appId, String parentId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(BBag.B_BAG);

        setKey(key);
        setName(name);
        setNameAbbr(nameAbbr);
        setNameFull(nameFull);
        setType(type);
        setUiIcon(uiIcon);
        setUiStyle(uiStyle);
        setUiSort(uiSort);
        setUiConfig(uiConfig);
        setAppId(appId);
        setParentId(parentId);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised BBagRecord
     */
    public BBagRecord(cn.vertxup.battery.domain.tables.pojos.BBag value) {
        super(BBag.B_BAG);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setNameAbbr(value.getNameAbbr());
            setNameFull(value.getNameFull());
            setType(value.getType());
            setUiIcon(value.getUiIcon());
            setUiStyle(value.getUiStyle());
            setUiSort(value.getUiSort());
            setUiConfig(value.getUiConfig());
            setAppId(value.getAppId());
            setParentId(value.getParentId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

    public BBagRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
