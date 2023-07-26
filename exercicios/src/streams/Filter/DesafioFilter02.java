package streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Caneta", 1.50, 30, false);
        Produto p2 = new Produto("Borracha", 0.50, 10, true);
        Produto p3 = new Produto("Lápis", 1.0, 40, true);
        Produto p4 = new Produto("Caderno", 22.80, 60, false);
        Produto p5 = new Produto("Teclado", 75.50, 45, true);
        Produto p6 = new Produto("Mouse", 45.50, 10, false);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> temDesconto = produto -> produto.desconto / 100 >= 0.3;
        Predicate<Produto> temFreteGratis = produto -> produto.freteGratis;
        Function<Produto, String> produtosNaPromocao = produto -> {
            String stringFormat = String.format("SUPER PROMOÇÃO!!!!!\n Nome: %s Preço: %.2f", produto.nome, produto.preco);
            return stringFormat;
        };

        produtos.stream()
            .filter(temDesconto)
            .filter(temFreteGratis)
            .map(produtosNaPromocao)
            .forEach(System.out::println);
    }
}
