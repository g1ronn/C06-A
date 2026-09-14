import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutella;

public class Main {

    public static void main(String[] args) {

        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Café", 7, "Café");

        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 12, "Doce de Leite");

        BrownieNutella brownieNutella = new BrownieNutella("Brownie de Nutella", 20, "Nutella");


        brownieCafe.AdicionandoCafe();
        brownieDoceDeLeite.AdicionandoDoceDeLeite();
        brownieNutella.AdicionandoNutella();
        
        brownieCafe.addCarrinhodeCompras();
        brownieDoceDeLeite.addCarrinhodeCompras();
        brownieNutella.addCarrinhodeCompras();

        brownieCafe.calculaValorTotalCompra();
        brownieDoceDeLeite.calculaValorTotalCompra();
        brownieNutella.calculaValorTotalCompra();

        brownieCafe.mostraInfo();
        brownieDoceDeLeite.mostraInfo();
        brownieNutella.mostraInfo();


    }
}