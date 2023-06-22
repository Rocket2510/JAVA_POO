package modelo;

public class Cliente {
    int id;
    String dni, nombres, direcciones, estado;

    public Cliente() {} //constructor vacio

    public Cliente(int id, String dni, String nombres, String direcciones, String estado) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.direcciones = direcciones;
        this.estado = estado;
    }
    
    //GETTERS Y SETTERS
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDni() { return dni; }

    public void setDni(String dni) { this.dni = dni; }

    public String getNombres() { return nombres; }

    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getDireccion() { return direcciones; }

    public void setDireccion(String direcciones) { this.direcciones = direcciones; }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    
}
