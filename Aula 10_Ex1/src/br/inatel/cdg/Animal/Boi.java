package br.inatel.cdg.Animal;
import br.inatel.cdg.Animal.Mamifero;

public class Boi extends Mamifero {
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Boi esta mugindo");
    }
    
}
