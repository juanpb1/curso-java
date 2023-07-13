package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = input.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2f.", area);

        input.close();
    }
}
