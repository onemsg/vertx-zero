/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IRTeamEmployee extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.TEAM_ID</code>. 「teamId」-
     * 组的ID
     */
    public IRTeamEmployee setTeamId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.TEAM_ID</code>. 「teamId」-
     * 组的ID
     */
    public String getTeamId();

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.EMPLOYEE_ID</code>.
     * 「employeeId」- 员工ID
     */
    public IRTeamEmployee setEmployeeId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.EMPLOYEE_ID</code>.
     * 「employeeId」- 员工ID
     */
    public String getEmployeeId();

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.COMMENT</code>. 「comment」-
     * 关系备注
     */
    public IRTeamEmployee setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.COMMENT</code>. 「comment」-
     * 关系备注
     */
    public String getComment();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IRTeamEmployee
     */
    public void from(IRTeamEmployee from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IRTeamEmployee
     */
    public <E extends IRTeamEmployee> E into(E into);

        @Override
        public default IRTeamEmployee fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setTeamId,json::getString,"TEAM_ID","java.lang.String");
                setOrThrow(this::setEmployeeId,json::getString,"EMPLOYEE_ID","java.lang.String");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("TEAM_ID",getTeamId());
                json.put("EMPLOYEE_ID",getEmployeeId());
                json.put("COMMENT",getComment());
                return json;
        }

}
