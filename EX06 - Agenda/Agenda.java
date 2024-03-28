import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda{

    public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();

        boolean sair = false;
        while (!sair) {
            System.out.println("--------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Exibir Lista de Contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitor.nextLine());
            

            switch (opcao) {
                case 1:
                System.out.println("--------------------------------");
                    System.out.print("Digite o nome do contato: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = leitor.nextLine();
                    contatos.add(new Contato(nome, telefone));
                    System.out.println("Contato adicionado.");
                    break;

                case 2:
                    if (contatos.isEmpty()) {
                        System.out.println("Agenda vazia. Não há contatos para remover.");
                    } else {
                        System.out.println("--------------------------------");
                        System.out.println("Escolha o contato pelo número:");
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + ". " + contatos.get(i).getNome());
                        }
                        int indiceRemover = leitor.nextInt() - 1;
                        leitor.nextLine();
                        if (indiceRemover >= 0 && indiceRemover < contatos.size()) {
                            contatos.remove(indiceRemover);
                            System.out.println("--------------------------------");
                            System.out.println("Contato removido.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 3:
                    if (contatos.isEmpty()) {
                        System.out.println("Agenda vazia. Não há contatos para exibir.");
                    } else {
                        System.out.println("--------------------------------");
                        System.out.println("Lista de Contatos:");
                        for (int i = 0; i < contatos.size(); i++) {
                            contatos.get(i).exibirInformacoes();
                        }
                    }
                    break;
                case 4:
                    sair = true;
                    System.out.println("Encerrando a agenda.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitor.close();

        



    }
}