import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
        Pisos pisos = new Pisos();
           
           int subidos;
           int bajados;
           
           do {
               System.out.print("Cuantos pisos subiste? ");
               
               // Validacion de entrada para el valor de subidos
               while (!scanner.hasNextInt()) {
                   System.out.print("Por favor, ingresa un numero: ");
                   scanner.next();
               }
               subidos = scanner.nextInt();
               
               System.out.print("Cuantos pisos bajaste? ");
               
               // Validacion de entrada para el valor de bajados
               while (!scanner.hasNextInt()) {
                   System.out.print("Por favor, ingresa un numero: ");
                   scanner.next();
               }
               bajados = scanner.nextInt();
               
               for (int i = 0; i < subidos; i++) {
                   pisos.subir();
               }
               
               for (int i = 0; i < bajados; i++) {
                   pisos.bajar();
               }
           } while (subidos != 0 || bajados != 0);
           
           int totalEscalones = pisos.getTotalEscalones();
           float totalSegundosDeVida = pisos.getTotalSegundosDeVida();
           
           System.out.println("Escalones definitivos subidos: " + totalEscalones);
           System.out.println("Tu vida aumento: " + totalSegundosDeVida + " seg/ " + (totalSegundosDeVida / 60) + " min / " + (totalSegundosDeVida / 3600) + " horas");
    }
   }
}