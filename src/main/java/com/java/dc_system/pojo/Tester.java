package com.java.dc_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: zjt
 * @Date: 2022-11-05 21:01
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tester {
    //
    private Integer testerId;
    //
    private String idCard;
    //
    private String name;
    //
    private String password;
    //
    private Integer organizationId;
    //
    private Date registerTime;
}
