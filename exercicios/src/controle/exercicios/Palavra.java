package controle.exercicios;

import java.util.Scanner;

public class Palavra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um palavra: ");
        String palavra = input.next();

        for(int i = 1; i <= palavra.length(); i++){
            System.out.println(palavra.substring(i-1,i));
        }

        input.close();
	}

}
