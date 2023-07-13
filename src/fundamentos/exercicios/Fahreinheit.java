package fundamentos.exercicios;

import java.util.Scanner;

    public class Fahreinheit {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Digite a temperatura em °C: ");
            double celsius =  input.nextDouble();

            double fahrenheit = celsius * 1.8 + 32;

            System.out.printf("De %.1f°C para Fahreinheit é %.1f°F.", celsius, fahrenheit);

            input.close();
        }
}
