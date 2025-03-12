package UserManager;

public class Main {
    public static void main(String[] args) {
        UserSessionManager sessionManager = UserSessionManager.getInstance();
        System.out.println("Token de acesso: " + sessionManager.getSessiontoken());
        System.out.println("Ultimo acesso: " + sessionManager.getLastAccess());

        sessionManager.updateLastAccess();

        System.out.println("Token de acesso: " + sessionManager.getSessiontoken());
        System.out.println("Ultimo acesso: " + sessionManager.getLastAccess());
    }
}
