package org.yangcis.parsing.entity;

import org.yangcis.parsing.common.ResponseEnum;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/13
 * @description: 响应消息类
 */
public class CommonResponse<T>{
    private final String resultCode;
    private final String resultDesc;
    private T result;

    public CommonResponse(T result) {
        this.resultCode = ResponseEnum.SUCCESS.getCode();
        this.resultDesc = ResponseEnum.SUCCESS.getDesc();
        this.result = result;
    }

    public CommonResponse(ResponseEnum exceptionEnum) {
        this.resultCode = exceptionEnum.getCode();
        this.resultDesc = exceptionEnum.getDesc();
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public T getResult() {
        return result;
    }
}
