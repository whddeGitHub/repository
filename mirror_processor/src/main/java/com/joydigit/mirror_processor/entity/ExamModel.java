package com.joydigit.mirror_processor.entity;

import java.util.List;

/**
 * create by 75442 on 2019/11/28
 */
public class ExamModel {
    private String exam_uuid; //uuid,扫码使用
    private String exam_conclusion; //结论
    private String exam_otherresult;
    private String disease_advice;
    private String exam_schemename;
    private List<Devices> devices;
    private String exam_evaluation; //套餐评估结果
    private String phrresult;
    private String exam_diseasename;
    private String exam_diseasecode;
    private String exam_bagangtuinfo;
    private String exam_schemeid; //套餐ID
    private String exam_lkdndiseases;
    private String alladvice;
    private String exam_sourceid; //数据来源ID，得到镜子的id
    private String exam_sourcekind;
    private String exam_userid; //用户id
    private String exam_time; //检查时间
    private String exam_bagangtuurl;
    private String exam_answers;
    private String exam_opinion;
    private String exam_sourcecode;
    private String exam_id;

    public String getExam_uuid() {
        return exam_uuid;
    }

    public void setExam_uuid(String exam_uuid) {
        this.exam_uuid = exam_uuid;
    }

    public String getExam_conclusion() {
        return exam_conclusion;
    }

    public void setExam_conclusion(String exam_conclusion) {
        this.exam_conclusion = exam_conclusion;
    }

    public String getDisease_advice() {
        return disease_advice;
    }

    public void setDisease_advice(String disease_advice) {
        this.disease_advice = disease_advice;
    }

    public String getExam_otherresult() {
        return exam_otherresult;
    }

    public void setExam_otherresult(String exam_otherresult) {
        this.exam_otherresult = exam_otherresult;
    }

    public String getExam_schemename() {
        return exam_schemename;
    }

    public void setExam_schemename(String exam_schemename) {
        this.exam_schemename = exam_schemename;
    }

    public List<Devices> getDevices() {
        return devices;
    }

    public void setDevices(List<Devices> devices) {
        this.devices = devices;
    }

    public String getExam_evaluation() {
        return exam_evaluation;
    }

    public void setExam_evaluation(String exam_evaluation) {
        this.exam_evaluation = exam_evaluation;
    }

    public String getExam_diseasename() {
        return exam_diseasename;
    }

    public void setExam_diseasename(String exam_diseasename) {
        this.exam_diseasename = exam_diseasename;
    }

    public String getExam_diseasecode() {
        return exam_diseasecode;
    }

    public void setExam_diseasecode(String exam_diseasecode) {
        this.exam_diseasecode = exam_diseasecode;
    }

    public String getExam_schemeid() {
        return exam_schemeid;
    }

    public void setExam_schemeid(String exam_schemeid) {
        this.exam_schemeid = exam_schemeid;
    }

    public String getExam_sourceid() {
        return exam_sourceid;
    }

    public void setExam_sourceid(String exam_sourceid) {
        this.exam_sourceid = exam_sourceid;
    }

    public String getExam_userid() {
        return exam_userid;
    }

    public void setExam_userid(String exam_userid) {
        this.exam_userid = exam_userid;
    }

    public String getExam_time() {
        return exam_time;
    }

    public void setExam_time(String exam_time) {
        this.exam_time = exam_time;
    }

    public String getExam_sourcecode() {
        return exam_sourcecode;
    }

    public void setExam_sourcecode(String exam_sourcecode) {
        this.exam_sourcecode = exam_sourcecode;
    }

    public String getExam_id() {
        return exam_id;
    }

    public void setExam_id(String exam_id) {
        this.exam_id = exam_id;
    }

    public String getPhrresult() {
        return phrresult;
    }

    public void setPhrresult(String phrresult) {
        this.phrresult = phrresult;
    }

    public String getExam_bagangtuinfo() {
        return exam_bagangtuinfo;
    }

    public void setExam_bagangtuinfo(String exam_bagangtuinfo) {
        this.exam_bagangtuinfo = exam_bagangtuinfo;
    }

    public String getExam_lkdndiseases() {
        return exam_lkdndiseases;
    }

    public void setExam_lkdndiseases(String exam_lkdndiseases) {
        this.exam_lkdndiseases = exam_lkdndiseases;
    }

    public String getAlladvice() {
        return alladvice;
    }

    public void setAlladvice(String alladvice) {
        this.alladvice = alladvice;
    }

    public String getExam_sourcekind() {
        return exam_sourcekind;
    }

    public void setExam_sourcekind(String exam_sourcekind) {
        this.exam_sourcekind = exam_sourcekind;
    }

    public String getExam_bagangtuurl() {
        return exam_bagangtuurl;
    }

    public void setExam_bagangtuurl(String exam_bagangtuurl) {
        this.exam_bagangtuurl = exam_bagangtuurl;
    }

    public String getExam_answers() {
        return exam_answers;
    }

    public void setExam_answers(String exam_answers) {
        this.exam_answers = exam_answers;
    }

    public String getExam_opinion() {
        return exam_opinion;
    }

    public void setExam_opinion(String exam_opinion) {
        this.exam_opinion = exam_opinion;
    }
}
