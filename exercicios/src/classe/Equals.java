package classe;

public class Equals {
    public static void main(String[] args){

        Usuario user1 = new Usuario("Marcos", "marcos@email.com");
        Usuario user2 = new Usuario("Marcos", "marcos@email.com");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

    }
}
