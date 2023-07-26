package fundamentos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[]args){

        double dividendoA = Math.pow((6*(3+2)), 2);
        double divisorA = 3*2;
        double dividendoB = (1-5)*(2-7);
        double divisorB = 2;

        double divedendo = (dividendoA / divisorA) - Math.pow((dividendoB / divisorB), 2);

        double divedendoFinal = Math.pow(divedendo, 3);
        double divisorFinal = Math.pow(10, 3);

        double resultado = divedendoFinal / divisorFinal;

        System.out.println(resultado);

               
    }
}
