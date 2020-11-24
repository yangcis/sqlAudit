package org.yangcis.parsing.entity;

import lombok.Data;

@Data
public class ParseRequest {
    private String sqlString;
    private String dbType;
}
