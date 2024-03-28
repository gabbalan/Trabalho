import java.util.Scanner;

public class Calculadora {

    float num1;
    float num2;
    String equacao;

    void calcular (){

        if (equacao.equals("+")){
            float resultado = num1 + num2;
            System.out.println(num1 + " " + equacao + " " + num2 + " = " + resultado);

        } else if (equacao.equals("-")){
            float resultado = num1 - num2;
            System.out.println(num1 + " " + equacao + " " + num2 + " = " + resultado);

        } else if (equacao.equals("/")){
            if ( num2 == 0) {
                System.out.println("Equação invalida");

            } else {
                float resultado = num1 / num2;
                System.out.println(num1 + " " + equacao + " " + num2 + " = " + resultado);

            }

        }   else if (equacao.equals("*")){
            float resultado = num1 * num2;
            System.out.println(num1 + " " + equacao + " " + num2 + " = " + resultado);

        } else {
            System.out.println("Equação inválida");
        }

    }
}
