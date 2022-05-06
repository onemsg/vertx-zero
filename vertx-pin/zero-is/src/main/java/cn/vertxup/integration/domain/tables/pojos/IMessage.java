/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.pojos;


import cn.vertxup.integration.domain.tables.interfaces.IIMessage;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IMessage implements VertxPojo, IIMessage {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String type;
    private String status;
    private String subject;
    private String content;
    private String from;
    private String to;
    private String sendBy;
    private String sendAt;
    private String appId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IMessage() {
    }

    public IMessage(IIMessage value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.subject = value.getSubject();
        this.content = value.getContent();
        this.from = value.getFrom();
        this.to = value.getTo();
        this.sendBy = value.getSendBy();
        this.sendAt = value.getSendAt();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public IMessage(
        String key,
        String name,
        String code,
        String type,
        String status,
        String subject,
        String content,
        String from,
        String to,
        String sendBy,
        String sendAt,
        String appId,
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
        this.subject = subject;
        this.content = content;
        this.from = from;
        this.to = to;
        this.sendBy = sendBy;
        this.sendAt = sendAt;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public IMessage(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    @Override
    public IMessage setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    @Override
    public IMessage setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    @Override
    public IMessage setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    @Override
    public IMessage setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    @Override
    public IMessage setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    @Override
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    @Override
    public IMessage setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    @Override
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    @Override
    public IMessage setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.FROM</code>. 「from」- 消息发送方
     */
    @Override
    public String getFrom() {
        return this.from;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.FROM</code>. 「from」- 消息发送方
     */
    @Override
    public IMessage setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.TO</code>. 「to」- 消息接收方
     */
    @Override
    public String getTo() {
        return this.to;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.TO</code>. 「to」- 消息接收方
     */
    @Override
    public IMessage setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    @Override
    public String getSendBy() {
        return this.sendBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    @Override
    public IMessage setSendBy(String sendBy) {
        this.sendBy = sendBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    @Override
    public String getSendAt() {
        return this.sendAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    @Override
    public IMessage setSendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public IMessage setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IMessage setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IMessage setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public IMessage setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public IMessage setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public IMessage setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public IMessage setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public IMessage setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public IMessage setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IMessage (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(subject);
        sb.append(", ").append(content);
        sb.append(", ").append(from);
        sb.append(", ").append(to);
        sb.append(", ").append(sendBy);
        sb.append(", ").append(sendAt);
        sb.append(", ").append(appId);
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
    public void from(IIMessage from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setSubject(from.getSubject());
        setContent(from.getContent());
        setFrom(from.getFrom());
        setTo(from.getTo());
        setSendBy(from.getSendBy());
        setSendAt(from.getSendAt());
        setAppId(from.getAppId());
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
    public <E extends IIMessage> E into(E into) {
        into.from(this);
        return into;
    }
}
