public class Cantina {
    public String nome;
    public Salgado salgado[] = new Salgado[10];

    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgado.length; i++){
            if(salgado[i] == null){  //o for normal eh usado para ler e modificar algo dentro do for
                salgado [i] = novoSalgado; 
                break;
            }
        }
    }

    public void mostrarInfo(){
        System.out.println("Salgados da Cantina: ");
        for (Salgado salgados : salgado){  //foreach eh usado para apenas ler pois nao tem indice
            if (salgados != null){
                System.out.println("Salgados: " + salgados.nome);
            }
        }
    }
}

