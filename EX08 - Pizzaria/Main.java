import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Pizza> listaPizzas = new ArrayList<>();

        listaPizzas.add(new Pizza("Calabresa", 30.0f, Arrays.asList("Calabresa", "Queijo", "Tomate")));
        listaPizzas.add(new Pizza("Mussarela", 25.0f, Arrays.asList("Mussarela", "Queijo", "Tomate")));
        listaPizzas.add(new Pizza("Frango com Catupiry", 35.0f, Arrays.asList("Frango", "Catupiry", "Tomate")));

        Pedido pedido = new Pedido();

        boolean sair = false;
        while (!sair) {
            System.out.println("-----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Adicionar Pizza ao Pedido");
            System.out.println("2. Adicionar Endereço de Entrega");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Exibir Detalhes do Pedido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    exibirMenuPizzas(listaPizzas);
                    System.out.print("Escolha o número da pizza: ");
                    int escolhaPizza = Integer.parseInt(leitor.nextLine());
                    if (escolhaPizza >= 1 && escolhaPizza <= listaPizzas.size()) {
                        pedido.adicionarPizza(listaPizzas.get(escolhaPizza - 1));
                        System.out.println("-----------------------------------------");
                        System.out.println("Pizza adicionada ao pedido.");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o endereço de entrega: ");
                    String endereco = leitor.nextLine();
                    pedido.setEnderecoEntrega(endereco);
                    System.out.println("-----------------------------------------");
                    System.out.println("Endereço de entrega adicionado.");
                    break;

                case 3:
                    pedido.cancelarPedido();
                    break;

                case 4:
                    pedido.exibirDetalhesPedido();
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

    private static void exibirMenuPizzas(List<Pizza> pizzas) {
        System.out.println("-----------------------------------------");
        System.out.println("Pizzas Disponíveis:");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + ". " + pizzas.get(i).getNome() + " - R$" + pizzas.get(i).getValor());
        }
    }
}