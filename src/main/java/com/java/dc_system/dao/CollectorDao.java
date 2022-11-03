package com.java.dc_system.dao;


import com.java.dc_system.pojo.Collector;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-03 10:36
 * @Description:
 */
@Mapper
public interface CollectorDao {
    //采集人员注册
    int registerCollector(Collector collector);
    //采集人员登录
    Collector loginCollector(@Param("tel")String tel,@Param("password")String password);
    //获取所有采集人员信息
    List<Collector> getAllCollector();
    //通过Id查询采集人员信息
    Collector getCollectorById(@Param("collectorId")Integer collectorId);
    //通过Id删除采集人员信息
    int deleteCollector(@Param("collectorId")Integer collectorId);
    //通过Id修改采集人员信息
    int updateCollector(Collector collector);
}
