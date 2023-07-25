package lambdas.introducao;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args){

        List<String> aprovados = Arrays.asList("Bia", "Lia", "Ivan", "Ana");

        System.out.println("\nUsando Lambda#01...");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nUsando Method Reference#01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nUsando Lambda#02...");
        aprovados.forEach(nome -> imprimeNome(nome));

        System.out.println("\nUsando Method Reference#02...");
        aprovados.forEach(Foreach::imprimeNome);
    }

    static void imprimeNome(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}
