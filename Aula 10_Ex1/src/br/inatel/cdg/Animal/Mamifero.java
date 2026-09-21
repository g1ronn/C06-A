package br.inatel.cdg.Animal;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }

    public String getNome() {
        return nome;
    }
    public double getVida() {
        return vida;
    }
}
