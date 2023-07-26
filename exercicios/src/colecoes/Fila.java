package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args){

        Queue<String> fila = new LinkedList<>();

        //Insere na fila
        fila.add("Marcos"); // retorna false
        fila.offer("Bia"); // Lança uma exceção 
        fila.add("Kaio");
        fila.add("Ana");

        //Pega o elemento, mas não remove
        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // Lança uma exceção

        //Pega o elemento e remove da fila
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // Lança um exceção

    }
}
