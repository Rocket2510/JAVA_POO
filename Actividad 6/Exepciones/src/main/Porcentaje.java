package main;
import Interfaz.*;

public class Porcentaje implements Funciones{

    @Override
    public double cantidadCorrespondiente(double valPorcentaje, double valTotal ) {
        double cantidadCorrespondiente = 0;
       
        cantidadCorrespondiente = ((valPorcentaje/valTotal)*100);
    
        return cantidadCorrespondiente;
    }

    @Override
    public double porcentaje(double valPorcentaje, double valTotal) {
        double porcentaje = 0;

        porcentaje = ((valPorcentaje/100)*valTotal);

        return porcentaje;
    }
    
}
