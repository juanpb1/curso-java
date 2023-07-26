package fundamentos.exercicios;

import java.util.Scanner;

    public class Potencia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = input.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("O valor %.2f ao quadrado é %.2f, e ao cubo é %.2f", valor, quadrado, cubo);

        input.close();
    }
}
