package com.joydigit.mirror_processor.utils;

/**
 * create by 75442 on 2019/11/28
 */
public enum ContentTypeEnum {
    HTML("text/html; charset=UTF-8"),
    TEXT_PLAIN("text/plain; charset=UTF-8"),
    XML("text/xml; charset=UTF-8"),
    JSON("application/json; charset=UTF-8"),
    FORM_URLENCODED("application/x-www-form-urlencoded"),
    PNG("image/png");

    private String value;

    ContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
