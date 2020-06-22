/*
Navicat MySQL Data Transfer

Source Server         : tengxun
Source Server Version : 50730
Source Host           : 212.64.73.31:3306
Source Database       : wesoft

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2020-06-21 22:00:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cno` varchar(48) CHARACTER SET utf8mb4 NOT NULL,
  `cname` text NOT NULL,
  `sname` varchar(48) NOT NULL,
  `snumber` varchar(48) NOT NULL,
  PRIMARY KEY (`cno`,`snumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭', '12441');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭0', '124410');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭1', '124411');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭2', '124412');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭3', '124413');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭4', '124414');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭5', '124415');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭6', '124416');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭7', '124417');
INSERT INTO `course` VALUES ('1', '软件工程', '鸭鸭8', '1314465');
INSERT INTO `course` VALUES ('1', '软件工程', '啦啦', '1975192');
INSERT INTO `course` VALUES ('1', '软件工程', '啦啦啦', '19754192');
INSERT INTO `course` VALUES ('1', '软件工程', '九九', '2410914');
INSERT INTO `course` VALUES ('1', '软件工程', '九九九', '24109814');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫0', '2415150');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫1', '2415151');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫2', '2415152');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫3', '2415153');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫4', '2415154');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫5', '2415155');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫6', '2415156');
INSERT INTO `course` VALUES ('1', '软件工程', '丫丫7', '2415157');
INSERT INTO `course` VALUES ('2', '计算理论', '小强', '138291');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀', '152637');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀0', '1526370');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀1', '1526371');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀2', '1526372');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀3', '1526373');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀4', '1526374');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀5', '1526375');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀6', '1526376');
INSERT INTO `course` VALUES ('2', '计算理论', '呀呀7', '1526377');
INSERT INTO `course` VALUES ('2', '计算理论', '哈哈', '2415152');
INSERT INTO `course` VALUES ('2', '计算理论', '小红', '415155');
INSERT INTO `course` VALUES ('3', '机器学习', '陈十', '123414');
INSERT INTO `course` VALUES ('3', '机器学习', '李明', '1241541');
INSERT INTO `course` VALUES ('4', '并行计算', '图图', '1424125');
INSERT INTO `course` VALUES ('4', '并行计算', '阿雄', '1495005');
INSERT INTO `course` VALUES ('4', '并行计算', '小王', '4156123');

-- ----------------------------
-- Table structure for coursedign
-- ----------------------------
DROP TABLE IF EXISTS `coursedign`;
CREATE TABLE `coursedign` (
  `cno` varchar(48) NOT NULL,
  `cname` text NOT NULL,
  `csigntime` datetime DEFAULT NULL,
  `csignposiL` varchar(255) DEFAULT NULL,
  `csignposiw` varchar(48) DEFAULT NULL,
  `signtimelast` int(3) DEFAULT NULL,
  `csigned` int(3) DEFAULT '0',
  `czno` varchar(48) DEFAULT NULL,
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coursedign
-- ----------------------------
INSERT INTO `coursedign` VALUES ('1', '5', '2020-06-21 16:04:45', '120.20523', '30.25727', '45', '45', '22');
INSERT INTO `coursedign` VALUES ('1200', 'hhh', '2020-06-10 20:43:51', '120.20522', '30.25728', '12', '2', '3');
INSERT INTO `coursedign` VALUES ('12200', 'hhh', '2011-11-11 01:00:00', '120.20522', '30.25723', '12', '2', '3');
INSERT INTO `coursedign` VALUES ('122001', 'hhh', '2011-11-11 01:00:00', '120.20522', '30.25726', '12', '2', '3');
INSERT INTO `coursedign` VALUES ('2', '1232', '2020-06-21 18:59:56', '120.20522', '30.25724', '30', null, null);
INSERT INTO `coursedign` VALUES ('3', '1232', '2020-06-21 19:14:19', '120.20523', '30.25723', '30', null, null);
INSERT INTO `coursedign` VALUES ('5', '66', '2020-06-21 19:02:26', '120.20524', '30.25729', '30', null, null);

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `cn` varchar(48) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `cna` text CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES ('1', '软件工程');
INSERT INTO `courses` VALUES ('2', '计算理论');
INSERT INTO `courses` VALUES ('3', '并行计算');
INSERT INTO `courses` VALUES ('4', '机器学习');

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc` (
  `snumber` varchar(48) NOT NULL,
  `cno` varchar(48) NOT NULL,
  PRIMARY KEY (`snumber`,`cno`),
  KEY `cno` (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('线性代数', '123');
INSERT INTO `sc` VALUES ('12', '22');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sno` varchar(48) NOT NULL,
  `sname` varchar(48) NOT NULL,
  `sex` varchar(4) NOT NULL,
  `snumber` varchar(48) NOT NULL,
  `sschool` varchar(48) NOT NULL,
  `spassword` varchar(48) NOT NULL,
  PRIMARY KEY (`snumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '2', '3', '4', '5', '6');
INSERT INTO `student` VALUES ('a', 'b', 'c', 'd', 'e', 'f');
INSERT INTO `student` VALUES ('A', 'B', 'C', 'DDD', 'E', 'F');

-- ----------------------------
-- Table structure for studentsign
-- ----------------------------
DROP TABLE IF EXISTS `studentsign`;
CREATE TABLE `studentsign` (
  `cno` varchar(48) NOT NULL,
  `snumber` varchar(48) NOT NULL,
  `czno` varchar(48) DEFAULT NULL,
  `stusigntime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`cno`,`snumber`),
  KEY `snumber` (`snumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentsign
-- ----------------------------
INSERT INTO `studentsign` VALUES ('0', '0', '3', '2013-12-23 00:00:00');
INSERT INTO `studentsign` VALUES ('1', '2', '3', '2020-06-15 16:16:42');
INSERT INTO `studentsign` VALUES ('100', '0', '3', '2013-12-23 00:00:00');
INSERT INTO `studentsign` VALUES ('1200', '02', '3', '2013-12-23 00:00:00');

-- ----------------------------
-- Table structure for totalnumbersign
-- ----------------------------
DROP TABLE IF EXISTS `totalnumbersign`;
CREATE TABLE `totalnumbersign` (
  `cno` varchar(48) NOT NULL,
  `cname` varchar(48) NOT NULL,
  `sname` varchar(48) NOT NULL,
  `snumber` varchar(48) NOT NULL,
  `totalnumber` int(3) DEFAULT NULL,
  PRIMARY KEY (`cno`,`snumber`),
  KEY `snumber` (`snumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of totalnumbersign
-- ----------------------------
INSERT INTO `totalnumbersign` VALUES ('1', '软件工程', '张三', '15372042305', '10');
INSERT INTO `totalnumbersign` VALUES ('1', '软件工程', '李小明', '15372042308', '10');
