package Ex_02;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String nomeFicheiro;

    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static Logger getInstance(String nomeFicheiro) {
        if(instance == null){
            instance = new Logger(nomeFicheiro);
        }

        return instance;
    }

    public void log(String message){
        try (FileWriter writer = new FileWriter(nomeFicheiro,true)) {
            writer.write(message + "\n");

            System.out.println("Data written to the file successfully.");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
