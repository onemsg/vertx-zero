/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.ISVisitant;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SVisitant implements VertxPojo, ISVisitant {

    private static final long serialVersionUID = 1L;

    private String key;
    private String viewId;
    private String phase;
    private String type;
    private String identifier;
    private String configKey;
    private String aclVisible;
    private String aclView;
    private String aclVariety;
    private String aclVow;
    private String aclVerge;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public SVisitant() {
    }

    public SVisitant(ISVisitant value) {
        this.key = value.getKey();
        this.viewId = value.getViewId();
        this.phase = value.getPhase();
        this.type = value.getType();
        this.identifier = value.getIdentifier();
        this.configKey = value.getConfigKey();
        this.aclVisible = value.getAclVisible();
        this.aclView = value.getAclView();
        this.aclVariety = value.getAclVariety();
        this.aclVow = value.getAclVow();
        this.aclVerge = value.getAclVerge();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public SVisitant(
        String key,
        String viewId,
        String phase,
        String type,
        String identifier,
        String configKey,
        String aclVisible,
        String aclView,
        String aclVariety,
        String aclVow,
        String aclVerge,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.viewId = viewId;
        this.phase = phase;
        this.type = type;
        this.identifier = identifier;
        this.configKey = configKey;
        this.aclVisible = aclVisible;
        this.aclView = aclView;
        this.aclVariety = aclVariety;
        this.aclVow = aclVow;
        this.aclVerge = aclVerge;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public SVisitant(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    @Override
    public SVisitant setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.VIEW_ID</code>. 「viewId」-
     * 视图访问者的读ID
     */
    @Override
    public String getViewId() {
        return this.viewId;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.VIEW_ID</code>. 「viewId」-
     * 视图访问者的读ID
     */
    @Override
    public SVisitant setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.PHASE</code>. 「phase」- 作用周期
     */
    @Override
    public String getPhase() {
        return this.phase;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.PHASE</code>. 「phase」- 作用周期
     */
    @Override
    public SVisitant setPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    @Override
    public SVisitant setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.IDENTIFIER</code>. 「identifier」-
     * 动态类型中的模型ID
     */
    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.IDENTIFIER</code>. 「identifier」-
     * 动态类型中的模型ID
     */
    @Override
    public SVisitant setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.CONFIG_KEY</code>. 「configKey」-
     * 模型下记录对应的ID，一般是配置的ID
     */
    @Override
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.CONFIG_KEY</code>. 「configKey」-
     * 模型下记录对应的ID，一般是配置的ID
     */
    @Override
    public SVisitant setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」-
     * 可见的属性集
     */
    @Override
    public String getAclVisible() {
        return this.aclVisible;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」-
     * 可见的属性集
     */
    @Override
    public SVisitant setAclVisible(String aclVisible) {
        this.aclVisible = aclVisible;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    @Override
    public String getAclView() {
        return this.aclView;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    @Override
    public SVisitant setAclView(String aclView) {
        this.aclView = aclView;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」-
     * 多样性的属性集，用于控制集合类型的属性
     */
    @Override
    public String getAclVariety() {
        return this.aclVariety;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」-
     * 多样性的属性集，用于控制集合类型的属性
     */
    @Override
    public SVisitant setAclVariety(String aclVariety) {
        this.aclVariety = aclVariety;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    @Override
    public String getAclVow() {
        return this.aclVow;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    @Override
    public SVisitant setAclVow(String aclVow) {
        this.aclVow = aclVow;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VERGE</code>. 「aclVerge」-
     * 依赖属性集
     */
    @Override
    public String getAclVerge() {
        return this.aclVerge;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VERGE</code>. 「aclVerge」-
     * 依赖属性集
     */
    @Override
    public SVisitant setAclVerge(String aclVerge) {
        this.aclVerge = aclVerge;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public SVisitant setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SVisitant setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SVisitant setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public SVisitant setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public SVisitant setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public SVisitant setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public SVisitant setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public SVisitant setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SVisitant (");

        sb.append(key);
        sb.append(", ").append(viewId);
        sb.append(", ").append(phase);
        sb.append(", ").append(type);
        sb.append(", ").append(identifier);
        sb.append(", ").append(configKey);
        sb.append(", ").append(aclVisible);
        sb.append(", ").append(aclView);
        sb.append(", ").append(aclVariety);
        sb.append(", ").append(aclVow);
        sb.append(", ").append(aclVerge);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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
    public void from(ISVisitant from) {
        setKey(from.getKey());
        setViewId(from.getViewId());
        setPhase(from.getPhase());
        setType(from.getType());
        setIdentifier(from.getIdentifier());
        setConfigKey(from.getConfigKey());
        setAclVisible(from.getAclVisible());
        setAclView(from.getAclView());
        setAclVariety(from.getAclVariety());
        setAclVow(from.getAclVow());
        setAclVerge(from.getAclVerge());
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
    public <E extends ISVisitant> E into(E into) {
        into.from(this);
        return into;
    }
}
