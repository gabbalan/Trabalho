import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Livro> estante = new ArrayList<Livro>();

        System.out.print("Quantos livros quer adicionar a Biblioteca: ");
        int qnt_livros = Integer.parseInt(leitor.nextLine());

        for ( int i = 0; i < qnt_livros; i++){

            System.out.print("Digite o titulo do livro: ");
            String titulo = leitor.nextLine();

            System.out.print("Digite o autor do livro: ");
            String autor = leitor.nextLine();

            System.out.print("Digite a data de publicação do livro: ");
            String ano = leitor.nextLine();

            Livro novo_livro = new Livro(titulo, autor, ano);

            estante.add(novo_livro);

        }

        for (int i = 0; i < qnt_livros; i++){
            estante.get(i).exibirInfo(true);
        }
        
    }


}


