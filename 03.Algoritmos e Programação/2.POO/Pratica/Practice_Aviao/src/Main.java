import Enums.Armas;
import Enums.Categoria;
import Enums.Instalacoes;

public class Main {
    public static void main(String[] args) {
        AviaoCombate F16 = new AviaoCombate("IE900","F16",2000,1000,100,15,5,2,1000,600,500.000,"Portugal",true);
        AviaoCombate D900 = new AviaoCombate("KP102","D900",2005,800.00,140,20,13,4,900,500,100000,"Espanha",false);

        JatoParticular Cessna = new JatoParticular("C100","CESSNA",2001,700.00,90,7,5,2,1000,800,800.000,60,200, Categoria.LIGHT_JET);

        F16.addArmas(Armas.METRALHADORAS);
        F16.addArmas(Armas.FOGUETES);
        F16.addArmas(Armas.TORPEDOS);
        F16.addArmas(Armas.BOMBAS);

        Cessna.addInstalacoes(Instalacoes.CHUVEIRO);
        Cessna.addInstalacoes(Instalacoes.WC);
        Cessna.addInstalacoes(Instalacoes.SUITE);

        Catalogo catalogo = new Catalogo();
        catalogo.comprarAviao(F16);
        catalogo.comprarAviao(D900);
        catalogo.comprarAviao(Cessna);

        catalogo.exibeListaAviao();
        System.out.println("Total do catalogo: " + catalogo.calculoTotal() + "€");

    }
}