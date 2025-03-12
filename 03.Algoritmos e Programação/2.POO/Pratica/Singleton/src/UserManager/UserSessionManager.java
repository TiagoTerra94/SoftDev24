package UserManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessiontoken;
    private String lastAccess;

    private UserSessionManager() {
    }

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public int getSessiontoken() {
        Random rnd = new Random();
        sessiontoken = rnd.nextInt();

        return sessiontoken;
    }

    public String getLastAccess() {
        Date horaAtual = new Date();
        String lastAccess = new SimpleDateFormat("HH:mm:ss").format(horaAtual);
        return lastAccess;
    }

    public String updateLastAccess() {
        Date horaAtual = new Date();
        String lastAccess = new SimpleDateFormat("HH:mm:ss").format(horaAtual);
        return lastAccess;
    }
}
