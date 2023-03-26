package Figuras;

import Abstrac.Figura;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    // Getters 
    public double getBase(){ return base; }
    public double getAltura(){ return altura; }
    
    // Setters
    public void setBase(double base){ this.base = base; }
    public void setAltura(double altura){ this.altura = altura; }

     //constructor
    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea(){ return (base*altura)/2; }   

    public String Imprimir(){
        return "El area del triangulo es: " + CalcularArea();
    }
    
    
}
