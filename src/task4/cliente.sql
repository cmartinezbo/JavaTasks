CREATE TABLE cliente( 
	cli_id int AUTO_INCREMENT, 
	cli_nombre varchar(20) NOT NULL, 
	cli_apellido varchar(30) NOT NULL, 
	cli_direccion varchar(30) NOT NULL, 
	cli_telefono int NULL,
	cli_fecha_nacimiento date NOT NULL,
	PRIMARY KEY(cli_id)
);
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Juan', 'Rogers', 'calle 13 # 12 - 32', 2111201450, '1998-10-01');
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Joselin', 'Martin', 'carrera 1 # 2 - 19', 310524875, '1975-07-12');
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Pedro', 'China', 'calle 2 # 5 - 23', 311002547, '1989-08-05');
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Raul', 'Grande', 'carrera 23 # 21 - 108', 200457895, '1994-01-07');
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Caudia', 'Pizarro', 'calle 56 # 90 - 45', 2100023458, '1977-10-08');
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Omar', 'Drinvet', 'carrera 11 # 102 - 13', 2019852252, '1988-08-10');
INSERT INTO cliente(cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_fecha_nacimiento) 
VALUES ('Daniela', 'Vita', 'transversal 3 # 9 - 1',350124583, '1991-05-25');
