package com.java.dc_system.Exception;


import com.java.dc_system.until.CodeEnum;

/**
 * @Author: zjt
 * @Date: 2022-10-31 09:37
 * @Description:
 */
public class BusinessException extends Exception{
    private CodeEnum errorCode;
    public CodeEnum getErrorCode() {
        return errorCode;
    }
    public BusinessException(String message, CodeEnum codeEnum)
    {
        super(message);
        this.errorCode = codeEnum;
    }
}
