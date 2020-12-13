package org.yangcis.parsing.common;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/13
 * @description: 返回消息结果码和结果描述类
 */
public enum ResponseEnum {
    SUCCESS("0", "Success."),
    PARSINGFAILED("1001", "Failed to parse SQL string."),
    ;

    private final String code;
    private final String desc;

    ResponseEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
