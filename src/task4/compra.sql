CREATE TABLE compra( 
	id_compra int,
	cli_id_fk int NOT NULL,
	ven_nro_factura_fk int NOT NULL,
	PRIMARY KEY(id_compra),
    FOREIGN KEY(cli_id_fk) REFERENCES cliente(cli_id),
    FOREIGN KEY(ven_nro_factura_fk) REFERENCES factura(ven_nro_factura)
);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (1, 1, 7001);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (2, 3, 7001);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (3, 4, 7001);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (4, 1, 7003);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (5, 2, 7003);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (6, 1, 7004);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (7, 2, 7004);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (8, 7, 7005);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (9, 1, 7006);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (10, 1, 7007);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (11, 5, 7007);
INSERT INTO compra(id_compra, cli_id_fk, ven_nro_factura_fk)
VALUES (12, 6, 7007);
