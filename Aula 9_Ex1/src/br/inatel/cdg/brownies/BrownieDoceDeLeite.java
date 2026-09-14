package br.inatel.cdg.brownies;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void AdicionandoDoceDeLeite() {
        System.out.println(super.nome + " adicionado o doce de leite");
    }
}