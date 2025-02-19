package Ex_01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbconnection1 = DatabaseConnection.getInstance("/dbc:mysql://localhost:3306/mydatabase","14/02/2015 15:10");
        DatabaseConnection dbconnection2 = DatabaseConnection.getInstance("/dbc:mysql://localhost:8800/mydatabase","14/02/2015 15:10");


        dbconnection1.connect();
        dbconnection1.disconnect();

        dbconnection2.connect();
        dbconnection2.disconnect();
    }
}