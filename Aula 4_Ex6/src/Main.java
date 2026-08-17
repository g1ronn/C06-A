public class Main{
    public static void main(String[] args){
        Kart kart1 = new Kart();
        Piloto piloto1 = new Piloto();
        Kart kart2 = new Kart();
        Piloto piloto2 = new Piloto();

        kart1.nome = "Kart do Mario";
        kart2.nome = "Kart do Bowser";

        kart1.motor.cilindradas = "150 cilindradas";
        kart1.motor.velocidadeMaxima = 150;
        kart2.motor.cilindradas = "100 cilindradas";
        kart2.motor.velocidadeMaxima = 100;

        piloto1.nome= "Mario";
        piloto2.nome= "Bowser";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.vilao = false;
        piloto2.vilao = true;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();


        kart1.soltarTurbo();
        kart2.soltarTurbo();

        kart1.fazerDrift(); 
        kart2.fazerDrift();

        kart1.motor.mostrarInfo();
        kart2.motor.mostrarInfo();



    }
}