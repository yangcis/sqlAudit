package org.yangcis.parsing.exception;

import org.yangcis.parsing.common.ResponseEnum;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/14
 * @description: 解析SQL失败时抛出的异常
 */
public class ParsingException extends Exception {
    private static final long serialVersionUID = -338751699312429948L;

    private ResponseEnum errorEnumCode;

    public ParsingException(ResponseEnum errorEnumCode) {
        this.errorEnumCode = errorEnumCode;
    }

    public ParsingException() {
        this.errorEnumCode = ResponseEnum.PARSINGFAILED;
    }
}
