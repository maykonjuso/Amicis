CREATE TABLE usuario (
	id INT auto_increment,
	this_usuario varchar(100) UNIQUE,
	nome varchar(50) ,
	sobrenome varchar(50),
	email varchar(100) UNIQUE,
	telefone varchar(20),
	dataNascimento DATE,
	senha varchar(100),
	dataCadastro DATETIME DEFAULT NOW(),
	CONSTRAINT id_PK PRIMARY KEY (id)
);

CREATE TABLE perfil (
  id_usuario int,
  status_online boolean,
  bio varchar(200),
  relacionamento varchar(50),
  localidade varchar(50),
  PRIMARY KEY (id_usuario),
  CONSTRAINT perfil_FK FOREIGN KEY (id_usuario) REFERENCES usuario(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE amigos (
	perfil varchar(100),
	amigo varchar(100),
	CONSTRAINT amigos_PK PRIMARY KEY (perfil, amigo),
	CONSTRAINT amigos_FK FOREIGN KEY (perfil) REFERENCES usuario(this_usuario) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT amigos_FK_1 FOREIGN KEY (amigo) REFERENCES usuario(this_usuario) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE bloqueados (
	perfil varchar(100),
	bloqueado varchar(100),
	CONSTRAINT bloqueados_PK PRIMARY KEY (perfil, bloqueado),
	CONSTRAINT bloqueados_FK FOREIGN KEY (perfil) REFERENCES usuario(this_usuario) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT bloqueados_FK_1 FOREIGN KEY (bloqueado) REFERENCES usuario(this_usuario) ON DELETE CASCADE ON UPDATE CASCADE
);