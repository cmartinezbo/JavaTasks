CREATE TABLE ofrece( 
	prov_codigo_fk int NOT NULL,
	prod_codigo_fk int NOT NULL,
	PRIMARY KEY(prov_codigo_fk),
    FOREIGN KEY(prod_codigo_fk) REFERENCES producto(prod_codigo)
);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (123, 2001);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (124, 2002);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (125, 2003);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (126, 2004);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (127, 2005);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (128, 2006);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (129, 2007);
INSERT INTO ofrece(prov_codigo_fk, prod_codigo_fk)
VALUES (130, 2008);
