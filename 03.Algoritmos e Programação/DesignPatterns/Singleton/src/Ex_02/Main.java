package Ex_02;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("application_log.txt");
        logger.log("Log 1: Variável x definida para 20");
        logger.log("Log 2: Objeto 'porsche' da Classe Car criado com sucesso");

        Logger logger2 = Logger.getInstance("programa_log.txt");
        logger2.log("Log 3: Objeto “mercedes” da Classe Car criado com sucesso");
        logger2.log("Log 4: Método corrida invocado entre porsche e mercedes");
        logger2.log("Log 5: Vencedor da corrida é porsche");
    }
}
