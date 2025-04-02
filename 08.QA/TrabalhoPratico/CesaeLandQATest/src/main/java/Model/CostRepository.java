package Model;

import Domain.Cost;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CostRepository {
    private ArrayList<Cost> costList;

    //Metodo construtor
    public CostRepository(String filepath) throws FileNotFoundException {
        this.costList = CSVReader.readCostFileToArray(filepath);
    }

    /**
     * Retorna lista de custos de manutentação
     * @return
     */
    public ArrayList<Cost> getCostList() {
        return costList;
    }
}
