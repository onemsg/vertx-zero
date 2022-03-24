/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.pojos;


import cn.vertxup.battery.domain.tables.interfaces.IBBag;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BBag implements VertxPojo, IBBag {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        nameAbbr;
    private String        nameFull;
    private String        type;
    private String        uiIcon;
    private String        uiStyle;
    private Long          uiSort;
    private String        uiConfig;
    private String        appId;
    private String        parentId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public BBag() {}

    public BBag(IBBag value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.nameAbbr = value.getNameAbbr();
        this.nameFull = value.getNameFull();
        this.type = value.getType();
        this.uiIcon = value.getUiIcon();
        this.uiStyle = value.getUiStyle();
        this.uiSort = value.getUiSort();
        this.uiConfig = value.getUiConfig();
        this.appId = value.getAppId();
        this.parentId = value.getParentId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public BBag(
        String        key,
        String        name,
        String        nameAbbr,
        String        nameFull,
        String        type,
        String        uiIcon,
        String        uiStyle,
        Long          uiSort,
        String        uiConfig,
        String        appId,
        String        parentId,
        Boolean       active,
        String        sigma,
        String        metadata,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.nameAbbr = nameAbbr;
        this.nameFull = nameFull;
        this.type = type;
        this.uiIcon = uiIcon;
        this.uiStyle = uiStyle;
        this.uiSort = uiSort;
        this.uiConfig = uiConfig;
        this.appId = appId;
        this.parentId = parentId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public BBag(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.KEY</code>. 「key」- 模块主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.KEY</code>. 「key」- 模块主键
     */
    @Override
    public BBag setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.NAME</code>. 「name」- 模块名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.NAME</code>. 「name」- 模块名称
     */
    @Override
    public BBag setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.NAME_ABBR</code>. 「nameAbbr」- 模块缩写
     */
    @Override
    public String getNameAbbr() {
        return this.nameAbbr;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.NAME_ABBR</code>. 「nameAbbr」- 模块缩写
     */
    @Override
    public BBag setNameAbbr(String nameAbbr) {
        this.nameAbbr = nameAbbr;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.NAME_FULL</code>. 「nameFull」- 模块全名
     */
    @Override
    public String getNameFull() {
        return this.nameFull;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.NAME_FULL</code>. 「nameFull」- 模块全名
     */
    @Override
    public BBag setNameFull(String nameFull) {
        this.nameFull = nameFull;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.TYPE</code>. 「type」- 包类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.TYPE</code>. 「type」- 包类型
     */
    @Override
    public BBag setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_ICON</code>. 「uiIcon」- 模块图标
     */
    @Override
    public String getUiIcon() {
        return this.uiIcon;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_ICON</code>. 「uiIcon」- 模块图标
     */
    @Override
    public BBag setUiIcon(String uiIcon) {
        this.uiIcon = uiIcon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_STYLE</code>. 「uiStyle」- 模块风格
     */
    @Override
    public String getUiStyle() {
        return this.uiStyle;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_STYLE</code>. 「uiStyle」- 模块风格
     */
    @Override
    public BBag setUiStyle(String uiStyle) {
        this.uiStyle = uiStyle;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public Long getUiSort() {
        return this.uiSort;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public BBag setUiSort(Long uiSort) {
        this.uiSort = uiSort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UI_CONFIG</code>. 「uiConfig」- 模块核心配置
     */
    @Override
    public String getUiConfig() {
        return this.uiConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UI_CONFIG</code>. 「uiConfig」- 模块核心配置
     */
    @Override
    public BBag setUiConfig(String uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public BBag setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.PARENT_ID</code>. 「parentId」- 父包ID
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.PARENT_ID</code>. 「parentId」- 父包ID
     */
    @Override
    public BBag setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public BBag setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public BBag setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public BBag setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public BBag setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public BBag setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public BBag setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public BBag setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public BBag setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BBag (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(nameAbbr);
        sb.append(", ").append(nameFull);
        sb.append(", ").append(type);
        sb.append(", ").append(uiIcon);
        sb.append(", ").append(uiStyle);
        sb.append(", ").append(uiSort);
        sb.append(", ").append(uiConfig);
        sb.append(", ").append(appId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
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
}
