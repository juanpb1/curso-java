package controle;

import java.util.Scanner;

public class DesafioWhileAula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String entradaUsuario = "";

        while(!entradaUsuario.equalsIgnoreCase("sair")){
            System.out.println("Digite: ['Sair' para encerrar o prorama]");
            entradaUsuario = input.next();
        }

        input.close();
    }
}
