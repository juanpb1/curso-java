package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite A: ");
        double a =  input.nextDouble();
         System.out.println("Digite B: ");
        double b =  input.nextDouble();
         System.out.println("Digite C: ");
        double c =  input.nextDouble();

        
        double delta = (Math.pow(b, 2))- (4*a*c);
        boolean verificaDelta = delta <= 0 ? false : true;

        double x1 = (((-b) - (Math.sqrt(delta)))) / (2*a);
        double x2 = ((-b) + (Math.sqrt(delta))) / (2*a);

        String resultado = verificaDelta ? "X1:"+x1+"\nX2:"+x2 : "Não é possível calcular o delta.";

        System.out.println(resultado);

        input.close();
    }
}
