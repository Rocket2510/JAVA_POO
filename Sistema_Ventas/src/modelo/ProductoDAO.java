package modelo;

import java.sql.*;
import java.util.*;
import ConexionSQL.Conexion;
import Interfaces.CRUD;


public class ProductoDAO implements CRUD{
    int r;
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public int actualizarStock(int cant, int idp){
        String sql = "UPDATE producto SET Stock = ? WHERE IdProducto = ?";
        try{
            con = cn.Conectar();
            ps =  con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("ERROR AL ACTUALIZAR STOCK EN LA TABLA\n" + e.toString());
        }
        
        return r;
    }
    
    
    public Producto listarID(int id){
        Producto p = new Producto();
        String sql="SELECT * FROM producto WHERE IdProducto = ?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
            }
        }catch (SQLException e){
            System.out.println("Error al listar: "+e.toString());
        }
        return p;
    }
    
    @Override
    public List listar() {
        List <Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto";

        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getNString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getNString(5));
                
                lista.add(p);
                
            }            
        } catch (SQLException ex) {
            System.out.println("Error al listar2: "+ex.toString());
        }
        return lista;
        
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO producto (Nombre, Precio, Stock, Estado) VALUES (?, ?, ?, ?)";

        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);  
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AL AGREGAR DATOS EN LA TABLA\n" + e.toString());
        }
        return r; 
       
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = 
        "UPDATE producto SET Nombre = ?, Precio = ?, Stock = ?, Estado = ? WHERE IdProducto = ?";

        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);  
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            
            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR LA TABLA\n" + e.toString());
            
        }

        return r;
        
    }

    @Override
    public void eliminar(int id) {
        String sql = 
        "DELETE FROM producto WHERE IdProducto=?";

        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AL ELIMINAR DATOS EN LA TABLA\n" + e.toString());
        }
    }
}

