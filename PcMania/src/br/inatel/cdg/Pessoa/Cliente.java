package br.inatel.cdg.Pessoa;
import br.inatel.cdg.PC.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] compra;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compra = new Computador[10];
    }

    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < 10; i++){
            if (compra[i] != null){
                total += compra[i].getPreco();
            }
        }
        return total;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public Computador[] getCompra(){
        return compra;
    }
}
