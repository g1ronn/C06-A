public class Zumbi{
    public double vida;
    public String nome;

    public void mostrarVida(double vida){
        System.out.println("A vida do " + nome + " é: " + vida);
    }
    public void transfereVida(Zumbi zumbiAlvo, float quantidade){
        vida -= quantidade;
        zumbiAlvo.vida += quantidade;
    }
    public void andar(){
        System.out.println("O zumbi " + nome + " está andando");
    }
    public void atacar(){
        System.out.println("O zumbi " + nome + " está atacando");
    }
}