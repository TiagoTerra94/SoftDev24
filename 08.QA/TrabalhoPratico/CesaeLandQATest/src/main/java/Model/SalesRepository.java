package Model;

import Domain.Sale;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    private ArrayList<Sale> salesList;

    //Metodo construtor
    public SalesRepository(String filepath) throws FileNotFoundException {
        this.salesList = CSVReader.readSaleFileToArray(filepath);
    }

    /**
     * Retorna lista de vendas/bilhetes
     * @return
     */
    public ArrayList<Sale> getSalesList() {
        return salesList;
    }
}
