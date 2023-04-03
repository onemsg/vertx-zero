/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.pojos;


import cn.vertxup.psi.domain.tables.interfaces.IPPos;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PPos implements VertxPojo, IPPos {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String type;
    private String status;
    private String whId;
    private Boolean direct;
    private Long capacity;
    private Long capacityExceed;
    private String limitType;
    private String limitRule;
    private Integer posRow;
    private Integer posColumn;
    private Integer posHeight;
    private String posTags;
    private String posTrace;
    private String comment;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public PPos() {}

    public PPos(IPPos value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.whId = value.getWhId();
        this.direct = value.getDirect();
        this.capacity = value.getCapacity();
        this.capacityExceed = value.getCapacityExceed();
        this.limitType = value.getLimitType();
        this.limitRule = value.getLimitRule();
        this.posRow = value.getPosRow();
        this.posColumn = value.getPosColumn();
        this.posHeight = value.getPosHeight();
        this.posTags = value.getPosTags();
        this.posTrace = value.getPosTrace();
        this.comment = value.getComment();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public PPos(
        String key,
        String name,
        String code,
        String type,
        String status,
        String whId,
        Boolean direct,
        Long capacity,
        Long capacityExceed,
        String limitType,
        String limitRule,
        Integer posRow,
        Integer posColumn,
        Integer posHeight,
        String posTags,
        String posTrace,
        String comment,
        Boolean active,
        String sigma,
        String metadata,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.status = status;
        this.whId = whId;
        this.direct = direct;
        this.capacity = capacity;
        this.capacityExceed = capacityExceed;
        this.limitType = limitType;
        this.limitRule = limitRule;
        this.posRow = posRow;
        this.posColumn = posColumn;
        this.posHeight = posHeight;
        this.posTags = posTags;
        this.posTrace = posTrace;
        this.comment = comment;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public PPos(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.KEY</code>. 「key」- 仓位主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.KEY</code>. 「key」- 仓位主键
     */
    @Override
    public PPos setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.NAME</code>. 「name」- 仓位名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.NAME</code>. 「name」- 仓位名称
     */
    @Override
    public PPos setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CODE</code>. 「code」- 仓位编号（系统可用）
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CODE</code>. 「code」- 仓位编号（系统可用）
     */
    @Override
    public PPos setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.TYPE</code>. 「type」- 仓位类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.TYPE</code>. 「type」- 仓位类型
     */
    @Override
    public PPos setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.STATUS</code>. 「status」- 仓位状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.STATUS</code>. 「status」- 仓位状态
     */
    @Override
    public PPos setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.WH_ID</code>. 「whId」- 所属仓库信息
     */
    @Override
    public String getWhId() {
        return this.whId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.WH_ID</code>. 「whId」- 所属仓库信息
     */
    @Override
    public PPos setWhId(String whId) {
        this.whId = whId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.DIRECT</code>. 「direct」- 直接仓位，1对1
     */
    @Override
    public Boolean getDirect() {
        return this.direct;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.DIRECT</code>. 「direct」- 直接仓位，1对1
     */
    @Override
    public PPos setDirect(Boolean direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CAPACITY</code>. 「capacity」- 仓位容量
     */
    @Override
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CAPACITY</code>. 「capacity」- 仓位容量
     */
    @Override
    public PPos setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CAPACITY_EXCEED</code>.
     * 「capacityExceed」- 仓位超容部分
     */
    @Override
    public Long getCapacityExceed() {
        return this.capacityExceed;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CAPACITY_EXCEED</code>.
     * 「capacityExceed」- 仓位超容部分
     */
    @Override
    public PPos setCapacityExceed(Long capacityExceed) {
        this.capacityExceed = capacityExceed;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.LIMIT_TYPE</code>. 「limitType」- 仓位类型限制
     */
    @Override
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.LIMIT_TYPE</code>. 「limitType」- 仓位类型限制
     */
    @Override
    public PPos setLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.LIMIT_RULE</code>. 「limitRule」- 仓位限制规则
     */
    @Override
    public String getLimitRule() {
        return this.limitRule;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.LIMIT_RULE</code>. 「limitRule」- 仓位限制规则
     */
    @Override
    public PPos setLimitRule(String limitRule) {
        this.limitRule = limitRule;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_ROW</code>. 「posRow」- 行维度
     */
    @Override
    public Integer getPosRow() {
        return this.posRow;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_ROW</code>. 「posRow」- 行维度
     */
    @Override
    public PPos setPosRow(Integer posRow) {
        this.posRow = posRow;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_COLUMN</code>. 「posColumn」- 列维度
     */
    @Override
    public Integer getPosColumn() {
        return this.posColumn;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_COLUMN</code>. 「posColumn」- 列维度
     */
    @Override
    public PPos setPosColumn(Integer posColumn) {
        this.posColumn = posColumn;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_HEIGHT</code>. 「posHeight」- 高维度
     */
    @Override
    public Integer getPosHeight() {
        return this.posHeight;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_HEIGHT</code>. 「posHeight」- 高维度
     */
    @Override
    public PPos setPosHeight(Integer posHeight) {
        this.posHeight = posHeight;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_TAGS</code>. 「posTags」- 标签，横切维度位置管理
     */
    @Override
    public String getPosTags() {
        return this.posTags;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_TAGS</code>. 「posTags」- 标签，横切维度位置管理
     */
    @Override
    public PPos setPosTags(String posTags) {
        this.posTags = posTags;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_TRACE</code>. 「posTrace」- 空间位置描述
     */
    @Override
    public String getPosTrace() {
        return this.posTrace;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_TRACE</code>. 「posTrace」- 空间位置描述
     */
    @Override
    public PPos setPosTrace(String posTrace) {
        this.posTrace = posTrace;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.COMMENT</code>. 「comment」- 仓库备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.COMMENT</code>. 「comment」- 仓库备注
     */
    @Override
    public PPos setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PPos setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PPos setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PPos setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PPos setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public PPos setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public PPos setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public PPos setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public PPos setUpdatedBy(String updatedBy) {
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
        final PPos other = (PPos) obj;
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
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.whId == null) {
            if (other.whId != null)
                return false;
        }
        else if (!this.whId.equals(other.whId))
            return false;
        if (this.direct == null) {
            if (other.direct != null)
                return false;
        }
        else if (!this.direct.equals(other.direct))
            return false;
        if (this.capacity == null) {
            if (other.capacity != null)
                return false;
        }
        else if (!this.capacity.equals(other.capacity))
            return false;
        if (this.capacityExceed == null) {
            if (other.capacityExceed != null)
                return false;
        }
        else if (!this.capacityExceed.equals(other.capacityExceed))
            return false;
        if (this.limitType == null) {
            if (other.limitType != null)
                return false;
        }
        else if (!this.limitType.equals(other.limitType))
            return false;
        if (this.limitRule == null) {
            if (other.limitRule != null)
                return false;
        }
        else if (!this.limitRule.equals(other.limitRule))
            return false;
        if (this.posRow == null) {
            if (other.posRow != null)
                return false;
        }
        else if (!this.posRow.equals(other.posRow))
            return false;
        if (this.posColumn == null) {
            if (other.posColumn != null)
                return false;
        }
        else if (!this.posColumn.equals(other.posColumn))
            return false;
        if (this.posHeight == null) {
            if (other.posHeight != null)
                return false;
        }
        else if (!this.posHeight.equals(other.posHeight))
            return false;
        if (this.posTags == null) {
            if (other.posTags != null)
                return false;
        }
        else if (!this.posTags.equals(other.posTags))
            return false;
        if (this.posTrace == null) {
            if (other.posTrace != null)
                return false;
        }
        else if (!this.posTrace.equals(other.posTrace))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
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
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.whId == null) ? 0 : this.whId.hashCode());
        result = prime * result + ((this.direct == null) ? 0 : this.direct.hashCode());
        result = prime * result + ((this.capacity == null) ? 0 : this.capacity.hashCode());
        result = prime * result + ((this.capacityExceed == null) ? 0 : this.capacityExceed.hashCode());
        result = prime * result + ((this.limitType == null) ? 0 : this.limitType.hashCode());
        result = prime * result + ((this.limitRule == null) ? 0 : this.limitRule.hashCode());
        result = prime * result + ((this.posRow == null) ? 0 : this.posRow.hashCode());
        result = prime * result + ((this.posColumn == null) ? 0 : this.posColumn.hashCode());
        result = prime * result + ((this.posHeight == null) ? 0 : this.posHeight.hashCode());
        result = prime * result + ((this.posTags == null) ? 0 : this.posTags.hashCode());
        result = prime * result + ((this.posTrace == null) ? 0 : this.posTrace.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PPos (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(whId);
        sb.append(", ").append(direct);
        sb.append(", ").append(capacity);
        sb.append(", ").append(capacityExceed);
        sb.append(", ").append(limitType);
        sb.append(", ").append(limitRule);
        sb.append(", ").append(posRow);
        sb.append(", ").append(posColumn);
        sb.append(", ").append(posHeight);
        sb.append(", ").append(posTags);
        sb.append(", ").append(posTrace);
        sb.append(", ").append(comment);
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
    public void from(IPPos from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setWhId(from.getWhId());
        setDirect(from.getDirect());
        setCapacity(from.getCapacity());
        setCapacityExceed(from.getCapacityExceed());
        setLimitType(from.getLimitType());
        setLimitRule(from.getLimitRule());
        setPosRow(from.getPosRow());
        setPosColumn(from.getPosColumn());
        setPosHeight(from.getPosHeight());
        setPosTags(from.getPosTags());
        setPosTrace(from.getPosTrace());
        setComment(from.getComment());
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
    public <E extends IPPos> E into(E into) {
        into.from(this);
        return into;
    }
}
