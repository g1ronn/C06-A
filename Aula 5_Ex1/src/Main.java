import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[][] campoMinado = new boolean[2][2];
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int bombaX = rand.nextInt(2);
        int bombaY = rand.nextInt(2);
        campoMinado[bombaX][bombaY] = true;

        while (true) {
            System.out.println("Bem vindo ao Campo Minado");
            System.out.println("Escolha alguma das opções a seguir:");
            System.out.println("1 - Começar jogo");
            System.out.println("2 - Regras");
            System.out.println("3 - Sair");

            int op = entrada.nextInt();

            if (op == 1) {
                System.out.println("O jogo começou: ");
                System.out.println("Escolha uma posição x (linha): ");
                int x = entrada.nextInt();
                System.out.println("Escolha uma posição y (coluna): ");
                int y = entrada.nextInt();

                if (campoMinado[x][y]) {
                    System.out.println("A bomba explodiu, você perdeu");
                    System.out.println("A bomba estava na posição: (" + bombaX + ", " + bombaY + ")");
                    break;
                } else {
                    System.out.println("A bomba não estava aqui, você venceu");
                    System.out.println("A bomba estava na posição: (" + bombaX + ", " + bombaY + ")");
                    break;
                }

            } else if (op == 2) {
                System.out.println("O jogo funciona da seguinte forma:");
                System.out.println("Você ira digitar 2 números, sendo a posição desejada, ao digitar as posições o jogo irá mostrar se a posição digitada está com a bomba ou não");
                System.out.println("Você perde caso a bomba esteja na posição digitada, caso a bomba não esteja lá, você ganha");
                System.out.println();
            } else if (op == 3) {
                System.out.println("Você saiu do jogo");
                break;
            } else {
                System.out.println("Essa opção não existe");
            }
        }

        entrada.close();
    }
}