package com.java.dc_system.service.Impl;


import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.dao.CollectorDao;
import com.java.dc_system.pojo.Collector;
import com.java.dc_system.service.ICollectorService;
import com.java.dc_system.until.CodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-03 13:17
 * @Description:
 */
@Component
public class CollectorServiceImpl implements ICollectorService {
    @Autowired
    private CollectorDao collectorDao;
    @Override
    public int registerCollector(Collector collector) throws BusinessException {
        int num = collectorDao.registerCollector(collector);
        if (num != 0){
            return num;
        } else{
            throw new BusinessException("添加检测人员信息失败", CodeEnum.BUSINESS_ERROR);
        }
    }

    @Override
    public Collector loginCollector(String idCard, String tel, String password) throws BusinessException {
        Collector collector = collectorDao.loginCollector(idCard ,tel ,password);
        if (collector!=null){
            return collector;
        }else {
            throw new BusinessException("登录失败",CodeEnum.LOGIN_FAILED);
        }
    }

    @Override
    public List<Collector> getAllCollector() throws BusinessException {
        List<Collector> collectors = collectorDao.getAllCollector();
        if (collectors!=null){
            return collectors;
        }else {
            throw new BusinessException("查询检测人员信息失败",CodeEnum.BUSINESS_ERROR);
        }
    }

    @Override
    public Collector getCollectorById(Integer collectorId) throws BusinessException {
        Collector collector = collectorDao.getCollectorById(collectorId);
        if (collector!=null){
            return collector;
        }else {
            throw new BusinessException("通过id查询检测人员信息失败",CodeEnum.BUSINESS_ERROR);
        }
    }

    @Override
    public int deleteCollector(Integer collectorId) throws BusinessException {
        int num = collectorDao.deleteCollector(collectorId);
        if (num != 0){
            return num;
        }else {
            throw new BusinessException("通过id删除检测人员信息失败",CodeEnum.BUSINESS_ERROR);
        }
    }

    @Override
    public int updateCollector(Collector collector) throws BusinessException {
        int num = collectorDao.updateCollector(collector);
        if (num!=0){
            return num;
        }else {
            throw new BusinessException("通过id查询检测人员信息失败",CodeEnum.BUSINESS_ERROR);
        }
    }
}
