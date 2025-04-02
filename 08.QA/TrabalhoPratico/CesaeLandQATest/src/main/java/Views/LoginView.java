package Views;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    /**
     * View de entrada do login
     * @throws FileNotFoundException
     */
    public void entryView() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int loginOption;
        String username;
        String password;

        //Menu de Login
        do{
            System.out.println("*Welcome to CesaeLand TematicPark*");
            System.out.println("1- Customer");
            System.out.println("2- Staff Member");
            System.out.println("0- Leave");

            loginOption = input.nextInt();

            switch (loginOption){
                case 1://Cliente
                    CustomerView customerView = new CustomerView();
                    customerView.menuCustomer();
                    break;
                case 2://Membro (ENG ou ADMIN)
                    System.out.println("Login with your credentials:");
                    System.out.print("Username: ");
                    username = input.next();

                    System.out.print("Password: ");
                    password = input.next();

                    validateLogin(username,password);
                    break;
                case 0://Sair
                    break;
                default://Invalid Option
                    System.out.println("Invalid Option");
            }

        }while(loginOption != 0);
    }

    /**
     * Valida os dados introduzidos para efetuar o login
     * @param usernameInput
     * @param passwordInput
     * @throws FileNotFoundException
     */
    private void validateLogin(String usernameInput, String passwordInput) throws FileNotFoundException {
        String access = loginController.accessType(usernameInput, passwordInput);

        switch (access){
            case "ADMIN":
                AdminView adminView = new AdminView();
                adminView.adminMenu();
                break;

            case "ENG":
                EngineerView engineerView = new EngineerView();
                engineerView.menuEngineer();
                break;

            case "ERROR":
                System.out.println("ACCESS DENIED");
                break;
        }
    }

}
