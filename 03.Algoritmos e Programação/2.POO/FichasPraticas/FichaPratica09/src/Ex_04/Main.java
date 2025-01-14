package Ex_04;

public class Main {
    public static void main(String[] args) {

        Imovel casa1 = new Imovel("Santos Rocha",10,"Coimbra","Casa","Nova",100,3,1,18);
        Imovel casa2 = new Imovel("General Ribeiro",4,"Chaves","Apartamento","Usada",50,1,1,0);

        System.out.println("Valor do Imovel da Rua " + casa1.getRua() + ": " + casa1.valorImovel() + "€");
        System.out.println("Valor do Imovel da Rua " + casa2.getRua() + ": " + casa2.valorImovel() + "€");

        System.out.println("----------");

        casa1.imprimirDescricao();
        casa2.imprimirDescricao();

        Imovel maisCaro = casa1.compararImoveis(casa2);

        System.out.println("-------");

        maisCaro.imprimirDescricao();

    }

}
