package GrandesNegocios.Controllers;

import GrandesNegocios.Domain.Sale;
import GrandesNegocios.Model.SalesRepository;

import java.io.FileNotFoundException;
import java.io.FileWriter;

public class CrewController {
    private SalesRepository salesRepository;

    public CrewController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    // Add New Sale
    public void addNewSale(String category, String product, String unitSold, String unitPrice) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("src/Exercicio1/Resources/minimercado.csv", true);
            fileWriter.write("\n" + category + "," + product + "," + unitSold + "," + unitPrice);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Check Product Stock
    public int checkStock(String product) {
        int stock = 1000;

        for (Sale sale: this.salesRepository.getSalesList()) {
            if (sale.getProduct().equals(product)) {
                stock -= (int)sale.getUnitsSold();
            }
        }

        return stock;
    }
}
