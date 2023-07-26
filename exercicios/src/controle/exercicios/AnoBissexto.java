package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = input.nextInt();

        if((ano % 100 == 0) && (ano % 400 == 0)){
            System.out.printf("%d é bissexto.", ano);
        }else{
            System.out.printf("%d não é bissexto.", ano);
        }

        input.close();
    }
}

