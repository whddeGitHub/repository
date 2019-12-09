package com.joydigit.mirror_processor.entity;

import lombok.Data;

import java.util.List;

/**
 * create by 75442 on 2019/11/28
 */
@Data
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

}
