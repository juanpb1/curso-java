package lambdas.desafio;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.predicado.Produto;

public class Desafio {
    public static void main(String[] args){

        Produto p = new Produto("iPad", 2599.99, 0.10);

        Function<Produto, Double> precoProduto = prod -> (prod.getPreco() * (1 -prod.getDesconto()));
        
        UnaryOperator<Double> imposto = preco -> {
            if(preco >= 2500){
                return preco * 1.085;
            }else{
                return preco;
            }
        };

        UnaryOperator<Double> frete = preco -> {
            if(preco >= 3000){
                return preco += 100;
            }else{
                return preco += 50;
            }
        };

        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));

        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        String preco = precoProduto
                        .andThen(imposto)
                        .andThen(frete)
                        .andThen(arredondar)
                        .andThen(formatar)
                        .apply(p);

        System.out.println(preco);

    }
}
