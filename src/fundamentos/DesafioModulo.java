package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primero número: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Digite a operação: ");
        String op = input.next();

        double resultado =  op.equals("+") ? num1 + num2 :
                            op.equals("-") ? num1 - num2 : 
                            op.equals("*") ? num1 * num2 :
                            op.equals("/") ? num1 / num2 :
                            op.equals("%") ? num1 % num2 : 0;

        System.out.printf("Resultado: %.0f", resultado);
        
        input.close();
    
    }
}
