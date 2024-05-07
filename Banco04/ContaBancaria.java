package Banco04;

public abstract class ContaBancaria {
    protected double saldo;
    public void depositar(double quantia){
        saldo += quantia;
    }
    public void retirar(double quantia){
        saldo -= quantia;
    }
    public void obtersaldo() {
        System.out.println("Saldo: "+saldo);
    }
    public abstract void atualizar();
}
