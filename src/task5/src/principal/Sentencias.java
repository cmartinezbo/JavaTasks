/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author crist
 */
public class Sentencias {
    
    public static String LISTAR = "SELECT * FROM producto";
    
    public static String REGISTRAR = "INSERT INTO producto("
            + "prod_nombre,"
            + "prod_valor,"
            + "prod_cantidad,"
            + "prod_material) "
            + "VALUES(?, ?, ?, ?)";
    
    public static String ACTUALIZAR = "UPDATE producto SET "
            + "prod_nombre = ?,"
            + "prod_valor = ?,"
            + "prod_cantidad = ?,"
            + "prod_material = ?) "
            + "WHERE prod_codigo = ?";
    
    public static String ELIMINAR = "DELETE FROM producto WHERE prod_codigo = ?";
    
    public static String ELIMINAR_TODO = "TRUNCATE TABLE producto";
    
    private int prod_codigo;
    private String prod_nombre;
    private int prod_valor;
    private int prod_cantidad;
    private String prod_material;

    public int getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(int prod_codigo) {
        this.prod_codigo = prod_codigo;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public int getProd_valor() {
        return prod_valor;
    }

    public void setProd_valor(int prod_valor) {
        this.prod_valor = prod_valor;
    }

    public int getProd_cantidad() {
        return prod_cantidad;
    }

    public void setProd_cantidad(int prod_cantidad) {
        this.prod_cantidad = prod_cantidad;
    }

    public String getProd_material() {
        return prod_material;
    }

    public void setProd_material(String prod_material) {
        this.prod_material = prod_material;
    }

    
    
}
