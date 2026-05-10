import java.util.Scanner;
public class Estudiantes {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaProyecto;
    
    public Estudiantes (String nombre, double nota1, double nota2, double nota3, double notaProyecto){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaProyecto = notaProyecto;
    }
    public String toString(){
       return "nombre: " + nombre + "\nnota1: " + nota1 + "\nnota2: " + nota2 + "\nnota3: " + nota3 + "\nnotaProyecto: " + notaProyecto;
    }
    public Estudiantes (){
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public double getnota1(){
        return nota1;
    }
    public void setnota1(double nota1){
        this.nota1 = nota1;
    }
    public double getnota2(){
        return nota2;
    }
    public void setnota2(double nota2){
        this.nota2 = nota2;
    }
    public double getnota3(){
        return nota3;
    }
    public void setnota3(double nota3){
        this.nota3 = nota3;
    }
    public double getnotaProyecto(){
        return notaProyecto;
    }
    public void setnotaProyecto(double notaProyecto){
        this.notaProyecto = notaProyecto;
    }
    leer.close

    




    
}
