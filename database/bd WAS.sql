CREATE DATABASE db_pweb;
USE db_pweb;

CREATE TABLE db_pweb.tb_corretora(
    id_corretora int not null auto_increment,
    nome varchar(200),
    cidade varchar(200),
    telefone varchar(200),
    cnpj varchar(50),
    email varchar(200),
    primary key(id_corretora));


CREATE TABLE db_pweb.tb_usuario(
	id int not null auto_increment,
    login VARCHAR(50),
    senha VARCHAR(50),
    email VARCHAR(50),
    primary key(id));
    
INSERT INTO db_pweb.tb_usuario (login, senha, email) VALUES ('admin', '1234', 'cscarol20@gmail.com');
INSERT INTO db_pweb.tb_corretora (nome, cidade,telefone,email, cnpj) VALUES ('Corretora ImoveiSerido', 'Jardim do Serido', '49215678', 'jardimoveis@corretora.com',
 '321456766');

drop table db_pweb.tb_usuario;

select * from db_pweb.tb_corretora;
select * from db_pweb.tb_usuario;