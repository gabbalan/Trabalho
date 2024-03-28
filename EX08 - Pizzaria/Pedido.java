import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private float valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = "";
        this.valorTotal = 0.0f;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        enderecoEntrega = "";
        valorTotal = 0.0f;
        System.out.println("-----------------------------------------");
        System.out.println("Pedido cancelado.");
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void exibirDetalhesPedido() {
        System.out.println("-----------------------------------------");
        System.out.println("Pedido:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome() + " - R$" + pizza.getValor());
        }
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("Valor total: R$" + valorTotal);
    }
}