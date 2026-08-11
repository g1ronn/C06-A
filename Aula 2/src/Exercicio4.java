import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        int nAlunos;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite a quantidade de alunos: ");
        nAlunos = entrada.nextInt();

        switch(nAlunos){
            case 10:
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Número de alunos inválidos!");
                break;
            }
        entrada.close();
    }
    
}
