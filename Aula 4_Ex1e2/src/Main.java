public class Main {
    public static void main(String[] args){
        Zumbi zumbi = new Zumbi();
        Zumbi zumbiAlvo = new Zumbi();
        
        
        zumbi.nome = "Zumbi 1";
        zumbiAlvo.nome = "Zumbi 2";

        zumbi.vida = 100;
        zumbiAlvo.vida = 50;

        zumbi.andar();
        zumbi.atacar();

    zumbi.mostrarVida(zumbi.vida);
    zumbiAlvo.mostrarVida(zumbiAlvo.vida);


    zumbi.transfereVida(zumbiAlvo, 50);

    zumbi.mostrarVida(zumbi.vida);
    zumbiAlvo.mostrarVida(zumbiAlvo.vida);


    }
}