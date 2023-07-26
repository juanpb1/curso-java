package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args){

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.25);
        Sorvete sobremesa = new Sorvete(0.5);

        Pessoa pessoa1 = new Pessoa(94.6);

        pessoa1.comer(ingrediente1);
        pessoa1.comer(ingrediente2);

        System.out.println(pessoa1);

        pessoa1.comer(sobremesa);

        System.out.println(pessoa1);
    }
}
