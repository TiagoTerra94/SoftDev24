package Controllers;

import Domain.Attraction;
import Model.AttractionsRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerController {

    private AttractionsRepository atractionAvailable;

    public CustomerController() throws FileNotFoundException {
        this.atractionAvailable = new AttractionsRepository();
    }

    public ArrayList<Attraction> getAttraction(){
        ArrayList<Attraction> listAttractions = new ArrayList<>();

        for(Attraction currentAttraction: this.atractionAvailable.getAtractionsList()){
            listAttractions.add(currentAttraction);
        }

        return listAttractions;
    }
}
