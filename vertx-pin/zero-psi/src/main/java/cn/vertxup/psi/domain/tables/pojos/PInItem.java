/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.pojos;


import cn.vertxup.psi.domain.tables.interfaces.IPInItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PInItem implements VertxPojo, IPInItem {

    private static final long serialVersionUID = 1L;

    private String key;
    private String serial;
    private String status;
    private String commodityId;
    private String commodityCode;
    private String commodityName;
    private String commodityLogo;
    private String customerId;
    private String fromName;
    private String fromCode;
    private String ticketId;
    private String orderNumber;
    private String orderSource;
    private String whId;
    private Integer numWait;
    private Integer num;
    private BigDecimal taxRate;
    private BigDecimal taxAmount;
    private BigDecimal taxPrice;
    private BigDecimal amountTotal;
    private BigDecimal amountSplit;
    private BigDecimal amount;
    private BigDecimal price;
    private String comment;
    private BigDecimal costPerBasis;
    private BigDecimal costPer;
    private BigDecimal costAmount;
    private BigDecimal discountAmount;
    private BigDecimal discountRate;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public PInItem() {
    }

    public PInItem(IPInItem value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.status = value.getStatus();
        this.commodityId = value.getCommodityId();
        this.commodityCode = value.getCommodityCode();
        this.commodityName = value.getCommodityName();
        this.commodityLogo = value.getCommodityLogo();
        this.customerId = value.getCustomerId();
        this.fromName = value.getFromName();
        this.fromCode = value.getFromCode();
        this.ticketId = value.getTicketId();
        this.orderNumber = value.getOrderNumber();
        this.orderSource = value.getOrderSource();
        this.whId = value.getWhId();
        this.numWait = value.getNumWait();
        this.num = value.getNum();
        this.taxRate = value.getTaxRate();
        this.taxAmount = value.getTaxAmount();
        this.taxPrice = value.getTaxPrice();
        this.amountTotal = value.getAmountTotal();
        this.amountSplit = value.getAmountSplit();
        this.amount = value.getAmount();
        this.price = value.getPrice();
        this.comment = value.getComment();
        this.costPerBasis = value.getCostPerBasis();
        this.costPer = value.getCostPer();
        this.costAmount = value.getCostAmount();
        this.discountAmount = value.getDiscountAmount();
        this.discountRate = value.getDiscountRate();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public PInItem(
        String key,
        String serial,
        String status,
        String commodityId,
        String commodityCode,
        String commodityName,
        String commodityLogo,
        String customerId,
        String fromName,
        String fromCode,
        String ticketId,
        String orderNumber,
        String orderSource,
        String whId,
        Integer numWait,
        Integer num,
        BigDecimal taxRate,
        BigDecimal taxAmount,
        BigDecimal taxPrice,
        BigDecimal amountTotal,
        BigDecimal amountSplit,
        BigDecimal amount,
        BigDecimal price,
        String comment,
        BigDecimal costPerBasis,
        BigDecimal costPer,
        BigDecimal costAmount,
        BigDecimal discountAmount,
        BigDecimal discountRate,
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
        this.commodityLogo = commodityLogo;
        this.customerId = customerId;
        this.fromName = fromName;
        this.fromCode = fromCode;
        this.ticketId = ticketId;
        this.orderNumber = orderNumber;
        this.orderSource = orderSource;
        this.whId = whId;
        this.numWait = numWait;
        this.num = num;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
        this.taxPrice = taxPrice;
        this.amountTotal = amountTotal;
        this.amountSplit = amountSplit;
        this.amount = amount;
        this.price = price;
        this.comment = comment;
        this.costPerBasis = costPerBasis;
        this.costPer = costPer;
        this.costAmount = costAmount;
        this.discountAmount = discountAmount;
        this.discountRate = discountRate;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public PInItem(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.KEY</code>. 「key」- 入库明细主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.KEY</code>. 「key」- 入库明细主键
     */
    @Override
    public PInItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.SERIAL</code>. 「serial」-
     * 入库明细号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.SERIAL</code>. 「serial」-
     * 入库明细号（系统可用，直接计算）
     */
    @Override
    public PInItem setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public PInItem setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_ID</code>. 「commodityId」-
     * 商品ID
     */
    @Override
    public String getCommodityId() {
        return this.commodityId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_ID</code>. 「commodityId」-
     * 商品ID
     */
    @Override
    public PInItem setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public PInItem setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public String getCommodityName() {
        return this.commodityName;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public PInItem setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    @Override
    public String getCommodityLogo() {
        return this.commodityLogo;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    @Override
    public PInItem setCommodityLogo(String commodityLogo) {
        this.commodityLogo = commodityLogo;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    @Override
    public PInItem setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    @Override
    public String getFromName() {
        return this.fromName;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    @Override
    public PInItem setFromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    @Override
    public String getFromCode() {
        return this.fromCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    @Override
    public PInItem setFromCode(String fromCode) {
        this.fromCode = fromCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TICKET_ID</code>. 「ticketId」- 入库单ID
     */
    @Override
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TICKET_ID</code>. 「ticketId」- 入库单ID
     */
    @Override
    public PInItem setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_NUMBER</code>. 「orderNumber」-
     * 订单编号
     */
    @Override
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_NUMBER</code>. 「orderNumber」-
     * 订单编号
     */
    @Override
    public PInItem setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_SOURCE</code>. 「orderSource」-
     * 源单单号
     */
    @Override
    public String getOrderSource() {
        return this.orderSource;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_SOURCE</code>. 「orderSource」-
     * 源单单号
     */
    @Override
    public PInItem setOrderSource(String orderSource) {
        this.orderSource = orderSource;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.WH_ID</code>. 「whId」- 实际入库仓库
     */
    @Override
    public String getWhId() {
        return this.whId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.WH_ID</code>. 「whId」- 实际入库仓库
     */
    @Override
    public PInItem setWhId(String whId) {
        this.whId = whId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.NUM_WAIT</code>. 「numWait」- 预计入库
     */
    @Override
    public Integer getNumWait() {
        return this.numWait;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.NUM_WAIT</code>. 「numWait」- 预计入库
     */
    @Override
    public PInItem setNumWait(Integer numWait) {
        this.numWait = numWait;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.NUM</code>. 「num」- 实际入库数量
     */
    @Override
    public Integer getNum() {
        return this.num;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.NUM</code>. 「num」- 实际入库数量
     */
    @Override
    public PInItem setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public PInItem setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public PInItem setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public BigDecimal getTaxPrice() {
        return this.taxPrice;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public PInItem setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」-
     * 税价合计
     */
    @Override
    public BigDecimal getAmountTotal() {
        return this.amountTotal;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」-
     * 税价合计
     */
    @Override
    public PInItem setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_SPLIT</code>. 「amountSplit」-
     * 采购分摊费用
     */
    @Override
    public BigDecimal getAmountSplit() {
        return this.amountSplit;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_SPLIT</code>. 「amountSplit」-
     * 采购分摊费用
     */
    @Override
    public PInItem setAmountSplit(BigDecimal amountSplit) {
        this.amountSplit = amountSplit;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT</code>. 「amount」- 采购总价（订单总价）
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT</code>. 「amount」- 采购总价（订单总价）
     */
    @Override
    public PInItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public PInItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public PInItem setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    @Override
    public BigDecimal getCostPerBasis() {
        return this.costPerBasis;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    @Override
    public PInItem setCostPerBasis(BigDecimal costPerBasis) {
        this.costPerBasis = costPerBasis;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    @Override
    public BigDecimal getCostPer() {
        return this.costPer;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    @Override
    public PInItem setCostPer(BigDecimal costPer) {
        this.costPer = costPer;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 入库成本
     */
    @Override
    public BigDecimal getCostAmount() {
        return this.costAmount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 入库成本
     */
    @Override
    public PInItem setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public PInItem setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public BigDecimal getDiscountRate() {
        return this.discountRate;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public PInItem setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PInItem setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PInItem setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PInItem setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PInItem setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public PInItem setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public PInItem setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public PInItem setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public PInItem setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PInItem (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(status);
        sb.append(", ").append(commodityId);
        sb.append(", ").append(commodityCode);
        sb.append(", ").append(commodityName);
        sb.append(", ").append(commodityLogo);
        sb.append(", ").append(customerId);
        sb.append(", ").append(fromName);
        sb.append(", ").append(fromCode);
        sb.append(", ").append(ticketId);
        sb.append(", ").append(orderNumber);
        sb.append(", ").append(orderSource);
        sb.append(", ").append(whId);
        sb.append(", ").append(numWait);
        sb.append(", ").append(num);
        sb.append(", ").append(taxRate);
        sb.append(", ").append(taxAmount);
        sb.append(", ").append(taxPrice);
        sb.append(", ").append(amountTotal);
        sb.append(", ").append(amountSplit);
        sb.append(", ").append(amount);
        sb.append(", ").append(price);
        sb.append(", ").append(comment);
        sb.append(", ").append(costPerBasis);
        sb.append(", ").append(costPer);
        sb.append(", ").append(costAmount);
        sb.append(", ").append(discountAmount);
        sb.append(", ").append(discountRate);
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
    public void from(IPInItem from) {
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
        setOrderNumber(from.getOrderNumber());
        setOrderSource(from.getOrderSource());
        setWhId(from.getWhId());
        setNumWait(from.getNumWait());
        setNum(from.getNum());
        setTaxRate(from.getTaxRate());
        setTaxAmount(from.getTaxAmount());
        setTaxPrice(from.getTaxPrice());
        setAmountTotal(from.getAmountTotal());
        setAmountSplit(from.getAmountSplit());
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
    public <E extends IPInItem> E into(E into) {
        into.from(this);
        return into;
    }
}
