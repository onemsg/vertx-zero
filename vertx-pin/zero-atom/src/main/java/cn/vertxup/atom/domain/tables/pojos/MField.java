/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMField;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MField implements VertxPojo, IMField {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String type;
    private String columnName;
    private String columnType;
    private Boolean isPrimary;
    private Boolean isNullable;
    private Integer length;
    private Integer precision;
    private String format;
    private String inComponent;
    private String outComponent;
    private String entityId;
    private String comments;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public MField() {}

    public MField(IMField value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.type = value.getType();
        this.columnName = value.getColumnName();
        this.columnType = value.getColumnType();
        this.isPrimary = value.getIsPrimary();
        this.isNullable = value.getIsNullable();
        this.length = value.getLength();
        this.precision = value.getPrecision();
        this.format = value.getFormat();
        this.inComponent = value.getInComponent();
        this.outComponent = value.getOutComponent();
        this.entityId = value.getEntityId();
        this.comments = value.getComments();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public MField(
        String key,
        String name,
        String type,
        String columnName,
        String columnType,
        Boolean isPrimary,
        Boolean isNullable,
        Integer length,
        Integer precision,
        String format,
        String inComponent,
        String outComponent,
        String entityId,
        String comments,
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
        this.columnName = columnName;
        this.columnType = columnType;
        this.isPrimary = isPrimary;
        this.isNullable = isNullable;
        this.length = length;
        this.precision = precision;
        this.format = format;
        this.inComponent = inComponent;
        this.outComponent = outComponent;
        this.entityId = entityId;
        this.comments = comments;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public MField(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.KEY</code>. 「key」- 字段ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.KEY</code>. 「key」- 字段ID
     */
    @Override
    public MField setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.NAME</code>. 「name」- 属性名（非列）
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.NAME</code>. 「name」- 属性名（非列）
     */
    @Override
    public MField setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.TYPE</code>. 「type」- OX核心类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.TYPE</code>. 「type」- OX核心类型
     */
    @Override
    public MField setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.COLUMN_NAME</code>. 「columnName」-
     * 数据库列名
     */
    @Override
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.COLUMN_NAME</code>. 「columnName」-
     * 数据库列名
     */
    @Override
    public MField setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.COLUMN_TYPE</code>. 「columnType」-
     * 数据库转换过后的类型
     */
    @Override
    public String getColumnType() {
        return this.columnType;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.COLUMN_TYPE</code>. 「columnType」-
     * 数据库转换过后的类型
     */
    @Override
    public MField setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.IS_PRIMARY</code>. 「isPrimary」- 是否为主键
     */
    @Override
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.IS_PRIMARY</code>. 「isPrimary」- 是否为主键
     */
    @Override
    public MField setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.IS_NULLABLE</code>. 「isNullable」-
     * 是否可为空
     */
    @Override
    public Boolean getIsNullable() {
        return this.isNullable;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.IS_NULLABLE</code>. 「isNullable」-
     * 是否可为空
     */
    @Override
    public MField setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.LENGTH</code>. 「length」- String类型的长度
     */
    @Override
    public Integer getLength() {
        return this.length;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.LENGTH</code>. 「length」- String类型的长度
     */
    @Override
    public MField setLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.PRECISION</code>. 「precision」-
     * Decimal类型的精度
     */
    @Override
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.PRECISION</code>. 「precision」-
     * Decimal类型的精度
     */
    @Override
    public MField setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.FORMAT</code>. 「format」-
     * 当前数据列的格式，String或Date类型
     */
    @Override
    public String getFormat() {
        return this.format;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.FORMAT</code>. 「format」-
     * 当前数据列的格式，String或Date类型
     */
    @Override
    public MField setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.IN_COMPONENT</code>. 「inComponent」-
     * 写入插件
     */
    @Override
    public String getInComponent() {
        return this.inComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.IN_COMPONENT</code>. 「inComponent」-
     * 写入插件
     */
    @Override
    public MField setInComponent(String inComponent) {
        this.inComponent = inComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.OUT_COMPONENT</code>. 「outComponent」-
     * 读取插件
     */
    @Override
    public String getOutComponent() {
        return this.outComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.OUT_COMPONENT</code>. 「outComponent」-
     * 读取插件
     */
    @Override
    public MField setOutComponent(String outComponent) {
        this.outComponent = outComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.ENTITY_ID</code>. 「entityId」- 关联的实体ID
     */
    @Override
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.ENTITY_ID</code>. 「entityId」- 关联的实体ID
     */
    @Override
    public MField setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.COMMENTS</code>. 「comments」-
     * 当前属性的描述信息
     */
    @Override
    public String getComments() {
        return this.comments;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.COMMENTS</code>. 「comments」-
     * 当前属性的描述信息
     */
    @Override
    public MField setComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MField setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MField setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MField setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public MField setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MField setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MField setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MField setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_FIELD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.M_FIELD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MField setUpdatedBy(String updatedBy) {
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
        final MField other = (MField) obj;
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
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.columnType == null) {
            if (other.columnType != null)
                return false;
        }
        else if (!this.columnType.equals(other.columnType))
            return false;
        if (this.isPrimary == null) {
            if (other.isPrimary != null)
                return false;
        }
        else if (!this.isPrimary.equals(other.isPrimary))
            return false;
        if (this.isNullable == null) {
            if (other.isNullable != null)
                return false;
        }
        else if (!this.isNullable.equals(other.isNullable))
            return false;
        if (this.length == null) {
            if (other.length != null)
                return false;
        }
        else if (!this.length.equals(other.length))
            return false;
        if (this.precision == null) {
            if (other.precision != null)
                return false;
        }
        else if (!this.precision.equals(other.precision))
            return false;
        if (this.format == null) {
            if (other.format != null)
                return false;
        }
        else if (!this.format.equals(other.format))
            return false;
        if (this.inComponent == null) {
            if (other.inComponent != null)
                return false;
        }
        else if (!this.inComponent.equals(other.inComponent))
            return false;
        if (this.outComponent == null) {
            if (other.outComponent != null)
                return false;
        }
        else if (!this.outComponent.equals(other.outComponent))
            return false;
        if (this.entityId == null) {
            if (other.entityId != null)
                return false;
        }
        else if (!this.entityId.equals(other.entityId))
            return false;
        if (this.comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!this.comments.equals(other.comments))
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
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.columnType == null) ? 0 : this.columnType.hashCode());
        result = prime * result + ((this.isPrimary == null) ? 0 : this.isPrimary.hashCode());
        result = prime * result + ((this.isNullable == null) ? 0 : this.isNullable.hashCode());
        result = prime * result + ((this.length == null) ? 0 : this.length.hashCode());
        result = prime * result + ((this.precision == null) ? 0 : this.precision.hashCode());
        result = prime * result + ((this.format == null) ? 0 : this.format.hashCode());
        result = prime * result + ((this.inComponent == null) ? 0 : this.inComponent.hashCode());
        result = prime * result + ((this.outComponent == null) ? 0 : this.outComponent.hashCode());
        result = prime * result + ((this.entityId == null) ? 0 : this.entityId.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
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
        StringBuilder sb = new StringBuilder("MField (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(columnName);
        sb.append(", ").append(columnType);
        sb.append(", ").append(isPrimary);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(length);
        sb.append(", ").append(precision);
        sb.append(", ").append(format);
        sb.append(", ").append(inComponent);
        sb.append(", ").append(outComponent);
        sb.append(", ").append(entityId);
        sb.append(", ").append(comments);
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
    public void from(IMField from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setColumnName(from.getColumnName());
        setColumnType(from.getColumnType());
        setIsPrimary(from.getIsPrimary());
        setIsNullable(from.getIsNullable());
        setLength(from.getLength());
        setPrecision(from.getPrecision());
        setFormat(from.getFormat());
        setInComponent(from.getInComponent());
        setOutComponent(from.getOutComponent());
        setEntityId(from.getEntityId());
        setComments(from.getComments());
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
    public <E extends IMField> E into(E into) {
        into.from(this);
        return into;
    }
}
