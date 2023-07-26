package classe.desafio;

public class Comida {
    String nome;
    double peso;

    Comida(){};

    Comida(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    String detalhesComida(){
        String comidaDetalhes = String.format("\n== COMIDA: \nNome: %s\nPeso(kg): %.1f", nome, peso);

        return comidaDetalhes;
    }

    void exibirDetalhesComida(){
        System.out.println(detalhesComida());
    }

}
