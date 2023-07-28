package generics;

import java.util.Arrays;
import java.util.List;

public class ListUtilMain {
    public static void main(String[] args) {
        
        List<String> linguagens = Arrays.asList("Python", "Java", "Javascript", "C", "C++");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        String ultimoElementoLing1 = (String) ListUtil.getUltimoSemGen(linguagens);
        System.out.println(ultimoElementoLing1);
        Integer ultimoElementoNum = (Integer) ListUtil.getUltimoSemGen(numeros);
        System.out.println(ultimoElementoNum);


    }
}
