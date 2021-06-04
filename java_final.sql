-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2021 at 11:10 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_final`
--

-- --------------------------------------------------------

--
-- Table structure for table `gasdb`
--

CREATE TABLE `gasdb` (
  `ID` int(255) NOT NULL,
  `Type` varchar(255) NOT NULL,
  `Quantity` varchar(255) NOT NULL,
  `Price` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gasdb`
--

INSERT INTO `gasdb` (`ID`, `Type`, `Quantity`, `Price`) VALUES
(123000, '2.7 kilos', '1019', 215),
(124000, '7 kilos', '1848', 495),
(125000, '11 kilos', '3265', 995),
(126000, '22 kilos', '3658', 1995),
(127000, '50 kilos', '1993', 4350);

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `orderFormID` int(255) NOT NULL,
  `orderFormFullName` varchar(255) NOT NULL,
  `orderFormContact` varchar(255) NOT NULL,
  `orderFormAddress` varchar(255) NOT NULL,
  `orderFormDate` varchar(255) NOT NULL,
  `orderFormTankType` varchar(255) NOT NULL,
  `orderFormQuantity` varchar(255) NOT NULL,
  `orderFormTotal` varchar(255) NOT NULL,
  `orderFormCash` varchar(255) NOT NULL,
  `orderFormChange` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`orderFormID`, `orderFormFullName`, `orderFormContact`, `orderFormAddress`, `orderFormDate`, `orderFormTankType`, `orderFormQuantity`, `orderFormTotal`, `orderFormCash`, `orderFormChange`) VALUES
(41, 'Naziel Razonado', '09265059752', 'Pamplona', 'Mon, May 17 2021', '50 kilos', '100', '430000', '430000', '0'),
(43, 'Naziel Razonado', '09265059752', 'Pampolona', 'Mon, May 17 2021', '22 kilos', '2', '3986', '4000', '14'),
(44, 'Honey Reyes', '09265059752', 'Macopa, Pamplona', 'Wed, May 19 2021', '2.7 kilos', '90', '26100', '30000', '3900'),
(46, 'Jm Reyes', '062+652+62+', 'Pamplona', 'Wed, May 19 2021', '2.7 kilos', '50', '10000', '10000', '0'),
(47, 'Jm Reyes', '5875', 'Pamplona', 'Wed, May 19 2021', '2.7 kilos', '50', '10000', '10000', '0'),
(49, 'Honey Reyes', '456456', 'Pamplona', 'Wed, May 19 2021', '7 kilos', '77', '38115', '40000', '1885'),
(50, 'Naziel Razonado', '347645746', 'Pamplona', 'Wed, May 19 2021', '50 kilos', '5', '21500', '22000', '500'),
(51, 'Naziel Razonado', '4865756', 'Pamplona', 'Wed, May 19 2021', '22 kilos', '88', '175384', '176000', '616'),
(54, 'Naziel Razonado', '09265059752', 'Pamplona', 'Fri, May 21 2021', '2.7 kilos', '50', '10500', '11000', '500'),
(55, 'Jm Reyes', '09265059752', 'Pamplona', 'Fri, May 21 2021', '50 kilos', '50', '215000', '215000', '0'),
(56, 'Naziel Razonado', '09265059752', 'Pamplona', 'Fri, May 21 2021', '22 kilos', '50', '99650', '100000', '350'),
(57, 'Naziel Razonado', '09265059752', 'Pamplona', 'Fri, May 21 2021', '11 kilos', '50', '49750', '50000', '250'),
(58, 'Naziel Razonado', '09265059752', 'Pamplona', 'Mon, May 24 2021', '22 kilos', '45', '89775', '90000', '225'),
(59, 'Naziel Razonado', '09265059752', 'Pamplona', 'Mon, May 24 2021', '50 kilos', '75', '326250', '327000', '750'),
(60, 'Jm Reyes', '09265059752', 'Pamplona', 'Mon, May 24 2021', '2.7 kilos', '250', '53750', '54000', '250'),
(61, 'Jm Reyes', '092650059752', 'Pamploina', 'Mon, May 24 2021', '7 kilos', '350', '173250', '174000', '750'),
(62, 'Jm Reyes', '09265059752', 'Pamplona', 'Mon, May 24 2021', '11 kilos', '150', '149250', '150000', '750');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userID` int(255) NOT NULL,
  `fullName` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `fullName`, `address`, `gender`, `userName`, `password`) VALUES
(53, 'Jm Reyes', 'Pamplona', 'Male', 'jm', '2005'),
(54, 'Naziel Razonado', 'Pamplona', 'Male', 'aboy', 'aboy'),
(56, 'Honey Reyes', 'Pamplona', 'Female', 'honey', 'honey'),
(57, 'Papang Tampioc', 'Pamplona', 'Male', 'papang', 'papang');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`orderFormID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `orderFormID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
