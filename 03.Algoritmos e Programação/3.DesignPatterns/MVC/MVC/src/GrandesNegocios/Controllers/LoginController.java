package GrandesNegocios.Controllers;

import GrandesNegocios.Domain.User;
import GrandesNegocios.Model.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UsersRepository usersRepository;

    public LoginController() throws FileNotFoundException{
        usersRepository = new UsersRepository();
    }

    public String accessType(String usernameInput, String passwordInput){
        String accessType = "ERROR";

        for(User currentUser: this.usersRepository.getUsersList()){
            if(currentUser.getUsername().equals(usernameInput) && currentUser.getPassword().equals(passwordInput)){
                //Valid Access
                accessType = currentUser.getUserType();
            }
        }

        return accessType;
    }
}
