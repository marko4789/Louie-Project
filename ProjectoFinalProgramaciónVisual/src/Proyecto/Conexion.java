package Proyecto;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:3306/bdcontenido";
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    
    public Conexion (){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean actualizarBD(String consulta){
        try {
            stmt.executeUpdate(consulta);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ResultSet consultarTabla(String tabla, String patron){
        ResultSet resultados = null; 
                
        try {
            resultados = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE " + patron + ";");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultados;
    }
    
}