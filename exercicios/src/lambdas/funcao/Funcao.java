package lambdas.funcao;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args){

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        Function<String, String> textoFormatado = resultado -> "O resultado é " + resultado + ".";

        String resultadoFinal = parOuImpar.andThen(textoFormatado).apply(31);

        System.out.println(resultadoFinal);

    }
}
