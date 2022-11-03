package com.java.dc_system.until;

/**
 * @Author: zjt
 * @Date: 2022-10-31 09:39
 * @Description:
 */
public enum CodeEnum {
    SUCCESS(200), LOGIN_TIME_OUT(300), LOGIN_FAILED(301), BUSINESS_ERROR(400);
    private int code;

    CodeEnum(int i) {
        this.code = i;
    }

    public int getCode() {
        return code;
    }
}