package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args){

        Map<Integer, String> usuarios = new HashMap<>();
        
        //Insere elementos
        usuarios.put(1,"Marcos");
        usuarios.put(2,"Roberto");
        usuarios.put(3, "Ana");
        usuarios.put(4, "Maria");

        //Metódos
        System.out.println("Tamanho do Map é "+ usuarios.size() + ".");
        System.out.println("O Map está vazio? " + usuarios.isEmpty() + ".");
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Ana"));

        //Exibir Map
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey()+" - ");
            System.out.println(registro.getValue());
        }

    }
}
