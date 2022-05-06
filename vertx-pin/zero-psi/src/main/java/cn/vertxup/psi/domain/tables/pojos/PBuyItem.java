/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.pojos;


import cn.vertxup.psi.domain.tables.interfaces.IPBuyItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PBuyItem implements VertxPojo, IPBuyItem {

    private static final long serialVersionUID = 1L;

    private String key;
    private String serial;
    private String status;
    private String commodityId;
    private String commodityCode;
    private String commodityName;
    private String customerId;
    private String ticketId;
    private String orderId;
    private Integer numRequest;
    private Integer numApproved;
    private Integer num;
    private BigDecimal taxRate;
    private BigDecimal taxAmount;
    private BigDecimal taxPrice;
    private BigDecimal amountTotal;
    private BigDecimal amountSplit;
    private BigDecimal amount;
    private BigDecimal price;
    private BigDecimal discountAmount;
    private BigDecimal discountRate;
    private String comment;
    private LocalDateTime arriveAt;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public PBuyItem() {
    }

    public PBuyItem(IPBuyItem value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.status = value.getStatus();
        this.commodityId = value.getCommodityId();
        this.commodityCode = value.getCommodityCode();
        this.commodityName = value.getCommodityName();
        this.customerId = value.getCustomerId();
        this.ticketId = value.getTicketId();
        this.orderId = value.getOrderId();
        this.numRequest = value.getNumRequest();
        this.numApproved = value.getNumApproved();
        this.num = value.getNum();
        this.taxRate = value.getTaxRate();
        this.taxAmount = value.getTaxAmount();
        this.taxPrice = value.getTaxPrice();
        this.amountTotal = value.getAmountTotal();
        this.amountSplit = value.getAmountSplit();
        this.amount = value.getAmount();
        this.price = value.getPrice();
        this.discountAmount = value.getDiscountAmount();
        this.discountRate = value.getDiscountRate();
        this.comment = value.getComment();
        this.arriveAt = value.getArriveAt();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public PBuyItem(
        String key,
        String serial,
        String status,
        String commodityId,
        String commodityCode,
        String commodityName,
        String customerId,
        String ticketId,
        String orderId,
        Integer numRequest,
        Integer numApproved,
        Integer num,
        BigDecimal taxRate,
        BigDecimal taxAmount,
        BigDecimal taxPrice,
        BigDecimal amountTotal,
        BigDecimal amountSplit,
        BigDecimal amount,
        BigDecimal price,
        BigDecimal discountAmount,
        BigDecimal discountRate,
        String comment,
        LocalDateTime arriveAt,
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
        this.serial = serial;
        this.status = status;
        this.commodityId = commodityId;
        this.commodityCode = commodityCode;
        this.commodityName = commodityName;
        this.customerId = customerId;
        this.ticketId = ticketId;
        this.orderId = orderId;
        this.numRequest = numRequest;
        this.numApproved = numApproved;
        this.num = num;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
        this.taxPrice = taxPrice;
        this.amountTotal = amountTotal;
        this.amountSplit = amountSplit;
        this.amount = amount;
        this.price = price;
        this.discountAmount = discountAmount;
        this.discountRate = discountRate;
        this.comment = comment;
        this.arriveAt = arriveAt;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public PBuyItem(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.KEY</code>. 「key」- 采购明细主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.KEY</code>. 「key」- 采购明细主键
     */
    @Override
    public PBuyItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.SERIAL</code>. 「serial」-
     * 采购单号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.SERIAL</code>. 「serial」-
     * 采购单号（系统可用，直接计算）
     */
    @Override
    public PBuyItem setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public PBuyItem setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public String getCommodityId() {
        return this.commodityId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public PBuyItem setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public PBuyItem setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public String getCommodityName() {
        return this.commodityName;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public PBuyItem setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 建议供应商
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 建议供应商
     */
    @Override
    public PBuyItem setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TICKET_ID</code>. 「ticketId」-
     * 采购申请ID
     */
    @Override
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TICKET_ID</code>. 「ticketId」-
     * 采购申请ID
     */
    @Override
    public PBuyItem setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.ORDER_ID</code>. 「orderId」- 采购订单ID
     */
    @Override
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.ORDER_ID</code>. 「orderId」- 采购订单ID
     */
    @Override
    public PBuyItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_REQUEST</code>. 「numRequest」-
     * 申请数量
     */
    @Override
    public Integer getNumRequest() {
        return this.numRequest;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_REQUEST</code>. 「numRequest」-
     * 申请数量
     */
    @Override
    public PBuyItem setNumRequest(Integer numRequest) {
        this.numRequest = numRequest;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_APPROVED</code>.
     * 「numApproved」- 审批数量
     */
    @Override
    public Integer getNumApproved() {
        return this.numApproved;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_APPROVED</code>.
     * 「numApproved」- 审批数量
     */
    @Override
    public PBuyItem setNumApproved(Integer numApproved) {
        this.numApproved = numApproved;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.NUM</code>. 「num」- 实际采购数量（订单中）
     */
    @Override
    public Integer getNum() {
        return this.num;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.NUM</code>. 「num」- 实际采购数量（订单中）
     */
    @Override
    public PBuyItem setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public PBuyItem setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public PBuyItem setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public BigDecimal getTaxPrice() {
        return this.taxPrice;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public PBuyItem setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」- 税价合计
     */
    @Override
    public BigDecimal getAmountTotal() {
        return this.amountTotal;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」- 税价合计
     */
    @Override
    public PBuyItem setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_SPLIT</code>.
     * 「amountSplit」- 采购分摊费用
     */
    @Override
    public BigDecimal getAmountSplit() {
        return this.amountSplit;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_SPLIT</code>.
     * 「amountSplit」- 采购分摊费用
     */
    @Override
    public PBuyItem setAmountSplit(BigDecimal amountSplit) {
        this.amountSplit = amountSplit;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT</code>. 「amount」-
     * 采购总价（订单总价）
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT</code>. 「amount」-
     * 采购总价（订单总价）
     */
    @Override
    public PBuyItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public PBuyItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public PBuyItem setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public BigDecimal getDiscountRate() {
        return this.discountRate;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public PBuyItem setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public PBuyItem setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.ARRIVE_AT</code>. 「arriveAt」-
     * 预计到货时间
     */
    @Override
    public LocalDateTime getArriveAt() {
        return this.arriveAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.ARRIVE_AT</code>. 「arriveAt」-
     * 预计到货时间
     */
    @Override
    public PBuyItem setArriveAt(LocalDateTime arriveAt) {
        this.arriveAt = arriveAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PBuyItem setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PBuyItem setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PBuyItem setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PBuyItem setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public PBuyItem setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public PBuyItem setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public PBuyItem setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public PBuyItem setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PBuyItem (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(status);
        sb.append(", ").append(commodityId);
        sb.append(", ").append(commodityCode);
        sb.append(", ").append(commodityName);
        sb.append(", ").append(customerId);
        sb.append(", ").append(ticketId);
        sb.append(", ").append(orderId);
        sb.append(", ").append(numRequest);
        sb.append(", ").append(numApproved);
        sb.append(", ").append(num);
        sb.append(", ").append(taxRate);
        sb.append(", ").append(taxAmount);
        sb.append(", ").append(taxPrice);
        sb.append(", ").append(amountTotal);
        sb.append(", ").append(amountSplit);
        sb.append(", ").append(amount);
        sb.append(", ").append(price);
        sb.append(", ").append(discountAmount);
        sb.append(", ").append(discountRate);
        sb.append(", ").append(comment);
        sb.append(", ").append(arriveAt);
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
    public void from(IPBuyItem from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setStatus(from.getStatus());
        setCommodityId(from.getCommodityId());
        setCommodityCode(from.getCommodityCode());
        setCommodityName(from.getCommodityName());
        setCustomerId(from.getCustomerId());
        setTicketId(from.getTicketId());
        setOrderId(from.getOrderId());
        setNumRequest(from.getNumRequest());
        setNumApproved(from.getNumApproved());
        setNum(from.getNum());
        setTaxRate(from.getTaxRate());
        setTaxAmount(from.getTaxAmount());
        setTaxPrice(from.getTaxPrice());
        setAmountTotal(from.getAmountTotal());
        setAmountSplit(from.getAmountSplit());
        setAmount(from.getAmount());
        setPrice(from.getPrice());
        setDiscountAmount(from.getDiscountAmount());
        setDiscountRate(from.getDiscountRate());
        setComment(from.getComment());
        setArriveAt(from.getArriveAt());
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
    public <E extends IPBuyItem> E into(E into) {
        into.from(this);
        return into;
    }
}
