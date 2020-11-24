package org.yangcis.parsing.entity;

import com.alibaba.druid.stat.TableStat;

import java.util.Collection;
import lombok.Data;

@Data
public class ParseResponse {
    private Integer features;
    private String sqlType;
    private Collection<TableStat.Column> columnList;
}
