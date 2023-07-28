package generics;

import java.util.List;

public class ListUtil {
    
    public static Object getUltimoSemGen(List<?> lista){
        return lista.get(lista.size() - 1);
    }

    public static <T> T getUltimoComGen(List<T> lista){
        return lista.get(lista.size() - 1);
    }


}
