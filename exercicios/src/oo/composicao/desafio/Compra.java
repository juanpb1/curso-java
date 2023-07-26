package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item){
        this.itens.add(item);
    }

    void removeItem(Item item){
        this.itens.remove(item);
    }

    double obterValorTotal(){
        double totalCompra = 0;
        for(Item item: itens){
            totalCompra +=  item.precoTotal;
        }

        return totalCompra;
    }

    public String toString(){
        String listaItens = "";

        for(Item item: this.itens){
            listaItens += String.format(item.toString());
        }

        return listaItens;

    }

}
