package lambdas.fornecedor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args){

        Supplier<List<String>> lista = () -> Arrays.asList("Ivan", "Bia", "Pedro", "Ana");

        System.out.println(lista.get());
    }
}
