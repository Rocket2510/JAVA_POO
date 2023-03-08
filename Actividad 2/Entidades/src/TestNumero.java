//CARRILLO GARCIA EDGAR JAVIER
import java.util.Scanner;
import Entidades.Numero;

public class TestNumero {
    public static void main (String args []){
        try{
            Numero Onum = new Numero();
            Scanner Leer = new Scanner(System.in);
            System.out.print("\n Ingrese el número: ");
            double n = Leer.nextInt();

            Onum.Num = n;
            System.out.println(" " + Onum.Primo());
            System.out.println(" " + Onum.Perfecto());
            System.out.println(" Factorial = " + Onum.Factorial());

        }catch(Exception ex){}
    }
}
