/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IMJoin extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.MODEL</code>. 「model」- 模型identifier
     */
    public IMJoin setModel(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.MODEL</code>. 「model」- 模型identifier
     */
    public String getModel();

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.ENTITY</code>. 「entity」- 实体identifier
     */
    public IMJoin setEntity(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.ENTITY</code>. 「entity」- 实体identifier
     */
    public String getEntity();

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.ENTITY_KEY</code>. 「entityKey」-
     * 实体主键字段名
     */
    public IMJoin setEntityKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.ENTITY_KEY</code>. 「entityKey」-
     * 实体主键字段名
     */
    public String getEntityKey();

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.PRIORITY</code>. 「priority」- 优先级
     */
    public IMJoin setPriority(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.PRIORITY</code>. 「priority」- 优先级
     */
    public Integer getPriority();

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.NAMESPACE</code>. 「namespace」-
     * 名空间（和App绑定的）
     */
    public IMJoin setNamespace(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.NAMESPACE</code>. 「namespace」-
     * 名空间（和App绑定的）
     */
    public String getNamespace();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IMJoin
     */
    public void from(IMJoin from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IMJoin
     */
    public <E extends IMJoin> E into(E into);

        @Override
        public default IMJoin fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setModel,json::getString,"MODEL","java.lang.String");
                setOrThrow(this::setEntity,json::getString,"ENTITY","java.lang.String");
                setOrThrow(this::setEntityKey,json::getString,"ENTITY_KEY","java.lang.String");
                setOrThrow(this::setPriority,json::getInteger,"PRIORITY","java.lang.Integer");
                setOrThrow(this::setNamespace,json::getString,"NAMESPACE","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("MODEL",getModel());
                json.put("ENTITY",getEntity());
                json.put("ENTITY_KEY",getEntityKey());
                json.put("PRIORITY",getPriority());
                json.put("NAMESPACE",getNamespace());
                return json;
        }

}
