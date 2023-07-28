package generics;

public class ParesMain {
    public static void main(String[] args) {
        
        Pares<Integer, String> resultadoAprovados = new Pares<>();
        resultadoAprovados.adicionar(1, "Ana");
        resultadoAprovados.adicionar(2, "Marcos");
        resultadoAprovados.adicionar(3, "André");
        resultadoAprovados.adicionar(4, "Bia");
        resultadoAprovados.adicionar(1, "Maria");

        System.out.println(resultadoAprovados.getValor(1)); 
        System.out.println(resultadoAprovados.getValor(2)); 
        System.out.println(resultadoAprovados.getValor(4)); 
        System.out.println(resultadoAprovados.getValor(3)); 

    }
}
