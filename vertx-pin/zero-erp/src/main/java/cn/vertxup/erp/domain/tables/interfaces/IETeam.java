/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IETeam extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.KEY</code>. 「key」- 组主键
     */
    public IETeam setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.KEY</code>. 「key」- 组主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.NAME</code>. 「name」- 组名称
     */
    public IETeam setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.NAME</code>. 「name」- 组名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CODE</code>. 「code」- 组编号
     */
    public IETeam setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CODE</code>. 「code」- 组编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    public IETeam setLeaderId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    public String getLeaderId();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    public IETeam setLeaderName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    public String getLeaderName();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public IETeam setDeptId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public String getDeptId();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    public IETeam setTeamId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    public String getTeamId();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    public IETeam setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.BIND_ID</code>. 「bindId」-
     * 绑定用户组ID,安全专用处理
     */
    public IETeam setBindId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.BIND_ID</code>. 「bindId」-
     * 绑定用户组ID,安全专用处理
     */
    public String getBindId();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.BIND_COMPONENT</code>.
     * 「bindComponent」- 绑定扩展组件
     */
    public IETeam setBindComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.BIND_COMPONENT</code>.
     * 「bindComponent」- 绑定扩展组件
     */
    public String getBindComponent();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.BIND_CONFIG</code>. 「bindConfig」-
     * 绑定JSON详细配置
     */
    public IETeam setBindConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.BIND_CONFIG</code>. 「bindConfig」-
     * 绑定JSON详细配置
     */
    public String getBindConfig();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    public IETeam setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    public IETeam setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    public IETeam setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IETeam setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IETeam setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IETeam setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IETeam setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IETeam setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IETeam
     */
    public void from(IETeam from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IETeam
     */
    public <E extends IETeam> E into(E into);

        @Override
        public default IETeam fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setLeaderId,json::getString,"LEADER_ID","java.lang.String");
                setOrThrow(this::setLeaderName,json::getString,"LEADER_NAME","java.lang.String");
                setOrThrow(this::setDeptId,json::getString,"DEPT_ID","java.lang.String");
                setOrThrow(this::setTeamId,json::getString,"TEAM_ID","java.lang.String");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setBindId,json::getString,"BIND_ID","java.lang.String");
                setOrThrow(this::setBindComponent,json::getString,"BIND_COMPONENT","java.lang.String");
                setOrThrow(this::setBindConfig,json::getString,"BIND_CONFIG","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("LEADER_ID",getLeaderId());
                json.put("LEADER_NAME",getLeaderName());
                json.put("DEPT_ID",getDeptId());
                json.put("TEAM_ID",getTeamId());
                json.put("COMMENT",getComment());
                json.put("BIND_ID",getBindId());
                json.put("BIND_COMPONENT",getBindComponent());
                json.put("BIND_CONFIG",getBindConfig());
                json.put("METADATA",getMetadata());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
