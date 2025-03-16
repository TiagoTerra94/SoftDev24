package Controllers;

import Domain.Attraction;
import Domain.Cost;
import Domain.Sale;
import Model.AttractionsRepository;
import Model.CostRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class EngineerController {

    private CostRepository costRepository;
    private SalesRepository salesRepository;
    private AttractionsRepository attractionsRepository;

    /**
     * Metodo construtor
     * @throws FileNotFoundException
     */
    public EngineerController() throws FileNotFoundException {
        this.costRepository = new CostRepository();
        this.salesRepository = new SalesRepository();
        this.attractionsRepository = new AttractionsRepository();
    }

    /**
     * Busca o repositório de Atrações
     * @return
     */
    public AttractionsRepository getAttractionsRepository() {
        return attractionsRepository;
    }

    /**
     * Metodo para calcular o resto dos bilhetes em falta para a próxima revisão
     * @return
     */
    public ArrayList<Integer> nextRevisions(){
        ArrayList<Integer> remainingTickets = new ArrayList<>();

        //Ciclo para contar nr de bilhetes e subtrair a cada 50 para saber o resto! dos bilhetes em falta para próxima revisao
        for(Attraction currentAttraction: this.attractionsRepository.getAtractionsList()){
            int ticketCounter = 0;

            for (Sale currentSale : this.salesRepository.getSalesList()) {
                if (currentSale.getId() == currentAttraction.getId()) {
                    ticketCounter++;

                }
            }

            int remaining = 50 - (ticketCounter % 50);

            if(remaining == 50){
                remaining = 0;
            }
            remainingTickets.add(remaining);

        }

        return remainingTickets;
    }

    /**
     * Metodo para calcular as ultimas 3 revisoes (nao implementado)
     * @return
     */
    public String getLastRevision(){
        return "!Not implemented!";
    }
}
