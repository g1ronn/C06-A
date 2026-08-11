public class Personagem {
    public String nome;
    public int pontos;
    Arma arma;

    public void usarArma(){
        arma.resistencia -= 2;
        System.out.println(nome + " está usando a arma " + arma.nome + " e agora a arma perdeu resistencia e está com " + arma.resistencia + " de resistencia restante.");

    }

    public void tomarDano(){
        pontos -= 5;
        System.out.println(nome + " tomou dano e agora tem " + pontos + " pontos restantes.");

    }
    
}