

import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;


public class Main{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gustavo");
        cliente1.setCpf(02332132110);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Pedro");
        cliente1.setCpf(023213213223);

        Cliente[] clientes = new Cliente[2];
        clientes[0] = cliente1;
        clientes[1] = cliente2;

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(1000);
        conta.setNumero(01);

        System.out.println(conta.getSaldo());
        conta.depositar(1200);

        System.out.println(conta.getSaldo());
        conta.sacar(300);

        System.out.println(conta.getSaldo());
        conta.sacar(800);

    }
}
