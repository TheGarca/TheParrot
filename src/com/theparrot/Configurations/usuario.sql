
CREATE DATABASE theparrot;

CREATE TABLE IF NOT EXISTS usuario (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `name` varchar(50) NOT NULL,
 `company` varchar(50) NOT NULL,
 `fone_number` varchar(20) NOT NULL,
 `email` varchar(50) NOT NULL,
 `password` varchar(50) NOT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS project ( 
`id` int(11) NOT NULL AUTO_INCREMENT, 
`valor` varchar(50) NOT NULL, 
`dataFinal` varchar(50) NOT NULL, 
`empresaId` int(11) NOT NULL, 
`detalhes` varchar(350) NOT NULL, 
`name` varchar(50) NOT NULL, 
PRIMARY KEY (`id`), 
FOREIGN KEY fk_project(empresaId) REFERENCES usuario(id) ) 
ENGINE=InnoDB DEFAULT CHARSET=latin1