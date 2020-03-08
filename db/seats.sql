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
-- Table structure for table `seats`
--

CREATE TABLE IF NOT EXISTS `seats` (
  `frm` varchar(50) NOT NULL,
  `too` varchar(50) NOT NULL,
  `seatno` varchar(50) NOT NULL,
  `busid` varchar(50) NOT NULL,
  `aa` varchar(50) NOT NULL,
  `d8` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seats`
--

INSERT INTO `seats` (`frm`, `too`, `seatno`, `busid`, `aa`, `d8`) VALUES
('faisalabad', 'lahore', 'S01', '', '', '2020-02-11'),
('faisalabad', 'lahore', 'S25', '', '', '2020-02-11');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
