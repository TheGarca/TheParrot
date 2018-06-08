
CREATE DATABASE theparrot;

CREATE TABLE project (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `valor` varchar(50) NOT NULL,
 `dataFinal` varchar(50) NOT NULL,
 `empresaId` varchar(20) NOT NULL,
 `detalhes` varchar(350) NOT NULL,
 `name` varchar(50) NOT NULL,
 PRIMARY KEY (`id`)
 FOREIGN KEY (empresaId) REFERENCES Usuario(Id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE IF NOT EXISTS project (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `valor` varchar(50) NOT NULL,
 `dataFinal` varchar(50) NOT NULL,
 `empresaId` varchar(20) NOT NULL,
 `detalhes` varchar(350) NOT NULL,
 `name` varchar(50) NOT NULL,
 PRIMARY KEY (`id`)
 FOREIGN KEY (empresaId) REFERENCES Usuario(Id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;