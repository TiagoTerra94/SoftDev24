package Ex_04;

public class FileManager {
    private static FileManager instance;
    private String root;

    private FileManager(String root) {

        this.root = root;
    }

    public static FileManager getInstance(String root){
        if(instance == null){
            instance = new FileManager(root);
        }
        return instance;
    }

    public void setRootDiretory(String root){
        setRootDiretory(root);
    }

    public void createFile(){

    }

    public void deleteFile(){

    }
}
