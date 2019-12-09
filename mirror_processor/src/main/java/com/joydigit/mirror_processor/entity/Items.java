package com.joydigit.mirror_processor.entity;

import lombok.Data;

/**
 * create by 75442 on 2019/11/28
 */
@Data
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

}
