/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FSettlementItem;
import cn.vertxup.fm.domain.tables.interfaces.IFSettlementItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FSettlementItemRecord extends UpdatableRecordImpl<FSettlementItemRecord> implements VertxPojo, Record22<String, String, String, String, Boolean, String, BigDecimal, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFSettlementItem {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.KEY</code>. 「key」- 结算单明细主键
     */
    @Override
    public FSettlementItemRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.KEY</code>. 「key」- 结算单明细主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.NAME</code>. 「name」 -  明细名称
     */
    @Override
    public FSettlementItemRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.NAME</code>. 「name」 -  明细名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CODE</code>. 「code」 -
     * 明细系统代码
     */
    @Override
    public FSettlementItemRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CODE</code>. 「code」 -
     * 明细系统代码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SERIAL</code>. 「serial」 -
     * 明细编号
     */
    @Override
    public FSettlementItemRecord setSerial(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SERIAL</code>. 「serial」 -
     * 明细编号
     */
    @Override
    public String getSerial() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INCOME</code>. 「income」-
     * true = 消费类，false = 付款类
     */
    @Override
    public FSettlementItemRecord setIncome(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INCOME</code>. 「income」-
     * true = 消费类，false = 付款类
     */
    @Override
    public Boolean getIncome() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.TYPE</code>. 「type」- 明细类型
     */
    @Override
    public FSettlementItemRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.TYPE</code>. 「type」- 明细类型
     */
    @Override
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际结算金额
     */
    @Override
    public FSettlementItemRecord setAmount(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.COMMENT</code>. 「comment」 -
     * 明细备注
     */
    @Override
    public FSettlementItemRecord setComment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.COMMENT</code>. 「comment」 -
     * 明细备注
     */
    @Override
    public String getComment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.MANUAL_NO</code>.
     * 「manualNo」 - 手工单号（线下单号专用）
     */
    @Override
    public FSettlementItemRecord setManualNo(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.MANUAL_NO</code>.
     * 「manualNo」 - 手工单号（线下单号专用）
     */
    @Override
    public String getManualNo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.PAY_TERM_ID</code>.
     * 「payTermId」- 账单项ID
     */
    @Override
    public FSettlementItemRecord setPayTermId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.PAY_TERM_ID</code>.
     * 「payTermId」- 账单项ID
     */
    @Override
    public String getPayTermId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.RELATED_ID</code>.
     * 「relatedId」- 关联BillItem ID（保留，原系统存在）
     */
    @Override
    public FSettlementItemRecord setRelatedId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.RELATED_ID</code>.
     * 「relatedId」- 关联BillItem ID（保留，原系统存在）
     */
    @Override
    public String getRelatedId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    @Override
    public FSettlementItemRecord setSettlementId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    @Override
    public String getSettlementId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.DEBT_ID</code>. 「debtId」-
     * 应收账单ID
     */
    @Override
    public FSettlementItemRecord setDebtId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.DEBT_ID</code>. 「debtId」-
     * 应收账单ID
     */
    @Override
    public String getDebtId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INVOICE_ID</code>.
     * 「invoiceId」- 开票ID
     */
    @Override
    public FSettlementItemRecord setInvoiceId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INVOICE_ID</code>.
     * 「invoiceId」- 开票ID
     */
    @Override
    public String getInvoiceId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSettlementItemRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.LANGUAGE</code>.
     * 「language」- 使用的语言
     */
    @Override
    public FSettlementItemRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.LANGUAGE</code>.
     * 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.ACTIVE</code>. 「active」-
     * 是否启用
     */
    @Override
    public FSettlementItemRecord setActive(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.ACTIVE</code>. 「active」-
     * 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.METADATA</code>.
     * 「metadata」- 附加配置数据
     */
    @Override
    public FSettlementItemRecord setMetadata(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.METADATA</code>.
     * 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public FSettlementItemRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public FSettlementItemRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public FSettlementItemRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public FSettlementItemRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, Boolean, String, BigDecimal, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, Boolean, String, BigDecimal, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FSettlementItem.F_SETTLEMENT_ITEM.KEY;
    }

    @Override
    public Field<String> field2() {
        return FSettlementItem.F_SETTLEMENT_ITEM.NAME;
    }

    @Override
    public Field<String> field3() {
        return FSettlementItem.F_SETTLEMENT_ITEM.CODE;
    }

    @Override
    public Field<String> field4() {
        return FSettlementItem.F_SETTLEMENT_ITEM.SERIAL;
    }

    @Override
    public Field<Boolean> field5() {
        return FSettlementItem.F_SETTLEMENT_ITEM.INCOME;
    }

    @Override
    public Field<String> field6() {
        return FSettlementItem.F_SETTLEMENT_ITEM.TYPE;
    }

    @Override
    public Field<BigDecimal> field7() {
        return FSettlementItem.F_SETTLEMENT_ITEM.AMOUNT;
    }

    @Override
    public Field<String> field8() {
        return FSettlementItem.F_SETTLEMENT_ITEM.COMMENT;
    }

    @Override
    public Field<String> field9() {
        return FSettlementItem.F_SETTLEMENT_ITEM.MANUAL_NO;
    }

    @Override
    public Field<String> field10() {
        return FSettlementItem.F_SETTLEMENT_ITEM.PAY_TERM_ID;
    }

    @Override
    public Field<String> field11() {
        return FSettlementItem.F_SETTLEMENT_ITEM.RELATED_ID;
    }

    @Override
    public Field<String> field12() {
        return FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID;
    }

    @Override
    public Field<String> field13() {
        return FSettlementItem.F_SETTLEMENT_ITEM.DEBT_ID;
    }

    @Override
    public Field<String> field14() {
        return FSettlementItem.F_SETTLEMENT_ITEM.INVOICE_ID;
    }

    @Override
    public Field<String> field15() {
        return FSettlementItem.F_SETTLEMENT_ITEM.SIGMA;
    }

    @Override
    public Field<String> field16() {
        return FSettlementItem.F_SETTLEMENT_ITEM.LANGUAGE;
    }

    @Override
    public Field<Boolean> field17() {
        return FSettlementItem.F_SETTLEMENT_ITEM.ACTIVE;
    }

    @Override
    public Field<String> field18() {
        return FSettlementItem.F_SETTLEMENT_ITEM.METADATA;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return FSettlementItem.F_SETTLEMENT_ITEM.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return FSettlementItem.F_SETTLEMENT_ITEM.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return FSettlementItem.F_SETTLEMENT_ITEM.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return FSettlementItem.F_SETTLEMENT_ITEM.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getSerial();
    }

    @Override
    public Boolean component5() {
        return getIncome();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public BigDecimal component7() {
        return getAmount();
    }

    @Override
    public String component8() {
        return getComment();
    }

    @Override
    public String component9() {
        return getManualNo();
    }

    @Override
    public String component10() {
        return getPayTermId();
    }

    @Override
    public String component11() {
        return getRelatedId();
    }

    @Override
    public String component12() {
        return getSettlementId();
    }

    @Override
    public String component13() {
        return getDebtId();
    }

    @Override
    public String component14() {
        return getInvoiceId();
    }

    @Override
    public String component15() {
        return getSigma();
    }

    @Override
    public String component16() {
        return getLanguage();
    }

    @Override
    public Boolean component17() {
        return getActive();
    }

    @Override
    public String component18() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component19() {
        return getCreatedAt();
    }

    @Override
    public String component20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component21() {
        return getUpdatedAt();
    }

    @Override
    public String component22() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getSerial();
    }

    @Override
    public Boolean value5() {
        return getIncome();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public BigDecimal value7() {
        return getAmount();
    }

    @Override
    public String value8() {
        return getComment();
    }

    @Override
    public String value9() {
        return getManualNo();
    }

    @Override
    public String value10() {
        return getPayTermId();
    }

    @Override
    public String value11() {
        return getRelatedId();
    }

    @Override
    public String value12() {
        return getSettlementId();
    }

    @Override
    public String value13() {
        return getDebtId();
    }

    @Override
    public String value14() {
        return getInvoiceId();
    }

    @Override
    public String value15() {
        return getSigma();
    }

    @Override
    public String value16() {
        return getLanguage();
    }

    @Override
    public Boolean value17() {
        return getActive();
    }

    @Override
    public String value18() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value19() {
        return getCreatedAt();
    }

    @Override
    public String value20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value21() {
        return getUpdatedAt();
    }

    @Override
    public String value22() {
        return getUpdatedBy();
    }

    @Override
    public FSettlementItemRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value4(String value) {
        setSerial(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value5(Boolean value) {
        setIncome(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value7(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value8(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value9(String value) {
        setManualNo(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value10(String value) {
        setPayTermId(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value11(String value) {
        setRelatedId(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value12(String value) {
        setSettlementId(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value13(String value) {
        setDebtId(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value14(String value) {
        setInvoiceId(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value15(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value17(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value18(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FSettlementItemRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FSettlementItemRecord values(String value1, String value2, String value3, String value4, Boolean value5, String value6, BigDecimal value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Boolean value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFSettlementItem from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setIncome(from.getIncome());
        setType(from.getType());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setManualNo(from.getManualNo());
        setPayTermId(from.getPayTermId());
        setRelatedId(from.getRelatedId());
        setSettlementId(from.getSettlementId());
        setDebtId(from.getDebtId());
        setInvoiceId(from.getInvoiceId());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IFSettlementItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FSettlementItemRecord
     */
    public FSettlementItemRecord() {
        super(FSettlementItem.F_SETTLEMENT_ITEM);
    }

    /**
     * Create a detached, initialised FSettlementItemRecord
     */
    public FSettlementItemRecord(String key, String name, String code, String serial, Boolean income, String type, BigDecimal amount, String comment, String manualNo, String payTermId, String relatedId, String settlementId, String debtId, String invoiceId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FSettlementItem.F_SETTLEMENT_ITEM);

        setKey(key);
        setName(name);
        setCode(code);
        setSerial(serial);
        setIncome(income);
        setType(type);
        setAmount(amount);
        setComment(comment);
        setManualNo(manualNo);
        setPayTermId(payTermId);
        setRelatedId(relatedId);
        setSettlementId(settlementId);
        setDebtId(debtId);
        setInvoiceId(invoiceId);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised FSettlementItemRecord
     */
    public FSettlementItemRecord(cn.vertxup.fm.domain.tables.pojos.FSettlementItem value) {
        super(FSettlementItem.F_SETTLEMENT_ITEM);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setSerial(value.getSerial());
            setIncome(value.getIncome());
            setType(value.getType());
            setAmount(value.getAmount());
            setComment(value.getComment());
            setManualNo(value.getManualNo());
            setPayTermId(value.getPayTermId());
            setRelatedId(value.getRelatedId());
            setSettlementId(value.getSettlementId());
            setDebtId(value.getDebtId());
            setInvoiceId(value.getInvoiceId());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

    public FSettlementItemRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
