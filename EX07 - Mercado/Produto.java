public class Produto {

    private String nome;
    private String codigo;
    private float estoque;
    private float preco;

    public Produto(String nome, String codigo, float estoque, float preco){
        this.nome = nome;
        this.codigo = codigo;
        this.estoque = estoque;
        this.preco = preco;

    }

    public void trocarNome (String novoNome){
        this.nome = novoNome;
        System.out.println("Nome do produto trocado.");
    }

    public void trocarCodigo(String novoCodigo){
        this.codigo = novoCodigo;
        System.out.println("Código do produto trocado.");
    }

    public void atualizarPreco (float valor){
        this.preco = valor;
        System.out.println("Preço do produto atualizado.");       
    }

    public void adicionarEstoque (float valor){
        this.estoque += valor;
        System.out.println("Estoque do produto atualizado.");
    }


    public void removerEstoque (float valor){
        if(estoque < valor){
            System.out.println("Não há produtos suficientes em estoque para remover.");
        } else{
            this.estoque -= valor;
            System.out.println("Estoque do produto atualizado.");
        }

    }



    public void exibirInformacoes(){

        float valorEstoque = preco * estoque;

        System.out.println("-----------------------------------------");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Codigo do produto: " + codigo);
        System.out.println("Quantidade em estoque do produto: " + estoque);
        System.out.println("Valor do produto: R$" + preco);
        System.out.println("O valor total do produto em estoque é de R$" + valorEstoque);
    }

    public String getCodigo() {
        return codigo;
    }


}
