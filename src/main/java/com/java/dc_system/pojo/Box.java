package com.java.dc_system.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: zjt
 * @Date: 2022-11-05 14:55
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Box {
    //转运箱Id
    private Integer boxId;
    //转运箱码
    private String boxCode;
    //转运状态 0开箱中 1已封箱 2已转运 3检测机构已接受 4已开箱检测
    private Integer status;
    //检测人员Id
    private Integer collectorId;
    //转运人员Id
    private Integer transferId;
    //检测人员Id
    private Integer testerId;
    //检测地点Id
    private Integer pointId;
    //检测机构Id
    private Integer testOrganizationId;
    //开箱日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date openTime;
    //封箱日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date closeTime;
}
