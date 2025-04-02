package Controllers;

import Domain.Attraction;
import Domain.Cost;
import Domain.Sale;
import Model.AttractionsRepository;
import Model.CostRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {
    private SalesRepository salesRepository;
    private AttractionsRepository attractionsRepository;
    private CostRepository costRepository;

    /**
     * Metodo Construtor
     * @throws FileNotFoundException
     */
    public AdminController() throws FileNotFoundException {
        this.attractionsRepository = new AttractionsRepository("resources/Cesaeland_atracoes.csv");
        this.salesRepository = new SalesRepository("resources/Cesaeland_vendas.csv");
        this.costRepository = new CostRepository("resources/Cesaeland_atracoes.csv");
    }

    /**
     * Método para retornar total de lucro
     * @return
     */
    public double getTotalProfit(){

        double totalSales = 0.0;
        //Ciclo para obter total de lucro em bilhetes
        for(Sale currentSale: this.salesRepository.getSalesList()){
           for(Attraction currentAttraction: this.attractionsRepository.getAtractionsList()){
               if(currentSale.getId() == currentAttraction.getId() && currentSale.getCustomerType().equals("adulto")){//incrementa preço bilhetes adultos
                    totalSales += currentAttraction.getAdultPrice();
               }else if(currentSale.getId() == currentAttraction.getId() && currentSale.getCustomerType().equals("crianca")){//incrementa preço bilhetes criança
                   totalSales += currentAttraction.getChildPrice();
               }
           }
        }

        //Ciclo para obter os gastos de manutenção por bilhete
        ArrayList<String> dates = new ArrayList<>();
        double totalMaintananceCosts = 0.0;
        double monthlyCosts = 0.0;
        for(Cost currentCost: this.costRepository.getCostList()){
            for(Sale currentSale: this.salesRepository.getSalesList()){
                if(currentSale.getId() == currentCost.getId()){//se o id da sale e do custo for igual, incrementa o custo de manutenção do bilhete
                    totalMaintananceCosts += currentCost.getTicketMaintanance();
                }
                if(!dates.contains(currentSale.getDate())){//se não possuir a data, adiciona e incrementa o custo fixo mensal
                    dates.add(currentSale.getDate());
                    monthlyCosts += currentCost.getCostFixed();
                }
            }
            //Limpa o array para poder adicionar o custo fixo do próximo id
            dates.clear();
        }

        double totalProfit;
        totalProfit = (totalSales - totalMaintananceCosts) - monthlyCosts;

        return totalProfit;
    }

    /**
     * Retorna todas as vendas (não implementado)
     * @return
     */
    public String getTotalSales(){
        return "!Not implemented!";
    }

    /**
     * Retorna todas as vendas e lucros por mes (não implementado)
     * @return
     */
    public String getTotalSalesMonthly(){
        return "!Not implemented!";
    }

    /**
     * Retorna a atração mais popular dos adultos (não implementado)
     * @return
     */
    public String getMostPopularAdult(){
        return "!Not implemented!";
    }

    /**
     * Retorna a atração mais popular das crianças (não implementado)
     * @return
     */
    public String getMostPopularChildren(){
        return "!Not implemented!";
    }

    /**
     * Retorna a atração mais popular, por bilhetes vendidos (não implementado)
     * @return
     */
    public String getMostPopularAttraction(){
        return "!Not implemented!";
    }

    /**
     * Retorna a atração mais lucrativa (não implementado)
     * @return
     */
    public String getMostProfitableAttraction(){
        return "!Not implemented!";
    }

    /**
     * Retorna a atração menos lucrativa (não implementado)
     * @return
     */
    public String getLeastProfitableAttraction(){
        return "!Not implemented!";
    }

    /**
     * Retorna a atração com melhor preço-tempo (não implementado)
     * @return
     */
    public String getAttractionBestByPriceTime(){
        return "!Not implemented!";
    }

    /**
     * Adiciona um novo login (não implementado)
     * @return
     */
    public String addNewLogin(){
        return "!Not implemented!";
    }

}
