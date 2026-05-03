import java.util.Scanner;

public class Numeros {
    public static void main (String args[]) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese un número:");
        double n1 = leer.nextInt();
        System.out.print("Ingrese otro número:");
        double n2 = leer.nextInt();

        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Producto: " + (n1 * n2));
        System.out.println("Diferencia: " + (n1 - n2));

        if (n2 !=0) {
            System.out.println("División: " + (n1 / n2));
        }
        else {
            System.out.println("No se puede dividir entre 0");
        }
        leer.close();
        
    }
}
