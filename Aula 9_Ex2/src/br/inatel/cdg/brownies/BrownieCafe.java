package br.inatel.cdg.brownies;

public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void AdicionandoCafe(){
        System.out.println(super.nome + " adicionado o café");
    }

    @Override
    public void addCarrinhodeCompras(){
        System.out.println("Adicionando o Brownie de Café no carrinho de compras");
    }
}