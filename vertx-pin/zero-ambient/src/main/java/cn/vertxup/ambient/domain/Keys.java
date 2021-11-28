/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain;


import cn.vertxup.ambient.domain.tables.XActivity;
import cn.vertxup.ambient.domain.tables.XActivityChange;
import cn.vertxup.ambient.domain.tables.XApp;
import cn.vertxup.ambient.domain.tables.XAttachment;
import cn.vertxup.ambient.domain.tables.XCategory;
import cn.vertxup.ambient.domain.tables.XEmailServer;
import cn.vertxup.ambient.domain.tables.XIntegration;
import cn.vertxup.ambient.domain.tables.XLog;
import cn.vertxup.ambient.domain.tables.XMenu;
import cn.vertxup.ambient.domain.tables.XMenuMy;
import cn.vertxup.ambient.domain.tables.XModule;
import cn.vertxup.ambient.domain.tables.XNotification;
import cn.vertxup.ambient.domain.tables.XNumber;
import cn.vertxup.ambient.domain.tables.XSource;
import cn.vertxup.ambient.domain.tables.XTabular;
import cn.vertxup.ambient.domain.tables.records.XActivityChangeRecord;
import cn.vertxup.ambient.domain.tables.records.XActivityRecord;
import cn.vertxup.ambient.domain.tables.records.XAppRecord;
import cn.vertxup.ambient.domain.tables.records.XAttachmentRecord;
import cn.vertxup.ambient.domain.tables.records.XCategoryRecord;
import cn.vertxup.ambient.domain.tables.records.XEmailServerRecord;
import cn.vertxup.ambient.domain.tables.records.XIntegrationRecord;
import cn.vertxup.ambient.domain.tables.records.XLogRecord;
import cn.vertxup.ambient.domain.tables.records.XMenuMyRecord;
import cn.vertxup.ambient.domain.tables.records.XMenuRecord;
import cn.vertxup.ambient.domain.tables.records.XModuleRecord;
import cn.vertxup.ambient.domain.tables.records.XNotificationRecord;
import cn.vertxup.ambient.domain.tables.records.XNumberRecord;
import cn.vertxup.ambient.domain.tables.records.XSourceRecord;
import cn.vertxup.ambient.domain.tables.records.XTabularRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * DB_ETERNAL.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<XActivityRecord> KEY_X_ACTIVITY_PRIMARY = Internal.createUniqueKey(XActivity.X_ACTIVITY, DSL.name("KEY_X_ACTIVITY_PRIMARY"), new TableField[] { XActivity.X_ACTIVITY.KEY }, true);
    public static final UniqueKey<XActivityChangeRecord> KEY_X_ACTIVITY_CHANGE_PRIMARY = Internal.createUniqueKey(XActivityChange.X_ACTIVITY_CHANGE, DSL.name("KEY_X_ACTIVITY_CHANGE_PRIMARY"), new TableField[] { XActivityChange.X_ACTIVITY_CHANGE.KEY }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_CODE = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_CODE"), new TableField[] { XApp.X_APP.CODE }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_NAME = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_NAME"), new TableField[] { XApp.X_APP.NAME }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_PATH = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_PATH"), new TableField[] { XApp.X_APP.PATH, XApp.X_APP.URL_ENTRY }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_PATH_2 = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_PATH_2"), new TableField[] { XApp.X_APP.PATH, XApp.X_APP.URL_MAIN }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_PRIMARY = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_PRIMARY"), new TableField[] { XApp.X_APP.KEY }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_FILE_KEY = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_FILE_KEY"), new TableField[] { XAttachment.X_ATTACHMENT.FILE_KEY }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_FILE_PATH = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_FILE_PATH"), new TableField[] { XAttachment.X_ATTACHMENT.FILE_PATH }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_FILE_URL = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_FILE_URL"), new TableField[] { XAttachment.X_ATTACHMENT.FILE_URL }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_PRIMARY = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_PRIMARY"), new TableField[] { XAttachment.X_ATTACHMENT.KEY }, true);
    public static final UniqueKey<XCategoryRecord> KEY_X_CATEGORY_APP_ID = Internal.createUniqueKey(XCategory.X_CATEGORY, DSL.name("KEY_X_CATEGORY_APP_ID"), new TableField[] { XCategory.X_CATEGORY.APP_ID, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.CODE }, true);
    public static final UniqueKey<XCategoryRecord> KEY_X_CATEGORY_PRIMARY = Internal.createUniqueKey(XCategory.X_CATEGORY, DSL.name("KEY_X_CATEGORY_PRIMARY"), new TableField[] { XCategory.X_CATEGORY.KEY }, true);
    public static final UniqueKey<XCategoryRecord> KEY_X_CATEGORY_SIGMA = Internal.createUniqueKey(XCategory.X_CATEGORY, DSL.name("KEY_X_CATEGORY_SIGMA"), new TableField[] { XCategory.X_CATEGORY.SIGMA, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.CODE }, true);
    public static final UniqueKey<XEmailServerRecord> KEY_X_EMAIL_SERVER_APP_ID = Internal.createUniqueKey(XEmailServer.X_EMAIL_SERVER, DSL.name("KEY_X_EMAIL_SERVER_APP_ID"), new TableField[] { XEmailServer.X_EMAIL_SERVER.APP_ID, XEmailServer.X_EMAIL_SERVER.IP_V4, XEmailServer.X_EMAIL_SERVER.PORT }, true);
    public static final UniqueKey<XEmailServerRecord> KEY_X_EMAIL_SERVER_APP_ID_2 = Internal.createUniqueKey(XEmailServer.X_EMAIL_SERVER, DSL.name("KEY_X_EMAIL_SERVER_APP_ID_2"), new TableField[] { XEmailServer.X_EMAIL_SERVER.APP_ID, XEmailServer.X_EMAIL_SERVER.IP_V6, XEmailServer.X_EMAIL_SERVER.PORT }, true);
    public static final UniqueKey<XEmailServerRecord> KEY_X_EMAIL_SERVER_PRIMARY = Internal.createUniqueKey(XEmailServer.X_EMAIL_SERVER, DSL.name("KEY_X_EMAIL_SERVER_PRIMARY"), new TableField[] { XEmailServer.X_EMAIL_SERVER.KEY }, true);
    public static final UniqueKey<XIntegrationRecord> KEY_X_INTEGRATION_ENDPOINT = Internal.createUniqueKey(XIntegration.X_INTEGRATION, DSL.name("KEY_X_INTEGRATION_ENDPOINT"), new TableField[] { XIntegration.X_INTEGRATION.ENDPOINT, XIntegration.X_INTEGRATION.PATH, XIntegration.X_INTEGRATION.APP_ID }, true);
    public static final UniqueKey<XIntegrationRecord> KEY_X_INTEGRATION_PRIMARY = Internal.createUniqueKey(XIntegration.X_INTEGRATION, DSL.name("KEY_X_INTEGRATION_PRIMARY"), new TableField[] { XIntegration.X_INTEGRATION.KEY }, true);
    public static final UniqueKey<XLogRecord> KEY_X_LOG_PRIMARY = Internal.createUniqueKey(XLog.X_LOG, DSL.name("KEY_X_LOG_PRIMARY"), new TableField[] { XLog.X_LOG.KEY }, true);
    public static final UniqueKey<XMenuRecord> KEY_X_MENU_NAME = Internal.createUniqueKey(XMenu.X_MENU, DSL.name("KEY_X_MENU_NAME"), new TableField[] { XMenu.X_MENU.NAME, XMenu.X_MENU.APP_ID }, true);
    public static final UniqueKey<XMenuRecord> KEY_X_MENU_PRIMARY = Internal.createUniqueKey(XMenu.X_MENU, DSL.name("KEY_X_MENU_PRIMARY"), new TableField[] { XMenu.X_MENU.KEY }, true);
    public static final UniqueKey<XMenuMyRecord> KEY_X_MENU_MY_OWNER = Internal.createUniqueKey(XMenuMy.X_MENU_MY, DSL.name("KEY_X_MENU_MY_OWNER"), new TableField[] { XMenuMy.X_MENU_MY.OWNER, XMenuMy.X_MENU_MY.TYPE, XMenuMy.X_MENU_MY.PAGE, XMenuMy.X_MENU_MY.POSITION, XMenuMy.X_MENU_MY.URI }, true);
    public static final UniqueKey<XMenuMyRecord> KEY_X_MENU_MY_PRIMARY = Internal.createUniqueKey(XMenuMy.X_MENU_MY, DSL.name("KEY_X_MENU_MY_PRIMARY"), new TableField[] { XMenuMy.X_MENU_MY.KEY }, true);
    public static final UniqueKey<XModuleRecord> KEY_X_MODULE_ENTRY = Internal.createUniqueKey(XModule.X_MODULE, DSL.name("KEY_X_MODULE_ENTRY"), new TableField[] { XModule.X_MODULE.ENTRY, XModule.X_MODULE.APP_ID }, true);
    public static final UniqueKey<XModuleRecord> KEY_X_MODULE_PRIMARY = Internal.createUniqueKey(XModule.X_MODULE, DSL.name("KEY_X_MODULE_PRIMARY"), new TableField[] { XModule.X_MODULE.KEY }, true);
    public static final UniqueKey<XNotificationRecord> KEY_X_NOTIFICATION_APP_ID = Internal.createUniqueKey(XNotification.X_NOTIFICATION, DSL.name("KEY_X_NOTIFICATION_APP_ID"), new TableField[] { XNotification.X_NOTIFICATION.APP_ID, XNotification.X_NOTIFICATION.CODE }, true);
    public static final UniqueKey<XNotificationRecord> KEY_X_NOTIFICATION_APP_ID_2 = Internal.createUniqueKey(XNotification.X_NOTIFICATION, DSL.name("KEY_X_NOTIFICATION_APP_ID_2"), new TableField[] { XNotification.X_NOTIFICATION.APP_ID, XNotification.X_NOTIFICATION.NAME }, true);
    public static final UniqueKey<XNotificationRecord> KEY_X_NOTIFICATION_PRIMARY = Internal.createUniqueKey(XNotification.X_NOTIFICATION, DSL.name("KEY_X_NOTIFICATION_PRIMARY"), new TableField[] { XNotification.X_NOTIFICATION.KEY }, true);
    public static final UniqueKey<XNumberRecord> KEY_X_NUMBER_APP_ID = Internal.createUniqueKey(XNumber.X_NUMBER, DSL.name("KEY_X_NUMBER_APP_ID"), new TableField[] { XNumber.X_NUMBER.APP_ID, XNumber.X_NUMBER.IDENTIFIER, XNumber.X_NUMBER.CODE }, true);
    public static final UniqueKey<XNumberRecord> KEY_X_NUMBER_PRIMARY = Internal.createUniqueKey(XNumber.X_NUMBER, DSL.name("KEY_X_NUMBER_PRIMARY"), new TableField[] { XNumber.X_NUMBER.KEY }, true);
    public static final UniqueKey<XSourceRecord> KEY_X_SOURCE_APP_ID = Internal.createUniqueKey(XSource.X_SOURCE, DSL.name("KEY_X_SOURCE_APP_ID"), new TableField[] { XSource.X_SOURCE.APP_ID }, true);
    public static final UniqueKey<XSourceRecord> KEY_X_SOURCE_PRIMARY = Internal.createUniqueKey(XSource.X_SOURCE, DSL.name("KEY_X_SOURCE_PRIMARY"), new TableField[] { XSource.X_SOURCE.KEY }, true);
    public static final UniqueKey<XTabularRecord> KEY_X_TABULAR_APP_ID = Internal.createUniqueKey(XTabular.X_TABULAR, DSL.name("KEY_X_TABULAR_APP_ID"), new TableField[] { XTabular.X_TABULAR.APP_ID, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.CODE }, true);
    public static final UniqueKey<XTabularRecord> KEY_X_TABULAR_PRIMARY = Internal.createUniqueKey(XTabular.X_TABULAR, DSL.name("KEY_X_TABULAR_PRIMARY"), new TableField[] { XTabular.X_TABULAR.KEY }, true);
    public static final UniqueKey<XTabularRecord> KEY_X_TABULAR_SIGMA = Internal.createUniqueKey(XTabular.X_TABULAR, DSL.name("KEY_X_TABULAR_SIGMA"), new TableField[] { XTabular.X_TABULAR.SIGMA, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.CODE }, true);
}
