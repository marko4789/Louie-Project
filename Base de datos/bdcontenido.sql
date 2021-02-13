/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.30-MariaDB : Database - bdcontenido
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



/*Table structure for table `tabla_materias` */

DROP TABLE IF EXISTS `tabla_materias`;

CREATE TABLE `tabla_materias` (
  `id_materia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_materias` */

insert  into `tabla_materias`(`id_materia`,`nombre`) values (1,'Español'),(2,'Geografía'),(3,'Historia'),(4,'Ciencias Naturales');



/*Table structure for table `tabla_alumnos` */

DROP TABLE IF EXISTS `tabla_alumnos`;

CREATE TABLE `tabla_alumnos` (
  `id_alumno` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido_paterno` varchar(25) DEFAULT NULL,
  `apellido_materno` varchar(25) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `salon` varchar(5) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_alumno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_alumnos` */

insert  into `tabla_alumnos`(`id_alumno`,`nombre`,`apellido_paterno`,`apellido_materno`,`edad`,`salon`,`status`) values (1,'Marco','Ocampos','Ortega',20,'3-2','Activo'),(2,'Mónica Lizbeth','Ruiz','Martínez',20,'3-2','Activo');



/*Table structure for table `tabla_usuarios` */

DROP TABLE IF EXISTS `tabla_usuarios`;

CREATE TABLE `tabla_usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `contraseña` varchar(15) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `id_alumno` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `id_alumno` (`id_alumno`),
  CONSTRAINT `tabla_usuarios_ibfk_2` FOREIGN KEY (`id_alumno`) REFERENCES `tabla_alumnos` (`id_alumno`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_usuarios` */

insert  into `tabla_usuarios`(`id_usuario`,`nombre`,`contraseña`,`status`,`tipo`,`id_alumno`) values (1,'marko','jkl','Activo','Alumno',1),(2,'mony','123','Activo','Administrador',2);



/*Table structure for table `tabla_puntajes` */

DROP TABLE IF EXISTS `tabla_puntajes`;

CREATE TABLE `tabla_puntajes` (
  `id_puntajes` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_puntajes`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `tabla_puntajes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `tabla_usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_puntajes` */

insert  into `tabla_puntajes`(`id_puntajes`,`id_usuario`) values (1,1),(2,2);



/*Table structure for table `puntaje_memorama` */

DROP TABLE IF EXISTS `puntaje_memorama`;

CREATE TABLE `puntaje_memorama` (
  `id_puntaje_memorama` int(11) NOT NULL AUTO_INCREMENT,
  `puntaje` int(11) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  `id_puntajes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_puntaje_memorama`),
  KEY `id_puntajes` (`id_puntajes`),
  KEY `id_materia` (`id_materia`),
  CONSTRAINT `puntaje_memorama_ibfk_1` FOREIGN KEY (`id_puntajes`) REFERENCES `tabla_puntajes` (`id_puntajes`),
  CONSTRAINT `puntaje_memorama_ibfk_2` FOREIGN KEY (`id_materia`) REFERENCES `tabla_materias` (`id_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `puntaje_memorama` */

insert  into `puntaje_memorama`(`id_puntaje_memorama`,`puntaje`, `id_materia`, `id_puntajes`) values (1,0,1,1),(2,0,2,1),(3,0,3,1),(4,0,4,1),(5,0,1,2),(6,0,2,2),(7,0,3,2),(8,0,4,2);


/*Table structure for table `puntaje_trivia` */

DROP TABLE IF EXISTS `puntaje_trivia`;

CREATE TABLE `puntaje_trivia` (
  `id_puntaje_trivia` int(11) NOT NULL AUTO_INCREMENT,
  `puntaje` int(11) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  `id_puntajes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_puntaje_trivia`),
  KEY `id_puntajes` (`id_puntajes`),
  KEY `id_materia` (`id_materia`),
  CONSTRAINT `puntaje_trivia_ibfk_2` FOREIGN KEY (`id_puntajes`) REFERENCES `tabla_puntajes` (`id_puntajes`),
  CONSTRAINT `puntaje_trivia_ibfk_3` FOREIGN KEY (`id_materia`) REFERENCES `tabla_materias` (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

/*Data for the table `puntaje_trivia` */

insert  into `puntaje_trivia`(`id_puntaje_trivia`,`puntaje`,`id_materia`,`id_puntajes`) values (1,0,1,1),(2,0,2,1),(3,0,3,1),(4,0,4,1),(5,0,1,2),(6,0,2,2),(7,0,3,2),(8,0,4,2);



/*Table structure for table `tabla_leccion` */

DROP TABLE IF EXISTS `tabla_leccion`;

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

insert  into `tabla_leccion`(`id_leccion`,`titulo`,`texto`,`id_materia`) values (1,'Español1','Las palabras agudas terminan en ción',1),(2,'Historia de México','América fue descubierta por Cristobal Colón',3),(3,'Ciencias Naturales para pequeñines curiosos','Las plantas hacen fotosíntesis para obtener su alimento',2);



/*Table structure for table `tabla_preguntas` */

DROP TABLE IF EXISTS `tabla_preguntas`;

CREATE TABLE `tabla_preguntas` (
  `id_pregunta` int(11) NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(250) DEFAULT NULL,
  `opcion_a` varchar(100) DEFAULT NULL,
  `opcion_b` varchar(100) DEFAULT NULL,
  `opcion_c` varchar(100) DEFAULT NULL,
  `opcion_d` varchar(100) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pregunta`),
  KEY `id_materia` (`id_materia`),
  CONSTRAINT `tabla_preguntas_ibfk_1` FOREIGN KEY (`id_materia`) REFERENCES `tabla_materias` (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tabla_preguntas` */

insert  into `tabla_preguntas`(`id_pregunta`,`pregunta`,`opcion_a`,`opcion_b`,`opcion_c`,`opcion_d`,`id_materia`) values (1,'¿Qué es un refrán?','Una persona que se llama Renato Francisco.','Una forma de decir mentiras.','Una frase de la vida cotidiana que contiene un consejo sobre la vida cotidiana o una moraleja.','Una anécdota que alguien ya vivió.',1),(2,'¿Cuál de los siguientes es un refrán?','El que madruga durmió temprano.','Más vale el viejo por torcido que el árbol por diablo.','Más vale prevenir que lamentar.','Vale más un buen amor que mil costales de oro,',1),(3,'El significado de los refranes se puede clasificar como:','Implícito o explícito.','Abierto o cerrado.','Literal o figurativo.','Optimista o pesimista.',1),(4,'Son recursos literarios utilizados en los refranes:','Verdades, mentiras, metáforas y recuerdos.','Metáforas, rimas, analogías y juegos de palabras.','Groserías, analogías, rimas y chistes.','Cuentos, rimas y poemas.',1),(5,'Utiliza recursos como el doble significado que tiene una palabra o su reiteración.','Poemas.','Metáforas.','Refranes.','Juegos de palabras.',1),(6,'Indican hasta dónde se extienden los límites de cada país.','Fronteras.','Alambrados.','Leyes.','Iglesias.',2),(7,'¿Cuál es el nombre oficial de México?','México.','Área limítrofe.','Estados Unidos Mexicanos.','Estados Unidos de abajo.',2),(8,'El territorio de México se divide en:','Fronteras.','Casas.','Estados y municipios.','Ciudades grandes y pequeñas.',2),(9,'¿Por cuántas entidades feredativas está integrado México?','16.','60.','33.','32.',2),(10,'¿En dónde se encuentra la capital del país?','Puebla.','Tabasco.','Sinaloa.','Ciudad de México.',2),(11,'¿Durante qué periodo se desarrolló la civilización Olmeca?','Moderno.','Clásico.','Preclásico.','Prehistórico.',3),(12,'¿De qué técnicas existen pruebas que dominaran los Olmecas?','Fútbol, quemados y videojuegos.','Tejer, hacer pozole y sacrificar animales.','Arte abstracto y hacer puertas.','La construcción y astronomía.',3),(13,'¿Cómo se dividía la sociedad Olmeca?','Por gamers y otakus.','Por edades, viejos y jóvenes.','Por grupos, sacerdotes, jugadores de pelota, alfaferos, etc.','Por ricos y pobres.',3),(14,'¿Qué representaban las figuras pintadas con chapopote conocidas como \"caras de niño\"?','La inocencia de un bebé.','La belleza del chapopote.','El tamaño pequeño de los bebés.','Representaban la deformación del cráneo de los recién nacidos.',3),(15,'¿Qué animal se consideraba sagrado en la cultura olmeca?','El jaguar.','El mono araña.','La tarántula.','Los gatos esfinge.',3),(16,'¿Por qué elementos está compuesto el sistema digestivo?','Ojos, lengua, dientes, cabello, uñas y pies.','Axilas, codos, tobillos y orejas.','Boca, faringe, laringe, laringe, esófago, estómago, intestino delgado, intestino grueso, recto y ano','Todas las anteriores.',4),(17,'¿Durante qué proceso los alimentos se transforman en nutrientes simples que se distribuyen por el cuerpo a través de la sangre?','Alimentación.','Respiración.','Sudoración.','Digestión.',4),(18,'¿Con qué sistema se relaciona estrechamente el sistema digestivo?','Con todos, pero más con el circulatorio.','Con ninguno.','Con el respiratorio.','Con el circulatorio nada más.',4),(19,'Menciona buenas prácticas para cuidar bien tu sistema digestivo.','Comer solo dulces y no lavarse las manos.','Alimentarse sanamente, cuidar tu higiene y beber agua potable.','Usar suéter y dormir tapado en las noches.','Comer tamales los fines de semana y chuparse los dedos.',4),(20,'¿Por qué es importante cuidar tu sistema digestivo?','Porque está de moda.','Porque es obligatorio. ','Por una buena salud.','No es importante.',4);





/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
