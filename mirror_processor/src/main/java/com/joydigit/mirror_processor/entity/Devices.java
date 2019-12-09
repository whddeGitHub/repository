package com.joydigit.mirror_processor.entity;

import lombok.Data;

import java.util.List;

/**
 * create by 75442 on 2019/11/28
 */
@Data
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

}
