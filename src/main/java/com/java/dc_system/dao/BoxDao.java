package com.java.dc_system.dao;

import com.java.dc_system.pojo.Box;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-05 23:18
 * @Description:
 */
@Mapper
public interface BoxDao {
    //转运箱开箱操作
    int insertBox(Box box);
    //封箱
    int updateBox(Box box);
    //查询转运箱信息
    List<Box> getBox(Box box);
}
