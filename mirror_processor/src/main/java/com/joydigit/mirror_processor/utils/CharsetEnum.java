package com.joydigit.mirror_processor.utils;

/**
 * create by 75442 on 2019/11/28
 */
public enum CharsetEnum {
    UTF8("UTF-8"),
    GBK("GBK"),
    GB2312("GB2312"),
    ISO8859_1("ISO8859-1");

    private String value;

    CharsetEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
