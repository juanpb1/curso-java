package controle.exercicios;

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = input.nextDouble();

        if(nota >= 7.0 && nota <= 10){
            System.out.println("Aprovado!");
        }else if(nota <= 6.9 && nota >= 4.0){
            System.out.println("Recuperação!");
        }else if(nota <= 3.9 && nota >= 0){
            System.out.println("Reprovado!");
        }else{
            System.out.println("Nota inválida!");
        }

        input.close();
    }
}
