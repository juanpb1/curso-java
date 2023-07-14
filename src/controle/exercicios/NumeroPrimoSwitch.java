package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimoSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int ePrimo = 1;

        for(int i = numero; i > 1; i--){
            if(numero % i == 0){
                ePrimo++;
            }
        }

        switch (ePrimo) {
            case 2:
                System.out.printf("%d é primo.", numero);   
                break;
            default:
                System.out.printf("%d não é primo.", numero);
                break;
        }

        input.close();
    }

}
