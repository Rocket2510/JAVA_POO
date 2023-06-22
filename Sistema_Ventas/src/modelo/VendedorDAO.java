package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import ConexionSQL.Conexion;
import Interfaces.CRUD;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    Vendedor v = new Vendedor();

    PreparedStatement ps;
    ResultSet rs;
    
    public Vendedor listaID(String Dni){
        
        String sql="SELECT * FROM vendedor WHERE Dni=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, Dni);
            rs=ps.executeQuery();
            while(rs.next()){
                v.setId(rs.getInt(1));
                v.setDni(rs.getNString(2));
                v.setNombres(rs.getNString(3));
                v.setTelefono(rs.getString(4));
                v.setEstado(rs.getNString(5));
                v.setUser(rs.getNString(6));
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return v;
    }
    
    public Vendedor ValidarVendedor(String dni, String user){
        
        
        String sql="SELECT * FROM vendedor WHERE Dni = ? AND User = ? ";
        
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            
            while (rs.next()) {
                v.setId(rs.getInt(1));
                v.setDni(rs.getNString(2));
                v.setNombres(rs.getNString(3));
                v.setTelefono(rs.getNString(4));
                v.setEstado(rs.getNString(5));
                v.setUser(rs.getNString(6));
                
            } 
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return v;
    }
    
    
    @Override
    public List listar() {
        List <Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";

        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Vendedor v = new Vendedor();
                v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                v.setNombres(rs.getString(3));
                v.setTelefono(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUser(rs.getString(6));
                
                lista.add(v);
                
            }            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return lista;
    }
    
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO vendedor (Dni, Nombre, Telefono, Estado, User) VALUES (?, ?, ?, ?, ?)";

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
            System.out.println("ERROR AL INSERTAR DATOS EN LA TABLA\n" + e.toString());
        }
        return r; 
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = 
        "UPDATE vendedor SET Dni = ?, Nombre = ?, Telefono = ?, Estado = ?, User = ? WHERE IdVendedor = ?";

        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);  
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            
            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR LA TABLA\n" + e.toString());
            
        }

        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = 
        "DELETE FROM vendedor WHERE IdVendedor=?";

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
