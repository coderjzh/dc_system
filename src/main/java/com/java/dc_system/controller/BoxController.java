package com.java.dc_system.controller;

import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.pojo.Box;
import com.java.dc_system.pojo.TestTube;
import com.java.dc_system.pojo.vo.ResultModel;
import com.java.dc_system.service.IBoxService;
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
 * @Date: 2022-11-06 17:44
 * @Description:
 */
@RestController
@RequestMapping("/box")
public class BoxController {
    @Autowired
    private IBoxService boxService;
    @Autowired
    private ITestTubeService testTubeService;

    @PostMapping("/checkTestTubeId.do")
    public Integer checkTestTubeId(){
        return testTubeService.checkTestTube();
    }

    @PostMapping("/insertBox.do")
    public ResultModel<Integer> insertBox(@RequestBody Box model) throws BusinessException {
        boxService.insertBox(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "添加转运箱信息成功", model.getBoxId(), true);
    }

    @PostMapping("/updateBox.do")
    public ResultModel<Integer> updateBox(@RequestBody Box model) throws BusinessException {
        int num = boxService.updateBox(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "已更新转运箱信息", num, true);
    }

    @PostMapping("/getBox.do")
    public ResultModel<List<Box>> getBox(@RequestBody Box model) throws BusinessException {
        List<Box> boxList = boxService.getBox(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "检索到转运箱信息", boxList, true);
    }

    //获取当前转运箱下的试管
    @PostMapping("/getBoxTestTube.do")
    public ResultModel<List<TestTube>> getBoxTestTube(@RequestBody Box model){
        TestTube testTube = new TestTube();
        testTube.setBoxId(model.getBoxId());
        List<TestTube> testTubes = testTubeService.selectTestTube(testTube);
        return new ResultModel<>(CodeEnum.SUCCESS, "检索到本转运箱下的试管信息", testTubes, true);
    }
}
