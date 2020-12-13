package org.yangcis.parsing.service;


import org.springframework.scheduling.annotation.Async;
import org.yangcis.parsing.entity.CommonResponse;
import org.yangcis.parsing.entity.ParseRequest;
import org.yangcis.parsing.entity.ParseResponse;

import java.util.concurrent.CompletableFuture;

public interface ParseSqlService {
    @Async
    void parseSql(ParseRequest request,
                  CompletableFuture<CommonResponse<ParseResponse>> future);
}
