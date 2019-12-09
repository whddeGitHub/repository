package com.joydigit.mirror_processor.entity;

import lombok.Data;

/**
 * create by 75442 on 2019/11/28
 */
@Data
public class WeCaringVo {
    private String exam_diseasename; //分析结果
    private String exam_conclusion; //分析结果详情
    private String faceFeature; //面部特征
    private String reflet; //光泽
    private String complexion; //面色
    private String lipColor; //唇色
    private String tongueColor; //舌色
    private String tongueShape; //舌形
    private String tongueFurColor; //舌苔颜色
    private String tongueFurShape; //舌苔形质
    private String examEvaluation; //分数

}
