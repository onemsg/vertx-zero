/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXActivity extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.KEY</code>. 「key」- 操作行为主键
     */
    public IXActivity setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.KEY</code>. 「key」- 操作行为主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.TYPE</code>. 「type」- 操作类型
     */
    public IXActivity setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.TYPE</code>. 「type」- 操作类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.SERIAL</code>. 「serial」- 变更记录号
     */
    public IXActivity setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.SERIAL</code>. 「serial」- 变更记录号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.DESCRIPTION</code>. 「description」-
     * 操作描述信息
     */
    public IXActivity setDescription(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.DESCRIPTION</code>. 「description」-
     * 操作描述信息
     */
    public String getDescription();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    public IXActivity setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IXActivity setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public IXActivity setModelCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public String getModelCategory();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.TASK_NAME</code>. 「taskName」- 任务名称
     */
    public IXActivity setTaskName(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.TASK_NAME</code>. 「taskName」- 任务名称
     */
    public String getTaskName();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.TASK_SERIAL</code>. 「taskSerial」-
     * 任务单号
     */
    public IXActivity setTaskSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.TASK_SERIAL</code>. 「taskSerial」-
     * 任务单号
     */
    public String getTaskSerial();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.RECORD_OLD</code>. 「recordOld」-
     * 变更之前的数据（用于回滚）
     */
    public IXActivity setRecordOld(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.RECORD_OLD</code>. 「recordOld」-
     * 变更之前的数据（用于回滚）
     */
    public String getRecordOld();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.RECORD_NEW</code>. 「recordNew」-
     * 变更之后的数据（用于更新）
     */
    public IXActivity setRecordNew(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.RECORD_NEW</code>. 「recordNew」-
     * 变更之后的数据（用于更新）
     */
    public String getRecordNew();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public IXActivity setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXActivity setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.ACTIVE</code>. 「active」- 是否启用
     */
    public IXActivity setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public IXActivity setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IXActivity setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IXActivity setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IXActivity setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_ACTIVITY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IXActivity setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_ACTIVITY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXActivity
     */
    public void from(IXActivity from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXActivity
     */
    public <E extends IXActivity> E into(E into);

        @Override
        public default IXActivity fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                setOrThrow(this::setDescription,json::getString,"DESCRIPTION","java.lang.String");
                setOrThrow(this::setModelId,json::getString,"MODEL_ID","java.lang.String");
                setOrThrow(this::setModelKey,json::getString,"MODEL_KEY","java.lang.String");
                setOrThrow(this::setModelCategory,json::getString,"MODEL_CATEGORY","java.lang.String");
                setOrThrow(this::setTaskName,json::getString,"TASK_NAME","java.lang.String");
                setOrThrow(this::setTaskSerial,json::getString,"TASK_SERIAL","java.lang.String");
                setOrThrow(this::setRecordOld,json::getString,"RECORD_OLD","java.lang.String");
                setOrThrow(this::setRecordNew,json::getString,"RECORD_NEW","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("TYPE",getType());
                json.put("SERIAL",getSerial());
                json.put("DESCRIPTION",getDescription());
                json.put("MODEL_ID",getModelId());
                json.put("MODEL_KEY",getModelKey());
                json.put("MODEL_CATEGORY",getModelCategory());
                json.put("TASK_NAME",getTaskName());
                json.put("TASK_SERIAL",getTaskSerial());
                json.put("RECORD_OLD",getRecordOld());
                json.put("RECORD_NEW",getRecordNew());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
