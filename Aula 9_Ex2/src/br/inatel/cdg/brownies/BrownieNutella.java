package br.inatel.cdg.brownies;
public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void AdicionandoNutella() {
        System.out.println(super.nome + " adicionado o Nutella");
    }

    @Override
    public void addCarrinhodeCompras(){
        System.out.println("Adicionando o Brownie de Nutella no carrinho de compras");
    }

}