public class Main {
    public static void main(String[] args){
        Arma arma = new Arma();
        Personagem personagem = new Personagem();

        arma.nome = "Revolver";
        arma.poder = 100;
        arma.resistencia = 50;
        arma.descricao = "Uma arma de fogo com alta precisão";

        personagem.nome = "Arthur Morgan";
        personagem.pontos = 150;

        System.out.println("Informações do Personagem:");
        System.out.println("Nome: " +personagem.nome);
        System.out.println("Pontos: " +personagem.pontos + " de vida");
        System.out.println("Informações da Arma:");
        arma.mostrarinfoArma();


        personagem.arma = arma;
        personagem.usarArma();
        personagem.tomarDano();
    }
}