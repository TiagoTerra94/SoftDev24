package Model;

import Domain.Attraction;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AttractionsRepository {
    private ArrayList<Attraction> atractionsList;

    //Metodo construtor
    public AttractionsRepository(String filepath) throws FileNotFoundException {
        this.atractionsList = CSVReader.readAttractionFileToArray(filepath);
    }

    /**
     * Retorna a lista de atrações
     * @return
     */
    public ArrayList<Attraction> getAtractionsList() {
        return atractionsList;
    }
}
