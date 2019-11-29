package com.joydigit.mirror_processor.entity;

/**
 * create by 75442 on 2019/11/28
 */
public class Items {
    private String normalVal;  //正常值
    private String item_id;  //体检项目
    private String edit;  //是否可编辑
    private String item_quotadesc;  //评分原因
    private String item_normalscore;   //正常评分
    private String indi_minvalue;  //最小值
    private String item_value;  //无论number还是select，显示的最后value结果值
    private String indi_type;  //类型
    private String item_corrchavalue;  //修改后的体检varchar值
    private String indi_options;  //选项
    private String item_chavalue;  //体检varchar值
    private String item_corrnumvalue;  //修改后的体检number值
    private String indi_unit;  //体检指标单位
    private String item_normal;
    private String indi_maxvalue;  //最大值
    private String item_score;  //评分
    private String indi_code;
    private String indi_name;  //体检指标名称
    private String item_numvalue;  //体检number值

    public String getNormalVal() {
        return normalVal;
    }

    public void setNormalVal(String normalVal) {
        this.normalVal = normalVal;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_normal() {
        return item_normal;
    }

    public void setItem_normal(String item_normal) {
        this.item_normal = item_normal;
    }

    public String getIndi_code() {
        return indi_code;
    }

    public void setIndi_code(String indi_code) {
        this.indi_code = indi_code;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getItem_quotadesc() {
        return item_quotadesc;
    }

    public void setItem_quotadesc(String item_quotadesc) {
        this.item_quotadesc = item_quotadesc;
    }

    public String getItem_normalscore() {
        return item_normalscore;
    }

    public void setItem_normalscore(String item_normalscore) {
        this.item_normalscore = item_normalscore;
    }

    public String getIndi_minvalue() {
        return indi_minvalue;
    }

    public void setIndi_minvalue(String indi_minvalue) {
        this.indi_minvalue = indi_minvalue;
    }

    public String getItem_value() {
        return item_value;
    }

    public void setItem_value(String item_value) {
        this.item_value = item_value;
    }

    public String getIndi_type() {
        return indi_type;
    }

    public void setIndi_type(String indi_type) {
        this.indi_type = indi_type;
    }

    public String getItem_corrchavalue() {
        return item_corrchavalue;
    }

    public void setItem_corrchavalue(String item_corrchavalue) {
        this.item_corrchavalue = item_corrchavalue;
    }

    public String getIndi_options() {
        return indi_options;
    }

    public void setIndi_options(String indi_options) {
        this.indi_options = indi_options;
    }

    public String getItem_chavalue() {
        return item_chavalue;
    }

    public void setItem_chavalue(String item_chavalue) {
        this.item_chavalue = item_chavalue;
    }

    public String getItem_corrnumvalue() {
        return item_corrnumvalue;
    }

    public void setItem_corrnumvalue(String item_corrnumvalue) {
        this.item_corrnumvalue = item_corrnumvalue;
    }

    public String getIndi_unit() {
        return indi_unit;
    }

    public void setIndi_unit(String indi_unit) {
        this.indi_unit = indi_unit;
    }

    public String getIndi_maxvalue() {
        return indi_maxvalue;
    }

    public void setIndi_maxvalue(String indi_maxvalue) {
        this.indi_maxvalue = indi_maxvalue;
    }

    public String getItem_score() {
        return item_score;
    }

    public void setItem_score(String item_score) {
        this.item_score = item_score;
    }

    public String getIndi_name() {
        return indi_name;
    }

    public void setIndi_name(String indi_name) {
        this.indi_name = indi_name;
    }

    public String getItem_numvalue() {
        return item_numvalue;
    }

    public void setItem_numvalue(String item_numvalue) {
        this.item_numvalue = item_numvalue;
    }
}
