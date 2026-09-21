import br.inatel.cdg.Animal.Boi;
import br.inatel.cdg.Animal.Cachorro;
import br.inatel.cdg.Animal.Lontra;

public class Main {
    public static void main(String[] args) {
      Lontra lontra = new Lontra("Lontra", 100);
      Cachorro cachorro = new Cachorro("Cachorro", 110);
      Boi boi = new Boi ("Boi", 120);


      lontra.mostrarInfo();
      cachorro.mostrarInfo();
      boi.mostrarInfo();

      lontra.emitirSom();
      cachorro.emitirSom();
      boi.emitirSom();

    }
}