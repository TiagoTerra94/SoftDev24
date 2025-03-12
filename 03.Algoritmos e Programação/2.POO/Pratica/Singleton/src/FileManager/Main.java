package FileManager;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = FileManager.getInstance();

        fileManager.setRootDirectory("/FileManager");

        fileManager.createFile("file.txt");
        fileManager.createFile("ficheiroNovo.txt");
    }
}
