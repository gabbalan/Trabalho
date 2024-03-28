import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<Jogador>();

        boolean sair = false;
        while (!sair) {
            System.out.println("-----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Adicionar Jogador");
            System.out.println("2. Aumentar Pontuação");
            System.out.println("3. Subir Nível");
            System.out.println("4. Exibir Informações dos Jogadores");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogador: ");
                    String nomeJogador = leitor.nextLine();
                    jogadores.add(new Jogador(nomeJogador));
                    System.out.println("Jogador adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o nome do jogador: ");
                    String nomePontuacao = leitor.nextLine();
                    Jogador jogadorPontuacao = buscarJogador(jogadores, nomePontuacao);
                    if (jogadorPontuacao != null) {
                        System.out.print("Digite a quantidade de pontos a aumentar: ");
                        int pontos = Integer.parseInt(leitor.nextLine());
                        jogadorPontuacao.aumentarPontuacao(pontos);
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o nome do jogador: ");
                    String nomeNivel = leitor.nextLine();
                    Jogador jogadorNivel = buscarJogador(jogadores, nomeNivel);
                    if (jogadorNivel != null) {
                        System.out.print("Digite a quantidade de níveis a subir: ");
                        int niveis = Integer.parseInt(leitor.nextLine());
                        jogadorNivel.subirNivel(niveis);

                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;

                case 4:
                for (int i = 0; i < jogadores.size(); i++) {
                    jogadores.get(i).exibirInformacoes();
        
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

    private static Jogador buscarJogador(List<Jogador> jogadores, String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equals(nomeJogador)) {
                return jogador;
            }
        }

        return null;
       
    }

}
