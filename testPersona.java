public class testPersona {
    public static void main(String[] args) {
        System.out.print("\n  Cédula\tNombre Apellido Sexo  Edad");
        System.out.println("\n  ------------------------------------------");

        //declaración e instanciación de objetos
        //invoca el constructor ordinario
        Persona p = new Persona("2021600265", "Edgar", "García",'M', 20);
        Persona p1 = new Persona("2021800251", "Lluvia", "Paulino",'F', 21);
        Persona p2 = new Persona(p); //invoca al constructor por defecto o vacío
        Persona p3 = new Persona(); //invoca al constructor copia

        //envío de un mensaje, es decir, invocación a un método personalizado
        System.out.print(""+ p.toString()); 
        System.out.print(""+p1.toString()); 
        System.out.print(""+p2.toString()); 
        System.out.print(""+p3.toString()); 
    }

    //prueba
}