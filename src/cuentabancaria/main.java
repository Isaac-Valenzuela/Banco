package cuentabancaria;

public class main {
    public static void main(String [] args){
        //Cahorros b1 = new Cahorros(123,"Juan", 200, 10);
        //b1.mostrar();
        //b1.depositar();
        Cahorros b2 = new Cahorros(123,"Juan", 10, 100, 200, 50);
        b2.mostrar();
        b2.depositar();
        b2.mostrar();
    }
}
