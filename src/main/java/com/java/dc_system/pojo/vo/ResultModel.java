package com.java.dc_system.pojo.vo;

import com.java.dc_system.until.CodeEnum;
import lombok.Data;

/**
 * @Author: zjt
 * @Date: 2022-10-31 09:35
 * @Description:
 */
@Data
public class ResultModel<T>{
    private Integer code; //约定: 200调用成功，300：登录超时，301：登录失败,400:业务逻辑错误
    private String message;
    private T object;
    private Boolean success;
    public ResultModel(CodeEnum codeEnum, String message, T object, Boolean success) {
        this.code = codeEnum.getCode();
        this.message = message;
        this.object = object;
        this.success = success;
    }


}
