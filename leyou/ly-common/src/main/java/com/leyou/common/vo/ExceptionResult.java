package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/11 22:01
 */
public class ExceptionResult {
    private int status;
    private String msg;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.msg = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
