-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: shp
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adddisease`
--

DROP TABLE IF EXISTS `adddisease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adddisease` (
  `id` varchar(10) DEFAULT NULL,
  `disease_name` varchar(30) DEFAULT NULL,
  `symptoms` varchar(200) DEFAULT NULL,
  `types` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adddisease`
--

LOCK TABLES `adddisease` WRITE;
/*!40000 ALTER TABLE `adddisease` DISABLE KEYS */;
INSERT INTO `adddisease` VALUES ('1001','Coronary Artery Disease','shortness of breath,faster heartbeat,weakness,sweating','Heart'),('1002','AIDS','fever,throat inflammation,headache,rashes','Infection'),('1003','Dengue ','fever,headache,joint pains,measel like rashes','Infection'),('1004','Arrhythmias','palpitations,chest pounding,dizziness,fainting','Heart'),('1005','Heart Valve Disease','shortness of breath,weakness,dizziness,palpitations,irregular heartbeat','Heart'),('1006','Pericarditis','sharp chest pain,low grade fever,increased heart rate','Heart'),('1007','osteoporosis','rounded upperback,height loss','Bone'),('1008','Osteoporosis','fever,rednedd over infected area,swelling,stiffness','Bone');
/*!40000 ALTER TABLE `adddisease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adddoctor`
--

DROP TABLE IF EXISTS `adddoctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adddoctor` (
  `D_id` varchar(10) DEFAULT NULL,
  `D_name` varchar(30) DEFAULT NULL,
  `D_password` varchar(20) DEFAULT NULL,
  `D_address` varchar(50) DEFAULT NULL,
  `D_number` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adddoctor`
--

LOCK TABLES `adddoctor` WRITE;
/*!40000 ALTER TABLE `adddoctor` DISABLE KEYS */;
INSERT INTO `adddoctor` VALUES ('101','vivake','vivake123','ram nagar, delhi','9856643748'),('102','nehru','nehru123','sham nagar, mumbai','7688854935'),('103','Dr. Sam','sam1','delhi','6785945634'),('104','Dr. dodo','dodo1','mp','8567495324'),('105','Dr. nick','nick123','goa','8956743454'),('106','Dr. james','james1','hyd','6789453639');
/*!40000 ALTER TABLE `adddoctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `fb` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES ('thanks'),('You have done nice things :)'),('nice job !');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('admin','12345');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientlogin`
--

DROP TABLE IF EXISTS `patientlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientlogin` (
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientlogin`
--

LOCK TABLES `patientlogin` WRITE;
/*!40000 ALTER TABLE `patientlogin` DISABLE KEYS */;
INSERT INTO `patientlogin` VALUES ('joy','12345');
/*!40000 ALTER TABLE `patientlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientsignup`
--

DROP TABLE IF EXISTS `patientsignup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientsignup` (
  `name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `retype_pass` varchar(30) DEFAULT NULL,
  `number` varchar(20) DEFAULT NULL,
  `age` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientsignup`
--

LOCK TABLES `patientsignup` WRITE;
/*!40000 ALTER TABLE `patientsignup` DISABLE KEYS */;
INSERT INTO `patientsignup` VALUES ('jony','jony@gamil.com','jony123','56789','56789','8765432915','35'),('admin','admin@gamil.com','admin','12345','12345','5987437201','45'),('sweety','sweety@gmail.com','sweety123','12345','12345','7896574832','24'),('nick','nick@gmail.com','nick123','nick','nick','7896574834','26');
/*!40000 ALTER TABLE `patientsignup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-01 19:27:09
