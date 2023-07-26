package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args){

        ArrayList<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario("Bia");
        usuarios.add(u1);

        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Marcos"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Ana"));

        //Acessar pelo índice
        System.out.println(usuarios.get(2));

        //Remover um elemento
        usuarios.remove(2);

        //Exibir Lista
        for(Usuario u: usuarios){
            System.out.println(u.nome);
        }
    }
}
