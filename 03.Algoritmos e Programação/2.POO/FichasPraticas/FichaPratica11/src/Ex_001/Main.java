package Ex_001;

import Ex_001.Enums.Armas;
import Ex_001.Enums.Categoria;
import Ex_001.Enums.Instalacoes;

public class Main {
    public static void main(String[] args) {
        JatoParticular jato1 = new JatoParticular(12234,"CESSNA",2005,5000,14,5,2,2,700,500,5000.000,30,50, Categoria.MIDSIZEJET);
        jato1.adicionarInstalacao(Instalacoes.WC);
        jato1.adicionarInstalacao(Instalacoes.CINEMA);
        jato1.adicionarInstalacao(Instalacoes.SUITE);


        AviaoCombate aviao1 = new AviaoCombate(11467,"F16",2000,2000,20,10,7,4,1000,600,9000.000,"França",true);
        aviao1.adicionarArma(Armas.MISSEIS);
        aviao1.adicionarArma(Armas.METRALHADORAS);
        aviao1.adicionarArma(Armas.FOGUETES);
        aviao1.adicionarArma(Armas.TORPEDOS);

        Catalogo catalogo = new Catalogo();
        catalogo.adquirirAviao(jato1);
        catalogo.adquirirAviao(aviao1);

        catalogo.listarCatalogo();
        System.out.println("--------------------------------------");
        System.out.println("Valor total do catalogo: " + catalogo.calcularTotalCatalogo() + "€");
    }
}
