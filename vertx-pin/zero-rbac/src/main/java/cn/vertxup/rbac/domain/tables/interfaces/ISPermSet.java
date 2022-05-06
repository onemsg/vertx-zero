/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ISPermSet extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.KEY</code>. 「key」- 权限集ID
     */
    public ISPermSet setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.KEY</code>. 「key」- 权限集ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.NAME</code>. 「name」- 权限集名称
     */
    public ISPermSet setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.NAME</code>. 「name」- 权限集名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.CODE</code>. 「code」- 权限集关联权限代码
     */
    public ISPermSet setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.CODE</code>. 「code」- 权限集关联权限代码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.TYPE</code>. 「type」- 权限集类型
     */
    public ISPermSet setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.TYPE</code>. 「type」- 权限集类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.SIGMA</code>. 「sigma」- 绑定的统一标识
     */
    public ISPermSet setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.SIGMA</code>. 「sigma」- 绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISPermSet setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.ACTIVE</code>. 「active」- 是否启用
     */
    public ISPermSet setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.COMMENT</code>. 「comment」- 权限集说明
     */
    public ISPermSet setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.COMMENT</code>. 「comment」- 权限集说明
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public ISPermSet setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public ISPermSet setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public ISPermSet setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public ISPermSet setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PERM_SET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public ISPermSet setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PERM_SET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISPermSet
     */
    public void from(ISPermSet from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISPermSet
     */
    public <E extends ISPermSet> E into(E into);

    @Override
    public default ISPermSet fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setCreatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "CREATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setCreatedBy, json::getString, "CREATED_BY", "java.lang.String");
        setOrThrow(this::setUpdatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "UPDATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setUpdatedBy, json::getString, "UPDATED_BY", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("NAME", getName());
        json.put("CODE", getCode());
        json.put("TYPE", getType());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("COMMENT", getComment());
        json.put("METADATA", getMetadata());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
