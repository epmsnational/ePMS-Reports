-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: blankzimepms
-- ------------------------------------------------------
-- Server version	8.0.22-0ubuntu0.20.04.3

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
-- Table structure for table `adverseeventtype`
--

DROP TABLE IF EXISTS `adverseeventtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adverseeventtype` (
  `ID` int NOT NULL,
  `AdverseEventName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adverseeventtype`
--

LOCK TABLES `adverseeventtype` WRITE;
/*!40000 ALTER TABLE `adverseeventtype` DISABLE KEYS */;
INSERT INTO `adverseeventtype` VALUES (1,'Pain(A-PA)'),(2,'Bleeding (A-BL)'),(3,'Anasthetic-related problem(A-AN)'),(4,'Damaged penis  (A-SD)'),(5,'Difficulty with placement (A-DP)'),(6,'Device malfunction (A-DM)');
/*!40000 ALTER TABLE `adverseeventtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `art_sqnumber`
--

DROP TABLE IF EXISTS `art_sqnumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `art_sqnumber` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sqnumber` int DEFAULT NULL,
  `year` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `art_sqnumber`
--

LOCK TABLES `art_sqnumber` WRITE;
/*!40000 ALTER TABLE `art_sqnumber` DISABLE KEYS */;
/*!40000 ALTER TABLE `art_sqnumber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `basicvitals`
--

DROP TABLE IF EXISTS `basicvitals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `basicvitals` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Height` float DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `temperature` float(255,0) DEFAULT NULL,
  `BloodPressure` varchar(255) DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `FunctionalStatus` int DEFAULT NULL,
  `VisitDate` datetime DEFAULT NULL,
  `basicvitalscol` varchar(45) DEFAULT NULL,
  `test` tinyint DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basicvitals`
--

LOCK TABLES `basicvitals` WRITE;
/*!40000 ALTER TABLE `basicvitals` DISABLE KEYS */;
/*!40000 ALTER TABLE `basicvitals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cbs`
--

DROP TABLE IF EXISTS `cbs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cbs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `HTCNumber` varchar(255) DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `NationalID` varchar(255) DEFAULT NULL,
  `ArtNumber` varchar(45) DEFAULT NULL,
  `artRegimen` varchar(45) DEFAULT NULL,
  `DateFormCompleted` date DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `religion` varchar(45) DEFAULT NULL,
  `highest EducationalLevel` varchar(45) DEFAULT NULL,
  `pseudoID` varchar(45) DEFAULT NULL,
  `selfIdGeder` varchar(45) DEFAULT NULL,
  `distOfBirth` varchar(45) DEFAULT NULL,
  `momName` varchar(45) DEFAULT NULL,
  `maritalStatus` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `districtOfResidence` varchar(45) DEFAULT NULL,
  `nationality` varchar(45) DEFAULT NULL,
  `RecentPositive` date DEFAULT NULL,
  `isPregnant` varchar(45) DEFAULT NULL,
  `isBreadfeeding` varchar(45) DEFAULT NULL,
  `infantFeedingMode` varchar(45) DEFAULT NULL,
  `siteOfDelivery` varchar(45) DEFAULT NULL,
  `GavidityOfMother` varchar(45) DEFAULT NULL,
  `SuspVictSexualAbuse` varchar(45) DEFAULT NULL,
  `EarlySexDebutMale` varchar(45) DEFAULT NULL,
  `EarlySexDebutFemale` varchar(45) DEFAULT NULL,
  `unProtectedSexWithMale` varchar(45) DEFAULT NULL,
  `unProtectedSexWithFemale` varchar(45) DEFAULT NULL,
  `sexWithSexWorker` varchar(45) DEFAULT NULL,
  `ExchangedSexMoney` varchar(45) DEFAULT NULL,
  `BeenPrison` varchar(45) DEFAULT NULL,
  `RecMedicalInjection` varchar(45) DEFAULT NULL,
  `Injectables` varchar(45) DEFAULT NULL,
  `RecBloodTranfusion` varchar(45) DEFAULT NULL,
  `STIHistory` varchar(45) DEFAULT NULL,
  `isMotherAlive` varchar(45) DEFAULT NULL,
  `motherMartalStatus` varchar(45) DEFAULT NULL,
  `momOARTnumber` varchar(45) DEFAULT NULL,
  `MomArtstatus` varchar(45) DEFAULT NULL,
  `MomHivTesting` varchar(45) DEFAULT NULL,
  `MomOtherRegimen` varchar(45) DEFAULT NULL,
  `surrogateMother` varchar(45) DEFAULT NULL,
  `ancbooking` varchar(45) DEFAULT NULL,
  `gaatbooking` varchar(45) DEFAULT NULL,
  `parityatbooking` varchar(45) DEFAULT NULL,
  `numberofancvisits` varchar(45) DEFAULT NULL,
  `sexmaleagedebut` varchar(45) DEFAULT NULL,
  `sexfemaleagedebut` varchar(45) DEFAULT NULL,
  `everBeenOnPrep` varchar(45) DEFAULT NULL,
  `everBeenOnAnyArtNotPrep` varchar(45) DEFAULT NULL,
  `currentlyOnART` varchar(45) DEFAULT NULL,
  `monthsRecentPositive` varchar(45) DEFAULT NULL,
  `datestoppedart` varchar(45) DEFAULT NULL,
  `poorbreastfeed` varchar(45) DEFAULT NULL,
  `otherriskfactors` varchar(345) DEFAULT NULL,
  `probablerouteoftransmission` varchar(345) DEFAULT NULL,
  `sexualabused` varchar(45) DEFAULT NULL,
  `unprotectedsexnocondom` varchar(45) DEFAULT NULL,
  `tatooedwithunsterilized` varchar(45) DEFAULT NULL,
  `otherrouteoftransmission` varchar(45) DEFAULT NULL,
  `sexualactive` varchar(45) DEFAULT NULL,
  `ContactOfIndexTest` varchar(45) DEFAULT NULL,
  `contactofindexcaseHTSnumber` varchar(45) DEFAULT NULL,
  `contactofindexcaseARTnumber` varchar(45) DEFAULT NULL,
  `contactofindexcaseUNIQnumber` varchar(45) DEFAULT NULL,
  `initiatedonart` varchar(45) DEFAULT NULL,
  `reasonNotInitiatedOnArt` varchar(45) DEFAULT NULL,
  `typeOfDelivery` varchar(45) DEFAULT NULL,
  `placeOfDelivery` varchar(45) DEFAULT NULL,
  `deliveredBy` varchar(45) DEFAULT NULL,
  `InfantProphylaxisDuration` varchar(45) DEFAULT NULL,
  `feedingMethod` varchar(45) DEFAULT NULL,
  `currentlyBF` varchar(45) DEFAULT NULL,
  `birthWeight` varchar(45) DEFAULT NULL,
  `gaAtDelivery` varchar(45) DEFAULT NULL,
  `feedingAgeCeased` varchar(45) DEFAULT NULL,
  `feedingDuration` varchar(45) DEFAULT NULL,
  `infantProphylaxis` varchar(45) DEFAULT NULL,
  `StaffMemberEntering` varchar(45) DEFAULT NULL,
  `StaffMemberTelephone` varchar(45) DEFAULT NULL,
  `StaffMemberEmail` varchar(45) DEFAULT NULL,
  `dateEnteredEpms` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `HTCNumber_UNIQUE` (`HTCNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cbs`
--

LOCK TABLES `cbs` WRITE;
/*!40000 ALTER TABLE `cbs` DISABLE KEYS */;
/*!40000 ALTER TABLE `cbs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cbs_setupentrypoints`
--

DROP TABLE IF EXISTS `cbs_setupentrypoints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cbs_setupentrypoints` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cbs_setupentrypoints`
--

LOCK TABLES `cbs_setupentrypoints` WRITE;
/*!40000 ALTER TABLE `cbs_setupentrypoints` DISABLE KEYS */;
/*!40000 ALTER TABLE `cbs_setupentrypoints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cbs_setupfacilitytype`
--

DROP TABLE IF EXISTS `cbs_setupfacilitytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cbs_setupfacilitytype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `facilitytype` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cbs_setupfacilitytype`
--

LOCK TABLES `cbs_setupfacilitytype` WRITE;
/*!40000 ALTER TABLE `cbs_setupfacilitytype` DISABLE KEYS */;
/*!40000 ALTER TABLE `cbs_setupfacilitytype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cbs_setupserviceaccess`
--

DROP TABLE IF EXISTS `cbs_setupserviceaccess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cbs_setupserviceaccess` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(45) NOT NULL,
  `isHIV` int NOT NULL,
  `isSyphilis` int NOT NULL,
  `isARVTherapy` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cbs_setupserviceaccess`
--

LOCK TABLES `cbs_setupserviceaccess` WRITE;
/*!40000 ALTER TABLE `cbs_setupserviceaccess` DISABLE KEYS */;
/*!40000 ALTER TABLE `cbs_setupserviceaccess` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cbs_setuptestkittypes`
--

DROP TABLE IF EXISTS `cbs_setuptestkittypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cbs_setuptestkittypes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(45) DEFAULT NULL,
  `progId` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cbs_setuptestkittypes`
--

LOCK TABLES `cbs_setuptestkittypes` WRITE;
/*!40000 ALTER TABLE `cbs_setuptestkittypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `cbs_setuptestkittypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cbs_tests`
--

DROP TABLE IF EXISTS `cbs_tests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cbs_tests` (
  `id` int NOT NULL AUTO_INCREMENT,
  `OPDNumber` varchar(255) NOT NULL,
  `HTCNumber` varchar(255) DEFAULT NULL,
  `recencyTesting` varchar(45) DEFAULT NULL,
  `recencyTesterName` varchar(45) DEFAULT NULL,
  `recencyTestingDate` date DEFAULT NULL,
  `recencyTestingResult` varchar(45) DEFAULT NULL,
  `recencyTestingNotDone` varchar(45) DEFAULT NULL,
  `dateHivDiagnosed` date DEFAULT NULL,
  `firstTestMethod` varchar(45) DEFAULT NULL,
  `firstTestResult` varchar(10) DEFAULT NULL,
  `SecondTestMethod` varchar(45) DEFAULT NULL,
  `SecondTestResult` varchar(10) DEFAULT NULL,
  `WhoStageAtNotification` varchar(45) DEFAULT NULL,
  `WhoStage` varchar(45) DEFAULT NULL,
  `CdCountTest` varchar(45) DEFAULT NULL,
  `CdCountResult` int DEFAULT NULL,
  `CdCountPercentage` int DEFAULT NULL,
  `CdCountTestDate` date DEFAULT NULL,
  `MotherViralloadFirstTest` varchar(45) DEFAULT NULL,
  `MotherViralloadFirstTestResult` int DEFAULT NULL,
  `MotherViralloadFirstTestDate` date DEFAULT NULL,
  `MotherViralloadSecondTest` varchar(45) DEFAULT NULL,
  `MotherViralloadSecondTestResult` int DEFAULT NULL,
  `MotherViralloadSecondTestDate` date DEFAULT NULL,
  `dateFormCompleted` date DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cbs_tests`
--

LOCK TABLES `cbs_tests` WRITE;
/*!40000 ALTER TABLE `cbs_tests` DISABLE KEYS */;
/*!40000 ALTER TABLE `cbs_tests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `circumcisionreasontype`
--

DROP TABLE IF EXISTS `circumcisionreasontype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `circumcisionreasontype` (
  `ID` int NOT NULL,
  `CircumcisionReasonName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `circumcisionreasontype`
--

LOCK TABLES `circumcisionreasontype` WRITE;
/*!40000 ALTER TABLE `circumcisionreasontype` DISABLE KEYS */;
INSERT INTO `circumcisionreasontype` VALUES (1,'Partial HIV protection'),(2,'Sexual pleasure'),(3,'STI protection'),(4,'Medical '),(5,'Appearance'),(6,'Hygiene'),(7,'Cultural/ social'),(8,'Religious'),(99,'Other');
/*!40000 ALTER TABLE `circumcisionreasontype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complainttype`
--

DROP TABLE IF EXISTS `complainttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complainttype` (
  `ID` int NOT NULL,
  `ComplaintName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complainttype`
--

LOCK TABLES `complainttype` WRITE;
/*!40000 ALTER TABLE `complainttype` DISABLE KEYS */;
INSERT INTO `complainttype` VALUES (1,'Painful/ weak erection'),(2,'Swelling of the scrotum'),(3,'Pain on urination'),(4,'Urethral discharge'),(5,'Genital sore'),(6,'Difficulty in retracting the foreskin'),(99,'Other');
/*!40000 ALTER TABLE `complainttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosistype`
--

DROP TABLE IF EXISTS `diagnosistype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diagnosistype` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DiagnosisName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnosistype`
--

LOCK TABLES `diagnosistype` WRITE;
/*!40000 ALTER TABLE `diagnosistype` DISABLE KEYS */;
INSERT INTO `diagnosistype` VALUES (1,'Anaemia'),(2,'Cancer'),(3,'Hypertension'),(4,'Bleeding disorder'),(5,'Diabetes mellitus'),(6,'Peripheral vascular disease'),(7,'Heart condition'),(8,'Liver disease'),(9,'Kidney disease'),(10,'Thyroid disease');
/*!40000 ALTER TABLE `diagnosistype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `district` (
  `ID` int NOT NULL,
  `ProvinceID` int DEFAULT NULL,
  `DistrictName` varchar(255) DEFAULT NULL,
  `DistrictCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
INSERT INTO `district` VALUES (1,0,'Harare','6'),(2,0,'Harare Urban','A'),(3,0,'Chitungwisa Urban','B'),(4,0,'Chitungwiza Hospital','C'),(5,0,'Harare Central Hospital','D'),(6,0,'Parirenyatwa','E'),(7,0,'Harare City Clinics','F'),(8,1,'Buhera','1'),(9,1,'Chimanimani','2'),(10,1,'Chipinge','3'),(11,1,'Makoni','4'),(12,1,'Mutare','5'),(13,1,'Mutasa','6'),(14,1,'Nyanga','7'),(15,1,'Mutare City','8'),(16,2,'Bindura','1'),(17,2,'Centenary','2'),(18,2,'Guruve','3'),(19,2,'Mazowe','4'),(20,2,'Mt. Darwin','5'),(21,2,'Rushinga','6'),(22,2,'Shamva','7'),(23,2,'Mbire','8'),(24,3,'Chikomba','1'),(25,3,'Goromonzi','2'),(26,3,'U.M.P','3'),(27,3,'Hwedza','4'),(28,3,'Marondera','5'),(29,3,'Mudzi','6'),(30,3,'Murewa','7'),(31,3,'Mutoko','8'),(32,3,'Seke','9'),(33,4,'Chegutu','1'),(34,4,'Hurungwe','2'),(35,4,'Kadoma','3'),(36,4,'Kariba','4'),(37,4,'Makonde','5'),(38,4,'Zvimba','6'),(39,5,'Binga','1'),(40,5,'Bubi','2'),(41,5,'Hwange','3'),(42,5,'Lupane','4'),(43,5,'Nkayi','5'),(44,5,'Tsholotsho','6'),(45,5,'Umguza','7'),(46,6,'Beitbridge','1'),(47,6,'Bulilima','2'),(48,6,'Gwanda','3'),(49,6,'Insiza','4'),(50,6,'Matobo','5'),(51,6,'Umzingwane','6'),(52,6,'Mangwe','7'),(53,7,'Chirumhanzu','1'),(54,7,'Gokwe North','2'),(55,7,'Gweru','3'),(56,7,'Kwekwe','4'),(57,7,'Mberengwa','5'),(58,7,'Shurugwi','6'),(59,7,'Zvishavane','7'),(60,7,'Gokwe South','8'),(61,8,'Bikita','1'),(62,8,'Chiredzi','2'),(63,8,'Chivi','3'),(64,8,'Gutu','4'),(65,8,'Masvingo','5'),(66,8,'Mwenezi','6'),(67,8,'Zaka','7'),(68,9,'Bulawayo (Rural)','1'),(69,9,'Bulawayo (Urban)','A'),(70,9,'Ingutsheni','B'),(71,9,'U.B.H.','C'),(72,9,'Mpilo Hospital','D'),(73,10,'Brine','1'),(74,11,'Brine','1');
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facilities`
--

DROP TABLE IF EXISTS `facilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facilities` (
  `FacilityID` int NOT NULL AUTO_INCREMENT,
  `ProvinceCode` int NOT NULL,
  `DistrictCode` varchar(45) NOT NULL,
  `FacilityCode` varchar(45) NOT NULL,
  `FacilityName` varchar(90) NOT NULL,
  `FullFacilityCode` varchar(45) NOT NULL,
  `FullFacilityCodeDashes` varchar(45) NOT NULL,
  PRIMARY KEY (`FacilityID`)
) ENGINE=InnoDB AUTO_INCREMENT=1647 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facilities`
--

LOCK TABLES `facilities` WRITE;
/*!40000 ALTER TABLE `facilities` DISABLE KEYS */;
INSERT INTO `facilities` VALUES (1,0,'A','01','Avondale Clinic','000A01','00-0A-01'),(2,0,'A','02','Arcadia P.C.C.','000A02','00-0A-02'),(3,0,'A','03','Bank Street P.C.C.','000A03','00-0A-03'),(4,0,'A','05','Belvedere F.H.C.','000A05','00-0A-05'),(5,0,'A','06','Borrowdale F.H.C.','000A06','00-0A-06'),(6,0,'A','07','Borrowdale P.C.C.','000A07','00-0A-07'),(7,0,'A','08','Braeside F.H.C.','000A08','00-0A-08'),(8,0,'A','09','Budiriro Polyclinic','000A09','00-0A-09'),(9,0,'A','0A','Mbuya Nehanda','000A0A','00-0A-0A'),(10,0,'A','0B','Psychriatic Unit','000A0B','00-0A-0B'),(11,0,'A','0C','Beatrice Rd.Infectio','000A0C','00-0A-0C'),(12,0,'A','0D','Wilkins Infectious H','000A0D','00-0A-0D'),(13,0,'A','0E','St.Annes','000A0E','00-0A-0E'),(14,0,'A','0F','Avenues Clinic','000A0F','00-0A-0F'),(15,0,'A','0U','Harare City All Clinics','000A0U','00-0A-0U'),(16,0,'A','10','Eastlea F.H.C.','000A10','00-0A-10'),(17,0,'A','11','Glen Norah Satellite','000A11','00-0A-11'),(18,0,'A','12','Glen Norah Polyclin.','000A12','00-0A-12'),(19,0,'A','13','Glen View Polyclinic','000A13','00-0A-13'),(20,0,'A','14','Glen View Satellite','000A14','00-0A-14'),(21,0,'A','15','Greendale F.H.C.','000A15','00-0A-15'),(22,0,'A','16','Hatcliffe F.H.C.','000A16','00-0A-16'),(23,0,'A','17','Hatcliffe P.C.C.','000A17','00-0A-17'),(24,0,'A','18','Highfield Polyclinic','000A18','00-0A-18'),(25,0,'A','19','Kambuzuma Polyclinic','000A19','00-0A-19'),(26,0,'A','20','Kuwadzana Polyclinic','000A20','00-0A-20'),(27,0,'A','21','Mabelreign Satellite','000A21','00-0A-21'),(28,0,'A','22','Mabvuku F.H.C.','000A22','00-0A-22'),(29,0,'A','23','Mabvuku P.C.C.','000A23','00-0A-23'),(30,0,'A','24','Marondera Polyclinic','000A24','00-0A-24'),(31,0,'A','25','Matapi Clinic','000A25','00-0A-25'),(32,0,'A','26','Mbare Hostels Clinic','000A26','00-0A-26'),(33,0,'A','27','Mbare Polyclinic','000A27','00-0A-27'),(34,0,'A','28','Mt.Pleasant P.C.C.','000A28','00-0A-28'),(35,0,'A','29','Mufakose Polyclinic','000A29','00-0A-29'),(36,0,'A','30','Parirenyatwa P.C.C.','000A30','00-0A-30'),(37,0,'A','31','Queen Elisabeth Fhc.','000A31','00-0A-31'),(38,0,'A','32','Rugare Clinic','000A32','00-0A-32'),(39,0,'A','33','Rujeko Clinic','000A33','00-0A-33'),(40,0,'A','34','Rutsanana Clinic','000A34','00-0A-34'),(41,0,'A','35','Southerton P.C.C.','000A35','00-0A-35'),(42,0,'A','36','Sunningdale F.H.C.','000A36','00-0A-36'),(43,0,'A','37','Sunningdale P.C.C.','000A37','00-0A-37'),(44,0,'A','38','Tafara Clinic','000A38','00-0A-38'),(45,0,'A','39','Warren Park Polycli.','000A39','00-0A-39'),(46,0,'A','40','Waterfalls F.H.C.','000A40','00-0A-40'),(47,0,'A','41','Waterfalls P.C.C.','000A41','00-0A-41'),(48,0,'A','42','Western Triangle Pcc','000A42','00-0A-42'),(49,0,'A','43','Kg Six','000A43','00-0A-43'),(50,0,'B','01','Seke South Clinic','000B01','00-0B-01'),(51,0,'B','02','Seke North Clinic','000B02','00-0B-02'),(52,0,'B','03','St.Mary\'s Clinic','000B03','00-0B-03'),(53,0,'B','04','Zengeza Clinic','000B04','00-0B-04'),(54,0,'B','0B','South Medical Hospital','000B0B','00-0B-0B'),(55,0,'C','01','Chitungwiza Hospital','000C01','00-0C-01'),(56,0,'D','01','Harare Cent Hosp','000D01','00-0D-01'),(57,0,'D','07','Harare Hosp','000D07','00-0D-07'),(58,0,'D','0D','Harare  Hosp','000D0D','00-0D-0D'),(59,0,'E','01','Casualty','000E01','00-0E-01'),(60,0,'E','02','Domestic Staff Clin.','000E02','00-0E-02'),(61,0,'E','03','Family Planning','000E03','00-0E-03'),(62,0,'E','04','Geriatric Centre','000E04','00-0E-04'),(63,0,'E','05','G.M.O.','000E05','00-0E-05'),(64,0,'E','06','O.P.D. (T)','000E06','00-0E-06'),(65,0,'E','07','O.P.D. (Nt)','000E07','00-0E-07'),(66,0,'E','08','Radiotherapy','000E08','00-0E-08'),(67,0,'E','09','Sekuru Kaguvi','000E09','00-0E-09'),(68,0,'E','0E','Parirenyatwa','000E0E','00-0E-0E'),(69,0,'E','10','Staff Clinic','000E10','00-0E-10'),(70,0,'F','01','Parirenyatwa Clinic','000F01','00-0F-01'),(71,0,'F','02','Hatfield Clinic','000F02','00-0F-02'),(72,0,'F','03','Arcadia Clinic','000F03','00-0F-03'),(73,0,'F','04','Mabvuku Poly','000F04','00-0F-04'),(74,0,'F','05','Highlands','000F05','00-0F-05'),(75,0,'F','06','Mabvuku Satelite Clinic','000F06','00-0F-06'),(76,0,'F','07','Borrowdale Clinic','000F07','00-0F-07'),(77,0,'F','08','Mount Pleasant','000F08','00-0F-08'),(78,0,'F','09','Hatcliffe Clinic','000F09','00-0F-09'),(79,0,'F','0C','Beatrice Road Hosp','000F0C','00-0F-0C'),(80,0,'F','0D','Wilkins Hospital','000F0D','00-0F-0D'),(81,0,'F','10','Avondale Clinic','000F10','00-0F-10'),(82,0,'F','11','Marlborough Satelite Clinic','000F11','00-0F-11'),(83,0,'F','12','Mabelreign Satelite','000F12','00-0F-12'),(84,0,'F','13','Rujeko Poly','000F13','00-0F-13'),(85,0,'F','14','Belvedere Satelite','000F14','00-0F-14'),(86,0,'F','15','Warren Park  Poly','000F15','00-0F-15'),(87,0,'F','16','Kuwadzana Poly','000F16','00-0F-16'),(88,0,'F','17','Kambuzuma Poly','000F17','00-0F-17'),(89,0,'F','18','Southerton Clinic','000F18','00-0F-18'),(90,0,'F','19','Highfield Poly','000F19','00-0F-19'),(91,0,'F','20','Rutsanana Poly','000F20','00-0F-20'),(92,0,'F','21','Western Triangle Clinic','000F21','00-0F-21'),(93,0,'F','22','Glen Norah Satelite','000F22','00-0F-22'),(94,0,'F','23','Glen View  Poly','000F23','00-0F-23'),(95,0,'F','24','Glen View Satelite','000F24','00-0F-24'),(96,0,'F','25','Mufakose Poly','000F25','00-0F-25'),(97,0,'F','26','Budiriro Poly','000F26','00-0F-26'),(98,0,'F','27','Mbare Poly ','000F27','00-0F-27'),(99,0,'F','28','Matapi Clinic','000F28','00-0F-28'),(100,0,'F','29','Mbare Hostels Clinic','000F29','00-0F-29'),(101,0,'F','30','Sunningdale Clinic','000F30','00-0F-30'),(102,0,'F','31','Waterfalls Clinic','000F31','00-0F-31'),(103,0,'F','32','Hopley Clinic','000F32','00-0F-32'),(104,0,'F','33','Private Institutions','000F33','00-0F-33'),(105,1,'1','02','Betera R.H.C.','010102','01-01-02'),(106,1,'1','03','Madzimbashuro R.H.C.','010103','01-01-03'),(107,1,'1','04','Mombeyarara R.H.C.','010104','01-01-04'),(108,1,'1','05','Murwira R.H.C.','010105','01-01-05'),(109,1,'1','06','Zangama R.H.C.','010106','01-01-06'),(110,1,'1','0A','Buhera Hospital','01010A','01-01-0A'),(111,1,'1','0B','Birchenough Bridge H','01010B','01-01-0B'),(112,1,'1','0C','Murambinda Hospital','01010C','01-01-0C'),(113,1,'1','0D','Nyashanu Hospital','01010D','01-01-0D'),(114,1,'1','0E','Viriri Hospital','01010E','01-01-0E'),(115,1,'1','16','Mudawose','010116','01-01-16'),(116,1,'1','17','Chimbudzi','010117','01-01-17'),(117,1,'1','18','Garamwera','010118','01-01-18'),(118,1,'1','19','Munyanyi','010119','01-01-19'),(119,1,'1','24','Mudanda','010124','01-01-24'),(120,1,'1','25','Bangure Clinic','010125','01-01-25'),(121,1,'1','26','Chabata Clinic','010126','01-01-26'),(122,1,'1','27','Chapanduka Clinic','010127','01-01-27'),(123,1,'1','28','Chapwanya Clinic','010128','01-01-28'),(124,1,'1','29','Chirozva Clinic','010129','01-01-29'),(125,1,'1','30','Chiwenga Clinic','010130','01-01-30'),(126,1,'1','31','Chiwese Clinic','010131','01-01-31'),(127,1,'1','32','Gunura Clinic','010132','01-01-32'),(128,1,'1','33','Gombe Clinic','010133','01-01-33'),(129,1,'1','34','Mutepfe Clinic','010134','01-01-34'),(130,1,'1','35','Mutiusinazita Clinic','010135','01-01-35'),(131,1,'1','36','Muzokomba Clinic','010136','01-01-36'),(132,1,'1','37','Nerutanga Clinic','010137','01-01-37'),(133,1,'1','38','Rambanembasi Clinic','010138','01-01-38'),(134,1,'1','39','Mumanyi R.H.C.','010139','01-01-39'),(135,1,'1','75','Dorowa Clinic','010175','01-01-75'),(136,1,'2','01','Bumba R.H.C.','010201','01-02-01'),(137,1,'2','02','Changazi R.H.C.','010202','01-02-02'),(138,1,'2','03','Chayamiti R.H.C.','010203','01-02-03'),(139,1,'2','04','Chikukwa R.H.C.','010204','01-02-04'),(140,1,'2','05','Nyahode Clinic','010205','01-02-05'),(141,1,'2','08','Muchadziya R.H.C.','010208','01-02-08'),(142,1,'2','0A','Biriviri Hospital','01020A','01-02-0A'),(143,1,'2','0B','Nyanyadzi Hospital','01020B','01-02-0B'),(144,1,'2','0C','Mutambara Hospital','01020C','01-02-0C'),(145,1,'2','0D','Rusitu Hospital','01020D','01-02-0D'),(146,1,'2','0E','Chimanimani Hospital','01020E','01-02-0E'),(147,1,'2','25','Cashel Clinic','010225','01-02-25'),(148,1,'2','26','Chakohwa Clinic','010226','01-02-26'),(149,1,'2','27','Chikwakwa Clinic','010227','01-02-27'),(150,1,'2','29','Gudyanga Clinic','010229','01-02-29'),(151,1,'2','30','Mutsvangwa Clinic','010230','01-02-30'),(152,1,'2','31','Ngorima Clinic','010231','01-02-31'),(153,1,'2','32','Shinja Clinic','010232','01-02-32'),(154,1,'2','51','Arda Rusitu Clinic','010251','01-02-51'),(155,1,'2','52','Martin Forest','010252','01-02-52'),(156,1,'2','61','Charter Clinic','010261','01-02-61'),(157,1,'2','62','Chisengu Clinic','010262','01-02-62'),(158,1,'2','63','Gwendingwe Clinic','010263','01-02-63'),(159,1,'2','64','Roscommon Clinic','010264','01-02-64'),(160,1,'2','65','Tarka Clinic','010265','01-02-65'),(161,1,'2','66','Tilbury Clinic','010266','01-02-66'),(162,1,'3','03','Chinyamukwakwa R.H.C','010303','01-03-03'),(163,1,'3','06','Kopera R.H.C.','010306','01-03-06'),(164,1,'3','07','Mabee R.H.C.','010307','01-03-07'),(165,1,'3','09','Mahenye R.H.C.','010309','01-03-09'),(166,1,'3','0A','Chipinge Hospital','01030A','01-03-0A'),(167,1,'3','0B','Chikore Hospital','01030B','01-03-0B'),(168,1,'3','0C','Mt.Selinda Hospital','01030C','01-03-0C'),(169,1,'3','0D','St Peters','01030D','01-03-0D'),(170,1,'3','11','Musiriswe R.H.C.','010311','01-03-11'),(171,1,'3','12','Paidamoyo R.H.C.','010312','01-03-12'),(172,1,'3','14','Tanganda R.H.C.','010314','01-03-14'),(173,1,'3','15','Tongogara R.H.C.','010315','01-03-15'),(174,1,'3','16','Tuzuka R.H.C.','010316','01-03-16'),(175,1,'3','17','Z.R.P','010317','01-03-17'),(176,1,'3','18','Chipinge Prisons Clinic','010318','01-03-18'),(177,1,'3','25','Chibuwe Clinic','010325','01-03-25'),(178,1,'3','26','Gumira Clinic','010326','01-03-26'),(179,1,'3','27','Hwakwata Clinic','010327','01-03-27'),(180,1,'3','28','Kondo Clinic','010328','01-03-28'),(181,1,'3','29','Madhuko Clinic','010329','01-03-29'),(182,1,'3','30','Manzvire Clinic','010330','01-03-30'),(183,1,'3','31','Musani Clinic','010331','01-03-31'),(184,1,'3','32','Mutandahwe Clinic','010332','01-03-32'),(185,1,'3','33','Mutema Clinic','010333','01-03-33'),(186,1,'3','34','Ngaone Clinic','010334','01-03-34'),(187,1,'3','35','Rimbi Clinic','010335','01-03-35'),(188,1,'3','36','Veneka Clinic','010336','01-03-36'),(189,1,'3','37','Zamuchia Clinic','010337','01-03-37'),(190,1,'3','38','Chichichi R.H.C.','010338','01-03-38'),(191,1,'3','39','Chisuma R.H.C.','010339','01-03-39'),(192,1,'3','40','Maparadza Clinic','010340','01-03-40'),(193,1,'3','45','Chipangayi Clinic','010345','01-03-45'),(194,1,'3','46','Chiriga Clinic','010346','01-03-46'),(195,1,'3','47','Gaza Clinic','010347','01-03-47'),(196,1,'3','48','Junction Gate Clinic','010348','01-03-48'),(197,1,'3','49','Chipinge Town Clinic','010349','01-03-49'),(198,1,'3','50','Tamandayi Clinic','010350','01-03-50'),(199,1,'3','61','Arda Chisumbanje Clinic','010361','01-03-61'),(200,1,'3','62','Clearwater Clinic','010362','01-03-62'),(201,1,'3','64','Jersey Clinic','010364','01-03-64'),(202,1,'3','65','Midsave Clinic','010365','01-03-65'),(203,1,'3','66','New Year\'s Gift Cli.','010366','01-03-66'),(204,1,'3','67','Silver Stream Clinic','010367','01-03-67'),(205,1,'3','68','Smalldeel Clinic','010368','01-03-68'),(206,1,'3','69','Southdown Clinic','010369','01-03-69'),(207,1,'3','70','Takwirira Clinic','010370','01-03-70'),(208,1,'3','71','Ratelshoek Clinic','010371','01-03-71'),(209,1,'3','72','Zona Clinic','010372','01-03-72'),(210,1,'3','90','Gwenzi Clinic','010390','01-03-90'),(211,1,'4','01','Bamba R.H.C.','010401','01-04-01'),(212,1,'4','02','Chikobvore R.H.C.','010402','01-04-02'),(213,1,'4','03','Chinhenga R.H.C.','010403','01-04-03'),(214,1,'4','04','Chinyika I R.H.C.','010404','01-04-04'),(215,1,'4','05','Chinyika Ii R.H.C.','010405','01-04-05'),(216,1,'4','06','Chinyudze R.H.C.','010406','01-04-06'),(217,1,'4','07','Groobi Spring R.H.C.','010407','01-04-07'),(218,1,'4','09','Gowakowa R.H.C.','010409','01-04-09'),(219,1,'4','0A','Rusape Hospital','01040A','01-04-0A'),(220,1,'4','0B','Weya Hospital','01040B','01-04-0B'),(221,1,'4','0C','Makoni Hospital','01040C','01-04-0C'),(222,1,'4','0D','Nedewedzo Hospital','01040D','01-04-0D'),(223,1,'4','0E','St.Micheal\'s Tanda H','01040E','01-04-0E'),(224,1,'4','0F','St.Therese\'s Hospita','01040F','01-04-0F'),(225,1,'4','10','Katsenga R.H.C.','010410','01-04-10'),(226,1,'4','11','Maparura R.H.C','010411','01-04-11'),(227,1,'4','12','Masvosva R.H.C.','010412','01-04-12'),(228,1,'4','13','Matotwe R.H.C.','010413','01-04-13'),(229,1,'4','14','Mayo I R.H.C.','010414','01-04-14'),(230,1,'4','15','Mayo Ii R.H.C.','010415','01-04-15'),(231,1,'4','18','Nyahowe R.H.C.','010418','01-04-18'),(232,1,'4','19','Nyahukwe R.H.C','010419','01-04-19'),(233,1,'4','20','Nyamukamani R.H.C.','010420','01-04-20'),(234,1,'4','25','Chiduku Clinic','010425','01-04-25'),(235,1,'4','26','Chikore Clinic','010426','01-04-26'),(236,1,'4','27','Nyazura Clinic','010427','01-04-27'),(237,1,'4','28','Dowa Clinic','010428','01-04-28'),(238,1,'4','29','Dumbabwe Clinic','010429','01-04-29'),(239,1,'4','30','Matsika Clinic','010430','01-04-30'),(240,1,'4','31','Nyamidzi Clinic','010431','01-04-31'),(241,1,'4','32','Mukamba Clinic','010432','01-04-32'),(242,1,'4','33','Rukweza Clinic','010433','01-04-33'),(243,1,'4','34','Tandi Clinic','010434','01-04-34'),(244,1,'4','35','Toriro Clinic','010435','01-04-35'),(245,1,'4','36','Tsanzaguru Clinic','010436','01-04-36'),(246,1,'4','37','Era Mine Clinic','010437','01-04-37'),(247,1,'4','38','Maurice Nyagumbo','010438','01-04-38'),(248,1,'4','39','Mufusire','010439','01-04-39'),(249,1,'4','40','Headlands Clinic','010440','01-04-40'),(250,1,'4','41','Mubvurungwa Clinic','010441','01-04-41'),(251,1,'4','42','Vengere Clinic','010442','01-04-42'),(252,1,'4','43','Ringanayi','010443','01-04-43'),(253,1,'4','44','Mavhudzi Clinic','010444','01-04-44'),(254,1,'4','45','Chinyadza Clinic','010445','01-04-45'),(255,1,'4','46','Nyamusosa Clinic','010446','01-04-46'),(256,1,'4','47','Sangano','010447','01-04-47'),(257,1,'4','49','Vengere Clinic','010449','01-04-49'),(258,1,'4','74','Rusape Prison','010474','01-04-74'),(259,1,'4','75','ZRP Rusape','010475','01-04-75'),(260,1,'4','76','Inyathi Mine','010476','01-04-76'),(261,1,'4','81','Mukuwapasi Rehab','010481','01-04-81'),(262,1,'4','82','Mukuwapasi Clinic','010482','01-04-82'),(263,1,'4','91','Nyazura Mission Clinic','010491','01-04-91'),(264,1,'4','92','Arnoldine Mission Cl','010492','01-04-92'),(265,1,'5','01','Bwizi R.H.C.','010501','01-05-01'),(266,1,'5','02','Chiadzwa R.H.C.','010502','01-05-02'),(267,1,'5','03','Mavhiza','010503','01-05-03'),(268,1,'5','04','Gutaurare R.H.C.','010504','01-05-04'),(269,1,'5','05','Gwindingwi R.H.C.','010505','01-05-05'),(270,1,'5','06','Muromo R.H.C.','010506','01-05-06'),(271,1,'5','07','Murowa R.H.C.','010507','01-05-07'),(272,1,'5','09','Mt Zuma','010509','01-05-09'),(273,1,'5','0A','Mutare Provincial Hospital','01050A','01-05-0A'),(274,1,'5','0B','Mutare Infectious Hospital','01050B','01-05-0B'),(275,1,'5','0C','Sakubva Hospital','01050C','01-05-0C'),(276,1,'5','0D','Sakubva Infectious Hospital','01050D','01-05-0D'),(277,1,'5','0E','Marange Hospital','01050E','01-05-0E'),(278,1,'5','0F','St.Andrew\'s Hospital','01050F','01-05-0F'),(279,1,'5','0G','St.Joseph\'s Hospital','01050G','01-05-0G'),(280,1,'5','11','Nyagundi R.H.C.','010511','01-05-11'),(281,1,'5','12','Nyamazura R.H.C.','010512','01-05-12'),(282,1,'5','13','Zvipiripiri R.H.C.','010513','01-05-13'),(283,1,'5','15','Vumba','010515','01-05-15'),(284,1,'5','16','Z.R.P','010516','01-05-16'),(285,1,'5','18','Chitora','010518','01-05-18'),(286,1,'5','20','Matanda','010520','01-05-20'),(287,1,'5','21','Leekuyl Takunda','010521','01-05-21'),(288,1,'5','23','Army Dependent','010523','01-05-23'),(289,1,'5','24','Arda Odzi','010524','01-05-24'),(290,1,'5','25','Bakorenhema Clinic','010525','01-05-25'),(291,1,'5','26','Bezely Bridge Clinic','010526','01-05-26'),(292,1,'5','27','Chipfatsura Clinic','010527','01-05-27'),(293,1,'5','29','Chitakatira Clinic','010529','01-05-29'),(294,1,'5','30','Mambwere Clinic','010530','01-05-30'),(295,1,'5','31','Masasi Clinic','010531','01-05-31'),(296,1,'5','32','Mutare Prison Farm Clinic','010532','01-05-32'),(297,1,'5','33','Mkwada Clinic','010533','01-05-33'),(298,1,'5','34','Chitaka Clinic','010534','01-05-34'),(299,1,'5','35','Mushunje Clinic','010535','01-05-35'),(300,1,'5','36','Nzvenga Clinic','010536','01-05-36'),(301,1,'5','37','Rowa Clinic','010537','01-05-37'),(302,1,'5','38','Odzi Clinic','010538','01-05-38'),(303,1,'5','39','Zimunya Clinic','010539','01-05-39'),(304,1,'5','40','Zumbare Clinic','010540','01-05-40'),(305,1,'5','41','Dora','010541','01-05-41'),(306,1,'5','43','Chishingwi','010543','01-05-43'),(307,1,'5','44','Chipendereke','010544','01-05-44'),(308,1,'5','45','Burma Valley Clinic','010545','01-05-45'),(309,1,'5','61','City Health Clinic','010561','01-05-61'),(310,1,'5','62','Chikanga Clinic','010562','01-05-62'),(311,1,'5','63','Dangamvura Clinic','010563','01-05-63'),(312,1,'5','64','Sakubva Health Centre','010564','01-05-64'),(313,1,'5','65','Florida Clinic','010565','01-05-65'),(314,1,'5','66','Fern Valley Clinic','010566','01-05-66'),(315,1,'5','84','Mapofu Clinic','010584','01-05-84'),(316,1,'5','91','Chikwariro Clinic','010591','01-05-91'),(317,1,'6','01','Chavhanga R.H.C.','010601','01-06-01'),(318,1,'6','02','Rupinda R.H.C.','010602','01-06-02'),(319,1,'6','03','Sherukuru R.H.C.','010603','01-06-03'),(320,1,'6','04','Tsonzo R.H.C.','010604','01-06-04'),(321,1,'6','0A','Tsonzo Hospital','01060A','01-06-0A'),(322,1,'6','0B','Bonda Hospital','01060B','01-06-0B'),(323,1,'6','0C','Old Mutare Hospital','01060C','01-06-0C'),(324,1,'6','0D','St.Barbara Hospital','01060D','01-06-0D'),(325,1,'6','0E','Triashill Hospital','01060E','01-06-0E'),(326,1,'6','0F','Hauna District Hospital','01060F','01-06-0F'),(327,1,'6','25','Chitombo Clinic','010625','01-06-25'),(328,1,'6','26','Guta Clinic','010626','01-06-26'),(329,1,'6','27','Hauna Clinic','010627','01-06-27'),(330,1,'6','28','Mandeya Clinic','010628','01-06-28'),(331,1,'6','29','Mpotedzi Clinic','010629','01-06-29'),(332,1,'6','30','Mt.Jenya Clinic','010630','01-06-30'),(333,1,'6','31','Mutasa Clinic','010631','01-06-31'),(334,1,'6','32','Mwoyoweshumba Clinic','010632','01-06-32'),(335,1,'6','33','Ngarura Clinic','010633','01-06-33'),(336,1,'6','34','Ruda Clinic','010634','01-06-34'),(337,1,'6','35','Rumbizi Clinic','010635','01-06-35'),(338,1,'6','36','Sachisuko Clinic','010636','01-06-36'),(339,1,'6','37','Sadziwa Clinic','010637','01-06-37'),(340,1,'6','38','Sagambe Clinic','010638','01-06-38'),(341,1,'6','39','Sahumani Clinic','010639','01-06-39'),(342,1,'6','40','Sakupwanya Clinic','010640','01-06-40'),(343,1,'6','41','Samanga Clinic','010641','01-06-41'),(344,1,'6','42','Samaringa Clinic','010642','01-06-42'),(345,1,'6','43','Zongoro Clinic','010643','01-06-43'),(346,1,'6','61','Aberfoyle Tea Estate','010661','01-06-61'),(347,1,'6','62','Chingamwe Clinic','010662','01-06-62'),(348,1,'6','63','Eastern Highlands 1','010663','01-06-63'),(349,1,'6','64','Eastern Highlands 5','010664','01-06-64'),(350,1,'6','65','Haparari','010665','01-06-65'),(351,1,'6','66','Forestry Clinic','010666','01-06-66'),(352,1,'6','67','Katiyo Tea Estate','010667','01-06-67'),(353,1,'6','68','Selbourne Clinic','010668','01-06-68'),(354,1,'6','69','Drenane Clinic','010669','01-06-69'),(355,1,'6','70','Imbeza Clinic','010670','01-06-70'),(356,1,'6','71','Redwing Clinic','010671','01-06-71'),(357,1,'6','72','Sheba Clinic','010672','01-06-72'),(358,1,'6','73','Stapleford Clinic','010673','01-06-73'),(359,1,'6','74','Eastern Highlands Pl Clinic','010674','01-06-74'),(360,1,'6','91','Gatsi Clinic','010691','01-06-91'),(361,1,'6','92','Honde Mission Clinic','010692','01-06-92'),(362,1,'6','93','St.Augustines','010693','01-06-93'),(363,1,'6','94','St.Peter\'s Mandeya','010694','01-06-94'),(364,1,'6','96','Mapara','010696','01-06-96'),(365,1,'6','97','Jombe','010697','01-06-97'),(366,1,'6','98','Premier Central Clinic','010698','01-06-98'),(367,1,'7','02','Dombo R.H.C.','010702','01-07-02'),(368,1,'7','03','Fombe R.H.C.','010703','01-07-03'),(369,1,'7','04','Gairezi R.H.C.','010704','01-07-04'),(370,1,'7','05','Gotekote R.H.C.','010705','01-07-05'),(371,1,'7','06','Nyarumvurwe R.H.C.','010706','01-07-06'),(372,1,'7','07','Matize R.H.C.','010707','01-07-07'),(373,1,'7','09','Nyamombe Camp R.H.C.','010709','01-07-09'),(374,1,'7','0A','Nyanga District Hosp','01070A','01-07-0A'),(375,1,'7','0B','Avilla Hospital','01070B','01-07-0B'),(376,1,'7','0C','Elim Hospital','01070C','01-07-0C'),(377,1,'7','0D','Mt.Mellery Hospital','01070D','01-07-0D'),(378,1,'7','0E','Regina Coeli Hospita','01070E','01-07-0E'),(379,1,'7','10','Nyautare R.H.C.','010710','01-07-10'),(380,1,'7','11','Ruchera R.H.C.','010711','01-07-11'),(381,1,'7','25','Chatindo Clinic','010725','01-07-25'),(382,1,'7','26','Chiwarira Clinic','010726','01-07-26'),(383,1,'7','27','Nyamaropa Clinic','010727','01-07-27'),(384,1,'7','29','Kambudzi Clinic','010729','01-07-29'),(385,1,'7','30','Nyatate Clinic','010730','01-07-30'),(386,1,'7','31','Sabvure Clinic','010731','01-07-31'),(387,1,'7','32','Tombo Clinic','010732','01-07-32'),(388,1,'7','45','Mobile Clinic','010745','01-07-45'),(389,1,'7','61','Nyangau Clinic','010761','01-07-61'),(390,1,'7','62','Nyafaru Clinic','010762','01-07-62'),(391,1,'7','63','Erim Forest Estate','010763','01-07-63'),(392,1,'7','91','Nyangombe Clinic','010791','01-07-91'),(393,1,'7','92','Claremont Estate Clinic','010792','01-07-92'),(394,1,'7','94','Nyadowa Clinic','010794','01-07-94'),(395,2,'1','01','Chiveso R.H.C.','020101','02-01-01'),(396,2,'1','02','Muonwe R.H.C.','020102','02-01-02'),(397,2,'1','03','Prison Clinic','020103','02-01-03'),(398,2,'1','04','Bindura Polyclinic','020104','02-01-04'),(399,2,'1','05','Z.R.P. Clinic','020105','02-01-05'),(400,2,'1','0A','Bindura Provincial','02010A','02-01-0A'),(401,2,'1','25','Musana Clinic','020125','02-01-25'),(402,2,'1','26','Nyava Clinic','020126','02-01-26'),(403,2,'1','45','Chiriseri Clinic','020145','02-01-45'),(404,2,'1','46','Manhenga Clinic','020146','02-01-46'),(405,2,'1','61','Rusununguko Clinic','020161','02-01-61'),(406,2,'1','62','Chipadze Clinic','020162','02-01-62'),(407,2,'1','63','Chiwaridzo Clinic','020163','02-01-63'),(408,2,'1','75','Freda Rebecca','020175','02-01-75'),(409,2,'1','76','Trojan Nickel Clinic','020176','02-01-76'),(410,2,'1','77','Farm Health Scheme','020177','02-01-77'),(411,2,'1','78','Foothills','020178','02-01-78'),(412,2,'1','79','Busce Clinic','020179','02-01-79'),(413,2,'1','80','Mupandira R H C','020180','02-01-80'),(414,2,'1','81','ZNFPC Clinic','020181','02-01-81'),(415,2,'1','82','Rutope Clinic','020182','02-01-82'),(416,2,'1','83','Manga R H C','020183','02-01-83'),(417,2,'2','01','Chawarura R.H.C.','020201','02-02-01'),(418,2,'2','02','Hoya R.H.C.','020202','02-02-02'),(419,2,'2','03','Machaya R.H.C.','020203','02-02-03'),(420,2,'2','04','Muzarabani R.H.C.','020204','02-02-04'),(421,2,'2','07','Chidikamwedzi Clinic','020207','02-02-07'),(422,2,'2','08','Chinyani Clinic','020208','02-02-08'),(423,2,'2','0A','St.Albert\'s','02020A','02-02-0A'),(424,2,'2','25','Hwata Clinic','020225','02-02-25'),(425,2,'2','26','Dambakurima Clinic','020226','02-02-26'),(426,2,'2','45','David Nelson Clinic','020245','02-02-45'),(427,2,'2','81','Farm Health Scheme','020281','02-02-81'),(428,2,'2','85','Chadereka R.H.C','020285','02-02-85'),(429,2,'3','01','Bvochora R.H.C.','020301','02-03-01'),(430,2,'3','02','Masoka R.H.C','020302','02-03-02'),(431,2,'3','03','Mashumbi Pools R.H.C','020303','02-03-03'),(432,2,'3','04','Masomo R.H.C','020304','02-03-04'),(433,2,'3','05','Negomo R.H.C.','020305','02-03-05'),(434,2,'3','06','Nyamhondoro R.H.C.','020306','02-03-06'),(435,2,'3','07','Shinje R.H.C.','020307','02-03-07'),(436,2,'3','0A','Mvirwi','02030A','02-03-0A'),(437,2,'3','0B','Guruve','02030B','02-03-0B'),(438,2,'3','0C','Chitsungo','02030C','02-03-0C'),(439,2,'3','25','Angwa R.H.C.','020325','02-03-25'),(440,2,'3','26','Bakasa R.H.C.','020326','02-03-26'),(441,2,'3','27','Bepura R.H.C','020327','02-03-27'),(442,2,'3','28','Chapoto R.H.C.','020328','02-03-28'),(443,2,'3','29','Chipuriro R.H.C.','020329','02-03-29'),(444,2,'3','30','Gonono R.H.C.','020330','02-03-30'),(445,2,'3','31','Kachuta R.H.C.','020331','02-03-31'),(446,2,'3','32','Mahuwe R.H.C.','020332','02-03-32'),(447,2,'3','33','Matsvitsi R.H.C.','020333','02-03-33'),(448,2,'3','34','Gota R.H.C','020334','02-03-34'),(449,2,'3','35','Musengezi R.H.C','020335','02-03-35'),(450,2,'3','36','ZRP','020336','02-03-36'),(451,2,'3','37','FHS','020337','02-03-37'),(452,2,'3','38','Chikafa R.H.C','020338','02-03-38'),(453,2,'3','39','Nyakapupu R.H.C','020339','02-03-39'),(454,2,'3','40','Chirunya R.H.C','020340','02-03-40'),(455,2,'3','41','Chidodo R.H.C','020341','02-03-41'),(456,2,'3','42','Nyambudzi R.H.C','020342','02-03-42'),(457,2,'3','43','Ruyamuro R.H.C','020343','02-03-43'),(458,2,'4','01','Chinehasha R.H.C.','020401','02-04-01'),(459,2,'4','02','Nyakudya R.H.C.','020402','02-04-02'),(460,2,'4','03','Shutu R.H.C.','020403','02-04-03'),(461,2,'4','04','Hatcliffe Extension Clinic','020404','02-04-04'),(462,2,'4','05','Montgomery Clinic','020405','02-04-05'),(463,2,'4','06','Donje Clinic','020406','02-04-06'),(464,2,'4','07','Cranham Extension Clinic','020407','02-04-07'),(465,2,'4','08','Adura Clinic','020408','02-04-08'),(466,2,'4','09','Danbery Park Clinic','020409','02-04-09'),(467,2,'4','0A','Concession','02040A','02-04-0A'),(468,2,'4','0B','Rosa','02040B','02-04-0B'),(469,2,'4','0C','Howard','02040C','02-04-0C'),(470,2,'4','0D','Mazowe Citrus','02040D','02-04-0D'),(471,2,'4','0E','Mvurwi Hospital','02040E','02-04-0E'),(472,2,'4','10','Davaar Clinic','020410','02-04-10'),(473,2,'4','11','Von Abo Clinic','020411','02-04-11'),(474,2,'4','25','Bare Clinic','020425','02-04-25'),(475,2,'4','26','Gunguwe Clinic','020426','02-04-26'),(476,2,'4','27','Jingamvura Clinic','020427','02-04-27'),(477,2,'4','28','Makope Clinic','020428','02-04-28'),(478,2,'4','29','Mukodzongi Clinic','020429','02-04-29'),(479,2,'4','30','Christon Bank Clinic','020430','02-04-30'),(480,2,'4','31','Mvurwi Fhc','020431','02-04-31'),(481,2,'4','32','Nzvimbo Clinic','020432','02-04-32'),(482,2,'4','45','Belgownie Clinic','020445','02-04-45'),(483,2,'4','46','Home Eden Clinic','020446','02-04-46'),(484,2,'4','47','Tsungubvi Clinic','020447','02-04-47'),(485,2,'4','75','Henderson Clinic','020475','02-04-75'),(486,2,'4','76','Iron Duke Clinic','020476','02-04-76'),(487,2,'4','77','Mazowe Mine Clinic','020477','02-04-77'),(488,2,'4','78','Stories Clinic','020478','02-04-78'),(489,2,'4','81','Hatcliffe','020481','02-04-81'),(490,2,'4','82','Nemc','020482','02-04-82'),(491,2,'4','83','Montgomery C.C','020483','02-04-83'),(492,2,'4','84','Dambo Clinic','020484','02-04-84'),(493,2,'4','85','Forrester Clinic','020485','02-04-85'),(494,2,'4','86','Mazowe Secondary Clinic','020486','02-04-86'),(495,2,'5','01','Dotito R.H.C.','020501','02-05-01'),(496,2,'5','02','Kamutsenzere R.H.C.','020502','02-05-02'),(497,2,'5','03','Mukumbura R.H.C.','020503','02-05-03'),(498,2,'5','04','Nyamahobogo R.H.C.','020504','02-05-04'),(499,2,'5','05','Pfunyangowu R.H.C.','020505','02-05-05'),(500,2,'5','06','Tsakare R.H.C.','020506','02-05-06'),(501,2,'5','07','Mutungagore Clinic','020507','02-05-07'),(502,2,'5','08','Mutasa Clinic','020508','02-05-08'),(503,2,'5','09','Chiburi Clinic','020509','02-05-09'),(504,2,'5','0A','Mt.Darwin','02050A','02-05-0A'),(505,2,'5','0B','Karanda Hospital','02050B','02-05-0B'),(506,2,'5','10','Amanda Clinic','020510','02-05-10'),(507,2,'5','25','Chahwanda R.H.C.','020525','02-05-25'),(508,2,'5','26','Kaitano R.H.C.','020526','02-05-26'),(509,2,'5','27','Nembire R.H.C.','020527','02-05-27'),(510,2,'5','28','Pachanza Clinic','020528','02-05-28'),(511,2,'5','29','Bveke Clinic','020529','02-05-29'),(512,2,'5','30','ZRP Clinic','020530','02-05-30'),(513,2,'5','31','ZPS Clinic','020531','02-05-31'),(514,2,'5','32','Matope Clinic','020532','02-05-32'),(515,2,'5','33','Bandimba R.H.C.','020533','02-05-33'),(516,2,'6','01','Mukosa R.H.C.','020601','02-06-01'),(517,2,'6','02','Mukonde R.H.C.','020602','02-06-02'),(518,2,'6','03','Nhawa R.H.C.','020603','02-06-03'),(519,2,'6','04','Rushinga R.H.C.','020604','02-06-04'),(520,2,'6','05','Mazowe Camp','020605','02-06-05'),(521,2,'6','06','Nyamatikiti Camp','020606','02-06-06'),(522,2,'6','07','Chimandau R.H.C.','020607','02-06-07'),(523,2,'6','0A','Chimhanda Hospital','02060A','02-06-0A'),(524,2,'6','0B','Mary Mount','02060B','02-06-0B'),(525,2,'6','25','Bungwe Clinic','020625','02-06-25'),(526,2,'6','26','Rusambo Clinic','020626','02-06-26'),(527,2,'6','27','Chimhanda Clinic','020627','02-06-27'),(528,2,'7','01','Nyamaruro R.H.C.','020701','02-07-01'),(529,2,'7','02','Chinduduma Primary','020702','02-07-02'),(530,2,'7','03','Chishapa Clinic','020703','02-07-03'),(531,2,'7','04','Goora R.H.C.','020704','02-07-04'),(532,2,'7','05','Mupfurudzi R.H.C.','020705','02-07-05'),(533,2,'7','0A','Shamva District Hosp','02070A','02-07-0A'),(534,2,'7','0B','Madziwa Rural Hospital','02070B','02-07-0B'),(535,2,'7','12','Wadzanai Clinic','020712','02-07-12'),(536,2,'7','25','Bushu Clinic','020725','02-07-25'),(537,2,'7','26','Chidembo Clinic','020726','02-07-26'),(538,2,'7','27','Chihuri Clinic','020727','02-07-27'),(539,2,'7','45','Mobile Clinic','020745','02-07-45'),(540,2,'7','75','Madziwa Mine Clinic','020775','02-07-75'),(541,2,'7','76','Shamwa Gold Mine','020776','02-07-76'),(542,2,'8','01','Masoka R.H.C.','020801','02-08-01'),(543,2,'8','02','Masomo R.H.C.','020802','02-08-02'),(544,2,'8','03','Mushumbi R.H.C.','020803','02-08-03'),(545,2,'8','0B','Chitsungo Mission Hospital','02080B','02-08-0B'),(546,2,'8','20','Chapoto R.H.C.','020820','02-08-20'),(547,2,'8','21','Angwa R.H.C.','020821','02-08-21'),(548,2,'8','30','Chikafa R.H.C.','020830','02-08-30'),(549,2,'8','31','Gonono R.H.C.','020831','02-08-31'),(550,2,'8','32','Musengezi R.H.C.','020832','02-08-32'),(551,2,'8','33','Mahuwe R.H.C.','020833','02-08-33'),(552,2,'8','34','Chirunya R.H.C.','020834','02-08-34'),(553,2,'8','35','Nyambudzi R.H.C.','020835','02-08-35'),(554,2,'8','41','Chidodo R.H.C.','020841','02-08-41'),(555,3,'1','01','Mufudziwakanaka R.H.C..','030101','03-01-01'),(556,3,'1','02','Murezi R.H.C.','030102','03-01-02'),(557,3,'1','03','Nyamhere R.H.C.','030103','03-01-03'),(558,3,'1','04','Zvamatobwe R.H.C.','030104','03-01-04'),(559,3,'1','05','Range R.H.C.','030105','03-01-05'),(560,3,'1','0A','Chivu Hospital','03010A','03-01-0A'),(561,3,'1','0B','Nharira Hospital','03010B','03-01-0B'),(562,3,'1','0C','Range Hospital','03010C','03-01-0C'),(563,3,'1','0D','Sadza Hospital','03010D','03-01-0D'),(564,3,'1','0E','Gandachibvuva Hospital','03010E','03-01-0E'),(565,3,'1','25','Bvumbura Clinic','030125','03-01-25'),(566,3,'1','26','Gokomere Clinic','030126','03-01-26'),(567,3,'1','27','Madamombe Clinic','030127','03-01-27'),(568,3,'1','28','Manyene Clinic','030128','03-01-28'),(569,3,'1','29','Masasa Clinic','030129','03-01-29'),(570,3,'1','30','Mbiru Clinic','030130','03-01-30'),(571,3,'1','31','Mushore Clinic','030131','03-01-31'),(572,3,'1','32','Nhangembwe Clinic','030132','03-01-32'),(573,3,'1','33','Pokoteke Clinic','030133','03-01-33'),(574,3,'1','34','Rutanhira Clinic','030134','03-01-34'),(575,3,'1','35','Shumba Clinic','030135','03-01-35'),(576,3,'1','36','Unyetu Clinic','030136','03-01-36'),(577,3,'1','37','Wazvaramhaka Clinic','030137','03-01-37'),(578,3,'1','45','Chivu Clinic','030145','03-01-45'),(579,3,'1','46','Gandami Clinic','030146','03-01-46'),(580,3,'1','47','Lancshire Clinic','030147','03-01-47'),(581,3,'1','48','Mutoro Clinic','030148','03-01-48'),(582,3,'1','49','Wiltshire Clinic','030149','03-01-49'),(583,3,'1','91','Daramombe Clinic','030191','03-01-91'),(584,3,'1','92','Mwerahari Clinic','030192','03-01-92'),(585,3,'2','01','Bosha R.H.C.','030201','03-02-01'),(586,3,'2','02','Domboshava R.H.C.','030202','03-02-02'),(587,3,'2','03','Mwanza R.H.C.','030203','03-02-03'),(588,3,'2','04','Rusununguko Clinic','030204','03-02-04'),(589,3,'2','0A','Makumbe District Hospital','03020A','03-02-0A'),(590,3,'2','0C','Ruwa Hospital','03020C','03-02-0C'),(591,3,'2','0D','Chikwaka Hospital','03020D','03-02-0D'),(592,3,'2','25','Chinamhora Clinic','030225','03-02-25'),(593,3,'2','26','Chinyika Clinic','030226','03-02-26'),(594,3,'2','27','Kowowo Clinic','030227','03-02-27'),(595,3,'2','28','Masukandoro Clinic','030228','03-02-28'),(596,3,'2','29','Nyawure Clinic','030229','03-02-29'),(597,3,'2','30','Pote Clinic','030230','03-02-30'),(598,3,'2','45','Bromley Clinic','030245','03-02-45'),(599,3,'2','46','Cranborne Clinic','030246','03-02-46'),(600,3,'2','47','Henry John Rheimer Clinic','030247','03-02-47'),(601,3,'2','48','Kubatsirana Clinic','030248','03-02-48'),(602,3,'2','49','Rusike Clinic','030249','03-02-49'),(603,3,'2','50','Ruwa Clinic','030250','03-02-50'),(604,3,'2','51','Joan Rankini Clinic','030251','03-02-51'),(605,3,'2','52','St Joseph Clinic','030252','03-02-52'),(606,3,'2','75','Acturus Clinic','030275','03-02-75'),(607,3,'3','01','Kafura R.H.C.','030301','03-03-01'),(608,3,'3','02','Karimbika R.H.C.','030302','03-03-02'),(609,3,'3','03','Sowa R.H.C.','030303','03-03-03'),(610,3,'3','04','Marembera R.H.C.','030304','03-03-04'),(611,3,'3','0A','Mutawatawa District Hospital','03030A','03-03-0A'),(612,3,'3','25','Borera Clinic','030325','03-03-25'),(613,3,'3','26','Chikuhwa Clinic','030326','03-03-26'),(614,3,'3','27','Chipfunde Clinic','030327','03-03-27'),(615,3,'3','28','Chitimbe Clinic','030328','03-03-28'),(616,3,'3','29','Chitsungo Clinic','030329','03-03-29'),(617,3,'3','30','Manyika Clinic','030330','03-03-30'),(618,3,'3','31','Maramba Clinic','030331','03-03-31'),(619,3,'3','32','Mashambanhaka Clinic','030332','03-03-32'),(620,3,'3','33','Nhakiwa Clinic','030333','03-03-33'),(621,3,'3','34','Nyakasoro Clinic','030334','03-03-34'),(622,3,'3','36','Nyanzou Clinic','030336','03-03-36'),(623,3,'3','37','Muskwe Clinic','030337','03-03-37'),(624,3,'3','91','Dindi Clinic','030391','03-03-91'),(625,3,'4','01','Garaba R.H.C.','030401','03-04-01'),(626,3,'4','02','Goneso R.H.C.','030402','03-04-02'),(627,3,'4','03','Goto R.H.C.','030403','03-04-03'),(628,3,'4','04','Makanda R.H.C.','030404','03-04-04'),(629,3,'4','05','Sengezi R.H.C.','030405','03-04-05'),(630,3,'4','0A','Hwedza Hospital','03040A','03-04-0A'),(631,3,'4','0B','Mt. St.Mary\'s','03040B','03-04-0B'),(632,3,'4','25','Chigondo R.H.C.','030425','03-04-25'),(633,3,'4','26','Masikana Clinic','030426','03-04-26'),(634,3,'4','27','Mukamba R.H.C.','030427','03-04-27'),(635,3,'4','45','Chikurumadziva Clinic','030445','03-04-45'),(636,3,'4','46','Makarara Clinic','030446','03-04-46'),(637,3,'4','47','Zviduri Clinic','030447','03-04-47'),(638,3,'5','01','Border Church R.H.C.','030501','03-05-01'),(639,3,'5','02','Chimbwanda R.H.C.','030502','03-05-02'),(640,3,'5','03','Dimbiti R.H.C.','030503','03-05-03'),(641,3,'5','04','Kushinga Pikelela','030504','03-05-04'),(642,3,'5','05','Mudzimurema R.H.C.','030505','03-05-05'),(643,3,'5','06','Winimbi R.H.C.','030506','03-05-06'),(644,3,'5','0A','Marondera Provincial Hospital','03050A','03-05-0A'),(645,3,'5','0B','Chiota Hospital','03050B','03-05-0B'),(646,3,'5','11','Prisons Marondera','030511','03-05-11'),(647,3,'5','12','Z.R.P. Clinic','030512','03-05-12'),(648,3,'5','25','Masikana Clinic','030525','03-05-25'),(649,3,'5','28','Marondera Rural Clinic','030528','03-05-28'),(650,3,'5','29','Chipararwe Clinic','030529','03-05-29'),(651,3,'5','45','Igava Clinic','030545','03-05-45'),(652,3,'5','46','Marondera Clinic','030546','03-05-46'),(653,3,'5','61','Dombotombo Clinic','030561','03-05-61'),(654,3,'5','62','Nyameni Clinic','030562','03-05-62'),(655,3,'5','63','Nyembanzvere Clinic','030563','03-05-63'),(656,3,'5','86','Waddilove','030586','03-05-86'),(657,3,'5','88','Rakodzi Clinic','030588','03-05-88'),(658,3,'6','01','Chimukoko R.H.C.','030601','03-06-01'),(659,3,'6','02','Chiunye R.H.C.','030602','03-06-02'),(660,3,'6','03','Gozi R.H.C.','030603','03-06-03'),(661,3,'6','04','Kondo R.H.C.','030604','03-06-04'),(662,3,'6','05','Makaha R.H.C.','030605','03-06-05'),(663,3,'6','06','Msarakufa R.H.C.','030606','03-06-06'),(664,3,'6','07','Nyamanyoka R.H.C.','030607','03-06-07'),(665,3,'6','0A','Kotwa Hospital','03060A','03-06-0A'),(666,3,'6','25','St Pius Clinic','030625','03-06-25'),(667,3,'6','26','Kapotese Clinic','030626','03-06-26'),(668,3,'6','27','Kotwa Clinic','030627','03-06-27'),(669,3,'6','28','Masenda Clinic','030628','03-06-28'),(670,3,'6','29','Nyamapanda Clinic','030629','03-06-29'),(671,3,'6','30','Nyamatawa Clinic','030630','03-06-30'),(672,3,'6','31','Nyamukoho Clinic','030631','03-06-31'),(673,3,'6','32','Shinga Clinic','030632','03-06-32'),(674,3,'6','33','Suswe Clinic','030633','03-06-33'),(675,3,'6','34','Chisvo Clinic','030634','03-06-34'),(676,3,'6','91','Chikwizo Clinic','030691','03-06-91'),(677,3,'6','92','Dendera Clinic','030692','03-06-92'),(678,3,'6','93','Nyahuku Clinic','030693','03-06-93'),(679,3,'7','01','Chitate R.H.C.','030701','03-07-01'),(680,3,'7','02','Chitowa R.H.C.','030702','03-07-02'),(681,3,'7','03','Jekwa R.H.C.','030703','03-07-03'),(682,3,'7','04','Kadenge R.H.C.','030704','03-07-04'),(683,3,'7','05','Madamombe R.H.C.','030705','03-07-05'),(684,3,'7','06','Munamba R.H.C.','030706','03-07-06'),(685,3,'7','07','Z.P.S Clinic','030707','03-07-07'),(686,3,'7','08','ZRP Mrewa  clinic','030708','03-07-08'),(687,3,'7','0A','Murewa Hospital','03070A','03-07-0A'),(688,3,'7','0B','St.Paul\'s Musami','03070B','03-07-0B'),(689,3,'7','0C','Nhowe Mission Hospital','03070C','03-07-0C'),(690,3,'7','22','Murewa Polyclinic','030722','03-07-22'),(691,3,'7','23','Chitowa 1 Clinic','030723','03-07-23'),(692,3,'7','24','Chitowa 2 Clinic','030724','03-07-24'),(693,3,'7','25','Dandara R.H.C.','030725','03-07-25'),(694,3,'7','26','Dombwe R.H.C.','030726','03-07-26'),(695,3,'7','27','Kadzere R.H.C.','030727','03-07-27'),(696,3,'7','28','Nyamutumbu R.H.C.','030728','03-07-28'),(697,3,'7','29','Shambamuto R.H.C.','030729','03-07-29'),(698,3,'7','30','Craiglea Clinic','030730','03-07-30'),(699,3,'7','31','Matututu Clinic','030731','03-07-31'),(700,3,'7','32','Ngwerume clinic','030732','03-07-32'),(701,3,'7','45','Macheke Clinic','030745','03-07-45'),(702,3,'7','46','Virginia Clinic','030746','03-07-46'),(703,3,'7','47','Waterloo Clinic','030747','03-07-47'),(704,3,'7','49','Kambarami clinic','030749','03-07-49'),(705,3,'7','50','Muchinjike clinic','030750','03-07-50'),(706,3,'7','71','Nohoreka Clinic','030771','03-07-71'),(707,3,'7','72','Goso clinic ','030772','03-07-72'),(708,3,'8','01','Hoyuyu I R.H.C','030801','03-08-01'),(709,3,'8','02','Hoyuyu Ii R.H.C.','030802','03-08-02'),(710,3,'8','03','Kapondoro R.H.C.','030803','03-08-03'),(711,3,'8','04','Katsukunya R.H.C.','030804','03-08-04'),(712,3,'8','05','Kawere R.H.C.','030805','03-08-05'),(713,3,'8','06','Mushimbo R.H.C.','030806','03-08-06'),(714,3,'8','07','Nyamuzizi R.H.C.','030807','03-08-07'),(715,3,'8','08','Nyadiri R.H.C.','030808','03-08-08'),(716,3,'8','09','Kushimga R.H.C.','030809','03-08-09'),(717,3,'8','0A','Mutoko Hospital','03080A','03-08-0A'),(718,3,'8','0B','Nyamuzuwe Hospital','03080B','03-08-0B'),(719,3,'8','0C','Makosa Hospital','03080C','03-08-0C'),(720,3,'8','0D','Nyadiri Mission Hospital','03080D','03-08-0D'),(721,3,'8','0E','Luisa Guidotti','03080E','03-08-0E'),(722,3,'8','10','Nzira R.H.C.','030810','03-08-10'),(723,3,'8','11','Mutoko Prison Clinic','030811','03-08-11'),(724,3,'8','20','Epi Mobile','030820','03-08-20'),(725,3,'8','21','ZNFPC Clinic','030821','03-08-21'),(726,3,'8','25','Charehwa Clinic','030825','03-08-25'),(727,3,'8','26','Matedza Clinic','030826','03-08-26'),(728,3,'8','27','Mother Of Peace Clinic','030827','03-08-27'),(729,3,'8','61','Mutemwa Leprosy Settl. Clinic','030861','03-08-61'),(730,3,'8','91','Chindenga Clinic','030891','03-08-91'),(731,3,'8','98','Kowo Clinic','030898','03-08-98'),(732,3,'8','99','Kawazva Clinic','030899','03-08-99'),(733,3,'9','01','Acton Reynolds R.H.C','030901','03-09-01'),(734,3,'9','02','Zhakata R.H.C.','030902','03-09-02'),(735,3,'9','03','ZRP Clinic','030903','03-09-03'),(736,3,'9','04','Ringa Clinic','030904','03-09-04'),(737,3,'9','05','Masasa R.H.C.','030905','03-09-05'),(738,3,'9','06','Epi Unit','030906','03-09-06'),(739,3,'9','07','Cbd Clinic','030907','03-09-07'),(740,3,'9','0A','Beatrice Rural Hospital','03090A','03-09-0A'),(741,3,'9','0B','Kunaka Hospital','03090B','03-09-0B'),(742,3,'9','21','Charakupa Clinic','030921','03-09-21'),(743,3,'9','22','Jonas Clinic','030922','03-09-22'),(744,3,'9','23','Makanyazingwa Clinic','030923','03-09-23'),(745,3,'9','24','Marirangwe Clinic','030924','03-09-24'),(746,3,'9','25','Muda Clinic','030925','03-09-25'),(747,3,'9','26','Epworth Polyclinic','030926','03-09-26'),(748,3,'9','45','Christon Bank','030945','03-09-45'),(749,3,'9','81','Arbor Acres Clinic','030981','03-09-81'),(750,3,'9','82','Gilston Clinic','030982','03-09-82'),(751,3,'9','83','Derbyshire Clinic','030983','03-09-83'),(752,3,'9','84','Lanark Clinic','030984','03-09-84'),(753,3,'9','90','Epworth Mission Clinic','030990','03-09-90'),(754,4,'1','01','Chibero R.H.C.','040101','04-01-01'),(755,4,'1','02','Gora R.H.C.','040102','04-01-02'),(756,4,'1','03','Mbyuanehanda R.H.C.','040103','04-01-03'),(757,4,'1','04','Monera R.H.C.','040104','04-01-04'),(758,4,'1','05','Msengezi R.H.C.','040105','04-01-05'),(759,4,'1','06','Musinami R.H.C.','040106','04-01-06'),(760,4,'1','0A','Chegutu Hospital','04010A','04-01-0A'),(761,4,'1','0B','Mhondoro Hospital','04010B','04-01-0B'),(762,4,'1','0C','Norton Selous Hospital','04010C','04-01-0C'),(763,4,'1','25','Chikara Clinic','040125','04-01-25'),(764,4,'1','26','Chivero Clinic','040126','04-01-26'),(765,4,'1','27','Mhondoro North Clin.','040127','04-01-27'),(766,4,'1','28','Mupawose Clinic','040128','04-01-28'),(767,4,'1','29','Rwizi Clinic','040129','04-01-29'),(768,4,'1','30','Watyoka Clinic','040130','04-01-30'),(769,4,'1','45','Chegutu Clinic','040145','04-01-45'),(770,4,'1','46','Dombwe Clinic','040146','04-01-46'),(771,4,'1','47','Kutanga-Utano Clinic','040147','04-01-47'),(772,4,'1','48','Sandringham Clinic','040148','04-01-48'),(773,4,'1','49','Selous Clinic','040149','04-01-49'),(774,4,'1','51','David Whitehead','040151','04-01-51'),(775,4,'1','52','Hunyani Pulp Clinic','040152','04-01-52'),(776,4,'1','61','Pfupajena Munic Clinic','040161','04-01-61'),(777,4,'1','62','Chinengundu Clinic','040162','04-01-62'),(778,4,'1','76','Zmdc Clinic','040176','04-01-76'),(779,4,'1','77','Lismore Clinic','040177','04-01-77'),(780,4,'1','78','Homedale Clinic','040178','04-01-78'),(781,4,'1','79','Mafuti Clinic','040179','04-01-79'),(782,4,'1','80','Brunswick Clinic','040180','04-01-80'),(783,4,'1','81','Dadle Hall','040181','04-01-81'),(784,4,'1','82','CBDS','040182','04-01-82'),(785,4,'1','83','Suri Suri Airbase Clinic','040183','04-01-83'),(786,4,'1','84','Chegutu Hospital FCH','040184','04-01-84'),(787,4,'2','01','Chirundu R.H.C.','040201','04-02-01'),(788,4,'2','02','Chivende R.H.C.','040202','04-02-02'),(789,4,'2','04','Marongora R.H.C.','040204','04-02-04'),(790,4,'2','05','Masanga R.H.C.','040205','04-02-05'),(791,4,'2','06','Zvipani R.H.C.','040206','04-02-06'),(792,4,'2','0A','Karoi Hospital','04020A','04-02-0A'),(793,4,'2','0B','Hurungwe Hospital','04020B','04-02-0B'),(794,4,'2','0C','Mwani Hospital','04020C','04-02-0C'),(795,4,'2','0D','Chidamoyo Hospital','04020D','04-02-0D'),(796,4,'2','25','Chinhere Clinic','040225','04-02-25'),(797,4,'2','26','Chundu Clinic','040226','04-02-26'),(798,4,'2','27','Kasangarare Clinic','040227','04-02-27'),(799,4,'2','28','Nyamakate Clinic','040228','04-02-28'),(800,4,'2','29','Nyamhunga Clinic','040229','04-02-29'),(801,4,'2','45','Helwin Clinic','040245','04-02-45'),(802,4,'2','46','Hesketh Clinic','040246','04-02-46'),(803,4,'2','47','Mashongwe Clinic','040247','04-02-47'),(804,4,'2','48','Nyangoma Clinic','040248','04-02-48'),(805,4,'2','49','Tengwe Clinic','040249','04-02-49'),(806,4,'2','61','Karoi Static Clinic','040261','04-02-61'),(807,4,'2','75','Lynx Clinic','040275','04-02-75'),(808,4,'2','91','Kapfunde Clinic','040291','04-02-91'),(809,4,'2','92','Karoi Hospital Mobile','040292','04-02-92'),(810,4,'2','93','Hurungwe RCD Mobile','040293','04-02-93'),(811,4,'2','94','Kasimure Clinic','040294','04-02-94'),(812,4,'2','96','Dete','040296','04-02-96'),(813,4,'2','97','Lanlory','040297','04-02-97'),(814,4,'2','98','ZRP Clinic','040298','04-02-98'),(815,4,'2','99','Doro','040299','04-02-99'),(816,4,'3','02','Domboshava R.H.C.','040302','04-03-02'),(817,4,'3','03','Donaine R.H.C.','040303','04-03-03'),(818,4,'3','04','Geja R.H.C.','040304','04-03-04'),(819,4,'3','05','Jompani R.H.C.','040305','04-03-05'),(820,4,'3','06','Jondale Bunbe R.H.C.','040306','04-03-06'),(821,4,'3','07','Kadoma Prison Clinic','040307','04-03-07'),(822,4,'3','08','Muzvezve R.H.C.','040308','04-03-08'),(823,4,'3','09','Nyabango R.H.C.','040309','04-03-09'),(824,4,'3','0A','Kadoma Hospital','04030A','04-03-0A'),(825,4,'3','0B','Ngezi Hospital','04030B','04-03-0B'),(826,4,'3','0C','Sanyati Hospital','04030C','04-03-0C'),(827,4,'3','0D','St.Michael\'s Hospita','04030D','04-03-0D'),(828,4,'3','0E','Battlefields Hospita','04030E','04-03-0E'),(829,4,'3','0F','Rimuka Mch.','04030F','04-03-0F'),(830,4,'3','10','Nyamatani R.H.C.','040310','04-03-10'),(831,4,'3','11','Vere R.H.C.','040311','04-03-11'),(832,4,'3','25','Bururu Clinic','040325','04-03-25'),(833,4,'3','26','Chirikiti Clinic','040326','04-03-26'),(834,4,'3','27','Manyewe Clinic','040327','04-03-27'),(835,4,'3','28','Murambwa Clinic','040328','04-03-28'),(836,4,'3','29','Muwuyu Clinic','040329','04-03-29'),(837,4,'3','30','Sanyati Clinic','040330','04-03-30'),(838,4,'3','31','Associated Textile','040331','04-03-31'),(839,4,'3','45','Chenjiri Clinic','040345','04-03-45'),(840,4,'3','46','Ordolf Clinic','040346','04-03-46'),(841,4,'3','47','Rubatsiro Clinic','040347','04-03-47'),(842,4,'3','48','Turf Estate Clinic','040348','04-03-48'),(843,4,'3','52','C.S.C. Satellite Clinic','040352','04-03-52'),(844,4,'3','53','David Whitehead Cli.','040353','04-03-53'),(845,4,'3','54','Kadoma Textiles Sat.','040354','04-03-54'),(846,4,'3','61','Rimuka','040361','04-03-61'),(847,4,'3','62','Waverly','040362','04-03-62'),(848,4,'3','63','Ingezi','040363','04-03-63'),(849,4,'3','75','Brompton Clinic','040375','04-03-75'),(850,4,'3','76','Eiffel Flats Clinic','040376','04-03-76'),(851,4,'3','77','Golden Valley Clinic','040377','04-03-77'),(852,4,'3','79','Patchway Clinic','040379','04-03-79'),(853,4,'3','80','Venice Clinic','040380','04-03-80'),(854,4,'3','81','Jairos Jiri Clinic','040381','04-03-81'),(855,4,'3','83','Population Services','040383','04-03-83'),(856,4,'3','84','Mafindifindi','040384','04-03-84'),(857,4,'3','85','Come Again Clinic','040385','04-03-85'),(858,4,'3','86','Sanyati Outreach Cl','040386','04-03-86'),(859,4,'3','88','Kadoma Outreach','040388','04-03-88'),(860,4,'3','89','Chaigari Mine Clinic','040389','04-03-89'),(861,4,'4','02','Gache-Gache R.H.C.','040402','04-04-02'),(862,4,'4','03','Kanyati R.H.C.','040403','04-04-03'),(863,4,'4','04','Mola Clinic','040404','04-04-04'),(864,4,'4','05','Negande R.H.C.','040405','04-04-05'),(865,4,'4','0A','Kariba Hospital','04040A','04-04-0A'),(866,4,'4','25','Chalala Clinic','040425','04-04-25'),(867,4,'4','27','Msampakaruwa Clinic','040427','04-04-27'),(868,4,'4','28','Siyakobvu Clinic','040428','04-04-28'),(869,4,'4','61','Nyamhunga','040461','04-04-61'),(870,4,'4','62','Mahombekombe','040462','04-04-62'),(871,4,'5','01','Chinhoyi Prison','040501','04-05-01'),(872,4,'5','02','Chinhoyi Z.R.P.','040502','04-05-02'),(873,4,'5','03','Chinhoyi (Teachers)','040503','04-05-03'),(874,4,'5','05','Kamhonde R.H.C.','040505','04-05-05'),(875,4,'5','06','Kenzamba R.H.C.','040506','04-05-06'),(876,4,'5','07','Murereka R.H.C.','040507','04-05-07'),(877,4,'5','08','Zumbara R.H.C.','040508','04-05-08'),(878,4,'5','0A','Chinhoyi Provincial Hospital','04050A','04-05-0A'),(879,4,'5','0B','St.Rupert\'s Hospital','04050B','04-05-0B'),(880,4,'5','0C','Alaska Mine Hospital','04050C','04-05-0C'),(881,4,'5','0D','Mhangura Mine Hospital','04050D','04-05-0D'),(882,4,'5','0P','Chinhoyi Prov Hosp Opd','04050P','04-05-0P'),(883,4,'5','0Q','Chinhoyi Prov Hosp Fch','04050Q','04-05-0Q'),(884,4,'5','25','Hombwe Clinic','040525','04-05-25'),(885,4,'5','26','Mukohwe Clinic','040526','04-05-26'),(886,4,'5','27','Obva Clinic','040527','04-05-27'),(887,4,'5','45','Doma Clinic','040545','04-05-45'),(888,4,'5','46','Magog Farm Dispensar','040546','04-05-46'),(889,4,'5','47','Matoranjera Clinic','040547','04-05-47'),(890,4,'5','48','Umboe Clinic','040548','04-05-48'),(891,4,'5','51','C.S.C.','040551','04-05-51'),(892,4,'5','61','Chinoyi Clinic','040561','04-05-61'),(893,4,'5','62','Chikonohono','040562','04-05-62'),(894,4,'5','75','Alaska Clinic','040575','04-05-75'),(895,4,'5','76','Damba Clinic','040576','04-05-76'),(896,4,'5','77','Shacleton Clinic','040577','04-05-77'),(897,4,'6','01','Chivhere R.H.C.','040601','04-06-01'),(898,4,'6','02','Gwebi R.H.C.','040602','04-06-02'),(899,4,'6','0A','Banket Hospital Opd','04060A','04-06-0A'),(900,4,'6','0B','Banket Hospital Mch','04060B','04-06-0B'),(901,4,'6','0C','Darwendale Hospital','04060C','04-06-0C'),(902,4,'6','0D','Raffingora Hospital','04060D','04-06-0D'),(903,4,'6','0E','Father O\'hea','04060E','04-06-0E'),(904,4,'6','0F','Mutorashanga Mine H.','04060F','04-06-0F'),(905,4,'6','0G','Zvimba Hospital','04060G','04-06-0G'),(906,4,'6','0H','Banket Outreach','04060H','04-06-0H'),(907,4,'6','25','Masiyarwa Clinic','040625','04-06-25'),(908,4,'6','26','Chirau Clinic','040626','04-06-26'),(909,4,'6','27','Jari Clinic','040627','04-06-27'),(910,4,'6','28','Madzorera Clinic','040628','04-06-28'),(911,4,'6','29','Mpumbu Clinic','040629','04-06-29'),(912,4,'6','41','Ada Sisi Clinic','040641','04-06-41'),(913,4,'6','42','Ayshire Clinic','040642','04-06-42'),(914,4,'6','43','Kutama Clinic','040643','04-06-43'),(915,4,'6','44','Kuwadzana Clinic','040644','04-06-44'),(916,4,'6','45','Mt.Hampden Clinic','040645','04-06-45'),(917,4,'6','46','Nyabira Clinic','040646','04-06-46'),(918,4,'6','47','T.R.B. Clinic','040647','04-06-47'),(919,4,'6','48','Trelawny Clinic','040648','04-06-48'),(920,4,'6','49','Zowa Clinic','040649','04-06-49'),(921,4,'6','75','Caesar Clinic','040675','04-06-75'),(922,4,'6','76','Muriel Clinic','040676','04-06-76'),(923,4,'6','77','Sutton Clinic','040677','04-06-77'),(924,4,'6','78','Vanad Clinic','040678','04-06-78'),(925,5,'1','01','Chunga R.H.C.','050101','05-01-01'),(926,5,'1','02','Lubimbi R.H.C.','050102','05-01-02'),(927,5,'1','03','Lusulu R.H.C.','050103','05-01-03'),(928,5,'1','04','Muchesu R.H.C.','050104','05-01-04'),(929,5,'1','05','Siansundu R.H.C.','050105','05-01-05'),(930,5,'1','08','Chinego R.H.C.','050108','05-01-08'),(931,5,'1','0A','Binga Hospital','05010A','05-01-0A'),(932,5,'1','0B','Siabuwa Hospital','05010B','05-01-0B'),(933,5,'1','0C','Kariyangwe Hospital','05010C','05-01-0C'),(934,5,'1','25','Pashu Clinic','050125','05-01-25'),(935,5,'1','90','Tinde Clinic','050190','05-01-90'),(936,5,'2','01','Lukala R.H.C.','050201','05-02-01'),(937,5,'2','02','Membeswana R.H.C.','050202','05-02-02'),(938,5,'2','0A','Inyathi Hospital','05020A','05-02-0A'),(939,5,'2','26','Siganda Clinic','050226','05-02-26'),(940,5,'2','27','Balanda Clinic','050227','05-02-27'),(941,5,'2','28','Majiji Clinic','050228','05-02-28'),(942,5,'2','56','Isabella Clinic','050256','05-02-56'),(943,5,'3','01','Chisuma R.H.C.','050301','05-03-01'),(944,5,'3','02','Jambezi R.H.C.','050302','05-03-02'),(945,5,'3','03','Kanyambizi R.H.C.','050303','05-03-03'),(946,5,'3','04','Mwakandara R.H.C.','050304','05-03-04'),(947,5,'3','05','Mwemba R.H.C.','050305','05-03-05'),(948,5,'3','06','ZRP Victoria Falls Clinic','050306','05-03-06'),(949,5,'3','0A','Victoria Falls Hospital','05030A','05-03-0A'),(950,5,'3','0B','Lukosi Hospital','05030B','05-03-0B'),(951,5,'3','0C','Kamativi Tin Hospit.','05030C','05-03-0C'),(952,5,'3','0D','Hwange Collery Hospital','05030D','05-03-0D'),(953,5,'3','26','Dete Clinic','050326','05-03-26'),(954,5,'3','27','Dinde Clinic','050327','05-03-27'),(955,5,'3','30','Lupote Clinic','050330','05-03-30'),(956,5,'3','31','Main Camp Clinic','050331','05-03-31'),(957,5,'3','32','Ndlovu Clinic','050332','05-03-32'),(958,5,'3','33','Simangane Clinic','050333','05-03-33'),(959,5,'3','34','Vic.Falls Clinic','050334','05-03-34'),(960,5,'3','35','Mabale Clinic','050335','05-03-35'),(961,5,'3','36','Robins Clinic','050336','05-03-36'),(962,5,'3','37','St Patricks Hospital','050337','05-03-37'),(963,5,'3','39','CBDS [ZNFPC]','050339','05-03-39'),(964,5,'3','53','Hwange  Prison Clinic','050353','05-03-53'),(965,5,'3','55','Hwange ZRP Clinic','050355','05-03-55'),(966,5,'3','58','Zesa Dr  Stn Clinic','050358','05-03-58'),(967,5,'3','59','Zesa Chibondo','050359','05-03-59'),(968,5,'3','60','Zesa Inguminja Cli.','050360','05-03-60'),(969,5,'3','61','Empumalanga','050361','05-03-61'),(970,5,'3','62','Chinotimba','050362','05-03-62'),(971,5,'3','81','Dete Clinic (Nrz)','050381','05-03-81'),(972,5,'3','82','Ngumija Clinic (Nrz)','050382','05-03-82'),(973,5,'3','83','N.R.Z. Surgery (Nrz)','050383','05-03-83'),(974,5,'3','91','Lukunguni Clinic','050391','05-03-91'),(975,5,'4','02','Dandanda R.H.C.','050402','05-04-02'),(976,5,'4','03','Dongamuzi R.H.C.','050403','05-04-03'),(977,5,'4','04','Gomoza R.H.C.','050404','05-04-04'),(978,5,'4','05','Kanyandavu R.H.C.','050405','05-04-05'),(979,5,'4','06','Lupane R.H.C.','050406','05-04-06'),(980,5,'4','07','Lupaka Clinic','050407','05-04-07'),(981,5,'4','08','Mobile A','050408','05-04-08'),(982,5,'4','0A','St.Paul\'s Hospital','05040A','05-04-0A'),(983,5,'4','0B','St.Luke\'s Hospital','05040B','05-04-0B'),(984,5,'4','10','ZNFPC','050410','05-04-10'),(985,5,'4','26','Jotsholo Clinic','050426','05-04-26'),(986,5,'4','27','Mdlankuzi Clinic','050427','05-04-27'),(987,5,'4','91','Fatima Mission','050491','05-04-91'),(988,5,'5','02','Mateme R.H.C.','050502','05-05-02'),(989,5,'5','03','Ngwaladi R.H.C.','050503','05-05-03'),(990,5,'5','05','Sivalo R.H.C.','050505','05-05-05'),(991,5,'5','06','Zenka R.H.C.','050506','05-05-06'),(992,5,'5','0A','Nkayi Hospital','05050A','05-05-0A'),(993,5,'5','0B','Dakamela Hospital','05050B','05-05-0B'),(994,5,'5','0C','Mbuma Hospital','05050C','05-05-0C'),(995,5,'5','25','Fanisoni Clinic','050525','05-05-25'),(996,5,'5','26','Nesingwe Clinic','050526','05-05-26'),(997,5,'5','27','Sebhumane Clinic','050527','05-05-27'),(998,5,'5','28','Sikhobokhobo Clinic','050528','05-05-28'),(999,5,'5','29','Zinyangeni Clinic','050529','05-05-29'),(1000,5,'5','30','Nkayi Mobile','050530','05-05-30'),(1001,5,'5','31','Mbuma Mobile','050531','05-05-31'),(1002,5,'5','32','Guwe Clinic','050532','05-05-32'),(1003,5,'5','33','Gwelutshena Clinic','050533','05-05-33'),(1004,5,'5','34','Sesemba Clinic','050534','05-05-34'),(1005,5,'6','03','Makhaza R.H.C.','050603','05-06-03'),(1006,5,'6','04','Mlagisa R.H.C.','050604','05-06-04'),(1007,5,'6','05','Mtshayeli R.H.C.','050605','05-06-05'),(1008,5,'6','06','Sodaka R.H.C.','050606','05-06-06'),(1009,5,'6','0A','Tsholotsho Hospital','05060A','05-06-0A'),(1010,5,'6','0B','Siphepha Hospital','05060B','05-06-0B'),(1011,5,'6','0C','Phumula Hospital','05060C','05-06-0C'),(1012,5,'6','25','Bhubhudhe Clinic','050625','05-06-25'),(1013,5,'6','26','Dlamini Clinic','050626','05-06-26'),(1014,5,'6','28','Jimila Clinic','050628','05-06-28'),(1015,5,'6','29','Madlangombe Clinic','050629','05-06-29'),(1016,5,'6','30','Nkunzi Clinic','050630','05-06-30'),(1017,5,'6','31','Tsholotsho Urban Clinic','050631','05-06-31'),(1018,5,'6','94','Cbd [ZNFPC]','050694','05-06-94'),(1019,5,'6','96','Kapane R.H.C.','050696','05-06-96'),(1020,5,'6','97','Mpanedziba R.H.C.','050697','05-06-97'),(1021,5,'6','98','Sikente R.H.C.','050698','05-06-98'),(1022,5,'7','03','Igusi','050703','05-07-03'),(1023,5,'7','0A','Nyamandlovu Hospital','05070A','05-07-0A'),(1024,5,'7','26','Fingo','050726','05-07-26'),(1025,5,'7','29','Ntabazinduna','050729','05-07-29'),(1026,5,'7','33','Mbembesi','050733','05-07-33'),(1027,5,'7','51','Clay Products','050751','05-07-51'),(1028,5,'7','52','Fairbridge','050752','05-07-52'),(1029,5,'7','53','Unicem','050753','05-07-53'),(1030,5,'7','65','Imbizo Camp','050765','05-07-65'),(1031,5,'7','81','T.G.Silundika','050781','05-07-81'),(1032,5,'7','85','Ntabazinduna Zps Clinic','050785','05-07-85'),(1033,5,'7','88','Ntabazinduna ZRP Clinic','050788','05-07-88'),(1034,5,'7','91','St James Mission','050791','05-07-91'),(1035,5,'7','97','Induna','050797','05-07-97'),(1036,5,'7','98','Muntu Clinic','050798','05-07-98'),(1037,5,'7','99','Khami Depend Clinic','050799','05-07-99'),(1038,6,'1','01','Chikwalakwala R.H.C.','060101','06-01-01'),(1039,6,'1','02','Chitulipasi R.H.C.','060102','06-01-02'),(1040,6,'1','03','Dite R.H.C.','060103','06-01-03'),(1041,6,'1','04','Majini R.H.C.','060104','06-01-04'),(1042,6,'1','05','Prison Clinic','060105','06-01-05'),(1043,6,'1','06','Shabwe R.H.C.','060106','06-01-06'),(1044,6,'1','07','Z.N.A. Clinic','060107','06-01-07'),(1045,6,'1','08','ZRP Clinic','060108','06-01-08'),(1046,6,'1','09','Nottingham R.H.C.','060109','06-01-09'),(1047,6,'1','0A','Beitbridge Hospital','06010A','06-01-0A'),(1048,6,'1','25','Chasvingo Clinic','060125','06-01-25'),(1049,6,'1','26','Dulibadzimu Clinic','060126','06-01-26'),(1050,6,'1','27','Masera Clinic','060127','06-01-27'),(1051,6,'1','28','Swereki R.H.C.','060128','06-01-28'),(1052,6,'1','29','Shashe Clinic','060129','06-01-29'),(1053,6,'1','30','Tongwe Clinic','060130','06-01-30'),(1054,6,'1','31','Zezani Clinic','060131','06-01-31'),(1055,6,'1','76','Makakabule Clinic','060176','06-01-76'),(1056,6,'1','77','Chamnangana Clinic','060177','06-01-77'),(1057,6,'1','81','N.R.Z Clinic','060181','06-01-81'),(1058,6,'2','01','Village 13 R.H.C','060201','06-02-01'),(1059,6,'2','02','Huwana R.H.C.','060202','06-02-02'),(1060,6,'2','04','Makhulela R.H.C.','060204','06-02-04'),(1061,6,'2','06','Matjinge R.H.C.','060206','06-02-06'),(1062,6,'2','08','Nswazwi R.H.C','060208','06-02-08'),(1063,6,'2','0B','Lady Barring Hospita','06020B','06-02-0B'),(1064,6,'2','0C','Lady Stanley Hospita','06020C','06-02-0C'),(1065,6,'2','20','Hingwe R.H.C','060220','06-02-20'),(1066,6,'2','25','Bombodema Clinic','060225','06-02-25'),(1067,6,'2','28','Madlambudzi Clinic','060228','06-02-28'),(1068,6,'2','30','Ndiweni Clinic','060230','06-02-30'),(1069,6,'2','31','Sikhathini Clinic','060231','06-02-31'),(1070,6,'2','91','Solusi Clinic','060291','06-02-91'),(1071,6,'3','01','Gungwe R.H.C.','060301','06-03-01'),(1072,6,'3','02','Magwe R.H.C.','060302','06-03-02'),(1073,6,'3','03','Nhwali R.H.C.','060303','06-03-03'),(1074,6,'3','04','Prison Clinic','060304','06-03-04'),(1075,6,'3','05','Simbumbumbu Clinic','060305','06-03-05'),(1076,6,'3','06','Stainmore R.H.C.','060306','06-03-06'),(1077,6,'3','07','Z.R.P. Clinic','060307','06-03-07'),(1078,6,'3','08','Z.N.A. Clinic','060308','06-03-08'),(1079,6,'3','09','ZNFPC','060309','06-03-09'),(1080,6,'3','0A','Gwanda Provincial Hospital','06030A','06-03-0A'),(1081,6,'3','0B','Manama Hospital','06030B','06-03-0B'),(1082,6,'3','0C','Mtshabezi Hospital','06030C','06-03-0C'),(1083,6,'3','25','Buvuma Clinic','060325','06-03-25'),(1084,6,'3','26','Kafusi Clinic','060326','06-03-26'),(1085,6,'3','27','Mashaba Clinic','060327','06-03-27'),(1086,6,'3','28','Mzimuni Clinic','060328','06-03-28'),(1087,6,'3','29','Ntalale Clinic','060329','06-03-29'),(1088,6,'3','30','Sengezane Clinic','060330','06-03-30'),(1089,6,'3','62','Phakama Clinic','060362','06-03-62'),(1090,6,'3','63','Selonga Clinic','060363','06-03-63'),(1091,6,'3','76','Blanket Clinic','060376','06-03-76'),(1092,6,'3','77','Colleen-Bawn Clinic','060377','06-03-77'),(1093,6,'3','78','Freda Clinic','060378','06-03-78'),(1094,6,'3','79','Jessie Clinic','060379','06-03-79'),(1095,6,'3','80','Vumbachikwe Clinic','060380','06-03-80'),(1096,6,'3','81','J.Z.Moyo Clinic','060381','06-03-81'),(1097,6,'3','82','Zimcan Clinic','060382','06-03-82'),(1098,6,'3','83','Jm Polytech Clinic','060383','06-03-83'),(1099,6,'4','02','Gwatemba R.H.C.','060402','06-04-02'),(1100,6,'4','03','Insiza R.H.C.','060403','06-04-03'),(1101,6,'4','04','Mabuze R.H.C.','060404','06-04-04'),(1102,6,'4','05','Nkankezi R.H.C.','060405','06-04-05'),(1103,6,'4','06','Nyamime R.H.C.','060406','06-04-06'),(1104,6,'4','07','Sanale R.H.C.','060407','06-04-07'),(1105,6,'4','0A','Filabusi Hospital','06040A','06-04-0A'),(1106,6,'4','0B','Shangani Hospital','06040B','06-04-0B'),(1107,6,'4','0C','Avoca Hospital','06040C','06-04-0C'),(1108,6,'4','0D','Wanezi Hospital','06040D','06-04-0D'),(1109,6,'4','25','Singwango Clinic','060425','06-04-25'),(1110,6,'4','26','Zhulube Clinic','060426','06-04-26'),(1111,6,'4','27','Singwambizi Clinic','060427','06-04-27'),(1112,6,'4','28','Kombo Health Post','060428','06-04-28'),(1113,6,'4','76','Epoch Clinic','060476','06-04-76'),(1114,6,'4','77','Shangani Clinic','060477','06-04-77'),(1115,6,'5','01','Natisa R.H.C.','060501','06-05-01'),(1116,6,'5','02','Sankonjane R.H.C.','060502','06-05-02'),(1117,6,'5','03','Homestead R.H.C.','060503','06-05-03'),(1118,6,'5','04','Beula-Seula R.H.C.','060504','06-05-04'),(1119,6,'5','05','Ekukhanyeni R.H.C.','060505','06-05-05'),(1120,6,'5','0A','Maphisa Hospital','06050A','06-05-0A'),(1121,6,'5','0B','Kezi Hospital','06050B','06-05-0B'),(1122,6,'5','0C','Matopo Hospital','06050C','06-05-0C'),(1123,6,'5','0D','Tshelanyemba Hospital','06050D','06-05-0D'),(1124,6,'5','0E','St.Joseph\'s Hospital','06050E','06-05-0E'),(1125,6,'5','25','Mbembeswane R.H.C.','060525','06-05-25'),(1126,6,'5','27','Boomerange Health Post','060527','06-05-27'),(1127,6,'5','81','Gulati Clinic','060581','06-05-81'),(1128,6,'5','91','Matopo Clinic','060591','06-05-91'),(1129,6,'5','92','Bazha Clinic','060592','06-05-92'),(1130,6,'5','93','Masiye Camp Health Post','060593','06-05-93'),(1131,6,'6','01','Kumbudzi R.H.C.','060601','06-06-01'),(1132,6,'6','02','Mbizingwe R.H.C.','060602','06-06-02'),(1133,6,'6','03','Z.N.A. Clinic','060603','06-06-03'),(1134,6,'6','0A','Esigodini Hospital','06060A','06-06-0A'),(1135,6,'6','20','Epi Mobile','060620','06-06-20'),(1136,6,'6','25','Esibomvu Clinic','060625','06-06-25'),(1137,6,'6','26','Habane Clinic','060626','06-06-26'),(1138,6,'6','27','Mawabeni Clinic','060627','06-06-27'),(1139,6,'6','28','Mhlalandlela Clinic','060628','06-06-28'),(1140,6,'6','29','Nhlangano Clinic','060629','06-06-29'),(1141,6,'6','30','Nswazi Clinic','060630','06-06-30'),(1142,6,'6','31','Ntshamathe Clinic','060631','06-06-31'),(1143,6,'6','32','Irrisvale Clinic','060632','06-06-32'),(1144,6,'6','33','Mpisini Health Post','060633','06-06-33'),(1145,6,'6','76','How Mine Clinic','060676','06-06-76'),(1146,6,'6','81','Agriculture Inst.','060681','06-06-81'),(1147,6,'6','85','ZNFPC','060685','06-06-85'),(1148,6,'7','03','Ingwizi R.H.C','060703','06-07-03'),(1149,6,'7','05','Marula Clinic','060705','06-07-05'),(1150,6,'7','07','Mayobodo R.H.C','060707','06-07-07'),(1151,6,'7','09','Bango R.H.C','060709','06-07-09'),(1152,6,'7','0A','Plumtree Hospital','06070A','06-07-0A'),(1153,6,'7','0D','St Annes Mission Hosp Brunapeg','06070D','06-07-0D'),(1154,6,'7','0E','Embakwe Mission Hosp','06070E','06-07-0E'),(1155,6,'7','27','Madabe Clinic','060727','06-07-27'),(1156,6,'7','29','Mambale Clinic','060729','06-07-29'),(1157,6,'7','32','Tshitshi Clinic','060732','06-07-32'),(1158,6,'7','33','Sanzukwi Clinic','060733','06-07-33'),(1159,6,'7','45','Dingumuzi Clinic','060745','06-07-45'),(1160,6,'7','92','Empandeni Clinic','060792','06-07-92'),(1161,6,'7','93','Plumtree Prison Clinic','060793','06-07-93'),(1162,7,'1','01','Chizhou Clinic','070101','07-01-01'),(1163,7,'1','02','Denhere Clinic','070102','07-01-02'),(1164,7,'1','03','Lynwood Clinic','070103','07-01-03'),(1165,7,'1','04','Nyautonge R.H.C.','070104','07-01-04'),(1166,7,'1','05','Nyikavanhu Clinic','070105','07-01-05'),(1167,7,'1','0A','Mvuma Hospital','07010A','07-01-0A'),(1168,7,'1','0B','Chilimanzi Hospital','07010B','07-01-0B'),(1169,7,'1','0C','Driemfontein Hospita','07010C','07-01-0C'),(1170,7,'1','0D','Holy Cross Hospital','07010D','07-01-0D'),(1171,7,'1','0E','Muvonde Hospital','07010E','07-01-0E'),(1172,7,'1','0F','St.Theressa Hospital','07010F','07-01-0F'),(1173,7,'1','25','Chengwena Clinic','070125','07-01-25'),(1174,7,'1','26','Hama Clinic','070126','07-01-26'),(1175,7,'1','27','Siyahokwe Clinic','070127','07-01-27'),(1176,7,'1','45','Lalapanzi Clinic','070145','07-01-45'),(1177,7,'1','51','Zamasco Clinic','070151','07-01-51'),(1178,7,'1','78','Peak Mine Clinic','070178','07-01-78'),(1179,7,'1','81','Athens Clinic','070181','07-01-81'),(1180,7,'1','82','Mtao Forest Clinic','070182','07-01-82'),(1181,7,'1','86','Central Estates Clinic','070186','07-01-86'),(1182,7,'2','01','Gwanyika R.H.C.','070201','07-02-01'),(1183,7,'2','02','Kadzidirire R.H.C.','070202','07-02-02'),(1184,7,'2','03','Madzivazvido R.H.C.','070203','07-02-03'),(1185,7,'2','04','Musadzi R.H.C.','070204','07-02-04'),(1186,7,'2','05','Mashame R.H.C.','070205','07-02-05'),(1187,7,'2','06','Mateta R.H.C.','070206','07-02-06'),(1188,7,'2','07','Norah R.H.C.','070207','07-02-07'),(1189,7,'2','08','Nyaje R.H.C.','070208','07-02-08'),(1190,7,'2','09','Simchembu R.H.C.','070209','07-02-09'),(1191,7,'2','0A','Gokwe Hospital','07020A','07-02-0A'),(1192,7,'2','0B','Chireya Hospital','07020B','07-02-0B'),(1193,7,'2','0C','Kana Hospital','07020C','07-02-0C'),(1194,7,'2','0D','Mutora Hospital','07020D','07-02-0D'),(1195,7,'2','10','Tsungai R.H.C.','070210','07-02-10'),(1196,7,'2','11','Svisvi Clinic','070211','07-02-11'),(1197,7,'2','12','Zhamba Clinic','070212','07-02-12'),(1198,7,'2','13','Cheziya Clinic','070213','07-02-13'),(1199,7,'2','14','To Phone','070214','07-02-14'),(1200,7,'2','15','ZRP Camp Clinic','070215','07-02-15'),(1201,7,'2','16','Chitave Clinic','070216','07-02-16'),(1202,7,'2','17','Mateme Sda Clinic','070217','07-02-17'),(1203,7,'2','19','Jahana Clinic','070219','07-02-19'),(1204,7,'2','20','Vumba Clinic','070220','07-02-20'),(1205,7,'2','24','Population Services Clinic','070224','07-02-24'),(1206,7,'2','25','Chemahororo Clinic','070225','07-02-25'),(1207,7,'2','26','Gawa Clinic','070226','07-02-26'),(1208,7,'2','27','Gumunyu Clinic','070227','07-02-27'),(1209,7,'2','28','Jiri/Ndoza Clinic','070228','07-02-28'),(1210,7,'2','29','Kahobo Clinic','070229','07-02-29'),(1211,7,'2','30','Krima Clinic','070230','07-02-30'),(1212,7,'2','31','Kuwirirana Clinic','070231','07-02-31'),(1213,7,'2','32','Mangidi Clinic','070232','07-02-32'),(1214,7,'2','33','Manoti Clinic','070233','07-02-33'),(1215,7,'2','34','Masuka Clinic','070234','07-02-34'),(1216,7,'2','35','Msala Clinic','070235','07-02-35'),(1217,7,'2','36','Musita Clinic','070236','07-02-36'),(1218,7,'2','37','Nyamhunga Clinic','070237','07-02-37'),(1219,7,'2','38','Sai Clinic','070238','07-02-38'),(1220,7,'2','39','Tongwe Clinic','070239','07-02-39'),(1221,7,'2','40','Zhomba Clinic','070240','07-02-40'),(1222,7,'2','41','Mokoka Clinic','070241','07-02-41'),(1223,7,'2','91','Denda Clinic','070291','07-02-91'),(1224,7,'2','92','Goredema Clinic','070292','07-02-92'),(1225,7,'2','93','Manyoni Clinic','070293','07-02-93'),(1226,7,'2','94','Mtanke Clinic','070294','07-02-94'),(1227,7,'2','95','Nenyunga Clinic','070295','07-02-95'),(1228,7,'2','96','Sessami Clinic','070296','07-02-96'),(1229,7,'2','97','Huchu Clinic','070297','07-02-97'),(1230,7,'2','98','Rubatsiro Clinic','070298','07-02-98'),(1231,7,'3','01','Gunde R.H.C.','070301','07-03-01'),(1232,7,'3','02','Kabanga R.H.C.','070302','07-03-02'),(1233,7,'3','03','Mangwandi R.H.C.','070303','07-03-03'),(1234,7,'3','04','Masvori R.H.C.','070304','07-03-04'),(1235,7,'3','05','Nkululeko R.H.C.','070305','07-03-05'),(1236,7,'3','06','Ntabamhlope R.H.C.','070306','07-03-06'),(1237,7,'3','07','Midlands State University','070307','07-03-07'),(1238,7,'3','08','Mkoba Teachers Coll.','070308','07-03-08'),(1239,7,'3','09','Five Maint.','070309','07-03-09'),(1240,7,'3','0A','Gweru Provincial H.','07030A','07-03-0A'),(1241,7,'3','0B','Birchenough Hospital','07030B','07-03-0B'),(1242,7,'3','0C','Chikwingwizha Hospital','07030C','07-03-0C'),(1243,7,'3','0D','Infectious Diseases','07030D','07-03-0D'),(1244,7,'3','0E','Guinea Fowl','07030E','07-03-0E'),(1245,7,'3','0F','Thornhill Hospital','07030F','07-03-0F'),(1246,7,'3','0U','Gweru Urban','07030U','07-03-0U'),(1247,7,'3','12','Zim.Military Academy','070312','07-03-12'),(1248,7,'3','13','Connemara (Justice)','070313','07-03-13'),(1249,7,'3','14','Whawha (Justice)','070314','07-03-14'),(1250,7,'3','15','Fletcher High School','070315','07-03-15'),(1251,7,'3','16','Z.R.P. Clinic','070316','07-03-16'),(1252,7,'3','20','Outreach ','070320','07-03-20'),(1253,7,'3','21','Vungu Rdc Clinic','070321','07-03-21'),(1254,7,'3','25','Chiwundura Clinic','070325','07-03-25'),(1255,7,'3','26','Maboleni Clinic','070326','07-03-26'),(1256,7,'3','27','Madikani Clinic','070327','07-03-27'),(1257,7,'3','28','Makepesi Clinic','070328','07-03-28'),(1258,7,'3','45','Somabhula Clinic','070345','07-03-45'),(1259,7,'3','46','Vungu Clinic','070346','07-03-46'),(1260,7,'3','47','Nyama','070347','07-03-47'),(1261,7,'3','48','V.D.R.C.  Mobile','070348','07-03-48'),(1262,7,'3','51','Bata Clinic','070351','07-03-51'),(1263,7,'3','52','C.S.C.','070352','07-03-52'),(1264,7,'3','53','Dairy Market. Board','070353','07-03-53'),(1265,7,'3','54','Zimasco Clinic','070354','07-03-54'),(1266,7,'3','56','Zimbabwe Castings','070356','07-03-56'),(1267,7,'3','57','Zimglass','070357','07-03-57'),(1268,7,'3','62','Mkoba 1','070362','07-03-62'),(1269,7,'3','63','Mkoba Polyclinic','070363','07-03-63'),(1270,7,'3','64','Monomutapa','070364','07-03-64'),(1271,7,'3','65','Medical Centre','070365','07-03-65'),(1272,7,'3','66','Ivene','070366','07-03-66'),(1273,7,'3','67','Senga','070367','07-03-67'),(1274,7,'3','68','Totonga','070368','07-03-68'),(1275,7,'3','69','Claybank (Ch.Welf.)','070369','07-03-69'),(1276,7,'3','81','Dabuka Clinic (Nrz)','070381','07-03-81'),(1277,7,'3','82','Kariba Clinic','070382','07-03-82'),(1278,7,'3','83','Lalapanzi Clinic','070383','07-03-83'),(1279,7,'3','84','Netherburn','070384','07-03-84'),(1280,7,'3','85','Railways (Nrz)','070385','07-03-85'),(1281,7,'3','91','Lower Gweru Clinic','070391','07-03-91'),(1282,7,'3','92','St.Patrick\'s Clinic','070392','07-03-92'),(1283,7,'4','01','Dendera R.H.C.','070401','07-04-01'),(1284,7,'4','02','Donza R.H.C.','070402','07-04-02'),(1285,7,'4','03','Mazebe R.H.C.','070403','07-04-03'),(1286,7,'4','04','Msilahobe R.H.C.','070404','07-04-04'),(1287,7,'4','05','Nyoni R.H.C.','070405','07-04-05'),(1288,7,'4','09','Mayoka','070409','07-04-09'),(1289,7,'4','0A','Kwekwe Hospital','07040A','07-04-0A'),(1290,7,'4','0B','Silobela Hospital','07040B','07-04-0B'),(1291,7,'4','0C','Zhombe Hospital','07040C','07-04-0C'),(1292,7,'4','0D','Torwood Hospital','07040D','07-04-0D'),(1293,7,'4','0U','Kwekwe Urban','07040U','07-04-0U'),(1294,7,'4','20','Epi Team','070420','07-04-20'),(1295,7,'4','25','Donjuan Clinic','070425','07-04-25'),(1296,7,'4','26','Exchange Clinic','070426','07-04-26'),(1297,7,'4','27','Malisa Joshepha Cli.','070427','07-04-27'),(1298,7,'4','28','Malisa Zhombe Clinic','070428','07-04-28'),(1299,7,'4','29','Ntabeni Clinic','070429','07-04-29'),(1300,7,'4','30','Samambwa Clinic','070430','07-04-30'),(1301,7,'4','31','Senkwasi Clinic','070431','07-04-31'),(1302,7,'4','32','Sidakeni Clinic','070432','07-04-32'),(1303,7,'4','33','Silobela Clinic','070433','07-04-33'),(1304,7,'4','34','Simana Clinic','070434','07-04-34'),(1305,7,'4','51','Globe And Phoenix','070451','07-04-51'),(1306,7,'4','52','Rio Tinto Clinic','070452','07-04-52'),(1307,7,'4','53','Mlezu Clinic','070453','07-04-53'),(1308,7,'4','54','Torwood Clinic','070454','07-04-54'),(1309,7,'4','55','Torsteel Clinic','070455','07-04-55'),(1310,7,'4','56','Zimasco Clinic','070456','07-04-56'),(1311,7,'4','57','Zrdc Clinic','070457','07-04-57'),(1312,7,'4','58','Zisco Works Clinic','070458','07-04-58'),(1313,7,'4','59','Redcliff','070459','07-04-59'),(1314,7,'4','61','Amaveni','070461','07-04-61'),(1315,7,'4','62','Mbizo A','070462','07-04-62'),(1316,7,'4','63','Mbizo B','070463','07-04-63'),(1317,7,'4','64','Rutendo','070464','07-04-64'),(1318,7,'4','65','Sebakwe','070465','07-04-65'),(1319,7,'4','66','Sherwood','070466','07-04-66'),(1320,7,'4','76','Community Polyclinic','070476','07-04-76'),(1321,7,'4','77','Jena Mines Clinic','070477','07-04-77'),(1322,7,'4','81','Gaika Clinic','070481','07-04-81'),(1323,7,'4','83','Medical Centre','070483','07-04-83'),(1324,7,'4','84','Tiger Reef Clinic','070484','07-04-84'),(1325,7,'4','85','Munyati Clinic','070485','07-04-85'),(1326,7,'4','86','Al Davies Clinic','070486','07-04-86'),(1327,7,'4','87','Z.R.P. Clinic','070487','07-04-87'),(1328,7,'4','88','Gomora Clinic','070488','07-04-88'),(1329,7,'5','01','Gwarawa R.H.C.','070501','07-05-01'),(1330,7,'5','02','Mataga R.H.C.','070502','07-05-02'),(1331,7,'5','03','Mavorovondo R.H.C.','070503','07-05-03'),(1332,7,'5','04','Murongwe R.H.C.','070504','07-05-04'),(1333,7,'5','05','Mwanezi R.H.C.','070505','07-05-05'),(1334,7,'5','06','Vurasha R.H.C.','070506','07-05-06'),(1335,7,'5','07','Wanezi  R.H.C.','070507','07-05-07'),(1336,7,'5','08','Kotokwe R.H.C.','070508','07-05-08'),(1337,7,'5','0A','Mberengwa Hospital','07050A','07-05-0A'),(1338,7,'5','0B','Jeka Hospital','07050B','07-05-0B'),(1339,7,'5','0C','Masase Hospital','07050C','07-05-0C'),(1340,7,'5','0D','Mnene Hospital','07050D','07-05-0D'),(1341,7,'5','0E','Musume Hospital','07050E','07-05-0E'),(1342,7,'5','25','Bonda Clinic','070525','07-05-25'),(1343,7,'5','26','Chabwira Clinic','070526','07-05-26'),(1344,7,'5','27','Chidembeko Clinic','070527','07-05-27'),(1345,7,'5','28','Chingezi Clinic','070528','07-05-28'),(1346,7,'5','29','Makuwerere Clinic','070529','07-05-29'),(1347,7,'5','30','Matedzi Clinic','070530','07-05-30'),(1348,7,'5','31','Mazivofa Clinic','070531','07-05-31'),(1349,7,'5','32','Mbahuru Clinic','070532','07-05-32'),(1350,7,'5','33','Mketi Clinic','070533','07-05-33'),(1351,7,'5','34','Negove Clinic','070534','07-05-34'),(1352,7,'5','35','Ngezi Clinic','070535','07-05-35'),(1353,7,'5','36','Ngungumbane Clinic','070536','07-05-36'),(1354,7,'5','37','Svita Clinic','070537','07-05-37'),(1355,7,'5','38','Mponjani Clinic','070538','07-05-38'),(1356,7,'5','39','Mposi Clinic','070539','07-05-39'),(1357,7,'5','40','Chiedza Clinic','070540','07-05-40'),(1358,7,'5','41','Vutsanana Clinic','070541','07-05-41'),(1359,7,'5','76','Buchwa Mine Clinic','070576','07-05-76'),(1360,7,'5','77','C.Mine Clinic','070577','07-05-77'),(1361,7,'5','78','Sandawana Clinic','070578','07-05-78'),(1362,7,'5','79','Buchwa Camp Clinic','070579','07-05-79'),(1363,7,'5','86','Mnene Outreach','070586','07-05-86'),(1364,7,'6','01','Chikato R.H.C.','070601','07-06-01'),(1365,7,'6','02','Chironde R.H.C.','070602','07-06-02'),(1366,7,'6','03','Chitora R.H.C.','070603','07-06-03'),(1367,7,'6','04','Gwanza R.H.C.','070604','07-06-04'),(1368,7,'6','05','Marishongwe R.H.C.','070605','07-06-05'),(1369,7,'6','06','Rusike R.H.C.','070606','07-06-06'),(1370,7,'6','07','Tana R.H.C.','070607','07-06-07'),(1371,7,'6','08','Zvarota R.H.C.','070608','07-06-08'),(1372,7,'6','09','Svika R.H.C.','070609','07-06-09'),(1373,7,'6','0A','Shurugwi Hospital','07060A','07-06-0A'),(1374,7,'6','0B','Zvamabande Hospital','07060B','07-06-0B'),(1375,7,'6','0C','Chrome Mine Hospital','07060C','07-06-0C'),(1376,7,'6','25','Banga Clinic','070625','07-06-25'),(1377,7,'6','26','Gundura Clinic','070626','07-06-26'),(1378,7,'6','27','Mazibisa Clinic','070627','07-06-27'),(1379,7,'6','28','Nhema Clinic','070628','07-06-28'),(1380,7,'6','29','Tongogara Clinic','070629','07-06-29'),(1381,7,'6','45','Jobolinko Clinic','070645','07-06-45'),(1382,7,'6','46','Makusha Clinic','070646','07-06-46'),(1383,7,'6','47','Rockford Clinic','070647','07-06-47'),(1384,7,'6','48','Tokwe Clinic','070648','07-06-48'),(1385,7,'6','77','Iron Mine Clinic','070677','07-06-77'),(1386,7,'6','78','Peak Mine Clinic','070678','07-06-78'),(1387,7,'6','79','Quarry Gold Mine','070679','07-06-79'),(1388,7,'6','91','Hanke Clinic','070691','07-06-91'),(1389,7,'6','92','Pakame Clinic','070692','07-06-92'),(1390,7,'7','01','Maketo R.H.C.','070701','07-07-01'),(1391,7,'7','02','Mandava R.H.C.','070702','07-07-02'),(1392,7,'7','03','Matenda R.H.C.','070703','07-07-03'),(1393,7,'7','04','Vugwi R.H.C.','070704','07-07-04'),(1394,7,'7','05','Vukuzenzele R.H.C.','070705','07-07-05'),(1395,7,'7','0A','Zvishavane Hospital','07070A','07-07-0A'),(1396,7,'7','0B','Lundi Hospital','07070B','07-07-0B'),(1397,7,'7','0C','Shabane Mine Hospital','07070C','07-07-0C'),(1398,7,'7','20','Epi Mobile','070720','07-07-20'),(1399,7,'7','25','Gudo Clinic','070725','07-07-25'),(1400,7,'7','26','Mabasa Clinic','070726','07-07-26'),(1401,7,'7','27','Mapanzure Clinic','070727','07-07-27'),(1402,7,'7','28','Mrowa Clinic','070728','07-07-28'),(1403,7,'7','29','Mtambi Clinic','070729','07-07-29'),(1404,7,'7','32','Runde Mobile','070732','07-07-32'),(1405,7,'7','76','Sabi Mine Clinic','070776','07-07-76'),(1406,7,'7','77','Mimosa','070777','07-07-77'),(1407,7,'7','78','Medical Centre','070778','07-07-78'),(1408,7,'7','80','Zvishavane Prison','070780','07-07-80'),(1409,7,'7','81','Bannockburn Clinic','070781','07-07-81'),(1410,7,'7','82','Family Planning','070782','07-07-82'),(1411,7,'7','83','Kandodo Clinic','070783','07-07-83'),(1412,7,'7','84','Maglass Clinic','070784','07-07-84'),(1413,7,'7','85','ZRP Clinic','070785','07-07-85'),(1414,7,'7','86','Zvishavane Polyclinic','070786','07-07-86'),(1415,7,'8','0A','Gokwe Hosp','07080A','07-08-0A'),(1416,8,'1','01','Chirorwe R.H.C.','080101','08-01-01'),(1417,8,'1','02','Dewure I R.H.C.','080102','08-01-02'),(1418,8,'1','03','Dewure Ii R.H.C.','080103','08-01-03'),(1419,8,'1','04','Mukanga R.H.C.','080104','08-01-04'),(1420,8,'1','05','Mukore R.H.C.','080105','08-01-05'),(1421,8,'1','06','Nyika R.H.C.','080106','08-01-06'),(1422,8,'1','07','Ngorima R.H.C.','080107','08-01-07'),(1423,8,'1','0A','Bikita Rural Hospital','08010A','08-01-0A'),(1424,8,'1','0B','Chikuku Rural Hospital','08010B','08-01-0B'),(1425,8,'1','0C','Mashoko Hospital','08010C','08-01-0C'),(1426,8,'1','0D','Silveira Hospital','08010D','08-01-0D'),(1427,8,'1','20','Bikita Epi Mobile','080120','08-01-20'),(1428,8,'1','25','Chitasa Clinic','080125','08-01-25'),(1429,8,'1','26','Hozvi Clinic','080126','08-01-26'),(1430,8,'1','27','Mandara Clinic','080127','08-01-27'),(1431,8,'1','28','Marozva Clinic','080128','08-01-28'),(1432,8,'1','29','Odzi Clinic','080129','08-01-29'),(1433,8,'1','30','Negovani Clinic','080130','08-01-30'),(1434,8,'1','31','Murwira Clinic','080131','08-01-31'),(1435,8,'1','32','Mungezi R.H.C.','080132','08-01-32'),(1436,8,'1','33','Mutikizizi R.H.C.','080133','08-01-33'),(1437,8,'1','34','Gangare R.H.C.','080134','08-01-34'),(1438,8,'1','35','Gava R.H.C.','080135','08-01-35'),(1439,8,'1','76','Bikita Minerals Clinic','080176','08-01-76'),(1440,8,'2','01','Chambuta Clinic','080201','08-02-01'),(1441,8,'2','02','Chilonga R.H.C.','080202','08-02-02'),(1442,8,'2','04','Chizvirizvi R.H.C.','080204','08-02-04'),(1443,8,'2','05','Dzavata R.H.C.','080205','08-02-05'),(1444,8,'2','06','Gezani R.H.C.','080206','08-02-06'),(1445,8,'2','07','Malipati R.H.C.','080207','08-02-07'),(1446,8,'2','08','Mhlanguleni R.H.C.','080208','08-02-08'),(1447,8,'2','09','Muteyo R.H.C.','080209','08-02-09'),(1448,8,'2','0A','Chiredzi Hospital','08020A','08-02-0A'),(1449,8,'2','0B','Chikombedzi Hospital','08020B','08-02-0B'),(1450,8,'2','0C','Hippo Valley Hospital','08020C','08-02-0C'),(1451,8,'2','0D','Triangle Hospital','08020D','08-02-0D'),(1452,8,'2','10','Nyambange R.H.C.','080210','08-02-10'),(1453,8,'2','12','Old Boli R.H.C.','080212','08-02-12'),(1454,8,'2','13','Samu R.H.C.','080213','08-02-13'),(1455,8,'2','14','Pahlela Clinic','080214','08-02-14'),(1456,8,'2','17','Chiredzi Prison Clinic','080217','08-02-17'),(1457,8,'2','18','Z.R.P.','080218','08-02-18'),(1458,8,'2','20','Chiredzi Epi Mobile','080220','08-02-20'),(1459,8,'2','25','Chibvedziva Clinic','080225','08-02-25'),(1460,8,'2','26','Chipiwa Clinic','080226','08-02-26'),(1461,8,'2','27','St.Joseph Clinic','080227','08-02-27'),(1462,8,'2','28','Dumisa Clinic','080228','08-02-28'),(1463,8,'2','29','Porepore Clinic','080229','08-02-29'),(1464,8,'2','30','Rupangwana Clinic','080230','08-02-30'),(1465,8,'2','31','Rutandare Clinic','080231','08-02-31'),(1466,8,'2','32','Chitsa Ii Clinic','080232','08-02-32'),(1467,8,'2','33','Tsovani Clinic','080233','08-02-33'),(1468,8,'2','34','Makambe Clinic','080234','08-02-34'),(1469,8,'2','82','Mkwasine Clinic','080282','08-02-82'),(1470,8,'2','84','Z.S.A.','080284','08-02-84'),(1471,8,'2','85','N.R.Z.','080285','08-02-85'),(1472,8,'2','91','Damarakanaka Clinic','080291','08-02-91'),(1473,8,'2','92','Chingele Clinic','080292','08-02-92'),(1474,8,'3','02','Chigwikwi R.H.C.','080302','08-03-02'),(1475,8,'3','03','Mandamabwe R.H.C.','080303','08-03-03'),(1476,8,'3','04','Ngundu R.H.C.','080304','08-03-04'),(1477,8,'3','05','Razi R.H.C.','080305','08-03-05'),(1478,8,'3','07','Takavarasha R.H.C.','080307','08-03-07'),(1479,8,'3','08','Nyahombe R.H.C.','080308','08-03-08'),(1480,8,'3','0A','Chivi District Hospital','08030A','08-03-0A'),(1481,8,'3','0B','Chivi Rural Hospital','08030B','08-03-0B'),(1482,8,'3','0C','Berejena Mission Hospital','08030C','08-03-0C'),(1483,8,'3','25','Chifedza Clinic','080325','08-03-25'),(1484,8,'3','26','Davira Clinic','080326','08-03-26'),(1485,8,'3','27','Madamombe Clinic','080327','08-03-27'),(1486,8,'3','28','Shindi Satellite Cl','080328','08-03-28'),(1487,8,'4','01','Mushaviri R.H.C.','080401','08-04-01'),(1488,8,'4','02','Majada R.H.C.','080402','08-04-02'),(1489,8,'4','03','Matizha R.H.C.','080403','08-04-03'),(1490,8,'4','04','Mutema R.H.C.','080404','08-04-04'),(1491,8,'4','05','Nemashakwe R.H.C.','080405','08-04-05'),(1492,8,'4','06','Soti Source R.H.C.','080406','08-04-06'),(1493,8,'4','08','Chitando R.H.C.','080408','08-04-08'),(1494,8,'4','09','Zvavahera R.H.C.','080409','08-04-09'),(1495,8,'4','0A','Gutu Rural Hospital','08040A','08-04-0A'),(1496,8,'4','0B','Chimombe Rural Hosp','08040B','08-04-0B'),(1497,8,'4','0D','Chinyika Hospital','08040D','08-04-0D'),(1498,8,'4','0E','Gutu Mission Hospital','08040E','08-04-0E'),(1499,8,'4','25','Cheshuro Clinic','080425','08-04-25'),(1500,8,'4','26','Denhere Clinic','080426','08-04-26'),(1501,8,'4','27','Dewure Clinic','080427','08-04-27'),(1502,8,'4','28','Magombedze Clinic','080428','08-04-28'),(1503,8,'4','29','Mazuru Clinic','080429','08-04-29'),(1504,8,'4','30','Munyikwa Clinic','080430','08-04-30'),(1505,8,'4','31','Nyazvidzi Clinic','080431','08-04-31'),(1506,8,'4','32','Zinhata Clinic','080432','08-04-32'),(1507,8,'4','33','Tirizi Satellite Cl','080433','08-04-33'),(1508,8,'4','34','Chiwore R.H.C.','080434','08-04-34'),(1509,8,'4','35','Magombedze Chitsa Clinic','080435','08-04-35'),(1510,8,'4','36','Chipiri','080436','08-04-36'),(1511,8,'4','37','Dambaro','080437','08-04-37'),(1512,8,'4','38','Matomuse','080438','08-04-38'),(1513,8,'4','76','Population Health Clinic','080476','08-04-76'),(1514,8,'4','91','Serima Clinic','080491','08-04-91'),(1515,8,'4','92','Mutero R.H.C.','080492','08-04-92'),(1516,8,'4','93','Mukaro Mission Clinic','080493','08-04-93'),(1517,8,'5','01','Alvord R.H.C.','080501','08-05-01'),(1518,8,'5','02','Mukosi R.H.C.','080502','08-05-02'),(1519,8,'5','03','Mushandike R.H.C.','080503','08-05-03'),(1520,8,'5','04','Musvovi R.H.C.','080504','08-05-04'),(1521,8,'5','05','Mutimurefu R.H.C.','080505','08-05-05'),(1522,8,'5','06','Nemamwa R.H.C.','080506','08-05-06'),(1523,8,'5','07','Nyikavanhu R.H.C.','080507','08-05-07'),(1524,8,'5','08','Z.R.P. Clinic','080508','08-05-08'),(1525,8,'5','09','41.Brigade Clinic','080509','08-05-09'),(1526,8,'5','0A','Masvingo Provincial','08050A','08-05-0A'),(1527,8,'5','0B','Ngomahura Psy.Hospital','08050B','08-05-0B'),(1528,8,'5','0C','Nyajena Rural Hospital','08050C','08-05-0C'),(1529,8,'5','0D','Morgenster Mission','08050D','08-05-0D'),(1530,8,'5','0E','Gokomere Mission Cl','08050E','08-05-0E'),(1531,8,'5','0F','Gaths Mine Hospital','08050F','08-05-0F'),(1532,8,'5','10','Masv.Teach.Coll.Clinic','080510','08-05-10'),(1533,8,'5','11','Masvingo Tech College Clinic','080511','08-05-11'),(1534,8,'5','12','Sommerton R.H.C.','080512','08-05-12'),(1535,8,'5','20','Masvingo Epi Mobile','080520','08-05-20'),(1536,8,'5','25','Chakumbira Clinic','080525','08-05-25'),(1537,8,'5','26','Chatikobo Clinic','080526','08-05-26'),(1538,8,'5','27','Gundura Clinic','080527','08-05-27'),(1539,8,'5','28','Mapanzure Clinic','080528','08-05-28'),(1540,8,'5','29','Masvingo Prison  Clinic','080529','08-05-29'),(1541,8,'5','30','Bere Clinic','080530','08-05-30'),(1542,8,'5','31','Murinye Clinic','080531','08-05-31'),(1543,8,'5','32','Rukovo Clinic','080532','08-05-32'),(1544,8,'5','33','Shumba Clinic','080533','08-05-33'),(1545,8,'5','34','Zimuto B.C. Clinic','080534','08-05-34'),(1546,8,'5','35','Mucheke Clinic','080535','08-05-35'),(1547,8,'5','36','Zano Clinic','080536','08-05-36'),(1548,8,'5','40','Guwa R.H.C.','080540','08-05-40'),(1549,8,'5','41','Gurajena R.H.C.','080541','08-05-41'),(1550,8,'5','42','Stanmore R.H.C.','080542','08-05-42'),(1551,8,'5','43','Zvamahonde','080543','08-05-43'),(1552,8,'5','44','Ngomahuru R.H.C.','080544','08-05-44'),(1553,8,'5','76','Renco Mine Clinic','080576','08-05-76'),(1554,8,'5','77','Lennox Mine Clinic','080577','08-05-77'),(1555,8,'5','81','Mazorodze Clinic','080581','08-05-81'),(1556,8,'5','82','Rujeko Clinic','080582','08-05-82'),(1557,8,'5','83','Runyararo Clinic','080583','08-05-83'),(1558,8,'5','91','Bondolfi Clinic','080591','08-05-91'),(1559,8,'5','92','Shonganiso Clinic','080592','08-05-92'),(1560,8,'5','93','Zimuto Mission Clinic','080593','08-05-93'),(1561,8,'5','95','Masv.Mission Mobile','080595','08-05-95'),(1562,8,'6','01','Chimbudzi R.H.C.','080601','08-06-01'),(1563,8,'6','02','Chirindi R.H.C.','080602','08-06-02'),(1564,8,'6','03','Chizumba R.H.C.','080603','08-06-03'),(1565,8,'6','04','Maranda Sub R.H.C.','080604','08-06-04'),(1566,8,'6','05','Nehanda R.H.C.','080605','08-06-05'),(1567,8,'6','06','Rutenga Clinic','080606','08-06-06'),(1568,8,'6','0A','Neshuro Diistrict Hospital','08060A','08-06-0A'),(1569,8,'6','0B','Matibi Mission Hosp','08060B','08-06-0B'),(1570,8,'6','20','Mwenezi Epi Mobile','080620','08-06-20'),(1571,8,'6','25','Mazetese Clinic','080625','08-06-25'),(1572,8,'6','27','Mushava Clinic','080627','08-06-27'),(1573,8,'6','28','Mwenezi Clinic','080628','08-06-28'),(1574,8,'6','29','Murove Clinic','080629','08-06-29'),(1575,8,'6','30','Mlelezi Clinic','080630','08-06-30'),(1576,8,'6','31','Boterere Clinic','080631','08-06-31'),(1577,8,'6','81','Rutenga Clinic','080681','08-06-81'),(1578,8,'6','82','M.D.C. Clinic','080682','08-06-82'),(1579,8,'6','91','Maranda Clinic','080691','08-06-91'),(1580,8,'6','92','Lundi Clinic','080692','08-06-92'),(1581,8,'7','01','Chipinda R.H.C.','080701','08-07-01'),(1582,8,'7','02','Harava R.H.C.','080702','08-07-02'),(1583,8,'7','03','Nemauku R.H.C.','080703','08-07-03'),(1584,8,'7','04','Svuure R.H.C.','080704','08-07-04'),(1585,8,'7','05','Zibwowa R.H.C.','080705','08-07-05'),(1586,8,'7','0A','Ndanga Hospital','08070A','08-07-0A'),(1587,8,'7','0C','Musiso Hospital','08070C','08-07-0C'),(1588,8,'7','20','Zaka Epi Mobile','080720','08-07-20'),(1589,8,'7','25','Bota Clinic','080725','08-07-25'),(1590,8,'7','26','Bvukururu Clinic','080726','08-07-26'),(1591,8,'7','27','Chinyabako Clinic','080727','08-07-27'),(1592,8,'7','29','Chiredzana Clinic','080729','08-07-29'),(1593,8,'7','30','Fube Clinic','080730','08-07-30'),(1594,8,'7','32','Jichidza Clinic','080732','08-07-32'),(1595,8,'7','33','Mushaya Clinic','080733','08-07-33'),(1596,8,'7','34','Ndanga Clinic','080734','08-07-34'),(1597,8,'7','35','Nhema Clinic','080735','08-07-35'),(1598,8,'7','36','Nyakunhuwa Clinic','080736','08-07-36'),(1599,8,'7','37','Siyawareva Clinic','080737','08-07-37'),(1600,8,'7','38','Veza Clinic','080738','08-07-38'),(1601,8,'7','40','Jerera Satelite Clinic','080740','08-07-40'),(1602,8,'7','91','Jichidza Mission','080791','08-07-91'),(1603,9,'A','01','Emakhandeni Day Clinic','090A01','09-0A-01'),(1604,9,'A','02','Tshabalala Clinic','090A02','09-0A-02'),(1605,9,'A','03','E.F.Watson Clinic','090A03','09-0A-03'),(1606,9,'A','04','Entumbane Clinic','090A04','09-0A-04'),(1607,9,'A','05','Khami Road Clinic','090A05','09-0A-05'),(1608,9,'A','06','Luveve Clinic','090A06','09-0A-06'),(1609,9,'A','07','Magwegwe Clinic','090A07','09-0A-07'),(1610,9,'A','08','Mzilikazi Clinic','090A08','09-0A-08'),(1611,9,'A','09','Njube Clinic','090A09','09-0A-09'),(1612,9,'A','0A','Lady Rodwell','090A0A','09-0A-0A'),(1613,9,'A','0E','Thorngrove','090A0E','09-0A-0E'),(1614,9,'A','0G','Mater Dei','090A0G','09-0A-0G'),(1615,9,'A','0H','Richard Morris','090A0H','09-0A-0H'),(1616,9,'A','0I','Ingutsheni Hospital','090A0I','09-0A-0I'),(1617,9,'A','10','Nkulumane Clinic','090A10','09-0A-10'),(1618,9,'A','11','Pelandaba Clinic','090A11','09-0A-11'),(1619,9,'A','12','Princess Margareth','090A12','09-0A-12'),(1620,9,'A','13','Pumula Clinic','090A13','09-0A-13'),(1621,9,'A','14','Dr.Shenan Clinic','090A14','09-0A-14'),(1622,9,'A','16','Central Clinic','090A16','09-0A-16'),(1623,9,'A','17','Nketa Clinic','090A17','09-0A-17'),(1624,9,'A','18','Northern Surban  Clinic','090A18','09-0A-18'),(1625,9,'A','19','King\'s Maternity','090A19','09-0A-19'),(1626,9,'A','20','Jubilee Clinic','090A20','09-0A-20'),(1627,9,'A','21','Maternal Health Clinic','090A21','09-0A-21'),(1628,9,'A','22','Galen House Clinic','090A22','09-0A-22'),(1629,9,'A','23','Marondera Polyclinic','090A23','09-0A-23'),(1630,9,'A','24','Family Medical Clinic','090A24','09-0A-24'),(1631,9,'A','25','Elons Clinic','090A25','09-0A-25'),(1632,9,'A','27','Cowdray Park Clinic','090A27','09-0A-27'),(1633,9,'A','28','Silver Oaks Medical Centre','090A28','09-0A-28'),(1634,9,'A','29','Patient Wise Clinic','090A29','09-0A-29'),(1635,9,'A','30','Family Health Clinic','090A30','09-0A-30'),(1636,9,'A','31','24 Hour Medical Centre','090A31','09-0A-31'),(1637,9,'A','32','Main Street','090A32','09-0A-32'),(1638,9,'A','33','Maqhawe Clinic','090A33','09-0A-33'),(1639,9,'A','35','Pumula South Clinic','090A35','09-0A-35'),(1640,9,'A','36','Tembi Home Health Centre','090A36','09-0A-36'),(1641,9,'A','37','Medical Chambers Cnt','090A37','09-0A-37'),(1642,9,'A','39','Dr W Ndebele','090A39','09-0A-39'),(1643,9,'B','01','Ingutsheni','090B01','09-0B-01'),(1644,9,'C','02','U.B.H','090C02','09-0C-02'),(1645,9,'C','0C','UBH','090C0C','09-0C-0C'),(1646,9,'D','02','Mpilo Hospital','090D02','09-0D-02');
/*!40000 ALTER TABLE `facilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facility`
--

DROP TABLE IF EXISTS `facility`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facility` (
  `ID` int NOT NULL,
  `DistrictID` int DEFAULT NULL,
  `ProvinceID` varchar(255) DEFAULT NULL,
  `FacilityName` varchar(255) DEFAULT NULL,
  `FacilityCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facility`
--

LOCK TABLES `facility` WRITE;
/*!40000 ALTER TABLE `facility` DISABLE KEYS */;
INSERT INTO `facility` VALUES (1,6,'7','Harare hospital','5'),(2,6,'0','Arcadia P.C.C.','02'),(3,NULL,'0','Bank Street P.C.C.','03'),(4,NULL,'0','Belvedere F.H.C.','05'),(5,NULL,'0','Borrowdale F.H.C.','06'),(6,NULL,'0','Borrowdale P.C.C.','07'),(7,NULL,'0','Braeside F.H.C.','08'),(8,NULL,'0','Budiriro Polyclinic','09'),(9,NULL,'0','Mbuya Nehanda','0A'),(10,NULL,'0','Psychriatic Unit','0B'),(11,NULL,'0','Beatrice Rd.Infectio','0C'),(12,NULL,'0','Wilkins Infectious H','0D'),(13,NULL,'0','St.Annes','0E'),(14,NULL,'0','Avenues Clinic','0F'),(15,NULL,'0','Harare City All Clinics','0U'),(16,NULL,'0','Eastlea F.H.C.','10'),(17,NULL,'0','Glen Norah Satellite','11'),(18,NULL,'0','Glen Norah Polyclin.','12'),(19,NULL,'0','Glen View Polyclinic','13'),(20,NULL,'0','Glen View Satellite','14'),(21,NULL,'0','Greendale F.H.C.','15'),(22,NULL,'0','Hatcliffe F.H.C.','16'),(23,NULL,'0','Hatcliffe P.C.C.','17'),(24,NULL,'0','Highfield Polyclinic','18'),(25,NULL,'0','Kambuzuma Polyclinic','19'),(26,NULL,'0','Kuwadzana Polyclinic','20'),(27,NULL,'0','Mabelreign Satellite','21'),(28,NULL,'0','Mabvuku F.H.C.','22'),(29,NULL,'0','Mabvuku P.C.C.','23'),(30,NULL,'0','Marondera Polyclinic','24'),(31,NULL,'0','Matapi Clinic','25'),(32,NULL,'0','Mbare Hostels Clinic','26'),(33,NULL,'0','Mbare Polyclinic','27'),(34,NULL,'0','Mt.Pleasant P.C.C.','28'),(35,NULL,'0','Mufakose Polyclinic','29'),(36,NULL,'0','Parirenyatwa P.C.C.','30'),(37,NULL,'0','Queen Elisabeth Fhc.','31'),(38,NULL,'0','Rugare Clinic','32'),(39,NULL,'0','Rujeko Clinic','33'),(40,NULL,'0','Rutsanana Clinic','34'),(41,NULL,'0','Southerton P.C.C.','35'),(42,NULL,'0','Sunningdale F.H.C.','36'),(43,NULL,'0','Sunningdale P.C.C.','37'),(44,NULL,'0','Tafara Clinic','38'),(45,NULL,'0','Warren Park Polycli.','39'),(46,NULL,'0','Waterfalls F.H.C.','40'),(47,NULL,'0','Waterfalls P.C.C.','41'),(48,NULL,'0','Western Triangle Pcc','42'),(49,NULL,'0','Kg Six','43'),(50,NULL,'0','Seke South Clinic','01'),(51,NULL,'0','Seke North Clinic','02'),(52,NULL,'0','St.Mary\'s Clinic','03'),(53,NULL,'0','Zengeza Clinic','04'),(54,NULL,'0','South Medical Hospital','0B'),(55,NULL,'0','Chitungwiza Hospital','01'),(56,NULL,'0','Harare Cent Hosp','01'),(57,NULL,'0','Harare Hosp','07'),(58,NULL,'0','Harare  Hosp','0D'),(59,0,'0','Casualty','01'),(60,0,'0','Domestic Staff Clin.','02'),(61,0,'0','Family Planning','03'),(62,0,'0','Geriatric Centre','04'),(63,0,'0','G.M.O.','05'),(64,0,'0','O.P.D. (T)','06'),(65,0,'0','O.P.D. (Nt)','07'),(66,0,'0','Radiotherapy','08'),(67,0,'0','Sekuru Kaguvi','09'),(68,0,'0','Parirenyatwa','0E'),(69,0,'0','Staff Clinic','10'),(70,NULL,'0','Parirenyatwa Clinic','01'),(71,NULL,'0','Hatfield Clinic','02'),(72,NULL,'0','Arcadia Clinic','03'),(73,NULL,'0','Mabvuku Poly','04'),(74,NULL,'0','Highlands','05'),(75,NULL,'0','Mabvuku Satelite Clinic','06'),(76,NULL,'0','Borrowdale Clinic','07'),(77,NULL,'0','Mount Pleasant','08'),(78,NULL,'0','Hatcliffe Clinic','09'),(79,NULL,'0','Beatrice Road Hosp','0C'),(80,NULL,'0','Wilkins Hospital','0D'),(81,NULL,'0','Avondale Clinic','10'),(82,NULL,'0','Marlborough Satelite Clinic','11'),(83,NULL,'0','Mabelreign Satelite','12'),(84,NULL,'0','Rujeko Poly','13'),(85,NULL,'0','Belvedere Satelite','14'),(86,NULL,'0','Warren Park  Poly','15'),(87,NULL,'0','Kuwadzana Poly','16'),(88,NULL,'0','Kambuzuma Poly','17'),(89,NULL,'0','Southerton Clinic','18'),(90,NULL,'0','Highfield Poly','19'),(91,NULL,'0','Rutsanana Poly','20'),(92,NULL,'0','Western Triangle Clinic','21'),(93,NULL,'0','Glen Norah Satelite','22'),(94,NULL,'0','Glen View  Poly','23'),(95,NULL,'0','Glen View Satelite','24'),(96,NULL,'0','Mufakose Poly','25'),(97,NULL,'0','Budiriro Poly','26'),(98,NULL,'0','Mbare Poly ','27'),(99,NULL,'0','Matapi Clinic','28'),(100,NULL,'0','Mbare Hostels Clinic','29'),(101,NULL,'0','Sunningdale Clinic','30'),(102,NULL,'0','Waterfalls Clinic','31'),(103,NULL,'0','Hopley Clinic','32'),(104,NULL,'0','Private Institutions','33'),(105,1,'1','Betera R.H.C.','02'),(106,1,'1','Madzimbashuro R.H.C.','03'),(107,1,'1','Mombeyarara R.H.C.','04'),(108,1,'1','Murwira R.H.C.','05'),(109,1,'1','Zangama R.H.C.','06'),(110,1,'1','Buhera Hospital','0A'),(111,1,'1','Birchenough Bridge H','0B'),(112,1,'1','Murambinda Hospital','0C'),(113,1,'1','Nyashanu Hospital','0D'),(114,1,'1','Viriri Hospital','0E'),(115,1,'1','Mudawose','16'),(116,1,'1','Chimbudzi','17'),(117,1,'1','Garamwera','18'),(118,1,'1','Munyanyi','19'),(119,1,'1','Mudanda','24'),(120,1,'1','Bangure Clinic','25'),(121,1,'1','Chabata Clinic','26'),(122,1,'1','Chapanduka Clinic','27'),(123,1,'1','Chapwanya Clinic','28'),(124,1,'1','Chirozva Clinic','29'),(125,1,'1','Chiwenga Clinic','30'),(126,1,'1','Chiwese Clinic','31'),(127,1,'1','Gunura Clinic','32'),(128,1,'1','Gombe Clinic','33'),(129,1,'1','Mutepfe Clinic','34'),(130,1,'1','Mutiusinazita Clinic','35'),(131,1,'1','Muzokomba Clinic','36'),(132,1,'1','Nerutanga Clinic','37'),(133,1,'1','Rambanembasi Clinic','38'),(134,1,'1','Mumanyi R.H.C.','39'),(135,1,'1','Dorowa Clinic','75'),(136,2,'1','Bumba R.H.C.','01'),(137,2,'1','Changazi R.H.C.','02'),(138,2,'1','Chayamiti R.H.C.','03'),(139,2,'1','Chikukwa R.H.C.','04'),(140,2,'1','Nyahode Clinic','05'),(141,2,'1','Muchadziya R.H.C.','08'),(142,2,'1','Biriviri Hospital','0A'),(143,2,'1','Nyanyadzi Hospital','0B'),(144,2,'1','Mutambara Hospital','0C'),(145,2,'1','Rusitu Hospital','0D'),(146,2,'1','Chimanimani Hospital','0E'),(147,2,'1','Cashel Clinic','25'),(148,2,'1','Chakohwa Clinic','26'),(149,2,'1','Chikwakwa Clinic','27'),(150,2,'1','Gudyanga Clinic','29'),(151,2,'1','Mutsvangwa Clinic','30'),(152,2,'1','Ngorima Clinic','31'),(153,2,'1','Shinja Clinic','32'),(154,2,'1','Arda Rusitu Clinic','51'),(155,2,'1','Martin Forest','52'),(156,2,'1','Charter Clinic','61'),(157,2,'1','Chisengu Clinic','62'),(158,2,'1','Gwendingwe Clinic','63'),(159,2,'1','Roscommon Clinic','64'),(160,2,'1','Tarka Clinic','65'),(161,2,'1','Tilbury Clinic','66'),(162,3,'1','Chinyamukwakwa R.H.C','03'),(163,3,'1','Kopera R.H.C.','06'),(164,3,'1','Mabee R.H.C.','07'),(165,3,'1','Mahenye R.H.C.','09'),(166,3,'1','Chipinge Hospital','0A'),(167,3,'1','Chikore Hospital','0B'),(168,3,'1','Mt.Selinda Hospital','0C'),(169,3,'1','St Peters','0D'),(170,3,'1','Musiriswe R.H.C.','11'),(171,3,'1','Paidamoyo R.H.C.','12'),(172,3,'1','Tanganda R.H.C.','14'),(173,3,'1','Tongogara R.H.C.','15'),(174,3,'1','Tuzuka R.H.C.','16'),(175,3,'1','Z.R.P','17'),(176,3,'1','Chipinge Prisons Clinic','18'),(177,3,'1','Chibuwe Clinic','25'),(178,3,'1','Gumira Clinic','26'),(179,3,'1','Hwakwata Clinic','27'),(180,3,'1','Kondo Clinic','28'),(181,3,'1','Madhuko Clinic','29'),(182,3,'1','Manzvire Clinic','30'),(183,3,'1','Musani Clinic','31'),(184,3,'1','Mutandahwe Clinic','32'),(185,3,'1','Mutema Clinic','33'),(186,3,'1','Ngaone Clinic','34'),(187,3,'1','Rimbi Clinic','35'),(188,3,'1','Veneka Clinic','36'),(189,3,'1','Zamuchia Clinic','37'),(190,3,'1','Chichichi R.H.C.','38'),(191,3,'1','Chisuma R.H.C.','39'),(192,3,'1','Maparadza Clinic','40'),(193,3,'1','Chipangayi Clinic','45'),(194,3,'1','Chiriga Clinic','46'),(195,3,'1','Gaza Clinic','47'),(196,3,'1','Junction Gate Clinic','48'),(197,3,'1','Chipinge Town Clinic','49'),(198,3,'1','Tamandayi Clinic','50'),(199,3,'1','Arda Chisumbanje Clinic','61'),(200,3,'1','Clearwater Clinic','62'),(201,3,'1','Jersey Clinic','64'),(202,3,'1','Midsave Clinic','65'),(203,3,'1','New Year\'s Gift Cli.','66'),(204,3,'1','Silver Stream Clinic','67'),(205,3,'1','Smalldeel Clinic','68'),(206,3,'1','Southdown Clinic','69'),(207,3,'1','Takwirira Clinic','70'),(208,3,'1','Ratelshoek Clinic','71'),(209,3,'1','Zona Clinic','72'),(210,3,'1','Gwenzi Clinic','90'),(211,4,'1','Bamba R.H.C.','01'),(212,4,'1','Chikobvore R.H.C.','02'),(213,4,'1','Chinhenga R.H.C.','03'),(214,4,'1','Chinyika I R.H.C.','04'),(215,4,'1','Chinyika Ii R.H.C.','05'),(216,4,'1','Chinyudze R.H.C.','06'),(217,4,'1','Groobi Spring R.H.C.','07'),(218,4,'1','Gowakowa R.H.C.','09'),(219,4,'1','Rusape Hospital','0A'),(220,4,'1','Weya Hospital','0B'),(221,4,'1','Makoni Hospital','0C'),(222,4,'1','Nedewedzo Hospital','0D'),(223,4,'1','St.Micheal\'s Tanda H','0E'),(224,4,'1','St.Therese\'s Hospita','0F'),(225,4,'1','Katsenga R.H.C.','10'),(226,4,'1','Maparura R.H.C','11'),(227,4,'1','Masvosva R.H.C.','12'),(228,4,'1','Matotwe R.H.C.','13'),(229,4,'1','Mayo I R.H.C.','14'),(230,4,'1','Mayo Ii R.H.C.','15'),(231,4,'1','Nyahowe R.H.C.','18'),(232,4,'1','Nyahukwe R.H.C','19'),(233,4,'1','Nyamukamani R.H.C.','20'),(234,4,'1','Chiduku Clinic','25'),(235,4,'1','Chikore Clinic','26'),(236,4,'1','Nyazura Clinic','27'),(237,4,'1','Dowa Clinic','28'),(238,4,'1','Dumbabwe Clinic','29'),(239,4,'1','Matsika Clinic','30'),(240,4,'1','Nyamidzi Clinic','31'),(241,4,'1','Mukamba Clinic','32'),(242,4,'1','Rukweza Clinic','33'),(243,4,'1','Tandi Clinic','34'),(244,4,'1','Toriro Clinic','35'),(245,4,'1','Tsanzaguru Clinic','36'),(246,4,'1','Era Mine Clinic','37'),(247,4,'1','Maurice Nyagumbo','38'),(248,4,'1','Mufusire','39'),(249,4,'1','Headlands Clinic','40'),(250,4,'1','Mubvurungwa Clinic','41'),(251,4,'1','Vengere Clinic','42'),(252,4,'1','Ringanayi','43'),(253,4,'1','Mavhudzi Clinic','44'),(254,4,'1','Chinyadza Clinic','45'),(255,4,'1','Nyamusosa Clinic','46'),(256,4,'1','Sangano','47'),(257,4,'1','Vengere Clinic','49'),(258,4,'1','Rusape Prison','74'),(259,4,'1','ZRP Rusape','75'),(260,4,'1','Inyathi Mine','76'),(261,4,'1','Mukuwapasi Rehab','81'),(262,4,'1','Mukuwapasi Clinic','82'),(263,4,'1','Nyazura Mission Clinic','91'),(264,4,'1','Arnoldine Mission Cl','92'),(265,5,'1','Bwizi R.H.C.','01'),(266,5,'1','Chiadzwa R.H.C.','02'),(267,5,'1','Mavhiza','03'),(268,5,'1','Gutaurare R.H.C.','04'),(269,5,'1','Gwindingwi R.H.C.','05'),(270,5,'1','Muromo R.H.C.','06'),(271,5,'1','Murowa R.H.C.','07'),(272,5,'1','Mt Zuma','09'),(273,5,'1','Mutare Provincial Hospital','0A'),(274,5,'1','Mutare Infectious Hospital','0B'),(275,5,'1','Sakubva Hospital','0C'),(276,5,'1','Sakubva Infectious Hospital','0D'),(277,5,'1','Marange Hospital','0E'),(278,5,'1','St.Andrew\'s Hospital','0F'),(279,5,'1','St.Joseph\'s Hospital','0G'),(280,5,'1','Nyagundi R.H.C.','11'),(281,5,'1','Nyamazura R.H.C.','12'),(282,5,'1','Zvipiripiri R.H.C.','13'),(283,5,'1','Vumba','15'),(284,5,'1','Z.R.P','16'),(285,5,'1','Chitora','18'),(286,5,'1','Matanda','20'),(287,5,'1','Leekuyl Takunda','21'),(288,5,'1','Army Dependent','23'),(289,5,'1','Arda Odzi','24'),(290,5,'1','Bakorenhema Clinic','25'),(291,5,'1','Bezely Bridge Clinic','26'),(292,5,'1','Chipfatsura Clinic','27'),(293,5,'1','Chitakatira Clinic','29'),(294,5,'1','Mambwere Clinic','30'),(295,5,'1','Masasi Clinic','31'),(296,5,'1','Mutare Prison Farm Clinic','32'),(297,5,'1','Mkwada Clinic','33'),(298,5,'1','Chitaka Clinic','34'),(299,5,'1','Mushunje Clinic','35'),(300,5,'1','Nzvenga Clinic','36'),(301,5,'1','Rowa Clinic','37'),(302,5,'1','Odzi Clinic','38'),(303,5,'1','Zimunya Clinic','39'),(304,5,'1','Zumbare Clinic','40'),(305,5,'1','Dora','41'),(306,5,'1','Chishingwi','43'),(307,5,'1','Chipendereke','44'),(308,5,'1','Burma Valley Clinic','45'),(309,5,'1','City Health Clinic','61'),(310,5,'1','Chikanga Clinic','62'),(311,5,'1','Dangamvura Clinic','63'),(312,5,'1','Sakubva Health Centre','64'),(313,5,'1','Florida Clinic','65'),(314,5,'1','Fern Valley Clinic','66'),(315,5,'1','Mapofu Clinic','84'),(316,5,'1','Chikwariro Clinic','91'),(317,6,'1','Chavhanga R.H.C.','01'),(318,6,'1','Rupinda R.H.C.','02'),(319,6,'1','Sherukuru R.H.C.','03'),(320,6,'1','Tsonzo R.H.C.','04'),(321,6,'1','Tsonzo Hospital','0A'),(322,6,'1','Bonda Hospital','0B'),(323,6,'1','Old Mutare Hospital','0C'),(324,6,'1','St.Barbara Hospital','0D'),(325,6,'1','Triashill Hospital','0E'),(326,6,'1','Hauna District Hospital','0F'),(327,6,'1','Chitombo Clinic','25'),(328,6,'1','Guta Clinic','26'),(329,6,'1','Hauna Clinic','27'),(330,6,'1','Mandeya Clinic','28'),(331,6,'1','Mpotedzi Clinic','29'),(332,6,'1','Mt.Jenya Clinic','30'),(333,6,'1','Mutasa Clinic','31'),(334,6,'1','Mwoyoweshumba Clinic','32'),(335,6,'1','Ngarura Clinic','33'),(336,6,'1','Ruda Clinic','34'),(337,6,'1','Rumbizi Clinic','35'),(338,6,'1','Sachisuko Clinic','36'),(339,6,'1','Sadziwa Clinic','37'),(340,6,'1','Sagambe Clinic','38'),(341,6,'1','Sahumani Clinic','39'),(342,6,'1','Sakupwanya Clinic','40'),(343,6,'1','Samanga Clinic','41'),(344,6,'1','Samaringa Clinic','42'),(345,6,'1','Zongoro Clinic','43'),(346,6,'1','Aberfoyle Tea Estate','61'),(347,6,'1','Chingamwe Clinic','62'),(348,6,'1','Eastern Highlands 1','63'),(349,6,'1','Eastern Highlands 5','64'),(350,6,'1','Haparari','65'),(351,6,'1','Forestry Clinic','66'),(352,6,'1','Katiyo Tea Estate','67'),(353,6,'1','Selbourne Clinic','68'),(354,6,'1','Drenane Clinic','69'),(355,6,'1','Imbeza Clinic','70'),(356,6,'1','Redwing Clinic','71'),(357,6,'1','Sheba Clinic','72'),(358,6,'1','Stapleford Clinic','73'),(359,6,'1','Eastern Highlands Pl Clinic','74'),(360,6,'1','Gatsi Clinic','91'),(361,6,'1','Honde Mission Clinic','92'),(362,6,'1','St.Augustines','93'),(363,6,'1','St.Peter\'s Mandeya','94'),(364,6,'1','Mapara','96'),(365,6,'1','Jombe','97'),(366,6,'1','Premier Central Clinic','98'),(367,7,'1','Dombo R.H.C.','02'),(368,7,'1','Fombe R.H.C.','03'),(369,7,'1','Gairezi R.H.C.','04'),(370,7,'1','Gotekote R.H.C.','05'),(371,7,'1','Nyarumvurwe R.H.C.','06'),(372,7,'1','Matize R.H.C.','07'),(373,7,'1','Nyamombe Camp R.H.C.','09'),(374,7,'1','Nyanga District Hosp','0A'),(375,7,'1','Avilla Hospital','0B'),(376,7,'1','Elim Hospital','0C'),(377,7,'1','Mt.Mellery Hospital','0D'),(378,7,'1','Regina Coeli Hospita','0E'),(379,7,'1','Nyautare R.H.C.','10'),(380,7,'1','Ruchera R.H.C.','11'),(381,7,'1','Chatindo Clinic','25'),(382,7,'1','Chiwarira Clinic','26'),(383,7,'1','Nyamaropa Clinic','27'),(384,7,'1','Kambudzi Clinic','29'),(385,7,'1','Nyatate Clinic','30'),(386,7,'1','Sabvure Clinic','31'),(387,7,'1','Tombo Clinic','32'),(388,7,'1','Mobile Clinic','45'),(389,7,'1','Nyangau Clinic','61'),(390,7,'1','Nyafaru Clinic','62'),(391,7,'1','Erim Forest Estate','63'),(392,7,'1','Nyangombe Clinic','91'),(393,7,'1','Claremont Estate Clinic','92'),(394,7,'1','Nyadowa Clinic','94'),(395,1,'2','Chiveso R.H.C.','01'),(396,1,'2','Muonwe R.H.C.','02'),(397,1,'2','Prison Clinic','03'),(398,1,'2','Bindura Polyclinic','04'),(399,1,'2','Z.R.P. Clinic','05'),(400,1,'2','Bindura Provincial','0A'),(401,1,'2','Musana Clinic','25'),(402,1,'2','Nyava Clinic','26'),(403,1,'2','Chiriseri Clinic','45'),(404,1,'2','Manhenga Clinic','46'),(405,1,'2','Rusununguko Clinic','61'),(406,1,'2','Chipadze Clinic','62'),(407,1,'2','Chiwaridzo Clinic','63'),(408,1,'2','Freda Rebecca','75'),(409,1,'2','Trojan Nickel Clinic','76'),(410,1,'2','Farm Health Scheme','77'),(411,1,'2','Foothills','78'),(412,1,'2','Busce Clinic','79'),(413,1,'2','Mupandira R H C','80'),(414,1,'2','ZNFPC Clinic','81'),(415,1,'2','Rutope Clinic','82'),(416,1,'2','Manga R H C','83'),(417,2,'2','Chawarura R.H.C.','01'),(418,2,'2','Hoya R.H.C.','02'),(419,2,'2','Machaya R.H.C.','03'),(420,2,'2','Muzarabani R.H.C.','04'),(421,2,'2','Chidikamwedzi Clinic','07'),(422,2,'2','Chinyani Clinic','08'),(423,2,'2','St.Albert\'s','0A'),(424,2,'2','Hwata Clinic','25'),(425,2,'2','Dambakurima Clinic','26'),(426,2,'2','David Nelson Clinic','45'),(427,2,'2','Farm Health Scheme','81'),(428,2,'2','Chadereka R.H.C','85'),(429,3,'2','Bvochora R.H.C.','01'),(430,3,'2','Masoka R.H.C','02'),(431,3,'2','Mashumbi Pools R.H.C','03'),(432,3,'2','Masomo R.H.C','04'),(433,3,'2','Negomo R.H.C.','05'),(434,3,'2','Nyamhondoro R.H.C.','06'),(435,3,'2','Shinje R.H.C.','07'),(436,3,'2','Mvirwi','0A'),(437,3,'2','Guruve','0B'),(438,3,'2','Chitsungo','0C'),(439,3,'2','Angwa R.H.C.','25'),(440,3,'2','Bakasa R.H.C.','26'),(441,3,'2','Bepura R.H.C','27'),(442,3,'2','Chapoto R.H.C.','28'),(443,3,'2','Chipuriro R.H.C.','29'),(444,3,'2','Gonono R.H.C.','30'),(445,3,'2','Kachuta R.H.C.','31'),(446,3,'2','Mahuwe R.H.C.','32'),(447,3,'2','Matsvitsi R.H.C.','33'),(448,3,'2','Gota R.H.C','34'),(449,3,'2','Musengezi R.H.C','35'),(450,3,'2','ZRP','36'),(451,3,'2','FHS','37'),(452,3,'2','Chikafa R.H.C','38'),(453,3,'2','Nyakapupu R.H.C','39'),(454,3,'2','Chirunya R.H.C','40'),(455,3,'2','Chidodo R.H.C','41'),(456,3,'2','Nyambudzi R.H.C','42'),(457,3,'2','Ruyamuro R.H.C','43'),(458,4,'2','Chinehasha R.H.C.','01'),(459,4,'2','Nyakudya R.H.C.','02'),(460,4,'2','Shutu R.H.C.','03'),(461,4,'2','Hatcliffe Extension Clinic','04'),(462,4,'2','Montgomery Clinic','05'),(463,4,'2','Donje Clinic','06'),(464,4,'2','Cranham Extension Clinic','07'),(465,4,'2','Adura Clinic','08'),(466,4,'2','Danbery Park Clinic','09'),(467,4,'2','Concession','0A'),(468,4,'2','Rosa','0B'),(469,4,'2','Howard','0C'),(470,4,'2','Mazowe Citrus','0D'),(471,4,'2','Mvurwi Hospital','0E'),(472,4,'2','Davaar Clinic','10'),(473,4,'2','Von Abo Clinic','11'),(474,4,'2','Bare Clinic','25'),(475,4,'2','Gunguwe Clinic','26'),(476,4,'2','Jingamvura Clinic','27'),(477,4,'2','Makope Clinic','28'),(478,4,'2','Mukodzongi Clinic','29'),(479,4,'2','Christon Bank Clinic','30'),(480,4,'2','Mvurwi Fhc','31'),(481,4,'2','Nzvimbo Clinic','32'),(482,4,'2','Belgownie Clinic','45'),(483,4,'2','Home Eden Clinic','46'),(484,4,'2','Tsungubvi Clinic','47'),(485,4,'2','Henderson Clinic','75'),(486,4,'2','Iron Duke Clinic','76'),(487,4,'2','Mazowe Mine Clinic','77'),(488,4,'2','Stories Clinic','78'),(489,4,'2','Hatcliffe','81'),(490,4,'2','Nemc','82'),(491,4,'2','Montgomery C.C','83'),(492,4,'2','Dambo Clinic','84'),(493,4,'2','Forrester Clinic','85'),(494,4,'2','Mazowe Secondary Clinic','86'),(495,5,'2','Dotito R.H.C.','01'),(496,5,'2','Kamutsenzere R.H.C.','02'),(497,5,'2','Mukumbura R.H.C.','03'),(498,5,'2','Nyamahobogo R.H.C.','04'),(499,5,'2','Pfunyangowu R.H.C.','05'),(500,5,'2','Tsakare R.H.C.','06'),(501,5,'2','Mutungagore Clinic','07'),(502,5,'2','Mutasa Clinic','08'),(503,5,'2','Chiburi Clinic','09'),(504,5,'2','Mt.Darwin','0A'),(505,5,'2','Karanda Hospital','0B'),(506,5,'2','Amanda Clinic','10'),(507,5,'2','Chahwanda R.H.C.','25'),(508,5,'2','Kaitano R.H.C.','26'),(509,5,'2','Nembire R.H.C.','27'),(510,5,'2','Pachanza Clinic','28'),(511,5,'2','Bveke Clinic','29'),(512,5,'2','ZRP Clinic','30'),(513,5,'2','ZPS Clinic','31'),(514,5,'2','Matope Clinic','32'),(515,5,'2','Bandimba R.H.C.','33'),(516,6,'2','Mukosa R.H.C.','01'),(517,6,'2','Mukonde R.H.C.','02'),(518,6,'2','Nhawa R.H.C.','03'),(519,6,'2','Rushinga R.H.C.','04'),(520,6,'2','Mazowe Camp','05'),(521,6,'2','Nyamatikiti Camp','06'),(522,6,'2','Chimandau R.H.C.','07'),(523,6,'2','Chimhanda Hospital','0A'),(524,6,'2','Mary Mount','0B'),(525,6,'2','Bungwe Clinic','25'),(526,6,'2','Rusambo Clinic','26'),(527,6,'2','Chimhanda Clinic','27'),(528,7,'2','Nyamaruro R.H.C.','01'),(529,7,'2','Chinduduma Primary','02'),(530,7,'2','Chishapa Clinic','03'),(531,7,'2','Goora R.H.C.','04'),(532,7,'2','Mupfurudzi R.H.C.','05'),(533,7,'2','Shamva District Hosp','0A'),(534,7,'2','Madziwa Rural Hospital','0B'),(535,7,'2','Wadzanai Clinic','12'),(536,7,'2','Bushu Clinic','25'),(537,7,'2','Chidembo Clinic','26'),(538,7,'2','Chihuri Clinic','27'),(539,7,'2','Mobile Clinic','45'),(540,7,'2','Madziwa Mine Clinic','75'),(541,7,'2','Shamwa Gold Mine','76'),(542,8,'2','Masoka R.H.C.','01'),(543,8,'2','Masomo R.H.C.','02'),(544,8,'2','Mushumbi R.H.C.','03'),(545,8,'2','Chitsungo Mission Hospital','0B'),(546,8,'2','Chapoto R.H.C.','20'),(547,8,'2','Angwa R.H.C.','21'),(548,8,'2','Chikafa R.H.C.','30'),(549,8,'2','Gonono R.H.C.','31'),(550,8,'2','Musengezi R.H.C.','32'),(551,8,'2','Mahuwe R.H.C.','33'),(552,8,'2','Chirunya R.H.C.','34'),(553,8,'2','Nyambudzi R.H.C.','35'),(554,8,'2','Chidodo R.H.C.','41'),(555,1,'3','Mufudziwakanaka R.H.C..','01'),(556,1,'3','Murezi R.H.C.','02'),(557,1,'3','Nyamhere R.H.C.','03'),(558,1,'3','Zvamatobwe R.H.C.','04'),(559,1,'3','Range R.H.C.','05'),(560,1,'3','Chivu Hospital','0A'),(561,1,'3','Nharira Hospital','0B'),(562,1,'3','Range Hospital','0C'),(563,1,'3','Sadza Hospital','0D'),(564,1,'3','Gandachibvuva Hospital','0E'),(565,1,'3','Bvumbura Clinic','25'),(566,1,'3','Gokomere Clinic','26'),(567,1,'3','Madamombe Clinic','27'),(568,1,'3','Manyene Clinic','28'),(569,1,'3','Masasa Clinic','29'),(570,1,'3','Mbiru Clinic','30'),(571,1,'3','Mushore Clinic','31'),(572,1,'3','Nhangembwe Clinic','32'),(573,1,'3','Pokoteke Clinic','33'),(574,1,'3','Rutanhira Clinic','34'),(575,1,'3','Shumba Clinic','35'),(576,1,'3','Unyetu Clinic','36'),(577,1,'3','Wazvaramhaka Clinic','37'),(578,1,'3','Chivu Clinic','45'),(579,1,'3','Gandami Clinic','46'),(580,1,'3','Lancshire Clinic','47'),(581,1,'3','Mutoro Clinic','48'),(582,1,'3','Wiltshire Clinic','49'),(583,1,'3','Daramombe Clinic','91'),(584,1,'3','Mwerahari Clinic','92'),(585,2,'3','Bosha R.H.C.','01'),(586,2,'3','Domboshava R.H.C.','02'),(587,2,'3','Mwanza R.H.C.','03'),(588,2,'3','Rusununguko Clinic','04'),(589,2,'3','Makumbe District Hospital','0A'),(590,2,'3','Ruwa Hospital','0C'),(591,2,'3','Chikwaka Hospital','0D'),(592,2,'3','Chinamhora Clinic','25'),(593,2,'3','Chinyika Clinic','26'),(594,2,'3','Kowowo Clinic','27'),(595,2,'3','Masukandoro Clinic','28'),(596,2,'3','Nyawure Clinic','29'),(597,2,'3','Pote Clinic','30'),(598,2,'3','Bromley Clinic','45'),(599,2,'3','Cranborne Clinic','46'),(600,2,'3','Henry John Rheimer Clinic','47'),(601,2,'3','Kubatsirana Clinic','48'),(602,2,'3','Rusike Clinic','49'),(603,2,'3','Ruwa Clinic','50'),(604,2,'3','Joan Rankini Clinic','51'),(605,2,'3','St Joseph Clinic','52'),(606,2,'3','Acturus Clinic','75'),(607,3,'3','Kafura R.H.C.','01'),(608,3,'3','Karimbika R.H.C.','02'),(609,3,'3','Sowa R.H.C.','03'),(610,3,'3','Marembera R.H.C.','04'),(611,3,'3','Mutawatawa District Hospital','0A'),(612,3,'3','Borera Clinic','25'),(613,3,'3','Chikuhwa Clinic','26'),(614,3,'3','Chipfunde Clinic','27'),(615,3,'3','Chitimbe Clinic','28'),(616,3,'3','Chitsungo Clinic','29'),(617,3,'3','Manyika Clinic','30'),(618,3,'3','Maramba Clinic','31'),(619,3,'3','Mashambanhaka Clinic','32'),(620,3,'3','Nhakiwa Clinic','33'),(621,3,'3','Nyakasoro Clinic','34'),(622,3,'3','Nyanzou Clinic','36'),(623,3,'3','Muskwe Clinic','37'),(624,3,'3','Dindi Clinic','91'),(625,4,'3','Garaba R.H.C.','01'),(626,4,'3','Goneso R.H.C.','02'),(627,4,'3','Goto R.H.C.','03'),(628,4,'3','Makanda R.H.C.','04'),(629,4,'3','Sengezi R.H.C.','05'),(630,4,'3','Hwedza Hospital','0A'),(631,4,'3','Mt. St.Mary\'s','0B'),(632,4,'3','Chigondo R.H.C.','25'),(633,4,'3','Masikana Clinic','26'),(634,4,'3','Mukamba R.H.C.','27'),(635,4,'3','Chikurumadziva Clinic','45'),(636,4,'3','Makarara Clinic','46'),(637,4,'3','Zviduri Clinic','47'),(638,5,'3','Border Church R.H.C.','01'),(639,5,'3','Chimbwanda R.H.C.','02'),(640,5,'3','Dimbiti R.H.C.','03'),(641,5,'3','Kushinga Pikelela','04'),(642,5,'3','Mudzimurema R.H.C.','05'),(643,5,'3','Winimbi R.H.C.','06'),(644,5,'3','Marondera Provincial Hospital','0A'),(645,5,'3','Chiota Hospital','0B'),(646,5,'3','Prisons Marondera','11'),(647,5,'3','Z.R.P. Clinic','12'),(648,5,'3','Masikana Clinic','25'),(649,5,'3','Marondera Rural Clinic','28'),(650,5,'3','Chipararwe Clinic','29'),(651,5,'3','Igava Clinic','45'),(652,5,'3','Marondera Clinic','46'),(653,5,'3','Dombotombo Clinic','61'),(654,5,'3','Nyameni Clinic','62'),(655,5,'3','Nyembanzvere Clinic','63'),(656,5,'3','Waddilove','86'),(657,5,'3','Rakodzi Clinic','88'),(658,6,'3','Chimukoko R.H.C.','01'),(659,6,'3','Chiunye R.H.C.','02'),(660,6,'3','Gozi R.H.C.','03'),(661,6,'3','Kondo R.H.C.','04'),(662,6,'3','Makaha R.H.C.','05'),(663,6,'3','Msarakufa R.H.C.','06'),(664,6,'3','Nyamanyoka R.H.C.','07'),(665,6,'3','Kotwa Hospital','0A'),(666,6,'3','St Pius Clinic','25'),(667,6,'3','Kapotese Clinic','26'),(668,6,'3','Kotwa Clinic','27'),(669,6,'3','Masenda Clinic','28'),(670,6,'3','Nyamapanda Clinic','29'),(671,6,'3','Nyamatawa Clinic','30'),(672,6,'3','Nyamukoho Clinic','31'),(673,6,'3','Shinga Clinic','32'),(674,6,'3','Suswe Clinic','33'),(675,6,'3','Chisvo Clinic','34'),(676,6,'3','Chikwizo Clinic','91'),(677,6,'3','Dendera Clinic','92'),(678,6,'3','Nyahuku Clinic','93'),(679,7,'3','Chitate R.H.C.','01'),(680,7,'3','Chitowa R.H.C.','02'),(681,7,'3','Jekwa R.H.C.','03'),(682,7,'3','Kadenge R.H.C.','04'),(683,7,'3','Madamombe R.H.C.','05'),(684,7,'3','Munamba R.H.C.','06'),(685,7,'3','Z.P.S Clinic','07'),(686,7,'3','ZRP Mrewa  clinic','08'),(687,7,'3','Murewa Hospital','0A'),(688,7,'3','St.Paul\'s Musami','0B'),(689,7,'3','Nhowe Mission Hospital','0C'),(690,7,'3','Murewa Polyclinic','22'),(691,7,'3','Chitowa 1 Clinic','23'),(692,7,'3','Chitowa 2 Clinic','24'),(693,7,'3','Dandara R.H.C.','25'),(694,7,'3','Dombwe R.H.C.','26'),(695,7,'3','Kadzere R.H.C.','27'),(696,7,'3','Nyamutumbu R.H.C.','28'),(697,7,'3','Shambamuto R.H.C.','29'),(698,7,'3','Craiglea Clinic','30'),(699,7,'3','Matututu Clinic','31'),(700,7,'3','Ngwerume clinic','32'),(701,7,'3','Macheke Clinic','45'),(702,7,'3','Virginia Clinic','46'),(703,7,'3','Waterloo Clinic','47'),(704,7,'3','Kambarami clinic','49'),(705,7,'3','Muchinjike clinic','50'),(706,7,'3','Nohoreka Clinic','71'),(707,7,'3','Goso clinic ','72'),(708,8,'3','Hoyuyu I R.H.C','01'),(709,8,'3','Hoyuyu Ii R.H.C.','02'),(710,8,'3','Kapondoro R.H.C.','03'),(711,8,'3','Katsukunya R.H.C.','04'),(712,8,'3','Kawere R.H.C.','05'),(713,8,'3','Mushimbo R.H.C.','06'),(714,8,'3','Nyamuzizi R.H.C.','07'),(715,8,'3','Nyadiri R.H.C.','08'),(716,8,'3','Kushimga R.H.C.','09'),(717,8,'3','Mutoko Hospital','0A'),(718,8,'3','Nyamuzuwe Hospital','0B'),(719,8,'3','Makosa Hospital','0C'),(720,8,'3','Nyadiri Mission Hospital','0D'),(721,8,'3','Luisa Guidotti','0E'),(722,8,'3','Nzira R.H.C.','10'),(723,8,'3','Mutoko Prison Clinic','11'),(724,8,'3','Epi Mobile','20'),(725,8,'3','ZNFPC Clinic','21'),(726,8,'3','Charehwa Clinic','25'),(727,8,'3','Matedza Clinic','26'),(728,8,'3','Mother Of Peace Clinic','27'),(729,8,'3','Mutemwa Leprosy Settl. Clinic','61'),(730,8,'3','Chindenga Clinic','91'),(731,8,'3','Kowo Clinic','98'),(732,8,'3','Kawazva Clinic','99'),(733,9,'3','Acton Reynolds R.H.C','01'),(734,9,'3','Zhakata R.H.C.','02'),(735,9,'3','ZRP Clinic','03'),(736,9,'3','Ringa Clinic','04'),(737,9,'3','Masasa R.H.C.','05'),(738,9,'3','Epi Unit','06'),(739,9,'3','Cbd Clinic','07'),(740,9,'3','Beatrice Rural Hospital','0A'),(741,9,'3','Kunaka Hospital','0B'),(742,9,'3','Charakupa Clinic','21'),(743,9,'3','Jonas Clinic','22'),(744,9,'3','Makanyazingwa Clinic','23'),(745,9,'3','Marirangwe Clinic','24'),(746,9,'3','Muda Clinic','25'),(747,9,'3','Epworth Polyclinic','26'),(748,9,'3','Christon Bank','45'),(749,9,'3','Arbor Acres Clinic','81'),(750,9,'3','Gilston Clinic','82'),(751,9,'3','Derbyshire Clinic','83'),(752,9,'3','Lanark Clinic','84'),(753,9,'3','Epworth Mission Clinic','90'),(754,1,'4','Chibero R.H.C.','01'),(755,1,'4','Gora R.H.C.','02'),(756,1,'4','Mbyuanehanda R.H.C.','03'),(757,1,'4','Monera R.H.C.','04'),(758,1,'4','Msengezi R.H.C.','05'),(759,1,'4','Musinami R.H.C.','06'),(760,1,'4','Chegutu Hospital','0A'),(761,1,'4','Mhondoro Hospital','0B'),(762,1,'4','Norton Selous Hospital','0C'),(763,1,'4','Chikara Clinic','25'),(764,1,'4','Chivero Clinic','26'),(765,1,'4','Mhondoro North Clin.','27'),(766,1,'4','Mupawose Clinic','28'),(767,1,'4','Rwizi Clinic','29'),(768,1,'4','Watyoka Clinic','30'),(769,1,'4','Chegutu Clinic','45'),(770,1,'4','Dombwe Clinic','46'),(771,1,'4','Kutanga-Utano Clinic','47'),(772,1,'4','Sandringham Clinic','48'),(773,1,'4','Selous Clinic','49'),(774,1,'4','David Whitehead','51'),(775,1,'4','Hunyani Pulp Clinic','52'),(776,1,'4','Pfupajena Munic Clinic','61'),(777,1,'4','Chinengundu Clinic','62'),(778,1,'4','Zmdc Clinic','76'),(779,1,'4','Lismore Clinic','77'),(780,1,'4','Homedale Clinic','78'),(781,1,'4','Mafuti Clinic','79'),(782,1,'4','Brunswick Clinic','80'),(783,1,'4','Dadle Hall','81'),(784,1,'4','CBDS','82'),(785,1,'4','Suri Suri Airbase Clinic','83'),(786,1,'4','Chegutu Hospital FCH','84'),(787,2,'4','Chirundu R.H.C.','01'),(788,2,'4','Chivende R.H.C.','02'),(789,2,'4','Marongora R.H.C.','04'),(790,2,'4','Masanga R.H.C.','05'),(791,2,'4','Zvipani R.H.C.','06'),(792,2,'4','Karoi Hospital','0A'),(793,2,'4','Hurungwe Hospital','0B'),(794,2,'4','Mwani Hospital','0C'),(795,2,'4','Chidamoyo Hospital','0D'),(796,2,'4','Chinhere Clinic','25'),(797,2,'4','Chundu Clinic','26'),(798,2,'4','Kasangarare Clinic','27'),(799,2,'4','Nyamakate Clinic','28'),(800,2,'4','Nyamhunga Clinic','29'),(801,2,'4','Helwin Clinic','45'),(802,2,'4','Hesketh Clinic','46'),(803,2,'4','Mashongwe Clinic','47'),(804,2,'4','Nyangoma Clinic','48'),(805,2,'4','Tengwe Clinic','49'),(806,2,'4','Karoi Static Clinic','61'),(807,2,'4','Lynx Clinic','75'),(808,2,'4','Kapfunde Clinic','91'),(809,2,'4','Karoi Hospital Mobile','92'),(810,2,'4','Hurungwe RCD Mobile','93'),(811,2,'4','Kasimure Clinic','94'),(812,2,'4','Dete','96'),(813,2,'4','Lanlory','97'),(814,2,'4','ZRP Clinic','98'),(815,2,'4','Doro','99'),(816,3,'4','Domboshava R.H.C.','02'),(817,3,'4','Donaine R.H.C.','03'),(818,3,'4','Geja R.H.C.','04'),(819,3,'4','Jompani R.H.C.','05'),(820,3,'4','Jondale Bunbe R.H.C.','06'),(821,3,'4','Kadoma Prison Clinic','07'),(822,3,'4','Muzvezve R.H.C.','08'),(823,3,'4','Nyabango R.H.C.','09'),(824,3,'4','Kadoma Hospital','0A'),(825,3,'4','Ngezi Hospital','0B'),(826,3,'4','Sanyati Hospital','0C'),(827,3,'4','St.Michael\'s Hospita','0D'),(828,3,'4','Battlefields Hospita','0E'),(829,3,'4','Rimuka Mch.','0F'),(830,3,'4','Nyamatani R.H.C.','10'),(831,3,'4','Vere R.H.C.','11'),(832,3,'4','Bururu Clinic','25'),(833,3,'4','Chirikiti Clinic','26'),(834,3,'4','Manyewe Clinic','27'),(835,3,'4','Murambwa Clinic','28'),(836,3,'4','Muwuyu Clinic','29'),(837,3,'4','Sanyati Clinic','30'),(838,3,'4','Associated Textile','31'),(839,3,'4','Chenjiri Clinic','45'),(840,3,'4','Ordolf Clinic','46'),(841,3,'4','Rubatsiro Clinic','47'),(842,3,'4','Turf Estate Clinic','48'),(843,3,'4','C.S.C. Satellite Clinic','52'),(844,3,'4','David Whitehead Cli.','53'),(845,3,'4','Kadoma Textiles Sat.','54'),(846,3,'4','Rimuka','61'),(847,3,'4','Waverly','62'),(848,3,'4','Ingezi','63'),(849,3,'4','Brompton Clinic','75'),(850,3,'4','Eiffel Flats Clinic','76'),(851,3,'4','Golden Valley Clinic','77'),(852,3,'4','Patchway Clinic','79'),(853,3,'4','Venice Clinic','80'),(854,3,'4','Jairos Jiri Clinic','81'),(855,3,'4','Population Services','83'),(856,3,'4','Mafindifindi','84'),(857,3,'4','Come Again Clinic','85'),(858,3,'4','Sanyati Outreach Cl','86'),(859,3,'4','Kadoma Outreach','88'),(860,3,'4','Chaigari Mine Clinic','89'),(861,4,'4','Gache-Gache R.H.C.','02'),(862,4,'4','Kanyati R.H.C.','03'),(863,4,'4','Mola Clinic','04'),(864,4,'4','Negande R.H.C.','05'),(865,4,'4','Kariba Hospital','0A'),(866,4,'4','Chalala Clinic','25'),(867,4,'4','Msampakaruwa Clinic','27'),(868,4,'4','Siyakobvu Clinic','28'),(869,4,'4','Nyamhunga','61'),(870,4,'4','Mahombekombe','62'),(871,5,'4','Chinhoyi Prison','01'),(872,5,'4','Chinhoyi Z.R.P.','02'),(873,5,'4','Chinhoyi (Teachers)','03'),(874,5,'4','Kamhonde R.H.C.','05'),(875,5,'4','Kenzamba R.H.C.','06'),(876,5,'4','Murereka R.H.C.','07'),(877,5,'4','Zumbara R.H.C.','08'),(878,5,'4','Chinhoyi Provincial Hospital','0A'),(879,5,'4','St.Rupert\'s Hospital','0B'),(880,5,'4','Alaska Mine Hospital','0C'),(881,5,'4','Mhangura Mine Hospital','0D'),(882,5,'4','Chinhoyi Prov Hosp Opd','0P'),(883,5,'4','Chinhoyi Prov Hosp Fch','0Q'),(884,5,'4','Hombwe Clinic','25'),(885,5,'4','Mukohwe Clinic','26'),(886,5,'4','Obva Clinic','27'),(887,5,'4','Doma Clinic','45'),(888,5,'4','Magog Farm Dispensar','46'),(889,5,'4','Matoranjera Clinic','47'),(890,5,'4','Umboe Clinic','48'),(891,5,'4','C.S.C.','51'),(892,5,'4','Chinoyi Clinic','61'),(893,5,'4','Chikonohono','62'),(894,5,'4','Alaska Clinic','75'),(895,5,'4','Damba Clinic','76'),(896,5,'4','Shacleton Clinic','77'),(897,6,'4','Chivhere R.H.C.','01'),(898,6,'4','Gwebi R.H.C.','02'),(899,6,'4','Banket Hospital Opd','0A'),(900,6,'4','Banket Hospital Mch','0B'),(901,6,'4','Darwendale Hospital','0C'),(902,6,'4','Raffingora Hospital','0D'),(903,6,'4','Father O\'hea','0E'),(904,6,'4','Mutorashanga Mine H.','0F'),(905,6,'4','Zvimba Hospital','0G'),(906,6,'4','Banket Outreach','0H'),(907,6,'4','Masiyarwa Clinic','25'),(908,6,'4','Chirau Clinic','26'),(909,6,'4','Jari Clinic','27'),(910,6,'4','Madzorera Clinic','28'),(911,6,'4','Mpumbu Clinic','29'),(912,6,'4','Ada Sisi Clinic','41'),(913,6,'4','Ayshire Clinic','42'),(914,6,'4','Kutama Clinic','43'),(915,6,'4','Kuwadzana Clinic','44'),(916,6,'4','Mt.Hampden Clinic','45'),(917,6,'4','Nyabira Clinic','46'),(918,6,'4','T.R.B. Clinic','47'),(919,6,'4','Trelawny Clinic','48'),(920,6,'4','Zowa Clinic','49'),(921,6,'4','Caesar Clinic','75'),(922,6,'4','Muriel Clinic','76'),(923,6,'4','Sutton Clinic','77'),(924,6,'4','Vanad Clinic','78'),(925,1,'5','Chunga R.H.C.','01'),(926,1,'5','Lubimbi R.H.C.','02'),(927,1,'5','Lusulu R.H.C.','03'),(928,1,'5','Muchesu R.H.C.','04'),(929,1,'5','Siansundu R.H.C.','05'),(930,1,'5','Chinego R.H.C.','08'),(931,1,'5','Binga Hospital','0A'),(932,1,'5','Siabuwa Hospital','0B'),(933,1,'5','Kariyangwe Hospital','0C'),(934,1,'5','Pashu Clinic','25'),(935,1,'5','Tinde Clinic','90'),(936,2,'5','Lukala R.H.C.','01'),(937,2,'5','Membeswana R.H.C.','02'),(938,2,'5','Inyathi Hospital','0A'),(939,2,'5','Siganda Clinic','26'),(940,2,'5','Balanda Clinic','27'),(941,2,'5','Majiji Clinic','28'),(942,2,'5','Isabella Clinic','56'),(943,3,'5','Chisuma R.H.C.','01'),(944,3,'5','Jambezi R.H.C.','02'),(945,3,'5','Kanyambizi R.H.C.','03'),(946,3,'5','Mwakandara R.H.C.','04'),(947,3,'5','Mwemba R.H.C.','05'),(948,3,'5','ZRP Victoria Falls Clinic','06'),(949,3,'5','Victoria Falls Hospital','0A'),(950,3,'5','Lukosi Hospital','0B'),(951,3,'5','Kamativi Tin Hospit.','0C'),(952,3,'5','Hwange Collery Hospital','0D'),(953,3,'5','Dete Clinic','26'),(954,3,'5','Dinde Clinic','27'),(955,3,'5','Lupote Clinic','30'),(956,3,'5','Main Camp Clinic','31'),(957,3,'5','Ndlovu Clinic','32'),(958,3,'5','Simangane Clinic','33'),(959,3,'5','Vic.Falls Clinic','34'),(960,3,'5','Mabale Clinic','35'),(961,3,'5','Robins Clinic','36'),(962,3,'5','St Patricks Hospital','37'),(963,3,'5','CBDS [ZNFPC]','39'),(964,3,'5','Hwange  Prison Clinic','53'),(965,3,'5','Hwange ZRP Clinic','55'),(966,3,'5','Zesa Dr  Stn Clinic','58'),(967,3,'5','Zesa Chibondo','59'),(968,3,'5','Zesa Inguminja Cli.','60'),(969,3,'5','Empumalanga','61'),(970,3,'5','Chinotimba','62'),(971,3,'5','Dete Clinic (Nrz)','81'),(972,3,'5','Ngumija Clinic (Nrz)','82'),(973,3,'5','N.R.Z. Surgery (Nrz)','83'),(974,3,'5','Lukunguni Clinic','91'),(975,4,'5','Dandanda R.H.C.','02'),(976,4,'5','Dongamuzi R.H.C.','03'),(977,4,'5','Gomoza R.H.C.','04'),(978,4,'5','Kanyandavu R.H.C.','05'),(979,4,'5','Lupane R.H.C.','06'),(980,4,'5','Lupaka Clinic','07'),(981,4,'5','Mobile A','08'),(982,4,'5','St.Paul\'s Hospital','0A'),(983,4,'5','St.Luke\'s Hospital','0B'),(984,4,'5','ZNFPC','10'),(985,4,'5','Jotsholo Clinic','26'),(986,4,'5','Mdlankuzi Clinic','27'),(987,4,'5','Fatima Mission','91'),(988,5,'5','Mateme R.H.C.','02'),(989,5,'5','Ngwaladi R.H.C.','03'),(990,5,'5','Sivalo R.H.C.','05'),(991,5,'5','Zenka R.H.C.','06'),(992,5,'5','Nkayi Hospital','0A'),(993,5,'5','Dakamela Hospital','0B'),(994,5,'5','Mbuma Hospital','0C'),(995,5,'5','Fanisoni Clinic','25'),(996,5,'5','Nesingwe Clinic','26'),(997,5,'5','Sebhumane Clinic','27'),(998,5,'5','Sikhobokhobo Clinic','28'),(999,5,'5','Zinyangeni Clinic','29'),(1000,5,'5','Nkayi Mobile','30'),(1001,5,'5','Mbuma Mobile','31'),(1002,5,'5','Guwe Clinic','32'),(1003,5,'5','Gwelutshena Clinic','33'),(1004,5,'5','Sesemba Clinic','34'),(1005,6,'5','Makhaza R.H.C.','03'),(1006,6,'5','Mlagisa R.H.C.','04'),(1007,6,'5','Mtshayeli R.H.C.','05'),(1008,6,'5','Sodaka R.H.C.','06'),(1009,6,'5','Tsholotsho Hospital','0A'),(1010,6,'5','Siphepha Hospital','0B'),(1011,6,'5','Phumula Hospital','0C'),(1012,6,'5','Bhubhudhe Clinic','25'),(1013,6,'5','Dlamini Clinic','26'),(1014,6,'5','Jimila Clinic','28'),(1015,6,'5','Madlangombe Clinic','29'),(1016,6,'5','Nkunzi Clinic','30'),(1017,6,'5','Tsholotsho Urban Clinic','31'),(1018,6,'5','Cbd [ZNFPC]','94'),(1019,6,'5','Kapane R.H.C.','96'),(1020,6,'5','Mpanedziba R.H.C.','97'),(1021,6,'5','Sikente R.H.C.','98'),(1022,7,'5','Igusi','03'),(1023,7,'5','Nyamandlovu Hospital','0A'),(1024,7,'5','Fingo','26'),(1025,7,'5','Ntabazinduna','29'),(1026,7,'5','Mbembesi','33'),(1027,7,'5','Clay Products','51'),(1028,7,'5','Fairbridge','52'),(1029,7,'5','Unicem','53'),(1030,7,'5','Imbizo Camp','65'),(1031,7,'5','T.G.Silundika','81'),(1032,7,'5','Ntabazinduna Zps Clinic','85'),(1033,7,'5','Ntabazinduna ZRP Clinic','88'),(1034,7,'5','St James Mission','91'),(1035,7,'5','Induna','97'),(1036,7,'5','Muntu Clinic','98'),(1037,7,'5','Khami Depend Clinic','99'),(1038,1,'6','Chikwalakwala R.H.C.','01'),(1039,1,'6','Chitulipasi R.H.C.','02'),(1040,1,'6','Dite R.H.C.','03'),(1041,1,'6','Majini R.H.C.','04'),(1042,1,'6','Prison Clinic','05'),(1043,1,'6','Shabwe R.H.C.','06'),(1044,1,'6','Z.N.A. Clinic','07'),(1045,1,'6','ZRP Clinic','08'),(1046,1,'6','Nottingham R.H.C.','09'),(1047,1,'6','Beitbridge Hospital','0A'),(1048,1,'6','Chasvingo Clinic','25'),(1049,1,'6','Dulibadzimu Clinic','26'),(1050,1,'6','Masera Clinic','27'),(1051,1,'6','Swereki R.H.C.','28'),(1052,1,'6','Shashe Clinic','29'),(1053,1,'6','Tongwe Clinic','30'),(1054,1,'6','Zezani Clinic','31'),(1055,1,'6','Makakabule Clinic','76'),(1056,1,'6','Chamnangana Clinic','77'),(1057,1,'6','N.R.Z Clinic','81'),(1058,2,'6','Village 13 R.H.C','01'),(1059,2,'6','Huwana R.H.C.','02'),(1060,2,'6','Makhulela R.H.C.','04'),(1061,2,'6','Matjinge R.H.C.','06'),(1062,2,'6','Nswazwi R.H.C','08'),(1063,2,'6','Lady Barring Hospita','0B'),(1064,2,'6','Lady Stanley Hospita','0C'),(1065,2,'6','Hingwe R.H.C','20'),(1066,2,'6','Bombodema Clinic','25'),(1067,2,'6','Madlambudzi Clinic','28'),(1068,2,'6','Ndiweni Clinic','30'),(1069,2,'6','Sikhathini Clinic','31'),(1070,2,'6','Solusi Clinic','91'),(1071,3,'6','Gungwe R.H.C.','01'),(1072,3,'6','Magwe R.H.C.','02'),(1073,3,'6','Nhwali R.H.C.','03'),(1074,3,'6','Prison Clinic','04'),(1075,3,'6','Simbumbumbu Clinic','05'),(1076,3,'6','Stainmore R.H.C.','06'),(1077,3,'6','Z.R.P. Clinic','07'),(1078,3,'6','Z.N.A. Clinic','08'),(1079,3,'6','ZNFPC','09'),(1080,3,'6','Gwanda Provincial Hospital','0A'),(1081,3,'6','Manama Hospital','0B'),(1082,3,'6','Mtshabezi Hospital','0C'),(1083,3,'6','Buvuma Clinic','25'),(1084,3,'6','Kafusi Clinic','26'),(1085,3,'6','Mashaba Clinic','27'),(1086,3,'6','Mzimuni Clinic','28'),(1087,3,'6','Ntalale Clinic','29'),(1088,3,'6','Sengezane Clinic','30'),(1089,3,'6','Phakama Clinic','62'),(1090,3,'6','Selonga Clinic','63'),(1091,3,'6','Blanket Clinic','76'),(1092,3,'6','Colleen-Bawn Clinic','77'),(1093,3,'6','Freda Clinic','78'),(1094,3,'6','Jessie Clinic','79'),(1095,3,'6','Vumbachikwe Clinic','80'),(1096,3,'6','J.Z.Moyo Clinic','81'),(1097,3,'6','Zimcan Clinic','82'),(1098,3,'6','Jm Polytech Clinic','83'),(1099,4,'6','Gwatemba R.H.C.','02'),(1100,4,'6','Insiza R.H.C.','03'),(1101,4,'6','Mabuze R.H.C.','04'),(1102,4,'6','Nkankezi R.H.C.','05'),(1103,4,'6','Nyamime R.H.C.','06'),(1104,4,'6','Sanale R.H.C.','07'),(1105,4,'6','Filabusi Hospital','0A'),(1106,4,'6','Shangani Hospital','0B'),(1107,4,'6','Avoca Hospital','0C'),(1108,4,'6','Wanezi Hospital','0D'),(1109,4,'6','Singwango Clinic','25'),(1110,4,'6','Zhulube Clinic','26'),(1111,4,'6','Singwambizi Clinic','27'),(1112,4,'6','Kombo Health Post','28'),(1113,4,'6','Epoch Clinic','76'),(1114,4,'6','Shangani Clinic','77'),(1115,5,'6','Natisa R.H.C.','01'),(1116,5,'6','Sankonjane R.H.C.','02'),(1117,5,'6','Homestead R.H.C.','03'),(1118,5,'6','Beula-Seula R.H.C.','04'),(1119,5,'6','Ekukhanyeni R.H.C.','05'),(1120,5,'6','Maphisa Hospital','0A'),(1121,5,'6','Kezi Hospital','0B'),(1122,5,'6','Matopo Hospital','0C'),(1123,5,'6','Tshelanyemba Hospital','0D'),(1124,5,'6','St.Joseph\'s Hospital','0E'),(1125,5,'6','Mbembeswane R.H.C.','25'),(1126,5,'6','Boomerange Health Post','27'),(1127,5,'6','Gulati Clinic','81'),(1128,5,'6','Matopo Clinic','91'),(1129,5,'6','Bazha Clinic','92'),(1130,5,'6','Masiye Camp Health Post','93'),(1131,6,'6','Kumbudzi R.H.C.','01'),(1132,6,'6','Mbizingwe R.H.C.','02'),(1133,6,'6','Z.N.A. Clinic','03'),(1134,6,'6','Esigodini Hospital','0A'),(1135,6,'6','Epi Mobile','20'),(1136,6,'6','Esibomvu Clinic','25'),(1137,6,'6','Habane Clinic','26'),(1138,6,'6','Mawabeni Clinic','27'),(1139,6,'6','Mhlalandlela Clinic','28'),(1140,6,'6','Nhlangano Clinic','29'),(1141,6,'6','Nswazi Clinic','30'),(1142,6,'6','Ntshamathe Clinic','31'),(1143,6,'6','Irrisvale Clinic','32'),(1144,6,'6','Mpisini Health Post','33'),(1145,6,'6','How Mine Clinic','76'),(1146,6,'6','Agriculture Inst.','81'),(1147,6,'6','ZNFPC','85'),(1148,7,'6','Ingwizi R.H.C','03'),(1149,7,'6','Marula Clinic','05'),(1150,7,'6','Mayobodo R.H.C','07'),(1151,7,'6','Bango R.H.C','09'),(1152,7,'6','Plumtree Hospital','0A'),(1153,7,'6','St Annes Mission Hosp Brunapeg','0D'),(1154,7,'6','Embakwe Mission Hosp','0E'),(1155,7,'6','Madabe Clinic','27'),(1156,7,'6','Mambale Clinic','29'),(1157,7,'6','Tshitshi Clinic','32'),(1158,7,'6','Sanzukwi Clinic','33'),(1159,7,'6','Dingumuzi Clinic','45'),(1160,7,'6','Empandeni Clinic','92'),(1161,7,'6','Plumtree Prison Clinic','93'),(1162,1,'7','Chizhou Clinic','01'),(1163,1,'7','Denhere Clinic','02'),(1164,1,'7','Lynwood Clinic','03'),(1165,1,'7','Nyautonge R.H.C.','04'),(1166,1,'7','Nyikavanhu Clinic','05'),(1167,1,'7','Mvuma Hospital','0A'),(1168,1,'7','Chilimanzi Hospital','0B'),(1169,1,'7','Driemfontein Hospita','0C'),(1170,1,'7','Holy Cross Hospital','0D'),(1171,1,'7','Muvonde Hospital','0E'),(1172,1,'7','St.Theressa Hospital','0F'),(1173,1,'7','Chengwena Clinic','25'),(1174,1,'7','Hama Clinic','26'),(1175,1,'7','Siyahokwe Clinic','27'),(1176,1,'7','Lalapanzi Clinic','45'),(1177,1,'7','Zamasco Clinic','51'),(1178,1,'7','Peak Mine Clinic','78'),(1179,1,'7','Athens Clinic','81'),(1180,1,'7','Mtao Forest Clinic','82'),(1181,1,'7','Central Estates Clinic','86'),(1182,2,'7','Gwanyika R.H.C.','01'),(1183,2,'7','Kadzidirire R.H.C.','02'),(1184,2,'7','Madzivazvido R.H.C.','03'),(1185,2,'7','Musadzi R.H.C.','04'),(1186,2,'7','Mashame R.H.C.','05'),(1187,2,'7','Mateta R.H.C.','06'),(1188,2,'7','Norah R.H.C.','07'),(1189,2,'7','Nyaje R.H.C.','08'),(1190,2,'7','Simchembu R.H.C.','09'),(1191,2,'7','Gokwe Hospital','0A'),(1192,2,'7','Chireya Hospital','0B'),(1193,2,'7','Kana Hospital','0C'),(1194,2,'7','Mutora Hospital','0D'),(1195,2,'7','Tsungai R.H.C.','10'),(1196,2,'7','Svisvi Clinic','11'),(1197,2,'7','Zhamba Clinic','12'),(1198,2,'7','Cheziya Clinic','13'),(1199,2,'7','To Phone','14'),(1200,2,'7','ZRP Camp Clinic','15'),(1201,2,'7','Chitave Clinic','16'),(1202,2,'7','Mateme Sda Clinic','17'),(1203,2,'7','Jahana Clinic','19'),(1204,2,'7','Vumba Clinic','20'),(1205,2,'7','Population Services Clinic','24'),(1206,2,'7','Chemahororo Clinic','25'),(1207,2,'7','Gawa Clinic','26'),(1208,2,'7','Gumunyu Clinic','27'),(1209,2,'7','Jiri/Ndoza Clinic','28'),(1210,2,'7','Kahobo Clinic','29'),(1211,2,'7','Krima Clinic','30'),(1212,2,'7','Kuwirirana Clinic','31'),(1213,2,'7','Mangidi Clinic','32'),(1214,2,'7','Manoti Clinic','33'),(1215,2,'7','Masuka Clinic','34'),(1216,2,'7','Msala Clinic','35'),(1217,2,'7','Musita Clinic','36'),(1218,2,'7','Nyamhunga Clinic','37'),(1219,2,'7','Sai Clinic','38'),(1220,2,'7','Tongwe Clinic','39'),(1221,2,'7','Zhomba Clinic','40'),(1222,2,'7','Mokoka Clinic','41'),(1223,2,'7','Denda Clinic','91'),(1224,2,'7','Goredema Clinic','92'),(1225,2,'7','Manyoni Clinic','93'),(1226,2,'7','Mtanke Clinic','94'),(1227,2,'7','Nenyunga Clinic','95'),(1228,2,'7','Sessami Clinic','96'),(1229,2,'7','Huchu Clinic','97'),(1230,2,'7','Rubatsiro Clinic','98'),(1231,3,'7','Gunde R.H.C.','01'),(1232,3,'7','Kabanga R.H.C.','02'),(1233,3,'7','Mangwandi R.H.C.','03'),(1234,3,'7','Masvori R.H.C.','04'),(1235,3,'7','Nkululeko R.H.C.','05'),(1236,3,'7','Ntabamhlope R.H.C.','06'),(1237,3,'7','Midlands State University','07'),(1238,3,'7','Mkoba Teachers Coll.','08'),(1239,3,'7','Five Maint.','09'),(1240,3,'7','Gweru Provincial H.','0A'),(1241,3,'7','Birchenough Hospital','0B'),(1242,3,'7','Chikwingwizha Hospital','0C'),(1243,3,'7','Infectious Diseases','0D'),(1244,3,'7','Guinea Fowl','0E'),(1245,3,'7','Thornhill Hospital','0F'),(1246,3,'7','Gweru Urban','0U'),(1247,3,'7','Zim.Military Academy','12'),(1248,3,'7','Connemara (Justice)','13'),(1249,3,'7','Whawha (Justice)','14'),(1250,3,'7','Fletcher High School','15'),(1251,3,'7','Z.R.P. Clinic','16'),(1252,3,'7','Outreach ','20'),(1253,3,'7','Vungu Rdc Clinic','21'),(1254,3,'7','Chiwundura Clinic','25'),(1255,3,'7','Maboleni Clinic','26'),(1256,3,'7','Madikani Clinic','27'),(1257,3,'7','Makepesi Clinic','28'),(1258,3,'7','Somabhula Clinic','45'),(1259,3,'7','Vungu Clinic','46'),(1260,3,'7','Nyama','47'),(1261,3,'7','V.D.R.C.  Mobile','48'),(1262,3,'7','Bata Clinic','51'),(1263,3,'7','C.S.C.','52'),(1264,3,'7','Dairy Market. Board','53'),(1265,3,'7','Zimasco Clinic','54'),(1266,3,'7','Zimbabwe Castings','56'),(1267,3,'7','Zimglass','57'),(1268,3,'7','Mkoba 1','62'),(1269,3,'7','Mkoba Polyclinic','63'),(1270,3,'7','Monomutapa','64'),(1271,3,'7','Medical Centre','65'),(1272,3,'7','Ivene','66'),(1273,3,'7','Senga','67'),(1274,3,'7','Totonga','68'),(1275,3,'7','Claybank (Ch.Welf.)','69'),(1276,3,'7','Dabuka Clinic (Nrz)','81'),(1277,3,'7','Kariba Clinic','82'),(1278,3,'7','Lalapanzi Clinic','83'),(1279,3,'7','Netherburn','84'),(1280,3,'7','Railways (Nrz)','85'),(1281,3,'7','Lower Gweru Clinic','91'),(1282,3,'7','St.Patrick\'s Clinic','92'),(1283,4,'7','Dendera R.H.C.','01'),(1284,4,'7','Donza R.H.C.','02'),(1285,4,'7','Mazebe R.H.C.','03'),(1286,4,'7','Msilahobe R.H.C.','04'),(1287,4,'7','Nyoni R.H.C.','05'),(1288,4,'7','Mayoka','09'),(1289,4,'7','Kwekwe Hospital','0A'),(1290,4,'7','Silobela Hospital','0B'),(1291,4,'7','Zhombe Hospital','0C'),(1292,4,'7','Torwood Hospital','0D'),(1293,4,'7','Kwekwe Urban','0U'),(1294,4,'7','Epi Team','20'),(1295,4,'7','Donjuan Clinic','25'),(1296,4,'7','Exchange Clinic','26'),(1297,4,'7','Malisa Joshepha Cli.','27'),(1298,4,'7','Malisa Zhombe Clinic','28'),(1299,4,'7','Ntabeni Clinic','29'),(1300,4,'7','Samambwa Clinic','30'),(1301,4,'7','Senkwasi Clinic','31'),(1302,4,'7','Sidakeni Clinic','32'),(1303,4,'7','Silobela Clinic','33'),(1304,4,'7','Simana Clinic','34'),(1305,4,'7','Globe And Phoenix','51'),(1306,4,'7','Rio Tinto Clinic','52'),(1307,4,'7','Mlezu Clinic','53'),(1308,4,'7','Torwood Clinic','54'),(1309,4,'7','Torsteel Clinic','55'),(1310,4,'7','Zimasco Clinic','56'),(1311,4,'7','Zrdc Clinic','57'),(1312,4,'7','Zisco Works Clinic','58'),(1313,4,'7','Redcliff','59'),(1314,4,'7','Amaveni','61'),(1315,4,'7','Mbizo A','62'),(1316,4,'7','Mbizo B','63'),(1317,4,'7','Rutendo','64'),(1318,4,'7','Sebakwe','65'),(1319,4,'7','Sherwood','66'),(1320,4,'7','Community Polyclinic','76'),(1321,4,'7','Jena Mines Clinic','77'),(1322,4,'7','Gaika Clinic','81'),(1323,4,'7','Medical Centre','83'),(1324,4,'7','Tiger Reef Clinic','84'),(1325,4,'7','Munyati Clinic','85'),(1326,4,'7','Al Davies Clinic','86'),(1327,4,'7','Z.R.P. Clinic','87'),(1328,4,'7','Gomora Clinic','88'),(1329,5,'7','Gwarawa R.H.C.','01'),(1330,5,'7','Mataga R.H.C.','02'),(1331,5,'7','Mavorovondo R.H.C.','03'),(1332,5,'7','Murongwe R.H.C.','04'),(1333,5,'7','Mwanezi R.H.C.','05'),(1334,5,'7','Vurasha R.H.C.','06'),(1335,5,'7','Wanezi  R.H.C.','07'),(1336,5,'7','Kotokwe R.H.C.','08'),(1337,5,'7','Mberengwa Hospital','0A'),(1338,5,'7','Jeka Hospital','0B'),(1339,5,'7','Masase Hospital','0C'),(1340,5,'7','Mnene Hospital','0D'),(1341,5,'7','Musume Hospital','0E'),(1342,5,'7','Bonda Clinic','25'),(1343,5,'7','Chabwira Clinic','26'),(1344,5,'7','Chidembeko Clinic','27'),(1345,5,'7','Chingezi Clinic','28'),(1346,5,'7','Makuwerere Clinic','29'),(1347,5,'7','Matedzi Clinic','30'),(1348,5,'7','Mazivofa Clinic','31'),(1349,5,'7','Mbahuru Clinic','32'),(1350,5,'7','Mketi Clinic','33'),(1351,5,'7','Negove Clinic','34'),(1352,5,'7','Ngezi Clinic','35'),(1353,5,'7','Ngungumbane Clinic','36'),(1354,5,'7','Svita Clinic','37'),(1355,5,'7','Mponjani Clinic','38'),(1356,5,'7','Mposi Clinic','39'),(1357,5,'7','Chiedza Clinic','40'),(1358,5,'7','Vutsanana Clinic','41'),(1359,5,'7','Buchwa Mine Clinic','76'),(1360,5,'7','C.Mine Clinic','77'),(1361,5,'7','Sandawana Clinic','78'),(1362,5,'7','Buchwa Camp Clinic','79'),(1363,5,'7','Mnene Outreach','86'),(1364,6,'7','Chikato R.H.C.','01'),(1365,6,'7','Chironde R.H.C.','02'),(1366,6,'7','Chitora R.H.C.','03'),(1367,6,'7','Gwanza R.H.C.','04'),(1368,6,'7','Marishongwe R.H.C.','05'),(1369,6,'7','Rusike R.H.C.','06'),(1370,6,'7','Tana R.H.C.','07'),(1371,6,'7','Zvarota R.H.C.','08'),(1372,6,'7','Svika R.H.C.','09'),(1373,6,'7','Shurugwi Hospital','0A'),(1374,6,'7','Zvamabande Hospital','0B'),(1375,6,'7','Chrome Mine Hospital','0C'),(1376,6,'7','Banga Clinic','25'),(1377,6,'7','Gundura Clinic','26'),(1378,6,'7','Mazibisa Clinic','27'),(1379,6,'7','Nhema Clinic','28'),(1380,6,'7','Tongogara Clinic','29'),(1381,6,'7','Jobolinko Clinic','45'),(1382,6,'7','Makusha Clinic','46'),(1383,6,'7','Rockford Clinic','47'),(1384,6,'7','Tokwe Clinic','48'),(1385,6,'7','Iron Mine Clinic','77'),(1386,6,'7','Peak Mine Clinic','78'),(1387,6,'7','Quarry Gold Mine','79'),(1388,6,'7','Hanke Clinic','91'),(1389,6,'7','Pakame Clinic','92'),(1390,7,'7','Maketo R.H.C.','01'),(1391,7,'7','Mandava R.H.C.','02'),(1392,7,'7','Matenda R.H.C.','03'),(1393,7,'7','Vugwi R.H.C.','04'),(1394,7,'7','Vukuzenzele R.H.C.','05'),(1395,7,'7','Zvishavane Hospital','0A'),(1396,7,'7','Lundi Hospital','0B'),(1397,7,'7','Shabane Mine Hospital','0C'),(1398,7,'7','Epi Mobile','20'),(1399,7,'7','Gudo Clinic','25'),(1400,7,'7','Mabasa Clinic','26'),(1401,7,'7','Mapanzure Clinic','27'),(1402,7,'7','Mrowa Clinic','28'),(1403,7,'7','Mtambi Clinic','29'),(1404,7,'7','Runde Mobile','32'),(1405,7,'7','Sabi Mine Clinic','76'),(1406,7,'7','Mimosa','77'),(1407,7,'7','Medical Centre','78'),(1408,7,'7','Zvishavane Prison','80'),(1409,7,'7','Bannockburn Clinic','81'),(1410,7,'7','Family Planning','82'),(1411,7,'7','Kandodo Clinic','83'),(1412,7,'7','Maglass Clinic','84'),(1413,7,'7','ZRP Clinic','85'),(1414,7,'7','Zvishavane Polyclinic','86'),(1415,8,'7','Gokwe Hosp','0A'),(1416,1,'8','Chirorwe R.H.C.','01'),(1417,1,'8','Dewure I R.H.C.','02'),(1418,1,'8','Dewure Ii R.H.C.','03'),(1419,1,'8','Mukanga R.H.C.','04'),(1420,1,'8','Mukore R.H.C.','05'),(1421,1,'8','Nyika R.H.C.','06'),(1422,1,'8','Ngorima R.H.C.','07'),(1423,1,'8','Bikita Rural Hospital','0A'),(1424,1,'8','Chikuku Rural Hospital','0B'),(1425,1,'8','Mashoko Hospital','0C'),(1426,1,'8','Silveira Hospital','0D'),(1427,1,'8','Bikita Epi Mobile','20'),(1428,1,'8','Chitasa Clinic','25'),(1429,1,'8','Hozvi Clinic','26'),(1430,1,'8','Mandara Clinic','27'),(1431,1,'8','Marozva Clinic','28'),(1432,1,'8','Odzi Clinic','29'),(1433,1,'8','Negovani Clinic','30'),(1434,1,'8','Murwira Clinic','31'),(1435,1,'8','Mungezi R.H.C.','32'),(1436,1,'8','Mutikizizi R.H.C.','33'),(1437,1,'8','Gangare R.H.C.','34'),(1438,1,'8','Gava R.H.C.','35'),(1439,1,'8','Bikita Minerals Clinic','76'),(1440,2,'8','Chambuta Clinic','01'),(1441,2,'8','Chilonga R.H.C.','02'),(1442,2,'8','Chizvirizvi R.H.C.','04'),(1443,2,'8','Dzavata R.H.C.','05'),(1444,2,'8','Gezani R.H.C.','06'),(1445,2,'8','Malipati R.H.C.','07'),(1446,2,'8','Mhlanguleni R.H.C.','08'),(1447,2,'8','Muteyo R.H.C.','09'),(1448,2,'8','Chiredzi Hospital','0A'),(1449,2,'8','Chikombedzi Hospital','0B'),(1450,2,'8','Hippo Valley Hospital','0C'),(1451,2,'8','Triangle Hospital','0D'),(1452,2,'8','Nyambange R.H.C.','10'),(1453,2,'8','Old Boli R.H.C.','12'),(1454,2,'8','Samu R.H.C.','13'),(1455,2,'8','Pahlela Clinic','14'),(1456,2,'8','Chiredzi Prison Clinic','17'),(1457,2,'8','Z.R.P.','18'),(1458,2,'8','Chiredzi Epi Mobile','20'),(1459,2,'8','Chibvedziva Clinic','25'),(1460,2,'8','Chipiwa Clinic','26'),(1461,2,'8','St.Joseph Clinic','27'),(1462,2,'8','Dumisa Clinic','28'),(1463,2,'8','Porepore Clinic','29'),(1464,2,'8','Rupangwana Clinic','30'),(1465,2,'8','Rutandare Clinic','31'),(1466,2,'8','Chitsa Ii Clinic','32'),(1467,2,'8','Tsovani Clinic','33'),(1468,2,'8','Makambe Clinic','34'),(1469,2,'8','Mkwasine Clinic','82'),(1470,2,'8','Z.S.A.','84'),(1471,2,'8','N.R.Z.','85'),(1472,2,'8','Damarakanaka Clinic','91'),(1473,2,'8','Chingele Clinic','92'),(1474,3,'8','Chigwikwi R.H.C.','02'),(1475,3,'8','Mandamabwe R.H.C.','03'),(1476,3,'8','Ngundu R.H.C.','04'),(1477,3,'8','Razi R.H.C.','05'),(1478,3,'8','Takavarasha R.H.C.','07'),(1479,3,'8','Nyahombe R.H.C.','08'),(1480,3,'8','Chivi District Hospital','0A'),(1481,3,'8','Chivi Rural Hospital','0B'),(1482,3,'8','Berejena Mission Hospital','0C'),(1483,3,'8','Chifedza Clinic','25'),(1484,3,'8','Davira Clinic','26'),(1485,3,'8','Madamombe Clinic','27'),(1486,3,'8','Shindi Satellite Cl','28'),(1487,4,'8','Mushaviri R.H.C.','01'),(1488,4,'8','Majada R.H.C.','02'),(1489,4,'8','Matizha R.H.C.','03'),(1490,4,'8','Mutema R.H.C.','04'),(1491,4,'8','Nemashakwe R.H.C.','05'),(1492,4,'8','Soti Source R.H.C.','06'),(1493,4,'8','Chitando R.H.C.','08'),(1494,4,'8','Zvavahera R.H.C.','09'),(1495,4,'8','Gutu Rural Hospital','0A'),(1496,4,'8','Chimombe Rural Hosp','0B'),(1497,4,'8','Chinyika Hospital','0D'),(1498,4,'8','Gutu Mission Hospital','0E'),(1499,4,'8','Cheshuro Clinic','25'),(1500,4,'8','Denhere Clinic','26'),(1501,4,'8','Dewure Clinic','27'),(1502,4,'8','Magombedze Clinic','28'),(1503,4,'8','Mazuru Clinic','29'),(1504,4,'8','Munyikwa Clinic','30'),(1505,4,'8','Nyazvidzi Clinic','31'),(1506,4,'8','Zinhata Clinic','32'),(1507,4,'8','Tirizi Satellite Cl','33'),(1508,4,'8','Chiwore R.H.C.','34'),(1509,4,'8','Magombedze Chitsa Clinic','35'),(1510,4,'8','Chipiri','36'),(1511,4,'8','Dambaro','37'),(1512,4,'8','Matomuse','38'),(1513,4,'8','Population Health Clinic','76'),(1514,4,'8','Serima Clinic','91'),(1515,4,'8','Mutero R.H.C.','92'),(1516,4,'8','Mukaro Mission Clinic','93'),(1517,5,'8','Alvord R.H.C.','01'),(1518,5,'8','Mukosi R.H.C.','02'),(1519,5,'8','Mushandike R.H.C.','03'),(1520,5,'8','Musvovi R.H.C.','04'),(1521,5,'8','Mutimurefu R.H.C.','05'),(1522,5,'8','Nemamwa R.H.C.','06'),(1523,5,'8','Nyikavanhu R.H.C.','07'),(1524,5,'8','Z.R.P. Clinic','08'),(1525,5,'8','41.Brigade Clinic','09'),(1526,5,'8','Masvingo Provincial','0A'),(1527,5,'8','Ngomahura Psy.Hospital','0B'),(1528,5,'8','Nyajena Rural Hospital','0C'),(1529,5,'8','Morgenster Mission','0D'),(1530,5,'8','Gokomere Mission Cl','0E'),(1531,5,'8','Gaths Mine Hospital','0F'),(1532,5,'8','Masv.Teach.Coll.Clinic','10'),(1533,5,'8','Masvingo Tech College Clinic','11'),(1534,5,'8','Sommerton R.H.C.','12'),(1535,5,'8','Masvingo Epi Mobile','20'),(1536,5,'8','Chakumbira Clinic','25'),(1537,5,'8','Chatikobo Clinic','26'),(1538,5,'8','Gundura Clinic','27'),(1539,5,'8','Mapanzure Clinic','28'),(1540,5,'8','Masvingo Prison  Clinic','29'),(1541,5,'8','Bere Clinic','30'),(1542,5,'8','Murinye Clinic','31'),(1543,5,'8','Rukovo Clinic','32'),(1544,5,'8','Shumba Clinic','33'),(1545,5,'8','Zimuto B.C. Clinic','34'),(1546,5,'8','Mucheke Clinic','35'),(1547,5,'8','Zano Clinic','36'),(1548,5,'8','Guwa R.H.C.','40'),(1549,5,'8','Gurajena R.H.C.','41'),(1550,5,'8','Stanmore R.H.C.','42'),(1551,5,'8','Zvamahonde','43'),(1552,5,'8','Ngomahuru R.H.C.','44'),(1553,5,'8','Renco Mine Clinic','76'),(1554,5,'8','Lennox Mine Clinic','77'),(1555,5,'8','Mazorodze Clinic','81'),(1556,5,'8','Rujeko Clinic','82'),(1557,5,'8','Runyararo Clinic','83'),(1558,5,'8','Bondolfi Clinic','91'),(1559,5,'8','Shonganiso Clinic','92'),(1560,5,'8','Zimuto Mission Clinic','93'),(1561,5,'8','Masv.Mission Mobile','95'),(1562,6,'8','Chimbudzi R.H.C.','01'),(1563,6,'8','Chirindi R.H.C.','02'),(1564,6,'8','Chizumba R.H.C.','03'),(1565,6,'8','Maranda Sub R.H.C.','04'),(1566,6,'8','Nehanda R.H.C.','05'),(1567,6,'8','Rutenga Clinic','06'),(1568,6,'8','Neshuro Diistrict Hospital','0A'),(1569,6,'8','Matibi Mission Hosp','0B'),(1570,6,'8','Mwenezi Epi Mobile','20'),(1571,6,'8','Mazetese Clinic','25'),(1572,6,'8','Mushava Clinic','27'),(1573,6,'8','Mwenezi Clinic','28'),(1574,6,'8','Murove Clinic','29'),(1575,6,'8','Mlelezi Clinic','30'),(1576,6,'8','Boterere Clinic','31'),(1577,6,'8','Rutenga Clinic','81'),(1578,6,'8','M.D.C. Clinic','82'),(1579,6,'8','Maranda Clinic','91'),(1580,6,'8','Lundi Clinic','92'),(1581,7,'8','Chipinda R.H.C.','01'),(1582,7,'8','Harava R.H.C.','02'),(1583,7,'8','Nemauku R.H.C.','03'),(1584,7,'8','Svuure R.H.C.','04'),(1585,7,'8','Zibwowa R.H.C.','05'),(1586,7,'8','Ndanga Hospital','0A'),(1587,7,'8','Musiso Hospital','0C'),(1588,7,'8','Zaka Epi Mobile','20'),(1589,7,'8','Bota Clinic','25'),(1590,7,'8','Bvukururu Clinic','26'),(1591,7,'8','Chinyabako Clinic','27'),(1592,7,'8','Chiredzana Clinic','29'),(1593,7,'8','Fube Clinic','30'),(1594,7,'8','Jichidza Clinic','32'),(1595,7,'8','Mushaya Clinic','33'),(1596,7,'8','Ndanga Clinic','34'),(1597,7,'8','Nhema Clinic','35'),(1598,7,'8','Nyakunhuwa Clinic','36'),(1599,7,'8','Siyawareva Clinic','37'),(1600,7,'8','Veza Clinic','38'),(1601,7,'8','Jerera Satelite Clinic','40'),(1602,7,'8','Jichidza Mission','91'),(1603,NULL,'9','Emakhandeni Day Clinic','01'),(1604,NULL,'9','Tshabalala Clinic','02'),(1605,NULL,'9','E.F.Watson Clinic','03'),(1606,NULL,'9','Entumbane Clinic','04'),(1607,NULL,'9','Khami Road Clinic','05'),(1608,NULL,'9','Luveve Clinic','06'),(1609,NULL,'9','Magwegwe Clinic','07'),(1610,NULL,'9','Mzilikazi Clinic','08'),(1611,NULL,'9','Njube Clinic','09'),(1612,NULL,'9','Lady Rodwell','0A'),(1613,NULL,'9','Thorngrove','0E'),(1614,NULL,'9','Mater Dei','0G'),(1615,NULL,'9','Richard Morris','0H'),(1616,NULL,'9','Ingutsheni Hospital','0I'),(1617,NULL,'9','Nkulumane Clinic','10'),(1618,NULL,'9','Pelandaba Clinic','11'),(1619,NULL,'9','Princess Margareth','12'),(1620,NULL,'9','Pumula Clinic','13'),(1621,NULL,'9','Dr.Shenan Clinic','14'),(1622,NULL,'9','Central Clinic','16'),(1623,NULL,'9','Nketa Clinic','17'),(1624,NULL,'9','Northern Surban  Clinic','18'),(1625,NULL,'9','King\'s Maternity','19'),(1626,NULL,'9','Jubilee Clinic','20'),(1627,NULL,'9','Maternal Health Clinic','21'),(1628,NULL,'9','Galen House Clinic','22'),(1629,NULL,'9','Marondera Polyclinic','23'),(1630,NULL,'9','Family Medical Clinic','24'),(1631,NULL,'9','Elons Clinic','25'),(1632,NULL,'9','Cowdray Park Clinic','27'),(1633,NULL,'9','Silver Oaks Medical Centre','28'),(1634,NULL,'9','Patient Wise Clinic','29'),(1635,NULL,'9','Family Health Clinic','30'),(1636,NULL,'9','24 Hour Medical Centre','31'),(1637,NULL,'9','Main Street','32'),(1638,NULL,'9','Maqhawe Clinic','33'),(1639,NULL,'9','Pumula South Clinic','35'),(1640,NULL,'9','Tembi Home Health Centre','36'),(1641,NULL,'9','Medical Chambers Cnt','37'),(1642,NULL,'9','Dr W Ndebele','39'),(1643,NULL,'9','Ingutsheni','01'),(1644,NULL,'9','U.B.H','02'),(1645,NULL,'9','UBH','0C'),(1646,NULL,'9','Mpilo Hospital','02'),(1647,1,'10','Tanya','0A'),(1648,1,'11','Tanya','01'),(1649,1,'11','Tinashe','02');
/*!40000 ALTER TABLE `facility` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facilityconfig`
--

DROP TABLE IF EXISTS `facilityconfig`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facilityconfig` (
  `idfacilityConfig` int NOT NULL AUTO_INCREMENT,
  `provinceId` int NOT NULL,
  `districtId` varchar(45) NOT NULL,
  `facilityId` varchar(45) NOT NULL,
  PRIMARY KEY (`idfacilityConfig`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facilityconfig`
--

LOCK TABLES `facilityconfig` WRITE;
/*!40000 ALTER TABLE `facilityconfig` DISABLE KEYS */;
INSERT INTO `facilityconfig` VALUES (1,0,'D','0D');
/*!40000 ALTER TABLE `facilityconfig` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `functionalstatustype`
--

DROP TABLE IF EXISTS `functionalstatustype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `functionalstatustype` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `functionalstatustype`
--

LOCK TABLES `functionalstatustype` WRITE;
/*!40000 ALTER TABLE `functionalstatustype` DISABLE KEYS */;
INSERT INTO `functionalstatustype` VALUES (1,'ABULATORY'),(2,'SCHOOL GOING'),(3,'BED RIDDEN'),(4,'WORKING');
/*!40000 ALTER TABLE `functionalstatustype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generalconditiontype`
--

DROP TABLE IF EXISTS `generalconditiontype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generalconditiontype` (
  `ID` int NOT NULL,
  `GeneralConditionName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generalconditiontype`
--

LOCK TABLES `generalconditiontype` WRITE;
/*!40000 ALTER TABLE `generalconditiontype` DISABLE KEYS */;
INSERT INTO `generalconditiontype` VALUES (1,'Ill looking'),(2,'Healthy'),(3,'Lymphadenopathy'),(4,'Wasting'),(5,'Dehydration'),(6,'Jaundice'),(7,'Pallor');
/*!40000 ALTER TABLE `generalconditiontype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genitalexamtype`
--

DROP TABLE IF EXISTS `genitalexamtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genitalexamtype` (
  `ID` int NOT NULL,
  `GenitalExamName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genitalexamtype`
--

LOCK TABLES `genitalexamtype` WRITE;
/*!40000 ALTER TABLE `genitalexamtype` DISABLE KEYS */;
INSERT INTO `genitalexamtype` VALUES (1,'Hypospadias'),(2,'Genital Ulcers'),(3,'Genital warts'),(4,'Balanitis'),(5,'Torsion of the penis'),(6,'Preputial Adhesions'),(7,'Phimosis'),(8,'Paraphimosis'),(9,'Epispadias'),(10,'Posthitis'),(11,'Urethral discharge');
/*!40000 ALTER TABLE `genitalexamtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `highviralload`
--

DROP TABLE IF EXISTS `highviralload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `highviralload` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `firstSession` varchar(255) DEFAULT NULL,
  `firstSessionDate` date DEFAULT NULL,
  `firstSessionSummary` varchar(255) DEFAULT NULL,
  `secondSession` varchar(255) DEFAULT NULL,
  `arvIntake` varchar(255) DEFAULT NULL,
  `assessmentDate` date DEFAULT NULL,
  `counsellorName` varchar(255) DEFAULT NULL,
  `secondSessionDate` date DEFAULT NULL,
  `secondSessionSummary` varchar(255) DEFAULT NULL,
  `arvIntake2` varchar(255) DEFAULT NULL,
  `extraSession` varchar(255) DEFAULT NULL,
  `extraSessionDate` date DEFAULT NULL,
  `extraSessionSummary` varchar(255) DEFAULT NULL,
  `arvIntake3` varchar(255) DEFAULT NULL,
  `repeatedVlDate` varchar(255) DEFAULT NULL,
  `viralLoadResult` varchar(255) DEFAULT NULL,
  `arvRegimenValuation` varchar(255) DEFAULT NULL,
  `nurseName` varchar(255) DEFAULT NULL,
  `nurseAssessmentDate` date DEFAULT NULL,
  `RegimenValuation` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `doctorName` varchar(255) DEFAULT NULL,
  `doctorDate` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `highviralload`
--

LOCK TABLES `highviralload` WRITE;
/*!40000 ALTER TABLE `highviralload` DISABLE KEYS */;
/*!40000 ALTER TABLE `highviralload` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hivresulttype`
--

DROP TABLE IF EXISTS `hivresulttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hivresulttype` (
  `ID` int NOT NULL,
  `ResultName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hivresulttype`
--

LOCK TABLES `hivresulttype` WRITE;
/*!40000 ALTER TABLE `hivresulttype` DISABLE KEYS */;
/*!40000 ALTER TABLE `hivresulttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `htc`
--

DROP TABLE IF EXISTS `htc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `htc` (
  `HTCNumber` varchar(255) NOT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `DateofRegistration` date DEFAULT NULL,
  `CoupleTo` varchar(255) DEFAULT NULL,
  `isCouple` varchar(4) DEFAULT NULL,
  `HTCApproach` varchar(255) DEFAULT NULL,
  `HTCModel_Id` int DEFAULT NULL,
  `CounselingRecieved` varchar(255) DEFAULT NULL,
  `OptedOut` varchar(255) DEFAULT NULL,
  `NameofCounselor` varchar(255) DEFAULT NULL,
  `RecievedResult` varchar(255) DEFAULT NULL,
  `PostTestCounseled` varchar(255) DEFAULT NULL,
  `PostTestCounselDate` date DEFAULT NULL,
  `RefferedforService` varchar(255) DEFAULT NULL,
  `TestPurposeType_ID` int DEFAULT NULL,
  `ReferredFromType_ID` int DEFAULT NULL,
  `tested_before` varchar(255) DEFAULT NULL,
  `current_pregnancy_lactation` varchar(255) DEFAULT NULL,
  `date_tested_before` datetime DEFAULT NULL,
  `EntryPointID` int DEFAULT NULL,
  `FinalResultType` varchar(255) DEFAULT NULL,
  `PerformedBy` varchar(255) DEFAULT NULL,
  `notified` varchar(4) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Sex` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`HTCNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htc`
--

LOCK TABLES `htc` WRITE;
/*!40000 ALTER TABLE `htc` DISABLE KEYS */;
/*!40000 ALTER TABLE `htc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `htc_hivresult`
--

DROP TABLE IF EXISTS `htc_hivresult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `htc_hivresult` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `HTCNumber` varchar(255) DEFAULT NULL,
  `TestKit` varchar(255) DEFAULT NULL,
  `LotNumber` varchar(255) DEFAULT NULL,
  `isRetest` bit(1) DEFAULT NULL,
  `TestCategory` int DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  `ExpireDate` timestamp NULL DEFAULT NULL,
  `starttime` varchar(8) DEFAULT NULL,
  `readingtime` varchar(8) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Sex` varchar(45) DEFAULT NULL,
  `DateofRegistration` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htc_hivresult`
--

LOCK TABLES `htc_hivresult` WRITE;
/*!40000 ALTER TABLE `htc_hivresult` DISABLE KEYS */;
/*!40000 ALTER TABLE `htc_hivresult` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `htc_setuphtcapproach`
--

DROP TABLE IF EXISTS `htc_setuphtcapproach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `htc_setuphtcapproach` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htc_setuphtcapproach`
--

LOCK TABLES `htc_setuphtcapproach` WRITE;
/*!40000 ALTER TABLE `htc_setuphtcapproach` DISABLE KEYS */;
INSERT INTO `htc_setuphtcapproach` VALUES (1,'PITC'),(2,'CITC/ VCT'),(3,NULL);
/*!40000 ALTER TABLE `htc_setuphtcapproach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `htc_setuphtcmodel`
--

DROP TABLE IF EXISTS `htc_setuphtcmodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `htc_setuphtcmodel` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Description` varchar(255) DEFAULT NULL,
  `FacilityBased` int DEFAULT NULL,
  `Community based` int DEFAULT NULL,
  `MainModel` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htc_setuphtcmodel`
--

LOCK TABLES `htc_setuphtcmodel` WRITE;
/*!40000 ALTER TABLE `htc_setuphtcmodel` DISABLE KEYS */;
INSERT INTO `htc_setuphtcmodel` VALUES (1,'Health facilty based',0,0,0),(2,'Standalone',0,0,0),(3,'Mobile (Outreach)',0,1,0),(4,'Workplace',0,0,0),(5,'Campaign',0,1,0),(6,'Other',1,1,0),(7,'Facility Based',0,0,1),(8,'Community Based',0,0,1),(10,'Private',1,0,0),(11,'Public',1,0,0),(12,'New Start centere',1,0,0),(13,'NGO',1,0,0),(14,'Home',0,1,0);
/*!40000 ALTER TABLE `htc_setuphtcmodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `htc_testreason`
--

DROP TABLE IF EXISTS `htc_testreason`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `htc_testreason` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htc_testreason`
--

LOCK TABLES `htc_testreason` WRITE;
/*!40000 ALTER TABLE `htc_testreason` DISABLE KEYS */;
INSERT INTO `htc_testreason` VALUES (1,'TB'),(2,'ANC/ L&B/ PNC'),(3,'STI'),(4,'VMMC'),(5,'Diagnosis'),(6,'Family Planning'),(7,'Nutrition'),(8,'Exposed Infant'),(9,'Occupational'),(10,'Sexual Abuse'),(11,'Family Member on ART'),(12,'Death of Child or Spouse'),(13,'Knowledge of HIV Status'),(14,'Other'),(15,'index testing'),(16,NULL);
/*!40000 ALTER TABLE `htc_testreason` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `htc_testtype`
--

DROP TABLE IF EXISTS `htc_testtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `htc_testtype` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `TestName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htc_testtype`
--

LOCK TABLES `htc_testtype` WRITE;
/*!40000 ALTER TABLE `htc_testtype` DISABLE KEYS */;
/*!40000 ALTER TABLE `htc_testtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hts_entrypoint`
--

DROP TABLE IF EXISTS `hts_entrypoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hts_entrypoint` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Description` varchar(55) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hts_entrypoint`
--

LOCK TABLES `hts_entrypoint` WRITE;
/*!40000 ALTER TABLE `hts_entrypoint` DISABLE KEYS */;
INSERT INTO `hts_entrypoint` VALUES (1,'Antenatal clinic','2'),(2,'STI Clinic','0'),(3,'General VCT Clinic','0'),(4,'Outpatients','0'),(5,'Counseling area','0'),(6,'Medical & Surgical Ward','1'),(7,'TB Ward','0'),(8,'Vmmc','1'),(9,'Paediatric Ward','0'),(10,'HTS Campaign','0'),(11,'Private Clinic/Hospital','0'),(12,'Other Wards(Specify)','0'),(13,NULL,NULL);
/*!40000 ALTER TABLE `hts_entrypoint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hts_sqnumber`
--

DROP TABLE IF EXISTS `hts_sqnumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hts_sqnumber` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sqnumber` int DEFAULT NULL,
  `Year` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hts_sqnumber`
--

LOCK TABLES `hts_sqnumber` WRITE;
/*!40000 ALTER TABLE `hts_sqnumber` DISABLE KEYS */;
INSERT INTO `hts_sqnumber` VALUES (1,4,2020),(2,NULL,NULL);
/*!40000 ALTER TABLE `hts_sqnumber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratory`
--

DROP TABLE IF EXISTS `laboratory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laboratory` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(45) DEFAULT NULL,
  `TestType` varchar(45) DEFAULT NULL,
  `TestDate` date DEFAULT NULL,
  `ReceivedDate` date DEFAULT NULL,
  `PatientReceivedDate` date DEFAULT NULL,
  `Result` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratory`
--

LOCK TABLES `laboratory` WRITE;
/*!40000 ALTER TABLE `laboratory` DISABLE KEYS */;
/*!40000 ALTER TABLE `laboratory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linkages`
--

DROP TABLE IF EXISTS `linkages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `linkages` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PatientID` int NOT NULL,
  `OPDNumber` varchar(225) NOT NULL,
  `Referred_to` varchar(225) NOT NULL,
  `Referred_to_date` datetime NOT NULL,
  `Referred_From` varchar(225) NOT NULL,
  `Referred_from_Date` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linkages`
--

LOCK TABLES `linkages` WRITE;
/*!40000 ALTER TABLE `linkages` DISABLE KEYS */;
/*!40000 ALTER TABLE `linkages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locks`
--

DROP TABLE IF EXISTS `locks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locks` (
  `LockedPatientID` varchar(17) NOT NULL DEFAULT '',
  `LockByMachine` varchar(50) DEFAULT NULL,
  `LockByForm` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LockedPatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locks`
--

LOCK TABLES `locks` WRITE;
/*!40000 ALTER TABLE `locks` DISABLE KEYS */;
INSERT INTO `locks` VALUES ('07-07-04-2009-A-0','ADULTOI-PC','CTC2');
/*!40000 ALTER TABLE `locks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `module`
--

DROP TABLE IF EXISTS `module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `module` (
  `ID` int NOT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `FolderPath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module`
--

LOCK TABLES `module` WRITE;
/*!40000 ALTER TABLE `module` DISABLE KEYS */;
/*!40000 ALTER TABLE `module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulerole`
--

DROP TABLE IF EXISTS `modulerole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modulerole` (
  `ID` int NOT NULL,
  `ModuleID` int DEFAULT NULL,
  `RoleID` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulerole`
--

LOCK TABLES `modulerole` WRITE;
/*!40000 ALTER TABLE `modulerole` DISABLE KEYS */;
/*!40000 ALTER TABLE `modulerole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nationality`
--

DROP TABLE IF EXISTS `nationality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nationality` (
  `nationality_id` int NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`nationality_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nationality`
--

LOCK TABLES `nationality` WRITE;
/*!40000 ALTER TABLE `nationality` DISABLE KEYS */;
INSERT INTO `nationality` VALUES (1,'Afghan'),(2,'Albanian'),(3,'Algerian'),(4,'American'),(5,'Andorran'),(6,'Angolan'),(7,'Anguillan'),(8,'Argentine'),(9,'Armenian'),(10,'Australian'),(11,'Austrian'),(12,'Azerbaijani'),(13,'Bahamian'),(14,'Bahraini'),(15,'Bangladeshi'),(16,'Barbadian'),(17,'Belarusian'),(18,'Belgian'),(19,'Belizean'),(20,'Beninese'),(21,'Bermudian'),(22,'Bhutanese'),(23,'Bolivian'),(24,'Botswanan'),(25,'Brazilian'),(26,'British'),(27,'British Virgin Islander'),(28,'Bruneian'),(29,'Bulgarian'),(30,'Burkinan'),(31,'Burmese'),(32,'Burundian'),(33,'Cambodian'),(34,'Cameroonian'),(35,'Canadian'),(36,'Cape Verdean'),(37,'Cayman Islander'),(38,'Central African'),(39,'Chadian'),(40,'Chilean'),(41,'Chinese'),(42,'Citizen of Antigua and Barbuda'),(43,'Citizen of Bosnia and Herzegovina'),(44,'Citizen of Guinea-Bissau'),(45,'Citizen of Kiribati'),(46,'Citizen of Seychelles'),(47,'Citizen of the Dominican Republic'),(48,'Citizen of Vanuatu'),(49,'Colombian'),(50,'Comoran'),(51,'Congolese (Congo)'),(52,'Congolese (DRC)'),(53,'Cook Islander'),(54,'Costa Rican'),(55,'Croatian'),(56,'Cuban'),(57,'Cymraes'),(58,'Cymro'),(59,'Cypriot'),(60,'Czech'),(61,'Danish'),(62,'Djiboutian'),(63,'Dominican'),(64,'Dutch'),(65,'East Timorese'),(66,'Ecuadorean'),(67,'Egyptian'),(68,'Emirati'),(69,'English'),(70,'Equatorial Guinean'),(71,'Eritrean'),(72,'Estonian'),(73,'Ethiopian'),(74,'Faroese'),(76,'Fijian'),(77,'Filipino'),(78,'Finnish'),(79,'French'),(80,'Gabonese'),(81,'Gambian'),(82,'Georgian'),(83,'German'),(84,'Ghanaian'),(85,'Gibraltarian'),(86,'Greek'),(87,'Greenlandic'),(88,'Grenadian'),(89,'Guamanian'),(90,'Guatemalan'),(91,'Guinean'),(92,'Guyanese'),(93,'Haitian'),(94,'Honduran'),(95,'Hong Konger'),(96,'Hungarian'),(97,'Icelandic'),(98,'Indian'),(99,'Indonesian'),(100,'Iranian'),(101,'Iraqi'),(102,'Irish'),(103,'Israeli'),(104,'Italian'),(105,'Ivorian'),(106,'Jamaican'),(107,'Japanese'),(108,'Jordanian'),(109,'Kazakh'),(110,'Kenyan'),(111,'Kittitian'),(112,'Kosovan'),(113,'Kuwaiti'),(114,'Kyrgyz'),(115,'Lao'),(116,'Latvian'),(117,'Lebanese'),(118,'Liberian'),(119,'Libyan'),(120,'Liechtenstein citizen'),(121,'Lithuanian'),(122,'Luxembourger'),(123,'Macanese'),(124,'Macedonian'),(125,'Malagasy'),(126,'Malawian'),(127,'Malaysian'),(128,'Maldivian'),(129,'Malian'),(130,'Maltese'),(131,'Marshallese'),(132,'Martiniquais'),(133,'Mauritanian'),(134,'Mauritian'),(135,'Mexican'),(136,'Micronesian'),(137,'Moldovan'),(138,'Monegasque'),(139,'Mongolian'),(140,'Montenegrin'),(141,'Montserratian'),(142,'Moroccan'),(143,'Mosotho'),(144,'Mozambican'),(145,'Namibian'),(146,'Nauruan'),(147,'Nepalese'),(148,'New Zealander'),(149,'Nicaraguan'),(150,'Nigerian'),(151,'Nigerien'),(152,'Niuean'),(153,'North Korean'),(154,'Northern Irish'),(155,'Norwegian'),(156,'Omani'),(157,'Pakistani'),(158,'Palauan'),(159,'Palestinian'),(160,'Panamanian'),(161,'Papua New Guinean'),(162,'Paraguayan'),(163,'Peruvian'),(164,'Pitcairn Islander'),(165,'Polish'),(166,'Portuguese'),(167,'Prydeinig'),(168,'Puerto Rican'),(169,'Qatari'),(170,'Romanian'),(171,'Russian'),(172,'Rwandan'),(173,'Salvadorean'),(174,'Sammarinese'),(175,'Samoan'),(176,'Sao Tomean'),(177,'Saudi Arabian'),(178,'Scottish'),(179,'Senegalese'),(180,'Serbian'),(181,'Sierra Leonean'),(182,'Singaporean'),(183,'Slovak'),(184,'Slovenian'),(185,'Solomon Islander'),(186,'Somali'),(187,'South African'),(188,'South Korean'),(189,'South Sudanese'),(190,'Spanish'),(191,'Sri Lankan'),(192,'St Helenian'),(193,'St Lucian'),(194,'Stateless'),(195,'Sudanese'),(196,'Surinamese'),(197,'Swazi'),(198,'Swedish'),(199,'Swiss'),(200,'Syrian'),(201,'Taiwanese'),(202,'Tajik'),(203,'Tanzanian'),(204,'Thai'),(205,'Togolese'),(206,'Tongan'),(207,'Trinidadian'),(208,'Tristanian'),(209,'Tunisian'),(210,'Turkish'),(211,'Turkmen'),(212,'Turks and Caicos Islander'),(213,'Tuvaluan'),(214,'Ugandan'),(215,'Ukrainian'),(216,'Uruguayan'),(217,'Uzbek'),(218,'Vatican citizen'),(219,'Venezuelan'),(220,'Vietnamese'),(221,'Vincentian'),(222,'Wallisian'),(223,'Welsh'),(224,'Yemeni'),(225,'Zambian'),(226,'Zimbabwean');
/*!40000 ALTER TABLE `nationality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nextofkin`
--

DROP TABLE IF EXISTS `nextofkin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nextofkin` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PatientID` int DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `PhysicalAddress` varchar(255) DEFAULT NULL,
  `ContactNumber` varchar(255) DEFAULT NULL,
  `RelationType` varchar(255) DEFAULT NULL,
  `Chief` varchar(255) DEFAULT NULL,
  `Kraal` varchar(255) DEFAULT NULL,
  `Village` varchar(255) DEFAULT NULL,
  `School` varchar(255) DEFAULT NULL,
  `Clinic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nextofkin`
--

LOCK TABLES `nextofkin` WRITE;
/*!40000 ALTER TABLE `nextofkin` DISABLE KEYS */;
/*!40000 ALTER TABLE `nextofkin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `node`
--

DROP TABLE IF EXISTS `node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `node` (
  `ID` int NOT NULL,
  `ModuleID` int DEFAULT NULL,
  `Title` varchar(255) DEFAULT NULL,
  `FilePath` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `PageID` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `node`
--

LOCK TABLES `node` WRITE;
/*!40000 ALTER TABLE `node` DISABLE KEYS */;
/*!40000 ALTER TABLE `node` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `noderole`
--

DROP TABLE IF EXISTS `noderole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `noderole` (
  `ID` int NOT NULL,
  `NodeID` int DEFAULT NULL,
  `RoleID` int DEFAULT NULL,
  `ViewAllowed` bit(1) DEFAULT NULL,
  `EditAllowed` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `noderole`
--

LOCK TABLES `noderole` WRITE;
/*!40000 ALTER TABLE `noderole` DISABLE KEYS */;
/*!40000 ALTER TABLE `noderole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `OPDNumber` varchar(255) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `Nationality` varchar(90) DEFAULT NULL,
  `Type` varchar(90) DEFAULT NULL,
  `NationalID` varchar(255) DEFAULT NULL,
  `Age` float DEFAULT NULL,
  `Sex` char(6) DEFAULT NULL,
  `FacilityCode` varchar(255) DEFAULT NULL,
  `RegistrationDate` datetime DEFAULT NULL,
  `MaritalStatus` varchar(255) DEFAULT NULL,
  `EducationalLevel` varchar(255) DEFAULT NULL,
  `Occupation` varchar(255) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `vmmcId` varchar(255) DEFAULT NULL,
  `htsId` varchar(255) DEFAULT NULL,
  `tbId` varchar(255) DEFAULT NULL,
  `patientId` varchar(21) DEFAULT NULL,
  `stiId` varchar(45) DEFAULT NULL,
  `OphanStatus` varchar(45) DEFAULT NULL,
  `DateOfDeath` date DEFAULT NULL,
  `Religion` varchar(45) DEFAULT NULL,
  `fileRef` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`OPDNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_address`
--

DROP TABLE IF EXISTS `patient_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_address` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PatientId` int DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `PhysicalAddress` varchar(255) DEFAULT NULL,
  `Chief` varchar(255) DEFAULT NULL,
  `Kraal` varchar(255) DEFAULT NULL,
  `School` varchar(255) DEFAULT NULL,
  `Village` varchar(255) DEFAULT NULL,
  `Clinic` varchar(255) DEFAULT NULL,
  `MobileNumber` varchar(255) DEFAULT NULL,
  `TelNumber` varchar(255) DEFAULT NULL,
  `WorkTelNumber` varchar(255) DEFAULT NULL,
  `WorkAddress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_address`
--

LOCK TABLES `patient_address` WRITE;
/*!40000 ALTER TABLE `patient_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_diagnosis`
--

DROP TABLE IF EXISTS `patient_diagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_diagnosis` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `VMMCID` varchar(255) DEFAULT NULL,
  `DiagnosisType_Id` int DEFAULT NULL,
  `DiagnosisDescription` varchar(255) DEFAULT NULL,
  `SpecifyOtherDiagnosis` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_diagnosis`
--

LOCK TABLES `patient_diagnosis` WRITE;
/*!40000 ALTER TABLE `patient_diagnosis` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_diagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_medical_insurance`
--

DROP TABLE IF EXISTS `patient_medical_insurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_medical_insurance` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PatientID` int DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `Medical_Insurance_Name` varchar(255) DEFAULT NULL,
  `Medical_Insurance_Number` varchar(255) DEFAULT NULL,
  `Medical_Insurance_Scheme` varchar(255) DEFAULT NULL,
  `Medical_Insurance_Relation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_medical_insurance`
--

LOCK TABLES `patient_medical_insurance` WRITE;
/*!40000 ALTER TABLE `patient_medical_insurance` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_medical_insurance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_sqnumber`
--

DROP TABLE IF EXISTS `patient_sqnumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_sqnumber` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sqnumber` int DEFAULT NULL,
  `year` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_sqnumber`
--

LOCK TABLES `patient_sqnumber` WRITE;
/*!40000 ALTER TABLE `patient_sqnumber` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_sqnumber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_status`
--

DROP TABLE IF EXISTS `patient_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_status` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PatientID` int DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `StatusType_ID` int DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_status`
--

LOCK TABLES `patient_status` WRITE;
/*!40000 ALTER TABLE `patient_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proceduretype`
--

DROP TABLE IF EXISTS `proceduretype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proceduretype` (
  `ID` int NOT NULL,
  `ProcedureName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proceduretype`
--

LOCK TABLES `proceduretype` WRITE;
/*!40000 ALTER TABLE `proceduretype` DISABLE KEYS */;
/*!40000 ALTER TABLE `proceduretype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `province`
--

DROP TABLE IF EXISTS `province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `province` (
  `ID` int NOT NULL,
  `ProvinceName` varchar(255) NOT NULL,
  `ProvinceCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ProvinceName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `province`
--

LOCK TABLES `province` WRITE;
/*!40000 ALTER TABLE `province` DISABLE KEYS */;
INSERT INTO `province` VALUES (10,'Bulawayo','9'),(1,'Harare','0'),(2,'Manicaland','1'),(3,'Mashonaland Central','2'),(4,'Mashonaland East','3'),(5,'Mashonaland West','4'),(11,'Masvikeni A','10'),(12,'Masvikeni B','11'),(9,'Masvingo','8'),(6,'Matabeleland North','5'),(7,'Matabeleland South','6'),(8,'Midlands','7');
/*!40000 ALTER TABLE `province` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportdates`
--

DROP TABLE IF EXISTS `reportdates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reportdates` (
  `ID` int NOT NULL DEFAULT '1',
  `startDate` varchar(45) DEFAULT '0000-00-00',
  `End` varchar(45) DEFAULT '0000-00-00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportdates`
--

LOCK TABLES `reportdates` WRITE;
/*!40000 ALTER TABLE `reportdates` DISABLE KEYS */;
INSERT INTO `reportdates` VALUES (1,'0000-00-00','0000-00-00');
/*!40000 ALTER TABLE `reportdates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riskreductionplantype`
--

DROP TABLE IF EXISTS `riskreductionplantype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riskreductionplantype` (
  `ID` int NOT NULL,
  `RiskReductionName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riskreductionplantype`
--

LOCK TABLES `riskreductionplantype` WRITE;
/*!40000 ALTER TABLE `riskreductionplantype` DISABLE KEYS */;
/*!40000 ALTER TABLE `riskreductionplantype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `RoleId` varchar(255) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `PermissionLevel` int DEFAULT NULL,
  PRIMARY KEY (`RoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES ('1','Admin',5),('2','Data Entry Clerk',4),('3','Dispenser',3),('4','Lab Technician',3),('5','Executive',1);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `securityaccesslevels`
--

DROP TABLE IF EXISTS `securityaccesslevels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `securityaccesslevels` (
  `AccessLevel` int NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `EnterSecurity` tinyint DEFAULT NULL,
  `EnterUtilities` tinyint DEFAULT NULL,
  `EnterPrintouts` tinyint DEFAULT NULL,
  `EnterSetup` tinyint DEFAULT NULL,
  `EnterDataEntryDespensing` tinyint DEFAULT NULL,
  `EnterDataEntry` tinyint DEFAULT NULL,
  `EnterPrintoutsSpecial` tinyint DEFAULT NULL,
  PRIMARY KEY (`AccessLevel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `securityaccesslevels`
--

LOCK TABLES `securityaccesslevels` WRITE;
/*!40000 ALTER TABLE `securityaccesslevels` DISABLE KEYS */;
/*!40000 ALTER TABLE `securityaccesslevels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `securityusers`
--

DROP TABLE IF EXISTS `securityusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `securityusers` (
  `UserNumber` int NOT NULL,
  `FullName` varchar(50) DEFAULT NULL,
  `LoginName` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `AccessLevel` int DEFAULT NULL,
  `Active` int DEFAULT NULL,
  PRIMARY KEY (`UserNumber`),
  KEY `fi0` (`AccessLevel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `securityusers`
--

LOCK TABLES `securityusers` WRITE;
/*!40000 ALTER TABLE `securityusers` DISABLE KEYS */;
INSERT INTO `securityusers` VALUES (67,'Admin','admin','CTC2DATA',5,NULL),(68,'TSUNGAI NERWANDA','TSUNGAI','ctc',4,NULL),(69,'MOREBLESSINGS DESHE','DESHEM','pumpkin76',4,NULL),(70,'DADISO MURINGI','DADISOM','12345',5,NULL),(71,'MICHELLE MUSHAYI','MICHELLE','12345',4,NULL),(72,'FAITH MKWESHA','FAITHM','chenai',4,NULL),(73,'HELLEN CHIMBIZI','HELLENC','training',4,NULL),(74,'CYNTHIA MASHINGAIDZE','CYNTHIA','kiera',4,NULL),(75,'STEVEN MACHINGAUTA T','STEVENM','2018',4,0),(76,'BRIGHTON MBODZA','BRIGHTON','BRIGHTON',4,-1),(77,'TATENDA KANDEMWA','TATENDAK','1215',4,NULL),(78,'CREDDAH MUSWE','CREDDAHM','creddah',4,NULL),(79,'CHARITY TSVANGIRAI','CHARITYT','2200',4,NULL),(80,'CLEOPAS SAKUPWANYA','CLEOPASS','cleosaku',4,NULL),(81,'JULIET CHIMBIZI','JULIETC','MALACHI',4,NULL),(82,'MIRIAM MARAWO','MARAWOM','butterfly',4,NULL),(83,'FAITH KAMUSHA','FAITHK','kamusha',4,-1),(84,'FAITH KAMUSHA','FAITHK','',4,NULL),(85,NULL,NULL,'12345',4,-1);
/*!40000 ALTER TABLE `securityusers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setup_linkages`
--

DROP TABLE IF EXISTS `setup_linkages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setup_linkages` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setup_linkages`
--

LOCK TABLES `setup_linkages` WRITE;
/*!40000 ALTER TABLE `setup_linkages` DISABLE KEYS */;
/*!40000 ALTER TABLE `setup_linkages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupclinicians`
--

DROP TABLE IF EXISTS `setupclinicians`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupclinicians` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `FistName` varchar(255) DEFAULT NULL,
  `Surname` varchar(255) DEFAULT NULL,
  `IDNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupclinicians`
--

LOCK TABLES `setupclinicians` WRITE;
/*!40000 ALTER TABLE `setupclinicians` DISABLE KEYS */;
/*!40000 ALTER TABLE `setupclinicians` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupdoctors`
--

DROP TABLE IF EXISTS `setupdoctors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupdoctors` (
  `ID` int NOT NULL DEFAULT '0',
  `FirstName` varchar(255) DEFAULT NULL,
  `Surname` varchar(255) DEFAULT NULL,
  `IDNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupdoctors`
--

LOCK TABLES `setupdoctors` WRITE;
/*!40000 ALTER TABLE `setupdoctors` DISABLE KEYS */;
/*!40000 ALTER TABLE `setupdoctors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupmedicalaidsocities`
--

DROP TABLE IF EXISTS `setupmedicalaidsocities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupmedicalaidsocities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `medical_aid_name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupmedicalaidsocities`
--

LOCK TABLES `setupmedicalaidsocities` WRITE;
/*!40000 ALTER TABLE `setupmedicalaidsocities` DISABLE KEYS */;
INSERT INTO `setupmedicalaidsocities` VALUES (1,'CIMAS','TEST'),(2,'PSMAS','TEST2'),(3,'FIRST MUTUAL','TEST3'),(4,'OLD MUTUAL','TEST4'),(5,'Harare Municipality Medical Aid Society','TEST5'),(6,'Corporate24 Medical Aid','TEST6'),(7,'Municipality Of Bulawayo Medical Aid Society','TEST7');
/*!40000 ALTER TABLE `setupmedicalaidsocities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupprimarycounsellors`
--

DROP TABLE IF EXISTS `setupprimarycounsellors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupprimarycounsellors` (
  `ID` int NOT NULL DEFAULT '0',
  `FirstName` varchar(255) DEFAULT NULL,
  `Surname` varchar(255) DEFAULT NULL,
  `IDNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupprimarycounsellors`
--

LOCK TABLES `setupprimarycounsellors` WRITE;
/*!40000 ALTER TABLE `setupprimarycounsellors` DISABLE KEYS */;
/*!40000 ALTER TABLE `setupprimarycounsellors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupreferred_to`
--

DROP TABLE IF EXISTS `setupreferred_to`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupreferred_to` (
  `id` int NOT NULL,
  `description` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupreferred_to`
--

LOCK TABLES `setupreferred_to` WRITE;
/*!40000 ALTER TABLE `setupreferred_to` DISABLE KEYS */;
INSERT INTO `setupreferred_to` VALUES (2,'VMMC'),(3,'Medical Care'),(4,'OI/ART'),(5,'Psychosocial support'),(6,'TB'),(7,'Nutrition'),(8,'PMTCT'),(9,'Cervical cancer screening'),(10,'Other');
/*!40000 ALTER TABLE `setupreferred_to` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupreferredfrom`
--

DROP TABLE IF EXISTS `setupreferredfrom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupreferredfrom` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ReferredFromName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupreferredfrom`
--

LOCK TABLES `setupreferredfrom` WRITE;
/*!40000 ALTER TABLE `setupreferredfrom` DISABLE KEYS */;
INSERT INTO `setupreferredfrom` VALUES (1,'New Start Centre'),(2,'Community mobiliser'),(3,'Workplace'),(4,'School'),(5,'HTC Program'),(6,'Health worker'),(99,'Other');
/*!40000 ALTER TABLE `setupreferredfrom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupriskreductionplan`
--

DROP TABLE IF EXISTS `setupriskreductionplan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupriskreductionplan` (
  `RiskReductionPlanName` varchar(255) DEFAULT NULL,
  `ID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupriskreductionplan`
--

LOCK TABLES `setupriskreductionplan` WRITE;
/*!40000 ALTER TABLE `setupriskreductionplan` DISABLE KEYS */;
INSERT INTO `setupriskreductionplan` VALUES ('Dual Protection',1),('Use Condoms',2),('Decrease Number of sex partners',3),('Abstinence',4),('Monogamy',5),(NULL,6);
/*!40000 ALTER TABLE `setupriskreductionplan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupservicetypes`
--

DROP TABLE IF EXISTS `setupservicetypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupservicetypes` (
  `idsetupServiceTypes` int NOT NULL,
  `setupServiceName` varchar(255) NOT NULL,
  PRIMARY KEY (`idsetupServiceTypes`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupservicetypes`
--

LOCK TABLES `setupservicetypes` WRITE;
/*!40000 ALTER TABLE `setupservicetypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `setupservicetypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setupstaff`
--

DROP TABLE IF EXISTS `setupstaff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setupstaff` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `userRole` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setupstaff`
--

LOCK TABLES `setupstaff` WRITE;
/*!40000 ALTER TABLE `setupstaff` DISABLE KEYS */;
/*!40000 ALTER TABLE `setupstaff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statustype`
--

DROP TABLE IF EXISTS `statustype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statustype` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `StatusName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statustype`
--

LOCK TABLES `statustype` WRITE;
/*!40000 ALTER TABLE `statustype` DISABLE KEYS */;
/*!40000 ALTER TABLE `statustype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti`
--

DROP TABLE IF EXISTS `sti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti` (
  `OPDNumber` varchar(255) NOT NULL,
  `STINumber` varchar(255) NOT NULL,
  `DateOfRegistration` date DEFAULT NULL,
  `Complaints` varchar(255) DEFAULT NULL,
  `SexualHistory` varchar(255) DEFAULT NULL,
  `Episode` varchar(45) DEFAULT NULL,
  `STISyndrome` varchar(255) DEFAULT NULL,
  `Examinations` varchar(255) DEFAULT NULL,
  `TestedForSyphilis` varchar(4) DEFAULT NULL,
  `PurposeOfSyphilisTesting` varchar(255) DEFAULT NULL,
  `SyphilisTestResult` varchar(4) DEFAULT NULL,
  `Treatment` varchar(255) DEFAULT NULL,
  `TestedForHiv` varchar(4) DEFAULT NULL,
  `StiContactSlipIssued` varchar(4) DEFAULT NULL,
  `StiContactSlipReceived` varchar(4) DEFAULT NULL,
  `SyphilisResult` varchar(4) DEFAULT NULL,
  `ScreenedForSyphilis` varchar(4) DEFAULT NULL,
  `SyphilisTreated` varchar(4) DEFAULT NULL,
  `HivTestResult` varchar(4) DEFAULT NULL,
  `CondomInformationGiven` varchar(4) DEFAULT NULL,
  `CondomsIssued` varchar(4) DEFAULT NULL,
  `Comments` varchar(255) DEFAULT NULL,
  `EntryPoint` varchar(45) DEFAULT NULL,
  `DeliveryOutcome` varchar(45) DEFAULT NULL,
  `AncBookingTime` varchar(45) DEFAULT NULL,
  `AncTestedForSyphilis` varchar(4) DEFAULT NULL,
  `AncSyphilisTestResults` varchar(4) DEFAULT NULL,
  `AncSyphilisTreated` varchar(4) DEFAULT NULL,
  `AncSyphillisTreatment` varchar(255) DEFAULT NULL,
  `AncTestedDuringPregnancy` varchar(4) DEFAULT NULL,
  `AncDateTestedSyphDuriPreg` date DEFAULT NULL,
  `AncSyphTestedBeforeResult` varchar(4) DEFAULT NULL,
  `AncSyphTreatedBefore` varchar(4) DEFAULT NULL,
  `AncDeliveryDate` date DEFAULT NULL,
  `StiInfectionType` varchar(45) DEFAULT NULL,
  `AncSyphilisResult` varchar(4) DEFAULT NULL,
  `HIVTestedBefore` varchar(4) DEFAULT NULL,
  `HIVTestedBeforeResult` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`STINumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti`
--

LOCK TABLES `sti` WRITE;
/*!40000 ALTER TABLE `sti` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_ancsyphilis`
--

DROP TABLE IF EXISTS `sti_ancsyphilis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_ancsyphilis` (
  `OPDNumber` varchar(255) NOT NULL,
  `STINumber` varchar(255) NOT NULL,
  `DateOfRegistration` date DEFAULT NULL,
  `ScreenedForSyphilis` varchar(4) DEFAULT NULL,
  `SyphilisResult` varchar(4) DEFAULT NULL,
  `SyphilisTreated` varchar(4) DEFAULT NULL,
  `SexualHistory` varchar(255) DEFAULT NULL,
  `Episode` varchar(45) DEFAULT NULL,
  `STISyndrome` varchar(255) DEFAULT NULL,
  `TestedForSyphilis` varchar(4) DEFAULT NULL,
  `PurposeOfSyphilisTesting` varchar(255) DEFAULT NULL,
  `SyphilisTestResult` varchar(4) DEFAULT NULL,
  `Treatment` varchar(255) DEFAULT NULL,
  `TestedForHiv` varchar(4) DEFAULT NULL,
  `HivTestResult` varchar(4) DEFAULT NULL,
  `StiContactSlipIssued` varchar(4) DEFAULT NULL,
  `StiContactSlipReceived` varchar(4) DEFAULT NULL,
  `CondomInformationGiven` varchar(4) DEFAULT NULL,
  `CondomsIssued` varchar(4) DEFAULT NULL,
  `Comments` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`STINumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_ancsyphilis`
--

LOCK TABLES `sti_ancsyphilis` WRITE;
/*!40000 ALTER TABLE `sti_ancsyphilis` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti_ancsyphilis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_ancsyphilistreatment`
--

DROP TABLE IF EXISTS `sti_ancsyphilistreatment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_ancsyphilistreatment` (
  `Dose` varchar(255) NOT NULL,
  `STINumber` varchar(255) NOT NULL,
  `ID` int NOT NULL AUTO_INCREMENT,
  `Frequency` varchar(45) DEFAULT NULL,
  `DateTreatmentCommenced` date DEFAULT NULL,
  `DateOfDelivery` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_ancsyphilistreatment`
--

LOCK TABLES `sti_ancsyphilistreatment` WRITE;
/*!40000 ALTER TABLE `sti_ancsyphilistreatment` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti_ancsyphilistreatment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_cs`
--

DROP TABLE IF EXISTS `sti_cs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_cs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `STINumber` varchar(255) DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `DateofReport` date DEFAULT NULL,
  `ReportingFacility` varchar(255) DEFAULT NULL,
  `MotherId` varchar(45) DEFAULT NULL,
  `MothersAddress` varchar(255) DEFAULT NULL,
  `MothersObsHistoryGravida` varchar(3) DEFAULT NULL,
  `MothersObsHistoryParity` varchar(3) DEFAULT NULL,
  `LMPBeforeDelivery` date DEFAULT NULL,
  `MothersReligion` varchar(45) DEFAULT NULL,
  `FirstPrenatalVisit` date DEFAULT NULL,
  `TrimesterFirstPrenatalVisit` varchar(4) DEFAULT NULL,
  `MotherHIVStatusDuriPreg` varchar(15) DEFAULT NULL,
  `MothersMaritalStatus` varchar(45) DEFAULT NULL,
  `PeriodReceivingBenzathinePenicillin` varchar(45) DEFAULT NULL,
  `DateReceivingBenzathinePenicillin` date DEFAULT NULL,
  `MotherSyphilisTreatment` varchar(45) DEFAULT NULL,
  `DateOfDelivery` date DEFAULT NULL,
  `VitalStatus` varchar(45) DEFAULT NULL,
  `DateOfDeath` date DEFAULT NULL,
  `BirthWeight` varchar(3) DEFAULT NULL,
  `GestationalAge` varchar(3) DEFAULT NULL,
  `NonTreponemaltest` varchar(45) DEFAULT NULL,
  `TiterOfNonTreponemalTest` varchar(20) DEFAULT NULL,
  `TreponemaltestDone` varchar(20) DEFAULT NULL,
  `TreponemaltestDoneDate` date DEFAULT NULL,
  `DateOfNonTreponemalTest` date DEFAULT NULL,
  `DarkiedExam` varchar(45) DEFAULT NULL,
  `SignsOfCongenitalSyphilis` varchar(255) DEFAULT NULL,
  `BoneXRay` varchar(45) DEFAULT NULL,
  `CSFVDRL` varchar(45) DEFAULT NULL,
  `CSFProteinCSFWB` varchar(45) DEFAULT NULL,
  `InfantCongenitalSyphilistreatment` varchar(255) DEFAULT NULL,
  `CSClassification` varchar(45) DEFAULT NULL,
  `isNonTreponemalTestFirstVisit` varchar(20) DEFAULT NULL,
  `isNonTreponemalTestWeeksGest` varchar(20) DEFAULT NULL,
  `isNonTreponemalTestDelivery` varchar(20) DEFAULT NULL,
  `DateOfNonTreponemalTestMotherRecent` date DEFAULT NULL,
  `ResultOfNonTreponemalTestMotherRecent` varchar(45) DEFAULT NULL,
  `TiterOfNonTreponemalTestMotherRecent` varchar(45) DEFAULT NULL,
  `DateOfNonTreponemalTestMotherRecenFirst` date DEFAULT NULL,
  `ResultOfNonTreponemalTestMotherFirst` varchar(45) DEFAULT NULL,
  `TiterOfNonTreponemalTestMotherFirst` varchar(45) DEFAULT NULL,
  `DateOfPositiveTreponemalTestRecent` date DEFAULT NULL,
  `DateOfPositiveTreponemalTestFirst` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_cs`
--

LOCK TABLES `sti_cs` WRITE;
/*!40000 ALTER TABLE `sti_cs` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti_cs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_cs_setupsigns`
--

DROP TABLE IF EXISTS `sti_cs_setupsigns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_cs_setupsigns` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_cs_setupsigns`
--

LOCK TABLES `sti_cs_setupsigns` WRITE;
/*!40000 ALTER TABLE `sti_cs_setupsigns` DISABLE KEYS */;
INSERT INTO `sti_cs_setupsigns` VALUES (1,'hepatosplenomegaly'),(2,'hepatosplenomegaly'),(3,'pseudo paralysis'),(4,'oedema'),(5,'condylomalata'),(6,'nose snuffles'),(7,'syphilitic skin rash'),(8,'no signs/asymptomatic'),(9,'other'),(10,'Unknown');
/*!40000 ALTER TABLE `sti_cs_setupsigns` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_cs_signs_infant`
--

DROP TABLE IF EXISTS `sti_cs_signs_infant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_cs_signs_infant` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_cs_signs_infant`
--

LOCK TABLES `sti_cs_signs_infant` WRITE;
/*!40000 ALTER TABLE `sti_cs_signs_infant` DISABLE KEYS */;
INSERT INTO `sti_cs_signs_infant` VALUES (1,'Physical Signs of CS'),(2,'Evidenceof CS on long bone X-ray'),(3,'Reactive cerebrospinal fluid VDRL(CSF-VDRL)'),(4,'Elevated CSF WBC count or protein');
/*!40000 ALTER TABLE `sti_cs_signs_infant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_csexposeinfant`
--

DROP TABLE IF EXISTS `sti_csexposeinfant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_csexposeinfant` (
  `InfantId` varchar(45) NOT NULL,
  `InfantOPDNumber` varchar(45) DEFAULT NULL,
  `MotherOPDNumber` varchar(45) DEFAULT NULL,
  `Examination` varchar(255) DEFAULT NULL,
  `ExaminationType` varchar(45) DEFAULT NULL,
  `UmblicalOrPlacentaStatus` varchar(45) DEFAULT NULL,
  `NonTreponemalTestResult` varchar(45) DEFAULT NULL,
  `Signs` varchar(255) DEFAULT NULL,
  `CaseDefination` varchar(45) DEFAULT NULL,
  `Notified` varchar(4) DEFAULT NULL,
  `CaseCriteria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`InfantId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_csexposeinfant`
--

LOCK TABLES `sti_csexposeinfant` WRITE;
/*!40000 ALTER TABLE `sti_csexposeinfant` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti_csexposeinfant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_drugs`
--

DROP TABLE IF EXISTS `sti_drugs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_drugs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Infection_code` varchar(255) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_drugs`
--

LOCK TABLES `sti_drugs` WRITE;
/*!40000 ALTER TABLE `sti_drugs` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti_drugs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_examinations`
--

DROP TABLE IF EXISTS `sti_examinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_examinations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `examination` varchar(255) DEFAULT NULL,
  `type` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_examinations`
--

LOCK TABLES `sti_examinations` WRITE;
/*!40000 ALTER TABLE `sti_examinations` DISABLE KEYS */;
INSERT INTO `sti_examinations` VALUES (1,'Mouth sores',1),(2,'pharyngeal inflammation',1),(3,'oral thrush',1),(4,'rashes',1),(5,'swellings',1),(6,'sores on the chest',1),(7,'Sores on the back',1),(8,'Sores on abdomen',1),(9,'enlarged lymph nodes.',1),(10,'patient is generally unwell',1),(11,'rashes and obvious swellings skin over the abdomen',0),(12,'Pubic inguinal lymph nodes at the pubic area',2),(13,'Pubic lice lymph nodes at the pubic area',2),(14,'Pubic sores  at the pubic area',2),(15,'Rashes on thighs and buttocks',0),(16,'swellings and sores on the groin',0),(17,'Discharge, rashes At the external genitals',2),(18,'rashes At the area around the anus ',0),(19,'warts, At the area around the anus ',0),(20,'discharge At the area around the anus ',2),(21,'lymph nodes and buboes.',2),(22,'Rashes on the penis',2),(23,'Warts on the penis',2),(24,'Sores on the penis',2),(25,'urethral meatus',2),(26,'rashes for External genitalia, vulva and labia',3),(27,'sores for External genitalia, vulva and labia',3),(28,'swellings for External genitalia, vulva and labia',3),(29,'warts for External genitalia, vulva and labia',3),(30,'Viginal  discharge ',3),(31,'Lesions for External genitalia, vulva and labia',3),(32,'abnormal growths or sores',3),(33,'cervical os closed',3),(34,'cervical os open',3),(35,'induced miscarriage or bleeding post-delivery',3),(36,'RPOCs on through os',3);
/*!40000 ALTER TABLE `sti_examinations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_history`
--

DROP TABLE IF EXISTS `sti_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_history` (
  `id` int NOT NULL AUTO_INCREMENT,
  `history` varchar(255) DEFAULT NULL,
  `type` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_history`
--

LOCK TABLES `sti_history` WRITE;
/*!40000 ALTER TABLE `sti_history` DISABLE KEYS */;
INSERT INTO `sti_history` VALUES (1,'Regular partners',1),(2,'Casual partners',1),(3,'Money/Gifts exchange for sex',1),(4,'Other partners in the precceding 3 months',1),(5,'Recently had sex',1),(6,'Major illness in the past',2),(7,'Admited before',2),(8,'Previouse operation',2),(9,'Previouse STIs',2),(10,'HIV testing',2),(11,'currently on treatment',3),(12,'Drug allergies',3),(13,'Taking herbal remedies',3),(14,'Use alcohol',3),(15,'Use other recreational drugs',3);
/*!40000 ALTER TABLE `sti_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_infectiontype`
--

DROP TABLE IF EXISTS `sti_infectiontype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_infectiontype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `infectiontype` varchar(25) DEFAULT NULL,
  `syndrome` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_infectiontype`
--

LOCK TABLES `sti_infectiontype` WRITE;
/*!40000 ALTER TABLE `sti_infectiontype` DISABLE KEYS */;
INSERT INTO `sti_infectiontype` VALUES (1,'Vaginal infection','VI','Vaginal Discharge','00'),(2,'Cervical infection','CI','Vaginal Discharge','0'),(3,'PID','PID','Vaginal Discharge','0'),(4,'Urethral infection','UI','Urethral Discharge','11'),(5,'Anal or Rectal Infection','ARI','Ano-rectal infections','2'),(6,'Genital Infection','GI','Genital ulcer','2'),(7,'Inguinal infection','II','Inguinal Bubo','2'),(8,'Scrotum Infection','SI','Acute scrotal swelling','1'),(9,'Penal Fore-skin Infection ','PFI','Candida balanoposthitis','11'),(10,'Eye or systemic infection','ESI','Neonatal conjunctivitis','01'),(11,'Anal and genital warts','AGW','Anogenital warts','2'),(12,'Skin or pubic infections','SPI','Scabis and pubic lice','2');
/*!40000 ALTER TABLE `sti_infectiontype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_setuppurposeofsyphilis`
--

DROP TABLE IF EXISTS `sti_setuppurposeofsyphilis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_setuppurposeofsyphilis` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(45) NOT NULL,
  `code` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_setuppurposeofsyphilis`
--

LOCK TABLES `sti_setuppurposeofsyphilis` WRITE;
/*!40000 ALTER TABLE `sti_setuppurposeofsyphilis` DISABLE KEYS */;
INSERT INTO `sti_setuppurposeofsyphilis` VALUES (1,'Antenatal','a'),(2,'Sexual abuse','b'),(3,'Contact','c'),(4,'Syphilis Exposed infant','d'),(5,'STI client','e');
/*!40000 ALTER TABLE `sti_setuppurposeofsyphilis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_setupsyndrome`
--

DROP TABLE IF EXISTS `sti_setupsyndrome`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_setupsyndrome` (
  `code` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_setupsyndrome`
--

LOCK TABLES `sti_setupsyndrome` WRITE;
/*!40000 ALTER TABLE `sti_setupsyndrome` DISABLE KEYS */;
INSERT INTO `sti_setupsyndrome` VALUES (1,'Urethral Discharge','0'),(2,'Genital Ulcer','2'),(3,'Varginal discharge ','1'),(4,'Lower Abdominal Pain','1'),(5,'Inguinal bubo','2'),(6,'Acute Scrotal Swelling','0'),(7,'Opthalmia Neonatorum ','2'),(8,'Balanitis and Balanoposthitis','0'),(9,'Genital Warts','2'),(10,'Congenital Syphilis','2'),(11,'Other','2');
/*!40000 ALTER TABLE `sti_setupsyndrome` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_sexualactivity`
--

DROP TABLE IF EXISTS `sti_sexualactivity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_sexualactivity` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sexualactivity` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_sexualactivity`
--

LOCK TABLES `sti_sexualactivity` WRITE;
/*!40000 ALTER TABLE `sti_sexualactivity` DISABLE KEYS */;
INSERT INTO `sti_sexualactivity` VALUES (1,'Penetrative sex '),(2,'condoms used'),(3,'Vaginal  sex'),(4,'Oral sex'),(5,'Orogenital contact'),(6,'Oroanal contact'),(7,'Mutual masturbation');
/*!40000 ALTER TABLE `sti_sexualactivity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_sqnumber`
--

DROP TABLE IF EXISTS `sti_sqnumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_sqnumber` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sqnumber` int DEFAULT NULL,
  `year` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_sqnumber`
--

LOCK TABLES `sti_sqnumber` WRITE;
/*!40000 ALTER TABLE `sti_sqnumber` DISABLE KEYS */;
INSERT INTO `sti_sqnumber` VALUES (1,1,2019);
/*!40000 ALTER TABLE `sti_sqnumber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_symptoms`
--

DROP TABLE IF EXISTS `sti_symptoms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_symptoms` (
  `id` int(11) unsigned zerofill NOT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_symptoms`
--

LOCK TABLES `sti_symptoms` WRITE;
/*!40000 ALTER TABLE `sti_symptoms` DISABLE KEYS */;
INSERT INTO `sti_symptoms` VALUES (00000000001,'Discharge from urethra ','0'),(00000000002,'Vaginal discharge','1'),(00000000003,'Swelling in the groin','2'),(00000000004,'Pain in the groin','2'),(00000000005,'Sores around the anus','2'),(00000000006,'Sores around the genitals','2'),(00000000007,'Lower abdominal pain ','1'),(00000000008,'Painful vaginal intercourse','1'),(00000000009,'Rectal discharge','2'),(00000000010,'Rectal pain','2'),(00000000011,'Difficulties with urination','2'),(00000000012,'Difficulties with defecation','2'),(00000000013,'Swellings ','2'),(00000000014,'lumps','2'),(00000000015,'discomfort in the perineum','2'),(00000000016,'Itching in the perineum','2'),(00000000017,'Itching  in the peri-anal','2'),(00000000018,'discomfort in the peri-anal','2'),(00000000019,'Itching in the  pubic areas','2'),(00000000020,'discomfort in the  pubic areas','2');
/*!40000 ALTER TABLE `sti_symptoms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sti_treament`
--

DROP TABLE IF EXISTS `sti_treament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sti_treament` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sti_number` varchar(45) DEFAULT NULL,
  `treatmentdate` date DEFAULT NULL,
  `typeofsti` varchar(225) DEFAULT NULL,
  `duration` varchar(255) DEFAULT NULL,
  `Dose` varchar(255) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sti_treament`
--

LOCK TABLES `sti_treament` WRITE;
/*!40000 ALTER TABLE `sti_treament` DISABLE KEYS */;
/*!40000 ALTER TABLE `sti_treament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblappointments`
--

DROP TABLE IF EXISTS `tblappointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblappointments` (
  `PatientID` varchar(25) NOT NULL,
  `DateOfAppointment` datetime NOT NULL,
  `DateAppointmentGiven` datetime DEFAULT NULL,
  `Cancelled` int DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DateOfAppointment`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblappointments`
--

LOCK TABLES `tblappointments` WRITE;
/*!40000 ALTER TABLE `tblappointments` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblappointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblbaselinetests`
--

DROP TABLE IF EXISTS `tblbaselinetests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblbaselinetests` (
  `TheID` int NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(21) NOT NULL,
  `TestTypeID` varchar(3) DEFAULT NULL,
  `TestDate` datetime DEFAULT NULL,
  `ResultDate` datetime DEFAULT NULL,
  `ResultNumeric` varchar(10) DEFAULT NULL,
  `ResultNotes` varchar(255) DEFAULT NULL,
  `DateOfEnrolment` date DEFAULT NULL,
  PRIMARY KEY (`TheID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblbaselinetests`
--

LOCK TABLES `tblbaselinetests` WRITE;
/*!40000 ALTER TABLE `tblbaselinetests` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblbaselinetests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblbatches`
--

DROP TABLE IF EXISTS `tblbatches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblbatches` (
  `BatchNumber` varchar(20) NOT NULL,
  `MSDcode` varchar(8) DEFAULT NULL,
  `DateReceived` datetime DEFAULT NULL,
  `ExpiryDate` datetime DEFAULT NULL,
  `Finished` tinyint DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  `InvoiceNumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BatchNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblbatches`
--

LOCK TABLES `tblbatches` WRITE;
/*!40000 ALTER TABLE `tblbatches` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblbatches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblconfig`
--

DROP TABLE IF EXISTS `tblconfig`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblconfig` (
  `RegionCode` int NOT NULL DEFAULT '0',
  `DistrictCode` varchar(1) NOT NULL DEFAULT '',
  `FacilityCode` varchar(2) NOT NULL DEFAULT '',
  PRIMARY KEY (`FacilityCode`,`DistrictCode`,`RegionCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblconfig`
--

LOCK TABLES `tblconfig` WRITE;
/*!40000 ALTER TABLE `tblconfig` DISABLE KEYS */;
INSERT INTO `tblconfig` VALUES (0,'D','0D');
/*!40000 ALTER TABLE `tblconfig` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblconfigoptions`
--

DROP TABLE IF EXISTS `tblconfigoptions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblconfigoptions` (
  `ConfigOptionName` varchar(50) NOT NULL DEFAULT '',
  `ConfigOptionDescription` varchar(100) DEFAULT NULL,
  `ConfigOptionValue` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ConfigOptionName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblconfigoptions`
--

LOCK TABLES `tblconfigoptions` WRITE;
/*!40000 ALTER TABLE `tblconfigoptions` DISABLE KEYS */;
INSERT INTO `tblconfigoptions` VALUES ('PastDateLimit','Do not allow entry of visit dates more than this much in the past','4383');
/*!40000 ALTER TABLE `tblconfigoptions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldatachecknotes`
--

DROP TABLE IF EXISTS `tbldatachecknotes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldatachecknotes` (
  `PatientID` varchar(17) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `DataCheckID` int NOT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DataCheckID`,`VisitDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldatachecknotes`
--

LOCK TABLES `tbldatachecknotes` WRITE;
/*!40000 ALTER TABLE `tbldatachecknotes` DISABLE KEYS */;
INSERT INTO `tbldatachecknotes` VALUES ('00-00-0C-2009-A-1','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-00-0D-2011-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-00-0D-2015-A-9','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-00-63-2013-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-0A-48-2004-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-0A-48-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-0A-63-2014-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-0C-0C-2010-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-0C-0C-2013-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('00-48-0A-2011-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('01-02-00-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('01-0A-0C-2014-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('02-02-09-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('03-09-27-2013-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('04-06-83-2014-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('04-08-0A-2009-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('07-04-06-2013-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('07-04-47-2011-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('07-08-30-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('07-64-03-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('08-04-1A-2011-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('08-08-0A-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('08-0H-0C-2010-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('09-0A-40-2014-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('09-0C-0C-2012-A-0','1899-12-30 00:00:00',102,'TRANSFER IN'),('09-0D-0D-2010-A-0','1899-12-30 00:00:00',102,'TRANSFER IN');
/*!40000 ALTER TABLE `tbldatachecknotes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldispense`
--

DROP TABLE IF EXISTS `tbldispense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldispense` (
  `MSDCode` varchar(8) NOT NULL,
  `DispenseDate` datetime NOT NULL,
  `PatientID` varchar(25) NOT NULL DEFAULT '',
  `FullFacilityCode` varchar(8) DEFAULT NULL,
  `Transit` int DEFAULT NULL,
  `Quantity` int DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `DispenserID` int DEFAULT NULL,
  `DispenseOrder` int DEFAULT NULL,
  PRIMARY KEY (`MSDCode`,`DispenseDate`,`PatientID`),
  KEY `fi0` (`DispenserID`),
  CONSTRAINT `tbldispense_ibfk_1` FOREIGN KEY (`DispenserID`) REFERENCES `tblsetupdispensers` (`DispenserID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldispense`
--

LOCK TABLES `tbldispense` WRITE;
/*!40000 ALTER TABLE `tbldispense` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbldispense` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblexposedinfantmedication`
--

DROP TABLE IF EXISTS `tblexposedinfantmedication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblexposedinfantmedication` (
  `ExposedInfantID` varchar(25) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `DrugTypeID` varchar(3) NOT NULL,
  `NumDaysDispensed` int DEFAULT NULL,
  PRIMARY KEY (`ExposedInfantID`,`VisitDate`,`DrugTypeID`),
  KEY `fi0` (`ExposedInfantID`,`VisitDate`),
  CONSTRAINT `tblexposedinfantmedication_ibfk_1` FOREIGN KEY (`ExposedInfantID`, `VisitDate`) REFERENCES `tblexposedinfantvisits` (`ExposedInfantID`, `VisitDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblexposedinfantmedication`
--

LOCK TABLES `tblexposedinfantmedication` WRITE;
/*!40000 ALTER TABLE `tblexposedinfantmedication` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblexposedinfantmedication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblexposedinfantproblems`
--

DROP TABLE IF EXISTS `tblexposedinfantproblems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblexposedinfantproblems` (
  `ExposedInfantID` varchar(25) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `ProblemAcronym` varchar(6) NOT NULL,
  PRIMARY KEY (`ExposedInfantID`,`VisitDate`,`ProblemAcronym`),
  KEY `fi0` (`ExposedInfantID`,`VisitDate`),
  CONSTRAINT `tblexposedinfantproblems_ibfk_1` FOREIGN KEY (`ExposedInfantID`, `VisitDate`) REFERENCES `tblexposedinfantvisits` (`ExposedInfantID`, `VisitDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblexposedinfantproblems`
--

LOCK TABLES `tblexposedinfantproblems` WRITE;
/*!40000 ALTER TABLE `tblexposedinfantproblems` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblexposedinfantproblems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblexposedinfants`
--

DROP TABLE IF EXISTS `tblexposedinfants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblexposedinfants` (
  `ExposedInfantID` varchar(25) NOT NULL,
  `MotherPatientID` varchar(21) DEFAULT NULL,
  `FullName` varchar(255) DEFAULT NULL,
  `Sex` varchar(6) DEFAULT NULL,
  `DateOfBirth` datetime DEFAULT NULL,
  `InfantStatusCode` varchar(3) DEFAULT NULL,
  `InfantStatusDate` datetime DEFAULT NULL,
  `ChildPatientID` varchar(21) DEFAULT NULL,
  `DateOfDeath` datetime DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `TheTimeStamp` datetime DEFAULT NULL,
  `ModeOfDelivery` varchar(45) DEFAULT NULL,
  `PlaceOfDelivery` varchar(45) DEFAULT NULL,
  `RegistrationDate` date DEFAULT NULL,
  PRIMARY KEY (`ExposedInfantID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblexposedinfants`
--

LOCK TABLES `tblexposedinfants` WRITE;
/*!40000 ALTER TABLE `tblexposedinfants` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblexposedinfants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblexposedinfanttests`
--

DROP TABLE IF EXISTS `tblexposedinfanttests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblexposedinfanttests` (
  `ExposedInfantID` varchar(25) NOT NULL,
  `TestDate` datetime NOT NULL,
  `TestTypeID` varchar(1) DEFAULT NULL,
  `TestResultID` varchar(3) DEFAULT NULL,
  `DateResultsObtained` datetime DEFAULT NULL,
  `DateResultsGiven` datetime DEFAULT NULL,
  PRIMARY KEY (`ExposedInfantID`,`TestDate`),
  KEY `fi0` (`ExposedInfantID`),
  CONSTRAINT `tblexposedinfanttests_ibfk_1` FOREIGN KEY (`ExposedInfantID`) REFERENCES `tblexposedinfants` (`ExposedInfantID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblexposedinfanttests`
--

LOCK TABLES `tblexposedinfanttests` WRITE;
/*!40000 ALTER TABLE `tblexposedinfanttests` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblexposedinfanttests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblexposedinfantvisits`
--

DROP TABLE IF EXISTS `tblexposedinfantvisits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblexposedinfantvisits` (
  `ExposedInfantID` varchar(25) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `VisitTypeCode` varchar(2) DEFAULT NULL,
  `Weight` double DEFAULT NULL,
  `FeedingPracticeID` varchar(8) DEFAULT NULL,
  `ImmunizationsUpToDate` int DEFAULT NULL,
  `NextVisitDate` datetime DEFAULT NULL,
  `StaffID` int DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `TheTimeStamp` datetime DEFAULT NULL,
  `CotriSupplied` varchar(4) DEFAULT NULL,
  `NVPSupplied` varchar(4) DEFAULT NULL,
  `TypeOfHIVTestCode` varchar(2) DEFAULT NULL,
  `HIVTestResult` varchar(10) DEFAULT NULL,
  `HIVResultIssued` varchar(4) DEFAULT NULL,
  `Comments` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ExposedInfantID`,`VisitDate`),
  KEY `fi0` (`ExposedInfantID`),
  CONSTRAINT `tblexposedinfantvisits_ibfk_1` FOREIGN KEY (`ExposedInfantID`) REFERENCES `tblexposedinfants` (`ExposedInfantID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblexposedinfantvisits`
--

LOCK TABLES `tblexposedinfantvisits` WRITE;
/*!40000 ALTER TABLE `tblexposedinfantvisits` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblexposedinfantvisits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblfamilyinfo`
--

DROP TABLE IF EXISTS `tblfamilyinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblfamilyinfo` (
  `TheID` int NOT NULL DEFAULT '0',
  `PatientID` varchar(21) DEFAULT NULL,
  `RelativeType` varchar(50) DEFAULT NULL,
  `RelativeAtThisClinic` varchar(3) DEFAULT NULL,
  `RelativeCTCID` varchar(21) DEFAULT NULL,
  `RelativeID` int DEFAULT NULL,
  PRIMARY KEY (`TheID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblfamilyinfo`
--

LOCK TABLES `tblfamilyinfo` WRITE;
/*!40000 ALTER TABLE `tblfamilyinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblfamilyinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblfamilyrelatives`
--

DROP TABLE IF EXISTS `tblfamilyrelatives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblfamilyrelatives` (
  `RelativeID` int NOT NULL DEFAULT '0',
  `RelativeCTCID` varchar(21) DEFAULT NULL,
  `RelativeName` varchar(255) DEFAULT NULL,
  `RelativeAge` int DEFAULT NULL,
  `OnART` int DEFAULT NULL,
  PRIMARY KEY (`RelativeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblfamilyrelatives`
--

LOCK TABLES `tblfamilyrelatives` WRITE;
/*!40000 ALTER TABLE `tblfamilyrelatives` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblfamilyrelatives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblinventory`
--

DROP TABLE IF EXISTS `tblinventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblinventory` (
  `MSDCode` varchar(8) NOT NULL,
  `InventoryDate` datetime NOT NULL,
  `Quantity` int DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MSDCode`,`InventoryDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblinventory`
--

LOCK TABLES `tblinventory` WRITE;
/*!40000 ALTER TABLE `tblinventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblinventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblledger`
--

DROP TABLE IF EXISTS `tblledger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblledger` (
  `MSDcode` varchar(8) NOT NULL,
  `LedgerDate` datetime NOT NULL,
  `LedgerEntryTypeCode` varchar(3) NOT NULL,
  `FullFacilityCode` varchar(10) NOT NULL,
  `Quantity` int DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `Notes` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MSDcode`,`LedgerDate`,`LedgerEntryTypeCode`,`FullFacilityCode`),
  KEY `fi0` (`LedgerEntryTypeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblledger`
--

LOCK TABLES `tblledger` WRITE;
/*!40000 ALTER TABLE `tblledger` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblledger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblmedication`
--

DROP TABLE IF EXISTS `tblmedication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblmedication` (
  `PatientID` varchar(21) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `DrugTypeID` varchar(3) NOT NULL DEFAULT '',
  `QuantityPrescribed` int DEFAULT NULL,
  `PercentAdherence` int DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  `QuantityDisp` int DEFAULT NULL,
  PRIMARY KEY (`DrugTypeID`,`VisitDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblmedication`
--

LOCK TABLES `tblmedication` WRITE;
/*!40000 ALTER TABLE `tblmedication` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblmedication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpatients`
--

DROP TABLE IF EXISTS `tblpatients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblpatients` (
  `PatientID` varchar(21) NOT NULL DEFAULT '',
  `FirstName` varchar(50) DEFAULT NULL,
  `SurName` varchar(50) DEFAULT NULL,
  `NationalID` varchar(17) DEFAULT NULL,
  `DateOfBirth` datetime DEFAULT NULL,
  `Sex` varchar(6) DEFAULT NULL,
  `MaritalStatus` varchar(3) DEFAULT NULL,
  `MedInsSchemeName` varchar(255) DEFAULT NULL,
  `MedInsMemberName` varchar(255) DEFAULT NULL,
  `MedInsNumber` varchar(30) DEFAULT NULL,
  `MedInsRelationshipToMember` varchar(62) DEFAULT NULL,
  `NameNextKin` varchar(255) DEFAULT NULL,
  `PhysicalAddress` varchar(255) DEFAULT NULL,
  `PhysicalAddressNextKin` varchar(255) DEFAULT NULL,
  `NearestKraal` varchar(255) DEFAULT NULL,
  `NearestKraalNextKin` varchar(255) DEFAULT NULL,
  `NearestVillage` varchar(255) DEFAULT NULL,
  `NearestVillageNextKin` varchar(255) DEFAULT NULL,
  `NearestSchool` varchar(255) DEFAULT NULL,
  `NearestSchoolNextKin` varchar(255) DEFAULT NULL,
  `NearestClinic` varchar(255) DEFAULT NULL,
  `NearestClinicNextKin` varchar(255) DEFAULT NULL,
  `Phone` varchar(62) DEFAULT NULL,
  `PhoneNextKin` varchar(62) DEFAULT NULL,
  `CellPhone` varchar(62) DEFAULT NULL,
  `CellPhoneNextKin` varchar(62) DEFAULT NULL,
  `WorkAddress` varchar(255) DEFAULT NULL,
  `WorkAddressNextKin` varchar(255) DEFAULT NULL,
  `WorkTel` varchar(62) DEFAULT NULL,
  `WorkTelNextKin` varchar(62) DEFAULT NULL,
  `Occupation` varchar(255) DEFAULT NULL,
  `OccupationNextKin` varchar(255) DEFAULT NULL,
  `TransferInId` varchar(4) DEFAULT NULL,
  `ReferredFromID` varchar(21) DEFAULT NULL,
  `ReferredFromNotes` varchar(255) DEFAULT NULL,
  `OrphanStatusID` varchar(1) DEFAULT NULL,
  `EducationLevelID` varchar(1) DEFAULT NULL,
  `DateOfDeath` datetime DEFAULT NULL,
  `DateConfirmedHIVPositive` datetime DEFAULT NULL,
  `LocationHIVTestCode` varchar(8) DEFAULT NULL,
  `HIVTestTypeID` varchar(1) DEFAULT NULL,
  `HIVTestReasonID` varchar(3) DEFAULT NULL,
  `HIVTestNotes` varchar(255) DEFAULT NULL,
  `HIVTestLocationCode` varchar(8) DEFAULT NULL,
  `DrugAllergies` varchar(255) DEFAULT NULL,
  `FileRef` varchar(50) DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `TheTimeStamp` datetime DEFAULT NULL,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `DateOfEnrolment` date DEFAULT NULL,
  `PersonalTracingName` varchar(100) DEFAULT NULL,
  `PersonalTracingDate` date DEFAULT NULL,
  `IndexCaseName` varchar(100) DEFAULT NULL,
  `IndexCaseDate` date DEFAULT NULL,
  `IsDisclosureHIV` varchar(4) DEFAULT NULL,
  `DisclosureYesWhom` varchar(45) DEFAULT NULL,
  `DisclosureNoReason` varchar(255) DEFAULT NULL,
  `DisclosureYesDate` date DEFAULT NULL,
  `DisclosureYesRelation` varchar(45) DEFAULT NULL,
  `IsRetestForHIVInitiation` varchar(4) DEFAULT NULL,
  `IsRetestForHIVInitiationDate` date DEFAULT NULL,
  PRIMARY KEY (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpatients`
--

LOCK TABLES `tblpatients` WRITE;
/*!40000 ALTER TABLE `tblpatients` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpatients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpatientspriorexposure`
--

DROP TABLE IF EXISTS `tblpatientspriorexposure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblpatientspriorexposure` (
  `PatientID` varchar(21) NOT NULL DEFAULT '',
  `DrugTypeID` varchar(3) NOT NULL DEFAULT '',
  `RegimenCode` int DEFAULT NULL,
  `DateStarted` datetime DEFAULT NULL,
  `DateLastTakenOrCompleted` datetime DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DrugTypeID`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpatientspriorexposure`
--

LOCK TABLES `tblpatientspriorexposure` WRITE;
/*!40000 ALTER TABLE `tblpatientspriorexposure` DISABLE KEYS */;
INSERT INTO `tblpatientspriorexposure` VALUES ('00-00-00-2013-A-00029','ARV',49,'2013-06-18 00:00:00',NULL,NULL),('00-00-0A-2014-A-99991','ARV',91,'2014-06-05 00:00:00',NULL,NULL),('00-00-63-2013-A-00515','ARV',41,'2015-08-21 00:00:00',NULL,NULL),('00-00-63-2013-A-00589','ARV',26,'2013-10-29 00:00:00',NULL,NULL),('00-00-63-2013-A-00769','ARV',26,'2014-07-15 00:00:00',NULL,NULL),('00-0A-00-2013-A-01894','ARV',98,'2013-07-15 00:00:00',NULL,NULL),('00-0A-09-2010-A-91298','ARV',26,'2015-08-15 00:00:00',NULL,NULL),('00-0a-09-2014-A-00410','ARV',26,'2017-06-20 00:00:00',NULL,NULL),('00-0A-09-2014-A-00952','ARV',98,'2014-10-10 00:00:00',NULL,NULL),('00-0A-09-2016-A-00667','ARV',26,'2016-08-15 00:00:00',NULL,NULL),('00-0A-09-2017-A-00438','ARV',97,'2017-11-11 00:00:00',NULL,NULL),('00-0A-0A-2012-A-05227','ARV',26,'2012-05-05 00:00:00',NULL,NULL),('00-0A-0C-2009-A-00027','ARV',1,'2012-10-01 00:00:00','2013-11-01 00:00:00','14'),('00-0A-0C-2009-A-00159','ARV',91,'2010-10-10 00:00:00',NULL,NULL),('00-0A-0C-2009-A-16390','ARV',97,'2009-12-04 00:00:00',NULL,NULL),('00-0A-0C-2010-A-19422','ARV',97,'2011-11-05 00:00:00',NULL,NULL),('00-0A-0C-2011-A-02951','ARV',27,'2011-02-01 00:00:00',NULL,NULL),('00-0A-0C-2013-A-01674','ARV',91,'2013-06-05 00:00:00',NULL,NULL),('00-0A-0D-2006-A-05332','ARV',98,'2006-08-02 00:00:00',NULL,NULL),('00-0A-0D-2009-A-14705','ARV',1,'2009-08-28 00:00:00',NULL,NULL),('00-0A-0D-2011-A-07311','ARV',43,'2014-06-15 00:00:00',NULL,NULL),('00-0A-0D-2012-A-01841','ARV',26,'2008-09-20 00:00:00','2015-06-02 00:00:00',NULL),('00-0A-0D-2012-A-30869','ARV',97,'2012-04-30 00:00:00',NULL,NULL),('00-0A-0D-2014-A-00148','ARV',98,'2004-03-15 00:00:00',NULL,NULL),('00-0A-0D-2014-A-00502','ARV',41,'2014-05-15 00:00:00',NULL,NULL),('00-0A-13-2008-A-99972','ARV',98,'2008-04-16 00:00:00',NULL,NULL),('00-0A-13-2016-A-00201','ARV',91,'2016-10-10 00:00:00',NULL,NULL),('00-0A-13-2018-A-99987','ARV',26,'2016-07-15 00:00:00','2017-07-15 00:00:00','14'),('00-0A-18-2011-A-00167','ARV',26,'2011-02-03 00:00:00',NULL,NULL),('00-0A-18-2013-A-00443','ARV',84,'2013-10-15 00:00:00',NULL,NULL),('00-0A-18-2015-A-00120','ARV',26,'2015-02-16 00:00:00',NULL,NULL),('00-0A-18-2015-A-00121','ARV',26,'2015-03-18 00:00:00',NULL,NULL),('00-0A-18-2018-A-00272','ARV',26,'2018-05-11 00:00:00',NULL,NULL),('00-0A-20-2009-A-00726','ARV',27,'2009-02-25 00:00:00',NULL,NULL),('00-0A-20-2014-A-00359','ARV',26,'2014-04-04 00:00:00','2014-08-04 00:00:00','14'),('00-0A-20-2016-A-00234','ARV',26,'2016-08-22 00:00:00','2016-08-31 00:00:00',NULL),('00-0A-20-2019-A-00356','ARV',97,'2019-05-10 00:00:00',NULL,NULL),('00-0A-27-2015-A-00189','ARV',26,'2015-07-30 00:00:00',NULL,NULL),('00-0A-27-2017-A-00966','ARV',26,'2017-09-13 00:00:00',NULL,NULL),('00-0A-29-2011-A-20477','ARV',41,'2011-01-20 00:00:00',NULL,NULL),('00-0A-29-2018-A-00300','ARV',26,'2018-07-10 00:00:00',NULL,NULL),('00-0a-29-2018-A-00301','ARV',26,'2018-07-10 00:00:00',NULL,NULL),('00-0A-34-2016-A-00691','ARV',7,'2016-07-15 00:00:00',NULL,NULL),('00-0A-34-2016-A-20005','ARV',26,'2016-06-12 00:00:00',NULL,NULL),('00-0A-34-2018-A-00110','ARV',97,'2020-02-18 00:00:00',NULL,NULL),('00-0a-34-2018-A-00512','ARV',26,'2018-06-04 00:00:00',NULL,NULL),('00-0A-35-2015-A-00016','ARV',97,'2015-04-01 00:00:00',NULL,NULL),('00-0A-35-2017-A-03208','ARV',26,'2017-10-05 00:00:00',NULL,NULL),('00-0A-35-2019-A-00040','ARV',97,'2019-08-19 00:00:00',NULL,NULL),('00-0A-36-2009-A-90138','ARV',27,'2012-12-27 00:00:00',NULL,NULL),('00-0A-41-2018-A-00284','ARV',98,'2018-11-03 00:00:00',NULL,NULL),('00-0A-44-2016-A-90053','ARV',26,'2016-01-02 00:00:00',NULL,NULL),('00-0A-48-2012-A-00057','ARV',26,'2012-03-05 00:00:00',NULL,NULL),('00-0A-59-2016-A-90000','ARV',98,'2012-10-10 00:00:00',NULL,NULL),('00-0A-63-2014-A-00491','ARV',49,'2014-05-07 00:00:00',NULL,NULL),('00-0A-63-2015-A-00017','ARV',97,'2015-01-29 00:00:00',NULL,NULL),('00-0A-63-2016-A-00465','ARV',41,'2017-01-30 00:00:00',NULL,NULL),('00-0A-63-2016-A-00902','ARV',41,'2010-06-15 00:00:00',NULL,NULL),('00-0A-63-2016-A-01507','ARV',97,'2016-11-01 00:00:00',NULL,NULL),('00-0A-63-2017-A-01468','ARV',26,'2017-09-30 00:00:00',NULL,NULL),('00-0A-63-2018-A-00061','ARV',26,'2018-03-13 00:00:00',NULL,NULL),('00-0A-66-2016-A-00041','ARV',26,'2016-10-06 00:00:00',NULL,NULL),('00-0A-68-2017-A-00100','ARV',26,'2017-04-06 00:00:00',NULL,NULL),('00-0A-68-2018-A-00285','ARV',98,'2018-11-15 00:00:00',NULL,NULL),('00-0B-02-2016-A-99958','ARV',27,'2016-05-05 00:00:00',NULL,NULL),('00-0C-01-2004-A-00586','ARV',26,'2004-03-05 00:00:00',NULL,NULL),('00-0C-01-2013-A-02131','ARV',27,'2013-12-17 00:00:00',NULL,NULL),('00-0C-01-2013-A-03211','ARV',28,'2007-11-02 00:00:00',NULL,NULL),('00-0C-01-2014-A-00991','ARV',26,'2014-06-01 00:00:00',NULL,NULL),('00-0C-01-2018-A-00989','ARV',97,'2018-12-15 00:00:00',NULL,NULL),('00-0C-0C-2010-A-02797','ARV',97,'2009-11-15 00:00:00',NULL,NULL),('00-0C-0C-2010-A-03308','ARV',1,'2010-12-13 00:00:00',NULL,NULL),('00-0C-0C-2013-A-01149','ARV',26,'2014-08-21 00:00:00',NULL,NULL),('00-0D-01-2012-A-01733','ARV',27,'2012-06-05 00:00:00',NULL,NULL),('00-0D-0D-2003-A-80136','ARV',43,'2005-09-27 00:00:00',NULL,NULL),('00-0D-0D-2003-A-90064','ARV',27,'2006-08-17 00:00:00',NULL,NULL),('00-0D-0D-2003-A-90073','ARV',27,'2004-07-15 00:00:00',NULL,NULL),('00-0D-0D-2004-A-00363','ARV',NULL,'2016-02-21 00:00:00',NULL,NULL),('00-0D-0D-2004-A-00535','ARV',NULL,'2007-01-05 00:00:00',NULL,NULL),('00-0D-0D-2004-A-00929','ARV',29,'2005-03-08 00:00:00',NULL,NULL),('00-0D-0D-2004-A-03247','ARV',27,'2005-09-20 00:00:00',NULL,NULL),('00-0D-0D-2004-A-80262','ARV',8,'2012-12-31 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90195','ARV',27,'2005-04-06 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90227','ARV',28,'2012-04-30 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90262','ARV',29,'2013-03-25 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90279','ARV',29,'2005-10-26 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90315','ARV',43,'2011-05-16 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90338','ARV',43,'2004-06-06 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90344','ARV',29,'2006-05-27 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90357','ARV',1,'2005-04-19 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90366','ARV',27,'2005-09-25 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90466','ARV',27,'2005-04-25 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90472','ARV',29,'2006-08-15 00:00:00',NULL,'150'),('00-0D-0D-2004-A-90483','ARV',27,'2004-10-04 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90540','ARV',27,'2004-04-15 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90542','ARV',27,'2004-11-13 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90599','ARV',26,'2004-04-24 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90783','ARV',27,'2004-01-15 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90799','ARV',43,'2013-07-10 00:00:00',NULL,NULL),('00-0D-0D-2005-A-00867','ARV',26,'2013-10-10 00:00:00',NULL,NULL),('00-0D-0D-2005-A-01825','ARV',26,'2005-09-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-02809','ARV',1,'2005-10-06 00:00:00',NULL,NULL),('00-0D-0D-2005-A-80231','ARV',1,'2005-09-08 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90029','ARV',27,'2015-10-05 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90046','ARV',27,'2006-08-30 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90047','ARV',29,'2010-01-06 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90378','ARV',27,'2005-09-08 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90570','ARV',27,'2005-04-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90594','ARV',1,'2009-05-07 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90595','ARV',27,'2006-08-03 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90601','ARV',29,'2010-12-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90655','ARV',26,'2012-03-04 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90657','ARV',27,'2005-06-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90691','ARV',26,'2005-03-20 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90703','ARV',27,'2006-04-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90728','ARV',1,'2005-04-02 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90740','ARV',27,'2005-02-20 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90745','ARV',27,'2005-06-06 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90758','ARV',27,'2013-04-02 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90803','ARV',27,'2005-06-20 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90808','ARV',27,'2007-12-03 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90851','ARV',98,'2014-11-03 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90860','ARV',27,'2005-07-04 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90876','ARV',27,'2005-08-11 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90953','ARV',48,'2005-11-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90972','ARV',27,'2006-03-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90991','ARV',43,'2007-05-05 00:00:00',NULL,NULL),('00-0D-0D-2005-A-91010','ARV',27,'2005-02-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-91059','ARV',27,'2006-05-17 00:00:00',NULL,NULL),('00-0D-0D-2005-A-91135','ARV',41,'2005-08-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-00410','ARV',26,'2005-04-26 00:00:00',NULL,NULL),('00-0D-0D-2006-A-01341','ARV',1,'2006-02-13 00:00:00',NULL,NULL),('00-0D-0D-2006-A-01380','ARV',26,'2009-11-05 00:00:00',NULL,NULL),('00-0D-0D-2006-A-01876','ARV',27,'2005-06-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-02110','ARV',98,'2015-12-29 00:00:00',NULL,NULL),('00-0D-0D-2006-A-02685','ARV',26,'2015-01-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-02927','ARV',27,'2006-08-04 00:00:00',NULL,NULL),('00-0D-0D-2006-A-02948','ARV',1,'2010-06-10 00:00:00',NULL,NULL),('00-0D-0D-2006-A-03907','ARV',NULL,'2006-10-17 00:00:00',NULL,NULL),('00-0D-0D-2006-A-90206','ARV',5,'2008-08-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-90596','ARV',43,'2005-02-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91063','ARV',27,'2013-05-06 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91082','ARV',1,'2010-04-28 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91096','ARV',27,'2006-02-21 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91124','ARV',40,'2006-11-08 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91162','ARV',27,'2012-11-16 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91185','ARV',1,'2006-04-12 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91192','ARV',27,'2006-05-30 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91248','ARV',29,'2012-09-05 00:00:00',NULL,'30'),('00-0D-0D-2006-A-91264','ARV',43,'2014-06-14 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91316','ARV',26,'2006-05-08 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91339','ARV',41,'2009-02-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91346','ARV',27,'2006-09-27 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91355','ARV',27,'2006-06-29 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91368','ARV',27,'2007-11-01 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91381','ARV',29,'2006-12-13 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91400','ARV',27,'2014-12-29 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91439','ARV',27,'2006-11-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91460','ARV',27,'2008-09-21 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91461','ARV',27,'2006-11-23 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91503','ARV',26,'2008-01-30 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91542','ARV',27,'2006-10-04 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91561','ARV',29,'2006-06-22 00:00:00',NULL,'30'),('00-0D-0D-2006-A-91589','ARV',1,'2006-08-13 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91625','ARV',27,'2009-06-13 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91630','ARV',29,'2007-07-19 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91666','ARV',26,'2006-09-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91682','ARV',29,'2006-11-25 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91696','ARV',1,'2006-12-14 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91743','ARV',27,'2010-05-22 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91895','ARV',43,'2006-07-05 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91991','ARV',29,'2006-07-11 00:00:00',NULL,NULL),('00-0D-0D-2006-A-92086','ARV',43,'2004-05-15 00:00:00',NULL,NULL),('00-0D-0D-2007-A-00066','ARV',NULL,'2012-06-10 00:00:00',NULL,NULL),('00-0D-0D-2007-A-00561','ARV',NULL,'2007-06-15 00:00:00',NULL,NULL),('00-0D-0D-2007-A-03908','ARV',1,'2006-02-09 00:00:00',NULL,NULL),('00-0D-0D-2007-A-04133','ARV',1,'2007-07-10 00:00:00',NULL,NULL),('00-0D-0D-2007-A-04233','ARV',1,'2007-08-15 00:00:00','2012-06-15 00:00:00',NULL),('00-0D-0D-2007-A-04797','ARV',26,'2008-01-15 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91510','ARV',27,'2007-06-16 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91790','ARV',41,'2007-03-06 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91835','ARV',27,'2008-04-14 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91867','ARV',27,'2007-05-02 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91883','ARV',41,'2006-10-10 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91958','ARV',27,'2013-03-04 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91969','ARV',27,'2009-07-03 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91996','ARV',26,'2007-06-18 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92004','ARV',27,'2013-01-07 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92018','ARV',27,'2007-06-26 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92206','ARV',29,'2009-11-02 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92247','ARV',1,'2007-10-22 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92278','ARV',40,'2012-12-19 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92330','ARV',27,'2013-04-15 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92377','ARV',26,'2013-03-14 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00239','ARV',26,'2009-02-19 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00366','ARV',27,'2006-06-15 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00427','ARV',41,'2010-12-13 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00451','ARV',97,'2010-06-15 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00555','ARV',27,'2008-08-10 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00764','ARV',NULL,'2006-12-16 00:00:00',NULL,NULL),('00-0D-0D-2008-A-01146','ARV',27,'2013-01-30 00:00:00',NULL,NULL),('00-0D-0D-2008-A-01604','ARV',1,'2006-07-15 00:00:00',NULL,NULL),('00-0D-0D-2008-A-03807','ARV',NULL,'2008-08-01 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90097','ARV',43,'2013-03-01 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90102','ARV',27,'2009-02-23 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90135','ARV',29,'2007-08-15 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90240','ARV',27,'2008-07-15 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90282','ARV',27,'2009-05-06 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90306','ARV',27,'2008-09-16 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90337','ARV',43,'2011-10-10 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90362','ARV',27,'2013-02-06 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90750','ARV',41,'2008-07-15 00:00:00',NULL,NULL),('00-0D-0D-2008-A-92433','ARV',29,'2008-03-07 00:00:00',NULL,NULL),('00-0D-0D-2008-A-92455','ARV',27,'2012-12-20 00:00:00',NULL,NULL),('00-0D-0D-2008-A-92483','ARV',1,'2012-07-19 00:00:00',NULL,NULL),('00-0D-0D-2008-A-99986','ARV',91,'2019-08-11 00:00:00',NULL,NULL),('00-0D-0D-2009-A-00001','ARV',26,'2008-12-08 00:00:00',NULL,NULL),('00-0D-0D-2009-A-00208','ARV',27,'2009-04-20 00:00:00',NULL,NULL),('00-0D-0D-2009-A-00256','ARV',1,'2009-03-26 00:00:00',NULL,NULL),('00-0D-0D-2009-A-00579','ARV',28,'2009-12-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01067','ARV',26,'2009-05-18 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01107','ARV',1,'2009-03-22 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01304','ARV',26,'2009-08-22 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01784','ARV',NULL,'2012-12-10 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01997','ARV',NULL,'2009-05-28 00:00:00',NULL,NULL),('00-0D-0D-2009-A-02226','ARV',26,'2014-11-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90022','ARV',26,'2009-07-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90026','ARV',NULL,'2020-09-09 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90050','ARV',27,'2006-02-02 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90111','ARV',43,'2009-06-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90145','ARV',27,'2006-05-20 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90168','ARV',27,'2009-03-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90187','ARV',27,'2009-03-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90230','ARV',91,'2010-10-05 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90252','ARV',26,'2009-06-12 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90285','ARV',27,'2009-07-16 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90290','ARV',1,'2020-08-19 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90385','ARV',26,'2009-10-23 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90447','ARV',29,'2009-08-18 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90507','ARV',43,'2012-10-20 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90517','ARV',26,'2014-04-30 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90532','ARV',29,'2013-03-04 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90560','ARV',27,'2009-09-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90585','ARV',41,'2010-09-12 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90687','ARV',26,'2009-01-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90735','ARV',26,'2010-09-02 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90744','ARV',43,'2009-11-16 00:00:00',NULL,NULL),('00-0D-0D-2009-A-91516','ARV',29,'2006-06-20 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00027','ARV',27,'2006-09-07 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00170','ARV',43,'2003-06-26 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00627','ARV',26,'2009-11-10 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00713','ARV',26,'2010-07-15 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00925','ARV',27,'2010-03-14 00:00:00',NULL,NULL),('00-0D-0D-2010-A-01321','ARV',26,'2013-11-15 00:00:00',NULL,NULL),('00-0D-0D-2010-A-01325','ARV',1,'2010-04-10 00:00:00',NULL,NULL),('00-0D-0D-2010-A-01583','ARV',1,'2010-08-04 00:00:00',NULL,NULL),('00-0D-0D-2010-A-01620','ARV',43,'2010-04-19 00:00:00',NULL,NULL),('00-0d-0d-2010-A-01662','ARV',27,'2010-08-15 00:00:00',NULL,NULL),('00-0D-0D-2010-A-01826','ARV',1,'2009-09-24 00:00:00',NULL,NULL),('00-0D-0D-2010-A-02027','ARV',26,'2010-06-20 00:00:00','2011-03-15 00:00:00',NULL),('00-0D-0D-2010-A-02258','ARV',43,'2014-06-29 00:00:00',NULL,NULL),('00-0D-0D-2010-A-02264','ARV',1,'2007-10-29 00:00:00',NULL,NULL),('00-0D-0D-2010-A-02271','ARV',1,'2010-08-05 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90008','ARV',27,'2010-12-15 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90009','ARV',29,'2013-02-07 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90047','ARV',27,'2010-06-28 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90048','ARV',43,'2012-12-20 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90063','ARV',27,'2011-03-28 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90199','ARV',27,'2010-09-06 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90366','ARV',26,'2015-06-16 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90512','ARV',26,'2012-10-09 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90532','ARV',29,'2012-01-30 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90566','ARV',27,'2009-06-15 00:00:00',NULL,NULL),('00-0D-0D-2010-A-91125','ARV',27,'2008-05-15 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00070','ARV',98,'2011-02-10 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00093','ARV',1,'2010-06-15 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00095','ARV',26,'2011-01-24 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00237','ARV',1,'2008-09-10 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00633','ARV',NULL,'2011-05-16 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00634','ARV',NULL,'2009-10-30 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00652','ARV',27,'2011-03-08 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00928','ARV',NULL,'2007-12-03 00:00:00',NULL,NULL),('00-0D-0D-2011-A-01051','ARV',1,'2011-09-01 00:00:00',NULL,NULL),('00-0D-0D-2011-A-01102','ARV',5,'2009-12-03 00:00:00',NULL,NULL),('00-0D-0D-2011-A-01478','ARV',5,'2011-11-18 00:00:00',NULL,NULL),('00-0D-0D-2011-A-01487','ARV',27,'2010-02-01 00:00:00',NULL,NULL),('00-0D-0D-2011-A-90083','ARV',27,'2011-03-10 00:00:00',NULL,NULL),('00-0D-0D-2011-A-90144','ARV',27,'2011-05-06 00:00:00',NULL,NULL),('00-0D-0D-2011-A-90364','ARV',26,'2011-12-05 00:00:00',NULL,NULL),('00-0D-0D-2011-A-90940','ARV',43,'2011-02-20 00:00:00',NULL,NULL),('00-0D-0D-2011-A-91643','ARV',27,'2011-10-03 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00190','ARV',7,'2011-04-11 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00214','ARV',1,'2010-12-28 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00507','ARV',NULL,'2011-03-21 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00539','ARV',NULL,'2009-09-10 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00557','ARV',NULL,'2009-07-24 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00760','ARV',NULL,'2009-06-16 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00792','ARV',26,'2015-10-18 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00824','ARV',NULL,'2009-03-12 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00898','ARV',27,'2012-06-12 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00912','ARV',NULL,'2007-08-02 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01006','ARV',27,'2012-04-03 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01009','ARV',NULL,'2011-09-06 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01126','ARV',1,'2012-03-16 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01136','ARV',27,'2009-02-02 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01139','ARV',NULL,'2007-12-20 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01353','ARV',1,'2012-08-31 00:00:00',NULL,'14'),('00-0D-0D-2012-A-01529','ARV',27,'2010-01-01 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01638','ARV',NULL,'2010-02-08 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01849','ARV',NULL,'2010-10-12 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01911','ARV',1,'2012-10-27 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01943','ARV',5,'2012-11-02 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90084','ARV',1,'2012-03-11 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90096','ARV',26,'2012-06-15 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90131','ARV',26,'2007-10-01 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90150','ARV',NULL,'2004-08-04 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90193','ARV',27,'2012-10-10 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90196','ARV',43,'2013-02-04 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90221','ARV',NULL,'2014-05-19 00:00:00',NULL,'30'),('00-0D-0D-2012-A-90235','ARV',26,'2008-05-29 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90254','ARV',26,'2014-03-20 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90305','ARV',91,'2012-07-15 00:00:00',NULL,NULL),('00-0D-0D-2013-A-00324','ARV',1,'2010-06-15 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02070','ARV',27,'2012-12-29 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02984','ARV',27,'2012-01-10 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03047','ARV',27,'2013-09-13 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03068','ARV',98,'2013-10-03 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03165','ARV',49,'2012-09-27 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03212','ARV',26,'2011-10-03 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03215','ARV',26,'2013-11-13 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03263','ARV',7,'2013-11-29 00:00:00',NULL,NULL),('00-0D-0D-2013-A-90150','ARV',26,'2013-09-18 00:00:00',NULL,NULL),('00-0D-0D-2013-A-92046','ARV',27,'2004-08-17 00:00:00',NULL,NULL),('00-0D-0D-2013-A-92314','ARV',27,'2010-02-02 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02057','ARV',26,'2011-11-21 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02117','ARV',26,'2014-12-20 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02685','ARV',26,'2014-06-30 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02812','ARV',26,'2014-11-18 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02867','ARV',NULL,'2014-11-17 00:00:00','2014-12-01 00:00:00',NULL),('00-0D-0D-2014-A-99987','ARV',98,'2010-07-27 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02117','ARV',26,'2011-12-12 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02121','ARV',8,'2015-03-13 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02211','ARV',26,'2014-08-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02229','ARV',99,'2015-07-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02271','ARV',43,'2010-07-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02389','ARV',26,'2013-06-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02408','ARV',26,'2014-02-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02409','ARV',26,'2014-02-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02521','ARV',98,'2014-02-23 00:00:00',NULL,NULL),('00-0D-0D-2015-A-99989','ARV',26,'2011-03-11 00:00:00',NULL,NULL),('00-0D-0D-2015-A-99991','ARV',27,'2013-03-06 00:00:00',NULL,NULL),('00-0D-0D-2015-A-99992','ARV',26,'2014-06-05 00:00:00',NULL,NULL),('00-0D-0D-2015-A-99994','ARV',27,'2011-12-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-99995','ARV',26,'2011-06-09 00:00:00',NULL,NULL),('00-0D-0D-2015-A-99996','ARV',5,'2014-11-15 00:00:00','2015-03-19 00:00:00',NULL),('00-0D-0D-2016-A-02076','ARV',26,'2015-06-06 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02089','ARV',29,'2014-07-31 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02097','ARV',26,'2016-02-11 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02109','ARV',26,'2016-03-14 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02160','ARV',26,'2016-05-24 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02238','ARV',26,'2016-02-27 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02277','ARV',26,'2016-05-31 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02320','ARV',26,'2014-05-22 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02364','ARV',98,'2016-05-16 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02409','ARV',26,'2015-01-01 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02413','ARV',41,'2014-09-26 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02471','ARV',26,'2011-05-30 00:00:00',NULL,NULL),('00-0D-0D-2016-A-99992','ARV',98,'2006-06-15 00:00:00',NULL,NULL),('00-0D-0D-2016-A-99993','ARV',26,'2015-12-13 00:00:00','2016-10-09 00:00:00',NULL),('00-0D-0D-2016-A-99995','ARV',27,'2007-12-03 00:00:00',NULL,NULL),('00-0D-0D-2016-A-99996','ARV',26,'2011-05-05 00:00:00',NULL,NULL),('00-0D-0D-2016-A-99999','ARV',29,'2008-06-15 00:00:00',NULL,NULL),('00-0D-0D-2017-A-02046','ARV',26,'2016-09-01 00:00:00',NULL,NULL),('00-0D-0D-2017-A-02066','ARV',26,'2016-05-10 00:00:00','2017-02-14 00:00:00',NULL),('00-0D-0D-2017-A-99979','ARV',26,'1987-01-01 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99980','ARV',26,'2017-10-13 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99988','ARV',26,'2016-10-29 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99989','ARV',26,'2017-06-01 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99990','ARV',26,'2017-06-12 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99991','ARV',26,'2016-06-29 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99993','ARV',26,'2013-07-13 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99994','ARV',26,'2016-12-08 00:00:00',NULL,NULL),('00-0D-0D-2017-A-99996','ARV',26,'2012-01-19 00:00:00',NULL,NULL),('00-0d-0d-2018-A-02257','ARV',26,'2018-09-08 00:00:00',NULL,NULL),('00-0D-0D-2018-A-02369','ARV',26,'2018-11-06 00:00:00',NULL,NULL),('00-0D-0D-2018-A-99970','ARV',5,'2012-12-15 00:00:00',NULL,NULL),('00-0D-0D-2018-A-99972','ARV',26,'2012-01-14 00:00:00',NULL,NULL),('00-0D-0D-2018-A-99973','ARV',28,'2005-02-06 00:00:00','2005-03-06 00:00:00',NULL),('00-0D-0D-2018-A-99990','ARV',26,'2015-06-16 00:00:00',NULL,NULL),('00-0D-0D-2019-A-02376','ARV',97,'2019-06-17 00:00:00',NULL,NULL),('00-0D-0D-2019-A-02499','ARV',97,'2020-01-07 00:00:00',NULL,NULL),('00-0D-0D-2019-A-02629','ARV',NULL,'2019-12-29 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99965','ARV',26,'2016-05-15 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99966','ARV',91,'2017-12-12 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99967','ARV',91,'2014-03-15 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99977','ARV',41,'2016-09-15 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99981','ARV',6,'2012-08-12 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99984','ARV',91,'2016-06-05 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99994','ARV',91,'2011-06-26 00:00:00',NULL,NULL),('00-0D-0D-2019-A-99999','ARV',91,'2012-08-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-01000','ARV',91,'2009-08-01 00:00:00',NULL,NULL),('00-0D-0D-2020-A-01001','ARV',91,'2009-02-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-01004','ARV',97,'2007-12-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-01008','ARV',97,'2010-06-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-01014','ARV',27,'2018-11-01 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02016','ARV',26,'2019-08-01 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02046','ARV',97,'2020-01-29 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02050','ARV',97,'2020-01-30 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02051','ARV',97,'2020-01-30 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02052','ARV',97,'2020-01-30 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02053','ARV',97,'2020-01-30 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02063','ARV',97,'2020-02-05 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02064','ARV',97,'2020-02-05 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02186','ARV',97,'2020-01-01 00:00:00',NULL,NULL),('00-0D-0D-2020-A-02198','ARV',97,'2020-04-03 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99980','ARV',26,'2016-12-08 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99981','ARV',97,'2020-09-17 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99984','ARV',91,'2013-02-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99985','ARV',98,'2002-01-05 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99989','ARV',84,'2009-07-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99992','ARV',98,'2012-07-15 00:00:00',NULL,NULL),('00-0D-0D-2020-A-99997','ARV',97,'2019-01-05 00:00:00',NULL,NULL),('00-0E-01-2016-A-00572','ARV',26,'2016-06-28 00:00:00',NULL,NULL),('00-0F-01-2004-A-00151','ARV',98,'2013-03-22 00:00:00',NULL,NULL),('00-0F-02-2020-A-00076','ARV',97,'2020-05-14 00:00:00',NULL,NULL),('00-0F-18-2010-A-01757','ARV',26,'2010-09-13 00:00:00',NULL,NULL),('00-0F-20-2010-A-15107','ARV',97,'2010-07-15 00:00:00',NULL,NULL),('00-0F-20-2011-A-01054','ARV',43,'2011-09-05 00:00:00',NULL,NULL),('00-0F-29-2009-A-00121','ARV',26,'2009-11-25 00:00:00',NULL,NULL),('00-48-0A-2011-A-00016','ARV',43,'2008-06-28 00:00:00',NULL,NULL),('01-01-0A-2009-A-00019','ARV',91,'2017-03-15 00:00:00',NULL,NULL),('01-01-0A-2010-A-00126','ARV',1,'2012-10-01 00:00:00','2013-10-01 00:00:00','14'),('01-01-0B-2009-A-00405','ARV',98,'2009-01-19 00:00:00',NULL,NULL),('01-01-0C-2006-A-01988','ARV',1,'2008-02-04 00:00:00',NULL,NULL),('01-01-0C-2006-A-02739','ARV',26,'2006-04-19 00:00:00',NULL,NULL),('01-01-0C-2007-A-90914','ARV',43,'2007-01-15 00:00:00',NULL,NULL),('01-01-0C-2007-A-91816','ARV',41,'2007-02-18 00:00:00',NULL,NULL),('01-01-0C-2012-A-00323','ARV',26,'2012-10-20 00:00:00',NULL,NULL),('01-01-0C-2013-A-00303','ARV',26,'2013-12-15 00:00:00',NULL,NULL),('01-01-19-2013-A-00107','ARV',26,'2013-06-06 00:00:00',NULL,NULL),('01-01-31-2012-A-00023','ARV',26,'2014-07-23 00:00:00',NULL,NULL),('01-01-35-2012-A-00016','ARV',26,'2012-05-28 00:00:00',NULL,NULL),('01-02-00-2012-A-02998','ARV',26,'2012-12-14 00:00:00',NULL,NULL),('01-02-05-2010-A-00046','ARV',1,'2013-04-01 00:00:00','2015-07-01 00:00:00','14'),('01-03-0A-2007-A-01524','ARV',26,'2007-01-22 00:00:00',NULL,NULL),('01-03-29-2011-A-00077','ARV',27,'2011-02-28 00:00:00',NULL,NULL),('01-03-64-2014-A-00116','ARV',26,'2014-04-09 00:00:00',NULL,NULL),('01-04-06-2008-A-10398','ARV',NULL,'2006-10-15 00:00:00',NULL,NULL),('01-04-0B-2011-A-00185','ARV',26,'2014-07-01 00:00:00','2015-07-01 00:00:00','14'),('01-04-0B-2017-A-00076','ARV',26,'2017-05-23 00:00:00',NULL,NULL),('01-04-36-2013-A-00054','ARV',26,'2009-06-15 00:00:00',NULL,NULL),('01-05-0A-2006-A-90312','ARV',41,'2016-01-11 00:00:00',NULL,NULL),('01-05-0A-2008-A-80662','ARV',84,'2008-02-26 00:00:00',NULL,NULL),('01-05-0A-2010-A-00982','ARV',91,'2010-10-15 00:00:00',NULL,NULL),('01-05-0A-2010-A-80108','ARV',26,'2010-12-02 00:00:00',NULL,NULL),('01-05-0A-2012-A-01183','ARV',27,'2009-06-15 00:00:00',NULL,NULL),('01-05-0A-2016-A-00270','ARV',91,'2016-05-15 00:00:00',NULL,NULL),('01-05-0A-2017-A-00188','ARV',26,'2017-05-03 00:00:00',NULL,NULL),('01-05-0G-2014-A-00099','ARV',98,'2014-11-27 00:00:00',NULL,NULL),('01-05-16-2008-A-00016','ARV',91,'2008-07-15 00:00:00',NULL,NULL),('01-05-68-2013-A-00116','ARV',41,'2015-03-20 00:00:00',NULL,NULL),('01-06-0A-2014-A-00014','ARV',1,'2014-07-20 00:00:00',NULL,NULL),('01-0A-0C-2014-A-00333','ARV',27,'2014-04-03 00:00:00',NULL,NULL),('02-01-01-2014-A-00026','ARV',26,'2017-02-06 00:00:00',NULL,NULL),('02-01-0A-2006-A-00674','ARV',26,'2006-08-01 00:00:00',NULL,NULL),('02-01-0A-2013-A-00099','ARV',26,'2013-05-30 00:00:00',NULL,NULL),('02-01-61-2014-A-00147','ARV',26,'2014-04-01 00:00:00','2014-08-01 00:00:00','14'),('02-02-04-2014-A-00067','ARV',26,'2014-10-01 00:00:00',NULL,NULL),('02-02-09-2012-A-00026','ARV',27,'2012-01-20 00:00:00',NULL,NULL),('02-04-00-2009-A-00243','ARV',97,'2009-08-15 00:00:00',NULL,NULL),('02-04-00-2010-A-00125','ARV',91,'2011-05-05 00:00:00',NULL,NULL),('02-04-01-2010-A-00164','ARV',27,'2010-03-04 00:00:00',NULL,NULL),('02-04-0B-2010-A-00332','ARV',1,'2010-04-01 00:00:00','2011-10-01 00:00:00','14'),('02-04-0C-2009-A-00198','ARV',87,'2009-09-15 00:00:00',NULL,NULL),('02-04-0C-2013-A-00129','ARV',27,'2013-09-11 00:00:00',NULL,NULL),('02-04-25-2016-A-00006','ARV',91,'2016-01-25 00:00:00',NULL,NULL),('02-04-47-2014-A-00085','ARV',26,'2014-04-04 00:00:00','2014-04-14 00:00:00','14'),('02-05-04-2006-A-00637','ARV',41,'2006-02-04 00:00:00',NULL,NULL),('02-05-0A-2010-A-01410','ARV',26,'2012-07-01 00:00:00',NULL,NULL),('02-05-0B-2008-A-00401','ARV',27,'2010-12-03 00:00:00',NULL,NULL),('02-05-0B-2017-A-00185','ARV',26,'2017-08-10 00:00:00',NULL,NULL),('02-07-0A-2012-A-00414','ARV',27,'2012-06-14 00:00:00',NULL,NULL),('02-07-0B-2007-A-04805','ARV',31,'2007-01-01 00:00:00',NULL,NULL),('02-07-26-2017-A-00067','ARV',26,'2017-11-02 00:00:00',NULL,NULL),('03-01-0E-2016-A-00018','ARV',26,'2016-07-11 00:00:00',NULL,NULL),('03-01-35-2009-A-00885','ARV',26,'2009-07-08 00:00:00',NULL,NULL),('03-02-02-2012-A-00613','ARV',27,'2012-04-01 00:00:00','2013-04-15 00:00:00','14'),('03-02-0A-2012-A-00525','ARV',26,'2012-07-12 00:00:00',NULL,NULL),('03-02-0C-2011-A-90577','ARV',27,'2011-07-01 00:00:00',NULL,NULL),('03-02-0C-2012-A-00153','ARV',27,'2012-05-02 00:00:00',NULL,NULL),('03-02-0C-2013-A-00420','ARV',26,'2013-05-15 00:00:00',NULL,NULL),('03-02-0C-2016-A-00311','ARV',26,'2016-08-03 00:00:00',NULL,NULL),('03-02-26-2015-A-00027','ARV',26,'2015-02-09 00:00:00',NULL,NULL),('03-04-0A-2008-A-00198','ARV',91,'2008-07-15 00:00:00',NULL,NULL),('03-05-02-2012-A-00313','ARV',97,'2012-02-02 00:00:00',NULL,NULL),('03-05-04-2015-A-00227','ARV',26,'2015-11-12 00:00:00',NULL,NULL),('03-05-0A-2007-A-91270','ARV',26,'2008-05-03 00:00:00',NULL,NULL),('03-05-0A-2013-A-00318','ARV',1,'2013-01-24 00:00:00',NULL,NULL),('03-05-0B-2011-A-02352','ARV',26,'2011-12-15 00:00:00',NULL,NULL),('03-05-0B-2013-A-00004','ARV',27,'2013-07-15 00:00:00',NULL,NULL),('03-06-06-2011-A-00244','ARV',97,'2010-04-30 00:00:00',NULL,NULL),('03-07-0A-2010-A-04743','ARV',1,'2010-07-01 00:00:00','2012-11-01 00:00:00','14'),('03-07-0A-2010-A-05126','ARV',26,'2010-02-03 00:00:00','2015-07-17 00:00:00',NULL),('03-07-0A-2010-A-05326','ARV',1,'2004-07-15 00:00:00',NULL,NULL),('03-07-0C-2014-A-00116','ARV',26,'2014-04-15 00:00:00',NULL,NULL),('03-07-25-2016-A-00002','ARV',26,'2016-06-01 00:00:00','2016-07-01 00:00:00','14'),('03-07-27-2018-A-00044','ARV',26,'2018-07-02 00:00:00',NULL,'9/9/18'),('03-07-49-2014-A-00027','ARV',26,'2014-09-22 00:00:00',NULL,NULL),('03-08-04-2014-A-01464','ARV',27,'2014-09-23 00:00:00',NULL,NULL),('03-08-0A-2006-A-00030','ARV',27,'2006-01-01 00:00:00',NULL,NULL),('03-08-0A-2007-A-00245','ARV',98,'2012-04-04 00:00:00','2013-01-13 00:00:00',NULL),('03-08-0A-2010-A-00321','ARV',NULL,'2016-09-20 00:00:00',NULL,NULL),('03-08-0A-2010-A-00500','ARV',26,'2010-10-22 00:00:00',NULL,NULL),('03-08-0A-2014-A-00782','ARV',26,'2014-12-05 00:00:00',NULL,NULL),('03-08-0E-2016-A-00114','ARV',26,'2016-08-11 00:00:00',NULL,NULL),('03-09-0A-2014-A-00028','ARV',27,'2013-07-15 00:00:00',NULL,NULL),('03-09-0B-2013-A-00633','ARV',26,'2013-11-01 00:00:00',NULL,NULL),('03-09-26-2011-A-01727','ARV',41,'2015-05-15 00:00:00',NULL,NULL),('03-09-26-2013-A-04546','ARV',26,'2013-04-15 00:00:00',NULL,NULL),('03-09-27-2011-A-00335','ARV',26,'2011-10-28 00:00:00',NULL,NULL),('03-09-27-2013-A-00659','ARV',26,'2013-04-13 00:00:00',NULL,NULL),('03-09-27-2013-A-01855','ARV',26,'2013-12-13 00:00:00',NULL,NULL),('03-09-27-2016-A-00650','ARV',26,'2016-07-01 00:00:00','2016-08-01 00:00:00','14'),('03-09-90-2009-A-10444','ARV',26,'2009-03-02 00:00:00',NULL,NULL),('03-09-90-2016-A-00222','ARV',26,'2016-07-01 00:00:00','2016-08-11 00:00:00','14'),('04-01-04-2009-A-71754','ARV',26,'2009-10-01 00:00:00',NULL,NULL),('04-01-04-2017-A-00031','ARV',26,'2017-04-06 00:00:00',NULL,NULL),('04-01-0A-2009-A-00108','ARV',26,'2009-08-01 00:00:00',NULL,NULL),('04-01-0A-2009-A-93279','ARV',84,'2016-06-05 00:00:00',NULL,NULL),('04-01-0A-2013-A-01596','ARV',40,'2002-08-15 00:00:00',NULL,NULL),('04-01-0B-2014-A-00383','ARV',26,'2015-07-20 00:00:00',NULL,NULL),('04-01-0C-2019-A-00319','ARV',91,'2019-09-14 00:00:00',NULL,NULL),('04-02-01-2012-A-01510','ARV',27,'2012-06-15 00:00:00',NULL,NULL),('04-02-0A-2010-A-01241','ARV',27,'2010-11-19 00:00:00',NULL,NULL),('04-02-0A-2011-A-01123','ARV',1,'2011-07-07 00:00:00',NULL,NULL),('04-02-0A-2011-A-02387','ARV',27,'2011-11-25 00:00:00',NULL,NULL),('04-02-72-2014-A-00058','ARV',91,'2019-04-11 00:00:00',NULL,NULL),('04-03-0D-2010-A-00451','ARV',5,'2014-04-11 00:00:00',NULL,NULL),('04-03-0D-2011-A-00470','ARV',26,'2011-04-13 00:00:00',NULL,NULL),('04-03-0D-2012-A-00601','ARV',26,'2014-05-21 00:00:00',NULL,NULL),('04-03-30-2017-A-00105','ARV',26,'2018-01-09 00:00:00',NULL,NULL),('04-04-0A-2006-A-00668','ARV',NULL,'2006-04-21 00:00:00',NULL,NULL),('04-04-0A-2007-A-01445','ARV',26,'2007-09-01 00:00:00',NULL,NULL),('04-04-0A-2009-A-00733','ARV',NULL,'2009-08-06 00:00:00',NULL,NULL),('04-05-06-2007-A-00467','ARV',98,'2007-10-15 00:00:00',NULL,NULL),('04-05-0B-2009-A-01498','ARV',NULL,'2009-10-21 00:00:00',NULL,NULL),('04-05-0B-2014-A-00027','ARV',49,'2014-10-08 00:00:00',NULL,NULL),('04-05-0D-2013-A-90240','ARV',27,'2013-07-10 00:00:00',NULL,NULL),('04-06-04-2015-A-00044','ARV',26,'2015-10-21 00:00:00',NULL,NULL),('04-06-08-2009-A-00061','ARV',27,'2009-06-15 00:00:00',NULL,NULL),('04-06-0A-2005-A-00070','ARV',26,'2005-02-15 00:00:00',NULL,NULL),('04-06-0E-2006-A-00706','ARV',26,'2006-07-06 00:00:00',NULL,NULL),('04-06-44-2010-A-01422','ARV',26,'2010-08-01 00:00:00',NULL,NULL),('04-06-80-2015-A-99997','ARV',27,'2011-10-12 00:00:00',NULL,NULL),('04-06-83-2014-A-00099','ARV',26,'2013-05-20 00:00:00',NULL,NULL),('04-06-83-2014-A-00120','ARV',27,'2010-07-20 00:00:00',NULL,NULL),('04-08-0A-2009-A-03988','ARV',26,'2008-09-20 00:00:00',NULL,NULL),('04-08-0A-2014-A-00853','ARV',26,'2017-03-13 00:00:00',NULL,NULL),('04-08-79-2014-A-00119','ARV',26,'2013-10-01 00:00:00','2013-11-01 00:00:00','14'),('05-03-94-2018-A-00017','ARV',91,'2018-07-15 00:00:00',NULL,NULL),('05-05-0A-2010-A-00093','ARV',27,'2010-11-09 00:00:00',NULL,NULL),('06-01-0A-2008-A-02446','ARV',26,'2012-02-08 00:00:00',NULL,NULL),('06-01-0A-2013-A-01227','ARV',26,'2013-04-30 00:00:00',NULL,NULL),('06-01-0A-2013-A-03642','ARV',26,'2012-07-19 00:00:00',NULL,NULL),('06-01-0A-2014-A-00149','ARV',NULL,'2014-01-01 00:00:00',NULL,NULL),('06-01-26-2010-A-15107','ARV',1,'2012-04-01 00:00:00','2012-10-01 00:00:00','14'),('06-03-0A-2011-A-01477','ARV',26,'2012-10-09 00:00:00',NULL,NULL),('06-03-0A-2017-A-99996','ARV',26,'2017-01-24 00:00:00',NULL,NULL),('06-04-03-2016-A-00107','ARV',26,'2016-10-20 00:00:00',NULL,NULL),('06-04-0A-2014-A-00389','ARV',26,'2014-11-17 00:00:00',NULL,NULL),('07-01-0F-2005-A-01104','ARV',27,'2005-07-17 00:00:00',NULL,NULL),('07-01-0F-2006-A-00558','ARV',26,'2006-05-15 00:00:00',NULL,NULL),('07-01-0F-2009-A-01747','ARV',26,'2009-08-20 00:00:00',NULL,NULL),('07-03-0A-2009-A-07396','ARV',27,'2009-09-24 00:00:00',NULL,NULL),('07-03-0A-2011-A-00643','ARV',97,'2006-06-15 00:00:00',NULL,NULL),('07-03-63-2012-A-29446','ARV',27,'2011-06-15 00:00:00',NULL,NULL),('07-04-03-2012-A-00101','ARV',97,'2003-09-15 00:00:00',NULL,NULL),('07-04-06-2013-A-00655','ARV',26,'2013-03-13 00:00:00',NULL,NULL),('07-04-47-2007-A-00035','ARV',27,'2007-08-20 00:00:00',NULL,NULL),('07-04-62-2008-A-00229','ARV',97,'2008-10-28 00:00:00',NULL,NULL),('07-05-0C-2009-A-01196','ARV',27,'2016-01-11 00:00:00',NULL,NULL),('07-05-26-2015-A-00004','ARV',26,'2015-03-13 00:00:00',NULL,NULL),('07-06-0A-2013-A-00282','ARV',26,'2013-07-15 00:00:00',NULL,NULL),('07-07-03-2014-A-00010','ARV',26,'2016-04-24 00:00:00',NULL,NULL),('07-07-04-2009-A-00067','ARV',1,'2009-07-15 00:00:00',NULL,NULL),('07-07-0A-2011-A-01164','ARV',98,'2011-07-20 00:00:00',NULL,NULL),('07-08-0A-2011-A-02347','ARV',27,'2011-01-01 00:00:00',NULL,NULL),('07-08-0A-2011-A-02400','ARV',26,'2011-11-08 00:00:00',NULL,NULL),('07-08-0A-2013-A-00443','ARV',26,'2012-08-15 00:00:00',NULL,NULL),('07-08-0A-2015-A-00086','ARV',26,'2015-03-25 00:00:00',NULL,NULL),('07-08-0A-2015-A-00118','ARV',26,'2015-03-26 00:00:00',NULL,NULL),('07-08-30-2012-A-00239','ARV',26,'2012-04-04 00:00:00',NULL,NULL),('08-01-0B-2013-A-00101','ARV',27,'2014-07-21 00:00:00',NULL,NULL),('08-01-0C-2010-A-00084','ARV',27,'2010-10-10 00:00:00',NULL,NULL),('08-02-0A-2012-A-01255','ARV',NULL,'2012-10-03 00:00:00','2014-09-24 00:00:00',NULL),('08-02-0A-2014-A-00007','ARV',26,'2014-12-05 00:00:00',NULL,NULL),('08-02-33-2009-A-03239','ARV',27,'2009-06-30 00:00:00',NULL,NULL),('08-03-02-2011-A-00078','ARV',26,'2006-05-12 00:00:00',NULL,NULL),('08-03-07-2014-A-00059','ARV',26,'2015-03-10 00:00:00',NULL,NULL),('08-03-0A-2010-A-82297','ARV',27,'2013-06-06 00:00:00',NULL,NULL),('08-03-0A-2014-A-00519','ARV',27,'2014-11-06 00:00:00',NULL,NULL),('08-04-04-2012-A-00098','ARV',27,'2014-07-08 00:00:00',NULL,NULL),('08-04-09-2011-A-00389','ARV',84,'2011-07-15 00:00:00',NULL,NULL),('08-04-1A-2011-A-00408','ARV',NULL,'2011-04-08 00:00:00',NULL,NULL),('08-04-29-2017-A-00030','ARV',26,'2017-09-16 00:00:00',NULL,NULL),('08-04-34-2017-A-00025','ARV',26,'2018-06-20 00:00:00',NULL,NULL),('08-04-93-2008-A-00451','ARV',98,'2013-04-24 00:00:00',NULL,NULL),('08-05-0A-2010-A-01902','ARV',26,'2010-10-10 00:00:00',NULL,NULL),('08-05-0A-2013-A-01063','ARV',1,'2013-10-02 00:00:00',NULL,NULL),('08-05-0A-2019-A-00091','ARV',97,'2019-06-15 00:00:00',NULL,NULL),('08-05-0D-2009-A-00068','ARV',26,'2009-01-05 00:00:00',NULL,NULL),('08-05-0D-2011-A-00156','ARV',26,'2011-09-06 00:00:00',NULL,NULL),('08-05-0D-2011-A-90590','ARV',41,'2006-07-05 00:00:00',NULL,NULL),('08-07-0A-2012-A-00110','ARV',26,'2014-04-14 00:00:00',NULL,NULL),('08-07-0A-2012-A-00319','ARV',27,'2012-10-18 00:00:00','2015-02-09 00:00:00',NULL),('08-07-25-2011-A-00281','ARV',26,'2011-06-06 00:00:00',NULL,NULL),('08-07-34-2010-A-00565','ARV',27,'2011-12-30 00:00:00',NULL,NULL),('09-0A-01-2012-A-00285','ARV',26,'2012-08-23 00:00:00',NULL,NULL),('09-0A-05-2011-A-00138','ARV',26,'2010-02-26 00:00:00',NULL,NULL),('09-0A-06-2012-A-00203','ARV',27,'2012-07-10 00:00:00',NULL,NULL),('09-0A-07-2012-A-00712','ARV',26,'2012-03-23 00:00:00',NULL,NULL),('09-0A-11-2012-A-00186','ARV',27,'2012-03-15 00:00:00',NULL,NULL),('09-0A-12-2013-A-00495','ARV',26,'2015-08-31 00:00:00',NULL,NULL),('09-0A-17-2007-A-00605','ARV',91,'2007-05-15 00:00:00',NULL,NULL),('09-0A-18-2011-A-00168','ARV',26,'2012-06-20 00:00:00',NULL,NULL),('09-0A-18-2013-A-00518','ARV',26,'2013-06-27 00:00:00',NULL,NULL),('09-0A-40-2014-A-00486','ARV',26,'2014-09-08 00:00:00',NULL,NULL),('09-0C-02-2017-A-00066','ARV',26,'2017-02-13 00:00:00',NULL,NULL),('09-0C-0C-2011-A-00301','ARV',27,'2011-04-07 00:00:00',NULL,NULL),('09-0C-0C-2012-A-00020','ARV',26,'2012-06-16 00:00:00',NULL,NULL),('09-0C-0C-2017-A-00066','ARV',26,'2017-02-13 00:00:00',NULL,NULL),('09-0D-02-2006-A-90120','ARV',27,'2007-03-12 00:00:00',NULL,NULL),('09-0D-02-2010-A-00762','ARV',1,'2010-03-30 00:00:00',NULL,NULL),('09-0D-02-2010-A-04273','ARV',5,'2012-11-19 00:00:00',NULL,NULL),('09-0D-02-2010-A-04525','ARV',5,'2012-09-24 00:00:00',NULL,NULL),('09-0D-02-2012-A-01466','ARV',27,'2013-01-10 00:00:00',NULL,NULL),('09-0D-02-2013-A-00371','ARV',26,'2013-04-17 00:00:00',NULL,NULL),('09-0D-02-2014-A-00972','ARV',26,'2014-10-02 00:00:00',NULL,NULL),('09-0D-0D-2009-A-00851','ARV',26,'2009-04-29 00:00:00',NULL,NULL),('09-0D-0D-2020-A-99982','ARV',97,'2020-05-22 00:00:00',NULL,NULL),('00-00-00-2013-A-00029','COT',NULL,'2013-06-18 00:00:00',NULL,NULL),('00-0A-14-2016-A-00080','COT',NULL,'2016-04-15 00:00:00',NULL,NULL),('00-0a-20-2016-A-00141','COT',NULL,'2016-12-20 00:00:00',NULL,NULL),('00-0A-29-2011-A-20477','COT',NULL,NULL,NULL,NULL),('00-0A-45-2015-A-00251','COT',NULL,'2015-02-10 00:00:00',NULL,NULL),('00-0A-48-2012-A-00057','COT',NULL,NULL,NULL,NULL),('00-0a-63-2012-A-00525','COT',NULL,'2012-04-01 00:00:00',NULL,NULL),('00-0A-66-2016-A-00041','COT',NULL,'2016-10-06 00:00:00',NULL,NULL),('00-0B-02-2016-A-99958','COT',NULL,'2016-04-04 00:00:00',NULL,NULL),('00-0C-01-2011-A-01437','COT',NULL,NULL,NULL,NULL),('00-0C-0C-2013-A-01077','COT',NULL,NULL,NULL,NULL),('00-0C-0C-2013-A-01149','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2002-A-00995','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2003-A-00136','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2003-A-02352','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2003-A-80136','COT',NULL,'2006-08-24 00:00:00',NULL,NULL),('00-0D-0D-2003-A-90064','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00194','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00255','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2004-A-00363','COT',NULL,'2016-02-21 00:00:00',NULL,NULL),('00-0D-0D-2004-A-00364','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2004-A-00406','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00424','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00485','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00520','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00535','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00554','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2004-A-00608','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2004-A-00626','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2004-A-00730','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00822','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-00850','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2004-A-00965','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-02097','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-02229','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-03247','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-04311','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2004-A-80262','COT',NULL,'2003-01-01 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90227','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90262','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90279','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90315','COT',NULL,'2006-03-20 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90338','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90344','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90357','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90366','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90472','COT',NULL,'2006-08-24 00:00:00',NULL,'960'),('00-0D-0D-2004-A-90483','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90489','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90540','COT',NULL,'2004-04-15 00:00:00',NULL,NULL),('00-0D-0D-2004-A-90783','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2004-A-90799','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-00729','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-00867','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-00874','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2005-A-00974','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-00983','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01090','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01172','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01276','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01335','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01508','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2005-A-01539','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01603','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01622','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01655','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01680','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01687','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01691','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01810','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01825','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01890','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-02809','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-03161','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-80231','COT',NULL,'2005-09-08 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90029','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90047','COT',NULL,'2006-09-20 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90594','COT',NULL,'2005-01-06 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90595','COT',NULL,'2005-02-21 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90601','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90655','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90657','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90691','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90703','COT',NULL,'2006-04-03 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90728','COT',NULL,'2005-04-02 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90740','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90758','COT',NULL,'2013-04-02 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90803','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90808','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90851','COT',NULL,'2014-11-03 00:00:00',NULL,NULL),('00-0D-0D-2005-A-90876','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90953','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90972','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-91010','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-91135','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-00599','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-00905','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-01380','COT',NULL,'2007-06-08 00:00:00',NULL,NULL),('00-0D-0D-2006-A-01530','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-01876','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02111','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02114','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02119','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02148','COT',NULL,NULL,'2010-03-10 00:00:00','960'),('00-0D-0D-2006-A-02149','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02189','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02194','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2006-A-02225','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02314','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02357','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02363','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02425','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02426','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02483','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2006-A-02513','COT',NULL,'2006-02-10 00:00:00',NULL,'960'),('00-0D-0D-2006-A-02534','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02685','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02695','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2006-A-02706','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02739','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02769','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02802','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02819','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02852','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02948','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02951','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02960','COT',NULL,'2006-10-15 00:00:00',NULL,'960'),('00-0D-0D-2006-A-02970','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03029','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03041','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03057','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03058','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03069','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03080','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03082','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03094','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03126','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03141','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03177','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03201','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2006-A-03250','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03431','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03447','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03510','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03542','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03546','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03850','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2006-A-03907','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-90596','COT',NULL,'2005-01-06 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91063','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91082','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91096','COT',NULL,'2006-02-21 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91162','COT',NULL,'2008-03-23 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91185','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91192','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91248','COT',NULL,'2005-03-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91316','COT',NULL,'1999-07-26 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91339','COT',NULL,'2016-02-10 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91346','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91368','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91381','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91439','COT',NULL,'2006-08-16 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91460','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91461','COT',NULL,'2006-08-24 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91503','COT',NULL,'2008-01-30 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91542','COT',NULL,'2006-07-21 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91561','COT',NULL,NULL,NULL,'60'),('00-0D-0D-2006-A-91589','COT',NULL,'2006-08-13 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91625','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91630','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91666','COT',NULL,'2006-09-15 00:00:00',NULL,NULL),('00-0D-0D-2006-A-91682','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91743','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-92086','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-00724','COT',NULL,'2014-12-15 00:00:00',NULL,NULL),('00-0D-0D-2007-A-01188','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-01853','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-02168','COT',NULL,NULL,NULL,NULL),('00-0d-0d-2007-A-03116','COT',NULL,'2014-05-12 00:00:00',NULL,NULL),('00-0D-0D-2007-A-03397','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03437','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2007-A-03448','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03523','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03639','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03651','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03676','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03797','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03802','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03833','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-03908','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04050','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2007-A-04074','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04079','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04080','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04133','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04213','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04240','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04263','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04275','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04373','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04434','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04464','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04496','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04614','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04619','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04795','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2007-A-04804','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04919','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04940','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-04993','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-91510','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-91835','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-91867','COT',NULL,'2007-03-05 00:00:00',NULL,NULL),('00-0D-0D-2007-A-91969','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-91996','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-92004','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-92018','COT',NULL,'2007-06-26 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92020','COT',NULL,'2014-01-28 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92206','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-92270','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2007-A-92330','COT',NULL,'2013-01-15 00:00:00',NULL,NULL),('00-0D-0D-2007-A-92377','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00063','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00079','COT',NULL,'2010-11-15 00:00:00',NULL,'960'),('00-0D-0D-2008-A-00114','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00190','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00197','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00219','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00239','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00245','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2008-A-00253','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00297','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00306','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00307','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00336','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00337','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00366','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00382','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00399','COT',NULL,'2016-04-25 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00447','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2008-A-00480','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2008-A-00495','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00499','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00500','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00520','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00602','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00654','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00710','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00800','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00812','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00816','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-00899','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01006','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01071','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01088','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01145','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01146','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01191','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01245','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01275','COT',NULL,'2008-08-25 00:00:00',NULL,NULL),('00-0D-0D-2008-A-01300','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2008-A-01422','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01505','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01610','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2008-A-01648','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-01664','COT',NULL,'2008-11-14 00:00:00',NULL,'960'),('00-0D-0D-2008-A-01710','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-02374','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-02490','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-03081','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-04069','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2008-A-05018','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-90097','COT',NULL,'2013-03-01 00:00:00',NULL,NULL),('00-0D-0D-2008-A-90135','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-90282','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-90362','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-92433','COT',NULL,'2008-05-02 00:00:00',NULL,NULL),('00-0D-0D-2009-A-00053','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-00120','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00125','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00188','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00196','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00197','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00202','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00253','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00256','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-00270','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00276','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00299','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00358','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00360','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00371','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00412','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00468','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00486','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00493','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2009-A-00506','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00540','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00560','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00568','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00601','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00618','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00638','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00673','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00745','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00747','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00750','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00762','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00827','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-00844','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00859','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00887','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00901','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00918','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00933','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00934','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00946','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00959','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00976','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00985','COT',NULL,'2009-06-12 00:00:00',NULL,'960.'),('00-0D-0D-2009-A-01032','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01067','COT',NULL,'2009-05-18 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01091','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01107','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01163','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01166','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01177','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01193','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01194','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-01213','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01231','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01246','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01255','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01273','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01290','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-01308','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01317','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01318','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01334','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01382','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01396','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01408','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01410','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01417','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01450','COT',NULL,'2009-02-21 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01456','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01477','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-01500','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01511','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01534','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01591','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01609','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01617','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01622','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01646','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01658','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01669','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01683','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01710','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01744','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01751','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01784','COT',NULL,'2012-12-10 00:00:00',NULL,NULL),('00-0D-0D-2009-A-01798','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01819','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01821','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01835','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01839','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01870','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01910','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01950','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-01964','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01971','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01975','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02004','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02016','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02033','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02039','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02059','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02097','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02120','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02134','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-02166','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02167','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02202','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02203','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02220','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02248','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02262','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02321','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02328','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02339','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-02373','COT',NULL,'2016-10-04 00:00:00',NULL,NULL),('00-0D-0D-2009-A-02382','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-04940','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2009-A-90022','COT',NULL,'2009-07-15 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90145','COT',NULL,'2006-05-20 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90168','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-90187','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-90252','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-90285','COT',NULL,'2009-01-28 00:00:00',NULL,NULL),('00-0D-0D-2009-A-90447','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-90507','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-90517','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-90735','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-91516','COT',NULL,'2006-09-13 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00005','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00028','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00073','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00074','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00104','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00105','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00132','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00169','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-00180','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00220','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00288','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00289','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00297','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00307','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00418','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00421','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00426','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00479','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00480','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00485','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-00488','COT',NULL,'2010-03-10 00:00:00',NULL,'960'),('00-0D-0D-2010-A-00491','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00524','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00629','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00630','COT',NULL,'2010-03-26 00:00:00',NULL,NULL),('00-0D-0D-2010-A-00652','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00655','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00692','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-00696','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00706','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00719','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00720','COT',NULL,'2010-04-01 00:00:00',NULL,'960'),('00-0D-0D-2010-A-00744','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00757','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00790','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00794','COT',NULL,'2010-03-26 00:00:00',NULL,'960'),('00-0D-0D-2010-A-00800','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00844','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-00848','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00882','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00893','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-00932','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00961','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2010-A-00962','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00981','COT',NULL,'2010-04-29 00:00:00',NULL,'960'),('00-0D-0D-2010-A-00986','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-00993','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01006','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01058','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01072','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01077','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01120','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01172','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01191','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01266','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01279','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01284','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01314','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01321','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01322','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01325','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01361','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01367','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01436','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01441','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01452','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01472','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01489','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01497','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01501','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01526','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01530','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01532','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01534','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01567','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01583','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01590','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01601','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01635','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01672','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01730','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01738','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01752','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01757','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01781','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01815','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01819','COT',NULL,'2010-01-15 00:00:00',NULL,NULL),('00-0D-0D-2010-A-01826','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01833','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01836','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01854','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01862','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01917','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01958','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-01968','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01993','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-01998','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-02026','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02027','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02030','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02049','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-02057','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-02104','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2010-A-02111','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02131','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02132','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02135','COT',NULL,'2010-10-15 00:00:00',NULL,'960'),('00-0D-0D-2010-A-02156','COT',NULL,'2011-01-03 00:00:00',NULL,'960'),('00-0D-0D-2010-A-02163','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02165','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02203','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02207','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02211','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02220','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02261','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02264','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-04429','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-90008','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-90009','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-90047','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-90199','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-90366','COT',NULL,'2009-10-13 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90512','COT',NULL,'2010-11-09 00:00:00',NULL,NULL),('00-0D-0D-2010-A-90532','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-90566','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-91125','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00005','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00043','COT',NULL,'2011-01-05 00:00:00',NULL,'960'),('00-0D-0D-2011-A-00056','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00071','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00081','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00083','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00087','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00091','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00092','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00097','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00101','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00119','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00124','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00139','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00146','COT',NULL,'2011-05-10 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00148','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00194','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00229','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00232','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00237','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00262','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00266','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00276','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00284','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00287','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00288','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00289','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00309','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00341','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00356','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00359','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00367','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00380','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00384','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00401','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00433','COT',NULL,'2011-03-21 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00457','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00468','COT',NULL,'2011-02-26 00:00:00',NULL,NULL),('00-0D-0D-2011-A-00496','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00500','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00502','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00518','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00520','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00585','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00586','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00601','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00621','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00627','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00630','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00634','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00687','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00689','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2011-A-00705','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00752','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00792','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00803','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00846','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00850','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00851','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00859','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00869','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00891','COT',NULL,'2011-08-10 00:00:00',NULL,'960'),('00-0D-0D-2011-A-00899','COT',NULL,'2010-12-10 00:00:00',NULL,'960'),('00-0D-0D-2011-A-00903','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00917','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00920','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00928','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00932','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00933','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00934','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00945','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-00961','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00984','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01007','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01019','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01024','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01051','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01062','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01063','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01064','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01078','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01085','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01102','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01104','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01118','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01127','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01140','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01145','COT',NULL,'2011-10-31 00:00:00',NULL,'960'),('00-0D-0D-2011-A-01155','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01201','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01220','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01229','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01241','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01253','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01295','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01309','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01312','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01316','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01333','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01340','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01366','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01399','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01401','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2011-A-01403','COT',NULL,NULL,NULL,'960 05 10 2010'),('00-0D-0D-2011-A-01407','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01439','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01452','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01455','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01478','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01490','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01503','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-01525','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-02639','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-90083','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-90144','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-91643','COT',NULL,'2006-10-18 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00004','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00006','COT',NULL,'2016-05-18 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00008','COT',NULL,'2011-04-24 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00027','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00060','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00067','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00069','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00096','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00100','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00125','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00139','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00140','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00142','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00169','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00190','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00212','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00224','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00254','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00267','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00274','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00298','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00311','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00315','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00320','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00328','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00332','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00334','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00336','COT',NULL,'2012-02-29 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00338','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00344','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00359','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00364','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00375','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00376','COT',NULL,'2013-05-15 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00386','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00394','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00395','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00404','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00408','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00415','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00428','COT',NULL,'2014-07-23 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00433','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00455','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00480','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00481','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00539','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00545','COT',NULL,'2012-03-25 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00577','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00589','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00595','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00600','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00608','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00610','COT',NULL,'2012-05-04 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00612','COT',NULL,'2012-05-16 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00625','COT',NULL,'2012-05-16 00:00:00',NULL,'480'),('00-0D-0D-2012-A-00639','COT',NULL,NULL,'2012-05-02 00:00:00','960'),('00-0D-0D-2012-A-00641','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00648','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00651','COT',NULL,'2012-05-08 00:00:00',NULL,'480'),('00-0D-0D-2012-A-00653','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00655','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00676','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00683','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00705','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00706','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00727','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00729','COT',NULL,'2012-03-09 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00732','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00735','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00738','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00743','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00745','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00760','COT',NULL,'2009-05-18 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00770','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00772','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00785','COT',NULL,'2012-05-21 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00792','COT',NULL,'2015-10-18 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00799','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00800','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00813','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00819','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00823','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00824','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00827','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00829','COT',NULL,'2012-05-28 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00837','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00843','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00864','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00865','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00874','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00879','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00884','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00886','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00887','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00894','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00896','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00897','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00900','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00904','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00905','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-00916','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00931','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00954','COT',NULL,'2012-06-28 00:00:00',NULL,'960'),('00-0D-0D-2012-A-00980','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00981','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00982','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00983','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00986','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00992','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00995','COT',NULL,'2012-07-15 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01006','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01009','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01012','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01029','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01064','COT',NULL,'2012-07-16 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01066','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2012-A-01081','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01097','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01102','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01108','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01112','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01113','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01126','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01133','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01136','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2012-A-01139','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01148','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01158','COT',NULL,'2012-06-11 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01163','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01173','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01191','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01193','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01198','COT',NULL,NULL,NULL,'480'),('00-0D-0D-2012-A-01212','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01213','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01218','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01221','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01235','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01245','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01263','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01266','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01299','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01300','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01303','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01307','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01312','COT',NULL,'2012-12-03 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01331','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01339','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01350','COT',NULL,'2012-11-28 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01353','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01365','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01367','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01368','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01381','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01383','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01386','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01387','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01416','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01425','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01429','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01433','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01436','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01455','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01456','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01461','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01464','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01469','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01491','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01510','COT',NULL,'2012-10-11 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01511','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01517','COT',NULL,'2012-09-18 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01521','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01528','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01529','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01538','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01544','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01567','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01576','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01593','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01599','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01623','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01627','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01638','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01649','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01661','COT',NULL,'2012-10-14 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01669','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01683','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01693','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01696','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01702','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01707','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01710','COT',NULL,'2012-11-15 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01726','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01731','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01734','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01735','COT',NULL,'2012-11-12 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01736','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01748','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01754','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01755','COT',NULL,'2012-11-23 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01758','COT',NULL,NULL,'2012-11-22 00:00:00','480'),('00-0D-0D-2012-A-01759','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01761','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01762','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01767','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01770','COT',NULL,NULL,NULL,'980'),('00-0D-0D-2012-A-01776','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01782','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01796','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01799','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01805','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01807','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01814','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01816','COT',NULL,'2012-11-26 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01836','COT',NULL,'2012-11-25 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01839','COT',NULL,'2012-10-15 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01846','COT',NULL,'2012-10-10 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01849','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01850','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01852','COT',NULL,'2012-12-03 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01859','COT',NULL,'2012-12-13 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01864','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01866','COT',NULL,'2013-01-03 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01868','COT',NULL,'2012-12-06 00:00:00',NULL,'960'),('00-0D-0D-2012-A-01869','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01874','COT',NULL,NULL,NULL,'460'),('00-0D-0D-2012-A-01876','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01877','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01879','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01883','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01888','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2012-A-01889','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01891','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01908','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01911','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01912','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01916','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01917','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01931','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01932','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01935','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01937','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01941','COT',NULL,'2012-08-13 00:00:00',NULL,NULL),('00-0D-0D-2012-A-01943','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-02032','COT',NULL,'2013-01-15 00:00:00',NULL,'960'),('00-0D-0D-2012-A-02112','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90084','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90096','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90131','COT',NULL,'2007-10-01 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90150','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90171','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90193','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90196','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-90221','COT',NULL,'2014-05-19 00:00:00',NULL,'60'),('00-0D-0D-2012-A-90235','COT',NULL,'2008-05-29 00:00:00',NULL,NULL),('00-0D-0D-2012-A-90254','COT',NULL,'2013-02-11 00:00:00',NULL,NULL),('00-0D-0D-2013-A-00324','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-01903','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02000','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02001','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02006','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02010','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02012','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02013','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02017','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02023','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02024','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02026','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02027','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02038','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02042','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02044','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02048','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02049','COT',NULL,'2013-01-22 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02053','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02055','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02058','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02062','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02064','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02065','COT',NULL,'2013-01-29 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02069','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02070','COT',NULL,'2012-12-29 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02071','COT',NULL,'2013-01-24 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02072','COT',NULL,'2013-02-07 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02074','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02075','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02083','COT',NULL,'2013-01-21 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02084','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02085','COT',NULL,'2013-01-15 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02088','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02089','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02094','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02098','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02104','COT',NULL,NULL,NULL,'960'),('00-0D-0D-2013-A-02107','COT',NULL,'2013-01-23 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02111','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02115','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02126','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02127','COT',NULL,'2013-02-05 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02128','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02130','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02131','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02134','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02136','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02137','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02138','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02143','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02150','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02151','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02157','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02168','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02170','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02171','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02172','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02179','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02181','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02184','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02189','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02190','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02195','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02197','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02206','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02210','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02225','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02229','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02232','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02233','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02237','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02238','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02239','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02240','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02241','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02249','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02251','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02259','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02263','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02264','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02266','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02269','COT',NULL,'2013-06-20 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02270','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02272','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02273','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02275','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02277','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02278','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02281','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02290','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02293','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02300','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02307','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02308','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02311','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02313','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02315','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02317','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02318','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02330','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02336','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02346','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02349','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02351','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02353','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02354','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02355','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02357','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02359','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02365','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02366','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02371','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02372','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02376','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02383','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02389','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02392','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02395','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02396','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02399','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02405','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02416','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02417','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02421','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02425','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02429','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02431','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02433','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02435','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02436','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02438','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02440','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02441','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02443','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02444','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02445','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02446','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02449','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02450','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02451','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02454','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02465','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02467','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02469','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02479','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02484','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02486','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02493','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02511','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02512','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02516','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02522','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02532','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02533','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02534','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02538','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02541','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02545','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02547','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02549','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02558','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02559','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02560','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02561','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02562','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02566','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02569','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02573','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02575','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02577','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02587','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02588','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02595','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02599','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02602','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02605','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02607','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02620','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02625','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02628','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02645','COT',NULL,'2016-09-29 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02646','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02650','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02673','COT',NULL,'2013-06-15 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02682','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02683','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02713','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02714','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02725','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02732','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02745','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02750','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02751','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02755','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02757','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02759','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02760','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02767','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02772','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02775','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02776','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02781','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02790','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02791','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02793','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02802','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02803','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02807','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02818','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02823','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02824','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02831','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02838','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02846','COT',NULL,'2013-05-23 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02850','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02864','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02866','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02872','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02873','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02878','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02880','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02881','COT',NULL,NULL,NULL,NULL),('00-0d-0d-2013-A-02887','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02890','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02901','COT',NULL,'2013-08-14 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02903','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02908','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02910','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02916','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02925','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02928','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02929','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02930','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02931','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02935','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02938','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02939','COT',NULL,'2003-01-15 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02942','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02943','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02944','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02950','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02960','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02965','COT',NULL,'2013-09-15 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02966','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02970','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02972','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02974','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02978','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02984','COT',NULL,'2012-01-10 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02986','COT',NULL,'2013-11-25 00:00:00',NULL,NULL),('00-0D-0D-2013-A-02988','COT',NULL,'2013-09-10 00:00:00',NULL,'960'),('00-0D-0D-2013-A-02992','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02993','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02997','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03001','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03002','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03006','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03014','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03017','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03019','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03020','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03021','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03024','COT',NULL,'2013-09-16 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03027','COT',NULL,'2013-09-16 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03029','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03034','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03037','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03038','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03039','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03041','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03042','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03046','COT',NULL,'2005-01-15 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03050','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03052','COT',NULL,'2013-09-20 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03064','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03067','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03073','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03076','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03088','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03093','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03094','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03100','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03101','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03111','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03116','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03118','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03121','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03131','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03132','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03133','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03140','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03141','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03142','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03147','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03151','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03153','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03163','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03178','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03183','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03184','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03186','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03199','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03203','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03206','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03214','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03219','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03220','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03221','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03222','COT',NULL,'2013-11-17 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03223','COT',NULL,'2013-11-21 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03231','COT',NULL,'2013-11-26 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03232','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03233','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03235','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03239','COT',NULL,'2013-11-27 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03243','COT',NULL,'2013-12-25 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03253','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03259','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03261','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03263','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03264','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03267','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03268','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03269','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03270','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03274','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03277','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03278','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03285','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03287','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03288','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03291','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03293','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03299','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03303','COT',NULL,NULL,NULL,NULL),('00-0d-0d-2013-A-03308','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03309','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03311','COT',NULL,'2013-12-11 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03314','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03315','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03316','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03317','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03318','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03320','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-90598','COT',NULL,'2005-05-28 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02016','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02017','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02022','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02023','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02026','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02027','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02031','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02032','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02033','COT',NULL,'2013-12-01 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02038','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02045','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02046','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02058','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02064','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02066','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02072','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02074','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02092','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02095','COT',NULL,'2014-01-08 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02097','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02112','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02119','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02121','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02123','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02125','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02126','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02129','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02150','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02154','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02155','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02157','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02169','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02175','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02177','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02185','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02189','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02190','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02195','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02205','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02211','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02215','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02217','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02220','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02227','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02229','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02233','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02236','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02245','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02252','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02254','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02256','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02266','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02267','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02271','COT',NULL,'2014-04-08 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02275','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02281','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02292','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02309','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02317','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02329','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02334','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02352','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02364','COT',NULL,'2014-04-24 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02383','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02392','COT',NULL,'2014-04-04 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02424','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02433','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02434','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02453','COT',NULL,'2011-07-15 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02458','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02465','COT',NULL,'2014-06-05 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02471','COT',NULL,'2014-06-11 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02492','COT',NULL,'2014-06-11 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02493','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02494','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02499','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02500','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02509','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02512','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02521','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02523','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02530','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02553','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02559','COT',NULL,'2001-01-20 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02566','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02597','COT',NULL,'2014-07-13 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02607','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02611','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02618','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02619','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02629','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02633','COT',NULL,'2014-05-27 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02644','COT',NULL,'2014-08-27 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02651','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02654','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02656','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02660','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02665','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02667','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02668','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02670','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02671','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02672','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02673','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02676','COT',NULL,'2014-08-28 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02677','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02678','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02686','COT',NULL,'2014-08-29 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02693','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02694','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02696','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02713','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02721','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02725','COT',NULL,'2014-09-23 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02726','COT',NULL,'2014-09-23 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02727','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02730','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02733','COT',NULL,'2014-09-30 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02747','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02772','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02773','COT',NULL,'2014-08-14 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02776','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02790','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02799','COT',NULL,'2014-10-20 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02803','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02807','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02812','COT',NULL,'2014-11-18 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02814','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02825','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02834','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02838','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02840','COT',NULL,'2014-11-12 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02847','COT',NULL,'2014-11-03 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02849','COT',NULL,'2014-11-18 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02850','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02852','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02854','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02856','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02858','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02859','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02861','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02862','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02868','COT',NULL,'2014-10-18 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02869','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02870','COT',NULL,'2014-11-28 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02873','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02874','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02875','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02882','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02884','COT',NULL,'2014-12-15 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02896','COT',NULL,'2014-12-15 00:00:00',NULL,'960'),('00-0D-0D-2014-A-99986','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-99995','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02000','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02001','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02002','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02006','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02007','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02011','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02014','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02021','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02026','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02028','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02029','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02031','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02034','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02035','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02036','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02037','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02038','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02042','COT',NULL,'2015-01-28 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02045','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02047','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02078','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02090','COT',NULL,'2015-02-25 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02112','COT',NULL,'2015-03-16 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02123','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02144','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02145','COT',NULL,'2015-04-02 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02146','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02148','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02151','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02152','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02163','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02170','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02196','COT',NULL,'2015-05-05 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02197','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02198','COT',NULL,'2015-05-19 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02206','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02209','COT',NULL,'2015-05-18 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02215','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02227','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02236','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02255','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02266','COT',NULL,'2015-07-09 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02277','COT',NULL,'2015-07-07 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02278','COT',NULL,'2015-07-07 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02279','COT',NULL,'2015-07-15 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02280','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02288','COT',NULL,'2015-07-06 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02292','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02293','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02301','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02303','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02313','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02318','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02323','COT',NULL,'2016-02-09 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02324','COT',NULL,'2015-08-06 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02339','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02349','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02356','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02359','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02360','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02370','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02379','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02384','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02396','COT',NULL,'2015-09-21 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02405','COT',NULL,'2015-09-23 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02411','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02419','COT',NULL,'2015-09-28 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02430','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02458','COT',NULL,'2015-11-02 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02481','COT',NULL,'2015-11-11 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02485','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02498','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02503','COT',NULL,'2015-12-07 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02521','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02915','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-20001','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02001','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02020','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02024','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02042','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02044','COT',NULL,'2016-01-27 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02047','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02048','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02050','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02067','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02068','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02069','COT',NULL,'2016-02-15 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02071','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02073','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02075','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02076','COT',NULL,'2015-06-06 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02079','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02081','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02085','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02088','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02089','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02097','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02107','COT',NULL,'2016-03-17 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02137','COT',NULL,'2016-03-16 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02147','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02150','COT',NULL,'2016-04-25 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02162','COT',NULL,'2016-04-26 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02182','COT',NULL,'2016-05-13 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02185','COT',NULL,'2016-05-09 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02191','COT',NULL,'2016-05-18 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02210','COT',NULL,'2016-06-07 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02211','COT',NULL,'2016-06-02 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02274','COT',NULL,'2016-06-25 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02277','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02320','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02367','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02380','COT',NULL,'2010-10-10 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02409','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02413','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02473','COT',NULL,'2016-11-08 00:00:00',NULL,NULL),('00-0D-0D-2017-A-02020','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2017-A-02046','COT',NULL,NULL,NULL,NULL),('00-0D-0D-2017-A-02066','COT',NULL,NULL,'2017-01-13 00:00:00',NULL),('00-0d-0d-2017-A-02170','COT',NULL,'2017-05-10 00:00:00',NULL,NULL),('00-0d-0d-2018-A-02255','COT',NULL,NULL,NULL,NULL),('00-0d-0d-2018-A-02256','COT',NULL,NULL,NULL,NULL),('00-0d-0d-2018-A-02259','COT',NULL,NULL,NULL,NULL),('00-0d-0d-2018-A-02270','COT',NULL,'2018-09-17 00:00:00',NULL,NULL),('00-0D-0D-2019-A-02242','COT',NULL,NULL,'2019-04-24 00:00:00',NULL),('00-0D-0D-2020-A-99997','COT',NULL,'2019-01-05 00:00:00',NULL,NULL),('00-0F-01-2004-A-00151','COT',NULL,NULL,NULL,NULL),('01-01-0C-2007-A-91816','COT',NULL,NULL,NULL,NULL),('01-05-0A-2006-A-90312','COT',NULL,'2016-01-10 00:00:00',NULL,NULL),('01-0A-0C-2014-A-00333','COT',NULL,NULL,NULL,NULL),('02-01-01-2014-A-00026','COT',NULL,'2017-02-06 00:00:00',NULL,NULL),('02-01-0A-2006-A-00674','COT',NULL,NULL,NULL,NULL),('02-04-0B-2014-A-00142','COT',NULL,NULL,NULL,NULL),('02-04-0C-2013-A-00129','COT',NULL,'2008-06-15 00:00:00',NULL,NULL),('02-04-10-2010-A-00195','COT',NULL,NULL,NULL,NULL),('02-05-0B-2008-A-00401','COT',NULL,NULL,NULL,NULL),('03-01-0A-2015-A-90219','COT',NULL,'2017-10-16 00:00:00',NULL,'cd4'),('03-03-33-2013-A-00118','COT',NULL,'2012-12-17 00:00:00',NULL,NULL),('03-05-04-2015-A-00227','COT',NULL,'2015-11-12 00:00:00',NULL,NULL),('03-05-0A-2007-A-91270','COT',NULL,'2008-05-03 00:00:00',NULL,NULL),('03-05-0A-2013-A-00318','COT',NULL,NULL,NULL,NULL),('03-07-0A-2010-A-05126','COT',NULL,NULL,NULL,NULL),('03-07-0A-2010-A-05326','COT',NULL,'2004-07-15 00:00:00',NULL,NULL),('03-08-0A-2007-A-00245','COT',NULL,NULL,NULL,NULL),('03-08-0A-2010-A-00500','COT',NULL,'2010-10-22 00:00:00',NULL,NULL),('03-09-23-2014-A-00019','COT',NULL,NULL,NULL,NULL),('04-02-37-2017-A-00013','COT',NULL,'2017-10-15 00:00:00',NULL,NULL),('04-04-0A-2007-A-01445','COT',NULL,'2007-09-01 00:00:00',NULL,NULL),('04-05-0D-2013-A-90240','COT',NULL,'2013-07-10 00:00:00',NULL,NULL),('04-06-04-2015-A-00044','COT',NULL,NULL,NULL,NULL),('04-06-0A-2005-A-00070','COT',NULL,NULL,NULL,NULL),('05-04-0A-2007-A-50505','COT',NULL,NULL,NULL,NULL),('06-01-0A-2013-A-01227','COT',NULL,NULL,NULL,NULL),('06-01-0A-2013-A-03642','COT',NULL,NULL,NULL,NULL),('07-01-0F-2006-A-00558','COT',NULL,'2006-05-15 00:00:00',NULL,NULL),('07-05-26-2015-A-00004','COT',NULL,'2015-03-13 00:00:00',NULL,NULL),('07-06-0A-2013-A-00282','COT',NULL,NULL,NULL,NULL),('07-08-0A-2013-A-00443','COT',NULL,NULL,NULL,NULL),('08-01-0B-2013-A-00101','COT',NULL,'2013-09-11 00:00:00',NULL,NULL),('08-03-02-2011-A-00078','COT',NULL,'2011-12-06 00:00:00',NULL,NULL),('08-03-24-2016-A-00058','COT',NULL,'2016-09-15 00:00:00',NULL,NULL),('08-04-93-2008-A-00451','COT',NULL,NULL,NULL,NULL),('08-07-34-2010-A-00565','COT',NULL,NULL,NULL,NULL),('09-0A-01-2012-A-00285','COT',NULL,NULL,NULL,NULL),('09-0A-12-2013-A-00495','COT',NULL,NULL,NULL,NULL),('09-0A-18-2013-A-00518','COT',NULL,NULL,NULL,NULL),('09-0C-0C-2009-A-01128','COT',NULL,NULL,NULL,NULL),('09-0C-0C-2012-A-00020','COT',NULL,'2012-03-14 00:00:00',NULL,NULL),('00-0A-14-2016-A-00080','FLU',NULL,'2016-04-15 00:00:00',NULL,NULL),('00-0D-0D-2005-A-01655','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-01810','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2005-A-90808','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-01876','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02314','FLU',NULL,NULL,NULL,'200'),('00-0D-0D-2006-A-02363','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-91096','FLU',NULL,'2006-02-21 00:00:00',NULL,NULL),('00-0D-0D-2008-A-00336','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-05018','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00202','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-00946','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2009-A-01744','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02027','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2010-A-02030','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-90144','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00069','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00792','FLU',NULL,'2015-10-11 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00905','FLU',NULL,NULL,'2012-05-16 00:00:00','200'),('00-0D-0D-2012-A-01754','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01888','FLU',NULL,NULL,NULL,'800'),('00-0D-0D-2013-A-02038','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02467','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02538','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02607','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02750','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02803','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02846','FLU',NULL,'2013-06-21 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03024','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03067','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02628','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02670','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02730','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02773','FLU',NULL,'2014-08-14 00:00:00',NULL,NULL),('00-0D-0D-2014-A-02862','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02875','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02148','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2015-A-02196','FLU',NULL,'2015-05-05 00:00:00',NULL,NULL),('00-0D-0D-2016-A-02079','FLU',NULL,NULL,NULL,NULL),('03-08-0A-2007-A-00245','FLU',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03041','NVP',NULL,'2013-12-18 00:00:00',NULL,NULL),('00-0D-0D-2013-A-03271','NVP',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-02802','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2008-A-05018','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2011-A-00401','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01163','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01435','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-00079','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02990','OTH',NULL,NULL,NULL,NULL),('00-0d-0d-2018-A-02260','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2018-A-02304','OTH',NULL,NULL,NULL,NULL),('00-0D-0D-2018-A-02408','OTH',NULL,NULL,NULL,NULL),('00-0F-25-2014-A-00793','OTH',NULL,NULL,NULL,NULL),('03-08-0A-2007-A-00245','OTH',NULL,NULL,NULL,NULL),('03-09-26-2011-A-01727','OTH',NULL,'2015-02-03 00:00:00','2015-05-15 00:00:00',NULL),('04-06-49-2016-A-00011','OTH',NULL,NULL,NULL,NULL),('05-04-0A-2007-A-57587','PPG',NULL,NULL,NULL,NULL),('00-0A-14-2016-A-00080','TB1',NULL,'2016-04-15 00:00:00',NULL,NULL),('00-0C-01-2018-A-00048','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2006-A-03510','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00069','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00336','TB1',NULL,'2012-02-29 00:00:00',NULL,NULL),('00-0D-0D-2012-A-00595','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01182','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01669','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01754','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01839','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-01917','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02049','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02062','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02085','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02126','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02166','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02240','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02443','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02467','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02650','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02881','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-02930','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2013-A-03042','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02089','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02205','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02256','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02316','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2014-A-02868','TB1',NULL,'2014-11-13 00:00:00',NULL,NULL),('00-0D-0D-2015-A-02280','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-02079','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2016-A-99997','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2018-A-02316','TB1',NULL,NULL,NULL,NULL),('03-08-0A-2007-A-00245','TB1',NULL,NULL,NULL,NULL),('00-0D-0D-2012-A-00792','TB2',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tblpatientspriorexposure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpatientsproblems`
--

DROP TABLE IF EXISTS `tblpatientsproblems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblpatientsproblems` (
  `PatientID` varchar(21) NOT NULL DEFAULT '',
  `ProblemAcronym` varchar(3) NOT NULL DEFAULT '',
  `Notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ProblemAcronym`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpatientsproblems`
--

LOCK TABLES `tblpatientsproblems` WRITE;
/*!40000 ALTER TABLE `tblpatientsproblems` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpatientsproblems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpregnancies`
--

DROP TABLE IF EXISTS `tblpregnancies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblpregnancies` (
  `PatientID` varchar(21) NOT NULL,
  `DueDate` datetime NOT NULL,
  `BirthLocation` varchar(255) DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  `ANCnumber` varchar(50) DEFAULT NULL,
  `DateOfBirth` datetime DEFAULT NULL,
  `PregnancyOutcomeID` varchar(1) DEFAULT NULL,
  `NumberLiveBorn` int DEFAULT NULL,
  `LDProphylaxisARVCode` int DEFAULT NULL,
  `DeliveryModeID` varchar(3) DEFAULT NULL,
  `PresentationID` varchar(3) DEFAULT NULL,
  `TearID` varchar(3) DEFAULT NULL,
  `AssistanceID` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`DueDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpregnancies`
--

LOCK TABLES `tblpregnancies` WRITE;
/*!40000 ALTER TABLE `tblpregnancies` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpregnancies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproblems`
--

DROP TABLE IF EXISTS `tblproblems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblproblems` (
  `PatientID` varchar(21) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `ProblemAcronym` varchar(6) NOT NULL,
  PRIMARY KEY (`ProblemAcronym`,`VisitDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproblems`
--

LOCK TABLES `tblproblems` WRITE;
/*!40000 ALTER TABLE `tblproblems` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblproblems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblreferralsto`
--

DROP TABLE IF EXISTS `tblreferralsto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblreferralsto` (
  `PatientID` varchar(21) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `ReferralToCode` varchar(1) NOT NULL,
  PRIMARY KEY (`ReferralToCode`,`VisitDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblreferralsto`
--

LOCK TABLES `tblreferralsto` WRITE;
/*!40000 ALTER TABLE `tblreferralsto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblreferralsto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblrequestdates`
--

DROP TABLE IF EXISTS `tblrequestdates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblrequestdates` (
  `PeriodEndDate` datetime NOT NULL,
  `SentDate` datetime DEFAULT NULL,
  PRIMARY KEY (`PeriodEndDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblrequestdates`
--

LOCK TABLES `tblrequestdates` WRITE;
/*!40000 ALTER TABLE `tblrequestdates` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblrequestdates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblrequests`
--

DROP TABLE IF EXISTS `tblrequests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblrequests` (
  `MSDCode` varchar(8) NOT NULL,
  `PeriodEndDate` datetime NOT NULL,
  `QuantityRequested` int DEFAULT NULL,
  `Remarks` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MSDCode`,`PeriodEndDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblrequests`
--

LOCK TABLES `tblrequests` WRITE;
/*!40000 ALTER TABLE `tblrequests` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblrequests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupadverseeventsstatus`
--

DROP TABLE IF EXISTS `tblsetupadverseeventsstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupadverseeventsstatus` (
  `AdverseEventsStatusCode` varchar(50) NOT NULL,
  `AdverseEventsStatusDescription` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`AdverseEventsStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupadverseeventsstatus`
--

LOCK TABLES `tblsetupadverseeventsstatus` WRITE;
/*!40000 ALTER TABLE `tblsetupadverseeventsstatus` DISABLE KEYS */;
INSERT INTO `tblsetupadverseeventsstatus` VALUES ('a=INH1','adverse events reported on INH'),('b=INH2','stopping INH due adverse events'),('c=CTX1','adverse events reported on CTX'),('d=CTX2','stopping CTX due to adverse events'),('e=Diflucan1','adverse events repoted on Diflucan'),('f=Diflucan2','stopping Diflucan due to adverse event'),('g=ART 1st line 1','adverse events reported on 1st line ART'),('h=ART 1st line 2','stopping 1st line ART due to adverse events'),('i=ART 2nd regimen 1','adverse events reported on 2nd line ART'),('J=ART 2ndregimen 2','stopping 2nd line ART due to adverse events'),('k=ART 3rd regimen 1','adverse events reported on 3rd line ART'),('l=ART 3rd regimen 2','stopping 3rd line ART due to adverse events');
/*!40000 ALTER TABLE `tblsetupadverseeventsstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuparvfixeddosecombinations`
--

DROP TABLE IF EXISTS `tblsetuparvfixeddosecombinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuparvfixeddosecombinations` (
  `ARVcode` int NOT NULL,
  `ARVName` varchar(50) DEFAULT NULL,
  `ARVDescription` varchar(100) DEFAULT NULL,
  `V2Code` varchar(50) DEFAULT NULL,
  `RegimenType` varchar(50) DEFAULT NULL,
  `Adults` int DEFAULT NULL,
  `Peds` int DEFAULT NULL,
  `PharmCode` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`ARVcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuparvfixeddosecombinations`
--

LOCK TABLES `tblsetuparvfixeddosecombinations` WRITE;
/*!40000 ALTER TABLE `tblsetuparvfixeddosecombinations` DISABLE KEYS */;
INSERT INTO `tblsetuparvfixeddosecombinations` VALUES (1,'','d4T (30), 3TC, NVP','1a(30)','First line',-1,0,'AT002'),(5,'','AZT, 3TC, NVP','1c','First line',-1,0,'AT004'),(6,'','AZT, 3TC, EFV','1d','First line',-1,0,'AT005'),(7,'','d4T (30), 3TC, EFV','1b(30)','First line',-1,0,'AT003'),(8,'','ABC, ddl, LPV/r','2c','Second line',-1,0,'AT011/AT012'),(23,'','d4T, 3TC, EFV','4b','First line',0,-1,'PT003'),(26,'','TDF, 3TC, EFV','1f','First line',-1,0,'AT006'),(27,'','TDF, 3TC, NVP','1e','First line',-1,0,'AT001'),(28,'','ABC, ddI, ATV/r','2f','Second line',-1,0,'AT013/AT014'),(29,'','TDF, 3TC, LPV/r','2b','Second line',-1,0,'AT009'),(31,'','ABC, 3TC, LPV/r','5b','Second line',0,-1,'PT010'),(40,'','AZT, 3TC, LPV/r','2a','Second line',-1,0,'AT015'),(41,'','AZT, 3TC, ATV/r','2d','Second line',-1,0,'AT016'),(42,'','AZT, 3TC, LPV/r','4e','First line',0,-1,'PT005'),(43,'','TDF, 3TC, ATV/r','2e','Second line',-1,0,'AT010'),(44,'','AZT, 3TC, NVP  (paediatric dose)','4c','First line',0,-1,'PT002'),(45,'','AZT, 3TC, EFV (paediatric dose)','4d','First line',0,-1,'PT004'),(46,'','ABC,DDI,LPV/r','4f','First line',0,-1,''),(47,'','ABC, ddl, LPV/r (paediatric dose)','5a','Second line',0,-1,'PT007'),(48,'','AZT,3TC,NVP','5c','Second line',0,-1,''),(80,'','sdNVP','P-sdNVP','PLD',-1,0,''),(81,'','AZT','6a','PPG',-1,0,''),(83,'','sdNVP, AZT+3TC tail','P-NA3','PLD',-1,0,''),(84,'','ABC,DDI400,LPV/r','2g','Second line',-1,0,''),(85,'','AZT,DDI250,LPV/r','2i','Second line',-1,0,''),(86,'','ABC,DDI400/ATV/r','2j','Second line',-1,0,''),(87,'','RAL,DRV/RTV','3a','Third line',-1,0,''),(90,'','d4T, 3TC, NVP (paediatric dose)','4a','First line',0,-1,'PT001'),(91,'','TDF,3TC,EFV 400','1h','First line',-1,0,''),(97,'','TDF,3TC,DTG (TLD 1)','1i','First line',-1,0,''),(98,'','ABC,3TC,DTG','2k','Second line',-1,0,''),(99,'','AZT,3TC,EFV 400','1g','First line',-1,0,''),(100,'','ABC,3TC,LPV/r','4g','First line',0,-1,''),(101,'','ABC,3TC,EFV','4h','First line',0,-1,''),(102,'','AZT,3TC,RAL','4i','First line',0,-1,''),(103,'','ABC,3TC,NVP','5f','Second line',0,-1,''),(104,'','AZT,3TC,DTG','1j','First Line',-1,0,''),(105,'','AZT,3TC,DTG','2l','Second line',-1,0,''),(106,'','TDF,3TC,DTG (TLD 2)','2m','Second line',-1,0,''),(107,'','ABC,3TC,DTG','4j','First Line',0,-1,''),(108,'','TDF,3TC,DTG','4k','First line',0,-1,''),(109,'','ABC,DDI,NVP','5d','Second line',0,-1,''),(110,'','AZT,DDI,LPV/r','5e','Second line',0,-1,''),(111,'','ABC,3TC,DTG','5g','Second line',0,-1,''),(112,'','TDF,3TC,ATV/r','5h','Second line',0,-1,''),(113,'','TDF,3TC,DTG','5i','Second line',0,-1,''),(114,'','Other First Line(Adults)','1k','First line',-1,0,''),(115,'','Other Second Line(Adults)','2n','Second line',-1,0,''),(116,'','Other Third line(Adults)','3b','Third line',-1,0,''),(117,'','Other First Line(Paeds)','4l','First line',0,-1,''),(118,'','Other Second Line(Paeds)','5j','Second line',0,-1,''),(119,'','Other Third line(Paeds)','6b','Third line',0,-1,'');
/*!40000 ALTER TABLE `tblsetuparvfixeddosecombinations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuparvreasoncodes`
--

DROP TABLE IF EXISTS `tblsetuparvreasoncodes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuparvreasoncodes` (
  `ARVReasonCode` int NOT NULL,
  `ARVReason` varchar(100) DEFAULT NULL,
  `ReasonCategory` varchar(50) DEFAULT NULL,
  `MedEligible` int DEFAULT NULL,
  `Ready` int DEFAULT NULL,
  PRIMARY KEY (`ARVReasonCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuparvreasoncodes`
--

LOCK TABLES `tblsetuparvreasoncodes` WRITE;
/*!40000 ALTER TABLE `tblsetuparvreasoncodes` DISABLE KEYS */;
INSERT INTO `tblsetuparvreasoncodes` VALUES (11,'Does not fulfill criteria',NULL,1,0),(12,'Fulfils criteria, but counseling for ARVs is ongoing',NULL,1,0),(13,'Fulfils criteria, but no ARVs available',NULL,1,-1),(14,'Fulfils criteria, but is not willing',NULL,1,0),(15,'Fulfils criteria, but is on TB Rx',NULL,1,0),(16,'Fulfills criteria, but awaits lab results',NULL,1,0),(17,'Fulfills criteria but has OI and is too sick to start',NULL,1,0),(18,'Fulfils criteria but does not start for other reason',NULL,1,-1),(201,'Adult CD4 < 350',NULL,2,0),(202,'Adult WHO Stage 3 and 4',NULL,2,0),(203,'Children Pediatric WHO Stage 3 and 4',NULL,2,0),(204,'Children between 24-59 months, CD4% < 25%',NULL,2,0),(205,'Children < 2 years who are HIV positive regardless of CD4 count / WHO stage',NULL,2,0),(206,'Children >= 5 years CD4 < 350',NULL,2,0),(207,'Pregnant women for PMTCT CD4 < 350',NULL,2,NULL),(208,'Other reason to start',NULL,2,0),(401,'Start TB treatment',NULL,4,0),(402,'Nausea / vomiting','Adverse Reactions',4,0),(403,'Diarrhoea','Adverse Reactions',4,0),(404,'Headache','Adverse Reactions',4,0),(405,'Fever','Adverse Reactions',4,0),(406,'Skin rash','Adverse Reactions',4,0),(407,'Peripheral neuropathy','Adverse Reactions',4,0),(408,'Hepatitis','Adverse Reactions',4,0),(409,'Jaundice','Adverse Reactions',4,0),(410,'Dementia','Adverse Reactions',4,0),(411,'Anaemia','Adverse Reactions',4,0),(412,'Pancreatitis','Adverse Reactions',4,0),(413,'CNS adverse event','Adverse Reactions',4,0),(414,'Other adverse event, specify','Adverse Reactions',4,0),(415,'Treatment failure, clinical','Treatment Failure',4,0),(416,'Treatment failure, immunological','Treatment Failure',4,0),(417,'Poor adherence','Other Reason',4,0),(418,'Patient decision','Other Reason',4,0),(419,'Pregnancy','Other Reason',4,0),(420,'End of PMTCT','Other Reason',4,0),(421,'Stock-out','Other Reason',4,0),(422,'Other reason, specify','Other Reason',4,0),(423,'Restart ARV after 3 or months not on ARV',NULL,4,0);
/*!40000 ALTER TABLE `tblsetuparvreasoncodes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuparvstatuscodes`
--

DROP TABLE IF EXISTS `tblsetuparvstatuscodes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuparvstatuscodes` (
  `ARVStatusCode` int NOT NULL,
  `ARVStatusDescription` varchar(50) DEFAULT NULL,
  `OnARVs` int DEFAULT NULL,
  PRIMARY KEY (`ARVStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuparvstatuscodes`
--

LOCK TABLES `tblsetuparvstatuscodes` WRITE;
/*!40000 ALTER TABLE `tblsetuparvstatuscodes` DISABLE KEYS */;
INSERT INTO `tblsetuparvstatuscodes` VALUES (1,'No ARV',0),(2,'Start ARV',-1),(3,'Continue ARV',-1),(4,'Change ARV',-1),(5,'Stop ARV',0),(6,'Restart ARV',-1),(7,'PMTCT prophylaxis',0);
/*!40000 ALTER TABLE `tblsetuparvstatuscodes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuparvstatusreasonmap`
--

DROP TABLE IF EXISTS `tblsetuparvstatusreasonmap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuparvstatusreasonmap` (
  `ARVReasonCode` int NOT NULL,
  `ARVStatusCode` int NOT NULL,
  PRIMARY KEY (`ARVReasonCode`,`ARVStatusCode`),
  KEY `fi0` (`ARVReasonCode`),
  KEY `fi1` (`ARVStatusCode`),
  CONSTRAINT `tblsetuparvstatusreasonmap_ibfk_1` FOREIGN KEY (`ARVReasonCode`) REFERENCES `tblsetuparvreasoncodes` (`ARVReasonCode`),
  CONSTRAINT `tblsetuparvstatusreasonmap_ibfk_2` FOREIGN KEY (`ARVStatusCode`) REFERENCES `tblsetuparvstatuscodes` (`ARVStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuparvstatusreasonmap`
--

LOCK TABLES `tblsetuparvstatusreasonmap` WRITE;
/*!40000 ALTER TABLE `tblsetuparvstatusreasonmap` DISABLE KEYS */;
INSERT INTO `tblsetuparvstatusreasonmap` VALUES (11,1),(12,1),(13,1),(14,1),(15,1),(16,1),(17,1),(18,1),(201,2),(202,2),(203,2),(204,2),(205,2),(206,2),(207,2),(208,2),(401,4),(401,5),(402,4),(402,5),(403,4),(403,5),(404,4),(404,5),(405,4),(405,5),(406,4),(406,5),(407,4),(407,5),(408,4),(408,5),(409,4),(409,5),(410,4),(410,5),(411,4),(411,5),(412,4),(412,5),(413,4),(413,5),(414,4),(414,5),(415,4),(415,5),(416,4),(416,5),(417,4),(417,5),(418,4),(418,5),(419,4),(419,5),(420,4),(420,5),(421,4),(421,5),(422,4),(422,5),(423,4),(423,5);
/*!40000 ALTER TABLE `tblsetuparvstatusreasonmap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupdeliverymodes`
--

DROP TABLE IF EXISTS `tblsetupdeliverymodes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupdeliverymodes` (
  `DeliveryModeID` varchar(3) NOT NULL,
  `DeliveryMode` varchar(255) DEFAULT NULL,
  `Category` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`DeliveryModeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupdeliverymodes`
--

LOCK TABLES `tblsetupdeliverymodes` WRITE;
/*!40000 ALTER TABLE `tblsetupdeliverymodes` DISABLE KEYS */;
INSERT INTO `tblsetupdeliverymodes` VALUES ('BRC','Breech','Presentation'),('CSR','Caesarian','Mode of delivery'),('EPS','Episiotomy','Tear'),('FRC','Foreceps','Assistance'),('MLP','Malpresentation','Presentation'),('TEA','Natural tear','Tear'),('VCM','Vacuum','Assistance'),('VGL','Vaginal','Mode of delivery');
/*!40000 ALTER TABLE `tblsetupdeliverymodes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupdispensers`
--

DROP TABLE IF EXISTS `tblsetupdispensers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupdispensers` (
  `DispenserID` int NOT NULL,
  `DispenserFirstName` varchar(50) DEFAULT NULL,
  `DispenserSurname` varchar(50) DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  PRIMARY KEY (`DispenserID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupdispensers`
--

LOCK TABLES `tblsetupdispensers` WRITE;
/*!40000 ALTER TABLE `tblsetupdispensers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblsetupdispensers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupdistricts`
--

DROP TABLE IF EXISTS `tblsetupdistricts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupdistricts` (
  `RegionCode` int NOT NULL,
  `DistrictCode` varchar(1) NOT NULL,
  `District` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RegionCode`,`DistrictCode`),
  KEY `fi0` (`RegionCode`),
  CONSTRAINT `tblsetupdistricts_ibfk_1` FOREIGN KEY (`RegionCode`) REFERENCES `tblsetupregions` (`RegionCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupdistricts`
--

LOCK TABLES `tblsetupdistricts` WRITE;
/*!40000 ALTER TABLE `tblsetupdistricts` DISABLE KEYS */;
INSERT INTO `tblsetupdistricts` VALUES (0,'1','Harare Rural'),(0,'A','Harare Urban'),(0,'B','Chitungwisa Urban'),(0,'C','Chitungwiza Hospital'),(0,'D','Harare Central Hospital'),(0,'E','Parirenyatwa'),(0,'F','Harare City Clinics'),(1,'1','Buhera'),(1,'2','Chimanimani'),(1,'3','Chipinge'),(1,'4','Makoni'),(1,'5','Mutare'),(1,'6','Mutasa'),(1,'7','Nyanga'),(1,'8','Mutare City'),(2,'1','Bindura'),(2,'2','Centenary'),(2,'3','Guruve'),(2,'4','Mazowe'),(2,'5','Mt. Darwin'),(2,'6','Rushinga'),(2,'7','Shamva'),(2,'8','Mbire'),(3,'1','Chikomba'),(3,'2','Goromonzi'),(3,'3','U.M.P'),(3,'4','Hwedza'),(3,'5','Marondera'),(3,'6','Mudzi'),(3,'7','Murewa'),(3,'8','Mutoko'),(3,'9','Seke'),(4,'1','Chegutu'),(4,'2','Hurungwe'),(4,'3','Kadoma'),(4,'4','Kariba'),(4,'5','Makonde'),(4,'6','Zvimba'),(5,'1','Binga'),(5,'2','Bubi'),(5,'3','Hwange'),(5,'4','Lupane'),(5,'5','Nkayi'),(5,'6','Tsholotsho'),(5,'7','Umguza'),(6,'1','Beitbridge'),(6,'2','Bulilima'),(6,'3','Gwanda'),(6,'4','Insiza'),(6,'5','Matobo'),(6,'6','Umzingwane'),(6,'7','Mangwe'),(7,'1','Chirumhanzu'),(7,'2','Gokwe North'),(7,'3','Gweru'),(7,'4','Kwekwe'),(7,'5','Mberengwa'),(7,'6','Shurugwi'),(7,'7','Zvishavane'),(7,'8','Gokwe South'),(8,'1','Bikita'),(8,'2','Chiredzi'),(8,'3','Chivi'),(8,'4','Gutu'),(8,'5','Masvingo'),(8,'6','Mwenezi'),(8,'7','Zaka'),(9,'1','Bulawayo (Rural)'),(9,'A','Bulawayo (Urban)'),(9,'B','Ingutsheni'),(9,'C','U.B.H.'),(9,'D','Mpilo Hospital'),(10,'1','Brine'),(11,'1','Brine');
/*!40000 ALTER TABLE `tblsetupdistricts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupdrugtypes`
--

DROP TABLE IF EXISTS `tblsetupdrugtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupdrugtypes` (
  `DrugTypeID` varchar(3) NOT NULL,
  `DrugType` varchar(255) DEFAULT NULL,
  `InitialVisitPriorExposure` int DEFAULT NULL,
  `EveryVisit` int DEFAULT NULL,
  `ForInfants` int DEFAULT NULL,
  PRIMARY KEY (`DrugTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupdrugtypes`
--

LOCK TABLES `tblsetupdrugtypes` WRITE;
/*!40000 ALTER TABLE `tblsetupdrugtypes` DISABLE KEYS */;
INSERT INTO `tblsetupdrugtypes` VALUES ('ARV','ART',-1,0,0),('COT','Cotrimoxazole',-1,-1,-1),('FLU','Fluconazole',-1,-1,0),('IPT','Isoniazid prophylaxis therapy',0,-1,0),('NVP','Neverapine',0,0,-1),('OTH','Other',-1,0,0),('PLD','PMTCT in labour and delivery',-1,0,0),('PPG','PMTCT during pregnancy',-1,0,0),('TB1','Current TB therapy category I (new)',-1,0,0),('TB2','Current TB therapy category II (relapse)',-1,0,0);
/*!40000 ALTER TABLE `tblsetupdrugtypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupeducationlevel`
--

DROP TABLE IF EXISTS `tblsetupeducationlevel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupeducationlevel` (
  `EducationLevelID` varchar(1) NOT NULL,
  `EducationLevel` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`EducationLevelID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupeducationlevel`
--

LOCK TABLES `tblsetupeducationlevel` WRITE;
/*!40000 ALTER TABLE `tblsetupeducationlevel` DISABLE KEYS */;
INSERT INTO `tblsetupeducationlevel` VALUES ('N','None'),('P','Primary'),('S','Secondary'),('T','Tertiary');
/*!40000 ALTER TABLE `tblsetupeducationlevel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupfamilyplanning`
--

DROP TABLE IF EXISTS `tblsetupfamilyplanning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupfamilyplanning` (
  `FamilyPlanningID` varchar(1) NOT NULL,
  `FamilyPlanningMethod` varchar(150) DEFAULT NULL,
  `TheOrder` int DEFAULT NULL,
  PRIMARY KEY (`FamilyPlanningID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupfamilyplanning`
--

LOCK TABLES `tblsetupfamilyplanning` WRITE;
/*!40000 ALTER TABLE `tblsetupfamilyplanning` DISABLE KEYS */;
INSERT INTO `tblsetupfamilyplanning` VALUES ('C','Condom',7),('J','Depo - Injection',2),('L','IUD',8),('M','Implants',6),('O','Not using',1),('P','Pills',5),('T','Traditional/withdrawal',4),('Z','Sterlization',3);
/*!40000 ALTER TABLE `tblsetupfamilyplanning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupfunctionalstatus`
--

DROP TABLE IF EXISTS `tblsetupfunctionalstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupfunctionalstatus` (
  `FunctionalStatusCode` varchar(1) NOT NULL,
  `FunctionalStatusDescription` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`FunctionalStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupfunctionalstatus`
--

LOCK TABLES `tblsetupfunctionalstatus` WRITE;
/*!40000 ALTER TABLE `tblsetupfunctionalstatus` DISABLE KEYS */;
INSERT INTO `tblsetupfunctionalstatus` VALUES ('A','Ambulatory'),('B','Bedridden'),('W','Working');
/*!40000 ALTER TABLE `tblsetupfunctionalstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuphivtestreasons`
--

DROP TABLE IF EXISTS `tblsetuphivtestreasons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuphivtestreasons` (
  `HIVTestReasonID` varchar(1) NOT NULL,
  `HIVTestReason` varchar(62) DEFAULT NULL,
  PRIMARY KEY (`HIVTestReasonID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuphivtestreasons`
--

LOCK TABLES `tblsetuphivtestreasons` WRITE;
/*!40000 ALTER TABLE `tblsetuphivtestreasons` DISABLE KEYS */;
INSERT INTO `tblsetuphivtestreasons` VALUES ('A','Antenatal'),('D','Death of child/spouse'),('I','Hospital/Illness'),('O','Occupational'),('R','Spouse or child < 5 on ART'),('T','TB'),('V','VCT'),('X','Other');
/*!40000 ALTER TABLE `tblsetuphivtestreasons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuphivtesttypes`
--

DROP TABLE IF EXISTS `tblsetuphivtesttypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuphivtesttypes` (
  `HIVTestTypeID` varchar(1) NOT NULL,
  `HIVTestType` varchar(62) DEFAULT NULL,
  PRIMARY KEY (`HIVTestTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuphivtesttypes`
--

LOCK TABLES `tblsetuphivtesttypes` WRITE;
/*!40000 ALTER TABLE `tblsetuphivtesttypes` DISABLE KEYS */;
INSERT INTO `tblsetuphivtesttypes` VALUES ('A','Antibody'),('P','Virological DNA/PCR');
/*!40000 ALTER TABLE `tblsetuphivtesttypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupinfantfeedingpractices`
--

DROP TABLE IF EXISTS `tblsetupinfantfeedingpractices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupinfantfeedingpractices` (
  `FeedingPracticeID` varchar(3) NOT NULL,
  `FeedingPractice` varchar(255) DEFAULT NULL,
  `FeedingPracticeDescription` varchar(255) DEFAULT NULL,
  `NumCode` int DEFAULT NULL,
  `ExposedToHIV` int DEFAULT NULL,
  PRIMARY KEY (`FeedingPracticeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupinfantfeedingpractices`
--

LOCK TABLES `tblsetupinfantfeedingpractices` WRITE;
/*!40000 ALTER TABLE `tblsetupinfantfeedingpractices` DISABLE KEYS */;
INSERT INTO `tblsetupinfantfeedingpractices` VALUES ('AM','Exclusive modified animal milk','Infant fed by only modified animal milk',4,0),('EBF','Exclusive breast feeding','Infant fed by only breast milk',1,-1),('EBT','Exclusive heat-treated breast milk','Infant fed by only heat-treated breast milk',2,0),('FM','Exclusive infant formula milk','Infant fed by only infant formula milk',3,0),('MF','Mixed breast feeding and food/other milk','Infant fed by breast milk as well as other milk and/or food',5,-1),('RF','Food and/or other milk with no breast milk','Infant fed only by other milk and/or food (no breast milk)',6,0);
/*!40000 ALTER TABLE `tblsetupinfantfeedingpractices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupiptreasoncodes`
--

DROP TABLE IF EXISTS `tblsetupiptreasoncodes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupiptreasoncodes` (
  `TptID` int NOT NULL,
  `IPTReason` varchar(100) DEFAULT NULL,
  `IPTReasonCode` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TptID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupiptreasoncodes`
--

LOCK TABLES `tblsetupiptreasoncodes` WRITE;
/*!40000 ALTER TABLE `tblsetupiptreasoncodes` DISABLE KEYS */;
INSERT INTO `tblsetupiptreasoncodes` VALUES (1,'Signs of active TB disease','AT'),(2,'Patient already on TB treatment','ON'),(3,'Patient completed TPT in the past 3 years','CPT'),(4,'Patient on ART for less than 3 months','SA'),(5,'Signs of active liver disease','AL'),(6,'Heavy alcohol use','AA'),(7,'Others (specify)','O'),(8,'Completed TPT','C'),(9,'Severe Adverse Event','SAE'),(10,'Severe Skin Rush','SR'),(11,'Severe Averse Event Specify','AE');
/*!40000 ALTER TABLE `tblsetupiptreasoncodes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupiptstatus`
--

DROP TABLE IF EXISTS `tblsetupiptstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupiptstatus` (
  `IPTStatusCode` varchar(4) NOT NULL,
  `IPTStatusCodeDescription` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IPTStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupiptstatus`
--

LOCK TABLES `tblsetupiptstatus` WRITE;
/*!40000 ALTER TABLE `tblsetupiptstatus` DISABLE KEYS */;
INSERT INTO `tblsetupiptstatus` VALUES ('CI','Continue TPT'),('HPI','Rifapentine Initiated'),('IC','TPT Completed'),('II','TPT Initiated'),('INI','TPT Not Initaited'),('IS','TPT Stopped'),('N/A','Not Applicable'),('NE','Not Eligible for TPT'),('RI','Restart TPT');
/*!40000 ALTER TABLE `tblsetupiptstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupledgerentrytypes`
--

DROP TABLE IF EXISTS `tblsetupledgerentrytypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupledgerentrytypes` (
  `LedgerEntryTypeCode` varchar(3) NOT NULL,
  `LedgerEntryType` varchar(50) DEFAULT NULL,
  `PosOrNeg` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`LedgerEntryTypeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupledgerentrytypes`
--

LOCK TABLES `tblsetupledgerentrytypes` WRITE;
/*!40000 ALTER TABLE `tblsetupledgerentrytypes` DISABLE KEYS */;
INSERT INTO `tblsetupledgerentrytypes` VALUES ('DAM','Damaged','Negative'),('EXP','Expired','Negative'),('GOF','Transferred to other facility','Negative'),('LOS','Lost','Negative'),('MOT','Received from other facility','Positive'),('MSD','Received from Natpharm','Positive'),('RFE','Received or procured from elsewhere','Positive');
/*!40000 ALTER TABLE `tblsetupledgerentrytypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupmaritalstatus`
--

DROP TABLE IF EXISTS `tblsetupmaritalstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupmaritalstatus` (
  `MaritalStatusCode` varchar(3) NOT NULL,
  `MaritalStatus` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MaritalStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupmaritalstatus`
--

LOCK TABLES `tblsetupmaritalstatus` WRITE;
/*!40000 ALTER TABLE `tblsetupmaritalstatus` DISABLE KEYS */;
INSERT INTO `tblsetupmaritalstatus` VALUES ('D','Divorced'),('M','Married'),('S','Single'),('W','Widowed');
/*!40000 ALTER TABLE `tblsetupmaritalstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupnosfacilities`
--

DROP TABLE IF EXISTS `tblsetupnosfacilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupnosfacilities` (
  `FullFacilityCode` varchar(10) NOT NULL,
  PRIMARY KEY (`FullFacilityCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupnosfacilities`
--

LOCK TABLES `tblsetupnosfacilities` WRITE;
/*!40000 ALTER TABLE `tblsetupnosfacilities` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblsetupnosfacilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuporphanstatus`
--

DROP TABLE IF EXISTS `tblsetuporphanstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuporphanstatus` (
  `OrphanStatusID` varchar(1) NOT NULL,
  `OrphanStatus` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`OrphanStatusID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuporphanstatus`
--

LOCK TABLES `tblsetuporphanstatus` WRITE;
/*!40000 ALTER TABLE `tblsetuporphanstatus` DISABLE KEYS */;
INSERT INTO `tblsetuporphanstatus` VALUES ('D','Double (Both deceased)'),('F','Father deceased'),('M','Mother deceased');
/*!40000 ALTER TABLE `tblsetuporphanstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuppregnancyoutcomes`
--

DROP TABLE IF EXISTS `tblsetuppregnancyoutcomes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuppregnancyoutcomes` (
  `PregnancyOutcomeID` varchar(1) NOT NULL,
  `PregnancyOutcome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PregnancyOutcomeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuppregnancyoutcomes`
--

LOCK TABLES `tblsetuppregnancyoutcomes` WRITE;
/*!40000 ALTER TABLE `tblsetuppregnancyoutcomes` DISABLE KEYS */;
INSERT INTO `tblsetuppregnancyoutcomes` VALUES ('L','Live birth'),('M','Miscarriage'),('S','Still birth');
/*!40000 ALTER TABLE `tblsetuppregnancyoutcomes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuppregnancystatus`
--

DROP TABLE IF EXISTS `tblsetuppregnancystatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuppregnancystatus` (
  `pregnancystatuscode` varchar(4) NOT NULL,
  `pregnancystatusdescription` varchar(50) NOT NULL,
  PRIMARY KEY (`pregnancystatuscode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuppregnancystatus`
--

LOCK TABLES `tblsetuppregnancystatus` WRITE;
/*!40000 ALTER TABLE `tblsetuppregnancystatus` DISABLE KEYS */;
INSERT INTO `tblsetuppregnancystatus` VALUES ('L','Lactating'),('N/A','Not Applicable'),('NPL','Neither Pregnant nor Lactating'),('P','Pregnant');
/*!40000 ALTER TABLE `tblsetuppregnancystatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupproblems`
--

DROP TABLE IF EXISTS `tblsetupproblems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupproblems` (
  `ProblemAcronym` varchar(3) NOT NULL,
  `ProblemType` varchar(255) DEFAULT NULL,
  `ProblemDescription` varchar(255) DEFAULT NULL,
  `TheOrder` int DEFAULT NULL,
  `ForStandard` int DEFAULT NULL,
  `ForInfants` int DEFAULT NULL,
  PRIMARY KEY (`ProblemAcronym`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupproblems`
--

LOCK TABLES `tblsetupproblems` WRITE;
/*!40000 ALTER TABLE `tblsetupproblems` DISABLE KEYS */;
INSERT INTO `tblsetupproblems` VALUES ('ABD','Current symptoms','Abdominal pain',4,-1,-1),('ABL','Examination','Abdomen abnormal - liver enlarged',59,-1,-1),('ABO','Examination','Abdomen abnormal - other',61,-1,-1),('ABS','Examination','Abdomen abnormal - spleen enlarged',60,-1,-1),('ALC','Past medical history','Heavy alcohol use',43,-1,0),('BHF','Current symptoms','Burning hands or feet',17,-1,-1),('C','New OI or other problems','Cough',72,-1,-1),('CCS','Past medical history','Cervical cancer screening before',33,-1,0),('CGP','Current symptoms','Current cough - productive',9,-1,-1),('CHS','Examination','Chest abnormal',58,-1,-1),('CMN','Past medical history','Cryptococcal meningitis',35,-1,-1),('CND','Past medical history','Oesophageal candidiasis',28,-1,-1),('CNS','Examination','Central nervous system abnormal',52,-1,-1),('COG','Current symptoms','Current cough',8,-1,-1),('CPN','Current symptoms','Chronic pain',16,-1,-1),('CUB','Current signs','Coughing up blood (Hemoptysis)',18,-1,-1),('CVS','Examination','Cardio vascular system abnormal',56,-1,-1),('CYN','Examination','Cyanosis',50,-1,-1),('D','New OI or other problems','Demential/Encephalitis',68,-1,-1),('DB','New OI or other problems','Difficulty Breathing',73,-1,-1),('DCI','Past medical history','Disseminated Cryptococcal Infection',46,-1,-1),('DIA','Current symptoms','Diarrhoea',13,-1,-1),('DIB','Current symptoms','Diarrhoea with blood',14,-1,-1),('DIM','Current symptoms','Diarrhoea >1 month',15,-1,-1),('DMP','Past medical history','Diarrhoea >1 month',36,-1,-1),('EAR','Examination','Ears abnormal',54,-1,-1),('ELN','Examination','Enlarged Lymph Nodes',47,-1,-1),('EYE','Examination','Eyes abnormal',53,-1,-1),('F','New OI or other problems','Fever',71,-1,-1),('FAT','Current symptoms','Chronic fatigue',5,-1,-1),('FEV','Current symptoms','Fever >1 month',2,-1,-1),('FLU','Current symptoms','Flu-like (URTI)',1,-1,-1),('FMT','Past medical history','Family member treated for TB',42,-1,-1),('FTH','Current signs','Failure to thrive / unexplained malnutrition',23,-1,-1),('FVU','Past medical history','Fever >1 month unexplained',38,-1,-1),('GEN','Current signs','Genital discharge',21,-1,-1),('GND','Examination','Genital/perenium abnormal - discharge',64,-1,0),('GNO','Examination','Genital/perenium abnormal - other',65,-1,0),('GNU','Examination','Genital/perenium abnormal - ulcers',63,-1,0),('GNW','Examination','Genital/perenium abnormal - warts',62,-1,0),('HAD','Current symptoms','Headaches',7,-1,-1),('HPG','Past medical history','Herpes simplex 2 (genital)',31,-1,0),('HPO','Past medical history','Herpes simplex 1 (oral)',30,-1,-1),('HPZ','Past medical history','Herpes zoster',32,-1,-1),('HSO','Past medical history','Ever hospitalized for Ois',44,-1,-1),('I','New OI or other problems','Immune Reconstitution Inflammatory Syndrome',74,-1,-1),('JND','Examination','Jaundice',49,-1,-1),('KPS','Past medical history','Kaposi\'s Sarcoma',34,-1,-1),('MEN','Current signs','Mental confusion',22,-1,0),('MST','Examination','Mental status abnormal',51,-1,0),('MTH','Examination','Mouth abnormal',57,-1,-1),('NAS','Current symptoms','Nausea and/or vomiting',12,-1,-1),('NKS','Current signs','Neck stiffness',20,-1,-1),('NMB','Current symptoms','Numbness / tingling',6,-1,-1),('NSW','Current symptoms','Night sweats',11,-1,-1),('OSR','Past medical history','Other skin rash',45,-1,-1),('OTH','New OI or other problems','Other problem',76,-1,-1),('P','New OI or other problems','Pneumonia',67,-1,-1),('PAL','Examination','Pallor',48,-1,-1),('PGL','Past medical history','Persistent generalized lymphadenopathy',29,-1,-1),('PNE','Past medical history','Pneumonia (recurrent)',39,-1,-1),('PRG','Current signs','Pregnant',19,-1,0),('RES','Current symptoms','Difficult / laboured respiration (Dyspnea)',10,-1,-1),('RTI','Past medical history','Recurrent upper respiratory tract infections',37,-1,-1),('SMK','Examination','Skin/muscular skeletal system abnormal',55,-1,-1),('SWA','Current symptoms','Difficulty in swallowing (Dysphagia) and/or Odynophagia',3,-1,-1),('T','New OI or other problems','Thrush - oral / vaginal',69,-1,-1),('TBE','Past medical history','TB - extra pulomonary',41,-1,-1),('TBP','Past medical history','TB - pulmonary',40,-1,-1),('THR','Past medical history','Oropharyngeal candidiasis (thrush)',27,-1,-1),('U','New OI or other problems','Ulcers - mouth or other',70,-1,-1),('W','New OI or other problems','Weight loss',75,-1,-1),('WLG','Current signs','Weight loss >10%',25,-1,-1),('WLL','Current signs','Weight loss <10%',24,-1,-1),('WST','Past medical history','Wasting syndrome',26,-1,-1),('Z','New OI or other problems','Zoster',66,-1,-1);
/*!40000 ALTER TABLE `tblsetupproblems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupreferrals`
--

DROP TABLE IF EXISTS `tblsetupreferrals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupreferrals` (
  `ReferredFromID` varchar(1) NOT NULL,
  `ReferredFrom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ReferredFromID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupreferrals`
--

LOCK TABLES `tblsetupreferrals` WRITE;
/*!40000 ALTER TABLE `tblsetupreferrals` DISABLE KEYS */;
INSERT INTO `tblsetupreferrals` VALUES ('A','OI/ART'),('E','EID'),('H','Hospital'),('P','PMTCT'),('T','TB'),('V','VCT/PICT');
/*!40000 ALTER TABLE `tblsetupreferrals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupreferralsto`
--

DROP TABLE IF EXISTS `tblsetupreferralsto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupreferralsto` (
  `ReferralToCode` varchar(1) NOT NULL,
  `ReferralTo` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ReferralToCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupreferralsto`
--

LOCK TABLES `tblsetupreferralsto` WRITE;
/*!40000 ALTER TABLE `tblsetupreferralsto` DISABLE KEYS */;
INSERT INTO `tblsetupreferralsto` VALUES ('F','Family Planning Services'),('O','Other services (specify)'),('P','PMTCT'),('T','TB Clinic');
/*!40000 ALTER TABLE `tblsetupreferralsto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupregions`
--

DROP TABLE IF EXISTS `tblsetupregions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupregions` (
  `RegionCode` int NOT NULL,
  `Region` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RegionCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupregions`
--

LOCK TABLES `tblsetupregions` WRITE;
/*!40000 ALTER TABLE `tblsetupregions` DISABLE KEYS */;
INSERT INTO `tblsetupregions` VALUES (0,'Harare'),(1,'Manicaland'),(2,'Mashonaland Central'),(3,'Mashonaland East'),(4,'Mashonaland West'),(5,'Matabeleland North'),(6,'Matabeleland South'),(7,'Midlands'),(8,'Masvingo'),(9,'Bulawayo'),(10,'Masvikeni A'),(11,'Masvikeni B');
/*!40000 ALTER TABLE `tblsetupregions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupstaff`
--

DROP TABLE IF EXISTS `tblsetupstaff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupstaff` (
  `StaffID` int NOT NULL,
  `StaffSurname` varchar(50) DEFAULT NULL,
  `StaffFirstname` varchar(50) DEFAULT NULL,
  `Role` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`StaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupstaff`
--

LOCK TABLES `tblsetupstaff` WRITE;
/*!40000 ALTER TABLE `tblsetupstaff` DISABLE KEYS */;
INSERT INTO `tblsetupstaff` VALUES (1,'DUBE',NULL,'SR'),(2,'RUGARA',NULL,'SR'),(3,'CHIMBIZI',NULL,'SR'),(4,'MAKONESE',NULL,'SR'),(5,'TSVANGIRAI',NULL,'SR'),(6,'KANDEMWA',NULL,'SR'),(7,'CHIGUMIRA',NULL,'RGN'),(8,'HAMANDAWANA',NULL,'SR'),(9,'GANDAWA',NULL,'SR'),(10,'BEN',NULL,'SR'),(11,'MUCHEUKA',NULL,'SR'),(12,'CHINGWARU',NULL,'DR'),(13,'KATSIDZIRA',NULL,'DR'),(14,'MANDEYA I-TECH',NULL,'SR'),(15,'DHAKI I-TECH',NULL,'SR'),(16,'MUSEBA I-TECH',NULL,'SR'),(17,'KAWARA I-TECH',NULL,'RGN'),(18,'MAZISE I-TECH',NULL,'RGN'),(19,'IBASA',NULL,'RGN'),(20,'CHINYANGA',NULL,'RGN'),(21,'MAHLAKAPENI',NULL,'RGN'),(22,'KAWARA',NULL,'RGN'),(23,'MAZISE',NULL,'RGN'),(24,'DESHE',NULL,'RGN'),(25,'MABASA',NULL,'RGN'),(26,'ZIVEPI',NULL,'RGN'),(27,'CHITUKU',NULL,'DR'),(28,'IBASA',NULL,'RGN'),(29,'GWINJI',NULL,'SR');
/*!40000 ALTER TABLE `tblsetupstaff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupstatus`
--

DROP TABLE IF EXISTS `tblsetupstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupstatus` (
  `Status` varchar(50) NOT NULL,
  `StatusType` varchar(7) DEFAULT NULL,
  `StatusCode` varchar(6) DEFAULT NULL,
  `ForStandard` int DEFAULT NULL,
  `InfantStatusCode` varchar(3) DEFAULT NULL,
  `InfantStatusDesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupstatus`
--

LOCK TABLES `tblsetupstatus` WRITE;
/*!40000 ALTER TABLE `tblsetupstatus` DISABLE KEYS */;
INSERT INTO `tblsetupstatus` VALUES ('Attending this clinic','Default','Tx',NULL,NULL,NULL),('Died','Death','D',NULL,NULL,NULL),('Lost to follow-up','Lost','LTFU',NULL,NULL,NULL),('Missing appointments','Lost','MISS',NULL,NULL,NULL),('Opted out',NULL,'OO',NULL,NULL,NULL),('Transferred to another clinic',NULL,'TO',NULL,NULL,NULL);
/*!40000 ALTER TABLE `tblsetupstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuptbinvestigationresults`
--

DROP TABLE IF EXISTS `tblsetuptbinvestigationresults`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuptbinvestigationresults` (
  `TBInvestigationResults` int NOT NULL,
  `TBInvestigationResultsDescription` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`TBInvestigationResults`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuptbinvestigationresults`
--

LOCK TABLES `tblsetuptbinvestigationresults` WRITE;
/*!40000 ALTER TABLE `tblsetuptbinvestigationresults` DISABLE KEYS */;
INSERT INTO `tblsetuptbinvestigationresults` VALUES (1,'Investigated and has Active TB'),(2,'Investigated and has NO Active TB'),(3,'NOT Investigated'),(4,'N/A'),(5,'Investigated and has Active TB and started on TB Treatment');
/*!40000 ALTER TABLE `tblsetuptbinvestigationresults` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuptbstatus`
--

DROP TABLE IF EXISTS `tblsetuptbstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuptbstatus` (
  `TBStatusCode` varchar(2) NOT NULL,
  `TBStatusDescription` varchar(60) DEFAULT NULL,
  `HasTB` int DEFAULT NULL,
  `TBSuspected` int DEFAULT NULL,
  `TBScreened` int DEFAULT NULL,
  PRIMARY KEY (`TBStatusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuptbstatus`
--

LOCK TABLES `tblsetuptbstatus` WRITE;
/*!40000 ALTER TABLE `tblsetuptbstatus` DISABLE KEYS */;
INSERT INTO `tblsetuptbstatus` VALUES ('NO','Not assessed',0,0,0),('ON','Currently on TB treatment',-1,-1,0),('S','Suspected - there are signs',0,-1,-1),('Y','No signs (patient screened and TB not suspected)',0,0,-1);
/*!40000 ALTER TABLE `tblsetuptbstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuptestresults`
--

DROP TABLE IF EXISTS `tblsetuptestresults`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuptestresults` (
  `TestResultID` varchar(3) NOT NULL,
  `TestResult` varchar(255) DEFAULT NULL,
  `Confirmed` int DEFAULT NULL,
  PRIMARY KEY (`TestResultID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuptestresults`
--

LOCK TABLES `tblsetuptestresults` WRITE;
/*!40000 ALTER TABLE `tblsetuptestresults` DISABLE KEYS */;
INSERT INTO `tblsetuptestresults` VALUES ('NEG','Negative',-1),('POS','Positive',-1),('UND','Undetermined',0);
/*!40000 ALTER TABLE `tblsetuptestresults` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuptesttypes`
--

DROP TABLE IF EXISTS `tblsetuptesttypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuptesttypes` (
  `TestTypeID` varchar(3) NOT NULL,
  `TestType` varchar(255) DEFAULT NULL,
  `Units` varchar(14) DEFAULT NULL,
  `InitialVisit` int DEFAULT NULL,
  `EveryVisit` int DEFAULT NULL,
  `Instant` int DEFAULT NULL,
  PRIMARY KEY (`TestTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuptesttypes`
--

LOCK TABLES `tblsetuptesttypes` WRITE;
/*!40000 ALTER TABLE `tblsetuptesttypes` DISABLE KEYS */;
INSERT INTO `tblsetuptesttypes` VALUES ('ALT','ALT','mmol/L',-1,0,0),('BPD','Blood pressure diastolic','mmHg',-1,0,-1),('BPS','Blood pressure systolic','mmHg',-1,0,-1),('CD%','CD4 percent','%',-1,-1,0),('CD4','CD4 count','cell/mm3',-1,-1,0),('HBX','HB','g/dL',-1,0,0),('HGC','Height in cm','cm',0,-1,-1),('HGM','Height in metres','m',-1,0,-1),('OTH','Other tests',NULL,0,-1,0),('PUL','Pulse','bpm',-1,0,-1),('RES','Respiration Rate','breaths/m',-1,0,-1),('TMP','Temperature','celsuis',-1,0,-1),('VRL','Viral load','copies/ml',0,-1,0),('WBC','WBC','cell/mcL',-1,0,0),('WGT','Weight','Kg',-1,-1,-1);
/*!40000 ALTER TABLE `tblsetuptesttypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuptpttype`
--

DROP TABLE IF EXISTS `tblsetuptpttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuptpttype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `typeoftpt` varchar(160) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuptpttype`
--

LOCK TABLES `tblsetuptpttype` WRITE;
/*!40000 ALTER TABLE `tblsetuptpttype` DISABLE KEYS */;
INSERT INTO `tblsetuptpttype` VALUES (1,'IPT'),(2,'3HP'),(3,'NE');
/*!40000 ALTER TABLE `tblsetuptpttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetuptransferin`
--

DROP TABLE IF EXISTS `tblsetuptransferin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetuptransferin` (
  `TransferInID` varchar(4) NOT NULL,
  `TransferIn` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`TransferInID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetuptransferin`
--

LOCK TABLES `tblsetuptransferin` WRITE;
/*!40000 ALTER TABLE `tblsetuptransferin` DISABLE KEYS */;
INSERT INTO `tblsetuptransferin` VALUES ('AR','On ART'),('CR','In care (pre-ART)');
/*!40000 ALTER TABLE `tblsetuptransferin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupvisitstatus`
--

DROP TABLE IF EXISTS `tblsetupvisitstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupvisitstatus` (
  `visitstatuscode` varchar(4) NOT NULL,
  `visitstatusdescription` varchar(50) NOT NULL,
  PRIMARY KEY (`visitstatuscode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupvisitstatus`
--

LOCK TABLES `tblsetupvisitstatus` WRITE;
/*!40000 ALTER TABLE `tblsetupvisitstatus` DISABLE KEYS */;
INSERT INTO `tblsetupvisitstatus` VALUES ('D','Default (<90days)'),('E','Earlier than review date'),('L','Late but not default'),('LO','Lost to Follow up greater or equal 90'),('OT','On-Time');
/*!40000 ALTER TABLE `tblsetupvisitstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsetupvisittypes`
--

DROP TABLE IF EXISTS `tblsetupvisittypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsetupvisittypes` (
  `VisitTypeCode` varchar(2) NOT NULL,
  `VisitType` varchar(15) DEFAULT NULL,
  `VisitTypeLong` varchar(100) DEFAULT NULL,
  `TheOrder` int DEFAULT NULL,
  `ForStandard` int DEFAULT NULL,
  `ForInfants` int DEFAULT NULL,
  `DSDclinical` int DEFAULT NULL,
  `DSDRefil` int DEFAULT NULL,
  PRIMARY KEY (`VisitTypeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsetupvisittypes`
--

LOCK TABLES `tblsetupvisittypes` WRITE;
/*!40000 ALTER TABLE `tblsetupvisittypes` DISABLE KEYS */;
INSERT INTO `tblsetupvisittypes` VALUES ('B','Birth','At birth',4,0,-1,NULL,NULL),('H','Family Refill','Family Refill Member',11,-1,-1,1,1),('IC','Without mother','Infant visit without mother',6,0,-1,NULL,NULL),('IM','With mother','Infant visit with mother',5,0,-1,NULL,NULL),('O','Other clinic','Visit to other clinic reported to this clinic',3,-1,-1,NULL,NULL),('P','Self','Patient presents self for review',1,-1,0,NULL,NULL),('TS','Treatment supp','Treatment supporter on behalf of patient',2,-1,-1,NULL,NULL);
/*!40000 ALTER TABLE `tblsetupvisittypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstatus`
--

DROP TABLE IF EXISTS `tblstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblstatus` (
  `PatientID` varchar(21) NOT NULL,
  `StatusDate` datetime NOT NULL,
  `Status` varchar(50) DEFAULT NULL,
  `TransferOutToWhere` varchar(8) DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`StatusDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstatus`
--

LOCK TABLES `tblstatus` WRITE;
/*!40000 ALTER TABLE `tblstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbltests`
--

DROP TABLE IF EXISTS `tbltests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbltests` (
  `TheID` int NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(21) DEFAULT NULL,
  `TestTypeID` varchar(3) DEFAULT NULL,
  `TestDate` datetime DEFAULT NULL,
  `ResultDate` datetime DEFAULT NULL,
  `ResultNumeric` float DEFAULT NULL,
  `ResultNotes` varchar(255) DEFAULT NULL,
  `VisitDate` datetime DEFAULT NULL,
  `Status` varchar(95) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Sex` varchar(45) DEFAULT NULL,
  `ARVStatusCode` int DEFAULT NULL,
  `RecievedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`TheID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltests`
--

LOCK TABLES `tbltests` WRITE;
/*!40000 ALTER TABLE `tbltests` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbltests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblvisits`
--

DROP TABLE IF EXISTS `tblvisits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblvisits` (
  `PatientID` varchar(21) NOT NULL,
  `VisitDate` datetime NOT NULL,
  `VisitType` varchar(4) DEFAULT NULL,
  `VisiTtypeCode` varchar(2) DEFAULT NULL,
  `VisitStatusCode` varchar(5) DEFAULT NULL,
  `NowPregnant` varchar(3) DEFAULT NULL,
  `FamilyPlanningID` varchar(1) DEFAULT NULL,
  `FunctionalStatusCode` varchar(1) DEFAULT NULL,
  `WHOStage` int DEFAULT NULL,
  `TBStatusCode` varchar(2) DEFAULT NULL,
  `IPTReasonCode` varchar(6) DEFAULT NULL,
  `TypeOfTPT` varchar(45) DEFAULT NULL,
  `ARVStatusCode` int DEFAULT NULL,
  `ARVReasonCode` int DEFAULT NULL,
  `ARVCode` int DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  `StaffID` int DEFAULT NULL,
  `UserNumber` int DEFAULT NULL,
  `TheTimeStamp` datetime DEFAULT NULL,
  `AdverseEventsStatusCode` varchar(50) DEFAULT NULL,
  `DispenserID` int DEFAULT NULL,
  `DateOfFirstANC` date DEFAULT NULL,
  `LNMPDate` date DEFAULT NULL,
  `TBInvestigationResults` int DEFAULT NULL,
  `IsIPTEligibility` varchar(4) DEFAULT NULL,
  `IPTStatusCode` varchar(4) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Sex` varchar(45) DEFAULT NULL,
  `Status` varchar(90) DEFAULT NULL,
  `RegDate` date DEFAULT NULL,
  PRIMARY KEY (`VisitDate`,`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblvisits`
--

LOCK TABLES `tblvisits` WRITE;
/*!40000 ALTER TABLE `tblvisits` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblvisits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) DEFAULT NULL,
  `MiddleName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  `Password` varchar(605) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Position` varchar(255) DEFAULT NULL,
  `IsActive` bit(1) DEFAULT NULL,
  `LastLogIn` date DEFAULT NULL,
  `DateCreated` date DEFAULT NULL,
  `DateModified` date DEFAULT NULL,
  `ProvinceID` int DEFAULT NULL,
  `DistrictID` int DEFAULT NULL,
  `FacilityID` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,'Admin',NULL,'Admin','admin','8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918',NULL,'1',_binary '','2020-12-01','2020-12-01','2020-12-01',NULL,NULL,NULL),(3,'Prisca',NULL,'Tsvarai','pee','bc4a12afd04741d70226660e946341eb9f0d2284097665bdf29544828ab06df2',NULL,'1',_binary '','2020-12-03','2020-12-03','2020-12-03',NULL,NULL,NULL),(4,'Ignatious',NULL,'Ignatious','gina','5962b5ae1e316c4fbaefd5d4407d1164fe9509f7d9632805acdf0ddbea2da92a',NULL,'1',_binary '','2020-12-03','2020-12-03','2020-12-03',NULL,NULL,NULL),(5,'Tanaka',NULL,'Tanaka','tanex','3da02b9c3b57f13a7f12f4f8db9c3bd7be6527223419034a1839271182d3c50',NULL,'1',_binary '','2020-12-03','2020-12-03','2020-12-03',NULL,NULL,NULL),(6,'Tanaka',NULL,'Tanaka','tanex','3da02b9c3b57f13a7f12f4f8db9c3bd7be6527223419034a1839271182d3c50',NULL,'1',_binary '','2020-12-03','2020-12-03','2020-12-03',NULL,NULL,NULL),(7,'Michelle',NULL,'Michelle','mishie','967a877410a7e1db5e45c1b1404d359ad1985be36ad2b2f2af074c5ecd91442c',NULL,'1',_binary '','2020-12-03','2020-12-03','2020-12-03',NULL,NULL,NULL),(8,'Michelle',NULL,'Michelle','mishie','967a877410a7e1db5e45c1b1404d359ad1985be36ad2b2f2af074c5ecd91442c',NULL,'1',_binary '','2020-12-03','2020-12-03','2020-12-03',NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userrole`
--

DROP TABLE IF EXISTS `userrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userrole` (
  `UserName` varchar(255) NOT NULL,
  `RoleID` varchar(255) NOT NULL,
  `Id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrole`
--

LOCK TABLES `userrole` WRITE;
/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
INSERT INTO `userrole` VALUES ('mm','Admin',3),('mm','Executive',16),('mm','Lab Technician',19),('gina','Admin',20),('gina','Executive',21),('gina','Lab Technician',22),('admin','Admin',23),('admin','Data Entry Clerk',24),('admin','Executive',25),('pee','Admin',38),('pee','Data Entry Clerk',39),('pee','Executive',40),('tanex','Admin',41),('tanex','Data Entry Clerk',42),('tanex','Executive',43),('mishie','Admin',44),('mishie','Lab Technician',45),('mishie','Executive',46);
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visit`
--

DROP TABLE IF EXISTS `visit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visit` (
  `visitId` int NOT NULL AUTO_INCREMENT,
  `visitPlanId` bigint DEFAULT NULL,
  `visitDate` datetime DEFAULT NULL,
  `visitInterval` varchar(45) DEFAULT NULL,
  `attendedBy` varchar(255) DEFAULT NULL,
  `visitAdverse` bit(1) DEFAULT NULL,
  `adverseCode` varchar(45) DEFAULT NULL,
  `adverseSeverity` varchar(45) DEFAULT NULL,
  `StaffComent` varchar(255) DEFAULT NULL,
  `visitType` varchar(45) DEFAULT NULL,
  `visitName` varchar(100) DEFAULT NULL,
  `IsWoundHealing` bit(1) DEFAULT NULL,
  `hasResumedSex` bit(1) DEFAULT NULL,
  `riskReductionPlan` varchar(255) DEFAULT NULL,
  `startDate` varchar(45) DEFAULT '2019-09-01',
  `endDate` varchar(45) DEFAULT '2020-04-31',
  PRIMARY KEY (`visitId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visit`
--

LOCK TABLES `visit` WRITE;
/*!40000 ALTER TABLE `visit` DISABLE KEYS */;
INSERT INTO `visit` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2019-09-01','2020-04-31');
/*!40000 ALTER TABLE `visit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitplans`
--

DROP TABLE IF EXISTS `visitplans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitplans` (
  `vpId` bigint NOT NULL AUTO_INCREMENT,
  `visitPlanDate` datetime DEFAULT NULL,
  `authorisedBy` varchar(255) DEFAULT NULL,
  `isDone` bit(1) DEFAULT NULL,
  `visitPlanDateCreated` datetime DEFAULT NULL,
  `visitPlanDescri` varchar(100) DEFAULT NULL,
  `vmmcId` varchar(255) NOT NULL,
  `opdNumber` varchar(255) NOT NULL,
  PRIMARY KEY (`vpId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitplans`
--

LOCK TABLES `visitplans` WRITE;
/*!40000 ALTER TABLE `visitplans` DISABLE KEYS */;
/*!40000 ALTER TABLE `visitplans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visittype`
--

DROP TABLE IF EXISTS `visittype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visittype` (
  `ID` int NOT NULL,
  `VisitName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visittype`
--

LOCK TABLES `visittype` WRITE;
/*!40000 ALTER TABLE `visittype` DISABLE KEYS */;
/*!40000 ALTER TABLE `visittype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc`
--

DROP TABLE IF EXISTS `vmmc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc` (
  `TypeofFacility` varchar(255) DEFAULT NULL,
  `FacilityCode` varchar(255) DEFAULT NULL,
  `VMMCNumber` varchar(255) NOT NULL,
  `Comment` text,
  `OPDNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`VMMCNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc`
--

LOCK TABLES `vmmc` WRITE;
/*!40000 ALTER TABLE `vmmc` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_adverseevents`
--

DROP TABLE IF EXISTS `vmmc_adverseevents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_adverseevents` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `NoAdverseEvents` varchar(11) DEFAULT NULL,
  `HadAdverseEvents` varchar(11) DEFAULT NULL,
  `AEManagment` text,
  `VMMCNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_adverseevents`
--

LOCK TABLES `vmmc_adverseevents` WRITE;
/*!40000 ALTER TABLE `vmmc_adverseevents` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_adverseevents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_adverseeventtype`
--

DROP TABLE IF EXISTS `vmmc_adverseeventtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_adverseeventtype` (
  `ID` int NOT NULL,
  `AdverseEventID` int DEFAULT NULL,
  `AdverseEventType_Id` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_adverseeventtype`
--

LOCK TABLES `vmmc_adverseeventtype` WRITE;
/*!40000 ALTER TABLE `vmmc_adverseeventtype` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_adverseeventtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_circumcisionmethod`
--

DROP TABLE IF EXISTS `vmmc_circumcisionmethod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_circumcisionmethod` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `PatientType` varchar(255) DEFAULT NULL,
  `InformedConsentGranted` varchar(10) DEFAULT NULL,
  `AdultsClinicianInitials` varchar(255) DEFAULT NULL,
  `ParentSignature` varchar(10) DEFAULT NULL,
  `MinorsClinicanInitials` varchar(255) DEFAULT NULL,
  `ConsentObtainedBy` varchar(255) DEFAULT NULL,
  `CircumcisionMethod` varchar(255) DEFAULT NULL,
  `CircumcisionChosenByClients` varchar(255) DEFAULT NULL,
  `OtherEligibleSpecify` varchar(255) DEFAULT NULL,
  `OtherAppropriateSpecify` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_circumcisionmethod`
--

LOCK TABLES `vmmc_circumcisionmethod` WRITE;
/*!40000 ALTER TABLE `vmmc_circumcisionmethod` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_circumcisionmethod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_circumcisionprocedure`
--

DROP TABLE IF EXISTS `vmmc_circumcisionprocedure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_circumcisionprocedure` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `DateofProcedure` date DEFAULT NULL,
  `CircumciserName` varchar(255) DEFAULT NULL,
  `CircumciserProfession` varchar(255) DEFAULT NULL,
  `AssistantName` varchar(255) DEFAULT NULL,
  `AssistantProfession` varchar(255) DEFAULT NULL,
  `ClinicalNote` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_circumcisionprocedure`
--

LOCK TABLES `vmmc_circumcisionprocedure` WRITE;
/*!40000 ALTER TABLE `vmmc_circumcisionprocedure` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_circumcisionprocedure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_circumcisionreason`
--

DROP TABLE IF EXISTS `vmmc_circumcisionreason`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_circumcisionreason` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `CircumcisionReasonType_Id` int DEFAULT NULL,
  `SpecifyOtherReasons` varchar(255) DEFAULT NULL,
  `ReasonsDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_circumcisionreason`
--

LOCK TABLES `vmmc_circumcisionreason` WRITE;
/*!40000 ALTER TABLE `vmmc_circumcisionreason` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_circumcisionreason` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_complaints`
--

DROP TABLE IF EXISTS `vmmc_complaints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_complaints` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `ComplaintType_Id` int DEFAULT NULL,
  `SpecifyComplaint` varchar(255) DEFAULT NULL,
  `ComplaintDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_complaints`
--

LOCK TABLES `vmmc_complaints` WRITE;
/*!40000 ALTER TABLE `vmmc_complaints` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_complaints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_generalcondition`
--

DROP TABLE IF EXISTS `vmmc_generalcondition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_generalcondition` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `GeneralConditionType_Id` int DEFAULT NULL,
  `SpecifyGeneralCondition` varchar(255) DEFAULT NULL,
  `GeneralConditonDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_generalcondition`
--

LOCK TABLES `vmmc_generalcondition` WRITE;
/*!40000 ALTER TABLE `vmmc_generalcondition` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_generalcondition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_genitalexam`
--

DROP TABLE IF EXISTS `vmmc_genitalexam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_genitalexam` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `GenitalExamType_Id` int DEFAULT NULL,
  `GenitalExamDescription` varchar(255) DEFAULT NULL,
  `SpecifyOtherGenitalExam` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_genitalexam`
--

LOCK TABLES `vmmc_genitalexam` WRITE;
/*!40000 ALTER TABLE `vmmc_genitalexam` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_genitalexam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_medicalscreening`
--

DROP TABLE IF EXISTS `vmmc_medicalscreening`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_medicalscreening` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `OPDNumber` varchar(255) DEFAULT NULL,
  `Weight` double DEFAULT NULL,
  `Temperature` double DEFAULT NULL,
  `BloodPressure` varchar(255) DEFAULT NULL,
  `Pulse` double DEFAULT NULL,
  `AreKnownAllergies` varchar(11) DEFAULT NULL,
  `Allergies` text,
  `AnyMedications` varchar(11) DEFAULT NULL,
  `Medications` text,
  `AnyOperations` varchar(11) DEFAULT NULL,
  `Operations` text,
  `HasTestedHIV` varchar(11) DEFAULT NULL,
  `IfTestedLessOneMonth` varchar(255) DEFAULT NULL,
  `IfTestedResult` varchar(11) DEFAULT NULL,
  `ProofTestProvided` varchar(11) DEFAULT NULL,
  `IsAbnormalBleeding` varchar(11) DEFAULT NULL,
  `FamilyHistoryabnormalbleeding` varchar(255) DEFAULT NULL,
  `DateTaken` date DEFAULT NULL,
  `HIVTestResult` varchar(11) DEFAULT NULL,
  `CD4cellCount` int DEFAULT NULL,
  `WHOClinicalStage` int DEFAULT NULL,
  `HIVTestDone` varchar(11) DEFAULT NULL,
  `VMMCID` varchar(255) DEFAULT NULL,
  `IfTestedOneThreeMonths` varchar(255) DEFAULT NULL,
  `IfTestedMoreThreeMonths` varchar(255) DEFAULT NULL,
  `IfTestedSpecify` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_medicalscreening`
--

LOCK TABLES `vmmc_medicalscreening` WRITE;
/*!40000 ALTER TABLE `vmmc_medicalscreening` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_medicalscreening` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_postprocedureassessment`
--

DROP TABLE IF EXISTS `vmmc_postprocedureassessment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_postprocedureassessment` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `BloodPressure` varchar(255) DEFAULT NULL,
  `Pulse` double(255,0) DEFAULT NULL,
  `PrePexDevicePlaced` varchar(11) DEFAULT NULL,
  `ClientProvideedInstruction` varchar(11) DEFAULT NULL,
  `GivenMCClientCard` varchar(11) DEFAULT NULL,
  `AnalgesiaGiven` varchar(11) DEFAULT NULL,
  `Drug` varchar(255) DEFAULT NULL,
  `GeneralCondition` varchar(255) DEFAULT NULL,
  `NextVisitDate` date DEFAULT NULL,
  `DischargedBy` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_postprocedureassessment`
--

LOCK TABLES `vmmc_postprocedureassessment` WRITE;
/*!40000 ALTER TABLE `vmmc_postprocedureassessment` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_postprocedureassessment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_prepexmalecircumcision`
--

DROP TABLE IF EXISTS `vmmc_prepexmalecircumcision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_prepexmalecircumcision` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `CircumcisionProcedureID` int DEFAULT NULL,
  `DeviceSize` varchar(4) DEFAULT NULL,
  `DeviceBatchID` varchar(255) DEFAULT NULL,
  `DeviceExpiriyDate` date DEFAULT NULL,
  `DeviceExpiryTime` time DEFAULT NULL,
  `Topical Anaesthesia` varchar(255) DEFAULT NULL,
  `VMMCID` varchar(255) DEFAULT NULL,
  `TopicalAnaesthesiaType` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_prepexmalecircumcision`
--

LOCK TABLES `vmmc_prepexmalecircumcision` WRITE;
/*!40000 ALTER TABLE `vmmc_prepexmalecircumcision` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_prepexmalecircumcision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_referredfrom`
--

DROP TABLE IF EXISTS `vmmc_referredfrom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_referredfrom` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `ReferredFrom_ID` int DEFAULT NULL,
  `SpecifyReferredFrom` varchar(255) DEFAULT NULL,
  `ReferredFromDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_referredfrom`
--

LOCK TABLES `vmmc_referredfrom` WRITE;
/*!40000 ALTER TABLE `vmmc_referredfrom` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_referredfrom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_riskreductionplan`
--

DROP TABLE IF EXISTS `vmmc_riskreductionplan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_riskreductionplan` (
  `ID` int NOT NULL,
  `VisitID` int DEFAULT NULL,
  `RiskReductionPlanType_Id` int DEFAULT NULL,
  `VMMCID` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_riskreductionplan`
--

LOCK TABLES `vmmc_riskreductionplan` WRITE;
/*!40000 ALTER TABLE `vmmc_riskreductionplan` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_riskreductionplan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_service`
--

DROP TABLE IF EXISTS `vmmc_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_service` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) DEFAULT NULL,
  `VMMCServiceType_ID` int DEFAULT NULL,
  `ServiceDescription` varchar(255) DEFAULT NULL,
  `OtherSpecifyService` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_service`
--

LOCK TABLES `vmmc_service` WRITE;
/*!40000 ALTER TABLE `vmmc_service` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_surgicalmalecircumcision`
--

DROP TABLE IF EXISTS `vmmc_surgicalmalecircumcision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_surgicalmalecircumcision` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `CircumcisionProcedureID` int DEFAULT NULL,
  `ProcedureType_Id` varchar(255) DEFAULT NULL,
  `lignocaineone` double DEFAULT NULL,
  `lignocainetwo` double DEFAULT NULL,
  `Bupivacaine` double DEFAULT NULL,
  `DiathermyUsed` varchar(11) DEFAULT NULL,
  `DiathermySetting` varchar(255) DEFAULT NULL,
  `ProcedureStartTime` time DEFAULT NULL,
  `ProcedureEndtime` time DEFAULT NULL,
  `VMMCID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_surgicalmalecircumcision`
--

LOCK TABLES `vmmc_surgicalmalecircumcision` WRITE;
/*!40000 ALTER TABLE `vmmc_surgicalmalecircumcision` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_surgicalmalecircumcision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmc_visits`
--

DROP TABLE IF EXISTS `vmmc_visits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmc_visits` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `VMMCID` varchar(255) NOT NULL,
  `vipId` bigint NOT NULL,
  `VisitDate` date DEFAULT NULL,
  `VisitInterval` varchar(50) DEFAULT NULL,
  `AnyAdverseEvent` varchar(11) DEFAULT NULL,
  `IfYesAECode` varchar(50) DEFAULT NULL,
  `Severity` varchar(255) DEFAULT NULL,
  `WoundhealingComplete` varchar(11) DEFAULT NULL,
  `IfNoAdditionalVisitDate` date DEFAULT NULL,
  `ResumedSexualActivity` varchar(11) DEFAULT NULL,
  `IfResumedWeeks` int DEFAULT NULL,
  `Counseled` varchar(11) DEFAULT NULL,
  `IfCounseledRiskPlan` varchar(255) DEFAULT NULL,
  `StaffComment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmc_visits`
--

LOCK TABLES `vmmc_visits` WRITE;
/*!40000 ALTER TABLE `vmmc_visits` DISABLE KEYS */;
/*!40000 ALTER TABLE `vmmc_visits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vmmcservicetype`
--

DROP TABLE IF EXISTS `vmmcservicetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vmmcservicetype` (
  `ID` int NOT NULL,
  `VMMCServiceName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vmmcservicetype`
--

LOCK TABLES `vmmcservicetype` WRITE;
/*!40000 ALTER TABLE `vmmcservicetype` DISABLE KEYS */;
INSERT INTO `vmmcservicetype` VALUES (1,'Friend/ family'),(2,'Partner / Spouse'),(3,'Health worker'),(4,'Poster'),(5,'Newspaper'),(6,'Other client'),(7,'Community mobiliser'),(8,'Television (TV)'),(9,'Radio'),(10,'Leaflet');
/*!40000 ALTER TABLE `vmmcservicetype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-17 11:17:58
