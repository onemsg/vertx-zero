/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXModule;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XModule implements VertxPojo, IXModule {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        entry;
    private String        blockCode;
    private String        appId;
    private String        modelId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public XModule() {}

    public XModule(IXModule value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.entry = value.getEntry();
        this.blockCode = value.getBlockCode();
        this.appId = value.getAppId();
        this.modelId = value.getModelId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XModule(
        String        key,
        String        name,
        String        code,
        String        entry,
        String        blockCode,
        String        appId,
        String        modelId,
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
        this.code = code;
        this.entry = entry;
        this.blockCode = blockCode;
        this.appId = appId;
        this.modelId = modelId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XModule(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.KEY</code>. 「key」- 模块唯一主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.KEY</code>. 「key」- 模块唯一主键
     */
    @Override
    public XModule setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.NAME</code>. 「name」- 模块名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.NAME</code>. 「name」- 模块名称
     */
    @Override
    public XModule setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.CODE</code>. 「code」- 模块编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.CODE</code>. 「code」- 模块编码
     */
    @Override
    public XModule setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.ENTRY</code>. 「entry」— 模块入口地址
     */
    @Override
    public String getEntry() {
        return this.entry;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.ENTRY</code>. 「entry」— 模块入口地址
     */
    @Override
    public XModule setEntry(String entry) {
        this.entry = entry;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.BLOCK_CODE</code>. 「blockCode」—
     * 所属模块系统编码
     */
    @Override
    public String getBlockCode() {
        return this.blockCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.BLOCK_CODE</code>. 「blockCode」—
     * 所属模块系统编码
     */
    @Override
    public XModule setBlockCode(String blockCode) {
        this.blockCode = blockCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public XModule setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.MODEL_ID</code>. 「modelId」-
     * 当前模块关联的主模型ID
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.MODEL_ID</code>. 「modelId」-
     * 当前模块关联的主模型ID
     */
    @Override
    public XModule setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XModule setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XModule setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XModule setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XModule setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XModule setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XModule setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XModule setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MODULE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MODULE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XModule setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XModule (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(entry);
        sb.append(", ").append(blockCode);
        sb.append(", ").append(appId);
        sb.append(", ").append(modelId);
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
    public void from(IXModule from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setEntry(from.getEntry());
        setBlockCode(from.getBlockCode());
        setAppId(from.getAppId());
        setModelId(from.getModelId());
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
    public <E extends IXModule> E into(E into) {
        into.from(this);
        return into;
    }
}
