package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {
    AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu(){

        int menuOption;

        do{
            Scanner input = new Scanner(System.in);

            System.out.println("*Welcome Dear Admin*");
            System.out.println("1 - Check the total of all sales.");
            System.out.println("2 - Check the total profit.");
            System.out.println("3 - Check the total sales and profit by month, in tabular form");
            System.out.println("4 - Check the most popular attraction for adults (number of tickets sold).");
            System.out.println("5 - Check the most popular attraction for children (number of tickets sold).");
            System.out.println("6 - Check the most popular attraction (number of tickets sold).");
            System.out.println("7 - Check the most profitable attraction (consider the total period).");
            System.out.println("8 - Check the least profitable attraction (consider the total period).");
            System.out.println("9 - Check the attraction with the best price/time. Shows the attraction that costs less per second.");
            System.out.println("10 - Add new login");
            System.out.println("0 - Leave");

            menuOption = input.nextInt();

            switch (menuOption){
                case 1://Consultar o total de todas as vendas
                    break;
                case 2://Consultar o lucro total
                    System.out.println("******Total Profit******");
                    System.out.println("------------------------");
                        double totalProfit = this.adminController.getTotalProfit();
                        System.out.printf("Total Profit: %.2f€%n", totalProfit);
                    System.out.println("------------------------");
                    break;
                case 3://Consultar o total de vendas e lucro por mês, de forma tabelar
                    break;
                case 4://Consultar a atração mais procurada por adultos (número de bilhetes vendidos)
                    break;
                case 5://Consultar a atração mais procurada por crianças (número de bilhetes vendidos)
                    break;
                case 6://Consultar a atração mais procurada (número de bilhetes vendidos)
                    break;
                case 7://Consultar a atração mais lucrativa (considere o período total)
                    break;
                case 8://Consultar a atração menos lucrativa (considere o período total)
                    break;
                case 9://Consultar a atração com melhor preço/tempo. Apresenta a atração que custa menos por segundo
                    break;
                case 10://Adicionar novo login
                    break;
                case 0://Sair
                    break;
            }
        }while (menuOption != 0);
    }
}
