package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um dia da semana:  ");
        String dia = input.next();

        if(dia.toLowerCase().equals("domingo")){
            System.out.println(1);
        }else if(dia.toLowerCase().equals("segunda")){
            System.out.println(2);
        }else if(dia.toLowerCase().equals("terça") || dia.toLowerCase().equals("terca")){
            System.out.println(3);
        }else if(dia.toLowerCase().equals("quarta")){
            System.out.println(4);
        }else if(dia.toLowerCase().equals("quinta")){
            System.out.println(5);
        }else if(dia.toLowerCase().equals("sexta")){
            System.out.println(6);
        }else if(dia.toLowerCase().equals("sábado") || dia.toLowerCase().equals("sabado")){
            System.out.println(7);
        }else{
            System.out.println("Dia da semana inválido.");
        }


        input.close();
    }
}
