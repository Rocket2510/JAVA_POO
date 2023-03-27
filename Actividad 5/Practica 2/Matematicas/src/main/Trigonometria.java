package main;
import Interfaz.Matematicas;

public class Trigonometria implements Matematicas{

    //metodos para las operaciones
    @Override
    public double radianes(double angulo) { return Math.toRadians(angulo); }

    @Override
    public double grados(double angulo) { return Math.toDegrees(angulo); }

    @Override
    public double seno(double ang) { return Math.sin(radianes(ang)); }

    @Override
    public double coseno(double ang) { return Math.cos(radianes(ang)); }
    
}
