-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_glesh_cyberaware
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `tbl_cyberthreats`
--

DROP TABLE IF EXISTS `tbl_cyberthreats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cyberthreats` (
  `ctid` int NOT NULL AUTO_INCREMENT,
  `cttopic` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ctid`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cyberthreats`
--

LOCK TABLES `tbl_cyberthreats` WRITE;
/*!40000 ALTER TABLE `tbl_cyberthreats` DISABLE KEYS */;
INSERT INTO `tbl_cyberthreats` VALUES (4,'Malware Attacks','uses vulnerabilities in OS to install themselves without the user’s consent'),(5,'Trojan virus','tricks a user into thinking it is a harmless file'),(6,'Ransomware','prevents access to the data of the victim'),(7,'Wiper malware','intends to destroy data or systems, by overwriting targeted files'),(8,'Worms','to exploit backdoors and vulnerabilities to gain unauthorized access to operating systems'),(9,'Spyware','enables malicious actors to gain unauthorized access to data'),(10,'Fileless malware','It makes native files such as PowerShell and WMI editable to enable malicious functions'),(11,'Application or website manipulation','broken access controls and security misconfiguration'),(12,'Social engineering attacks','manipulating users into performing actions desirable to an attacker'),(13,'Phishing','sends fraudulent correspondence that seems to come from legitimate sources, usually via email'),(14,'Spear phishing','target individuals with security privileges or influence'),(15,'Malvertising','online advertising controlled by hackers'),(16,'Drive-by downloads','can hack websites and insert malicious scripts into PHP'),(17,'Scareware security software','pretends to scan for malware and then regularly shows the user fake warnings and detections'),(18,'Baiting','occurs when a threat actor tricks a target into using a malicious device'),(19,'Vishing','to get targets to divulge financial or personal information over the phone'),(20,'Whaling','The threat actor attempts to trick the target into disclosing confidential information.'),(21,'Pretexting','occurs when a threat actor lies to the target to gain access to privileged data'),(22,'Scareware','tricks the victim into thinking they inadvertently downloaded illegal content'),(23,'Diversion theft','trick a courier or delivery company into going to a wrong drop-off or pickup location'),(24,'Honey trap','assumes a fake identity as an attractive person to interact with a target online'),(25,'Tailgating or piggybacking','occurs when a threat actor enters a secured building by following authorized personnel'),(26,'Pharming',' an online fraud scheme during which a cybercriminal installs malicious code on a server or computer'),(27,'Software supply chain attacks','targets weak links in its trusted software update and supply chain'),(28,'Advanced persistent threats (APT)','attackers may exfiltrate sensitive data in large companies'),(29,'Distributed denial of service (DDoS)','overwhelm the resources of a target system and cause it to stop functioning'),(30,'Botnets','systems under hacker control that have been infected with malware'),(31,'Smurf attack','sends Internet Control Message Protocol (ICMP) echo requests to the victim’s IP address'),(32,'TCP SYN flood attack','attacks flood the target system with connection requests'),(33,'Man-in-the-middle attack (MitM)','attackers break this assumption, placing themselves in between the user and the target server.'),(34,'Session hijacking','an attacker hijacks a session between a network server and a client'),(35,'Replay attack','have been largely mitigated by adding timestamps to network communications'),(36,'IP spoofing','an attacker convinces a system that it is corresponding with a trusted, known entity'),(37,'Eavesdropping attack','attackers leverage insecure network communication to access information'),(38,'Bluetooth attacks','this compromise of an endpoint is a means to an end'),(39,'Password attacks','gains access to the password information of an individual by sniffing the connection to the network'),(40,'Brute-force password guessing','an attacker uses software to try many different passwords, in hopes of guessing the correct one'),(41,'Dictionary attack','to gain access to the computer and network of the victim'),(42,'Pass-the-hash attack','exploits the authentication protocol in a session and captures a password hash'),(43,'Golden ticket attack','starts in the same way as a pass-the-hash attack');
/*!40000 ALTER TABLE `tbl_cyberthreats` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-06 14:53:35
