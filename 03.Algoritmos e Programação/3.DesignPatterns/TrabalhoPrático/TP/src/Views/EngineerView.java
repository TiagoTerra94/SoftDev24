package Views;

import Controllers.EngineerController;
import Domain.Attraction;
import Model.CostRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EngineerView {

    EngineerController controller;

    public EngineerView() throws FileNotFoundException {
        this.controller = new EngineerController();
    }

    public void menuEngineer() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int menuOption;

        do{
            System.out.println("*Engineer Menu!*");
            System.out.println("1 - Consulting the next 3 Revisions");
            System.out.println("2 - Consulting last 3 revisions");
            System.out.println("0 - Leave");

            menuOption = input.nextInt();

            switch (menuOption){
                case 1://Próximas 3 revisões
                    ArrayList<Integer> remainingTickets = this.controller.nextRevisions();
                    ArrayList<Integer> orderTickets = new ArrayList<>(remainingTickets);
                    ArrayList<Attraction> attractions = this.controller.getAttractionsRepository().getAtractionsList();
                    ArrayList<Attraction> orderAttractions = new ArrayList<>(attractions);

                    //Ordena de forma crescente os tickets, bem como as atrações relacionadas
                    for(int i=0; i<orderTickets.size()-1; i++){
                        for(int j=i+1; j<orderTickets.size(); j++){
                            if(orderTickets.get(i) > orderTickets.get(j)){
                                int temp = orderTickets.get(i);
                                orderTickets.set(i,orderTickets.get(j));
                                orderTickets.set(j,temp);

                                Attraction tempAttraction = orderAttractions.get(i);
                                orderAttractions.set(i, orderAttractions.get(j));
                                orderAttractions.set(j, tempAttraction);
                            }
                        }
                    }

                    System.out.println("***Next 3 Revisions***");
                    System.out.println("ID    | Attraction                     | Nº Tickets for Next Revision");
                    System.out.println("------|--------------------------------|---------------------------");
                    //Imprime a tabela com o ID, nome da atração mais o numero de bilhetes que faltam para fazer revisao
                    for(int i=0; i<3; i++){
                        Attraction atual = orderAttractions.get(i);
                        System.out.printf("%-5s | %-30s | %-25d%n",
                                atual.getId(),
                                atual.getAtraction(),
                                orderTickets.get(i));
                    }
                    System.out.println("------|--------------------------------|---------------------------");
                    break;
                case 2://Últimas 3 revisões
                    break;
                case 0://Sair
                    break;
                default://Invalid Option
                    System.out.println("Invalid Option");
            }

        }while(menuOption != 0);

    }
}
