package generics;

public class CaixaNumberMain {
    public static void main(String[] args) {

        CaixaNumber<Integer> caixaA = new CaixaNumber<>();
        caixaA.guardar(123);
        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaNumber<Double> caixaB = new CaixaNumber<>();
        caixaB.guardar(10.5);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);

    }
}
