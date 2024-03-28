public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;   
    private float velocidadeAtual;


    public Carro(String marca, String modelo, int ano, String placa, float velocidadeAtual){
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }
    

    public void acelerar (){
        int acelero = 5;
        this.velocidadeAtual += acelero;
    }

    public void frear (){
        int freio = 5;
        if(this.velocidadeAtual < 5){
            System.out.println("Velocidade minima alcançada.");
        } else{
            this.velocidadeAtual -= freio;
        }

    }

    public void exibirInformacoes(){
        System.out.println("-----------------------------------------");
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Velocidade atual: " + velocidadeAtual);

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
    


