/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.4.14-MariaDB : Database - bdcontenido
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdcontenido` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `bdcontenido`;

/*Table structure for table `puntaje_trivia` */

CREATE TABLE `puntaje_trivia` (
  `id_puntaje_trivia` int(11) NOT NULL AUTO_INCREMENT,
  `puntaje` int(11) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  `id_puntajes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_puntaje_trivia`),
  KEY `id_puntajes` (`id_puntajes`),
  KEY `id_materia` (`id_materia`),
  CONSTRAINT `puntaje_trivia_ibfk_2` FOREIGN KEY (`id_puntajes`) REFERENCES `tabla_puntajes` (`id_puntajes`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `puntaje_trivia` */

insert  into `puntaje_trivia`(`id_puntaje_trivia`,`puntaje`,`id_materia`,`id_puntajes`) values (1,10,1,1);
insert  into `puntaje_trivia`(`id_puntaje_trivia`,`puntaje`,`id_materia`,`id_puntajes`) values (2,8,2,1);
insert  into `puntaje_trivia`(`id_puntaje_trivia`,`puntaje`,`id_materia`,`id_puntajes`) values (3,6,3,1);

/*Table structure for table `tabla_puntajes` */

CREATE TABLE `tabla_puntajes` (
  `id_puntajes` int(11) NOT NULL AUTO_INCREMENT,
  `memorama` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_puntajes`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `tabla_puntajes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `tabla_usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_puntajes` */

insert  into `tabla_puntajes`(`id_puntajes`,`memorama`,`id_usuario`) values (1,215,1);

/*Table structure for table `tabla_usuarios` */

CREATE TABLE `tabla_usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `contraseña` varchar(15) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  `id_alumno` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `id_alumno` (`id_alumno`),
  CONSTRAINT `tabla_usuarios_ibfk_2` FOREIGN KEY (`id_alumno`) REFERENCES `tabla_alumnos` (`id_alumno`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_usuarios` */

insert  into `tabla_usuarios`(`id_usuario`,`nombre`,`contraseña`,`status`,`tipo`,`id_alumno`) values (1,'marko','contraseña','Activo','Admin',1);

/*Table structure for table `tabla_alumnos` */

CREATE TABLE `tabla_alumnos` (
  `id_alumno` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido_paterno` varchar(25) DEFAULT NULL,
  `apellido_materno` varchar(25) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `salon` varchar(5) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_alumno`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_alumnos` */

insert  into `tabla_alumnos`(`id_alumno`,`nombre`,`apellido_paterno`,`apellido_materno`,`edad`,`salon`,`status`) values (1,'Marco','Ocampos','Ortega',20,'3-2','Activo');

/*Table structure for table `tabla_materias` */

CREATE TABLE `tabla_materias` (
  `id_materia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_materias` */

insert  into `tabla_materias`(`id_materia`,`nombre`) values (1,'Español');
insert  into `tabla_materias`(`id_materia`,`nombre`) values (2,'Ciencias');
insert  into `tabla_materias`(`id_materia`,`nombre`) values (3,'Historia');

/*Table structure for table `tabla_leccion` */

CREATE TABLE `tabla_leccion` (
  `id_leccion` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) DEFAULT NULL,
  `texto` varchar(2000) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_leccion`),
  KEY `id_materia` (`id_materia`),
  CONSTRAINT `tabla_leccion_ibfk_1` FOREIGN KEY (`id_materia`) REFERENCES `tabla_materias` (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_leccion` */

insert  into `tabla_leccion`(`id_leccion`,`titulo`,`texto`,`id_materia`) values (1,'Español1','Las palabras agudas terminan en ción',1);
insert  into `tabla_leccion`(`id_leccion`,`titulo`,`texto`,`id_materia`) values (2,'Historia de México','América fue descubierta por Cristobal Colón',3);
insert  into `tabla_leccion`(`id_leccion`,`titulo`,`texto`,`id_materia`) values (3,'Ciencias Naturales para pequeñines curiosos','Las plantas hacen fotosíntesis para obtener su alimento',2);

/*Table structure for table `tabla_preguntas` */

CREATE TABLE `tabla_preguntas` (
  `id_pregunta` int(11) NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(250) DEFAULT NULL,
  `opcion_a` varchar(50) DEFAULT NULL,
  `opcion_b` varchar(50) DEFAULT NULL,
  `opcion_c` varchar(50) DEFAULT NULL,
  `opcion_d` varchar(50) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pregunta`),
  KEY `id_materia` (`id_materia`),
  CONSTRAINT `tabla_preguntas_ibfk_1` FOREIGN KEY (`id_materia`) REFERENCES `tabla_materias` (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_preguntas` */

insert  into `tabla_preguntas`(`id_pregunta`,`pregunta`,`opcion_a`,`opcion_b`,`opcion_c`,`opcion_d`,`id_materia`) values (1,'¿Quién descubrió América?','mi abuelo','yo','Cristo','Cristobal Colón',3);
insert  into `tabla_preguntas`(`id_pregunta`,`pregunta`,`opcion_a`,`opcion_b`,`opcion_c`,`opcion_d`,`id_materia`) values (2,'¿Cómo obtienen las plantas su alimento?','comen gusanos','van al gym','no comen','la fotosíntesis',2);
insert  into `tabla_preguntas`(`id_pregunta`,`pregunta`,`opcion_a`,`opcion_b`,`opcion_c`,`opcion_d`,`id_materia`) values (3,'¿Cómo ternan las palabras agudas?','con a','con punto','con acento en la última sílaba','no terminan',1);






/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
