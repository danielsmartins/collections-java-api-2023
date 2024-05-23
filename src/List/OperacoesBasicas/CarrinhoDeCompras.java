package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompra;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoDeCompra.isEmpty()){
            for (Item i : carrinhoDeCompra){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            carrinhoDeCompra.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!carrinhoDeCompra.isEmpty()) {
            for (Item i : carrinhoDeCompra) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
            }


        }

        public void exibirItens(){
            if (!carrinhoDeCompra.isEmpty()) {
                System.out.println(this.carrinhoDeCompra);
            } else {
                System.out.println("A lista está vazia!");
            }
        }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoDeCompra=" + carrinhoDeCompra +
                '}';
    }
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}






