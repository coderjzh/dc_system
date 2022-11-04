package com.java.dc_system.controller;

import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.pojo.People;
import com.java.dc_system.pojo.vo.ResultModel;
import com.java.dc_system.service.IPeopleService;
import com.java.dc_system.until.CodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-04 22:52
 * @Description:
 */
@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private IPeopleService peopleService;
    /**
     */
    @PostMapping("/getAllPeople.do")
    public ResultModel<List<People>> getAllPeople() throws BusinessException {
        List<People> peopleList = peopleService.getAllPeople();
        return new ResultModel<>(CodeEnum.SUCCESS, "查询到被检测人员信息", peopleList, true);
    }

    @PostMapping("/registerPeople.do")
    public ResultModel<Integer> registerPeople(@RequestBody People model) throws BusinessException {
        int num = peopleService.registerPeople(model);
        return new ResultModel<>(CodeEnum.SUCCESS, "成功添加被检测人员信息", num, true);
    }

    @PostMapping("/updatePeople.do")
    public ResultModel<Integer> updatePeople(@RequestBody People model) throws BusinessException {
        int num = peopleService.updatePeople(model);
        return new ResultModel<>(CodeEnum.SUCCESS,"成功更新检测人员信息",num,true);
    }

    @PostMapping("/deletePeople.do")
    public ResultModel<Integer> deletePeople(Integer peopleId) throws BusinessException {
        int num = peopleService.deletePeople(peopleId);
        return new ResultModel<>(CodeEnum.SUCCESS,"成功删除被检测人员信息",num,true);
    }

    @PostMapping("/loginPeople.do")
    public ResultModel<People> loginPeople(String idCard,String tel) throws BusinessException {
        People people = peopleService.loginPeople(idCard, tel);
        return new ResultModel<>(CodeEnum.SUCCESS,"成功更新检测人员信息",people,true);
    }
}
