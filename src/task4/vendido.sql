CREATE TABLE vendido( 
	id_vendido int auto_increment,
	prod_codigo_fk int NOT NULL,
	ven_nro_factura_fk int NOT NULL,
    PRIMARY KEY(id_vendido),
    FOREIGN KEY(prod_codigo_fk) REFERENCES producto(prod_codigo),
    FOREIGN KEY(ven_nro_factura_fk) REFERENCES factura(ven_nro_factura)
);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2001, 7001);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2002, 7001);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2003, 7001);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2004, 7001);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2003, 7002);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2003, 7003);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2005, 7004);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2001, 7005);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2001, 7006);
INSERT INTO vendido(prod_codigo_fk, ven_nro_factura_fk)
VALUES (2006, 7007);
