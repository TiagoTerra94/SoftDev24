package GrandesNegocios.Views;

import GrandesNegocios.Controllers.AdminController;
import GrandesNegocios.Domain.Sale;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {

    AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu(){

        int menuOption;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Hello Dear Admin \uD83E\uDDF0");
            System.out.println("1. Most Sold Product (By Units)");
            System.out.println("2. Most Sold Product (By Value)");
            System.out.println("3. Best Sale (By Units)");
            System.out.println("4. Best Sale (By Value)");
            System.out.println("5. Total Sales");
            System.out.println("6. Average Sales");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1://Most Sold Product (By Units)
                    break;
                case 2://Most Sold Product (By Value)
                    break;
                case 3://Best Sale (By Units)
                    System.out.println("****Most Sold Product (By Units)");
                    Sale bestSeller = this.adminController.bestSaleUnits();
                    System.out.println(bestSeller.getCategory() + " | " + bestSeller.getProduct() + " | " + bestSeller.getUnitsSold() + "units");
                    break;
                case 4://Best Sale (By Value)
                    System.out.println("****Most Sold Product (By Value)");
                    Sale bestSellerValue = this.adminController.bestSaleValue();
                    System.out.println(bestSellerValue.getCategory() + " | " + bestSellerValue.getProduct() + " | " + bestSellerValue.getUnitsSold() + "units");
                    break;
                case 5://Total Sales
                    double totalSales = this.adminController.getTotalSales();
                    System.out.println("**********Total Sales*********");
                    System.out.println(totalSales + "€\n");
                    break;
                case 6://Average Sales
                    break;
                case 0: //Exit
                    break;
                default://Invalid Option
                    System.out.println("\uD83D\uDEA8Error\uD83D\uDEA8");
            }
        }while(menuOption !=0);
    }
}
