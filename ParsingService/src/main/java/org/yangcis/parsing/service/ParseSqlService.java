package org.yangcis.parsing.service;


import org.yangcis.parsing.entity.ParseRequest;
import org.yangcis.parsing.entity.ParseResponse;

public interface ParseSqlService {
    ParseResponse parseSql(ParseRequest request);
}
