public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

      public Kart(){
        motor = new Motor();
    }

    public void pular(){
        System.out.println("O carro "+ nome + " pulou");
    }

    public void soltarTurbo(){
        System.out.println("O carro "+ nome + " soltou turbo");
    }

    public void fazerDrift(){
        System.out.println("O carro "+ nome + " fez drift");
    }


    
}
