package org.yangcis.parsing.entity;

import com.alibaba.druid.stat.TableStat;
import lombok.Data;

import java.util.Collection;

@Data
public class ParseResponse {
    private Integer features;
    private String dbType;
    private Collection<TableStat.Column> columnList;
}
