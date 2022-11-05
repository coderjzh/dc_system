package com.java.dc_system.service;

import com.java.dc_system.Exception.BusinessException;
import com.java.dc_system.pojo.People;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-04 20:16
 * @Description:
 */
public interface IPeopleService {
    //查询全部被检测人员
    List<People> getAllPeople() throws BusinessException;
    //通过Id查询被检测人员
    People getOnePeople(People model) throws BusinessException;
    //通过Id修改被检测人员信息
    int updatePeople(People model) throws BusinessException;
    //通过Id删除被检测人员信息
    int deletePeople(@Param("peopleId")Integer peopleId) throws BusinessException;
    //被检测人员注册
    int registerPeople(People model) throws BusinessException;
    //被检测人员登录
    People loginPeople(@Param("idCard")String idCard,@Param("tel")String tel) throws BusinessException;
    //校验被检测人员的注册信息
    People checkPeople(@Param("idCard")String idCard,@Param("tel")String tel) throws BusinessException;
}
