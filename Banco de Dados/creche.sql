-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 15-Jun-2018 às 22:08
-- Versão do servidor: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `creche`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `dogsons`
--

CREATE TABLE `dogsons` (
  `id` int(11) NOT NULL,
  `id_dono` int(11) NOT NULL,
  `raca` varchar(30) NOT NULL,
  `sexo` tinyint(1) NOT NULL,
  `idade` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `peso` float NOT NULL,
  `castrado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `dogsons`
--

INSERT INTO `dogsons` (`id`, `id_dono`, `raca`, `sexo`, `idade`, `nome`, `peso`, `castrado`) VALUES
(1, 1, 'Pitbull', 1, 3, 'Hercules', 15, 1),
(2, 1, 'Dogue Alemão', 1, 5, 'Rufus', 17, 1),
(3, 1, 'Pincher', 0, 2, 'Fifi', 2, 0),
(12, 1, '2', 0, 2, '1', 2, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dono`
--

CREATE TABLE `dono` (
  `id` int(11) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `idade` int(11) NOT NULL,
  `telefone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `dono`
--

INSERT INTO `dono` (`id`, `cpf`, `nome`, `idade`, `telefone`) VALUES
(1, '12345678910', 'Seu Jorge', 43, '81986998787');

-- --------------------------------------------------------

--
-- Estrutura da tabela `hospedar`
--

CREATE TABLE `hospedar` (
  `id` int(11) NOT NULL,
  `id_dono` int(11) NOT NULL,
  `id_cachorro` int(11) NOT NULL,
  `inicial` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `saida` datetime NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dogsons`
--
ALTER TABLE `dogsons`
  ADD PRIMARY KEY (`id`),
  ADD KEY `DogsonDono` (`id_dono`);

--
-- Indexes for table `dono`
--
ALTER TABLE `dono`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hospedar`
--
ALTER TABLE `hospedar`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dogsons`
--
ALTER TABLE `dogsons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `dono`
--
ALTER TABLE `dono`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `hospedar`
--
ALTER TABLE `hospedar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `dogsons`
--
ALTER TABLE `dogsons`
  ADD CONSTRAINT `DogsonDono` FOREIGN KEY (`id_dono`) REFERENCES `dono` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
