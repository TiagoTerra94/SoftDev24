package Ex_07;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("A culpa é das estrelas","Gary Moss","Romance",312,584222256);
        Livro livro2 = new Livro("Star Wars", "George Lucas","Sci-Fi",340,1293635252);

        livro1.exibirDetalhes();
        System.out.println("_______");
        livro2.exibirDetalhes();
    }
}
