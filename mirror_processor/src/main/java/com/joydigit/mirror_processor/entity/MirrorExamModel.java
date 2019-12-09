package com.joydigit.mirror_processor.entity;

import lombok.Data;

import java.util.List;

/**
 * create by 75442 on 2019/11/28
 */
@Data
public class MirrorExamModel {
    private Head head;
    private List<ExamModel> body;
    private String version;

}
