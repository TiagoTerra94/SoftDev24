package GrandesNegocios.Model;

import GrandesNegocios.Domain.Sale;
import GrandesNegocios.Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    private ArrayList<Sale> salesList;

    public SalesRepository() throws FileNotFoundException {
        this.salesList = CSVReader.readSaleFileToArray("src/GrandesNegocios/Files/minimercado.csv");
    }

    public ArrayList<Sale> getSalesList() {
        return salesList;
    }
}
