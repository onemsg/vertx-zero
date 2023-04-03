/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMAcc;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MAcc implements VertxPojo, IMAcc {

    private static final long serialVersionUID = 1L;

    private String key;
    private String modelId;
    private String modelKey;
    private String recordJson;
    private String recordRaw;
    private String recordUnique;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public MAcc() {}

    public MAcc(IMAcc value) {
        this.key = value.getKey();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.recordJson = value.getRecordJson();
        this.recordRaw = value.getRecordRaw();
        this.recordUnique = value.getRecordUnique();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public MAcc(
        String key,
        String modelId,
        String modelKey,
        String recordJson,
        String recordRaw,
        String recordUnique,
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
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.recordJson = recordJson;
        this.recordRaw = recordRaw;
        this.recordUnique = recordUnique;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public MAcc(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.KEY</code>. 「key」- 增量记录ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.KEY</code>. 「key」- 增量记录ID
     */
    @Override
    public MAcc setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public MAcc setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public MAcc setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.RECORD_JSON</code>. 「recordJson」-
     * 上一次的记录内容（Json格式）
     */
    @Override
    public String getRecordJson() {
        return this.recordJson;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.RECORD_JSON</code>. 「recordJson」-
     * 上一次的记录内容（Json格式）
     */
    @Override
    public MAcc setRecordJson(String recordJson) {
        this.recordJson = recordJson;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.RECORD_RAW</code>. 「recordRaw」-
     * 上一次的记录的原始内容
     */
    @Override
    public String getRecordRaw() {
        return this.recordRaw;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.RECORD_RAW</code>. 「recordRaw」-
     * 上一次的记录的原始内容
     */
    @Override
    public MAcc setRecordRaw(String recordRaw) {
        this.recordRaw = recordRaw;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.RECORD_UNIQUE</code>. 「recordUnique」-
     * 业务标识规则专用Key，可计算获取
     */
    @Override
    public String getRecordUnique() {
        return this.recordUnique;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.RECORD_UNIQUE</code>. 「recordUnique」-
     * 业务标识规则专用Key，可计算获取
     */
    @Override
    public MAcc setRecordUnique(String recordUnique) {
        this.recordUnique = recordUnique;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MAcc setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MAcc setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MAcc setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public MAcc setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MAcc setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MAcc setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MAcc setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ACC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ACC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MAcc setUpdatedBy(String updatedBy) {
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
        final MAcc other = (MAcc) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.modelId == null) {
            if (other.modelId != null)
                return false;
        }
        else if (!this.modelId.equals(other.modelId))
            return false;
        if (this.modelKey == null) {
            if (other.modelKey != null)
                return false;
        }
        else if (!this.modelKey.equals(other.modelKey))
            return false;
        if (this.recordJson == null) {
            if (other.recordJson != null)
                return false;
        }
        else if (!this.recordJson.equals(other.recordJson))
            return false;
        if (this.recordRaw == null) {
            if (other.recordRaw != null)
                return false;
        }
        else if (!this.recordRaw.equals(other.recordRaw))
            return false;
        if (this.recordUnique == null) {
            if (other.recordUnique != null)
                return false;
        }
        else if (!this.recordUnique.equals(other.recordUnique))
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
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
        result = prime * result + ((this.recordJson == null) ? 0 : this.recordJson.hashCode());
        result = prime * result + ((this.recordRaw == null) ? 0 : this.recordRaw.hashCode());
        result = prime * result + ((this.recordUnique == null) ? 0 : this.recordUnique.hashCode());
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
        StringBuilder sb = new StringBuilder("MAcc (");

        sb.append(key);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(recordJson);
        sb.append(", ").append(recordRaw);
        sb.append(", ").append(recordUnique);
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
    public void from(IMAcc from) {
        setKey(from.getKey());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setRecordJson(from.getRecordJson());
        setRecordRaw(from.getRecordRaw());
        setRecordUnique(from.getRecordUnique());
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
    public <E extends IMAcc> E into(E into) {
        into.from(this);
        return into;
    }
}
