package Alverca.Domain;

public class User {
    private String userName;
    private String userType;
    private String password;

    public User(String userName, String userType, String password) {
        this.userName = userName;
        this.userType = userType;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }
}
