/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author crist
 */
public class Funciones {
    
    private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    
    public static boolean isRegister(Sentencias s) {
        String sql = Sentencias.REGISTRAR;
        try {  
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getProd_nombre());
            ps.setInt(2, s.getProd_valor());
            ps.setInt(3, s.getProd_cantidad());
            ps.setString(4, s.getProd_material());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public static boolean isUpdate(Sentencias s) {
        String sql = Sentencias.ACTUALIZAR;
        try {  
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getProd_nombre());
            ps.setInt(2, s.getProd_valor());
            ps.setInt(3, s.getProd_cantidad());
            ps.setString(4, s.getProd_material());
            ps.setInt(5, s.getProd_codigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
    
    public static boolean isDelete(Sentencias s) {
        String sql = Sentencias.ELIMINAR;
        try {  
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getProd_codigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static boolean isTruncate() {
        String sql = Sentencias.ELIMINAR_TODO;
        try {  
            ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void setListar(String buscar) { 
        DefaultTableModel modelo = (DefaultTableModel)Crud.tablaProducto.getModel(); 
           
        while(modelo.getRowCount() > 0) {
            modelo.removeRow(0);    
        }
        
        String sql = "";
        
        if(buscar.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM producto WHERE prod_codigo =" + buscar;
            
        }
        
        String datos[] = new String[5];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                datos[0] = rs.getString("prod_codigo");
                datos[1] = rs.getString("prod_nombre");
                datos[2] = rs.getString("prod_valor");
                datos[3] = rs.getString("prod_cantidad");
                datos[4] = rs.getString("prod_material");
                
                modelo.addRow(datos);  
            }
            
        } catch (SQLException ex) {
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);            
        }   
    }
    
    public static String extraerCodigoMax() {
        String sql = "SELECT MAX(prod_codigo) AS valor FROM producto";
        int codigo = 0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           if(rs.next()) {
               codigo = rs.getInt("valor");
           }
           
           if(codigo == 0) {
               codigo = 1;
           } else {
              codigo = codigo + 1;
           }
            return String.valueOf(codigo);
        } catch (SQLException ex) {
            return null;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
    }
    
}
