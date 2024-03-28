import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro numero da equação: ");
        float num1 = Integer.parseInt(leitor.nextLine());

        System.out.print("Simbolo da equação: ");
        String equacao = leitor.nextLine();

        System.out.print("Digite o segundo numero da equação: ");
        float num2 = Integer.parseInt(leitor.nextLine());

        Calculadora conta = new Calculadora ();

        conta.num1 = num1;
        conta.num2 = num2;
        conta.equacao = equacao;

        conta.calcular();

    }


}