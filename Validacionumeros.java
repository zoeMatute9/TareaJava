import java.util.Scanner;
public class Validacionumeros {
   
   public static void main (String args []){
    Scanner leer = new Scanner (System.in);
     int numero;
    System.out.print("Ingrese un número entero: ");
    numero=leer.nextInt();

    if(numero % 2==0){
        System.out.println("El número es par");
    }
    else{
        System.out.println("El número es impar");
    }
   }
}