package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args){

        Deque<String> numeros = new ArrayDeque<>();

        // Adiciona elementos na Pilha
        numeros.add("O Pequeno Princípe");
        numeros.push("Don Quixote");
        numeros.push("O Hobbit");

       // Pega o elemento e não remove da pilha
        System.out.println(numeros.peek());
        System.out.println(numeros.element());

        //Pega o elemento e remove da pilha 
        System.out.println(numeros.pop());
        System.out.println(numeros.poll());
        System.out.println(numeros.remove());
    }
}
