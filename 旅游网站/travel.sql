/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-08-23 20:57:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `airticketbooking`
-- ----------------------------
DROP TABLE IF EXISTS `airticketbooking`;
CREATE TABLE `airticketbooking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `starting_city` varchar(255) DEFAULT NULL,
  `arrive_day` varchar(255) DEFAULT NULL,
  `start_time` date DEFAULT NULL,
  `arrive_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of airticketbooking
-- ----------------------------
INSERT INTO `airticketbooking` VALUES ('1', 'jack', '单程', 'a', 'a', '2020-07-29', '2020-08-05');

-- ----------------------------
-- Table structure for `line`
-- ----------------------------
DROP TABLE IF EXISTS `line`;
CREATE TABLE `line` (
  `lineID` int(11) NOT NULL AUTO_INCREMENT,
  `lineName` varchar(50) NOT NULL,
  `days` int(11) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`lineID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of line
-- ----------------------------
INSERT INTO `line` VALUES ('1', '黄陂木兰天池', '1', '159.00');
INSERT INTO `line` VALUES ('2', '大别山天堂寨', '2', '429.00');
INSERT INTO `line` VALUES ('5', '恩施大峡谷', '4', '1089.00');
INSERT INTO `line` VALUES ('6', '庐山', '2', '729.00');
INSERT INTO `line` VALUES ('7', '凤凰古城', '3', '959.00');
INSERT INTO `line` VALUES ('8', '黄山', '3', '1099.00');
INSERT INTO `line` VALUES ('9', '海南岛三亚', '5', '3868.00');
INSERT INTO `line` VALUES ('10', '青岛蓬莱', '4', '2680.00');
INSERT INTO `line` VALUES ('12', '桂林', '5', '1920.00');
INSERT INTO `line` VALUES ('13', '华东五市', '6', '2856.00');
INSERT INTO `line` VALUES ('14', '成都九寨沟', '7', '4500.00');
INSERT INTO `line` VALUES ('15', '西安', '4', '2180.00');
INSERT INTO `line` VALUES ('16', '欧洲德法意瑞', '13', '12294.91');
INSERT INTO `line` VALUES ('17', '日本东京富士山', '6', '7119.09');
INSERT INTO `line` VALUES ('18', '新马泰', '8', '6058.80');
INSERT INTO `line` VALUES ('19', '美国夏威夷', '6', '11493.90');
INSERT INTO `line` VALUES ('20', '梁子湖游', '1', '168.00');
INSERT INTO `line` VALUES ('21', '洪湖游', '1', '128.00');

-- ----------------------------
-- Table structure for `reserveticket`
-- ----------------------------
DROP TABLE IF EXISTS `reserveticket`;
CREATE TABLE `reserveticket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(255) DEFAULT NULL,
  `line` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `flight` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reserveticket
-- ----------------------------
INSERT INTO `reserveticket` VALUES ('1', 'jack', '北京-长沙', '2020-10-15', '￥345', '南方航班');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `user_email` varchar(30) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'jackson', '1059649341@qq.com', '123yujitong');
INSERT INTO `user` VALUES ('2', 'json', '1059649341@qq.com', 'yujitong11');
INSERT INTO `user` VALUES ('3', 'jack', '17723979810@163.com', '123321123');
