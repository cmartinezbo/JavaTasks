CREATE TABLE factura( 
	ven_nro_factura int NOT NULL, 
	ven_valor_compra int NOT NULL, 
	ven_fecha_compra date NOT NULL, 
	ven_sucursal varchar(30) NOT NULL, 
	ven_nombre_vendedor varchar(40) NULL,
	PRIMARY KEY(ven_nro_factura)
);
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7001, 251320, '2021-02-12', 'las maletas', 'Jesús Daniel');
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7002, 51350, '2021-02-13', 'las nubes', 'Pedro Banco');
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7003, 23000, '2021-02-14', 'las maletas', 'Oscar Marx');
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7004, 120000, '2021-02-15', 'las ciudadela', 'Petrona Daniel');
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7005, 231000, '2021-02-16', 'las maletas', 'Jesús Daniel');
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7006, 19000, '2021-02-17', 'las nubes', 'Claudio Rodri');
INSERT INTO factura(ven_nro_factura, ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (7007, 25000, '2021-02-18', 'las maletas', 'Jesús Daniel');
