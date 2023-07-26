import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        /* 
        String s = "Bom dia!";
        System.out.println(s.toUpperCase());
        System.out.println("Digite um número: ");
        String numero = input.nextLine();
        
        Integer numeroConvertido = Integer.parseInt(numero);

        System.out.println(numeroConvertido > 0 ? "Positivio" : "Negativo");
        */
        int a = 10;
        double b = a;

        int c = (int) 5.2563;
        System.out.println(c);

        System.out.println(b);

        String d = "569985.56";
        System.out.println(Double.parseDouble(d));

        input.close();

    }
}
