package Entidades;

public class Trabajador extends Persona{
    private String cargo;
    private float sueldo;

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public float getSueldo(){
        return sueldo;
    }

    public void setSueldo(float sueldo){
        this.sueldo = sueldo;
    }

    //constructor por defecto
    public Trabajador(){cargo=""; sueldo=0;}

    //constructor ordinario
    public Trabajador(String ced, String nom, String ape, char sex, int eda, String ciudad, String cargo, float sueldo){
        //invoca al constructor ordinario padre
        super(ced, nom, ape, sex, eda, ciudad);

        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Trabajador (Trabajador t){
        super((Persona)t);
        cargo = t.cargo;
        sueldo = t.sueldo;
    }
    
    //redefinición del método padre (polimorfismo
    @Override
    public String Imprimir() {
        return (super.Imprimir()+"\t"+"\t"+"\t"+"\t   " + cargo + "\t" + sueldo);
    }
}
