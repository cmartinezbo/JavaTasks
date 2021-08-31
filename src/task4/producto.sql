DROP TABLE IF EXISTS productos;
CREATE TABLE productos( 
    prod_codigo int AUTO_INCREMENT, 
    prod_nombre varchar(20) NOT NULL, 
    prod_valor int NOT NULL, 
    prod_cantidad int NOT NULL,
    prod_material varchar(20) NOT NULL,	
    PRIMARY KEY(prod_codigo)
)AUTO_INCREMENT = 2001;
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('super cuerdas', 11000, 12, 'nylon');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('los tenis', 210000, 2, 'tela');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('las medias', 5000, 1, 'tela');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('pantalonetas cuerdas', 10000, 23, 'nylon');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('camisetas', 9000, 33, 'nylon');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('zapatos', 320000, 1, 'tela');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('bicicletas', 980000, 3, 'acero');
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('telas', 2500, 1, 'nylon');