package streams.Map;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public interface UtilitariosDesafioMap {
    
    public final static Function<Integer, String> intParaBinario = n -> Integer.toBinaryString(n);

    public final static UnaryOperator<String> stringInversa = n -> {
        return new StringBuilder(n).reverse().toString();
    };

    public final static Function<String, Integer> binarioParaInt = n -> Integer.parseInt(n, 2);

}
