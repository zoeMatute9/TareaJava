import java.util.Scanner;
public class Separaciondigitos {
    public static void main (String [] args){
       Scanner leer = new Scanner (System.in);

       System.out.print("Ingrese un número con 5 dígitos:");
       int num = leer.nextInt();

       if (num >= 10000 && num<= 99999) {
        
        int d1 = num / 10000;
        int d2 = (num / 1000) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 10) % 10;
        int d5 = num % 10;

        System.out.println(d1 + "  " + d2 + "  " + d3 + "  " + d4 + "  " + d5);
       }
       else {
        System.out.println("Error: debe tener 5 dígitos");
       }
       leer.close();
    }
}
