package oo.composicao.desafio;

import java.util.ArrayList;


public class Item {
    int qtd;
    double precoTotal = 0;

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    void adicionarProduto(Produto produto, int qtd){
        produto.qtd = qtd;
        produtos.add(produto);
        precoTotal += produto.preco * qtd;
    } 

    void removerProduto(Produto produto){
        produtos.remove(produto);
        precoTotal -= produto.preco * qtd;
    } 

    public String toString(){
        String listaProdutos = "";
        for(Produto produto:produtos){
            listaProdutos += String.format(" Produto: %s | Preço: R$%.2f | Qtd: %d \n", produto.nome, produto.preco, produto.qtd);
        }
        return listaProdutos;
    }

}
