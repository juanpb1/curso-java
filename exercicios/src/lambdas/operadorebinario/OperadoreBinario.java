package lambdas.operadorebinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadoreBinario {
    public static void main(String[] args){

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(6.6, 7.4));

        BiFunction<Double, Double, String> resultadoAluno = (n1, n2) -> {
            double mediaAluno = (n1 + n2) / 2;
            return mediaAluno >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultadoAluno.apply(6.6, 7.4));

    }
}
