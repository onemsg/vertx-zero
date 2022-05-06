/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FPaymentItem;
import cn.vertxup.fm.domain.tables.interfaces.IFPaymentItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FPaymentItemRecord extends UpdatableRecordImpl<FPaymentItemRecord> implements VertxPojo, Record20<String, String, String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFPaymentItem {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.KEY</code>. 「key」- 收款明细账单主键ID
     */
    @Override
    public FPaymentItemRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.KEY</code>. 「key」- 收款明细账单主键ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.NAME</code>. 「name」 - 收款明细单标题
     */
    @Override
    public FPaymentItemRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.NAME</code>. 「name」 - 收款明细单标题
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CODE</code>. 「code」 - 收款明细单编号
     */
    @Override
    public FPaymentItemRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CODE</code>. 「code」 - 收款明细单编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SERIAL</code>. 「serial」 -
     * 收款明细单据号
     */
    @Override
    public FPaymentItemRecord setSerial(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SERIAL</code>. 「serial」 -
     * 收款明细单据号
     */
    @Override
    public String getSerial() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FPaymentItemRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT_PRE</code>.
     * 「amountPre」预付金额
     */
    @Override
    public FPaymentItemRecord setAmountPre(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT_PRE</code>.
     * 「amountPre」预付金额
     */
    @Override
    public BigDecimal getAmountPre() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」结算单ID
     */
    @Override
    public FPaymentItemRecord setSettlementId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」结算单ID
     */
    @Override
    public String getSettlementId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAYMENT_ID</code>.
     * 「paymentId」收款单ID
     */
    @Override
    public FPaymentItemRecord setPaymentId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAYMENT_ID</code>.
     * 「paymentId」收款单ID
     */
    @Override
    public String getPaymentId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_NAME</code>.
     * 「payName」打款人姓名
     */
    @Override
    public FPaymentItemRecord setPayName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_NAME</code>.
     * 「payName」打款人姓名
     */
    @Override
    public String getPayName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_MOBILE</code>.
     * 「payMobile」打款人电话
     */
    @Override
    public FPaymentItemRecord setPayMobile(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_MOBILE</code>.
     * 「payMobile」打款人电话
     */
    @Override
    public String getPayMobile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_METHOD</code>.
     * 「payMethod」付款方式
     */
    @Override
    public FPaymentItemRecord setPayMethod(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_METHOD</code>.
     * 「payMethod」付款方式
     */
    @Override
    public String getPayMethod() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_ID</code>. 「payId」付款账号
     */
    @Override
    public FPaymentItemRecord setPayId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_ID</code>. 「payId」付款账号
     */
    @Override
    public String getPayId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FPaymentItemRecord setSigma(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public FPaymentItemRecord setLanguage(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FPaymentItemRecord setActive(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public FPaymentItemRecord setMetadata(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public FPaymentItemRecord setCreatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public FPaymentItemRecord setCreatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public FPaymentItemRecord setUpdatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public FPaymentItemRecord setUpdatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<String, String, String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FPaymentItem.F_PAYMENT_ITEM.KEY;
    }

    @Override
    public Field<String> field2() {
        return FPaymentItem.F_PAYMENT_ITEM.NAME;
    }

    @Override
    public Field<String> field3() {
        return FPaymentItem.F_PAYMENT_ITEM.CODE;
    }

    @Override
    public Field<String> field4() {
        return FPaymentItem.F_PAYMENT_ITEM.SERIAL;
    }

    @Override
    public Field<BigDecimal> field5() {
        return FPaymentItem.F_PAYMENT_ITEM.AMOUNT;
    }

    @Override
    public Field<BigDecimal> field6() {
        return FPaymentItem.F_PAYMENT_ITEM.AMOUNT_PRE;
    }

    @Override
    public Field<String> field7() {
        return FPaymentItem.F_PAYMENT_ITEM.SETTLEMENT_ID;
    }

    @Override
    public Field<String> field8() {
        return FPaymentItem.F_PAYMENT_ITEM.PAYMENT_ID;
    }

    @Override
    public Field<String> field9() {
        return FPaymentItem.F_PAYMENT_ITEM.PAY_NAME;
    }

    @Override
    public Field<String> field10() {
        return FPaymentItem.F_PAYMENT_ITEM.PAY_MOBILE;
    }

    @Override
    public Field<String> field11() {
        return FPaymentItem.F_PAYMENT_ITEM.PAY_METHOD;
    }

    @Override
    public Field<String> field12() {
        return FPaymentItem.F_PAYMENT_ITEM.PAY_ID;
    }

    @Override
    public Field<String> field13() {
        return FPaymentItem.F_PAYMENT_ITEM.SIGMA;
    }

    @Override
    public Field<String> field14() {
        return FPaymentItem.F_PAYMENT_ITEM.LANGUAGE;
    }

    @Override
    public Field<Boolean> field15() {
        return FPaymentItem.F_PAYMENT_ITEM.ACTIVE;
    }

    @Override
    public Field<String> field16() {
        return FPaymentItem.F_PAYMENT_ITEM.METADATA;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return FPaymentItem.F_PAYMENT_ITEM.CREATED_AT;
    }

    @Override
    public Field<String> field18() {
        return FPaymentItem.F_PAYMENT_ITEM.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return FPaymentItem.F_PAYMENT_ITEM.UPDATED_AT;
    }

    @Override
    public Field<String> field20() {
        return FPaymentItem.F_PAYMENT_ITEM.UPDATED_BY;
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
    public BigDecimal component5() {
        return getAmount();
    }

    @Override
    public BigDecimal component6() {
        return getAmountPre();
    }

    @Override
    public String component7() {
        return getSettlementId();
    }

    @Override
    public String component8() {
        return getPaymentId();
    }

    @Override
    public String component9() {
        return getPayName();
    }

    @Override
    public String component10() {
        return getPayMobile();
    }

    @Override
    public String component11() {
        return getPayMethod();
    }

    @Override
    public String component12() {
        return getPayId();
    }

    @Override
    public String component13() {
        return getSigma();
    }

    @Override
    public String component14() {
        return getLanguage();
    }

    @Override
    public Boolean component15() {
        return getActive();
    }

    @Override
    public String component16() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component17() {
        return getCreatedAt();
    }

    @Override
    public String component18() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component19() {
        return getUpdatedAt();
    }

    @Override
    public String component20() {
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
    public BigDecimal value5() {
        return getAmount();
    }

    @Override
    public BigDecimal value6() {
        return getAmountPre();
    }

    @Override
    public String value7() {
        return getSettlementId();
    }

    @Override
    public String value8() {
        return getPaymentId();
    }

    @Override
    public String value9() {
        return getPayName();
    }

    @Override
    public String value10() {
        return getPayMobile();
    }

    @Override
    public String value11() {
        return getPayMethod();
    }

    @Override
    public String value12() {
        return getPayId();
    }

    @Override
    public String value13() {
        return getSigma();
    }

    @Override
    public String value14() {
        return getLanguage();
    }

    @Override
    public Boolean value15() {
        return getActive();
    }

    @Override
    public String value16() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value17() {
        return getCreatedAt();
    }

    @Override
    public String value18() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value19() {
        return getUpdatedAt();
    }

    @Override
    public String value20() {
        return getUpdatedBy();
    }

    @Override
    public FPaymentItemRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value4(String value) {
        setSerial(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value6(BigDecimal value) {
        setAmountPre(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value7(String value) {
        setSettlementId(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value8(String value) {
        setPaymentId(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value9(String value) {
        setPayName(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value10(String value) {
        setPayMobile(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value11(String value) {
        setPayMethod(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value12(String value) {
        setPayId(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value13(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value14(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value15(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value16(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value17(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value18(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value19(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FPaymentItemRecord value20(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FPaymentItemRecord values(String value1, String value2, String value3, String value4, BigDecimal value5, BigDecimal value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Boolean value15, String value16, LocalDateTime value17, String value18, LocalDateTime value19, String value20) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFPaymentItem from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setAmountPre(from.getAmountPre());
        setSettlementId(from.getSettlementId());
        setPaymentId(from.getPaymentId());
        setPayName(from.getPayName());
        setPayMobile(from.getPayMobile());
        setPayMethod(from.getPayMethod());
        setPayId(from.getPayId());
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
    public <E extends IFPaymentItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FPaymentItemRecord
     */
    public FPaymentItemRecord() {
        super(FPaymentItem.F_PAYMENT_ITEM);
    }

    /**
     * Create a detached, initialised FPaymentItemRecord
     */
    public FPaymentItemRecord(String key, String name, String code, String serial, BigDecimal amount, BigDecimal amountPre, String settlementId, String paymentId, String payName, String payMobile, String payMethod, String payId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FPaymentItem.F_PAYMENT_ITEM);

        setKey(key);
        setName(name);
        setCode(code);
        setSerial(serial);
        setAmount(amount);
        setAmountPre(amountPre);
        setSettlementId(settlementId);
        setPaymentId(paymentId);
        setPayName(payName);
        setPayMobile(payMobile);
        setPayMethod(payMethod);
        setPayId(payId);
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
     * Create a detached, initialised FPaymentItemRecord
     */
    public FPaymentItemRecord(cn.vertxup.fm.domain.tables.pojos.FPaymentItem value) {
        super(FPaymentItem.F_PAYMENT_ITEM);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setSerial(value.getSerial());
            setAmount(value.getAmount());
            setAmountPre(value.getAmountPre());
            setSettlementId(value.getSettlementId());
            setPaymentId(value.getPaymentId());
            setPayName(value.getPayName());
            setPayMobile(value.getPayMobile());
            setPayMethod(value.getPayMethod());
            setPayId(value.getPayId());
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

    public FPaymentItemRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
