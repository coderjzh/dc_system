package com.java.dc_system.service;

import com.java.dc_system.pojo.TestTube;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-06 21:28
 * @Description:
 */
public interface ITestTubeService {
    //添加试管信息(开管)
    int insertTestTube(TestTube testTube);
    //查询该箱子下试管信息
    List<TestTube> selectTestTube(TestTube testTube);
    //更新试管信息(封管)
    int updateTestTube(TestTube testTube);
    //试管数量校验
    Integer checkTestTube();
}
