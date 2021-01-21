-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 21-01-2021 a las 20:32:32
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea`
--

CREATE TABLE `tarea` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fechaCreacion` datetime(6) DEFAULT NULL,
  `vigente` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tarea`
--

INSERT INTO `tarea` (`id`, `descripcion`, `fechaCreacion`, `vigente`) VALUES
(1, 'Tarea1', '2021-01-21 17:25:52.413000', b'1'),
(2, 'Tarea2', '2021-01-21 17:25:52.413000', b'1'),
(3, 'Tarea1', '2021-01-21 17:29:41.329000', b'1'),
(4, 'Tarea2', '2021-01-21 17:29:41.329000', b'1'),
(5, 'Tarea1', '2021-01-21 17:32:41.630000', b'1'),
(6, 'Tarea2', '2021-01-21 17:32:41.630000', b'1'),
(7, 'Tarea1', '2021-01-21 17:33:34.317000', b'1'),
(8, 'Tarea2', '2021-01-21 17:33:34.317000', b'1'),
(9, 'Tarea1', '2021-01-21 17:46:31.996000', b'1'),
(10, 'Tarea2', '2021-01-21 17:46:31.996000', b'1'),
(11, 'Tarea1', '2021-01-21 17:47:22.506000', b'1'),
(12, 'Tarea2', '2021-01-21 17:47:22.506000', b'1'),
(14, 'Tarea2', '2021-01-21 17:49:24.055000', b'1'),
(15, 'Tarea1', '2021-01-21 17:52:02.624000', b'1'),
(16, 'Tarea2', '2021-01-21 17:52:02.624000', b'1'),
(17, 'Tarea1', '2021-01-21 17:52:36.744000', b'1'),
(18, 'Tarea2', '2021-01-21 17:52:36.744000', b'1'),
(19, 'Tarea1', '2021-01-21 17:53:19.117000', b'1'),
(20, 'Tarea2', '2021-01-21 17:53:19.117000', b'1'),
(21, 'Tarea1', '2021-01-21 17:54:59.945000', b'1'),
(22, 'Tarea2', '2021-01-21 17:54:59.945000', b'1'),
(23, 'Tarea1', '2021-01-21 17:55:47.269000', b'1'),
(24, 'Tarea2', '2021-01-21 17:55:47.269000', b'1'),
(25, 'Tarea1', '2021-01-21 17:56:18.210000', b'1'),
(26, 'Tarea2', '2021-01-21 17:56:18.210000', b'1'),
(27, 'Tarea1', '2021-01-21 18:27:55.235000', b'1'),
(28, 'Tarea2', '2021-01-21 18:27:55.235000', b'1'),
(29, 'Tarea1', '2021-01-21 19:31:31.867000', b'1'),
(31, 'Tarea1', '2021-01-21 19:41:25.937000', b'1'),
(32, 'Tarea2', '2021-01-21 19:41:25.937000', b'1'),
(33, 'Tarea1', '2021-01-21 19:43:51.492000', b'1'),
(34, 'Tarea2', '2021-01-21 19:43:51.492000', b'1'),
(35, 'Tarea1', '2021-01-21 19:44:02.190000', b'1'),
(36, 'Tarea2', '2021-01-21 19:44:02.190000', b'1'),
(37, 'Tarea1', '2021-01-21 19:46:21.187000', b'1'),
(38, 'Tarea2', '2021-01-21 19:46:21.187000', b'1'),
(39, 'Tarea1', '2021-01-21 19:49:26.534000', b'1'),
(40, 'Tarea2', '2021-01-21 19:49:26.534000', b'1'),
(41, 'Tarea1', '2021-01-21 19:49:57.841000', b'1'),
(42, 'Tarea2', '2021-01-21 19:49:57.841000', b'1'),
(43, 'Tarea1', '2021-01-21 19:51:14.771000', b'1'),
(44, 'Tarea2', '2021-01-21 19:51:14.771000', b'1'),
(45, 'Tarea1', '2021-01-21 19:52:10.828000', b'1'),
(46, 'Tarea2', '2021-01-21 19:52:10.828000', b'1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tarea`
--
ALTER TABLE `tarea`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
