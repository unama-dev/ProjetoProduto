import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        //Criação do carrinho de compras
        ArrayList<Produto> carrinho = new ArrayList<Produto>();

        //Criação de um objeto mouse
        Mouse m1 = new Mouse("Mouse 01");
        m1.setTipo("tipo 01");
        m1.setPreco(10);
        m1.setNomeLoja("loja 01");

        //Criação de um objeto livro
        Livro l1 = new Livro("Livro 01");
        l1.setAutor("autor 01");
        l1.setNomeLoja("Loja 01");
        l1.setPreco(15);

        //Inserir os produtos no carrinho
        carrinho.add(m1);
        carrinho.add(l1);

        for(Produto p : carrinho){
            System.out.println(p.getDescricao());
        }


    }

}
