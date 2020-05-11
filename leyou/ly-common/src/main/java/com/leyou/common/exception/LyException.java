package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/11 21:49
 */
public class LyException extends RuntimeException {
    private ExceptionEnum exceptionEnum;

    public LyException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public LyException(String message, ExceptionEnum exceptionEnum) {
        super(message);
        this.exceptionEnum = exceptionEnum;
    }

    public LyException(String message, Throwable cause, ExceptionEnum exceptionEnum) {
        super(message, cause);
        this.exceptionEnum = exceptionEnum;
    }

    public LyException(Throwable cause, ExceptionEnum exceptionEnum) {
        super(cause);
        this.exceptionEnum = exceptionEnum;
    }

    public LyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionEnum exceptionEnum) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.exceptionEnum = exceptionEnum;
    }

    public LyException() {
        super();
    }


    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}
