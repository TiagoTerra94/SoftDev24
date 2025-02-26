package Alverca.Views;

import GrandesNegocios.Controllers.LoginController;
import GrandesNegocios.Views.AdminView;
import GrandesNegocios.Views.CrewView;
import GrandesNegocios.Views.CustomerView;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginViewAlverca {

    LoginController loginController;

    public LoginViewAlverca() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void entryView() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int loginOption;

        do {
            System.out.println("\uD83D\uDEA8Alverca's Database Menu\uD83D\uDEA8");
            System.out.println("1. Admin");
            System.out.println("2. Coach");
            System.out.println("3. Player");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            loginOption = input.nextInt();

            switch (loginOption) {
                case 1://Admin Menu
                    break;
                case 2://Coach Menu
                    break;
                case 3://Player Menu
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
                break;

            case "COACH":
                break;

            case "PLAYER":
                break;
            case "ERROR":
                System.out.println("ACCESS DENIED");
                break;
        }
    }
}
