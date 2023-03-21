package Interfaz;
import Entidades.*;

public class testHerencia {
    
    public static void main (String args []){
        int MAX = 10;
        int n = 0;

        //array estático de referencias de clase base
        Persona p[] = new Persona[MAX];

        //objetos de clase Persona
        p[n++] = new Persona("2021600265", "Edgar", "Garcia", 'M', 18, "Puebla");
        p[n++] = new Persona("2021600141", "Lluvia", "Paulino", 'F', 18, "Quiev");

        //obejtos de la clase Estudiante
        p[n++] = new Estudiante("2220600101", "Karen", "Vieyra", 'F', 18, "Machala", "Sistemas", "Tercero");
        p[n++] = new Estudiante("2321600110", "Jose", "Torres", 'M', 19, "Quito", "Medicina", "Primero");

        //obejtos de la clase Trabajador
        p[n++] = new Trabajador("3320600201", "Javier", "Herrera", 'M', 42, "Cuenca", "Coordinador", 2800);
        p[n++] = new Trabajador("3421600310", "Joel", "Miler", 'M', 32, "Brito", "Docente TC", 1800);

        System.out.println("\n Cedula\t\tNOMBRES\tAPELLIDOS\tSEXO\tEDAD\t" + 
            "CIUDAD\tCARRERA\t  CURSO\t  CARGO\tSUELDO");
       
        System.out.println("................................................"+
                           "................................................");

        //imprime todos empleando el método imprimir Polimorfismo
        for(int i=0; i <n ; i++){
            System.out.println(p[i].toString());
        }
    }
}
