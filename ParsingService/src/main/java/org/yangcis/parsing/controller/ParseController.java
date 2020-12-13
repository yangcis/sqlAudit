package org.yangcis.parsing.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yangcis.parsing.entity.CommonResponse;
import org.yangcis.parsing.entity.ParseRequest;
import org.yangcis.parsing.entity.ParseResponse;
import org.yangcis.parsing.service.ParseSqlService;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

@RestSchema(schemaId = "ParseController")
@RequestMapping(value = "/rest/v1/parser")
public class ParseController {
    
    @Autowired
    ParseSqlService parseSqlService;

    @RequestMapping(method = RequestMethod.POST, value = "/sql")
    public CompletableFuture<CommonResponse<ParseResponse>>
    parseSqlString(@RequestBody @Valid ParseRequest request) {
        CompletableFuture<CommonResponse<ParseResponse>> future =
                new CompletableFuture<>();
        parseSqlService.parseSql(request, future);
        return future;
    }
}
