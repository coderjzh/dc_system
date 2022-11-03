package com.java.dc_system.dao;

import com.java.dc_system.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: zjt
 * @Date: 2022-11-04 17:09
 * @Description:
 */
@Mapper
public interface PeopleDao {
    //查询全部被检测人员
    List<People> getAllPeople();
    //通过Id查询被检测人员
    People getOnePeople(@Param("peopleId")Integer peopleId);
    //通过Id修改被检测人员信息
    int updatePeople(People model);
    //通过Id删除被检测人员信息
    int deletePeople(@Param("peopleId")Integer peopleId);
    //被检测人员注册
    int registerPeople(People model);
    //被检测人员登录
    People loginPeople(@Param("idCard")String idCard,@Param("tel")String tel);

}
