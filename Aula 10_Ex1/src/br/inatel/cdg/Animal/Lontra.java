package br.inatel.cdg.Animal;
import br.inatel.cdg.Animal.Mamifero;

public class Lontra extends Mamifero {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Lontra esta chiando");
    }
    
}
