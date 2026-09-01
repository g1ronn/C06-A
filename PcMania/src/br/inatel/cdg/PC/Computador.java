package br.inatel.cdg.PC;
import br.inatel.cdg.Configurações.MemoriaUSB;
import br.inatel.cdg.Configurações.SistemaOperacional;
import br.inatel.cdg.Configurações.HardwareBasico;
import br.inatel.cdg.Pessoa.Cliente;

public class Computador {
    private String marca;
    private String preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardware; 
    private MemoriaUSB memoriaUSB;
    private Cliente[] compra;

    public Computador(){
        this.hardware = new HardwareBasico[3];
        this.memoriaUSB = new MemoriaUSB();
        this.compra = new Cliente[10];
    }

    public void mostraPCConfigs(){
        System.out.println("Configurações do Computador:");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + sistema.getNome() + " (Tipo: " + sistema.getTipo() + ")");
        System.out.println("Memória USB: " + memoriaUSB.getNome() + " (Capacidade: " + memoriaUSB.getCapacidade() + " GB)");

    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB){
        System.out.println("Adicionando memória USB");
    }

    public String getMarca() {
        return marca;
    }
    public String getPreco() {
        return preco;
    }
    public SistemaOperacional getSistema() {
        return sistema;
    }
    public HardwareBasico[] getHardware() {
        return hardware;
    }
    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }
    public Cliente[] getCompra() {
        return compra;
    }
}
