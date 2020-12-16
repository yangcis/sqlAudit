package org.yangcis.parsing.common;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/13
 * @description: 返回消息结果码和结果描述类
 */
public enum ResponseEnum {
    SUCCESS("0", "Success."),
    PARSING_FAILED("1001", "Failed to parse SQL string."),
    PARAMETER_ERROR("1002", "Parameter's format is illegal.");

    private final String code;
    private final String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
