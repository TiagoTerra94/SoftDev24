package Alverca;

import Alverca.Views.LoginViewAlverca;
import GrandesNegocios.Views.LoginView;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LoginViewAlverca loginView = new LoginViewAlverca();
        loginView.entryView();
    }
}
