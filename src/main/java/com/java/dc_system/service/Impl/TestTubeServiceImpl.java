package com.java.dc_system.service.Impl;

import com.java.dc_system.dao.TestTubeDao;
import com.java.dc_system.pojo.TestTube;
import com.java.dc_system.service.ITestTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-06 21:29
 * @Description:
 */
@Component
public class TestTubeServiceImpl implements ITestTubeService {
    @Autowired
    private TestTubeDao testTubeDao;
    @Override
    public int insertTestTube(TestTube testTube) {
        return testTubeDao.insertTestTube(testTube);
    }

    @Override
    public List<TestTube> selectTestTube(TestTube testTube) {
        return testTubeDao.selectTestTube(testTube);
    }

    @Override
    public int updateTestTube(TestTube testTube) {
        return testTubeDao.updateTestTube(testTube);
    }
}
