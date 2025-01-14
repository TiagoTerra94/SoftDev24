package Ex_06;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Cristiano Ronaldo","Futebol", 1.70,78,"Portugal");
        Atleta atleta2 = new Atleta("Lebron James", "Basketball", 2.10,90,"USA");
        Atleta atleta3 = new Atleta("Lionel Messi", "Futebol", 1.55, 63,"Argentina");
        Atleta atleta4 = new Atleta("Susan Meskie", "Atletismo", 1.56, 55,"Haiti");
        Atleta atleta5 = new Atleta("Usain Bolt" , "Atletismo", 1.90, 80, "Jamaica");
        Atleta atleta6 = new Atleta("Weiss Bine", "Volleyball", 1.70,70,"Holanda");

        Competicao torneioCorrida = new Competicao("Torneio de Corrida", "Espanha", 10);
        Competicao torneioSolidario = new Competicao("Torneio de Futsal Solidário", "Portugal", 12);

        System.out.println("******INSCRIÇÕES******");
        torneioCorrida.inscreverAtleta(atleta5);
        torneioCorrida.inscreverAtleta(atleta4);
        torneioCorrida.inscreverAtleta(atleta1);

        torneioSolidario.inscreverAtleta(atleta1);
        torneioSolidario.inscreverAtleta(atleta2);
        torneioSolidario.inscreverAtleta(atleta3);
        torneioSolidario.inscreverAtleta(atleta4);
        torneioSolidario.inscreverAtleta(atleta5);
        torneioSolidario.inscreverAtleta(atleta6);

        System.out.println("*******LISTA DE TORNEIOS E PARTICIPANTES*******");
        torneioCorrida.exibirDetalhes();
        torneioSolidario.exibirDetalhes();
    }
}
