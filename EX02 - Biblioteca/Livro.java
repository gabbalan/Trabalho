import java.util.Scanner;

public class Livro {

    String titulo;
    String autor;   
    String ano;

    
    Livro (String titulo, String autor, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }


    void exibirInfo(boolean mostrar){

       if(mostrar){
            System.out.println(" ------------------------------- ");
            System.out.println("Titulo do Livro: " + titulo);
            System.out.println("Autor do Livro: " + autor);
            System.out.println("Data de publicação do livro: " + ano);
        }

    }

}

