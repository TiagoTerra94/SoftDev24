package GrandesNegocios.Views;

import GrandesNegocios.Controllers.CustomerController;
import GrandesNegocios.Domain.Sale;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerView {
    CustomerController customerController;

    public CustomerView() throws FileNotFoundException {
        this.customerController = new CustomerController();
    }

    public void customerMenu(){

        Scanner input = new Scanner(System.in);

        int menuOption;

        do {
            System.out.println("Nice to see you \uD83D\uDEA8");
            System.out.println("1. Available Products");
            System.out.println("2. Products by category");
            System.out.println("3. Most Expensive Product");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1://Available Products
                    ArrayList<String> products = this.customerController.getProducts();
                    System.out.println("*****Products*****");
                    int counter = 0;
                    for(int i = 0; i < products.size(); i++){
                        System.out.print("Product " + counter++ + " | ");
                        System.out.println(products.get(i));
                    }
                    break;
                case 2://Products by category
                    System.out.println("Categoria: ");

                    input.nextLine();
                    String category = input.nextLine();
                    ArrayList<String> productsCategory = this.customerController.getCategory(category);

                    counter = 0;

                    System.out.println("*****Products in " + category + "******");

                    for(int i = 0; i < productsCategory.size(); i++){
                        System.out.print("Product " + counter++ + " | ");
                        System.out.println(productsCategory.get(i));
                    }
                    break;
                case 3://Most Expensive Product
                    Sale expensive = this.customerController.mostExpensiveProduct();
                    Sale cheapest = this.customerController.mostCheapestProduct();

                    System.out.println("Most Expensive: " + expensive.getCategory() + " | " + expensive.getProduct() + " | " + expensive.getUnitPrice() + "€");
                    System.out.println("Cheapest: " + cheapest.getCategory() + " | " + cheapest.getProduct() + " | " + cheapest.getUnitPrice() + "€");
                    break;
                case 0: //Exit
                    break;
                default://Invalid Option
                    System.out.println("\uD83D\uDEA8Error\uD83D\uDEA8");
            }
        } while (menuOption != 0);
    }
}
