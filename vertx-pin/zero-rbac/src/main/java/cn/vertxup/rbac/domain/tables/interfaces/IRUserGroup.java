/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IRUserGroup extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.R_USER_GROUP.GROUP_ID</code>. 「groupId」-
     * 关联组ID
     */
    public IRUserGroup setGroupId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_USER_GROUP.GROUP_ID</code>. 「groupId」-
     * 关联组ID
     */
    public String getGroupId();

    /**
     * Setter for <code>DB_ETERNAL.R_USER_GROUP.USER_ID</code>. 「userId」- 关联用户ID
     */
    public IRUserGroup setUserId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_USER_GROUP.USER_ID</code>. 「userId」- 关联用户ID
     */
    public String getUserId();

    /**
     * Setter for <code>DB_ETERNAL.R_USER_GROUP.PRIORITY</code>. 「priority」-
     * 组优先级
     */
    public IRUserGroup setPriority(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.R_USER_GROUP.PRIORITY</code>. 「priority」-
     * 组优先级
     */
    public Integer getPriority();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IRUserGroup
     */
    public void from(IRUserGroup from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IRUserGroup
     */
    public <E extends IRUserGroup> E into(E into);

    @Override
    public default IRUserGroup fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setGroupId, json::getString, "GROUP_ID", "java.lang.String");
        setOrThrow(this::setUserId, json::getString, "USER_ID", "java.lang.String");
        setOrThrow(this::setPriority, json::getInteger, "PRIORITY", "java.lang.Integer");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("GROUP_ID", getGroupId());
        json.put("USER_ID", getUserId());
        json.put("PRIORITY", getPriority());
        return json;
    }

}
