package Views;

import Controllers.LoginController;

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

        //Menu de Login
        do{
            System.out.println("Welcome to CesaeLand TematicPark");
            System.out.println("1- Customer");
            System.out.println("2- Enginneer");
            System.out.println("3- Administrator");
            System.out.println("0- Leave");

            loginOption = input.nextInt();

            switch (loginOption){
                case 1://Customer
                    CustomerView customerView = new CustomerView();
                    customerView.menuCustomer();
                    break;
                case 2://Engineer
                    break;
                case 3://Admin
                    break;
                case 0://Leave
                    break;
                default://Invalid Option
                    System.out.println("Invalid Option");
            }

        }while(loginOption != 0);
    }

}
