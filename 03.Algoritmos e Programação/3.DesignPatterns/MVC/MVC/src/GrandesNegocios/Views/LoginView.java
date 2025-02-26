package GrandesNegocios.Views;

import GrandesNegocios.Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {

    LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void entryView() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int loginOption;

        do {
            System.out.println("\uD83D\uDEA8Welcome to Big Business Grocery Store\uD83D\uDEA8");
            System.out.println("1. Customer");
            System.out.println("2. Staff Member");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            loginOption = input.nextInt();

            switch (loginOption) {
                case 1://Customer
                    CustomerView customerView = new CustomerView();
                    customerView.customerMenu();
                    break;
                case 2://Staff Member
                    System.out.println("\nLogin with your credentials");
                    System.out.print("Username: ");
                    String usernameInput = input.next();

                    System.out.print("Password: ");
                    String passwordInput = input.next();

                    validateLogin(usernameInput,passwordInput);
                    break;
                case 0: //Exit
                    break;
                default://Invalid Option
                    System.out.println("\uD83D\uDEA8Error\uD83D\uDEA8");
            }
        }while(loginOption != 0);
    }

    private void validateLogin(String usernameInput, String passwordInput) throws FileNotFoundException {
        String access = loginController.accessType(usernameInput, passwordInput);

        switch (access){
            case "ADMIN":
                AdminView adminView = new AdminView();
                adminView.adminMenu();
                break;

            case "FUNC":
                CrewView crewView = new CrewView();
                crewView.crewMenu();
                break;

            case "ERROR":
                System.out.println("ACCESS DENIED");
                break;
        }
    }
}
