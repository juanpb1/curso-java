package fundamentos;

public class DesafioOperadoresLogicos {
    public static void main(String[]args){
        boolean trabTerca = false;
        boolean trabQuinta = true;
        boolean tv50 = trabTerca && trabQuinta ? tv50 = true : false;
        boolean tv32 = trabTerca || trabQuinta ? tv32 = true : false;
        
        System.out.println(tv50 ? "Ir ao shopping comprar TV 50° e tomar sorvete." : ( tv32 ? "Ir ao shopping comprar TV 32° e tomar sorvete." : "Ficar em casa e vai está saudável."));
    }
}
