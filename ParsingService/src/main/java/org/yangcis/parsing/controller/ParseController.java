package org.yangcis.parsing.controller;

import javax.validation.Valid;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yangcis.parsing.entity.ParseRequest;
import org.yangcis.parsing.entity.ParseResponse;
import org.yangcis.parsing.service.ParseSqlService;

@RestSchema(schemaId = "ParseController")
@RequestMapping(value = "/rest/v1/parser")
public class ParseController {
    
    @Autowired
    ParseSqlService parseSqlService;
    
    @RequestMapping(method = RequestMethod.POST, value = "/sql")
    public ResponseEntity<ParseResponse> parseSqlString(@RequestBody @Valid ParseRequest request) {
        ParseResponse response = parseSqlService.parseSql(request);
        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }
}
