package lambdas.consumidor;

import java.util.function.Consumer;

import lambdas.predicado.Produto;

public class ConsumidorMain {
    public static void main(String[] args){

        Consumer<Produto> imprimirProduto = prod -> System.out.println(prod);

        Produto p1 = new Produto("Caneta", 2.5, 0.15);
        Produto p2 = new Produto("Lápis", 1.5, 0.05);
        Produto p3 = new Produto("Caderno", 22.5, 0.01);

        imprimirProduto.accept(p1);
        imprimirProduto.accept(p2);
        imprimirProduto.accept(p3);

    }
}
