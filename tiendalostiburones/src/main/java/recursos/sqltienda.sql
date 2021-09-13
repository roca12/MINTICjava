CREATE DATABASE tiendalostiburones;

USE tiendalostiburones;

CREATE TABLE usuarios (
    cedula_usuario BIGINT PRIMARY KEY,
    email_usuario VARCHAR(255) NOT NULL,
    nombreusuario VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL
); 

INSERT INTO usuarios VALUES(001,'roca230313@gmail.com','Diego Rodriguez','admininicial','admin123456');