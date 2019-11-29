package com.joydigit.mirror_processor.entity;

import java.util.List;

/**
 * create by 75442 on 2019/11/28
 */
public class MirrorExamModel {
    private Head head;
    private List<ExamModel> body;
    private String version;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public List<ExamModel> getBody() {
        return body;
    }

    public void setBody(List<ExamModel> body) {
        this.body = body;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
