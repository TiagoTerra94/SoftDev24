package Alverca.Model;

import Alverca.Domain.User;
import Alverca.Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    private ArrayList<Alverca.Domain.User> usersList;

    public UsersRepository() throws FileNotFoundException {
        this.usersList = CSVReader.readUserFileToArray("src/Alverca/Files/login_alverca.csv");
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }
}
