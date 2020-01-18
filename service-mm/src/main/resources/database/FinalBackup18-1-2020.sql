/*
SQLyog Community v11.31 (64 bit)
MySQL - 5.7.28-log : Database - mm_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mm_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mm_db`;

/*Table structure for table `capacity_master` */

DROP TABLE IF EXISTS `capacity_master`;

CREATE TABLE `capacity_master` (
  `capacity_id` decimal(10,0) NOT NULL,
  `capacity_value` int(10) unsigned DEFAULT NULL,
  `capacity_desc` varchar(1000) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `capacity_flag` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`capacity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `capacity_master` */

insert  into `capacity_master`(`capacity_id`,`capacity_value`,`capacity_desc`,`created_by`,`updated_by`,`created_date`,`updated_date`,`capacity_flag`) values ('123',300,'user capacity',NULL,NULL,NULL,NULL,'yes'),('124',350,'machine capacity',NULL,NULL,NULL,NULL,'yes');

/*Table structure for table `machine_capacity_mapping` */

DROP TABLE IF EXISTS `machine_capacity_mapping`;

CREATE TABLE `machine_capacity_mapping` (
  `machine_capacity_mapping_id` decimal(11,0) DEFAULT NULL,
  `machine_id` decimal(11,0) DEFAULT NULL,
  `capacity_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `machine_capacity_mapping` */

insert  into `machine_capacity_mapping`(`machine_capacity_mapping_id`,`machine_id`,`capacity_id`,`created_by`,`updated_by`,`created_date`,`updated_date`) values ('1','1','124',NULL,NULL,NULL,NULL);

/*Table structure for table `machine_master` */

DROP TABLE IF EXISTS `machine_master`;

CREATE TABLE `machine_master` (
  `machine_id` decimal(10,0) NOT NULL,
  `machine_name` varchar(45) DEFAULT NULL,
  `machine_qty` int(10) unsigned DEFAULT NULL,
  `machine_desc` varchar(1000) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `is_active` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`machine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `machine_master` */

insert  into `machine_master`(`machine_id`,`machine_name`,`machine_qty`,`machine_desc`,`created_by`,`updated_by`,`created_date`,`updated_date`,`is_active`) values ('1','Lock',500,'Steaching',NULL,'ADMIN',NULL,'2019-12-28 15:33:33','Yes'),('2','Lock',300,'Steaching',NULL,'ADMIN',NULL,'2019-12-28 15:32:35','Yes');

/*Table structure for table `machine_priority_mapping` */

DROP TABLE IF EXISTS `machine_priority_mapping`;

CREATE TABLE `machine_priority_mapping` (
  `machine_priority_mapping_id` decimal(11,0) DEFAULT NULL,
  `machine_id` decimal(11,0) DEFAULT NULL,
  `priority_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `machine_priority_mapping` */

/*Table structure for table `machinne_rate_mapping` */

DROP TABLE IF EXISTS `machinne_rate_mapping`;

CREATE TABLE `machinne_rate_mapping` (
  `machinne_rate_mapping_id` decimal(11,0) DEFAULT NULL,
  `machine_id` decimal(11,0) DEFAULT NULL,
  `rate_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `machinne_rate_mapping` */

/*Table structure for table `payment_master` */

DROP TABLE IF EXISTS `payment_master`;

CREATE TABLE `payment_master` (
  `payment_id` decimal(10,0) NOT NULL,
  `payment_value` int(10) unsigned DEFAULT NULL,
  `payment_desc` varchar(1000) DEFAULT NULL,
  `paid` int(10) unsigned DEFAULT NULL,
  `unpaid` int(10) unsigned DEFAULT NULL,
  `total` int(10) unsigned DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `payment_flag` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `payment_master` */

/*Table structure for table `priority_master` */

DROP TABLE IF EXISTS `priority_master`;

CREATE TABLE `priority_master` (
  `priority_id` decimal(10,0) NOT NULL,
  `priority_all` int(10) unsigned DEFAULT NULL,
  `non_prioritized` int(10) unsigned DEFAULT NULL,
  `prioritized` int(10) unsigned DEFAULT NULL,
  `priority_desc` varchar(1000) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`priority_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `priority_master` */

/*Table structure for table `rate_master` */

DROP TABLE IF EXISTS `rate_master`;

CREATE TABLE `rate_master` (
  `rate_id` decimal(10,0) NOT NULL,
  `rate_value` int(10) unsigned DEFAULT NULL,
  `rate_desc` varchar(1000) DEFAULT NULL,
  `rate_unit_id` int(10) unsigned DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `is_active` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`rate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rate_master` */

/*Table structure for table `rate_unitmaster_mapping` */

DROP TABLE IF EXISTS `rate_unitmaster_mapping`;

CREATE TABLE `rate_unitmaster_mapping` (
  `rate_unitmaster_mapping_id` decimal(11,0) DEFAULT NULL,
  `rate_id` decimal(11,0) DEFAULT NULL,
  `unit_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rate_unitmaster_mapping` */

/*Table structure for table `unit_master` */

DROP TABLE IF EXISTS `unit_master`;

CREATE TABLE `unit_master` (
  `unit_id` decimal(10,0) NOT NULL,
  `unit_name` varchar(45) DEFAULT NULL,
  `unit_desc` varchar(1000) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `is_active` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`unit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unit_master` */

/*Table structure for table `user_capacity_mapping` */

DROP TABLE IF EXISTS `user_capacity_mapping`;

CREATE TABLE `user_capacity_mapping` (
  `user_capacity_mapping_id` decimal(11,0) DEFAULT NULL,
  `user_id` decimal(11,0) DEFAULT NULL,
  `capacity_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_capacity_mapping` */

insert  into `user_capacity_mapping`(`user_capacity_mapping_id`,`user_id`,`capacity_id`,`created_by`,`updated_by`,`created_date`,`updated_date`) values ('1','101','123',NULL,NULL,NULL,NULL);

/*Table structure for table `user_machine_mapping` */

DROP TABLE IF EXISTS `user_machine_mapping`;

CREATE TABLE `user_machine_mapping` (
  `user_machine_mapping_id` decimal(10,0) NOT NULL,
  `user_id` decimal(10,0) DEFAULT NULL,
  `machine_id` decimal(10,0) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`user_machine_mapping_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_machine_mapping` */

insert  into `user_machine_mapping`(`user_machine_mapping_id`,`user_id`,`machine_id`,`created_by`,`updated_by`,`created_date`,`updated_date`) values ('1','101','1',NULL,NULL,NULL,NULL),('2','101','2',NULL,NULL,NULL,NULL),('3','102','1','ADMIN',NULL,'2019-12-29 16:23:59',NULL),('4','102','1',NULL,NULL,NULL,NULL);

/*Table structure for table `user_master` */

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master` (
  `user_id` decimal(10,0) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `address` varchar(250) DEFAULT NULL,
  `postcode` varchar(12) DEFAULT NULL,
  `telephone` varchar(12) DEFAULT NULL,
  `bio` varchar(20) DEFAULT NULL,
  `user_type` varchar(30) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `user_password` varchar(250) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `lost_pass_token` varchar(200) DEFAULT NULL,
  `lost_pass_expiry` varchar(50) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `last_login_ip` varchar(30) DEFAULT NULL,
  `registered_id` varchar(30) DEFAULT NULL,
  `active` varchar(4) DEFAULT NULL,
  `activated_date` datetime DEFAULT NULL,
  `user_desc` varchar(1000) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_master` */

insert  into `user_master`(`user_id`,`first_name`,`last_name`,`dob`,`gender`,`district`,`address`,`postcode`,`telephone`,`bio`,`user_type`,`user_name`,`email`,`user_password`,`salt`,`lost_pass_token`,`lost_pass_expiry`,`last_login`,`last_login_ip`,`registered_id`,`active`,`activated_date`,`user_desc`,`created_by`,`updated_by`,`created_date`,`updated_date`) values ('101','Dilip','Kirar','1990-04-10','Male','Guna','Guna','411057','8904416798',NULL,NULL,'dilipkirar','kirardilip@gmail.com',NULL,NULL,NULL,NULL,'2019-12-28 15:25:09',NULL,'744629','YES','2019-12-28 05:30:00','string',NULL,'ADMIN',NULL,'2019-12-28 15:25:09'),('102','Roshan','Singh','1986-07-17','male','15','Guna',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('103','DDDD','KKKK','1986-07-17','male','15','Guna',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `user_payment_mapping` */

DROP TABLE IF EXISTS `user_payment_mapping`;

CREATE TABLE `user_payment_mapping` (
  `user_payment_mapping_id` decimal(11,0) DEFAULT NULL,
  `user_id` decimal(11,0) DEFAULT NULL,
  `payment_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_payment_mapping` */

/*Table structure for table `user_priority_mapping` */

DROP TABLE IF EXISTS `user_priority_mapping`;

CREATE TABLE `user_priority_mapping` (
  `user_priority_mapping_id` decimal(11,0) DEFAULT NULL,
  `user_id` decimal(11,0) DEFAULT NULL,
  `priority_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_priority_mapping` */

/*Table structure for table `work` */

DROP TABLE IF EXISTS `work`;

CREATE TABLE `work` (
  `work_id` decimal(10,0) NOT NULL,
  `user_master_user_id` decimal(10,0) NOT NULL,
  `party_name` varchar(45) DEFAULT NULL,
  `issue_date` datetime DEFAULT NULL,
  `top` int(10) unsigned DEFAULT NULL,
  `pant` int(10) unsigned DEFAULT NULL,
  `size` int(10) unsigned DEFAULT NULL,
  `qty` int(10) unsigned DEFAULT NULL,
  `work_name` varchar(50) DEFAULT NULL,
  `work_desc` varchar(1000) DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `work_flag` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`work_id`),
  KEY `work_FKIndex1` (`user_master_user_id`),
  CONSTRAINT `work_ibfk_1` FOREIGN KEY (`user_master_user_id`) REFERENCES `user_master` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `work` */

/*Table structure for table `work_payment_mapping` */

DROP TABLE IF EXISTS `work_payment_mapping`;

CREATE TABLE `work_payment_mapping` (
  `work_payment_mapping_id` decimal(11,0) DEFAULT NULL,
  `work_id` decimal(11,0) DEFAULT NULL,
  `payment_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `work_payment_mapping` */

/*Table structure for table `work_priority_mapping` */

DROP TABLE IF EXISTS `work_priority_mapping`;

CREATE TABLE `work_priority_mapping` (
  `work_priority_mapping_id` decimal(11,0) DEFAULT NULL,
  `work_id` decimal(11,0) DEFAULT NULL,
  `priority_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `work_priority_mapping` */

/*Table structure for table `work_rate_mapping` */

DROP TABLE IF EXISTS `work_rate_mapping`;

CREATE TABLE `work_rate_mapping` (
  `work_rate_mapping_id` decimal(11,0) DEFAULT NULL,
  `work_id` decimal(11,0) DEFAULT NULL,
  `rate_id` decimal(11,0) DEFAULT NULL,
  `created_by` varchar(135) DEFAULT NULL,
  `updated_by` varchar(135) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `work_rate_mapping` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
