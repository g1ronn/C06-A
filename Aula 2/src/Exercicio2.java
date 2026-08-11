import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite a quantidade de lanches vendidos na primeira hora: ");
        int hora1 = entrada.nextInt();
        System.out.printf("Digite a quantidade de lanches vendidos na segunda hora: ");
        int hora2 = entrada.nextInt();
        System.out.printf("Digite a quantidade de lanches vendidos na terceira hora: ");
        int hora3 = entrada.nextInt();

        int total = hora1 + hora2 + hora3;
        double media = (double) total / 3;

        System.out.println("Total de lanches: " + total);
        System.out.printf("Média de lanches: %.2f " , media);
        entrada.close();
    }
    
    
}
