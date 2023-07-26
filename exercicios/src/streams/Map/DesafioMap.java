package streams.Map;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        nums.stream()
            .map(UtilitariosDesafioMap.intParaBinario)
            .map(UtilitariosDesafioMap.stringInversa)
            .map(UtilitariosDesafioMap.binarioParaInt)
            .forEach(System.out::println);
    }
}
