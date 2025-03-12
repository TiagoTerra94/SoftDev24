package Controllers;

import Domain.Sale;
import Model.AttractionsRepository;
import Model.CostRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;

public class AdminController {
    private SalesRepository salesRepository;
    private AttractionsRepository attractionsRepository;
    private CostRepository costRepository;

    public AdminController() throws FileNotFoundException {
        this.attractionsRepository = new AttractionsRepository();
        this.salesRepository = new SalesRepository();
        this.costRepository = new CostRepository();
    }

    public double getTotalProfit(){
        Sale saleQuantity = new Sale(0,"","");

        for(Sale currentSale: this.salesRepository.getSalesList()){

        }
    }
}
