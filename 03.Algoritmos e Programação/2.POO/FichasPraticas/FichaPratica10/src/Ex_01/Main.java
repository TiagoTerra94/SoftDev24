package Ex_01;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("The Scientist","Rock Alternativo", "Coldplay",260);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre de Culinária", "Heavy Metal", "Quim Barreiros", 233);
        Musica musica4 = new Musica("Californication" , "Rock Alternativo", "Red Hot",320);
        Musica musica5 = new Musica("Borderline", "Indie Pop","Tame Impala", 280);
        Musica musica6 = new Musica("Coastline", "Indie","Hollow Coves", 250);

        MusicPlayer listaMusicas = new MusicPlayer();

        System.out.println("********Radio TT*********");

        //Adicionar musicas à lista
        listaMusicas.addMusica(musica1);
        listaMusicas.addMusica(musica2);
        listaMusicas.addMusica(musica3);
        listaMusicas.addMusica(musica4);
        listaMusicas.addMusica(musica5);
        listaMusicas.addMusica(musica6);
        System.out.println("--------------------");

        //Imprimir
        listaMusicas.imprimirRelatorio();
        System.out.println("--------------------");

        //Troca música
        listaMusicas.trocarMusica(1,6);
        System.out.println("--------------------");

        //Imprimir
        listaMusicas.imprimirRelatorio();
        System.out.println("--------------------");

        //Remover música
        listaMusicas.removerMusica(3);
        System.out.println("-------------------");

        //Imprimir
        listaMusicas.imprimirRelatorio();
        System.out.println("-------------------");

        //Duração Programação
        listaMusicas.duracaoProgramacao();
        System.out.println("-------------------");

        //Remover TODAS musicas
        listaMusicas.removerTodas();
        System.out.println("-------------------");

        //Imprimir
        listaMusicas.imprimirRelatorio();






    }
}
