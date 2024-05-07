package Banco04;

public class ContaPoupanca extends ContaBancaria implements OperacoesBancarias{
    private double taxaDeJuros;
    public ContaPoupanca(double taxaDeJuros){
        this.taxaDeJuros = taxaDeJuros;
    }
    @Override
    public void atualizar() {
        saldo += saldo * taxaDeJuros;
    }
    @Override
    public void calcularJuros() {
        saldo += saldo * taxaDeJuros;
    }
}