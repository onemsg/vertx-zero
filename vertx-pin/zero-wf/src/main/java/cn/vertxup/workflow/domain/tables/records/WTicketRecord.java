/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.records;


import cn.vertxup.workflow.domain.tables.WTicket;
import cn.vertxup.workflow.domain.tables.interfaces.IWTicket;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class WTicketRecord extends UpdatableRecordImpl<WTicketRecord> implements VertxPojo, IWTicket {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.KEY</code>. 「key」- 单据主键
     */
    @Override
    public WTicketRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.KEY</code>. 「key」- 单据主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.SERIAL</code>. 「serial」- 单据编号，使用
     * X_NUMBER 生成
     */
    @Override
    public WTicketRecord setSerial(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.SERIAL</code>. 「serial」- 单据编号，使用
     * X_NUMBER 生成
     */
    @Override
    public String getSerial() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.NAME</code>. 「name」- 单据标题
     */
    @Override
    public WTicketRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.NAME</code>. 「name」- 单据标题
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CODE</code>. 「code」- 单据系统编号（内码）
     */
    @Override
    public WTicketRecord setCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CODE</code>. 「code」- 单据系统编号（内码）
     */
    @Override
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.TYPE</code>. 「type」- 主单类型类型
     */
    @Override
    public WTicketRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.TYPE</code>. 「type」- 主单类型类型
     */
    @Override
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.PHASE</code>. 「phase」-
     * 主单据所属阶段（状态描述，由于挂TODO，所以不使用status）
     */
    @Override
    public WTicketRecord setPhase(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.PHASE</code>. 「phase」-
     * 主单据所属阶段（状态描述，由于挂TODO，所以不使用status）
     */
    @Override
    public String getPhase() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public WTicketRecord setModelId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public WTicketRecord setModelKey(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public WTicketRecord setModelCategory(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public String getModelCategory() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_COMPONENT</code>.
     * 「modelComponent」- 关联的待办组件记录
     */
    @Override
    public WTicketRecord setModelComponent(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_COMPONENT</code>.
     * 「modelComponent」- 关联的待办组件记录
     */
    @Override
    public String getModelComponent() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_CHILD</code>. 「modelChild」-
     * 关联多个模型的记录ID，JsonArray格式
     */
    @Override
    public WTicketRecord setModelChild(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_CHILD</code>. 「modelChild」-
     * 关联多个模型的记录ID，JsonArray格式
     */
    @Override
    public String getModelChild() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.QUANTITY</code>. 「quantity」-
     * 数量信息，多个模型记录时统计模型总数
     */
    @Override
    public WTicketRecord setQuantity(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.QUANTITY</code>. 「quantity」-
     * 数量信息，多个模型记录时统计模型总数
     */
    @Override
    public Integer getQuantity() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_KEY</code>.
     * 「flowDefinitionKey」- 流程定义的KEY, getProcessDefinitionKey
     */
    @Override
    public WTicketRecord setFlowDefinitionKey(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_KEY</code>.
     * 「flowDefinitionKey」- 流程定义的KEY, getProcessDefinitionKey
     */
    @Override
    public String getFlowDefinitionKey() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_ID</code>.
     * 「flowDefinitionId」- 流程定义的ID，getProcessDefinitionKey
     */
    @Override
    public WTicketRecord setFlowDefinitionId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_ID</code>.
     * 「flowDefinitionId」- 流程定义的ID，getProcessDefinitionKey
     */
    @Override
    public String getFlowDefinitionId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_INSTANCE_ID</code>.
     * 「flowInstanceId」- 流程定义的ID，getProcessId
     */
    @Override
    public WTicketRecord setFlowInstanceId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_INSTANCE_ID</code>.
     * 「flowInstanceId」- 流程定义的ID，getProcessId
     */
    @Override
    public String getFlowInstanceId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_END</code>. 「flowEnd」- 主单是否执行完成
     */
    @Override
    public WTicketRecord setFlowEnd(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_END</code>. 「flowEnd」- 主单是否执行完成
     */
    @Override
    public Boolean getFlowEnd() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.TITLE</code>. 「title」- 主单业务标题
     */
    @Override
    public WTicketRecord setTitle(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.TITLE</code>. 「title」- 主单业务标题
     */
    @Override
    public String getTitle() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.DESCRIPTION</code>. 「description」-
     * 主单描述内容
     */
    @Override
    public WTicketRecord setDescription(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.DESCRIPTION</code>. 「description」-
     * 主单描述内容
     */
    @Override
    public String getDescription() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CATALOG</code>. 「catalog」- 关联服务目录
     */
    @Override
    public WTicketRecord setCatalog(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CATALOG</code>. 「catalog」- 关联服务目录
     */
    @Override
    public String getCatalog() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CATEGORY</code>. 「category」- 业务类别
     */
    @Override
    public WTicketRecord setCategory(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CATEGORY</code>. 「category」- 业务类别
     */
    @Override
    public String getCategory() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CATEGORY_SUB</code>. 「categorySub」-
     * 子类别
     */
    @Override
    public WTicketRecord setCategorySub(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CATEGORY_SUB</code>. 「categorySub」-
     * 子类别
     */
    @Override
    public String getCategorySub() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.OWNER</code>. 「owner」- 制单人/拥有者
     */
    @Override
    public WTicketRecord setOwner(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.OWNER</code>. 「owner」- 制单人/拥有者
     */
    @Override
    public String getOwner() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.SUPERVISOR</code>. 「supervisor」- 监督人
     */
    @Override
    public WTicketRecord setSupervisor(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.SUPERVISOR</code>. 「supervisor」- 监督人
     */
    @Override
    public String getSupervisor() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.OPEN_BY</code>. 「openBy」- 开单人
     */
    @Override
    public WTicketRecord setOpenBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.OPEN_BY</code>. 「openBy」- 开单人
     */
    @Override
    public String getOpenBy() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.OPEN_AT</code>. 「openAt」- 开单时间
     */
    @Override
    public WTicketRecord setOpenAt(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.OPEN_AT</code>. 「openAt」- 开单时间
     */
    @Override
    public LocalDateTime getOpenAt() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CANCEL_BY</code>. 「cancelBy」- 中断人
     */
    @Override
    public WTicketRecord setCancelBy(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CANCEL_BY</code>. 「cancelBy」- 中断人
     */
    @Override
    public String getCancelBy() {
        return (String) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CANCEL_AT</code>. 「cancelAt」- 中断时间
     */
    @Override
    public WTicketRecord setCancelAt(LocalDateTime value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CANCEL_AT</code>. 「cancelAt」- 中断时间
     */
    @Override
    public LocalDateTime getCancelAt() {
        return (LocalDateTime) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_BY</code>. 「closeBy」- 关闭人
     */
    @Override
    public WTicketRecord setCloseBy(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_BY</code>. 「closeBy」- 关闭人
     */
    @Override
    public String getCloseBy() {
        return (String) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_AT</code>. 「closeAt」- 关闭时间
     */
    @Override
    public WTicketRecord setCloseAt(LocalDateTime value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_AT</code>. 「closeAt」- 关闭时间
     */
    @Override
    public LocalDateTime getCloseAt() {
        return (LocalDateTime) get(28);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_SOLUTION</code>.
     * 「closeSolution」- 关闭解决方案
     */
    @Override
    public WTicketRecord setCloseSolution(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_SOLUTION</code>.
     * 「closeSolution」- 关闭解决方案
     */
    @Override
    public String getCloseSolution() {
        return (String) get(29);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_CODE</code>. 「closeCode」- 关闭代码
     */
    @Override
    public WTicketRecord setCloseCode(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_CODE</code>. 「closeCode」- 关闭代码
     */
    @Override
    public String getCloseCode() {
        return (String) get(30);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_KB</code>. 「closeKb」-
     * 关闭时KB链接地址
     */
    @Override
    public WTicketRecord setCloseKb(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_KB</code>. 「closeKb」-
     * 关闭时KB链接地址
     */
    @Override
    public String getCloseKb() {
        return (String) get(31);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public WTicketRecord setActive(Boolean value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public WTicketRecord setSigma(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(33);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public WTicketRecord setMetadata(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(34);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public WTicketRecord setLanguage(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(35);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public WTicketRecord setCreatedAt(LocalDateTime value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(36);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public WTicketRecord setCreatedBy(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(37);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public WTicketRecord setUpdatedAt(LocalDateTime value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(38);
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public WTicketRecord setUpdatedBy(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(39);
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
    public void from(IWTicket from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setPhase(from.getPhase());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
        setModelComponent(from.getModelComponent());
        setModelChild(from.getModelChild());
        setQuantity(from.getQuantity());
        setFlowDefinitionKey(from.getFlowDefinitionKey());
        setFlowDefinitionId(from.getFlowDefinitionId());
        setFlowInstanceId(from.getFlowInstanceId());
        setFlowEnd(from.getFlowEnd());
        setTitle(from.getTitle());
        setDescription(from.getDescription());
        setCatalog(from.getCatalog());
        setCategory(from.getCategory());
        setCategorySub(from.getCategorySub());
        setOwner(from.getOwner());
        setSupervisor(from.getSupervisor());
        setOpenBy(from.getOpenBy());
        setOpenAt(from.getOpenAt());
        setCancelBy(from.getCancelBy());
        setCancelAt(from.getCancelAt());
        setCloseBy(from.getCloseBy());
        setCloseAt(from.getCloseAt());
        setCloseSolution(from.getCloseSolution());
        setCloseCode(from.getCloseCode());
        setCloseKb(from.getCloseKb());
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
    public <E extends IWTicket> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WTicketRecord
     */
    public WTicketRecord() {
        super(WTicket.W_TICKET);
    }

    /**
     * Create a detached, initialised WTicketRecord
     */
    public WTicketRecord(String key, String serial, String name, String code, String type, String phase, String modelId, String modelKey, String modelCategory, String modelComponent, String modelChild, Integer quantity, String flowDefinitionKey, String flowDefinitionId, String flowInstanceId, Boolean flowEnd, String title, String description, String catalog, String category, String categorySub, String owner, String supervisor, String openBy, LocalDateTime openAt, String cancelBy, LocalDateTime cancelAt, String closeBy, LocalDateTime closeAt, String closeSolution, String closeCode, String closeKb, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(WTicket.W_TICKET);

        setKey(key);
        setSerial(serial);
        setName(name);
        setCode(code);
        setType(type);
        setPhase(phase);
        setModelId(modelId);
        setModelKey(modelKey);
        setModelCategory(modelCategory);
        setModelComponent(modelComponent);
        setModelChild(modelChild);
        setQuantity(quantity);
        setFlowDefinitionKey(flowDefinitionKey);
        setFlowDefinitionId(flowDefinitionId);
        setFlowInstanceId(flowInstanceId);
        setFlowEnd(flowEnd);
        setTitle(title);
        setDescription(description);
        setCatalog(catalog);
        setCategory(category);
        setCategorySub(categorySub);
        setOwner(owner);
        setSupervisor(supervisor);
        setOpenBy(openBy);
        setOpenAt(openAt);
        setCancelBy(cancelBy);
        setCancelAt(cancelAt);
        setCloseBy(closeBy);
        setCloseAt(closeAt);
        setCloseSolution(closeSolution);
        setCloseCode(closeCode);
        setCloseKb(closeKb);
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
     * Create a detached, initialised WTicketRecord
     */
    public WTicketRecord(cn.vertxup.workflow.domain.tables.pojos.WTicket value) {
        super(WTicket.W_TICKET);

        if (value != null) {
            setKey(value.getKey());
            setSerial(value.getSerial());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setPhase(value.getPhase());
            setModelId(value.getModelId());
            setModelKey(value.getModelKey());
            setModelCategory(value.getModelCategory());
            setModelComponent(value.getModelComponent());
            setModelChild(value.getModelChild());
            setQuantity(value.getQuantity());
            setFlowDefinitionKey(value.getFlowDefinitionKey());
            setFlowDefinitionId(value.getFlowDefinitionId());
            setFlowInstanceId(value.getFlowInstanceId());
            setFlowEnd(value.getFlowEnd());
            setTitle(value.getTitle());
            setDescription(value.getDescription());
            setCatalog(value.getCatalog());
            setCategory(value.getCategory());
            setCategorySub(value.getCategorySub());
            setOwner(value.getOwner());
            setSupervisor(value.getSupervisor());
            setOpenBy(value.getOpenBy());
            setOpenAt(value.getOpenAt());
            setCancelBy(value.getCancelBy());
            setCancelAt(value.getCancelAt());
            setCloseBy(value.getCloseBy());
            setCloseAt(value.getCloseAt());
            setCloseSolution(value.getCloseSolution());
            setCloseCode(value.getCloseCode());
            setCloseKb(value.getCloseKb());
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

    public WTicketRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
