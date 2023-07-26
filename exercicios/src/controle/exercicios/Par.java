package controle.exercicios;

import java.util.Scanner;

public class Par {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if((numero % 2 == 0) && (numero >= 0 && numero <= 10)){
            System.out.println("O Número é par e esta entre 0 e 10.");
        }else{
            System.out.println("O número não é par ou não está entre 0 e 10.");
        }

        input.close();
    }
}
