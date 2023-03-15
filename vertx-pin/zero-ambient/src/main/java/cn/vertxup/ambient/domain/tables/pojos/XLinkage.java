/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXLinkage;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XLinkage implements VertxPojo, IXLinkage {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String type;
    private String alias;
    private String region;
    private String linkKey;
    private String linkType;
    private String linkData;
    private String sourceKey;
    private String sourceType;
    private String sourceData;
    private String targetKey;
    private String targetType;
    private String targetData;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public XLinkage() {}

    public XLinkage(IXLinkage value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.type = value.getType();
        this.alias = value.getAlias();
        this.region = value.getRegion();
        this.linkKey = value.getLinkKey();
        this.linkType = value.getLinkType();
        this.linkData = value.getLinkData();
        this.sourceKey = value.getSourceKey();
        this.sourceType = value.getSourceType();
        this.sourceData = value.getSourceData();
        this.targetKey = value.getTargetKey();
        this.targetType = value.getTargetType();
        this.targetData = value.getTargetData();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XLinkage(
        String key,
        String name,
        String type,
        String alias,
        String region,
        String linkKey,
        String linkType,
        String linkData,
        String sourceKey,
        String sourceType,
        String sourceData,
        String targetKey,
        String targetType,
        String targetData,
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
        this.name = name;
        this.type = type;
        this.alias = alias;
        this.region = region;
        this.linkKey = linkKey;
        this.linkType = linkType;
        this.linkData = linkData;
        this.sourceKey = sourceKey;
        this.sourceType = sourceType;
        this.sourceData = sourceData;
        this.targetKey = targetKey;
        this.targetType = targetType;
        this.targetData = targetData;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XLinkage(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    @Override
    public XLinkage setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    @Override
    public XLinkage setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    @Override
    public XLinkage setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    @Override
    public String getAlias() {
        return this.alias;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    @Override
    public XLinkage setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    @Override
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    @Override
    public XLinkage setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.LINK_KEY</code>. 「linkKey」-
     * 双向Key计算，根据 source / target 计算
     */
    @Override
    public String getLinkKey() {
        return this.linkKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.LINK_KEY</code>. 「linkKey」-
     * 双向Key计算，根据 source / target 计算
     */
    @Override
    public XLinkage setLinkKey(String linkKey) {
        this.linkKey = linkKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.LINK_TYPE</code>. 「linkType」-
     * 关系记录类型
     */
    @Override
    public String getLinkType() {
        return this.linkType;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.LINK_TYPE</code>. 「linkType」-
     * 关系记录类型
     */
    @Override
    public XLinkage setLinkType(String linkType) {
        this.linkType = linkType;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.LINK_DATA</code>. 「linkData」-
     * 关联数据Json格式
     */
    @Override
    public String getLinkData() {
        return this.linkData;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.LINK_DATA</code>. 「linkData」-
     * 关联数据Json格式
     */
    @Override
    public XLinkage setLinkData(String linkData) {
        this.linkData = linkData;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    @Override
    public String getSourceKey() {
        return this.sourceKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    @Override
    public XLinkage setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」-
     * 源实体类型
     */
    @Override
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」-
     * 源实体类型
     */
    @Override
    public XLinkage setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    @Override
    public String getSourceData() {
        return this.sourceData;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    @Override
    public XLinkage setSourceData(String sourceData) {
        this.sourceData = sourceData;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.TARGET_KEY</code>. 「targetKey」-
     * 目标实体
     */
    @Override
    public String getTargetKey() {
        return this.targetKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.TARGET_KEY</code>. 「targetKey」-
     * 目标实体
     */
    @Override
    public XLinkage setTargetKey(String targetKey) {
        this.targetKey = targetKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.TARGET_TYPE</code>. 「targetType」-
     * 目标实体类型
     */
    @Override
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.TARGET_TYPE</code>. 「targetType」-
     * 目标实体类型
     */
    @Override
    public XLinkage setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    @Override
    public String getTargetData() {
        return this.targetData;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    @Override
    public XLinkage setTargetData(String targetData) {
        this.targetData = targetData;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XLinkage setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XLinkage setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XLinkage setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public XLinkage setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XLinkage setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XLinkage setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XLinkage setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XLinkage setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final XLinkage other = (XLinkage) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.alias == null) {
            if (other.alias != null)
                return false;
        }
        else if (!this.alias.equals(other.alias))
            return false;
        if (this.region == null) {
            if (other.region != null)
                return false;
        }
        else if (!this.region.equals(other.region))
            return false;
        if (this.linkKey == null) {
            if (other.linkKey != null)
                return false;
        }
        else if (!this.linkKey.equals(other.linkKey))
            return false;
        if (this.linkType == null) {
            if (other.linkType != null)
                return false;
        }
        else if (!this.linkType.equals(other.linkType))
            return false;
        if (this.linkData == null) {
            if (other.linkData != null)
                return false;
        }
        else if (!this.linkData.equals(other.linkData))
            return false;
        if (this.sourceKey == null) {
            if (other.sourceKey != null)
                return false;
        }
        else if (!this.sourceKey.equals(other.sourceKey))
            return false;
        if (this.sourceType == null) {
            if (other.sourceType != null)
                return false;
        }
        else if (!this.sourceType.equals(other.sourceType))
            return false;
        if (this.sourceData == null) {
            if (other.sourceData != null)
                return false;
        }
        else if (!this.sourceData.equals(other.sourceData))
            return false;
        if (this.targetKey == null) {
            if (other.targetKey != null)
                return false;
        }
        else if (!this.targetKey.equals(other.targetKey))
            return false;
        if (this.targetType == null) {
            if (other.targetType != null)
                return false;
        }
        else if (!this.targetType.equals(other.targetType))
            return false;
        if (this.targetData == null) {
            if (other.targetData != null)
                return false;
        }
        else if (!this.targetData.equals(other.targetData))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.alias == null) ? 0 : this.alias.hashCode());
        result = prime * result + ((this.region == null) ? 0 : this.region.hashCode());
        result = prime * result + ((this.linkKey == null) ? 0 : this.linkKey.hashCode());
        result = prime * result + ((this.linkType == null) ? 0 : this.linkType.hashCode());
        result = prime * result + ((this.linkData == null) ? 0 : this.linkData.hashCode());
        result = prime * result + ((this.sourceKey == null) ? 0 : this.sourceKey.hashCode());
        result = prime * result + ((this.sourceType == null) ? 0 : this.sourceType.hashCode());
        result = prime * result + ((this.sourceData == null) ? 0 : this.sourceData.hashCode());
        result = prime * result + ((this.targetKey == null) ? 0 : this.targetKey.hashCode());
        result = prime * result + ((this.targetType == null) ? 0 : this.targetType.hashCode());
        result = prime * result + ((this.targetData == null) ? 0 : this.targetData.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XLinkage (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(alias);
        sb.append(", ").append(region);
        sb.append(", ").append(linkKey);
        sb.append(", ").append(linkType);
        sb.append(", ").append(linkData);
        sb.append(", ").append(sourceKey);
        sb.append(", ").append(sourceType);
        sb.append(", ").append(sourceData);
        sb.append(", ").append(targetKey);
        sb.append(", ").append(targetType);
        sb.append(", ").append(targetData);
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
    public void from(IXLinkage from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setAlias(from.getAlias());
        setRegion(from.getRegion());
        setLinkKey(from.getLinkKey());
        setLinkType(from.getLinkType());
        setLinkData(from.getLinkData());
        setSourceKey(from.getSourceKey());
        setSourceType(from.getSourceType());
        setSourceData(from.getSourceData());
        setTargetKey(from.getTargetKey());
        setTargetType(from.getTargetType());
        setTargetData(from.getTargetData());
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
    public <E extends IXLinkage> E into(E into) {
        into.from(this);
        return into;
    }
}
