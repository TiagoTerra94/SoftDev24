package Model;

import Domain.Cost;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CostRepository {
    private ArrayList<Cost> costList;

    public CostRepository() throws FileNotFoundException {
        this.costList = CSVReader.readCostFileToArray("src/Files/Cesaeland_custos.csv");
    }

    public ArrayList<Cost> getCostList() {
        return costList;
    }
}
