import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String nome;
    private float valor;
    private List<String> ingredientes;

    public Pizza(String nome, float valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}