package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3258.68;
        produto1.desconto = 0.15;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta azul";
        produto2.preco = 5;
        produto2.desconto = 0.29;

        double precoFinal1 = produto1.preco * (1 - produto1.desconto);
        double precoFinal2 = produto2.preco * (1 - produto2.desconto);
        double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;


        System.out.print(produto1.nome);
        System.out.println("O preço final do primeiro produto é R$ " + precoFinal1);
        System.out.print(produto2.nome);
        System.out.println("O preco final do segundo produto é R$ " + precoFinal2);
        System.out.println("A média do carrinho é de R$ " + mediaDoCarrinho);
    }
}
