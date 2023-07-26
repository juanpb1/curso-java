package fundamentos.exercicios;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em °F: ");
        double fahrenheit =  input.nextDouble();

        double celsius = (5 *(fahrenheit - 32)) / 9;

        System.out.printf("De %.1f°F para Celsius é %.1f°C.", fahrenheit, celsius);

        input.close();
    }
}
