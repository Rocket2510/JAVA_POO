package modelo;

public class Vendedor {
    int id;
    String dni, nombres, telefono, estado, user;

    public Vendedor() {} //constructor vacio

    public Vendedor(int id, String dni, String nombres, String telefono, String estado, String user) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.estado = estado;
        this.user = user;
    }
    
    //GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
