/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IFBook extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    public IFBook setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    public IFBook setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    public IFBook setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    public IFBook setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    public IFBook setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.STATUS</code>. 「status」 - 账本状态
     */
    public IFBook setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.STATUS</code>. 「status」 - 账本状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    public IFBook setMajor(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    public Boolean getMajor();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.AMOUNT</code>. 「amount」-
     * 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    public IFBook setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.AMOUNT</code>. 「amount」-
     * 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    public IFBook setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    public IFBook setChecked(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    public Boolean getChecked();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 -
     * 账本检查描述信息
     */
    public IFBook setCheckedDesc(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 -
     * 账本检查描述信息
     */
    public String getCheckedDesc();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    public IFBook setExceed(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    public Boolean getExceed();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 -
     * 账本加收描述信息
     */
    public IFBook setExceedDesc(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 -
     * 账本加收描述信息
     */
    public String getExceedDesc();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public IFBook setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IFBook setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.PARENT_ID</code>. 「parentId」-
     * 子账本专用，引用父账本ID
     */
    public IFBook setParentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.PARENT_ID</code>. 「parentId」-
     * 子账本专用，引用父账本ID
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public IFBook setOrderId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public String getOrderId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFBook setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFBook setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    public IFBook setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFBook setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFBook setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFBook setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFBook setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFBook setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFBook
     */
    public void from(IFBook from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFBook
     */
    public <E extends IFBook> E into(E into);

    @Override
    public default IFBook fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setSerial, json::getString, "SERIAL", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setStatus, json::getString, "STATUS", "java.lang.String");
        setOrThrow(this::setMajor, json::getBoolean, "MAJOR", "java.lang.Boolean");
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        setOrThrow(this::setChecked, json::getBoolean, "CHECKED", "java.lang.Boolean");
        setOrThrow(this::setCheckedDesc, json::getString, "CHECKED_DESC", "java.lang.String");
        setOrThrow(this::setExceed, json::getBoolean, "EXCEED", "java.lang.Boolean");
        setOrThrow(this::setExceedDesc, json::getString, "EXCEED_DESC", "java.lang.String");
        setOrThrow(this::setModelId, json::getString, "MODEL_ID", "java.lang.String");
        setOrThrow(this::setModelKey, json::getString, "MODEL_KEY", "java.lang.String");
        setOrThrow(this::setParentId, json::getString, "PARENT_ID", "java.lang.String");
        setOrThrow(this::setOrderId, json::getString, "ORDER_ID", "java.lang.String");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
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
        json.put("SERIAL", getSerial());
        json.put("TYPE", getType());
        json.put("STATUS", getStatus());
        json.put("MAJOR", getMajor());
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        json.put("COMMENT", getComment());
        json.put("CHECKED", getChecked());
        json.put("CHECKED_DESC", getCheckedDesc());
        json.put("EXCEED", getExceed());
        json.put("EXCEED_DESC", getExceedDesc());
        json.put("MODEL_ID", getModelId());
        json.put("MODEL_KEY", getModelKey());
        json.put("PARENT_ID", getParentId());
        json.put("ORDER_ID", getOrderId());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("METADATA", getMetadata());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
