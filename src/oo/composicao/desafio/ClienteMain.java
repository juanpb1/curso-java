package oo.composicao.desafio;

public class ClienteMain {
    public static void main(String[] args){

        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 22.50);
        Produto p3 = new Produto("Lápis", 1.50);

        Item lista1 = new Item();
        lista1.adicionarProduto(p1, 10);
        lista1.adicionarProduto(p2, 1);

        Item lista2 = new Item();
        lista2.adicionarProduto(p3, 4);

        Compra compra1 = new Compra();
        compra1.adicionarItem(lista1);

        Compra compra2 = new Compra();
        compra2.adicionarItem(lista2);

        Cliente c1 = new Cliente("Robson");
        Cliente c2 = new Cliente("Ana");

        c1.adicionarCompra(compra1);
        c2.adicionarCompra(compra2);
        c1.adicionarCompra(compra2);

        System.out.println(c1);
        System.out.println(c1.obterValorTotal());

        System.out.println(c2);
        System.out.println(c2.obterValorTotal());

    }
}
