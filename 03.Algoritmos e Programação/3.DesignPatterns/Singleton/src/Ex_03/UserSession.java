package Ex_03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserSession {
    private static UserSession instance;
    private int sessionToken;
    private String lastAccess;

    private UserSession() {
    }

    public static UserSession getInstance(){
        if(instance == null){
            instance = new UserSession();
        }
        return instance;
    }

    public int getSessionToken(){
        Random rnd = new Random();
        int token = rnd.nextInt();
        return token;
    }

    public String getLastAccess(){
        Date horaAtual = new Date();
        String lastAccess = new SimpleDateFormat("HH:mm:ss").format(horaAtual);
        return lastAccess;
    }




}
