/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.pojos;


import cn.vertxup.integration.domain.tables.interfaces.IIIntegration;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IIntegration implements VertxPojo, IIIntegration {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String type;
    private String ipV4;
    private String ipV6;
    private String hostname;
    private Integer port;
    private String protocol;
    private Integer securePort;
    private String secureProtocol;
    private String endpoint;
    private String path;
    private String osKey;
    private String osSecret;
    private String osAuthorize;
    private String osToken;
    private String username;
    private String password;
    private String publicKey;
    private String options;
    private String appId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IIntegration() {}

    public IIntegration(IIIntegration value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.type = value.getType();
        this.ipV4 = value.getIpV4();
        this.ipV6 = value.getIpV6();
        this.hostname = value.getHostname();
        this.port = value.getPort();
        this.protocol = value.getProtocol();
        this.securePort = value.getSecurePort();
        this.secureProtocol = value.getSecureProtocol();
        this.endpoint = value.getEndpoint();
        this.path = value.getPath();
        this.osKey = value.getOsKey();
        this.osSecret = value.getOsSecret();
        this.osAuthorize = value.getOsAuthorize();
        this.osToken = value.getOsToken();
        this.username = value.getUsername();
        this.password = value.getPassword();
        this.publicKey = value.getPublicKey();
        this.options = value.getOptions();
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

    public IIntegration(
        String key,
        String name,
        String type,
        String ipV4,
        String ipV6,
        String hostname,
        Integer port,
        String protocol,
        Integer securePort,
        String secureProtocol,
        String endpoint,
        String path,
        String osKey,
        String osSecret,
        String osAuthorize,
        String osToken,
        String username,
        String password,
        String publicKey,
        String options,
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
        this.type = type;
        this.ipV4 = ipV4;
        this.ipV6 = ipV6;
        this.hostname = hostname;
        this.port = port;
        this.protocol = protocol;
        this.securePort = securePort;
        this.secureProtocol = secureProtocol;
        this.endpoint = endpoint;
        this.path = path;
        this.osKey = osKey;
        this.osSecret = osSecret;
        this.osAuthorize = osAuthorize;
        this.osToken = osToken;
        this.username = username;
        this.password = password;
        this.publicKey = publicKey;
        this.options = options;
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

        public IIntegration(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    @Override
    public IIntegration setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    @Override
    public IIntegration setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    @Override
    public IIntegration setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public String getIpV4() {
        return this.ipV4;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public IIntegration setIpV4(String ipV4) {
        this.ipV4 = ipV4;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public String getIpV6() {
        return this.ipV6;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public IIntegration setIpV6(String ipV6) {
        this.ipV6 = ipV6;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public String getHostname() {
        return this.hostname;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public IIntegration setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    @Override
    public Integer getPort() {
        return this.port;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    @Override
    public IIntegration setPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    @Override
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    @Override
    public IIntegration setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.SECURE_PORT</code>.
     * 「securePort」- 传输层安全接口
     */
    @Override
    public Integer getSecurePort() {
        return this.securePort;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.SECURE_PORT</code>.
     * 「securePort」- 传输层安全接口
     */
    @Override
    public IIntegration setSecurePort(Integer securePort) {
        this.securePort = securePort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.SECURE_PROTOCOL</code>.
     * 「secureProtocol」- 传入层协议：TLS / SSL（邮件服务器需要）
     */
    @Override
    public String getSecureProtocol() {
        return this.secureProtocol;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.SECURE_PROTOCOL</code>.
     * 「secureProtocol」- 传入层协议：TLS / SSL（邮件服务器需要）
     */
    @Override
    public IIntegration setSecureProtocol(String secureProtocol) {
        this.secureProtocol = secureProtocol;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.ENDPOINT</code>. 「endpoint」-
     * 端地址
     */
    @Override
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.ENDPOINT</code>. 「endpoint」-
     * 端地址
     */
    @Override
    public IIntegration setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    @Override
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    @Override
    public IIntegration setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    @Override
    public String getOsKey() {
        return this.osKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    @Override
    public IIntegration setOsKey(String osKey) {
        this.osKey = osKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    @Override
    public String getOsSecret() {
        return this.osSecret;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    @Override
    public IIntegration setOsSecret(String osSecret) {
        this.osSecret = osSecret;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.OS_AUTHORIZE</code>.
     * 「osAuthorize」- Authorize接口
     */
    @Override
    public String getOsAuthorize() {
        return this.osAuthorize;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.OS_AUTHORIZE</code>.
     * 「osAuthorize」- Authorize接口
     */
    @Override
    public IIntegration setOsAuthorize(String osAuthorize) {
        this.osAuthorize = osAuthorize;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.OS_TOKEN</code>. 「osToken」-
     * Token接口
     */
    @Override
    public String getOsToken() {
        return this.osToken;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.OS_TOKEN</code>. 「osToken」-
     * Token接口
     */
    @Override
    public IIntegration setOsToken(String osToken) {
        this.osToken = osToken;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    @Override
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    @Override
    public IIntegration setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    @Override
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    @Override
    public IIntegration setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」-
     * Key文件
     */
    @Override
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」-
     * Key文件
     */
    @Override
    public IIntegration setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.OPTIONS</code>. 「options」-
     * 集成相关配置
     */
    @Override
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.OPTIONS</code>. 「options」-
     * 集成相关配置
     */
    @Override
    public IIntegration setOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.APP_ID</code>. 「appId」-
     * 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.APP_ID</code>. 「appId」-
     * 关联的应用程序ID
     */
    @Override
    public IIntegration setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IIntegration setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IIntegration setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public IIntegration setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public IIntegration setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public IIntegration setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public IIntegration setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public IIntegration setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_INTEGRATION.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_INTEGRATION.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public IIntegration setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final IIntegration other = (IIntegration) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.ipV4 == null) {
            if (other.ipV4 != null)
                return false;
        }
        else if (!this.ipV4.equals(other.ipV4))
            return false;
        if (this.ipV6 == null) {
            if (other.ipV6 != null)
                return false;
        }
        else if (!this.ipV6.equals(other.ipV6))
            return false;
        if (this.hostname == null) {
            if (other.hostname != null)
                return false;
        }
        else if (!this.hostname.equals(other.hostname))
            return false;
        if (this.port == null) {
            if (other.port != null)
                return false;
        }
        else if (!this.port.equals(other.port))
            return false;
        if (this.protocol == null) {
            if (other.protocol != null)
                return false;
        }
        else if (!this.protocol.equals(other.protocol))
            return false;
        if (this.securePort == null) {
            if (other.securePort != null)
                return false;
        }
        else if (!this.securePort.equals(other.securePort))
            return false;
        if (this.secureProtocol == null) {
            if (other.secureProtocol != null)
                return false;
        }
        else if (!this.secureProtocol.equals(other.secureProtocol))
            return false;
        if (this.endpoint == null) {
            if (other.endpoint != null)
                return false;
        }
        else if (!this.endpoint.equals(other.endpoint))
            return false;
        if (this.path == null) {
            if (other.path != null)
                return false;
        }
        else if (!this.path.equals(other.path))
            return false;
        if (this.osKey == null) {
            if (other.osKey != null)
                return false;
        }
        else if (!this.osKey.equals(other.osKey))
            return false;
        if (this.osSecret == null) {
            if (other.osSecret != null)
                return false;
        }
        else if (!this.osSecret.equals(other.osSecret))
            return false;
        if (this.osAuthorize == null) {
            if (other.osAuthorize != null)
                return false;
        }
        else if (!this.osAuthorize.equals(other.osAuthorize))
            return false;
        if (this.osToken == null) {
            if (other.osToken != null)
                return false;
        }
        else if (!this.osToken.equals(other.osToken))
            return false;
        if (this.username == null) {
            if (other.username != null)
                return false;
        }
        else if (!this.username.equals(other.username))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.publicKey == null) {
            if (other.publicKey != null)
                return false;
        }
        else if (!this.publicKey.equals(other.publicKey))
            return false;
        if (this.options == null) {
            if (other.options != null)
                return false;
        }
        else if (!this.options.equals(other.options))
            return false;
        if (this.appId == null) {
            if (other.appId != null)
                return false;
        }
        else if (!this.appId.equals(other.appId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.ipV4 == null) ? 0 : this.ipV4.hashCode());
        result = prime * result + ((this.ipV6 == null) ? 0 : this.ipV6.hashCode());
        result = prime * result + ((this.hostname == null) ? 0 : this.hostname.hashCode());
        result = prime * result + ((this.port == null) ? 0 : this.port.hashCode());
        result = prime * result + ((this.protocol == null) ? 0 : this.protocol.hashCode());
        result = prime * result + ((this.securePort == null) ? 0 : this.securePort.hashCode());
        result = prime * result + ((this.secureProtocol == null) ? 0 : this.secureProtocol.hashCode());
        result = prime * result + ((this.endpoint == null) ? 0 : this.endpoint.hashCode());
        result = prime * result + ((this.path == null) ? 0 : this.path.hashCode());
        result = prime * result + ((this.osKey == null) ? 0 : this.osKey.hashCode());
        result = prime * result + ((this.osSecret == null) ? 0 : this.osSecret.hashCode());
        result = prime * result + ((this.osAuthorize == null) ? 0 : this.osAuthorize.hashCode());
        result = prime * result + ((this.osToken == null) ? 0 : this.osToken.hashCode());
        result = prime * result + ((this.username == null) ? 0 : this.username.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.publicKey == null) ? 0 : this.publicKey.hashCode());
        result = prime * result + ((this.options == null) ? 0 : this.options.hashCode());
        result = prime * result + ((this.appId == null) ? 0 : this.appId.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IIntegration (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(ipV4);
        sb.append(", ").append(ipV6);
        sb.append(", ").append(hostname);
        sb.append(", ").append(port);
        sb.append(", ").append(protocol);
        sb.append(", ").append(securePort);
        sb.append(", ").append(secureProtocol);
        sb.append(", ").append(endpoint);
        sb.append(", ").append(path);
        sb.append(", ").append(osKey);
        sb.append(", ").append(osSecret);
        sb.append(", ").append(osAuthorize);
        sb.append(", ").append(osToken);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(publicKey);
        sb.append(", ").append(options);
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
    public void from(IIIntegration from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setIpV4(from.getIpV4());
        setIpV6(from.getIpV6());
        setHostname(from.getHostname());
        setPort(from.getPort());
        setProtocol(from.getProtocol());
        setSecurePort(from.getSecurePort());
        setSecureProtocol(from.getSecureProtocol());
        setEndpoint(from.getEndpoint());
        setPath(from.getPath());
        setOsKey(from.getOsKey());
        setOsSecret(from.getOsSecret());
        setOsAuthorize(from.getOsAuthorize());
        setOsToken(from.getOsToken());
        setUsername(from.getUsername());
        setPassword(from.getPassword());
        setPublicKey(from.getPublicKey());
        setOptions(from.getOptions());
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
    public <E extends IIIntegration> E into(E into) {
        into.from(this);
        return into;
    }
}
