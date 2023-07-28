package generics;

public class CaixaIntMain {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(10);
        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
