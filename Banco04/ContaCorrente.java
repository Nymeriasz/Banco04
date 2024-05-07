package Banco04;

public class ContaCorrente extends ContaBancaria implements OperacoesBancarias{
    private double taxaDeJuros;
    private static int totalContasCorrentes = 0;
    public ContaCorrente(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
        totalContasCorrentes ++;
    }
    @Override
    public void atualizar() {
        saldo += saldo * taxaDeJuros;
    }
    @Override
    public void calcularJuros() {
        System.out.println("Juros não aplicável.");
    }
    public void emitirCheque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para emitir o cheque.");
        } else {
            saldo -= valor;
            System.out.println("Cheque emitido no valor de R$" + valor);
        }
    }
    public void retirar(double quantia){
        if (quantia>saldo){
            System.out.println("Saldo insuficiente!");
        }else{
            saldo -= quantia;
            System.out.println("Quantia retirada: "+quantia);
        }
    }
    public void retirar(double quantia, double taxaServico){
        double totalRetirada = quantia+taxaServico;
        if (totalRetirada>saldo){
            System.out.println("Saldo insuficiente!");
        }else{
            saldo -= totalRetirada;
            System.out.println("Retirada: "+quantia);
        }
    }
    public void total() {
        System.out.println("Contas correntes: "+totalContasCorrentes);
    }
}
