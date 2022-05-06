/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.pojos;


import cn.vertxup.jet.domain.tables.interfaces.IIService;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IService implements VertxPojo, IIService {

    private static final long serialVersionUID = 1L;

    private String key;
    private String namespace;
    private String name;
    private String comment;
    private Boolean isWorkflow;
    private Boolean isGraphic;
    private String inScript;
    private String outScript;
    private String channelType;
    private String channelComponent;
    private String channelConfig;
    private String configIntegration;
    private String configDatabase;
    private String dictConfig;
    private String dictComponent;
    private String dictEpsilon;
    private String mappingConfig;
    private String mappingMode;
    private String mappingComponent;
    private String serviceRecord;
    private String serviceComponent;
    private String serviceConfig;
    private String identifier;
    private String identifierComponent;
    private String ruleUnique;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IService() {
    }

    public IService(IIService value) {
        this.key = value.getKey();
        this.namespace = value.getNamespace();
        this.name = value.getName();
        this.comment = value.getComment();
        this.isWorkflow = value.getIsWorkflow();
        this.isGraphic = value.getIsGraphic();
        this.inScript = value.getInScript();
        this.outScript = value.getOutScript();
        this.channelType = value.getChannelType();
        this.channelComponent = value.getChannelComponent();
        this.channelConfig = value.getChannelConfig();
        this.configIntegration = value.getConfigIntegration();
        this.configDatabase = value.getConfigDatabase();
        this.dictConfig = value.getDictConfig();
        this.dictComponent = value.getDictComponent();
        this.dictEpsilon = value.getDictEpsilon();
        this.mappingConfig = value.getMappingConfig();
        this.mappingMode = value.getMappingMode();
        this.mappingComponent = value.getMappingComponent();
        this.serviceRecord = value.getServiceRecord();
        this.serviceComponent = value.getServiceComponent();
        this.serviceConfig = value.getServiceConfig();
        this.identifier = value.getIdentifier();
        this.identifierComponent = value.getIdentifierComponent();
        this.ruleUnique = value.getRuleUnique();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public IService(
        String key,
        String namespace,
        String name,
        String comment,
        Boolean isWorkflow,
        Boolean isGraphic,
        String inScript,
        String outScript,
        String channelType,
        String channelComponent,
        String channelConfig,
        String configIntegration,
        String configDatabase,
        String dictConfig,
        String dictComponent,
        String dictEpsilon,
        String mappingConfig,
        String mappingMode,
        String mappingComponent,
        String serviceRecord,
        String serviceComponent,
        String serviceConfig,
        String identifier,
        String identifierComponent,
        String ruleUnique,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.namespace = namespace;
        this.name = name;
        this.comment = comment;
        this.isWorkflow = isWorkflow;
        this.isGraphic = isGraphic;
        this.inScript = inScript;
        this.outScript = outScript;
        this.channelType = channelType;
        this.channelComponent = channelComponent;
        this.channelConfig = channelConfig;
        this.configIntegration = configIntegration;
        this.configDatabase = configDatabase;
        this.dictConfig = dictConfig;
        this.dictComponent = dictComponent;
        this.dictEpsilon = dictEpsilon;
        this.mappingConfig = mappingConfig;
        this.mappingMode = mappingMode;
        this.mappingComponent = mappingComponent;
        this.serviceRecord = serviceRecord;
        this.serviceComponent = serviceComponent;
        this.serviceConfig = serviceConfig;
        this.identifier = identifier;
        this.identifierComponent = identifierComponent;
        this.ruleUnique = ruleUnique;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public IService(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.KEY</code>. 「key」- 服务ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.KEY</code>. 「key」- 服务ID
     */
    @Override
    public IService setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.NAMESPACE</code>. 「namespace」-
     * 服务所在名空间
     */
    @Override
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.NAMESPACE</code>. 「namespace」-
     * 服务所在名空间
     */
    @Override
    public IService setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.NAME</code>. 「name」- 服务名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.NAME</code>. 「name」- 服务名称
     */
    @Override
    public IService setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public IService setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IS_WORKFLOW</code>. 「isWorkflow」-
     * 是否驱动工作流引擎
     */
    @Override
    public Boolean getIsWorkflow() {
        return this.isWorkflow;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IS_WORKFLOW</code>. 「isWorkflow」-
     * 是否驱动工作流引擎
     */
    @Override
    public IService setIsWorkflow(Boolean isWorkflow) {
        this.isWorkflow = isWorkflow;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IS_GRAPHIC</code>. 「isGraphic」-
     * 是否驱动图引擎
     */
    @Override
    public Boolean getIsGraphic() {
        return this.isGraphic;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IS_GRAPHIC</code>. 「isGraphic」-
     * 是否驱动图引擎
     */
    @Override
    public IService setIsGraphic(Boolean isGraphic) {
        this.isGraphic = isGraphic;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IN_SCRIPT</code>. 「inScript」-
     * 本次不使用，加载脚本引擎ScriptEngine前置脚本
     */
    @Override
    public String getInScript() {
        return this.inScript;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IN_SCRIPT</code>. 「inScript」-
     * 本次不使用，加载脚本引擎ScriptEngine前置脚本
     */
    @Override
    public IService setInScript(String inScript) {
        this.inScript = inScript;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.OUT_SCRIPT</code>. 「outScript」-
     * 本次不使用，加载脚本引擎ScriptEngine后置脚本
     */
    @Override
    public String getOutScript() {
        return this.outScript;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.OUT_SCRIPT</code>. 「outScript」-
     * 本次不使用，加载脚本引擎ScriptEngine后置脚本
     */
    @Override
    public IService setOutScript(String outScript) {
        this.outScript = outScript;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_TYPE</code>. 「channelType」-
     * 通道类型：ADAPTOR / CONNECTOR / ACTOR / DIRECTOR / DEFINE
     */
    @Override
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_TYPE</code>. 「channelType」-
     * 通道类型：ADAPTOR / CONNECTOR / ACTOR / DIRECTOR / DEFINE
     */
    @Override
    public IService setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_COMPONENT</code>.
     * 「channelComponent」- 自定义通道专用组件
     */
    @Override
    public String getChannelComponent() {
        return this.channelComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_COMPONENT</code>.
     * 「channelComponent」- 自定义通道专用组件
     */
    @Override
    public IService setChannelComponent(String channelComponent) {
        this.channelComponent = channelComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_CONFIG</code>.
     * 「channelConfig」- 通道（自定义）配置信息，Channel专用
     */
    @Override
    public String getChannelConfig() {
        return this.channelConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_CONFIG</code>.
     * 「channelConfig」- 通道（自定义）配置信息，Channel专用
     */
    @Override
    public IService setChannelConfig(String channelConfig) {
        this.channelConfig = channelConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CONFIG_INTEGRATION</code>.
     * 「configIntegration」- 集成配置信息，第三方专用
     */
    @Override
    public String getConfigIntegration() {
        return this.configIntegration;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CONFIG_INTEGRATION</code>.
     * 「configIntegration」- 集成配置信息，第三方专用
     */
    @Override
    public IService setConfigIntegration(String configIntegration) {
        this.configIntegration = configIntegration;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CONFIG_DATABASE</code>.
     * 「configDatabase」- 数据库配置，当前通道访问的Database
     */
    @Override
    public String getConfigDatabase() {
        return this.configDatabase;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CONFIG_DATABASE</code>.
     * 「configDatabase」- 数据库配置，当前通道访问的Database
     */
    @Override
    public IService setConfigDatabase(String configDatabase) {
        this.configDatabase = configDatabase;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.DICT_CONFIG</code>. 「dictConfig」-
     * 字典的配置信息
     */
    @Override
    public String getDictConfig() {
        return this.dictConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.DICT_CONFIG</code>. 「dictConfig」-
     * 字典的配置信息
     */
    @Override
    public IService setDictConfig(String dictConfig) {
        this.dictConfig = dictConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.DICT_COMPONENT</code>.
     * 「dictComponent」- 字典配置中的插件
     */
    @Override
    public String getDictComponent() {
        return this.dictComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.DICT_COMPONENT</code>.
     * 「dictComponent」- 字典配置中的插件
     */
    @Override
    public IService setDictComponent(String dictComponent) {
        this.dictComponent = dictComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.DICT_EPSILON</code>. 「dictEpsilon」-
     * 字典的消费配置
     */
    @Override
    public String getDictEpsilon() {
        return this.dictEpsilon;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.DICT_EPSILON</code>. 「dictEpsilon」-
     * 字典的消费配置
     */
    @Override
    public IService setDictEpsilon(String dictEpsilon) {
        this.dictEpsilon = dictEpsilon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.MAPPING_CONFIG</code>.
     * 「mappingConfig」- 映射专用配置
     */
    @Override
    public String getMappingConfig() {
        return this.mappingConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.MAPPING_CONFIG</code>.
     * 「mappingConfig」- 映射专用配置
     */
    @Override
    public IService setMappingConfig(String mappingConfig) {
        this.mappingConfig = mappingConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.MAPPING_MODE</code>. 「mappingMode」-
     * 映射的模式
     */
    @Override
    public String getMappingMode() {
        return this.mappingMode;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.MAPPING_MODE</code>. 「mappingMode」-
     * 映射的模式
     */
    @Override
    public IService setMappingMode(String mappingMode) {
        this.mappingMode = mappingMode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.MAPPING_COMPONENT</code>.
     * 「mappingComponent」- 映射组件类型
     */
    @Override
    public String getMappingComponent() {
        return this.mappingComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.MAPPING_COMPONENT</code>.
     * 「mappingComponent」- 映射组件类型
     */
    @Override
    public IService setMappingComponent(String mappingComponent) {
        this.mappingComponent = mappingComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SERVICE_RECORD</code>.
     * 「serviceRecord」- 服务记录定义
     */
    @Override
    public String getServiceRecord() {
        return this.serviceRecord;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SERVICE_RECORD</code>.
     * 「serviceRecord」- 服务记录定义
     */
    @Override
    public IService setServiceRecord(String serviceRecord) {
        this.serviceRecord = serviceRecord;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SERVICE_COMPONENT</code>.
     * 「serviceComponent」- 服务组件定义
     */
    @Override
    public String getServiceComponent() {
        return this.serviceComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SERVICE_COMPONENT</code>.
     * 「serviceComponent」- 服务组件定义
     */
    @Override
    public IService setServiceComponent(String serviceComponent) {
        this.serviceComponent = serviceComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SERVICE_CONFIG</code>.
     * 「serviceConfig」- 业务组件配置，业务组件专用
     */
    @Override
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SERVICE_CONFIG</code>.
     * 「serviceConfig」- 业务组件配置，业务组件专用
     */
    @Override
    public IService setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER</code>. 「identifier」-
     * 当前类型描述的Model的标识
     */
    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER</code>. 「identifier」-
     * 当前类型描述的Model的标识
     */
    @Override
    public IService setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER_COMPONENT</code>.
     * 「identifierComponent」- 当前业务接口使用的标识选择器
     */
    @Override
    public String getIdentifierComponent() {
        return this.identifierComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER_COMPONENT</code>.
     * 「identifierComponent」- 当前业务接口使用的标识选择器
     */
    @Override
    public IService setIdentifierComponent(String identifierComponent) {
        this.identifierComponent = identifierComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.RULE_UNIQUE</code>. 「ruleUnique」-
     * 第二标识规则，当前通道的专用标识规则RuleUnique
     */
    @Override
    public String getRuleUnique() {
        return this.ruleUnique;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.RULE_UNIQUE</code>. 「ruleUnique」-
     * 第二标识规则，当前通道的专用标识规则RuleUnique
     */
    @Override
    public IService setRuleUnique(String ruleUnique) {
        this.ruleUnique = ruleUnique;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IService setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public IService setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IService setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public IService setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public IService setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public IService setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public IService setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public IService setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IService (");

        sb.append(key);
        sb.append(", ").append(namespace);
        sb.append(", ").append(name);
        sb.append(", ").append(comment);
        sb.append(", ").append(isWorkflow);
        sb.append(", ").append(isGraphic);
        sb.append(", ").append(inScript);
        sb.append(", ").append(outScript);
        sb.append(", ").append(channelType);
        sb.append(", ").append(channelComponent);
        sb.append(", ").append(channelConfig);
        sb.append(", ").append(configIntegration);
        sb.append(", ").append(configDatabase);
        sb.append(", ").append(dictConfig);
        sb.append(", ").append(dictComponent);
        sb.append(", ").append(dictEpsilon);
        sb.append(", ").append(mappingConfig);
        sb.append(", ").append(mappingMode);
        sb.append(", ").append(mappingComponent);
        sb.append(", ").append(serviceRecord);
        sb.append(", ").append(serviceComponent);
        sb.append(", ").append(serviceConfig);
        sb.append(", ").append(identifier);
        sb.append(", ").append(identifierComponent);
        sb.append(", ").append(ruleUnique);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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
    public void from(IIService from) {
        setKey(from.getKey());
        setNamespace(from.getNamespace());
        setName(from.getName());
        setComment(from.getComment());
        setIsWorkflow(from.getIsWorkflow());
        setIsGraphic(from.getIsGraphic());
        setInScript(from.getInScript());
        setOutScript(from.getOutScript());
        setChannelType(from.getChannelType());
        setChannelComponent(from.getChannelComponent());
        setChannelConfig(from.getChannelConfig());
        setConfigIntegration(from.getConfigIntegration());
        setConfigDatabase(from.getConfigDatabase());
        setDictConfig(from.getDictConfig());
        setDictComponent(from.getDictComponent());
        setDictEpsilon(from.getDictEpsilon());
        setMappingConfig(from.getMappingConfig());
        setMappingMode(from.getMappingMode());
        setMappingComponent(from.getMappingComponent());
        setServiceRecord(from.getServiceRecord());
        setServiceComponent(from.getServiceComponent());
        setServiceConfig(from.getServiceConfig());
        setIdentifier(from.getIdentifier());
        setIdentifierComponent(from.getIdentifierComponent());
        setRuleUnique(from.getRuleUnique());
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
    public <E extends IIService> E into(E into) {
        into.from(this);
        return into;
    }
}
