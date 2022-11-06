package com.java.dc_system.service;

import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.pojo.Box;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-06 17:59
 * @Description:
 */

public interface IBoxService {
    //转运箱开箱操作
    int insertBox(Box box) throws BusinessException;
    //封箱
    int updateBox(Box box) throws BusinessException;
    //查询转运箱信息
    List<Box> getBox(Box box) throws BusinessException;
}
