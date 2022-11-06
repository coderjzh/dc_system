package com.java.dc_system.dao;

import com.java.dc_system.pojo.TestTube;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-06 21:17
 * @Description:
 */
@Mapper
public interface TestTubeDao {
    //添加试管信息(开管)
    int insertTestTube(TestTube testTube);
    //查询该箱子下试管信息
    List<TestTube> selectTestTube(TestTube testTube);
    //更新试管信息(封管)
    int updateTestTube(TestTube testTube);
    //试管数量校验
    Integer checkTestTube();
}
