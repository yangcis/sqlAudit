package org.yangcis.parsing.entity;

import org.yangcis.parsing.common.ResponseEnum;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/13
 * @description: 响应消息类
 */
public class CommonResponse<T> {
    private final String code;
    private final String message;
    private T result;

    public CommonResponse(T result) {
        this.code = ResponseEnum.SUCCESS.getCode();
        this.message = ResponseEnum.SUCCESS.getMessage();
        this.result = result;
    }

    public CommonResponse(ResponseEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }
}
