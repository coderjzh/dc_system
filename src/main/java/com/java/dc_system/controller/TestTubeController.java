package com.java.dc_system.controller;

import com.java.dc_system.pojo.TestTube;
import com.java.dc_system.pojo.vo.ResultModel;
import com.java.dc_system.service.ITestTubeService;
import com.java.dc_system.until.CodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-06 21:31
 * @Description:
 */
@RestController
@RequestMapping("/testTube")
public class TestTubeController {
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private ITestTubeService testTubeService;
    //开管
    @PostMapping("/insertTestTube.do")
    public ResultModel<Integer> insertTestTube(@RequestBody TestTube model){
        testTubeService.insertTestTube(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "开管成功", model.getTestTubeId(), true);
    }
    //检索该箱子下的试管信息
    @PostMapping("/selectTestTube.do")
    public ResultModel<List<TestTube>> selectTestTube(@RequestBody TestTube model){
        List<TestTube> tubeList = testTubeService.selectTestTube(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "检索到试管信息", tubeList, true);
    }
    //封管
    @PostMapping("/updateTestTube.do")
    public ResultModel<Integer> updateTestTube(@RequestBody TestTube model){
        int num = testTubeService.updateTestTube(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "封管成功", num, true);
    }

}
