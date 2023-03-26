package Figuras;

import Abstrac.Figura;

public class Circulo extends Figura{
    private double radio;
    private final double PI=3.1415926535;

    // Getters y Setters
    public double getRadio(){ return radio; }
    public void setRadio(double radio){ this.radio = radio; }

    //constructor
    public Circulo (String Color, double radio){
        super(Color);
        this.radio = radio;

    }

    @Override
    public double CalcularArea(){
        return PI*Math.pow(radio,2);
    }

    
}
