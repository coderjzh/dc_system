package com.java.dc_system.Exception;


import com.java.dc_system.pojo.vo.ResultModel;
import com.java.dc_system.until.CodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zjt
 * @Date: 2022-10-31 09:45
 * @Description:
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionAccess {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handle(Exception e) {
        if(e instanceof BusinessException){
            BusinessException be = (BusinessException)e;
            ResultModel<Object> result = new ResultModel<>
                    (be.getErrorCode(),be.getMessage(),null,false);
            return result;
        }
        ResultModel<Object> result = new ResultModel<>
                (CodeEnum.BUSINESS_ERROR,"服务器处理异常",null,false);
        return result;
    }
}
