package Banco04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0.10);
        new ContaCorrente(0.10);
        ContaPoupanca cp = new ContaPoupanca(0.5);

        /*cc.depositar(100);
        cp.depositar(200);
        cc.obtersaldo();
        cp.obtersaldo();
        cc.atualizar();
        cp.atualizar();
        cc.obtersaldo();
        cp.obtersaldo();
        cc.emitirCheque(50);
        cc.calcularJuros();
        cp.retirar(100);
        cc.retirar(10, 0.2);
        cc.obtersaldo();
        cp.obtersaldo();
        cc.total();*/

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depósito em Conta Poupança");
            System.out.println("2. Depósito em Conta Corrente");
            System.out.println("3. Retirada em Conta Poupança");
            System.out.println("4. Retirada em Conta Corrente");
            System.out.println("5. Atualizar Conta Poupança");
            System.out.println("6. Atualizar Conta Corrente");
            System.out.println("7. Calcular Juros em Conta Poupança");
            System.out.println("8. Calcular Juros em Conta Corrente");
            System.out.println("9. Emitir cheque de Conta Corrrente");
            System.out.println("10. Sair");
            int escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite o valor: ");
                    double dp = sc.nextDouble();
                    cp.depositar(dp);
                    System.out.println("Depósito de R$"+dp+" realizado!");
                    break;
                case 2:
                    System.out.println("Digite um valor: ");
                    double dc = sc.nextDouble();
                    cc.depositar(dc);
                    System.out.println("Depósito de R$"+dc+" realizado!");
                    break;
                case 3:
                    System.out.println("Digíte o valor: ");
                    double rp = sc.nextDouble();
                    cp.retirar(rp);
                    break;
                case 4:
                    System.out.println("Digíte o valor: ");
                    double rc = sc.nextDouble();
                    System.out.println("Deseja incluir uma taxa de serviço? (Digite 'S' para Sim ou 'N' para Não)");
                    sc.nextLine();
                    String taxa = sc.nextLine();
                    if(taxa.equalsIgnoreCase("S")){
                        cc.retirar(rc, 0.5);
                    }else{
                        cc.retirar(rc);
                    }
                    break;
                case 5:
                    cp.atualizar();
                    cp.obtersaldo();
                    break;
                case 6:
                    cc.atualizar();
                    cc.obtersaldo();
                    break;
                case 7:
                    cp.calcularJuros();
                    break;
                case 8:
                    cc.calcularJuros();
                    break;
                case 9:
                    System.out.println("Digite o valor do cheque: ");
                    double cheque = sc.nextDouble();
                    cc.emitirCheque(cheque);
                case 10:
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}
