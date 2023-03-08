//CARRILLO GARCIA EDGAR JAVIER
package Entidades;
public class Numero {
    //Atributo
    public double Num;
    //Constructor vacio
    public Numero(){}
    //Constructor comun
    public Numero(double Num){
        this.Num =  Num;
    }

    //Método que verifica si un número es primo
    public String Primo(){
        String men; int a = 0;

        for(double i = 1; i <= Num; i++){
            if(Num % i==0){
                a++;
            }
        }

        if(a == 2){
            men="Número es Primo";
        }else{
            men="Número no es Primo";
        }
        return men;
    }
    //Método que verifica si un número es perfecto
    public String Perfecto(){
        String men; double a = 0;

        for(double i = 1; i < Num; i++){
            if(Num % i==0){
                a += i;
            }
        }

        if(a == Num){
            men="Número es Perfecto";
        }else{
            men="Número no es Perfecto";
        }
        return men;
    }

    //Método que calcula el factorial de un número
    public double Factorial(){
        double fac=1;
        while( Num!=0){
            fac *= Num;
            Num--;
        }

        return fac;
    }

}

