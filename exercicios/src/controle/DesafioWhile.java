package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double totalNotas = 0, nota = 0;
        int notasValidas = 0;

        while(nota != -1){
            System.out.println("Digite a nota do aluno: ['-1' para Sair]");
            nota = input.nextDouble();
            if(nota >=0 && nota <= 10){
                totalNotas += nota;
                notasValidas++;
            }else if(nota != -1){
                System.out.println("Nota inválida! Digite novamente.");
            }

        }

        double media = totalNotas / notasValidas;
        
        if(notasValidas <= 0){
            System.out.printf("Nenhuma nota digitada.");
        }else{
            System.out.printf("Notas digitadas: %d\nTotal das Notas: %.1f\nMédia das Notas: %.1f", notasValidas, totalNotas, media);
        }
        input.close();
    }
}
