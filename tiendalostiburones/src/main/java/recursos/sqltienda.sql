######## Creacion y uso de la base de datos ########
CREATE DATABASE tiendalostiburones;

USE tiendalostiburones;

######## modulo de login y usuarios ########
CREATE TABLE usuarios (
    cedula_usuario BIGINT PRIMARY KEY,
    email_usuario VARCHAR(255) NOT NULL,
    nombre_usuario VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL
); 

INSERT INTO usuarios VALUES(001,'roca230313@gmail.com','Diego Rodriguez','admininicial','admin123456');
INSERT INTO usuarios VALUES(002,'roca230313@gmail.com','Diego Rodriguez','user','pass');

DROP TABLE usuarios;

DELETE FROM usuarios 
WHERE
    cedula_usuario = 001;

UPDATE usuarios 
SET 
    email_usuario = '',
    nombre_usuario = '',
    password = '',
    usuario = ''
WHERE
    cedula_usuario = 002;

SELECT 
    *
FROM
    usuarios;