/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables.pojos;


import cn.vertxup.lbs.domain.tables.interfaces.ILCity;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LCity implements VertxPojo, ILCity {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        metadata;
    private Integer       order;
    private String        stateId;
    private Boolean       active;
    private String        sigma;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public LCity() {}

    public LCity(ILCity value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.metadata = value.getMetadata();
        this.order = value.getOrder();
        this.stateId = value.getStateId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public LCity(
        String        key,
        String        name,
        String        code,
        String        metadata,
        Integer       order,
        String        stateId,
        Boolean       active,
        String        sigma,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.metadata = metadata;
        this.order = order;
        this.stateId = stateId;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public LCity(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.KEY</code>. 「key」- 主键
     */
    @Override
    public LCity setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.NAME</code>. 「name」- 名称
     */
    @Override
    public LCity setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.CODE</code>. 「code」- 编码
     */
    @Override
    public LCity setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public LCity setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.ORDER</code>. 「order」- 排序
     */
    @Override
    public Integer getOrder() {
        return this.order;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.ORDER</code>. 「order」- 排序
     */
    @Override
    public LCity setOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.STATE_ID</code>. 「stateId」- 省会ID
     */
    @Override
    public String getStateId() {
        return this.stateId;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.STATE_ID</code>. 「stateId」- 省会ID
     */
    @Override
    public LCity setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public LCity setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public LCity setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public LCity setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LCity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public LCity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LCity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_CITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.L_CITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public LCity setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LCity (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(metadata);
        sb.append(", ").append(order);
        sb.append(", ").append(stateId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
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
    public void from(ILCity from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setMetadata(from.getMetadata());
        setOrder(from.getOrder());
        setStateId(from.getStateId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ILCity> E into(E into) {
        into.from(this);
        return into;
    }
}
