public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void mostrarinfoArma(){
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder + " de dano");
        System.out.println("Resistência: " + resistencia + " de resistência");
        System.out.println("Descrição: " + descricao);
    }
    
}
