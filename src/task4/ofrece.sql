DROP TABLE IF EXISTS ofrece;
CREATE TABLE ofrece( 
    prov_codigo_fk int NOT NULL;
    prod_codigo_fk int NOT NULL;
    PRIMARY KEY(prov_codigo_fk),
    FOREIGN KEY(prov_codigo_fk) REFERENCES proveedor(prov_codigo),
    FOREIGN KEY(prod_codigo_fk) REFERENCES producto(prod_codigo)
)
INSERT INTO productos(prod_nombre, prod_valor, prod_cantidad, prod_material) 
VALUES ('super cuerdas', 11000, 12, 'nylon');