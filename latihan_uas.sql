-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2024 at 04:01 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `latihan_uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `tr_detail_peminjaman`
--

CREATE TABLE `tr_detail_peminjaman` (
  `id` int(11) NOT NULL,
  `kode_buku` char(10) NOT NULL,
  `nama_buku` varchar(59) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `peminjam` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tr_detail_peminjaman`
--

INSERT INTO `tr_detail_peminjaman` (`id`, `kode_buku`, `nama_buku`, `jumlah`, `peminjam`) VALUES
(1, 'B003', 'Buku Hacker', 2, 'Iwan'),
(2, 'B002', 'Buku Memasak', 2, 'Iwan'),
(3, 'B007', 'Buku Memasak', 4, 'Laras');

-- --------------------------------------------------------

--
-- Table structure for table `tr_peminjaman`
--

CREATE TABLE `tr_peminjaman` (
  `no_peminjam` char(10) NOT NULL,
  `peminjam` varchar(50) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tr_peminjaman`
--

INSERT INTO `tr_peminjaman` (`no_peminjam`, `peminjam`, `tanggal`) VALUES
('P002', 'Iwan', '2024-01-28'),
('P004', 'Laras', '2024-01-28');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tr_detail_peminjaman`
--
ALTER TABLE `tr_detail_peminjaman`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tr_peminjaman`
--
ALTER TABLE `tr_peminjaman`
  ADD PRIMARY KEY (`no_peminjam`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tr_detail_peminjaman`
--
ALTER TABLE `tr_detail_peminjaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
