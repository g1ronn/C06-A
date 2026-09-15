import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutella;
import br.inatel.cdg.comprador.Comprador;

public class Main {

    public static void main(String[] args) {

        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Café", 7, "Café");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 12, "Doce de Leite");
        BrownieNutella brownieNutella = new BrownieNutella("Brownie de Nutella", 20, "Nutella");
        Comprador comprador = new Comprador("Gustavo", 100);

        comprador.efetuarCompra(brownieCafe);
        comprador.efetuarCompra(brownieDoceDeLeite);
        comprador.efetuarCompra(brownieNutella);
    }
}