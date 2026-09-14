package br.inatel.cdg.brownies;

public class Brownie{
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhodeCompras(){
        System.out.println("Adicionando ao carrinho de compras o Brownie: " + nome);
    }
    
    public void calculaValorTotalCompra(){
        System.out.println("Total da compra do Brownie " + nome + ": R$" + preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);

    } 

    public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getSabor() {
		return sabor;
	}

}