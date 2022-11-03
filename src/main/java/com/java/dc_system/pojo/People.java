package com.java.dc_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @Author: zjt
 * @Date: 2022-11-04 17:06
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    //被检测人员ID
    private Integer peopleId;
    //被检测人员姓名
    private String name;
    //被检测人员身份类型
    private Integer idCardType;
    //被检测人员证件号
    private String idCard;
    //被检测人员电话
    private String tel;
    //注册时间
    private Date createTime;
}
