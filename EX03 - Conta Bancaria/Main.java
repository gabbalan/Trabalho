import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        boolean sair = false;
        while (!sair) {
            System.out.println("-----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Exibir Informações das Contas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o número da conta: ");
                    String numeroConta = leitor.nextLine();
                    System.out.print("Digite o nome do titular: ");
                    String nomeTitular = leitor.nextLine();
                    System.out.print("Digite o saldo inicial: ");
                    float saldoInicial = Float.parseFloat(leitor.nextLine());

                    contas.add(new ContaBancaria(numeroConta, nomeTitular, saldoInicial));
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o número da conta: ");
                    String numContaDeposito = leitor.nextLine();
                    ContaBancaria contaDeposito = buscarConta(contas, numContaDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Digite o valor a depositar: ");
                        int valorDeposito = Integer.parseInt(leitor.nextLine());
                        contaDeposito.depositar(valorDeposito);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o número da conta: ");
                    String numContaSaque = leitor.nextLine();
                    ContaBancaria contaSaque = buscarConta(contas, numContaSaque);
                    if (contaSaque != null) {
                        System.out.print("Digite o valor a sacar: ");
                        int valorSaque = Integer.parseInt(leitor.nextLine());
                        contaSaque.sacar(valorSaque);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < contas.size(); i++) {
                        contas.get(i).exibirInformacoes();
                    }
                    break;

                case 5:
                    sair = true;
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitor.close();
    }

    private static ContaBancaria buscarConta(List<ContaBancaria> contas, String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
 

    }
}