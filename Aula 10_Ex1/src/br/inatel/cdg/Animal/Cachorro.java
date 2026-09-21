package br.inatel.cdg.Animal;
import br.inatel.cdg.Animal.Mamifero;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro esta latindo");
    }
    
}
