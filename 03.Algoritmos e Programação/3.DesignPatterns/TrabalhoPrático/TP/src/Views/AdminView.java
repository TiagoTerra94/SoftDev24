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
            System.out.println("1- Consultar o total de todas as vendas.");
            System.out.println("2- Consultar o total de lucro.");
            System.out.println("3- Consultar o total de vendas e lucro por mês, de forma tabelar");
            System.out.println("4- Consultar a atração mais procurada por adultos (número de bilhetes vendidos).");
            System.out.println("5- Consultar a atração mais procurada por crianças (número de bilhetes vendidos).");
            System.out.println("6- Consultar a atração mais procurada (número de bilhetes vendidos).");
            System.out.println("7- Consultar a atração mais lucrativa (considere o período total).");
            System.out.println("8- Consultar a atração menos lucrativa (considere o período total).");
            System.out.println("9- Consultar a atração com melhor preço/tempo. Apresenta a atração que custa menos por segundo.");
            System.out.println("10- Adicionar novo login");
            System.out.println("0 - Leave");

            menuOption = input.nextInt();

            switch (menuOption){
                case 1:
                    break;
                case 2://Consulting total profit
                    System.out.println("****Total Profit****");

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    break;
            }
        }while (menuOption != 0);
    }
}
