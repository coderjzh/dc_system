/*
 Navicat Premium Data Transfer

 Source Server         : 本地管理员
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : dc_system

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 02/11/2022 21:08:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for case
-- ----------------------------
DROP TABLE IF EXISTS `case`;
CREATE TABLE `case`  (
  `caseId` int(11) NOT NULL COMMENT '转运箱号',
  `openDate` datetime NOT NULL COMMENT '开箱日期',
  `caseState` int(2) NOT NULL DEFAULT 0 COMMENT '转运箱状态 开箱0封箱1正在运输2检测中3检测完成4',
  PRIMARY KEY (`caseId`) USING BTREE,
  INDEX `caseId`(`caseId`) USING BTREE,
  INDEX `caseId_2`(`caseId`) USING BTREE,
  INDEX `caseId_3`(`caseId`) USING BTREE,
  INDEX `caseId_4`(`caseId`) USING BTREE,
  INDEX `caseId_5`(`caseId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '转运箱表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of case
-- ----------------------------

-- ----------------------------
-- Table structure for collector
-- ----------------------------
DROP TABLE IF EXISTS `collector`;
CREATE TABLE `collector`  (
  `collectorId` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '采集人员姓名',
  `idNumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '采集人员身份证',
  `phoneNumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '采集人员手机号',
  `district` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '采集人员地区代码',
  PRIMARY KEY (`collectorId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '采集人员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of collector
-- ----------------------------

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `personId` int(11) NOT NULL COMMENT '被采集人员识别码',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '被采集人员姓名',
  `idNumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '被采集人员身份证',
  `phoneNumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '被采集人员手机号',
  PRIMARY KEY (`personId`) USING BTREE,
  INDEX `personId`(`personId`) USING BTREE,
  INDEX `personId_2`(`personId`) USING BTREE,
  INDEX `personId_3`(`personId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '被采集人员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result`  (
  `tubeId` int(11) NOT NULL COMMENT '试管码',
  `resState` int(1) NOT NULL DEFAULT 0 COMMENT '试管检测状态 未检测0阴性1阳性2',
  PRIMARY KEY (`tubeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '核酸结果表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result
-- ----------------------------

-- ----------------------------
-- Table structure for tube
-- ----------------------------
DROP TABLE IF EXISTS `tube`;
CREATE TABLE `tube`  (
  `tubeId` int(11) NOT NULL COMMENT '试管号',
  `openDate` datetime NOT NULL COMMENT '开管日期',
  `tubeState` int(1) NOT NULL DEFAULT 0 COMMENT '试管状态 开管0封管1未检测2已检测3',
  `caseId` int(11) NOT NULL COMMENT '所属转运箱',
  PRIMARY KEY (`tubeId`) USING BTREE,
  INDEX `tubeId`(`tubeId`) USING BTREE,
  INDEX `tubeId_2`(`tubeId`) USING BTREE,
  INDEX `tubeId_3`(`tubeId`) USING BTREE,
  INDEX `tubeId_4`(`tubeId`) USING BTREE,
  INDEX `tubeId_5`(`tubeId`) USING BTREE,
  INDEX `tubeId_6`(`tubeId`) USING BTREE,
  INDEX `tubeId_7`(`tubeId`) USING BTREE,
  INDEX `tubeId_8`(`tubeId`) USING BTREE,
  INDEX `tubeId_9`(`tubeId`) USING BTREE,
  INDEX `tubeId_10`(`tubeId`) USING BTREE,
  INDEX `tubeId_11`(`tubeId`) USING BTREE,
  INDEX `tubeId_12`(`tubeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '试管表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tube
-- ----------------------------

-- ----------------------------
-- Table structure for tube_person_relation
-- ----------------------------
DROP TABLE IF EXISTS `tube_person_relation`;
CREATE TABLE `tube_person_relation`  (
  `tubeId` int(11) NOT NULL COMMENT '试管号',
  `personId` int(11) NOT NULL COMMENT '被采集人员识别码',
  PRIMARY KEY (`tubeId`) USING BTREE,
  INDEX `personId`(`personId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '试管人员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tube_person_relation
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
