
import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main{
    public static void main(String args[]){
        Nave nave1 =  new Nave("Nave 1", 100, "Explosivo");
        Nave nave2 = new Nave("Nave2", 120, "Normal");

        Asteroide ast1 = new Asteroide("Asteroide 1", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide 2", "Pequeno");

        nave1.atirar(ast1);
        nave1.atirar(ast2);
        nave2.atirar(ast1);
        nave2.atirar(ast2);

    }
}