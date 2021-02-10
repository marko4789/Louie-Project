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
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ResultSet consultarTabla(String tabla, String regla){
        ResultSet resultados = null; 
                
        try {
            resultados = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE " + regla + ";");
            //resultados.next();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultados;
    }
    
    public ResultSet consultarBD(String consulta){
        ResultSet resultados = null; 
                
        try {
            resultados = stmt.executeQuery(consulta);
          //  resultados.next();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultados;
    }
    
    public boolean registrarAlumno(String nombres, String apellidoPaterno, String apellidoMaterno, String edad, String salon){
        String consulta = "INSERT INTO `tabla_alumnos`(`nombre`, `apellido_paterno`, `apellido_materno`, `edad`, `salon`, `status`) VALUES ('"+ nombres +"', '"+ apellidoPaterno +"', '"+ apellidoMaterno +"', "+ edad +", '"+ salon +"', 'Activo');";
        
        try {
            stmt.executeUpdate(consulta);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
    public boolean actualizarAlumno(String ID, String nombres, String apellidoPaterno, String apellidoMaterno, String edad, String salon, String status){
        String consulta = "UPDATE `tabla_alumnos` SET `nombre`='"+nombres+"',`apellido_paterno`='"+apellidoPaterno+"',`apellido_materno`='"+apellidoMaterno+"',`edad`="+edad+",`salon`='"+salon+"',`status`='"+status+"' WHERE id_alumno = "+ID+";";
        
        try {
            stmt.executeUpdate(consulta);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean registrarUsuario(String nombre, String contrasena, String tipo, String id_alumno){
        String consulta = "INSERT INTO `tabla_usuarios`(`nombre`, `contraseña`, `status`, `tipo`, `id_alumno`) VALUES ('"+ nombre +"', '"+ contrasena +"', 'Activo', '"+ tipo +"', "+ id_alumno +");";
        
        try {
            stmt.executeUpdate(consulta);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean actualizarUsuario(String ID, String nombre, String contrasena, String status, String tipo){
        String consulta = "UPDATE `tabla_usuarios` SET `nombre`='"+nombre+"',`contraseña`='"+contrasena+"',`status`='"+status+"', `tipo`='"+tipo+"' WHERE id_usuario = "+ID+";";
        
        try {
            stmt.executeUpdate(consulta);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
}