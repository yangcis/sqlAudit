package org.yangcis.parsing.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ParseRequest {
    @NotNull(message = "SQL string cannot be null.")
    @Size(max = 2048, message = "Length of sql must be 0 - 2048.")
    private String sqlString;

    @NotNull(message = "DB type cannot be null.")
    @Size(max = 32, message = "Length of type must be 0 - 32.")
    private String dbType;

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getSqlString() {
        return sqlString;
    }

    public void setSqlString(String sqlString) {
        this.sqlString = sqlString;
    }

    @Override
    public String toString() {
        return "ParseRequest{" +
                "sqlString='" + sqlString + '\'' +
                ", dbType='" + dbType + '\'' +
                '}';
    }
}
