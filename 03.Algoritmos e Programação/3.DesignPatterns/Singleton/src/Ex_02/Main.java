package Ex_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Carro ferrari = new Carro("Ferrari","Denis",2003,200,2000,TipoCombustivel.DIESEL,50);

        ferrari.ligar();

        Logger logger = Logger.getInstance("application_log.txt");
        logger.log("Log 1: Variável x definida para 20");

        Logger logger2 = Logger.getInstance("programa_log.txt");
        logger2.log("Log 3: Objeto “mercedes” da Classe Car criado com sucesso");
        logger2.log("Log 4: Método corrida invocado entre porsche e mercedes");
        logger2.log("Log 5: Vencedor da corrida é porsche");
    }
}
