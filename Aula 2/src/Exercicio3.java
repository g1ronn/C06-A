import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite a nota da NPA: ");
    
        int NPA = entrada.nextInt();
        
        if(NPA >= 60 && NPA <= 100){
            System.out.println("Você foi aprovado!");
        }else if(NPA >= 30 && NPA < 60){
            System.out.println("Você terá que fazer a NP3!");
            System.out.printf("Digite a nota da NP3: ");
            int NP3 = entrada.nextInt();
            int NFA = (NPA + NP3) / 2;
            if(NFA >= 50){
                System.out.println("Você foi aprovado!");
            }else{
                System.out.println("Você foi reprovado!");
            }   

        }else if (NPA < 30 && NPA >= 0){
            System.out.println("Você foi reprovado!");
        }else{
            System.out.println("Nota inválida!");
        }

        entrada.close();
    }
}
    
