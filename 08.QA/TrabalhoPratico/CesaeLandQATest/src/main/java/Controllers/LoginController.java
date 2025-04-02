package Controllers;

import Domain.User;
import Model.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UsersRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UsersRepository("resources/Cesaeland_logins.csv");
    }

    public String accessType(String usernameInput, String passwordInput){
        String accessType = "ERROR";

        for(User currentUser: this.usersRepository.getUsersList()){
            if(currentUser.getUsername().equals(usernameInput) && currentUser.getPassword().equals(passwordInput)){//se tanto o username e a password forem válidas
                accessType = currentUser.getUserType();
            }
        }
        return accessType;
    }
}
