# Host: localhost  (Version 8.0.30)
# Date: 2024-05-23 01:27:22
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "aturan"
#

DROP TABLE IF EXISTS `aturan`;
CREATE TABLE `aturan` (
  `no_aturan` varchar(3) NOT NULL DEFAULT '',
  `keputusan` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`no_aturan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "aturan"
#

INSERT INTO `aturan` VALUES ('1',2),('2',4),('3',1);

#
# Structure for table "detailaturan"
#

DROP TABLE IF EXISTS `detailaturan`;
CREATE TABLE `detailaturan` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `no_aturan` varchar(3) NOT NULL DEFAULT '',
  `id_var` int NOT NULL,
  `id_himp` int NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "detailaturan"
#

INSERT INTO `detailaturan` VALUES (1,'1',2,2),(2,'1',3,5),(3,'1',4,8),(4,'1',5,12),(5,'2',2,4),(6,'2',3,7),(7,'2',4,10),(8,'2',5,12),(9,'3',2,2),(10,'3',3,5),(11,'3',4,8),(12,'3',5,11);

#
# Structure for table "himpunan"
#

DROP TABLE IF EXISTS `himpunan`;
CREATE TABLE `himpunan` (
  `id_himp` int NOT NULL AUTO_INCREMENT,
  `id_var` int NOT NULL DEFAULT '0',
  `nama_himp` varchar(30) NOT NULL DEFAULT '',
  `batasbawah` smallint NOT NULL DEFAULT '0',
  `batastengah` smallint NOT NULL DEFAULT '0',
  `batasakhir` smallint NOT NULL DEFAULT '0',
  `fungsi` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_himp`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "himpunan"
#

INSERT INTO `himpunan` VALUES (1,1,'Dekat',10,0,30,0),(2,2,'Rendah',0,0,60,0),(3,2,'Sedang',60,80,100,1),(4,2,'Tinggi',100,0,150,2),(5,3,'Rendah',0,40,80,0),(6,3,'Sedang',80,100,120,1),(7,3,'Tinggi',120,140,170,2),(8,4,'Rendah',0,45,90,0),(9,4,'Sedang',90,110,130,1),(10,4,'Tinggi',130,145,160,2),(11,5,'Rendah',0,2,5,0),(12,5,'Sedang',5,6,7,1),(13,5,'Tinggi',7,8,9,2);

#
# Structure for table "variable"
#

DROP TABLE IF EXISTS `variable`;
CREATE TABLE `variable` (
  `id_var` int NOT NULL AUTO_INCREMENT,
  `nm_var` varchar(30) NOT NULL DEFAULT '',
  `jenis_var` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_var`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "variable"
#

INSERT INTO `variable` VALUES (2,'Gula Darah Puasa (mg/dl)','0'),(3,'Gula Plasma Puasa (mg/dl)','0'),(4,'Gula Darah 2 Jam PP (mg/dl)','0'),(5,'Kadar HbA1c (mg/dl)','0');
