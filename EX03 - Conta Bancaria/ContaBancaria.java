public class ContaBancaria {
    
    private String numeroConta;
    private String nomeTitular;
    private float saldo;


    public ContaBancaria(String numeroConta, String nomeTitular, float saldo){
        
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }


    public void sacar (int valor){
        
        if(valor >= saldo){
            System.out.println("-----------------------------------------");
            System.out.println("Saldo indisponivel.");
        } else{
            this.saldo -= valor;
            System.out.println("-----------------------------------------");
            System.out.println("Saque de " + valor + " realizado.");
        }

    }


    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("-----------------------------------------");
        System.out.println("Depósito de " + valor + " realizado.");

    }

    public void exibirInformacoes(){
        System.out.println("-----------------------------------------");
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

}