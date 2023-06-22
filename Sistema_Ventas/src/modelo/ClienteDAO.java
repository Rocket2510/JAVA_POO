package modelo;

import java.sql.*;
import java.util.*;
import ConexionSQL.Conexion;
import Interfaces.CRUD;
import java.util.logging.*;


public class ClienteDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();

    PreparedStatement ps;
    ResultSet rs;
    
    public Cliente listaID(String dni){
        Cliente c=new Cliente();
        String sql="select * from cliente where Dni=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setEstado(rs.getString(5));
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return c;
    }

    
    @Override
    public List listar() {
        List <Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";

        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getNString(2));
                c.setNombres(rs.getNString(3));
                c.setDireccion(rs.getNString(4));
                c.setEstado(rs.getNString(5));
                
                lista.add(c);
                
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO cliente (Dni, Nombre, Direccion, Estado) VALUES (?, ?, ?, ?)";

        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);  
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
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
        "UPDATE cliente SET Dni = ?, Nombre = ?, Direccion = ?, Estado = ? WHERE IdCliente = ?";

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
        "DELETE FROM cliente WHERE IdCliente=?";

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
