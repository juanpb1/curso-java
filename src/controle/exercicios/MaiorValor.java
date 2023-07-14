package controle.exercicios;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero=0, maior = 0;

        for(int i =0; i < 10; i++){
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if(numero > maior){
                maior = numero;
            }
        }

        System.out.printf("O maior número digitado foi %d.", maior);

        input.close();
	}

}
