package streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Marcos", 6.8);
        Aluno a2 = new Aluno("Robson", 9.7);
        Aluno a3 = new Aluno("Junior", 5.5);
        Aluno a4 = new Aluno("Bia", 8.5);
        Aluno a5 = new Aluno("Ana", 7.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> saudacao = aluno -> "Parabéns!!!" + aluno.nome + " Você foi aprovado(a).";

        alunos.stream()
            .filter(aprovado)
            .map(saudacao)
            .forEach(System.out::println);
    }
}
