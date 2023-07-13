package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String salario;
        double total = 0;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o %d salário: ", i+1);
            salario = input.nextLine();
            
            total = total + (Double.parseDouble(salario.replace(",", ".")));
        }
        
        System.out.printf("Média: R$%.2f", total / 3);

        input.close();
    }
}


