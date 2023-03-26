package Figuras;

import Abstrac.Figura;

public class Rectangulo extends Figura{
    private double altura, base;

    // Getters
    public double getBase(){ return base; }
    public double getAltura(){ return altura; }
    //Setters
    public void setAltura(double altura){ this.altura = altura; }
    public void setBase(double base){ this.base = base; }

    //constructor
    public Rectangulo (String color, double base, double altura){
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double CalcularArea() { return base*altura; }
}
