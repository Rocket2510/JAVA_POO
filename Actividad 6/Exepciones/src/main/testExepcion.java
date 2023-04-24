package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testExepcion {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

       double valorTotal = 0 , valorPorcentaje = 0, porcentaje = 0;

        //Solicitamos datos al usuario
        System.out.print("Ingrese la cantidad que conforma el 100%: "); //Ej: valorTotal = 32000
        try{
            valorTotal = in.nextDouble();
        }catch (InputMismatchException e){
            System.out.println(" -- Error: debe ingresar un valor numérico -- \n");
        }

        //Al intentar probar un try && catch con la exepcion ArithmeticException, no se mostraba el texto con el que "valida" que no se puede dividir entre 0
        //Por lo tanto, use un if
        if (valorTotal == 0) {
            System.out.println(" -- Error: el valor que conforma el 100% no puede ser cero --");
            return;
        }
        
       //Preguntamos al usuario si quiere calcular el porcentaje o el valor correspondiente
        System.out.println("¿Qué desea calcular? (1) Porcentaje  (2)Valor correspondiente : ");
        int opcion = 0;
        try {
            opcion = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" -- Error: debe ingresar un número entero -- \n");
        }

        //Instanciamos un objeto de la clase porcentaje
        Porcentaje n = new Porcentaje();

        //Bloque que se ejecuta cuando la opcion es 1
        if (opcion == 1){
             // Solicitamos al usuario el valor del cual se quiere saber el porcentaje al que corresponde
             System.out.println("Ingrese el valor del cual se quiere saber el porcentaje al que corresponde: "); //Ej : porcentaje = 30
             try {
                 porcentaje = in.nextDouble();
             } catch (InputMismatchException e) {
                System.out.println(" -- Error: debe ingresar un valor numérico -- \n");
             }

             if (porcentaje == 0) {
                System.out.println(" -- Error: No se puede dividir entre 0 --");
                return;
             }


              //imprimir resultado
             System.out.println("El " + porcentaje + "% del valor total "+ valorTotal +" es igual a " + n.porcentaje(valorTotal, porcentaje) + 
             "\n ------------------------------------------------");
        
        //Bloque que se ejecuta cuando la opcion es 2
        }else if (opcion == 2){
            // Solicitamos al usuario el porcentaje del que se requiere saber el valor
            System.out.println("Ingrese el porcentaje del que se requiere saber el valor: "); //Ej: valorPorcentaje = 9600
            try {
                valorPorcentaje = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(" -- Error: debe ingresar un valor numérico -- \n");
            }

            if (valorPorcentaje == 0) {
                System.out.println(" -- Error: No se puede dividir entre 0 --");
                return;
             }

             //imprimir resultado
            System.out.print("El valor " + valorPorcentaje + " representa el " + n.cantidadCorrespondiente(valorPorcentaje, valorTotal) + "% del total" +
            "\n ------------------------------------------------");
        }else{
            System.out.println("Error: debe ingresar 1 o 2");
        }
    }
}
