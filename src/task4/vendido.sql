CREATE TABLE vendido( 
	id_vendido int,
	prod_codigo_fk int NOT NULL,
	ven_nro_factura_fk int NOT NULL,
    PRIMARY KEY(id_vendido),
    FOREIGN KEY(prod_codigo_fk) REFERENCES producto(prod_codigo),
    FOREIGN KEY(ven_nro_factura_fk) REFERENCES factura(ven_nro_factura)
);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (1, 2001, 7001);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (2, 2002, 7001);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (3, 2003, 7001);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (4, 2004, 7001);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (5, 2003, 7002);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (6, 2003, 7003);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (7, 2005, 7004);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (8, 2001, 7005);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (9, 2001, 7006);
INSERT INTO vendido(id_vendido, prod_codigo_fk, ven_nro_factura_fk)
VALUES (10, 2006, 7007);
