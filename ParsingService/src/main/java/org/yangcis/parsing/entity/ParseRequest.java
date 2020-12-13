package org.yangcis.parsing.entity;

public class ParseRequest {
    private String sqlString;
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
