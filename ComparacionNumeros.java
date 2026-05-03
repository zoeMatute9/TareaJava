import java.util.Scanner;

public class ComparacionNumeros {
    public static void main (String args[]) {
        Scanner leer = new Scanner (System.in);

        System.out.print("Ingrese primer número:");
        int k = leer.nextInt();
        System.out.print("Ingrese segundo número:");
        int z = leer.nextInt();

        if (k > z){
            System.out.println (k + "es el número mayor");
        }
        else if (z > k){
            System.out.println (z + "es el número mayor");
        }
        else {
            System.out.println ("Son números iguales");
        }
        leer.close();
    }

    
}
