package generics;

import java.util.TreeSet;

public class Comparable {
    public static void main(String[] args) {
        
        TreeSet<Integer> numeros = new TreeSet<>();
        
        numeros.add(25);
        numeros.add(125);
        numeros.add(-15);
        numeros.add(-5);
        numeros.add(10);
        numeros.add(46);
        numeros.add(30);
        numeros.add(1);

        for(Integer n: numeros){
            System.out.println(n);
        }

    }
}
