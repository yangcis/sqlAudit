package org.yangcis.parsing.exception;

import org.apache.servicecomb.swagger.invocation.exception.InvocationException;
import org.yangcis.parsing.common.ResponseEnum;

import javax.ws.rs.core.Response;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/14
 * @description: 解析SQL失败时抛出的异常
 */
public class ParsingException extends InvocationException {
    private static final long serialVersionUID = 1L;

    private final ResponseEnum responseEnum;

    public ParsingException(ResponseEnum errorEnumCode) {
        super(Response.Status.INTERNAL_SERVER_ERROR, errorEnumCode.getCode(), errorEnumCode.getMessage());
        this.responseEnum = errorEnumCode;
    }

    public ParsingException() {
        super(Response.Status.FORBIDDEN, ResponseEnum.PARSING_FAILED.getCode(),
                ResponseEnum.PARSING_FAILED.getMessage());
        this.responseEnum = ResponseEnum.PARSING_FAILED;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }
}
