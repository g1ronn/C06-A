package br.inatel.cdg.comprador;
import br.inatel.cdg.brownies.Brownie;
public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie) {
        if (saldo >= brownie.getPreco()) {
            saldo -= brownie.getPreco();
            System.out.println("O comprador " + nome + " efetuou a compra do " + brownie.getNome() + " no valor de R$" + brownie.getPreco());
        } else {
            System.out.println("Saldo insuficiente para efetuar a compra do " + brownie.getNome());
        }
    }
    
}
