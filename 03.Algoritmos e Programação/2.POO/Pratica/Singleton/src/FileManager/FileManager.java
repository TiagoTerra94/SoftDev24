package FileManager;

import java.io.File;

public class FileManager {
    private static FileManager instance;
    private String root;

    private FileManager() {
    }

    public static FileManager getInstance() {
        if(instance == null){
            instance = new FileManager();
        }
        return instance;
    }

    //Metodos de instancia
    public void setRootDirectory(String root) {
        this.root = root;
    }

    public void createFile(String fileName) {
        File file = new File(root,fileName);
    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
    }
}
