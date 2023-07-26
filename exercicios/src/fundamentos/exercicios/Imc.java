package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso(KG): ");
        double peso = input.nextDouble();

        System.out.println("Digite a altura(M): ");
        double altura = input.nextDouble();

        double imc = peso /(altura * altura);

        System.out.printf("IMC: %.2f", imc);

        input.close();
    }
}
