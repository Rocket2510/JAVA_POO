package ConexionSQL;

import java.sql.*;
import java.util.logging.*;

public class Conexion {
    Connection con;
    
    public Connection Conectar(){
        //String url = "jdbc:mysql://localhost:3308/bd_ventas?useTimezone=true&serverTimezone=UTC";
        String url = "jdbc:mysql://localhost:3306/bd_ventas"; //?useTimezone=true&serverTimezone=UTC para que se pueda conectar al driver
        String username = "root"; //Cambia dependiendo el localhost de cada uno
        String password = "admin2510";   //Cambia dependiendo el localhost de cada uno
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, username,password);
            System.out.println("CONEXION A LA BASE DE DATOS EXITOSA!");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("ERROR AL CONECTAR A LA BASE DE DATOS");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        } 
        return con;
    }
    
    public void Desconectar(){
        try{
            con.close();
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
   
    //PROBAR LA CONEXION A LA DB
    public static void main (String args []){
        Conexion con = new Conexion();
        con.Conectar();
    }
}
