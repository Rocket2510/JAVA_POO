package Abstrac;

public abstract class Figura {
    private String color;

     //constructor
    public Figura(String color){ this.color = color; }

    public abstract double CalcularArea();

    public String getColor(){ return color; }
    
}
