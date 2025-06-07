package Ejercicios2;

public class CuentaBancaria {

    String titular;
    int saldo;
    
    //uso de constructor
    public CuentaBancaria(String titular, int saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    //Metodo para depositar
    public void depositar(int cantidad){
        saldo += cantidad;
        System.out.println("Se han depositado " + cantidad + " en la cuenta de " + titular);
        System.out.println("Saldo nuevo: " + saldo);
    }
    //Metodo para retirar, uso de if en caso de que el saldo sea insuficiente
    public void retirar (int cantidad){
        if (saldo < cantidad){
            System.out.println("Saldo insuficiente");
        }else{
            saldo-=cantidad;
            System.out.println("Se han retirado " + cantidad + " de la cuenta de " + titular);
            System.out.println("Cantidad restante: " + saldo);
        }
    }
    //Mostrar saldo
    public void mostrarSaldo(){
        System.out.println("Saldo de " + titular + " es de: " + saldo);
    }
}
