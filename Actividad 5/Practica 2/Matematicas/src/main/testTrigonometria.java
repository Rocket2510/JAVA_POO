package main;

import java.util.Scanner;

public class testTrigonometria {
   public static void main(String[] args) {
    double angulo;

    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Ingrese el angulo a convertir: ");
        angulo = in.nextDouble();
    }

    System.out.println("------------------------------------");

    Trigonometria funcion = new Trigonometria();
    System.out.println("La conversion de "+angulo+"º a radianes es: " + funcion.radianes(angulo));
    System.out.println("La conversion de "+angulo+"RAD a grados es: " + funcion.grados(angulo));
    System.out.println("El Seno de "+angulo+"º es :" + funcion.seno(angulo));
    System.out.println("El Coseno de "+angulo+"º es: " + funcion.coseno(angulo));
    
   }
}
