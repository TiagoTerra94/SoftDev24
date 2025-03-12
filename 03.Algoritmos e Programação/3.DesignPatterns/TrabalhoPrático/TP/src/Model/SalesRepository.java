package Model;

import Domain.Sale;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    private ArrayList<Sale> salesList;

    public SalesRepository() throws FileNotFoundException {
        this.salesList = CSVReader.readSaleFileToArray("src/Files/Cesaeland_vendas.csv");
    }

    public ArrayList<Sale> getSalesList() {
        return salesList;
    }
}
