package GrandesNegocios.Views;

import GrandesNegocios.Controllers.CrewController;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.in;

public class CrewView {

    CrewController crewController;

    public CrewView() throws FileNotFoundException {
        this.crewController = new CrewController();
    }

    public void crewMenu(){

        Scanner sc = new Scanner(in);

        int menuOption;
        do {
            System.out.println("Hello! Get to Work \uD83E\uDDF0");
            System.out.println("1. Add new sale");
            System.out.println("2. Check Product Stock");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            menuOption = sc.nextInt();

            switch (menuOption) {
                case 1: // Add New Sale
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    System.out.print("Product: ");
                    String product = sc.nextLine();
                    System.out.print("Unit Sold: ");
                    String unitSold = sc.nextLine();
                    System.out.print("Unit Price: ");
                    String unitPrice = sc.nextLine();
                    this.crewController.addNewSale(category, product, unitSold, unitPrice);
                    break;
                case 2: // Check Product Stock
                    System.out.print("Check stock of: ");
                    String productStock = sc.nextLine();
                    System.out.println("Stock: " + this.crewController.checkStock(productStock) + " " + productStock);
                    break;
                case 0:
                    break;
                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option! \uD83D\uDEA8");
            }
        }while(menuOption !=0);
    }
}
