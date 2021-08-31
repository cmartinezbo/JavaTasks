DROP TABLE IF EXISTS factura;
CREATE TABLE factura( 
	ven_nro_factura int AUTO_INCREMENT, 
	ven_valor_compra int NOT NULL, 
	ven_fecha_compra timestamp NOT NULL, 
	ven_sucursal varchar(30)) NOT NULL, 
	ven_nombre_vendedor varchar(40) NULL,
	PRIMARY KEY(ven_nro_factura)
)AUTO_INCREMENT = 7001;
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (251320, '2021-02-12', 'las maletas', 'Jesús Daniel');
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (51350, '2021-02-13', 'las nubes', 'Pedro Banco');
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (23000, '2021-02-14', 'las maletas', 'Oscar Marx');
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (120000, '2021-02-15', 'las ciudadela', 'Petrona Daniel');
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (231000, '2021-02-16', 'las maletas', 'Jesús Daniel');
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (19000, '2021-02-17', 'las nubes', 'Claudio Rodri');
INSERT INTO cliente(ven_valor_compra, ven_fecha_compra, ven_sucursal, ven_nombre_vendedor) 
VALUES (25000, '2021-02-18', 'las maletas', 'Jesús Daniel');