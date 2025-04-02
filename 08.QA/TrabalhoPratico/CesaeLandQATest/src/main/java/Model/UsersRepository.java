package Model;

import Domain.User;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    private ArrayList<User> usersList;

    //Metodo construtor
    public UsersRepository(String filepath) throws FileNotFoundException {
        this.usersList = CSVReader.readUserFiletoArray(filepath);
    }

    /**
     * Retorna lista de utilizadores com credenciais
     * @return
     */
    public ArrayList<User> getUsersList() {
        return usersList;
    }
}
