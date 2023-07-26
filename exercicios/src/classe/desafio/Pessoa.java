package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(){
    }

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida c){
        if(c != null){
            System.out.printf("%s comeu %s...\n", this.nome, c.nome);
            this.peso += c.peso;
        }
    }

    String dadosPessoa(){
        String dados = String.format("\n== PESSOA: \nNome: %s\nPeso(kg):%.2f", nome, peso);

        return dados;
    }

    void exibirDadosPessoa(){
        System.out.println(dadosPessoa());
    }

    
}
