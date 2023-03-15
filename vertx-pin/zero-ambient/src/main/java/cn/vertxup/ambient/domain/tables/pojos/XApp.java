/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXApp;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XApp implements VertxPojo, IXApp {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String title;
    private String logo;
    private String icp;
    private String copyRight;
    private String email;
    private String domain;
    private Integer appPort;
    private String urlEntry;
    private String urlMain;
    private String path;
    private String route;
    private String appKey;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public XApp() {}

    public XApp(IXApp value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.title = value.getTitle();
        this.logo = value.getLogo();
        this.icp = value.getIcp();
        this.copyRight = value.getCopyRight();
        this.email = value.getEmail();
        this.domain = value.getDomain();
        this.appPort = value.getAppPort();
        this.urlEntry = value.getUrlEntry();
        this.urlMain = value.getUrlMain();
        this.path = value.getPath();
        this.route = value.getRoute();
        this.appKey = value.getAppKey();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XApp(
        String key,
        String name,
        String code,
        String title,
        String logo,
        String icp,
        String copyRight,
        String email,
        String domain,
        Integer appPort,
        String urlEntry,
        String urlMain,
        String path,
        String route,
        String appKey,
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
        this.code = code;
        this.title = title;
        this.logo = logo;
        this.icp = icp;
        this.copyRight = copyRight;
        this.email = email;
        this.domain = domain;
        this.appPort = appPort;
        this.urlEntry = urlEntry;
        this.urlMain = urlMain;
        this.path = path;
        this.route = route;
        this.appKey = appKey;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XApp(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    @Override
    public XApp setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    @Override
    public XApp setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    @Override
    public XApp setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    @Override
    public XApp setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    @Override
    public String getLogo() {
        return this.logo;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    @Override
    public XApp setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.ICP</code>. 「icp」- ICP备案号
     */
    @Override
    public String getIcp() {
        return this.icp;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.ICP</code>. 「icp」- ICP备案号
     */
    @Override
    public XApp setIcp(String icp) {
        this.icp = icp;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.COPY_RIGHT</code>. 「copyRight」-
     * CopyRight版权信息
     */
    @Override
    public String getCopyRight() {
        return this.copyRight;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.COPY_RIGHT</code>. 「copyRight」-
     * CopyRight版权信息
     */
    @Override
    public XApp setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.EMAIL</code>. 「email」- 应用Email信息
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.EMAIL</code>. 「email」- 应用Email信息
     */
    @Override
    public XApp setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    @Override
    public String getDomain() {
        return this.domain;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    @Override
    public XApp setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.APP_PORT</code>. 「appPort」-
     * 应用程序端口号，和SOURCE的端口号区别开
     */
    @Override
    public Integer getAppPort() {
        return this.appPort;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.APP_PORT</code>. 「appPort」-
     * 应用程序端口号，和SOURCE的端口号区别开
     */
    @Override
    public XApp setAppPort(Integer appPort) {
        this.appPort = appPort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.URL_ENTRY</code>. 「urlEntry」—
     * 应用程序入口页面（登录页）
     */
    @Override
    public String getUrlEntry() {
        return this.urlEntry;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.URL_ENTRY</code>. 「urlEntry」—
     * 应用程序入口页面（登录页）
     */
    @Override
    public XApp setUrlEntry(String urlEntry) {
        this.urlEntry = urlEntry;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.URL_MAIN</code>. 「urlMain」-
     * 应用程序内置主页（带安全）
     */
    @Override
    public String getUrlMain() {
        return this.urlMain;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.URL_MAIN</code>. 「urlMain」-
     * 应用程序内置主页（带安全）
     */
    @Override
    public XApp setUrlMain(String urlMain) {
        this.urlMain = urlMain;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    @Override
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    @Override
    public XApp setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    @Override
    public String getRoute() {
        return this.route;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    @Override
    public XApp setRoute(String route) {
        this.route = route;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.APP_KEY</code>. 「appKey」-
     * 应用程序专用唯一hashKey
     */
    @Override
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.APP_KEY</code>. 「appKey」-
     * 应用程序专用唯一hashKey
     */
    @Override
    public XApp setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XApp setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XApp setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XApp setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XApp setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XApp setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XApp setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XApp setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_APP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_APP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XApp setUpdatedBy(String updatedBy) {
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
        final XApp other = (XApp) obj;
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
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.logo == null) {
            if (other.logo != null)
                return false;
        }
        else if (!this.logo.equals(other.logo))
            return false;
        if (this.icp == null) {
            if (other.icp != null)
                return false;
        }
        else if (!this.icp.equals(other.icp))
            return false;
        if (this.copyRight == null) {
            if (other.copyRight != null)
                return false;
        }
        else if (!this.copyRight.equals(other.copyRight))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.domain == null) {
            if (other.domain != null)
                return false;
        }
        else if (!this.domain.equals(other.domain))
            return false;
        if (this.appPort == null) {
            if (other.appPort != null)
                return false;
        }
        else if (!this.appPort.equals(other.appPort))
            return false;
        if (this.urlEntry == null) {
            if (other.urlEntry != null)
                return false;
        }
        else if (!this.urlEntry.equals(other.urlEntry))
            return false;
        if (this.urlMain == null) {
            if (other.urlMain != null)
                return false;
        }
        else if (!this.urlMain.equals(other.urlMain))
            return false;
        if (this.path == null) {
            if (other.path != null)
                return false;
        }
        else if (!this.path.equals(other.path))
            return false;
        if (this.route == null) {
            if (other.route != null)
                return false;
        }
        else if (!this.route.equals(other.route))
            return false;
        if (this.appKey == null) {
            if (other.appKey != null)
                return false;
        }
        else if (!this.appKey.equals(other.appKey))
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
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.logo == null) ? 0 : this.logo.hashCode());
        result = prime * result + ((this.icp == null) ? 0 : this.icp.hashCode());
        result = prime * result + ((this.copyRight == null) ? 0 : this.copyRight.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.domain == null) ? 0 : this.domain.hashCode());
        result = prime * result + ((this.appPort == null) ? 0 : this.appPort.hashCode());
        result = prime * result + ((this.urlEntry == null) ? 0 : this.urlEntry.hashCode());
        result = prime * result + ((this.urlMain == null) ? 0 : this.urlMain.hashCode());
        result = prime * result + ((this.path == null) ? 0 : this.path.hashCode());
        result = prime * result + ((this.route == null) ? 0 : this.route.hashCode());
        result = prime * result + ((this.appKey == null) ? 0 : this.appKey.hashCode());
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
        StringBuilder sb = new StringBuilder("XApp (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(title);
        sb.append(", ").append(logo);
        sb.append(", ").append(icp);
        sb.append(", ").append(copyRight);
        sb.append(", ").append(email);
        sb.append(", ").append(domain);
        sb.append(", ").append(appPort);
        sb.append(", ").append(urlEntry);
        sb.append(", ").append(urlMain);
        sb.append(", ").append(path);
        sb.append(", ").append(route);
        sb.append(", ").append(appKey);
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
    public void from(IXApp from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setTitle(from.getTitle());
        setLogo(from.getLogo());
        setIcp(from.getIcp());
        setCopyRight(from.getCopyRight());
        setEmail(from.getEmail());
        setDomain(from.getDomain());
        setAppPort(from.getAppPort());
        setUrlEntry(from.getUrlEntry());
        setUrlMain(from.getUrlMain());
        setPath(from.getPath());
        setRoute(from.getRoute());
        setAppKey(from.getAppKey());
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
    public <E extends IXApp> E into(E into) {
        into.from(this);
        return into;
    }
}
