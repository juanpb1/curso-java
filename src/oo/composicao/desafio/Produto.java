package oo.composicao.desafio;

public class Produto {
    String nome;
    double preco;
    int qtd;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
}
