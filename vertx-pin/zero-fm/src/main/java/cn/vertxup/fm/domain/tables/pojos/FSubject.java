/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.pojos;


import cn.vertxup.fm.domain.tables.interfaces.IFSubject;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FSubject implements VertxPojo, IFSubject {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String serial;
    private String category;
    private String helpCode;
    private String comment;
    private String owner;
    private String companyId;
    private String parentId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FSubject() {}

    public FSubject(IFSubject value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.category = value.getCategory();
        this.helpCode = value.getHelpCode();
        this.comment = value.getComment();
        this.owner = value.getOwner();
        this.companyId = value.getCompanyId();
        this.parentId = value.getParentId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FSubject(
        String key,
        String name,
        String code,
        String serial,
        String category,
        String helpCode,
        String comment,
        String owner,
        String companyId,
        String parentId,
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
        this.code = code;
        this.serial = serial;
        this.category = category;
        this.helpCode = helpCode;
        this.comment = comment;
        this.owner = owner;
        this.companyId = companyId;
        this.parentId = parentId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public FSubject(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.KEY</code>. 「key」- 会计科目ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.KEY</code>. 「key」- 会计科目ID
     */
    @Override
    public FSubject setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.NAME</code>. 「name」 -  会计科目名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.NAME</code>. 「name」 -  会计科目名称
     */
    @Override
    public FSubject setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CODE</code>. 「code」 - 会计科目系统编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CODE</code>. 「code」 - 会计科目系统编号
     */
    @Override
    public FSubject setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.SERIAL</code>. 「serial」 - 会计科目编号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.SERIAL</code>. 「serial」 - 会计科目编号
     */
    @Override
    public FSubject setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CATEGORY</code>. 「category」 -
     * 会计科目关联类别，直接对接类型树
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CATEGORY</code>. 「category」 -
     * 会计科目关联类别，直接对接类型树
     */
    @Override
    public FSubject setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.HELP_CODE</code>. 「helpCode」-
     * 会计科目助记码
     */
    @Override
    public String getHelpCode() {
        return this.helpCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.HELP_CODE</code>. 「helpCode」-
     * 会计科目助记码
     */
    @Override
    public FSubject setHelpCode(String helpCode) {
        this.helpCode = helpCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.COMMENT</code>. 「comment」 - 会计科目备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.COMMENT</code>. 「comment」 - 会计科目备注
     */
    @Override
    public FSubject setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.OWNER</code>. 「owner」- 科目方向：OUT-借方
     * / IN-贷方
     */
    @Override
    public String getOwner() {
        return this.owner;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.OWNER</code>. 「owner」- 科目方向：OUT-借方
     * / IN-贷方
     */
    @Override
    public FSubject setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.COMPANY_ID</code>. 「companyId」-
     * 会计科目所属公司
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.COMPANY_ID</code>. 「companyId」-
     * 会计科目所属公司
     */
    @Override
    public FSubject setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.PARENT_ID</code>. 「parentId」-
     * 会计科目父科目
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.PARENT_ID</code>. 「parentId」-
     * 会计科目父科目
     */
    @Override
    public FSubject setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSubject setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FSubject setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FSubject setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FSubject setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public FSubject setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FSubject setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public FSubject setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FSubject setUpdatedBy(String updatedBy) {
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
        final FSubject other = (FSubject) obj;
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
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.serial == null) {
            if (other.serial != null)
                return false;
        }
        else if (!this.serial.equals(other.serial))
            return false;
        if (this.category == null) {
            if (other.category != null)
                return false;
        }
        else if (!this.category.equals(other.category))
            return false;
        if (this.helpCode == null) {
            if (other.helpCode != null)
                return false;
        }
        else if (!this.helpCode.equals(other.helpCode))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.owner == null) {
            if (other.owner != null)
                return false;
        }
        else if (!this.owner.equals(other.owner))
            return false;
        if (this.companyId == null) {
            if (other.companyId != null)
                return false;
        }
        else if (!this.companyId.equals(other.companyId))
            return false;
        if (this.parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!this.parentId.equals(other.parentId))
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
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.serial == null) ? 0 : this.serial.hashCode());
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
        result = prime * result + ((this.helpCode == null) ? 0 : this.helpCode.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.owner == null) ? 0 : this.owner.hashCode());
        result = prime * result + ((this.companyId == null) ? 0 : this.companyId.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
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
        StringBuilder sb = new StringBuilder("FSubject (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(category);
        sb.append(", ").append(helpCode);
        sb.append(", ").append(comment);
        sb.append(", ").append(owner);
        sb.append(", ").append(companyId);
        sb.append(", ").append(parentId);
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
    public void from(IFSubject from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setCategory(from.getCategory());
        setHelpCode(from.getHelpCode());
        setComment(from.getComment());
        setOwner(from.getOwner());
        setCompanyId(from.getCompanyId());
        setParentId(from.getParentId());
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
    public <E extends IFSubject> E into(E into) {
        into.from(this);
        return into;
    }
}
