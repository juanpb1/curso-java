package classe.desafio;

public class Jantar {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa("João", 58);
        Comida c1 = new Comida("Feijoda", 2);
        Comida c2 = new Comida("Bolo de Chocolate", 0.5);

        p1.exibirDadosPessoa();

        p1.comer(c1);
        p1.exibirDadosPessoa();

        p1.comer(c2);
        p1.exibirDadosPessoa();

    }
}
