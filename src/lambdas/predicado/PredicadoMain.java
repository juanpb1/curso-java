package lambdas.predicado;

import java.util.function.Predicate;

public class PredicadoMain {
    public static void main(String[] args){

        Predicate<Produto> isCaro = prod -> (prod.getPreco() * ( 1 - prod.getDesconto())) >= 750; 

        Produto produto = new Produto("Notebook", 2499.99, 0.10);
        System.out.println(isCaro.test(produto));

    }
}
