package cuentabancaria;


public class bancocuenta {
    public int cedula;
    public String nombre;
    private int monto ;

    public bancocuenta(int cedula, String nombre, int monto){
        this.cedula = cedula;
        this.nombre = nombre;
        this.monto = monto;
    }

    public void mostrar(){
        System.out.println("----> Cedula: " + cedula);
        System.out.println("----> Nombre: " + nombre);
        System.out.println("----> Monto disponible: " + monto);
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }



}

class Cahorros extends bancocuenta {
    public int deposito1;
    public int deposito2;
    public int deposito3;

    public Cahorros(int cedula, String nombre, int monto, int deposito1,
                    int deposito2, int deposito3) {
        super(cedula, nombre, monto);
        this.deposito1 = deposito1;
        this.deposito2 = deposito2;
        this.deposito3 = deposito3;
    }

    public void depositar(){
        System.out.println("1. Se ha depositado: " + deposito1);
        System.out.println("2. Luego, Se ha depositado: " + deposito2);
        System.out.println("3. Finalizando, Se ha depositado: " + deposito3);
        deposito1 += getMonto() + deposito2 + deposito3 ;
        setMonto(deposito1);
        System.out.println("----> Monto de la cuenta: " + getMonto());
    }

}

