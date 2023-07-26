package streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlter01 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Ana", 17, "F");
        Pessoa p2 = new Pessoa("Marcos", 19, "M");
        Pessoa p3 = new Pessoa("Bia", 23, "F");
        Pessoa p4 = new Pessoa("Marcelo", 16, "M");
        Pessoa p5 = new Pessoa("Junior", 25, "M");

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Pessoa> eHomem = pessoa ->{
            return pessoa.sexo.toUpperCase().equals("M");
        };
        Predicate<Pessoa> maioridade = pessoa -> pessoa.idade >= 18;
        Function<Pessoa, String> alistamento = pessoa -> {
            return pessoa.nome + " é necessário o alistamento!";
        };

        pessoas.stream()
            .filter(eHomem)
            .filter(maioridade)
            .map(alistamento)
            .forEach(System.out::println);
    }
}
