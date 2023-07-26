package lambdas.introducao;

public class CalculoTeste2 {
    public static void main(String[] args){

        Calculo soma = (x, y) -> {return x + y;};
        System.out.println(soma.calcular(2, 5));

        Calculo multi = (x, y) -> x * y;
        System.out.println(multi.calcular(2, 5));
    }
}
