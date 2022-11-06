package com.java.dc_system.service.Impl;

import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.dao.BoxDao;
import com.java.dc_system.pojo.Box;
import com.java.dc_system.service.IBoxService;
import com.java.dc_system.until.CodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-06 18:00
 * @Description:
 */
@Component
public class BoxServiceImpl implements IBoxService {
    @Autowired
    private BoxDao boxDao;
    @Override
    public int insertBox(Box box) throws BusinessException {
        int num = boxDao.insertBox(box);
        if (num != 0){
            return num;
        } else{
            throw new BusinessException("添加转运箱信息失败", CodeEnum.BUSINESS_ERROR);
        }
    }

    @Override
    public int updateBox(Box box) throws BusinessException {
        int num = boxDao.updateBox(box);
        if (num != 0){
            return num;
        } else{
            throw new BusinessException("更新转运箱信息失败", CodeEnum.BUSINESS_ERROR);
        }
    }

    @Override
    public List<Box> getBox(Box box) throws BusinessException {
        List<Box> boxList = boxDao.getBox(box);
        if (boxList !=null){
            return boxList;
        } else{
            throw new BusinessException("检索转运箱信息失败", CodeEnum.BUSINESS_ERROR);
        }
    }
}
