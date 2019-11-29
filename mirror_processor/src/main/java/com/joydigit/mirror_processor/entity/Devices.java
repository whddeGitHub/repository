package com.joydigit.mirror_processor.entity;

import java.util.List;

/**
 * create by 75442 on 2019/11/28
 */
public class Devices {
    private String dev_name; //设备名称
    private String dev_examid; //体检ID
    private String dev_advice; //修改后的疾病建议
    private String dev_analyse; //疾病解析
    private String dev_kind; //设备类型
    private String dev_id; //设备ID
    private String dev_corrresult; //修改后的体检结果
    private String c_orgid; //组织ID
    private String dev_corranalyse;  //修改后的疾病解析
    private String dev_image; //图像
    private String dev_appendix;
    private String dev_mode;
    private String dev_corradvice; //疾病建议
    private List<Items> items;
    private String dev_result;

    public String getDev_name() {
        return dev_name;
    }

    public void setDev_name(String dev_name) {
        this.dev_name = dev_name;
    }

    public String getDev_appendix() {
        return dev_appendix;
    }

    public void setDev_appendix(String dev_appendix) {
        this.dev_appendix = dev_appendix;
    }

    public String getDev_mode() {
        return dev_mode;
    }

    public void setDev_mode(String dev_mode) {
        this.dev_mode = dev_mode;
    }

    public String getDev_examid() {
        return dev_examid;
    }

    public void setDev_examid(String dev_examid) {
        this.dev_examid = dev_examid;
    }

    public String getDev_advice() {
        return dev_advice;
    }

    public void setDev_advice(String dev_advice) {
        this.dev_advice = dev_advice;
    }

    public String getDev_analyse() {
        return dev_analyse;
    }

    public void setDev_analyse(String dev_analyse) {
        this.dev_analyse = dev_analyse;
    }

    public String getDev_kind() {
        return dev_kind;
    }

    public void setDev_kind(String dev_kind) {
        this.dev_kind = dev_kind;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getDev_corrresult() {
        return dev_corrresult;
    }

    public void setDev_corrresult(String dev_corrresult) {
        this.dev_corrresult = dev_corrresult;
    }

    public String getC_orgid() {
        return c_orgid;
    }

    public void setC_orgid(String c_orgid) {
        this.c_orgid = c_orgid;
    }

    public String getDev_corranalyse() {
        return dev_corranalyse;
    }

    public void setDev_corranalyse(String dev_corranalyse) {
        this.dev_corranalyse = dev_corranalyse;
    }

    public String getDev_image() {
        return dev_image;
    }

    public void setDev_image(String dev_image) {
        this.dev_image = dev_image;
    }

    public String getDev_corradvice() {
        return dev_corradvice;
    }

    public void setDev_corradvice(String dev_corradvice) {
        this.dev_corradvice = dev_corradvice;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public String getDev_result() {
        return dev_result;
    }

    public void setDev_result(String dev_result) {
        this.dev_result = dev_result;
    }
}
