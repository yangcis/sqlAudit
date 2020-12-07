package org.yangcis.parsing.service;


import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.yangcis.parsing.entity.ParseRequest;
import org.yangcis.parsing.entity.ParseResponse;

import java.util.concurrent.CompletableFuture;

public interface ParseSqlService {
    @Async
    void parseSql(ParseRequest request, CompletableFuture<ResponseEntity<ParseResponse>> future);
}
