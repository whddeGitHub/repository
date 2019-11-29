package com.joydigit.mirror_processor.entity;

/**
 * create by 75442 on 2019/11/28
 */
public class Head {
    private String firstresult;
    private String faultcode;
    private String faultstring;
    private String totalresults;
    private String bodytype;

    public String getFirstresult() {
        return firstresult;
    }

    public void setFirstresult(String firstresult) {
        this.firstresult = firstresult;
    }

    public String getFaultcode() {
        return faultcode;
    }

    public void setFaultcode(String faultcode) {
        this.faultcode = faultcode;
    }

    public String getFaultstring() {
        return faultstring;
    }

    public void setFaultstring(String faultstring) {
        this.faultstring = faultstring;
    }

    public String getTotalresults() {
        return totalresults;
    }

    public void setTotalresults(String totalresults) {
        this.totalresults = totalresults;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }
}
