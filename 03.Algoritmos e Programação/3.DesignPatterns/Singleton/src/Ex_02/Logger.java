package Ex_02;

import java.io.File;
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

    public void log(String message) throws  IOException{

            FileWriter writer = new FileWriter(new File(this.nomeFicheiro),true);//o append incrementa
            writer.append(message+"\n");

            System.out.println("Data written to the file successfully.");
            writer.close();

    }
}
