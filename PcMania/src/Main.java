import br.inatel.cdg.Pedido.ProcessarPedido;
import br.inatel.cdg.PC.Computador;
import br.inatel.cdg.Pessoa.Cliente;
import br.inatel.cdg.Configurações.MemoriaUSB;
import br.inatel.cdg.Configurações.SistemaOperacional;
import br.inatel.cdg.Configurações.HardwareBasico;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Boas vindas ao site PC MANIA----");
        System.out.println("Antes de começarmos, digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Agora digite o seu CPF: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        Computador[] compras = cliente.getCompra();

        int i = 0;
        int op = -1;
        while(op != 0){
            System.out.println("Agora escolha uma das nossas promoções: ");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar compra");
            op = scanner.nextInt();

            if(op == 1){
                if (i < 10){
                    HardwareBasico[] hardware = { new HardwareBasico("Processador Core i5", 2200),
                                                  new HardwareBasico("Memoria RAM", 8),
                                                  new HardwareBasico("HD", 500)
                                                };
                    SistemaOperacional so = new SistemaOperacional("macOS Sequoia", 64); 
                    Computador pc = new Computador("Apple", 553, so, hardware);
                    pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
                     compras[i] = pc;
                     i++;
                     System.out.println("Computador macOS Sequoia adicionado ao carrinho de compras.");

                }
            }else if (op == 2){
                if (i < 10){
                    HardwareBasico[] hardware = { new HardwareBasico("Pentium Core i7", 3370),
                                                  new HardwareBasico("Memoria RAM", 16),
                                                  new HardwareBasico("HD", 1000)
                                                };
                    SistemaOperacional so = new SistemaOperacional("Windows 8", 64);
                    Computador pc = new Computador("Samsung", 554, so, hardware);
                    pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
                    compras[i] = pc;
                    i++;
                    System.out.println("Computador Windows 8 adicionado ao carrinho de compras.");
                    }
            }else if (op == 3){
                if (i < 10){
                    HardwareBasico[] hardware = { new HardwareBasico("Pentium Core i7", 4500),
                                                  new HardwareBasico("Memoria RAM", 32),
                                                  new HardwareBasico("HD", 2000)
                                                };
                    SistemaOperacional so = new SistemaOperacional("Windows 10", 64);
                    Computador pc = new Computador("Dell", 555, so, hardware);
                    pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
                    compras[i] = pc;
                    i++;
                    System.out.println("Computador Windows 10 adicionado ao carrinho de compras.");
                }
            }else if (op != 0){
                System.out.println("Opção inválida. Tente novamente.");
            }
        }    
        scanner.close();
        System.out.println("Sua compra foi realizada com sucesso");
        System.out.println("Detalhes da compra: ");
        for (int j = 0; j < i; j++) {
            compras[j].mostraPCConfigs();    
        }
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("CPF do cliente: " + cliente.getCpf());
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
        ProcessarPedido.ProcessarPedido(compras);
    }
}
