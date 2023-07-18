package classe;

public class ProdutoMain {
    public static void main(String[] args){

        Produto p1 = new Produto("Notebook", 1200);
        
        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 100;
        
        Produto.desconto = 0.50;

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
        
    }
}
