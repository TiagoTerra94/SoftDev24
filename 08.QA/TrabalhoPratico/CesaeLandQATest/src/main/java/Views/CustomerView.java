package Views;

import Controllers.CustomerController;
import Domain.Attraction;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerView {
    CustomerController customerController;

    public CustomerView() throws FileNotFoundException {
        this.customerController = new CustomerController();
    }

    /**
     * View/Menu do cliente
     */
    public void menuCustomer(){
        Scanner input = new Scanner(System.in);

        int menuOption;

        do{
            System.out.println("*Hello, customer!*");
            System.out.println("1 - Available Attractions");
            System.out.println("2 - Favourite Attractions ");
            System.out.println("0 - Leave");

            menuOption = input.nextInt();

            switch (menuOption){
                case 1://Atrações disponiveis
                    ArrayList<Attraction> attractions = this.customerController.getAttraction();
                    System.out.println("         Attraction              | Adult Price  | Child Price  | Duration(Sec)");
                    System.out.println("---------------------------------|--------------|--------------|---------------");
                    for(int i = 0; i < attractions.size(); i++){
                        Attraction atual = attractions.get(i);
                        System.out.printf("%-32s | %10.2f € | %10.2f € | %13d%n",
                                atual.getAtraction(),
                                atual.getAdultPrice(),
                                atual.getChildPrice(),
                                atual.getSeconds());
                    }
                    System.out.println("---------------------------------|--------------|--------------|---------------");
                    break;
                case 2://Atrações favoritas
                    System.out.println(this.customerController.getFavouritAttraction());
                    break;
                case 0:
                    break;
                default://Invalid Option
                    System.out.println("Invalid Option");
            }

        }while(menuOption != 0);

    }
}
