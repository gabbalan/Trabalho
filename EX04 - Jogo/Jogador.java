public class Jogador {
    
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome){
        
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 1;
    }


    public void aumentarPontuacao (int qnt){
        this.pontuacao += qnt;
        System.out.println("Pontuação aumentada.");
    }


    public void subirNivel(int qnt){
        this.nivel += qnt;
        System.out.println("Nível aumentado.");      

    }


    public void exibirInformacoes(){
        System.out.println("-----------------------------------------");
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuacao do jogador: " + pontuacao);
        System.out.println("Nivel do jogador: " + nivel);
    }

    public String getNome() {
        return nome;
    }
    
}


