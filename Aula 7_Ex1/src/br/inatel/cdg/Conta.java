package br.inatel.cdg;


public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    public Cliente[] clientes;

    public Conta() {
        this.clientes = new Cliente[3];
    }

    public void sacar(float quantia) {
        if (quantia > saldo) {
            System.out.println("Saldo menor que a quantidade desejada");
        } else {
            this.saldo -= quantia;
        }
    }

    public void depositar(float quantia) {
        this.saldo += quantia;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
