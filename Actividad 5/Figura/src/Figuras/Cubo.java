package Figuras;

import Abstrac.Figura;
import Interfaz.Volumen;

public class Cubo extends Figura implements Volumen{
    private double lado;

    // Getters y Setters
    public double getLado(){ return lado; }
    public void setLado(double lado){ this.lado = lado; }
    
     //constructor
    public Cubo (String Color, double lado){
        super(Color);
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return 6*Math.pow(lado, 2);
    }

    @Override
    public double CalcularVolumen() {
        return Math.pow(lado, 3);
    }
    
    

    
    
}
