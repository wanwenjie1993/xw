/*
Navicat MySQL Data Transfer

Source Server         : wanwj1
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : xw

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-04-03 16:16:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for xw_article
-- ----------------------------
DROP TABLE IF EXISTS `xw_article`;
CREATE TABLE `xw_article` (
  `articleId` varchar(20) DEFAULT NULL,
  `articleTitle` varchar(256) DEFAULT NULL,
  `articleTag` varchar(256) DEFAULT NULL,
  `articleContent` mediumtext,
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xw_article
-- ----------------------------
INSERT INTO `xw_article` VALUES ('123', 'tital', 'diyizhang', 'neirong666', '2019-04-03 16:16:06');
