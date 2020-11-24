package org.yangcis.parsing.service.impl;

import org.springframework.stereotype.Service;
import org.yangcis.parsing.aspect.LogPrintAnnotation;
import org.yangcis.parsing.entity.ParseRequest;
import org.yangcis.parsing.entity.ParseResponse;
import org.yangcis.parsing.service.ParseSqlService;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.sql.parser.ParserException;

import java.util.List;

@Service
public class ParseSqlServiceImpl implements ParseSqlService {
    @LogPrintAnnotation(type = "aaa")
    @Override
    public ParseResponse parseSql(ParseRequest request) {
        String sql = request.getSqlString();
        String dbType = request.getDbType();
        List<SQLStatement> stmtList;
        try {
            stmtList = SQLUtils.parseStatements(sql, dbType);
        } catch (ParserException parseException) {
            System.out.println("Wrong format sql string");
            return null;
        }
        ParseResponse response = new ParseResponse();
        response.setSqlType(dbType);
        //解析出的独立语句的个数
        System.out.println("size is:" + stmtList.size());
        for (SQLStatement stmt : stmtList) {
            
            MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
            stmt.accept(visitor);
            response.setColumnList(visitor.getColumns());
            response.setFeatures(visitor.getFeatures());
            System.out.println("Features : " + visitor.getFeatures());
            System.out.println("Manipulation : " + visitor.getTables());
            System.out.println("fields : " + visitor.getColumns());
        }
        return response;
    }
}
