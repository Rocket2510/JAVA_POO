package modelo;

import ConexionSQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentasDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int r=0;
    
    public List listarVentas() {
        List <Ventas> listaVenta = new ArrayList<>();
        String sql = "SELECT * FROM ventas";

        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Ventas v = new Ventas();
                v.setId(rs.getInt(1));
                v.setIdCliente(rs.getInt(2));
                v.setIdVendedor(rs.getInt(3));
                v.setSerie(rs.getNString(4));
                v.setFecha(rs.getNString(5));
                v.setMonto(rs.getInt(6));
                v.setEstado(rs.getString(7));
                
                listaVenta.add(v);
                
            }            
        } catch (SQLException ex) {
            System.out.println("Error al listar ventas: "+ex.toString());
        }
        return listaVenta;
        
    }
    
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
    
    public String NroSerieVentas(){
        String serie="";
        String sql="SELECT MAX(NumeroSerie) FROM ventas";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                serie = rs.getString(1);
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return serie;
    }
    
    public String IdVentas(){
        String idv="";
        String sql="SELECT MAX(IdVentas) FROM ventas";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                idv=rs.getString(1);
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return idv;
    } 
    public int GuardarVentas(Ventas v){
        Ventas ventas = new Ventas();
        String sql="INSERT INTO ventas(IdCliente, IdVendedor, NumeroSerie, FechaVenta, Monto, Estado) VALUES (?,?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdVendedor());
            ps.setString(3, v.getSerie());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            
            
            r=ps.executeUpdate();  
        } catch (SQLException e){
            System.out.println(e.toString() + " No se guardo la venta");
        }
        return r;
    }
    
    public int GuardarDetalleVentas(DetalleVentas dv){
        String sql="INSERT INTO detalle_ventas(IdVentas, IdProducto, Cantidad, PrecioVenta) VALUES (?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPreVenta());
            ps.executeUpdate(); 
            
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return r;
    }
}
