import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        
        Scanner leitor = new Scanner(System.in);

        List<Carro> carros = new ArrayList<Carro>();


        boolean sair = false;
        while (!sair) {
            System.out.println("-----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Mostrar Informações dos Carros");
            System.out.println("3. Acelerar ou Frear um Carro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca do carro: ");
                    String marca = leitor.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = leitor.nextLine();
                    System.out.print("Digite o ano do carro: ");
                    int ano = Integer.parseInt(leitor.nextLine());
                    System.out.print("Digite a placa do carro: ");
                    String placa = leitor.nextLine();
                    System.out.print("Digite a velocidade atual do carro: ");
                    float velocidade = Float.parseFloat(leitor.nextLine());

                    carros.add(new Carro(marca, modelo, ano, placa, velocidade));
                    System.out.println("Carro adicionado com sucesso!");
                    break;

                case 2:
                for (int i = 0; i < carros.size(); i++) {
                    carros.get(i).exibirInformacoes();
        
                }
                    break;

                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.println("Escolha o carro pelo número:");
                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println((i + 1) + ". " + carros.get(i).getMarca() + " " + carros.get(i).getModelo());
                    }
                    int escolha = Integer.parseInt(leitor.nextLine());
                    if (escolha > 0 && escolha <= carros.size()) {
                        Carro carroSelecionado = carros.get(escolha - 1);
                        boolean continuar = true;
                        while (continuar) {
                            System.out.println("Velocidade atual do carro: " + carroSelecionado.getVelocidadeAtual());
                            System.out.println("1. Acelerar");
                            System.out.println("2. Frear");
                            System.out.println("3. Sair");
                            int acao = Integer.parseInt(leitor.nextLine());
                            switch (acao) {
                                case 1:
                                    carroSelecionado.acelerar();
                                    break;

                                case 2:
                                    carroSelecionado.frear();
                                    break;

                                case 3:
                                    continuar = false;
                                    break;

                                default:
                                    System.out.println("Opção inválida.");
                            }
                        }
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;
                case 4:
                    sair = true;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitor.close();
    }
}
        
    

