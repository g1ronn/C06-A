package br.inatel.cdg.PC;
import br.inatel.cdg.Configurações.MemoriaUSB;
import br.inatel.cdg.Configurações.SistemaOperacional;
import br.inatel.cdg.Configurações.HardwareBasico;
import br.inatel.cdg.Pessoa.Cliente;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardware; 
    private MemoriaUSB memoriaUSB;
    private Cliente[] compra;

   public Computador(String marca, float preco, SistemaOperacional sistema, HardwareBasico[] hardware) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardware = new HardwareBasico[3];
        this.hardware[0] = hardware[0];
        this.hardware[1] = hardware[1];
        this.hardware[2] = hardware[2];
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
        this.memoriaUSB = memoriaUSB;
    }

    public String getMarca() {
        return marca;
    }
    public float getPreco() {
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
