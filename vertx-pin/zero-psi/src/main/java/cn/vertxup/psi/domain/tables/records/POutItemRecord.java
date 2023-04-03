/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.records;


import cn.vertxup.psi.domain.tables.POutItem;
import cn.vertxup.psi.domain.tables.interfaces.IPOutItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class POutItemRecord extends UpdatableRecordImpl<POutItemRecord> implements VertxPojo, IPOutItem {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.KEY</code>. 「key」- 出库明细主键
     */
    @Override
    public POutItemRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.KEY</code>. 「key」- 出库明细主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.SERIAL</code>. 「serial」-
     * 出库明细号（系统可用，直接计算）
     */
    @Override
    public POutItemRecord setSerial(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.SERIAL</code>. 「serial」-
     * 出库明细号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public POutItemRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public POutItemRecord setCommodityId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public String getCommodityId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public POutItemRecord setCommodityCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public String getCommodityCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public POutItemRecord setCommodityName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public String getCommodityName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    @Override
    public POutItemRecord setCommodityLogo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    @Override
    public String getCommodityLogo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    @Override
    public POutItemRecord setCustomerId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    @Override
    public String getCustomerId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    @Override
    public POutItemRecord setFromName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    @Override
    public String getFromName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    @Override
    public POutItemRecord setFromCode(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    @Override
    public String getFromCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.TICKET_ID</code>. 「ticketId」-
     * 出库单ID
     */
    @Override
    public POutItemRecord setTicketId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.TICKET_ID</code>. 「ticketId」-
     * 出库单ID
     */
    @Override
    public String getTicketId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.WH_ID</code>. 「whId」- 实际出库仓库
     */
    @Override
    public POutItemRecord setWhId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.WH_ID</code>. 「whId」- 实际出库仓库
     */
    @Override
    public String getWhId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.NUM</code>. 「num」- 实际出库数量
     */
    @Override
    public POutItemRecord setNum(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.NUM</code>. 「num」- 实际出库数量
     */
    @Override
    public Integer getNum() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.AMOUNT</code>. 「amount」-
     * 销售总价（订单总价）
     */
    @Override
    public POutItemRecord setAmount(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.AMOUNT</code>. 「amount」-
     * 销售总价（订单总价）
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.PRICE</code>. 「price」- 销售单价（销售价）
     */
    @Override
    public POutItemRecord setPrice(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.PRICE</code>. 「price」- 销售单价（销售价）
     */
    @Override
    public BigDecimal getPrice() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public POutItemRecord setComment(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public String getComment() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    @Override
    public POutItemRecord setCostPerBasis(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    @Override
    public BigDecimal getCostPerBasis() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    @Override
    public POutItemRecord setCostPer(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    @Override
    public BigDecimal getCostPer() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 出库成本
     */
    @Override
    public POutItemRecord setCostAmount(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 出库成本
     */
    @Override
    public BigDecimal getCostAmount() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public POutItemRecord setDiscountAmount(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public POutItemRecord setDiscountRate(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public BigDecimal getDiscountRate() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public POutItemRecord setActive(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public POutItemRecord setSigma(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public POutItemRecord setMetadata(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public POutItemRecord setLanguage(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public POutItemRecord setCreatedAt(LocalDateTime value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public POutItemRecord setCreatedBy(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public POutItemRecord setUpdatedAt(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_OUT_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public POutItemRecord setUpdatedBy(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_OUT_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IPOutItem from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setStatus(from.getStatus());
        setCommodityId(from.getCommodityId());
        setCommodityCode(from.getCommodityCode());
        setCommodityName(from.getCommodityName());
        setCommodityLogo(from.getCommodityLogo());
        setCustomerId(from.getCustomerId());
        setFromName(from.getFromName());
        setFromCode(from.getFromCode());
        setTicketId(from.getTicketId());
        setWhId(from.getWhId());
        setNum(from.getNum());
        setAmount(from.getAmount());
        setPrice(from.getPrice());
        setComment(from.getComment());
        setCostPerBasis(from.getCostPerBasis());
        setCostPer(from.getCostPer());
        setCostAmount(from.getCostAmount());
        setDiscountAmount(from.getDiscountAmount());
        setDiscountRate(from.getDiscountRate());
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
    public <E extends IPOutItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached POutItemRecord
     */
    public POutItemRecord() {
        super(POutItem.P_OUT_ITEM);
    }

    /**
     * Create a detached, initialised POutItemRecord
     */
    public POutItemRecord(String key, String serial, String status, String commodityId, String commodityCode, String commodityName, String commodityLogo, String customerId, String fromName, String fromCode, String ticketId, String whId, Integer num, BigDecimal amount, BigDecimal price, String comment, BigDecimal costPerBasis, BigDecimal costPer, BigDecimal costAmount, BigDecimal discountAmount, BigDecimal discountRate, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(POutItem.P_OUT_ITEM);

        setKey(key);
        setSerial(serial);
        setStatus(status);
        setCommodityId(commodityId);
        setCommodityCode(commodityCode);
        setCommodityName(commodityName);
        setCommodityLogo(commodityLogo);
        setCustomerId(customerId);
        setFromName(fromName);
        setFromCode(fromCode);
        setTicketId(ticketId);
        setWhId(whId);
        setNum(num);
        setAmount(amount);
        setPrice(price);
        setComment(comment);
        setCostPerBasis(costPerBasis);
        setCostPer(costPer);
        setCostAmount(costAmount);
        setDiscountAmount(discountAmount);
        setDiscountRate(discountRate);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised POutItemRecord
     */
    public POutItemRecord(cn.vertxup.psi.domain.tables.pojos.POutItem value) {
        super(POutItem.P_OUT_ITEM);

        if (value != null) {
            setKey(value.getKey());
            setSerial(value.getSerial());
            setStatus(value.getStatus());
            setCommodityId(value.getCommodityId());
            setCommodityCode(value.getCommodityCode());
            setCommodityName(value.getCommodityName());
            setCommodityLogo(value.getCommodityLogo());
            setCustomerId(value.getCustomerId());
            setFromName(value.getFromName());
            setFromCode(value.getFromCode());
            setTicketId(value.getTicketId());
            setWhId(value.getWhId());
            setNum(value.getNum());
            setAmount(value.getAmount());
            setPrice(value.getPrice());
            setComment(value.getComment());
            setCostPerBasis(value.getCostPerBasis());
            setCostPer(value.getCostPer());
            setCostAmount(value.getCostAmount());
            setDiscountAmount(value.getDiscountAmount());
            setDiscountRate(value.getDiscountRate());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public POutItemRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
