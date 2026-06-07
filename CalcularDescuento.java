import java.util.Scanner;

public class CalcularDescuento {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra (Lempiras): ");
        double montoCompra = sc.nextDouble();
        double descuento;
        double totalPago;

        // Reto: validaremos que el monto de la compra sea un número válido
        if (montoCompra <= 0){
            System.out.println("Error: El monto debe ser mayor a 0.");
        } else{
            if (montoCompra > 1000) {
                descuento = montoCompra * 0.10;
            }else {
                descuento = montoCompra * 0.05;
            }

             totalPago = montoCompra - descuento;

        System.out.println(" --- RESUMEN DE COMPRA ---");
        System.out.println("Monto Original: Lempiras " + montoCompra);
        System.out.println("Descuento aplicado: Lempiras " + descuento);
        System.out.println("Total a pagar: Lempiras " + totalPago);
        System.out.println("---------------");
        }

        sc.close();
    }
}
