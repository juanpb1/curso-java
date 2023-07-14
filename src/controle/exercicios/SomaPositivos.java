package controle.exercicios;

import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero=0, soma=0;

        while(true){
            System.out.printf("Digite um número positivo: ");
            numero = input.nextInt();
            if(numero < 0)break;
            soma += numero;
        }

        System.out.printf("Soma: %d", soma);

        input.close();
	}

}
