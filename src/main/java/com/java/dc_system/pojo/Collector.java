package com.java.dc_system.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: zjt
 * @Date: 2022-11-03 10:33
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collector {
    //核酸检测人员表Id
    private Integer collectorId;
    //检测人员姓名
    private String name;
    //检测人员身份证
    private String idCard;
    //检测人员电话
    private String tel;
    //所属机构
    private String organizationId;
    //注册密码(登陆密码)
    private String password;
    //注册时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date registerTime;
}
