public class Cantina {
    public String nome;
    public Salgado salgado[] = new Salgado[10];

    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgado.length; i++){
            if(salgado[i] == null){  //
                salgado [i] = novoSalgado; //
                break;
            }
        }
    }

    public void mostrarInfo(){
        System.out.println("Salgados da Cantina: ");
        for (Salgado salgados : salgado){
            if (salgados != null){
                System.out.println("Salgados: " + salgados.nome);
            }
        }
    }
}

