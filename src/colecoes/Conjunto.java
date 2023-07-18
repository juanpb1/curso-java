package colecoes;

import java.util.HashSet;
import java.util.Set;
//import java.util.SortedSet;
//import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args){

        Set<String> listaAprovados = new HashSet<>();
        //SortedSet<String> listaAprovados = new TreeSet<>(); Cria um Set na Ordem de inserção dos elementos

        //Inserir elementos
        listaAprovados.add("Lucas");
        listaAprovados.add("Ana");
        listaAprovados.add("Maria");
        listaAprovados.add("Marcos");
        System.out.println(listaAprovados);

        //Remover elementos
        listaAprovados.remove("Ana");
        System.out.println(listaAprovados);

        //Quantidade de elementos
        System.out.println(listaAprovados.size());

        //Limpar Set
        listaAprovados.clear();
        System.out.println(listaAprovados);
    }
}
