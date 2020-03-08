-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2020 at 10:13 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `busmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE IF NOT EXISTS `bus` (
  `bid` varchar(50) NOT NULL,
  `fare` varchar(50) NOT NULL,
  `travels` varchar(50) NOT NULL,
  `source` varchar(50) NOT NULL,
  `dest` varchar(50) NOT NULL,
  `dept` varchar(50) NOT NULL,
  `bustype` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`bid`, `fare`, `travels`, `source`, `dest`, `dept`, `bustype`) VALUES
('1', '500', 'Kohinoor Travels', 'Fsd', 'Lhr', 'Daewoo', ''),
('2', '1000', 'Kohinoor Travels', 'Isl', 'Lhr', 'Daewoo', ''),
('3', '550', 'Kohinoor Travels', 'Murree', 'America', 'Daewoo', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
