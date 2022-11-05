package com.java.dc_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: zjt
 * @Date: 2022-11-05 18:00
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestTube {
    //试管Id
    private Integer testTubeId;
    //试管码
    private String testTubeCode;
    //转运箱Id
    private Integer boxId;
    //采集类型 1单采 10 10人混采 20 20人混采
    private Integer collectType;
    //采集管状态 0采集中 1已封管 2检测完成
    private Integer status;
    //检测结果
    private String testResult;
    //开关时间
    private Date openTime;
    //封管时间
    private Date closeTime;
}
