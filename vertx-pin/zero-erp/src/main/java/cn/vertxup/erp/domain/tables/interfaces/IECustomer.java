/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IECustomer extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.KEY</code>. 「key」- 客户ID
     */
    public IECustomer setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.KEY</code>. 「key」- 客户ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.NAME</code>. 「name」- 客户名称
     */
    public IECustomer setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.NAME</code>. 「name」- 客户名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CODE</code>. 「code」- 客户编号
     */
    public IECustomer setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CODE</code>. 「code」- 客户编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TYPE</code>. 「type」-
     * 客户分类（不同类型代表不同客户）
     */
    public IECustomer setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TYPE</code>. 「type」-
     * 客户分类（不同类型代表不同客户）
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TAX_CODE</code>. 「taxCode」- 税号
     */
    public IECustomer setTaxCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TAX_CODE</code>. 「taxCode」- 税号
     */
    public String getTaxCode();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    public IECustomer setTaxTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    public String getTaxTitle();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_NAME</code>.
     * 「contactName」- 联系人姓名
     */
    public IECustomer setContactName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_NAME</code>.
     * 「contactName」- 联系人姓名
     */
    public String getContactName();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_PHONE</code>.
     * 「contactPhone」- 联系人电话
     */
    public IECustomer setContactPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_PHONE</code>.
     * 「contactPhone」- 联系人电话
     */
    public String getContactPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_EMAIL</code>.
     * 「contactEmail」- 联系人Email
     */
    public IECustomer setContactEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_EMAIL</code>.
     * 「contactEmail」- 联系人Email
     */
    public String getContactEmail();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_ONLINE</code>.
     * 「contactOnline」- 在线联系方式
     */
    public IECustomer setContactOnline(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_ONLINE</code>.
     * 「contactOnline」- 在线联系方式
     */
    public String getContactOnline();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TITLE</code>. 「title」- 客户显示标题
     */
    public IECustomer setTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TITLE</code>. 「title」- 客户显示标题
     */
    public String getTitle();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.COMMENT</code>. 「comment」- 客户备注
     */
    public IECustomer setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.COMMENT</code>. 「comment」- 客户备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.EMAIL</code>. 「email」- 企业邮箱
     */
    public IECustomer setEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.EMAIL</code>. 「email」- 企业邮箱
     */
    public String getEmail();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.FAX</code>. 「fax」- 传真号
     */
    public IECustomer setFax(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.FAX</code>. 「fax」- 传真号
     */
    public String getFax();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.HOMEPAGE</code>. 「homepage」- 客户主页
     */
    public IECustomer setHomepage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.HOMEPAGE</code>. 「homepage」- 客户主页
     */
    public String getHomepage();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.LOGO</code>. 「logo」- 附件对应的
     * attachment Key
     */
    public IECustomer setLogo(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.LOGO</code>. 「logo」- 附件对应的
     * attachment Key
     */
    public String getLogo();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.PHONE</code>. 「phone」- 客户座机
     */
    public IECustomer setPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.PHONE</code>. 「phone」- 客户座机
     */
    public String getPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.ADDRESS</code>. 「address」- 客户地址
     */
    public IECustomer setAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.ADDRESS</code>. 「address」- 客户地址
     */
    public String getAddress();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.SIGN_NAME</code>. 「signName」-
     * 签单人姓名
     */
    public IECustomer setSignName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.SIGN_NAME</code>. 「signName」-
     * 签单人姓名
     */
    public String getSignName();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.SIGN_PHONE</code>. 「signPhone」-
     * 签单人电话
     */
    public IECustomer setSignPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.SIGN_PHONE</code>. 「signPhone」-
     * 签单人电话
     */
    public String getSignPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.RUN_UP</code>. 「runUp」- 挂账属性
     */
    public IECustomer setRunUp(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.RUN_UP</code>. 「runUp」- 挂账属性
     */
    public Boolean getRunUp();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.RUN_AMOUNT</code>. 「runAmount」-
     * 挂账限额
     */
    public IECustomer setRunAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.RUN_AMOUNT</code>. 「runAmount」-
     * 挂账限额
     */
    public BigDecimal getRunAmount();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.BANK_ID</code>. 「bankId」- 开户行
     */
    public IECustomer setBankId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.BANK_ID</code>. 「bankId」- 开户行
     */
    public String getBankId();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.BANK_CARD</code>. 「bankCard」-
     * 开户行账号
     */
    public IECustomer setBankCard(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.BANK_CARD</code>. 「bankCard」-
     * 开户行账号
     */
    public String getBankCard();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.METADATA</code>. 「metadata」- 附加配置
     */
    public IECustomer setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.ACTIVE</code>. 「active」- 是否启用
     */
    public IECustomer setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.SIGMA</code>. 「sigma」-
     * 统一标识（客户所属应用）
     */
    public IECustomer setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.SIGMA</code>. 「sigma」-
     * 统一标识（客户所属应用）
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IECustomer setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IECustomer setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IECustomer setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IECustomer setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IECustomer setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IECustomer
     */
    public void from(IECustomer from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IECustomer
     */
    public <E extends IECustomer> E into(E into);

        @Override
        public default IECustomer fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setTaxCode,json::getString,"TAX_CODE","java.lang.String");
                setOrThrow(this::setTaxTitle,json::getString,"TAX_TITLE","java.lang.String");
                setOrThrow(this::setContactName,json::getString,"CONTACT_NAME","java.lang.String");
                setOrThrow(this::setContactPhone,json::getString,"CONTACT_PHONE","java.lang.String");
                setOrThrow(this::setContactEmail,json::getString,"CONTACT_EMAIL","java.lang.String");
                setOrThrow(this::setContactOnline,json::getString,"CONTACT_ONLINE","java.lang.String");
                setOrThrow(this::setTitle,json::getString,"TITLE","java.lang.String");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setEmail,json::getString,"EMAIL","java.lang.String");
                setOrThrow(this::setFax,json::getString,"FAX","java.lang.String");
                setOrThrow(this::setHomepage,json::getString,"HOMEPAGE","java.lang.String");
                setOrThrow(this::setLogo,json::getString,"LOGO","java.lang.String");
                setOrThrow(this::setPhone,json::getString,"PHONE","java.lang.String");
                setOrThrow(this::setAddress,json::getString,"ADDRESS","java.lang.String");
                setOrThrow(this::setSignName,json::getString,"SIGN_NAME","java.lang.String");
                setOrThrow(this::setSignPhone,json::getString,"SIGN_PHONE","java.lang.String");
                setOrThrow(this::setRunUp,json::getBoolean,"RUN_UP","java.lang.Boolean");
                // Omitting unrecognized type java.math.BigDecimal for column RUN_AMOUNT!
                setOrThrow(this::setBankId,json::getString,"BANK_ID","java.lang.String");
                setOrThrow(this::setBankCard,json::getString,"BANK_CARD","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
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
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("TYPE",getType());
                json.put("TAX_CODE",getTaxCode());
                json.put("TAX_TITLE",getTaxTitle());
                json.put("CONTACT_NAME",getContactName());
                json.put("CONTACT_PHONE",getContactPhone());
                json.put("CONTACT_EMAIL",getContactEmail());
                json.put("CONTACT_ONLINE",getContactOnline());
                json.put("TITLE",getTitle());
                json.put("COMMENT",getComment());
                json.put("EMAIL",getEmail());
                json.put("FAX",getFax());
                json.put("HOMEPAGE",getHomepage());
                json.put("LOGO",getLogo());
                json.put("PHONE",getPhone());
                json.put("ADDRESS",getAddress());
                json.put("SIGN_NAME",getSignName());
                json.put("SIGN_PHONE",getSignPhone());
                json.put("RUN_UP",getRunUp());
                // Omitting unrecognized type java.math.BigDecimal for column RUN_AMOUNT!
                json.put("BANK_ID",getBankId());
                json.put("BANK_CARD",getBankCard());
                json.put("METADATA",getMetadata());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
