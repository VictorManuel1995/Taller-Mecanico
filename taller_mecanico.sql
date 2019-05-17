-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-05-2019 a las 23:56:16
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `taller_mecanico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido_P` varchar(45) NOT NULL,
  `apellido_M` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `TIF` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `no` varchar(45) DEFAULT NULL,
  `fecha` varchar(45) DEFAULT NULL,
  `hora` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `apellido_P`, `apellido_M`, `telefono`, `TIF`, `Email`, `colonia`, `calle`, `no`, `fecha`, `hora`) VALUES
(2, 'nombre1', 'ap', 'am', 'cel', 'Tif', 'Email', 'colonia', 'calle', 'no', '8/5/2019', '11:31 PM'),
(3, 'asdasd', '', '', '', '', '', '', '', '', '9/5/2019', '1:6 AM'),
(4, 'Raul', 'cruz', 'Romero', '757115997', 'tif', 'Raul@', 'conocido', 'conocido', 'S/N', '9/5/2019', '2:42 PM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargado`
--

CREATE TABLE `encargado` (
  `id_encargado` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido_P` varchar(45) NOT NULL,
  `Apellido_M` varchar(45) NOT NULL,
  `Telefono` varchar(45) NOT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `no_casa` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `id_pieza` int(11) NOT NULL,
  `codigo_pieza` varchar(500) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `costo_pieza` double NOT NULL,
  `catidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`id_pieza`, `codigo_pieza`, `nombre`, `marca`, `costo_pieza`, `catidad`) VALUES
(1, '54849', 'neumatico', 'nissan', 78, 20),
(2, '213E2', 'CARBURADOR', 'TOYOTA', 45, 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

CREATE TABLE `mecanico` (
  `idmecanico` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido_P` varchar(45) NOT NULL,
  `apellido_M` varchar(45) NOT NULL,
  `Telefono` varchar(45) NOT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `no_casa` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mecanico`
--

INSERT INTO `mecanico` (`idmecanico`, `nombre`, `apellido_P`, `apellido_M`, `Telefono`, `colonia`, `calle`, `no_casa`, `email`, `estado`) VALUES
(1, 'mecanico1', 'ap', 'am', 'Cell', 'colonia', 'calle', 'No', 'Email', NULL),
(2, 'mecanico 2', 'ap', 'am', 'calular', 'colonia', 'calle', 'no', 'email', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `idservicio` int(11) NOT NULL,
  `nombre_servicio` varchar(45) NOT NULL,
  `costo_servicio` double NOT NULL,
  `repuesto1` varchar(45) DEFAULT NULL,
  `cantidad1` varchar(45) DEFAULT NULL,
  `repuesto2` varchar(45) DEFAULT NULL,
  `cantidad2` varchar(45) DEFAULT NULL,
  `repuesto3` varchar(45) DEFAULT NULL,
  `cantidad3` varchar(45) DEFAULT NULL,
  `repuesto4` varchar(45) DEFAULT NULL,
  `cantidad4` varchar(45) DEFAULT NULL,
  `repuesto5` varchar(45) DEFAULT NULL,
  `cantidad5` varchar(45) DEFAULT NULL,
  `repuesto6` varchar(45) DEFAULT NULL,
  `cantidad6` varchar(45) DEFAULT NULL,
  `repuesto7` varchar(45) DEFAULT NULL,
  `cantidad7` varchar(45) DEFAULT NULL,
  `repuesto8` varchar(45) DEFAULT NULL,
  `cantidad8` varchar(45) DEFAULT NULL,
  `repuesto9` varchar(45) DEFAULT NULL,
  `cantidad9` varchar(45) DEFAULT NULL,
  `repuesto10` varchar(45) DEFAULT NULL,
  `cantidad10` varchar(45) DEFAULT NULL,
  `CostoSumado` double DEFAULT NULL,
  `costo1` double DEFAULT NULL,
  `costo2` double DEFAULT NULL,
  `costo3` double DEFAULT NULL,
  `costo4` double DEFAULT NULL,
  `costo5` double DEFAULT NULL,
  `costo6` double DEFAULT NULL,
  `costo7` double DEFAULT NULL,
  `costo8` double DEFAULT NULL,
  `costo9` double DEFAULT NULL,
  `costo10` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`idservicio`, `nombre_servicio`, `costo_servicio`, `repuesto1`, `cantidad1`, `repuesto2`, `cantidad2`, `repuesto3`, `cantidad3`, `repuesto4`, `cantidad4`, `repuesto5`, `cantidad5`, `repuesto6`, `cantidad6`, `repuesto7`, `cantidad7`, `repuesto8`, `cantidad8`, `repuesto9`, `cantidad9`, `repuesto10`, `cantidad10`, `CostoSumado`, `costo1`, `costo2`, `costo3`, `costo4`, `costo5`, `costo6`, `costo7`, `costo8`, `costo9`, `costo10`) VALUES
(1, 'Cambio de Ruedas', 785, 'neumatico', '3', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', 1019, 78, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 'cambio de carburado', 45, 'CARBURADOR', '1', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', NULL, '0', 90, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion_servicio`
--

CREATE TABLE `transaccion_servicio` (
  `N_OT` int(11) NOT NULL,
  `fecha_inicio` varchar(45) NOT NULL,
  `hora_inicio` varchar(45) NOT NULL,
  `fecha_final` varchar(45) DEFAULT NULL,
  `hora_final` varchar(45) DEFAULT NULL,
  `Nombre_Servicio` varchar(50) NOT NULL,
  `Placa_vehiculo` varchar(50) NOT NULL,
  `dueño` varchar(45) DEFAULT NULL,
  `Costo_total` double NOT NULL,
  `estado` varchar(45) NOT NULL,
  `pieza1` varchar(45) DEFAULT NULL,
  `cantidad1` int(11) DEFAULT NULL,
  `pieza2` varchar(45) DEFAULT NULL,
  `cantidad2` int(11) DEFAULT NULL,
  `pieza3` varchar(45) DEFAULT NULL,
  `cantidad3` int(11) DEFAULT NULL,
  `pieza4` varchar(45) DEFAULT NULL,
  `cantidad4` int(11) DEFAULT NULL,
  `pieza5` varchar(45) DEFAULT NULL,
  `cantidad5` int(11) DEFAULT NULL,
  `pieza6` varchar(45) DEFAULT NULL,
  `cantidad6` int(11) DEFAULT NULL,
  `pieza7` varchar(45) DEFAULT NULL,
  `cantidad7` int(11) DEFAULT NULL,
  `mecanico_asig1` varchar(45) DEFAULT NULL,
  `mecanico_asig2` varchar(45) DEFAULT NULL,
  `mecanico_asig3` varchar(45) DEFAULT NULL,
  `mecanico_asig4` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `transaccion_servicio`
--

INSERT INTO `transaccion_servicio` (`N_OT`, `fecha_inicio`, `hora_inicio`, `fecha_final`, `hora_final`, `Nombre_Servicio`, `Placa_vehiculo`, `dueño`, `Costo_total`, `estado`, `pieza1`, `cantidad1`, `pieza2`, `cantidad2`, `pieza3`, `cantidad3`, `pieza4`, `cantidad4`, `pieza5`, `cantidad5`, `pieza6`, `cantidad6`, `pieza7`, `cantidad7`, `mecanico_asig1`, `mecanico_asig2`, `mecanico_asig3`, `mecanico_asig4`) VALUES
(1, '9/5/2019', '0:23 AM', NULL, NULL, 'Cambio de Ruedas', 'placa', 'nombre1', 1019, '1', NULL, 0, NULL, 0, NULL, 0, NULL, 0, NULL, 0, NULL, 0, NULL, 0, 'mecanico1', NULL, NULL, 'mecanico1'),
(2, '9/5/2019', '2:57 PM', NULL, NULL, 'cambio de carburado', '8676rdrd', 'Raul', 90, '1', NULL, 0, 'neumatico', 0, NULL, 0, NULL, 0, NULL, 0, NULL, 0, NULL, 0, 'mecanico1', NULL, 'mecanico 2', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `id_vehiculo` int(11) NOT NULL,
  `placa` varchar(45) NOT NULL,
  `Nombre_Cliente` varchar(50) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `año` varchar(45) NOT NULL,
  `No_motor` varchar(45) NOT NULL,
  `No_serie` varchar(45) NOT NULL,
  `Km` varchar(45) NOT NULL,
  `Modelo` varchar(45) NOT NULL,
  `Color` varchar(45) NOT NULL,
  `HC` varchar(45) DEFAULT NULL,
  `CO` varchar(45) DEFAULT NULL,
  `CO2` varchar(45) DEFAULT NULL,
  `llave_de_ruedas` varchar(45) DEFAULT NULL,
  `seguro_de_ruedas` varchar(45) DEFAULT NULL,
  `extintor` varchar(45) DEFAULT NULL,
  `gato` varchar(45) DEFAULT NULL,
  `TsAngulo` varchar(45) DEFAULT NULL,
  `llanta_repuesto` varchar(45) DEFAULT NULL,
  `plumilla` varchar(45) DEFAULT NULL,
  `T_tanque` varchar(45) DEFAULT NULL,
  `espejos_exterior` varchar(45) DEFAULT NULL,
  `faros` varchar(45) DEFAULT NULL,
  `antenas` varchar(45) DEFAULT NULL,
  `vasos` varchar(45) DEFAULT NULL,
  `emblema` varchar(45) DEFAULT NULL,
  `arcos` varchar(45) DEFAULT NULL,
  `brazos` varchar(45) DEFAULT NULL,
  `nablineros` varchar(45) DEFAULT NULL,
  `parlantes` varchar(45) DEFAULT NULL,
  `pisos` varchar(45) DEFAULT NULL,
  `parasoles` varchar(45) DEFAULT NULL,
  `mascaras` varchar(45) DEFAULT NULL,
  `bajos` varchar(45) DEFAULT NULL,
  `caja_CD` varchar(45) DEFAULT NULL,
  `ecualizador` varchar(45) DEFAULT NULL,
  `radio` varchar(45) DEFAULT NULL,
  `amplificador` varchar(45) DEFAULT NULL,
  `llavero` varchar(45) DEFAULT NULL,
  `marca_interior` varchar(45) DEFAULT NULL,
  `espejos_interior` varchar(45) DEFAULT NULL,
  `cabezales` varchar(45) DEFAULT NULL,
  `encendedor` varchar(45) DEFAULT NULL,
  `observacionExt` varchar(45) DEFAULT NULL,
  `observacionInt` varchar(45) DEFAULT NULL,
  `observacionMaletera` varchar(45) DEFAULT NULL,
  `NoExt` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`id_vehiculo`, `placa`, `Nombre_Cliente`, `marca`, `año`, `No_motor`, `No_serie`, `Km`, `Modelo`, `Color`, `HC`, `CO`, `CO2`, `llave_de_ruedas`, `seguro_de_ruedas`, `extintor`, `gato`, `TsAngulo`, `llanta_repuesto`, `plumilla`, `T_tanque`, `espejos_exterior`, `faros`, `antenas`, `vasos`, `emblema`, `arcos`, `brazos`, `nablineros`, `parlantes`, `pisos`, `parasoles`, `mascaras`, `bajos`, `caja_CD`, `ecualizador`, `radio`, `amplificador`, `llavero`, `marca_interior`, `espejos_interior`, `cabezales`, `encendedor`, `observacionExt`, `observacionInt`, `observacionMaletera`, `NoExt`) VALUES
(1, 'placa', 'nombre1', 'MArca', 'año', 'no motor', 'serie', 'km2', 'modelo', 'color', 'hc', 'co', 'c02', '0', '0', '0', '0', '0', '0', '0', '0', '0', '', '0', '0', '', '0', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '', '', '', ''),
(2, '8676rdrd', 'Raul', 'toyota', '2019', '3216', '9878994', '454', 'avanza', 'blanco', '23', '45', '12', '1', '0', '0', '1', '0', '1', '0', '0', '0', '2', '0', '0', 'si', '0', '1', '0', '0', '0', '1', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0', '0', '', '', '', '23');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `Cliente` (`nombre`);

--
-- Indices de la tabla `encargado`
--
ALTER TABLE `encargado`
  ADD PRIMARY KEY (`id_encargado`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`id_pieza`),
  ADD KEY `nombree` (`nombre`);

--
-- Indices de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  ADD PRIMARY KEY (`idmecanico`),
  ADD KEY `nombre` (`nombre`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`idservicio`),
  ADD KEY `repuesto1_idx` (`repuesto1`),
  ADD KEY `repuesto2_idx` (`repuesto2`),
  ADD KEY `repuesto3_idx` (`repuesto3`),
  ADD KEY `repuesto4_idx` (`repuesto4`),
  ADD KEY `repuesto5_idx` (`repuesto5`),
  ADD KEY `repuesto6_idx` (`repuesto6`),
  ADD KEY `repuesto7_idx` (`repuesto7`),
  ADD KEY `repuesto8_idx` (`repuesto8`),
  ADD KEY `repuesto9_idx` (`repuesto9`),
  ADD KEY `repuesto10_idx` (`repuesto10`),
  ADD KEY `Nombre_servicios` (`nombre_servicio`);

--
-- Indices de la tabla `transaccion_servicio`
--
ALTER TABLE `transaccion_servicio`
  ADD PRIMARY KEY (`N_OT`),
  ADD KEY `pieza1_idx` (`pieza1`),
  ADD KEY `pieza2_idx` (`pieza2`),
  ADD KEY `pieza3_idx` (`pieza3`),
  ADD KEY `pieza4_idx` (`pieza4`),
  ADD KEY `pieza5_idx` (`pieza5`),
  ADD KEY `pieza6_idx` (`pieza6`),
  ADD KEY `pieza7_idx` (`pieza7`),
  ADD KEY `mecanico1_idx` (`mecanico_asig1`),
  ADD KEY `mecanico2_idx` (`mecanico_asig2`),
  ADD KEY `mecanico3_idx` (`mecanico_asig3`),
  ADD KEY `mecanico4_idx` (`mecanico_asig4`),
  ADD KEY `Nombre_servicio_idx` (`Nombre_Servicio`),
  ADD KEY `Placa_Auto_idx` (`Placa_vehiculo`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id_vehiculo`),
  ADD KEY `id_cliente` (`Nombre_Cliente`),
  ADD KEY `Placa` (`placa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `encargado`
--
ALTER TABLE `encargado`
  MODIFY `id_encargado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `id_pieza` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  MODIFY `idmecanico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `idservicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `transaccion_servicio`
--
ALTER TABLE `transaccion_servicio`
  MODIFY `N_OT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `repuesto1` FOREIGN KEY (`repuesto1`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto10` FOREIGN KEY (`repuesto10`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto2` FOREIGN KEY (`repuesto2`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto3` FOREIGN KEY (`repuesto3`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto4` FOREIGN KEY (`repuesto4`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto5` FOREIGN KEY (`repuesto5`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto6` FOREIGN KEY (`repuesto6`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto7` FOREIGN KEY (`repuesto7`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto8` FOREIGN KEY (`repuesto8`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `repuesto9` FOREIGN KEY (`repuesto9`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `transaccion_servicio`
--
ALTER TABLE `transaccion_servicio`
  ADD CONSTRAINT `Nombre_servicio` FOREIGN KEY (`Nombre_Servicio`) REFERENCES `servicios` (`nombre_servicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Placa_Auto` FOREIGN KEY (`Placa_vehiculo`) REFERENCES `vehiculo` (`placa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `mecanico1` FOREIGN KEY (`mecanico_asig1`) REFERENCES `mecanico` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `mecanico2` FOREIGN KEY (`mecanico_asig2`) REFERENCES `mecanico` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `mecanico3` FOREIGN KEY (`mecanico_asig3`) REFERENCES `mecanico` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `mecanico4` FOREIGN KEY (`mecanico_asig4`) REFERENCES `mecanico` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza1` FOREIGN KEY (`pieza1`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza2` FOREIGN KEY (`pieza2`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza3` FOREIGN KEY (`pieza3`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza4` FOREIGN KEY (`pieza4`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza5` FOREIGN KEY (`pieza5`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza6` FOREIGN KEY (`pieza6`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pieza7` FOREIGN KEY (`pieza7`) REFERENCES `inventario` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `Nombre_Cliente` FOREIGN KEY (`Nombre_Cliente`) REFERENCES `cliente` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
