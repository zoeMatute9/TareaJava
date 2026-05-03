public class CincoNumeros {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;

    public CincoNumeros (int n1, int n2, int n3, int n4, int n5){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }
    
    public CincoNumeros (){

    }
    public int getNumero1(){
        return n1;
    }
    public void setNumero1(int n1){
        this.n1 = n1;
    }
    public int getNumero2(){
        return n2;
    }
    public void setNumero2(int n2){
        this.n2 = n2;
    }
    public int getNumero3(){
        return n3;
    }
    public void setNumero3(int n3){
        this.n3 = n3;
    }
    public int getNumero4(){
        return n4;
    }
    public void setNumero4(int n4){
        this.n4 = n4;
    }
    public int getNumero5(){
        return n5;
    }
    public void setNumero5(int n5){
        this.n5 = n5;
    }
    public int getMayor(){
        int mayor = getNumero1();

        if (getNumero2() > mayor) mayor = getNumero2();
        if (getNumero3() > mayor) mayor = getNumero3();
        if (getNumero4() > mayor) mayor = getNumero4();
        if (getNumero5 () > mayor) mayor = getNumero5();
        return mayor;
    }
    public int getMenor(){
        int menor = getNumero1();

        if (getNumero2() < menor) menor = getNumero2();
        if (getNumero3() < menor) menor = getNumero3();
        if (getNumero4() < menor) menor = getNumero4();
        if (getNumero5() < menor) menor = getNumero5();
        return menor;
    }
 }
