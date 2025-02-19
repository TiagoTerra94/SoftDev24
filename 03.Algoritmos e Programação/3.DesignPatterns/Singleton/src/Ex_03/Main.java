package Ex_03;

public class Main {
    public static void main(String[] args) {
        UserSession sessionManager = UserSession.getInstance();

        System.out.println("Token de Acesso:" + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());

        sessionManager.getLastAccess();

        System.out.println("Token de Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());
    }
}
