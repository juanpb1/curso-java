package controle.exercicios;

import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int entradaUsuario = -1 ,numeroAdivinha = 5;
        boolean acertou = false;

        System.out.println("===== JOGO DA ADIVINHAÇÃO =====");
        System.out.println("Tente adivinhar um número entre 0 e 100. Vamos lá!!!");
        
        for(int i = 9; i >= 0;i--){
            System.out.printf("Digite um número: ");
            entradaUsuario = input.nextInt();
            if(entradaUsuario == numeroAdivinha){
                System.out.println("Parabéns!!! Voce acertou. ");
                acertou = true;
                break;
            }else if( i > 0){
                System.out.printf("Tente Novamente! Restam %d tentativa(s).\n", i);
            }
            
        }

        if(!acertou){
            System.out.printf("Que pena, acabaram suas tentativas. O número era %d.", numeroAdivinha);
        }

        input.close();
    }

}
