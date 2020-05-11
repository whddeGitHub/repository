package com.leyou.common.enums;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/11 21:50
 */
public enum ExceptionEnum {

    PRIVICE_CANNOT_BE_NULL(400,"价格不能为空");

    ;
    private int code;
    private String msg;

    ExceptionEnum() {
    }

    ExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
