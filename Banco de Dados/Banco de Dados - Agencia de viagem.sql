create database cadastro;
use cadastro;

create table permissao (
	id_permissao INT auto_increment,
    Tipo_permissao VARCHAR (20),
    primary key (id_permissao)
) default charset = utf8; 
   
create table usuario (
    id_usuario INT auto_increment,
    Nome VARCHAR (50),
    Email VARCHAR (30),
    Senha VARCHAR (10),
    id_permissao INT,
    foreign key (id_permissao) references permissao(id_permissao)    
)default charset = utf8;

create table compra(
	id_compra INT auto_increment,
    Valor_Compra DECIMAL (5.2),
    Data_Compra DATE,
    id_usuario INT,
    foreign key (id_usuario) references usuario(id_usuario) 
)default charset = utf8;

create table itemCompra(
	id_Item INT auto_increment,
    Tipo_Item VARCHAR(30),
    Nome_Item VARCHAR(30),
    Preco_Item DECIMAL(4.2),
    Id_Compra INT,
    foreign key (id_compra) references compra(id_compra)
)default charset = utf8;

SELECT * FROM usuario;
SELECT * FROM permissao;
