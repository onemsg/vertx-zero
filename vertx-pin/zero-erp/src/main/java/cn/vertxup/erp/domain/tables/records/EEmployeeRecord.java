/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EEmployee;
import cn.vertxup.erp.domain.tables.interfaces.IEEmployee;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EEmployeeRecord extends UpdatableRecordImpl<EEmployeeRecord> implements VertxPojo, IEEmployee {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    @Override
    public EEmployeeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    @Override
    public EEmployeeRecord setCompanyId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    @Override
    public String getCompanyId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public EEmployeeRecord setDeptId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public String getDeptId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    @Override
    public EEmployeeRecord setTeamId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    @Override
    public String getTeamId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」-
     * 关联档案
     */
    @Override
    public EEmployeeRecord setIdentityId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」-
     * 关联档案
     */
    @Override
    public String getIdentityId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    @Override
    public EEmployeeRecord setViceName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    @Override
    public String getViceName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」-
     * 员工邮箱
     */
    @Override
    public EEmployeeRecord setViceEmail(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」-
     * 员工邮箱
     */
    @Override
    public String getViceEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」-
     * 员工手机
     */
    @Override
    public EEmployeeRecord setViceMobile(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」-
     * 员工手机
     */
    @Override
    public String getViceMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」-
     * 工号
     */
    @Override
    public EEmployeeRecord setWorkNumber(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」-
     * 工号
     */
    @Override
    public String getWorkNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    @Override
    public EEmployeeRecord setWorkTitle(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    @Override
    public String getWorkTitle() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>.
     * 「workLocation」- 办公地点
     */
    @Override
    public EEmployeeRecord setWorkLocation(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>.
     * 「workLocation」- 办公地点
     */
    @Override
    public String getWorkLocation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」-
     * 办公电话
     */
    @Override
    public EEmployeeRecord setWorkPhone(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」-
     * 办公电话
     */
    @Override
    public String getWorkPhone() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>.
     * 「workExtension」- 分机号
     */
    @Override
    public EEmployeeRecord setWorkExtension(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>.
     * 「workExtension」- 分机号
     */
    @Override
    public String getWorkExtension() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_HIRE_AT</code>. 「workHireAt」-
     * 入职时间
     */
    @Override
    public EEmployeeRecord setWorkHireAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_HIRE_AT</code>. 「workHireAt」-
     * 入职时间
     */
    @Override
    public LocalDateTime getWorkHireAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_ID</code>. 「bankId」- 开户行
     */
    @Override
    public EEmployeeRecord setBankId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_ID</code>. 「bankId」- 开户行
     */
    @Override
    public String getBankId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_CARD</code>. 「bankCard」-
     * 开户行账号
     */
    @Override
    public EEmployeeRecord setBankCard(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_CARD</code>. 「bankCard」-
     * 开户行账号
     */
    @Override
    public String getBankCard() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    @Override
    public EEmployeeRecord setType(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    @Override
    public String getType() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.STATUS</code>. 「status」- 员工状态
     */
    @Override
    public EEmployeeRecord setStatus(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.STATUS</code>. 「status」- 员工状态
     */
    @Override
    public String getStatus() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EEmployeeRecord setMetadata(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EEmployeeRecord setActive(Boolean value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」-
     * 统一标识（公司所属应用）
     */
    @Override
    public EEmployeeRecord setSigma(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」-
     * 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EEmployeeRecord setLanguage(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public EEmployeeRecord setCreatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public EEmployeeRecord setCreatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public EEmployeeRecord setUpdatedAt(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public EEmployeeRecord setUpdatedBy(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(25);
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
    public void from(IEEmployee from) {
        setKey(from.getKey());
        setCompanyId(from.getCompanyId());
        setDeptId(from.getDeptId());
        setTeamId(from.getTeamId());
        setIdentityId(from.getIdentityId());
        setViceName(from.getViceName());
        setViceEmail(from.getViceEmail());
        setViceMobile(from.getViceMobile());
        setWorkNumber(from.getWorkNumber());
        setWorkTitle(from.getWorkTitle());
        setWorkLocation(from.getWorkLocation());
        setWorkPhone(from.getWorkPhone());
        setWorkExtension(from.getWorkExtension());
        setWorkHireAt(from.getWorkHireAt());
        setBankId(from.getBankId());
        setBankCard(from.getBankCard());
        setType(from.getType());
        setStatus(from.getStatus());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IEEmployee> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EEmployeeRecord
     */
    public EEmployeeRecord() {
        super(EEmployee.E_EMPLOYEE);
    }

    /**
     * Create a detached, initialised EEmployeeRecord
     */
    public EEmployeeRecord(String key, String companyId, String deptId, String teamId, String identityId, String viceName, String viceEmail, String viceMobile, String workNumber, String workTitle, String workLocation, String workPhone, String workExtension, LocalDateTime workHireAt, String bankId, String bankCard, String type, String status, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EEmployee.E_EMPLOYEE);

        setKey(key);
        setCompanyId(companyId);
        setDeptId(deptId);
        setTeamId(teamId);
        setIdentityId(identityId);
        setViceName(viceName);
        setViceEmail(viceEmail);
        setViceMobile(viceMobile);
        setWorkNumber(workNumber);
        setWorkTitle(workTitle);
        setWorkLocation(workLocation);
        setWorkPhone(workPhone);
        setWorkExtension(workExtension);
        setWorkHireAt(workHireAt);
        setBankId(bankId);
        setBankCard(bankCard);
        setType(type);
        setStatus(status);
        setMetadata(metadata);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised EEmployeeRecord
     */
    public EEmployeeRecord(cn.vertxup.erp.domain.tables.pojos.EEmployee value) {
        super(EEmployee.E_EMPLOYEE);

        if (value != null) {
            setKey(value.getKey());
            setCompanyId(value.getCompanyId());
            setDeptId(value.getDeptId());
            setTeamId(value.getTeamId());
            setIdentityId(value.getIdentityId());
            setViceName(value.getViceName());
            setViceEmail(value.getViceEmail());
            setViceMobile(value.getViceMobile());
            setWorkNumber(value.getWorkNumber());
            setWorkTitle(value.getWorkTitle());
            setWorkLocation(value.getWorkLocation());
            setWorkPhone(value.getWorkPhone());
            setWorkExtension(value.getWorkExtension());
            setWorkHireAt(value.getWorkHireAt());
            setBankId(value.getBankId());
            setBankCard(value.getBankCard());
            setType(value.getType());
            setStatus(value.getStatus());
            setMetadata(value.getMetadata());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public EEmployeeRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
