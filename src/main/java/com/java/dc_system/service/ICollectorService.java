package com.java.dc_system.service;


import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.pojo.Collector;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-03 13:16
 * @Description:
 */
public interface ICollectorService {
    //采集人员注册
    int registerCollector(Collector collector) throws BusinessException;
    //采集人员登录
    Collector loginCollector(String idCard,String tel,String password) throws BusinessException;
    //获取所有采集人员信息
    List<Collector> getAllCollector() throws BusinessException;
    //通过Id查询采集人员信息
    Collector getCollectorById(@Param("collectorId")Integer collectorId) throws BusinessException;
    //通过Id删除采集人员信息
    int deleteCollector(@Param("collectorId")Integer collectorId) throws BusinessException;
    //通过Id修改采集人员信息
    int updateCollector(Collector collector) throws BusinessException;
}
