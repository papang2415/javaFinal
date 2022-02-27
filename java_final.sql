-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 27, 2022 at 12:14 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Table structure for table `gasdata`
--

CREATE TABLE `gasdata` (
  `ID` int(255) NOT NULL,
  `Type` varchar(255) NOT NULL,
  `Quantity` varchar(255) NOT NULL,
  `Price` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gasdata`
--

INSERT INTO `gasdata` (`ID`, `Type`, `Quantity`, `Price`) VALUES
(123000, '2.7 kilos', '1019', 215),
(124000, '7 kilos', '1848', 495),
(125000, '11 kilos', '3265', 995),
(126000, '22 kilos', '3654', 1995),
(127000, '50 kilos', '1990', 4350);

-- --------------------------------------------------------

--
-- Table structure for table `orderdata`
--

CREATE TABLE `orderdata` (
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
-- Dumping data for table `orderdata`
--

INSERT INTO `orderdata` (`orderFormID`, `orderFormFullName`, `orderFormContact`, `orderFormAddress`, `orderFormDate`, `orderFormTankType`, `orderFormQuantity`, `orderFormTotal`, `orderFormCash`, `orderFormChange`) VALUES
(1, 'Naziel Razonado', '09265059752', 'Pamplona', 'Mon, May 17 2021', '50 kilos', '100', '430000', '430000', '0'),
(2, 'Naziel Razonado', '09265059752', 'Pampolona', 'Mon, May 17 2021', '22 kilos', '2', '3986', '4000', '14'),
(3, 'Honey Reyes', '09265059752', 'Macopa, Pamplona', 'Wed, May 19 2021', '2.7 kilos', '90', '26100', '30000', '3900'),
(4, 'Jm Reyes', '062+652+62+', 'Pamplona', 'Wed, May 19 2021', '2.7 kilos', '50', '10000', '10000', '0'),
(5, 'Jm Reyes', '5875', 'Pamplona', 'Wed, May 19 2021', '2.7 kilos', '50', '10000', '10000', '0'),
(6, 'Honey Reyes', '456456', 'Pamplona', 'Wed, May 19 2021', '7 kilos', '77', '38115', '40000', '1885'),
(7, 'Naziel Razonado', '347645746', 'Pamplona', 'Wed, May 19 2021', '50 kilos', '5', '21500', '22000', '500'),
(8, 'Naziel Razonado', '4865756', 'Pamplona', 'Wed, May 19 2021', '22 kilos', '88', '175384', '176000', '616'),
(9, 'Naziel Razonado', '09265059752', 'Pamplona', 'Fri, May 21 2021', '2.7 kilos', '50', '10500', '11000', '500'),
(10, 'Jm Reyes', '09265059752', 'Pamplona', 'Fri, May 21 2021', '50 kilos', '50', '215000', '215000', '0'),
(11, 'Naziel Razonado', '09265059752', 'Pamplona', 'Fri, May 21 2021', '22 kilos', '50', '99650', '100000', '350'),
(12, 'Naziel Razonado', '09265059752', 'Pamplona', 'Fri, May 21 2021', '11 kilos', '50', '49750', '50000', '250'),
(13, 'Naziel Razonado', '09265059752', 'Pamplona', 'Mon, May 24 2021', '22 kilos', '45', '89775', '90000', '225'),
(14, 'Naziel Razonado', '09265059752', 'Pamplona', 'Mon, May 24 2021', '50 kilos', '75', '326250', '327000', '750'),
(15, 'Jm Reyes', '09265059752', 'Pamplona', 'Mon, May 24 2021', '2.7 kilos', '250', '53750', '54000', '250'),
(16, 'Jm Reyes', '092650059752', 'Pamploina', 'Mon, May 24 2021', '7 kilos', '350', '173250', '174000', '750'),
(17, 'Jm Reyes', '09265059752', 'Pamplona', 'Mon, May 24 2021', '11 kilos', '150', '149250', '150000', '750'),
(79, 'Naziel Razonado', '4856849568', 'CEbu', 'Sun, Feb 27 2022', '22 kilos', '2', '3990', '4000', '10'),
(80, 'Jm Reyes', '2345768', 'Cebu', 'Sun, Feb 27 2022', '22 kilos', '2', '3990', '4000', '10'),
(81, 'Jm Reyes', '368789', 'Cebu', 'Sun, Feb 27 2022', '50 kilos', '3', '13050', '14000', '950');

-- --------------------------------------------------------

--
-- Table structure for table `userdata`
--

CREATE TABLE `userdata` (
  `userID` int(255) NOT NULL,
  `fullName` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userdata`
--

INSERT INTO `userdata` (`userID`, `fullName`, `address`, `gender`, `userName`, `password`) VALUES
(1, 'Naziel Razonado', 'Pamplona', 'Male', 'aboy', 'aboy'),
(58, 'Jm Reyes', 'Pamplona', 'Male', 'jm', '2005');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gasdata`
--
ALTER TABLE `gasdata`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `orderdata`
--
ALTER TABLE `orderdata`
  ADD PRIMARY KEY (`orderFormID`);

--
-- Indexes for table `userdata`
--
ALTER TABLE `userdata`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gasdata`
--
ALTER TABLE `gasdata`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=127001;

--
-- AUTO_INCREMENT for table `orderdata`
--
ALTER TABLE `orderdata`
  MODIFY `orderFormID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT for table `userdata`
--
ALTER TABLE `userdata`
  MODIFY `userID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
