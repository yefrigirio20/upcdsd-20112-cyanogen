# SQL Manager 2010 for MySQL 4.5.0.9
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : transporte


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES latin1 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `transporte`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

USE `transporte`;

#
# Structure for the `agencia` table : 
#

CREATE TABLE `agencia` (
  `idAgencia` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idAgencia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `asiento` table : 
#

CREATE TABLE `asiento` (
  `idAsiento` int(11) NOT NULL DEFAULT '0',
  `idViaje` int(11) DEFAULT NULL,
  `numAsiento` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAsiento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `boleto` table : 
#

CREATE TABLE `boleto` (
  `idBoleto` int(11) NOT NULL DEFAULT '0',
  `codUsuario` varchar(30) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `monto` decimal(12,2) DEFAULT NULL,
  `idAsiento` int(11) DEFAULT NULL,
  PRIMARY KEY (`idBoleto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `bus` table : 
#

CREATE TABLE `bus` (
  `idBus` int(11) NOT NULL DEFAULT '0',
  `placa` varchar(20) DEFAULT NULL,
  `numAsiento` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`idBus`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `recorrido` table : 
#

CREATE TABLE `recorrido` (
  `idRecorrido` int(11) NOT NULL DEFAULT '0',
  `idTracking` int(11) DEFAULT NULL,
  `fechallegada` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `idAgencia` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRecorrido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `tracking` table : 
#

CREATE TABLE `tracking` (
  `idTracking` int(11) NOT NULL DEFAULT '0',
  `idAgenciaOrigen` int(11) DEFAULT NULL,
  `idAgenciaDestino` int(11) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `dniDestinatario` varchar(10) DEFAULT NULL,
  `nomDestinatario` varchar(50) DEFAULT NULL,
  `codUsuario` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idTracking`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `usuario` table : 
#

CREATE TABLE `usuario` (
  `codUsuario` varchar(30) NOT NULL DEFAULT '',
  `nomUsuario` varchar(30) DEFAULT NULL,
  `apepatUsuario` varchar(30) DEFAULT NULL,
  `apematUsuario` varchar(30) DEFAULT NULL,
  `tipoDocumento` int(11) DEFAULT NULL,
  `numDocumento` varchar(10) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `viaje` table : 
#

CREATE TABLE `viaje` (
  `idViaje` int(11) NOT NULL DEFAULT '0',
  `idAgenciaOrigen` int(11) DEFAULT NULL,
  `idAgenciaDestino` int(11) DEFAULT NULL,
  `idBus` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `hora` datetime DEFAULT NULL,
  `costoVip` decimal(10,0) DEFAULT NULL,
  `costoNegocio` decimal(10,0) DEFAULT NULL,
  `costoEconomico` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`idViaje`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for the `agencia` table  (LIMIT 0,500)
#

INSERT INTO `agencia` (`idAgencia`, `nombre`, `direccion`) VALUES 
  (1,'LIMA','Direccion 1'),
  (2,'AREQUIPA','Direccion 2');
COMMIT;

#
# Data for the `asiento` table  (LIMIT 0,500)
#

INSERT INTO `asiento` (`idAsiento`, `idViaje`, `numAsiento`, `estado`) VALUES 
  (1,1,1,0),
  (2,1,2,0),
  (3,1,3,0),
  (4,1,4,0);
COMMIT;

#
# Data for the `bus` table  (LIMIT 0,500)
#

INSERT INTO `bus` (`idBus`, `placa`, `numAsiento`, `estado`) VALUES 
  (1,'ABC-123',30,1),
  (2,'XYZ',30,1);
COMMIT;

#
# Data for the `usuario` table  (LIMIT 0,500)
#

INSERT INTO `usuario` (`codUsuario`, `nomUsuario`, `apepatUsuario`, `apematUsuario`, `tipoDocumento`, `numDocumento`, `sexo`, `email`, `password`) VALUES 
  ('JROA','Jonathan','Roa','Cansaya',1,'42364208',1,'jroa_3000@hotmail.com','123456');
COMMIT;

#
# Data for the `viaje` table  (LIMIT 0,500)
#

INSERT INTO `viaje` (`idViaje`, `idAgenciaOrigen`, `idAgenciaDestino`, `idBus`, `fecha`, `hora`, `costoVip`, `costoNegocio`, `costoEconomico`) VALUES 
  (1,1,2,1,'2011-09-09 00:00:00','2011-09-09 12:00:00',60,50,20),
  (2,1,2,2,'2011-10-10 00:00:00','2011-10-10 12:00:00',55,45,35);
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;