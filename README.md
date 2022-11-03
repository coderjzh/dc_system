# 核酸信息采集系统

## 一. 准备：

### 1.工具选型

后端工具：idea 2022.2.3  
前端工具： VSCode 1.72.2  
数据库：MySql 8.0
Maven：3.6.3  
git: 2.35.1

### 2.框架选型

后端框架：SpringBoot 2.3.7  
后端持久框架：Mybatis Plus
前端框架：Vue 3  
前端UI框架：Vant UI

## 二. 设计：

### 1.功能设计：

#### 采集人员APP：

登录，注册，选择采集点，开箱(转运箱码)，选择检测方式，添加试管(试管码)，添加用户(客户端APP用户二维码)，封箱。

#### 用户APP：

登录，注册，展示信息码

#### 转运人员APP(可选):

#### 检测机构(可选)：

#### 城市运营端(可选)：

### 2.数据库设计：

采集人员表:采集者ID，姓名，身份证，手机号，地区。
被采集人员表:人员ID，姓名，身份证，手机号。  
转运箱表:转运箱码，日期，转运箱状态  
试管表:试管码，日期，状态，转运箱码。   
试管被采集人员关联表:试管号，人员ID。

collector: collectorId,name,idNumber,phoneNumber,district  
person:personId,name,idNumber,phoneNumber  
case：caseId,openDate,caseState   
tube:tubeId,openDate,tubeState,caseId   
tube_person_relation:tubeId,personId

### 3.代码规范：

类名采用 UpperCamelCase 风格 exp:UserMapper，UserController。
方法名，参数名，变量名采用 lowerCamelCase 风格 exp:getUser(),boxId。
为了达到代码自解释的目标，任何自定义编程元素在命名时，使用尽量完整的单词 组合来表达其意。

## 三.实现

### 1.后端项目结构

#### 后端接口：
1.采集人员相关接口：

（1）查询采集人员相关信息：http://localhost:8081/collector/getAllCollector.do

（2）采集人员注册：http://localhost:8081/collector/register.do

（3）采集人员登录：http://localhost:8081/collector/login.do

（4）获取采人员集单条信息：http://localhost:8081/collector/getCollectorById.do

（5）删除采集人员信息：http://localhost:8081/collector/deleteCollector.do

（6）更新采集人员信息：http://localhost:8081/collector/updateCollector.do
##### 采集人员端

登录结果 登录接口(Collector collector(手机号 密码))   
注册结果 注册接口(Collector collector(手机号 密码 姓名 身份证 地区代码))  
开启结果 开箱接口(Case case(转运箱号，开箱时间，转运箱状态(默认0)))  
数量 获取当前转运箱中试管数()  
开管结果 开管接口(Tube tube(试管号 开管日期 试管状态(默认0) 转运箱号))


### 2.前端项目结构

