package Entidades;

public class Estudiante extends Persona{
    private String escuela;
    private String semestre;

    //métodos de la lectura
    public String getEscuela(){ return escuela;}
    public String getSemestre(){ return semestre;}

    //métodos de escritura
    public void setEscuela(String escuela){ this.escuela = escuela;}
    public void setSemestre(String semestre){ this.escuela = semestre;}

    //constructor por defecto
    public Estudiante() { setEscuela(""); setSemestre("");}

    //constructor por ordinario
    public Estudiante (String ced, String nom, String ape, char sex, int eda, String ciudad, String escuela, String semestre){

                //invoca al constructor ordinario padre
               super(ced, nom, ape, sex, eda, ciudad);

                //this hace referencia a la misma clase en este caso Estudiante
                setEscuela(escuela);
                setSemestre(semestre);

        }
   //Constructor copia
   public Estudiante (Estudiante e){
        //invoca al constructor copia padre  convirtiendo el objeto
        //Estudiante en objeto padre Persona

        super((Persona)e);
        setEscuela(e.getEscuela());
        setSemestre(e.getSemestre());
   }

   //redefinición del método padre (polimorfismo)
   @Override
   public String Imprimir(){
        return (super.Imprimir()+"\t"+getEscuela()+"  "+getSemestre());
   }
}
