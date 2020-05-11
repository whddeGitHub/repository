package com.leyou.common.device;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description 通用异常处理
 * @Author whd
 * @Date 2020/5/11 21:18
 */
@ControllerAdvice  //自动拦截所有的controller通知
public class CommonException {
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e){

        return ResponseEntity.status(e.getExceptionEnum().getCode()).body(new ExceptionResult(e.getExceptionEnum()));
    }
}
