package Model;

import Domain.Attraction;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AttractionsRepository {
    private ArrayList<Attraction> atractionsList;

    //Metodo construtor
    public AttractionsRepository() throws FileNotFoundException {
        this.atractionsList = CSVReader.readAttractionFileToArray("src/Files/Cesaeland_atracoes.csv");
    }

    /**
     * Retorna a lista de atrações
     * @return
     */
    public ArrayList<Attraction> getAtractionsList() {
        return atractionsList;
    }
}
