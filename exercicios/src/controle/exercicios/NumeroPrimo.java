package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int ePrimo = 0;


        for(int i = numero; i > 1; i--){
            if(numero % i == 0){
                ePrimo++;
            }
        }

        if(ePrimo > 1 || numero == 0 || numero == 1){
            System.out.printf("%d não é primo.", numero);
        }else{
            System.out.printf("%d é primo.", numero);
        }

        input.close();
    }

}
