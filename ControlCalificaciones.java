import java.util.Scanner;
public class ControlCalificaciones {
    public static void main (String [] args){
        Scanner leer = new Scanner (System.in);
        
        for (int i = 1; i<= 3; i++){
            System.out.print("Ingrese su nombre:");
            String nombre = leer.nextLine();
            
            System.out.print("Ingrese su edad:");
            int edad = leer.nextInt();

            String clasificacionEdades;
            if (edad >=18){
                clasificacionEdades = "Mayor de edad";
            }else {
                clasificacionEdades = "Menor de edad";
            }

            int calificacion;
            do {
                System.out.print("Ingrese su calificación (0-100): ");
                calificacion = leer.nextInt();
                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("Calificación inválida.");
                }
            } while (calificacion < 0 || calificacion > 100);

            String resultado;
            if (calificacion >= 90){
                resultado = "Excelente";
            }else if (calificacion >= 80){
                resultado = "Muy bueno";
            }else if (calificacion >= 70){
                resultado = "Bueno";
            }else if (calificacion >= 60){
                resultado = "Regular";
            }else {
                resultado = "Reprobado";
            }

            System.out.println("\n ======RESUMEN======");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Clasificación: " + clasificacionEdades);
            System.out.println("Calificación: " + calificacion);
            System.out.println("Resultado: " + resultado);
        }
        leer.close();
    }
}
