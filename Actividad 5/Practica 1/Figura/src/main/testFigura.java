package main;
import java.util.Scanner;
import Figuras.*;

public class testFigura {
    public static void main (String args []){
        double lado, base, altura, radio;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Ingrese el Lado de la figura: ");
            lado = in.nextDouble();
            System.out.print("Ingrese la Base de la figura: ");
            base = in.nextDouble();
            System.out.print("Ingrese la Altura de la figura: ");
            altura =in.nextDouble();
            System.out.print("Ingrese el el radio de la figura: ");
            radio = in.nextDouble();
        }
      
        System.out.println("---------------------------------------\n");
        //prueba triangulo
        Triangulo triangulo = new Triangulo(null, base, altura);
        triangulo.setAltura(altura);
        triangulo.setBase(base);
        System.out.println("El área del triángulo es: " + triangulo.CalcularArea());

        //test rectangulo
        Rectangulo rectangulo = new Rectangulo(null, base, altura);
        rectangulo.setAltura(altura);
        rectangulo.setBase(base);
        System.out.println("El área del rectángulo es: " + rectangulo.CalcularArea());

        //test circulo
        Circulo circulo = new Circulo(null, radio);
        circulo.setRadio(radio);
        System.out.println("El área del circulo es: " + circulo.CalcularArea());

        //test cubo
        Cubo Cubo = new Cubo(null, lado);
        Cubo.setLado(lado);
        System.out.println("El volumen del cubo es: " + Cubo.CalcularVolumen());
        System.out.println("El Area del cubo es: " + Cubo.CalcularArea());

    }
}
