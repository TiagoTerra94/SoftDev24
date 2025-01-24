-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24/01/2025 às 15:17
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `tiago_tudonumbrinco`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `maquina`
--

CREATE TABLE `maquina` (
  `numero` int(11) NOT NULL,
  `idTipo` int(11) NOT NULL,
  `dataUltimaManut` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `maquina`
--

INSERT INTO `maquina` (`numero`, `idTipo`, `dataUltimaManut`) VALUES
(1, 1, '2025-01-24 10:30:00'),
(2, 1, '2025-01-01 14:20:00'),
(3, 2, '2025-01-15 12:45:00');

-- --------------------------------------------------------

--
-- Estrutura para tabela `servico`
--

CREATE TABLE `servico` (
  `codFatura` int(11) NOT NULL,
  `numMaquina` int(11) NOT NULL,
  `duracao` time NOT NULL,
  `valor` decimal(4,2) NOT NULL,
  `nifCliente` varchar(20) DEFAULT NULL,
  `dataHora` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `servico`
--

INSERT INTO `servico` (`codFatura`, `numMaquina`, `duracao`, `valor`, `nifCliente`, `dataHora`) VALUES
(1, 1, '01:30:00', 15.15, NULL, '2025-01-02 15:40:00'),
(2, 2, '02:00:00', 18.20, '123456999', '2025-01-03 01:00:00'),
(3, 1, '00:45:00', 11.99, '112567000', '2025-01-03 11:00:00'),
(4, 3, '01:00:00', 15.00, '', '2025-01-05 13:22:00'),
(5, 2, '00:00:02', 0.00, NULL, '2015-01-10 18:00:00');

-- --------------------------------------------------------

--
-- Estrutura para tabela `tipomaquina`
--

CREATE TABLE `tipomaquina` (
  `id` int(11) NOT NULL,
  `nome` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `tipomaquina`
--

INSERT INTO `tipomaquina` (`id`, `nome`) VALUES
(1, 'lava'),
(2, 'seca'),
(7, 'lava-seca');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `maquina`
--
ALTER TABLE `maquina`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `idTipo` (`idTipo`);

--
-- Índices de tabela `servico`
--
ALTER TABLE `servico`
  ADD PRIMARY KEY (`codFatura`),
  ADD KEY `FK_SERVICO_NUMMAQUINA` (`numMaquina`);

--
-- Índices de tabela `tipomaquina`
--
ALTER TABLE `tipomaquina`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `maquina`
--
ALTER TABLE `maquina`
  MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `servico`
--
ALTER TABLE `servico`
  MODIFY `codFatura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `tipomaquina`
--
ALTER TABLE `tipomaquina`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `maquina`
--
ALTER TABLE `maquina`
  ADD CONSTRAINT `maquina_ibfk_1` FOREIGN KEY (`idTipo`) REFERENCES `tipomaquina` (`id`);

--
-- Restrições para tabelas `servico`
--
ALTER TABLE `servico`
  ADD CONSTRAINT `FK_SERVICO_NUMMAQUINA` FOREIGN KEY (`numMaquina`) REFERENCES `maquina` (`numero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
