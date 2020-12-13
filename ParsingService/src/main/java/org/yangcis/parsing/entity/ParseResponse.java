package org.yangcis.parsing.entity;

import com.alibaba.druid.stat.TableStat;

import java.util.Collection;

public class ParseResponse {
    private Integer features;
    private String dbType;
    private Collection<TableStat.Column> columnList;

    @Override
    public String toString() {
        return "ParseResponse{" +
                "features=" + features +
                ", dbType='" + dbType + '\'' +
                ", columnList=" + columnList +
                '}';
    }

    public Integer getFeatures() {
        return features;
    }

    public void setFeatures(Integer features) {
        this.features = features;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public Collection<TableStat.Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(Collection<TableStat.Column> columnList) {
        this.columnList = columnList;
    }
}
