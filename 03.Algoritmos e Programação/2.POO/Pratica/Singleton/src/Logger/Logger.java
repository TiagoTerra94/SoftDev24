package Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private  static Logger instance;
    private String fileName;

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getInstance(String fileName) {
        if (instance == null) {
            instance = new Logger(fileName);
        }
        return instance;
    }



    public void log(String message) throws IOException {

        FileWriter writer = new FileWriter(new File(this.fileName),true);//o append incrementa
        writer.append(message+"\n");

        System.out.println("Data written to the file successfully.");
        writer.close();

    }
}
