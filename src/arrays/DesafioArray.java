package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Qual a quantidade de nota(s)? ");
            int quantidade = input.nextInt();

            double[] notasAluno = new double[quantidade];
            for(int i = 0; i < quantidade; i++){
                System.out.printf("Digite a %d° nota: ", i+1);
                notasAluno[i] = input.nextDouble();
            }

            double totalNotas = 0;
            for(int i = 0; i < quantidade; i++){
                totalNotas += notasAluno[i];
            }

            double mediaAluno = totalNotas / quantidade;
            System.out.printf("Média do aluno: %.1f\n\n.", mediaAluno);

            System.out.print("Deseja calcular mais notas? (Digite 'n' para encerrar)");
            String stop = input.next();
            if(stop.equals("N") || stop.equals("n")){
                break;
            }
        }

        input.close();
    }
}
