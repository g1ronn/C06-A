public class Exercicio1 {
    public static void main(String[] args){
        int hora1 = 10;
        int hora2 = 4;
        int hora3 = 2;

        int total = hora1 + hora2 + hora3;
        double media = (double) total / 3;

        System.out.println("Total de lanches: " + total);
        System.out.printf("Média de lanches: %.2f " , media);
    }
    
}
