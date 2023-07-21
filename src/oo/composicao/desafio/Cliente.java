package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    
    ArrayList<Compra> compras = new ArrayList<Compra>();
    
    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    
    String obterValorTotal(){
        double totalCompras = 0;
        for(Compra compra: compras){
            totalCompras += compra.obterValorTotal();
        }
        String valorTotalFormat = String.format("O valor total da compra é R$ %.2f.", totalCompras);
        return valorTotalFormat;
    }

    public String toString(){
        String listaCompras = String.format("===== Cliente: %s\n", this.nome);

        for(Compra compra: this.compras){
            listaCompras += String.format(compra.toString());
        }
        System.out.println("=====================================================" );
        return listaCompras;

    }
}