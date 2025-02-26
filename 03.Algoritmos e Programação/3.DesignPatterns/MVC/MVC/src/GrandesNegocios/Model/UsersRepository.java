package GrandesNegocios.Model;

import GrandesNegocios.Domain.User;
import GrandesNegocios.Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    private ArrayList<User> usersList;

    public UsersRepository() throws FileNotFoundException {
        this.usersList = CSVReader.readUserFileToArray("src/GrandesNegocios/Files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }
}
