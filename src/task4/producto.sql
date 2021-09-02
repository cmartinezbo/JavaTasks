CREATE TABLE producto( 
    prod_codigo int NOT NULL, 
    prod_nombre varchar(20) NOT NULL, 
    prod_valor int NOT NULL, 
    prod_cantidad int NOT NULL,
    prod_material varchar(20) NOT NULL,	
    PRIMARY KEY(prod_codigo)
);
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2001, 'super cuerdas', 11000, 12, 'nylon');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2002, 'los tenis', 210000, 2, 'tela');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2003, 'las medias', 5000, 1, 'tela');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2004, 'pantalonetas cuerdas', 10000, 23, 'nylon');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2005, 'camisetas', 9000, 33, 'nylon');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2006, 'zapatos', 320000, 1, 'tela');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2007, 'bicicletas', 980000, 3, 'acero');
INSERT INTO producto(prod_codigo, prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES (2008, 'telas', 2500, 1, 'nylon');
