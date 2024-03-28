import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<Produto>();

        boolean sair = false;
        while (!sair) {
            System.out.println("-----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Trocar Nome do Produto");
            System.out.println("3. Trocar Código do Produto");
            System.out.println("4. Atualizar Preço do Produto");
            System.out.println("5. Adicionar ao Estoque");
            System.out.println("6. Remover do Estoque");
            System.out.println("7. Exibir Informações dos Produtos");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = leitor.nextLine();
                    System.out.print("Digite o código do produto: ");
                    String codigoProduto = leitor.nextLine();
                    System.out.print("Digite a quantidade em estoque do produto: ");
                    float estoqueProduto = Float.parseFloat(leitor.nextLine());
                    System.out.print("Digite o valor do produto: ");
                    float precoProduto = Float.parseFloat(leitor.nextLine());

                    estoque.add(new Produto(nomeProduto, codigoProduto, estoqueProduto, precoProduto));
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o código do produto: ");
                    String codigoTrocaNome = leitor.nextLine();
                    Produto produtoNome = buscarProduto(estoque, codigoTrocaNome);
                    if (produtoNome != null) {
                        System.out.print("Digite o novo nome do produto: ");
                        String novoNome = leitor.nextLine();
                        produtoNome.trocarNome(novoNome);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o código do produto: ");
                    String codigoTrocaCodigo = leitor.nextLine();
                    Produto produtoCodigo = buscarProduto(estoque, codigoTrocaCodigo);
                    if (produtoCodigo != null) {
                        System.out.print("Digite o novo código do produto: ");
                        String novoCodigo = leitor.nextLine();
                        produtoCodigo.trocarCodigo(novoCodigo);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o código do produto: ");
                    String codigoAtualizaPreco = leitor.nextLine();
                    Produto produtoPreco = buscarProduto(estoque, codigoAtualizaPreco);
                    if (produtoPreco != null) {
                        System.out.print("Digite o novo preço do produto: ");
                        float novoPreco = Float.parseFloat(leitor.nextLine());
                        produtoPreco.atualizarPreco(novoPreco);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o código do produto: ");
                    String codigoAdicionarEstoque = leitor.nextLine();
                    Produto produtoEstoque = buscarProduto(estoque, codigoAdicionarEstoque);
                    if (produtoEstoque != null) {
                        System.out.print("Digite a quantidade a adicionar ao estoque: ");
                        float quantidadeAdicionar = Float.parseFloat(leitor.nextLine());
                        produtoEstoque.adicionarEstoque(quantidadeAdicionar);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("-----------------------------------------");
                    System.out.print("Digite o código do produto: ");
                    String codigoRemoverEstoque = leitor.nextLine();
                    Produto produtoRemoverEstoque = buscarProduto(estoque, codigoRemoverEstoque);
                    if (produtoRemoverEstoque != null) {
                        System.out.print("Digite a quantidade a remover do estoque: ");
                        float quantidadeRemover = Float.parseFloat(leitor.nextLine());
                        produtoRemoverEstoque.removerEstoque(quantidadeRemover);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 7:
                    for (int i = 0; i < estoque.size(); i++) {
                        estoque.get(i).exibirInformacoes();

                    }
                    break;

                case 8:
                    sair = true;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitor.close();
    }

    private static Produto buscarProduto(List<Produto> estoque, String codigoProduto) {
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigoProduto)) {
                return produto;
            }
        }
        return null;

    }
}
