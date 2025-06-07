package Ejercicios2;

public class Main {
    public static void main(String[] args) {
        //Creando el objeto de la primera cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria("Jorge",10000);
        //Creando el objeto de la segunda cuenta
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan",16000);
        //Probando metodo depositar
        cuenta1.depositar(15000);
        cuenta2.depositar(200);
        //Probando metodo mostrarSaldo
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
        //Probando metodo retirar
        cuenta1.retirar(5000);
        cuenta2.retirar(50000);
    }

}
