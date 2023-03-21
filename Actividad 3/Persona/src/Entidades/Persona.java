package Entidades;

public class Persona {
    //Datos o atributos de la clase
    public String cedula, nombre, apellido, ciudad;
    public char sexo;
    public int edad;
    
    //public Persona(){ } //Constructor por defecto vacio opción1 
    
    //constructor por defecto que inicializa los datos opción2
    public Persona(){
        this.cedula = "..........";
        this.nombre = ".....";
        this.apellido = ".....";
        this.sexo = '-';
        this.edad = 0;
        this.ciudad = ".....";
    }

    //Parámetros
    public Persona (String ced, String nom, String ape, char sex, int eda, String ciudad){
        this.cedula = ced;
        this.nombre = nom;
        this.apellido = ape;
        this.sexo = sex;
        this.edad = eda;
        this.ciudad = ciudad;
    }

    //Constructor copia
    public Persona (Persona p){
        this.cedula = p.cedula;
        this.nombre = p.nombre;
        this.apellido = p.apellido;
        this.sexo = p.sexo;
        this.edad = p.edad;
        this.ciudad = p.ciudad;
    }

    //Método personalizado de una Clase
    public String Imprimir(){
        return "  " + cedula + "\t" + nombre + "\t" + apellido + "\t" +
                sexo + "\t" + edad + "\t" + ciudad + "n";
    }

}
