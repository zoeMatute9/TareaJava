import java.util.Scanner;
public class TresNumeros {
    public static void main (String args []) {
        Scanner leer = new Scanner (System.in);

        System.out.print("Ingrese tres números:");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = leer.nextInt();

        int suma = n1 + n2 + n3;
        int producto = n1 * n2 * n3;
        double promedio = suma / 3.0;

        int mayor = Math.max(n1, Math.max(n2,n3));
        int menor = Math.min(n1, Math.min(n2, n3));

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto: " + producto);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        leer.close();




    }

    
}
