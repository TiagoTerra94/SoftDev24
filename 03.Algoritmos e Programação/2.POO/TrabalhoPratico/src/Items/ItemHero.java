package Items;

import Main_Entity.Entity;
import Main_Entity.Hero;

import java.util.ArrayList;

public abstract class ItemHero {
    protected String name;
    protected int priceCoinGold;
    protected ArrayList<String> permitedHeroes;

    //Metodo Construtor
    public ItemHero(String name, int priceCoinGold) {
        this.name = name;
        this.priceCoinGold = priceCoinGold;
        this.permitedHeroes = new ArrayList<String>();
    }

    //Metodo de Acesso
    public int getPriceCoinGold() {
        return priceCoinGold;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPermitedHeroes() {
        return permitedHeroes;
    }

    //Metodo de Instancia
    /**
     * Mostrar detalhes dos items disponiveis
     */
    public void showStatus(){
        System.out.println("Name: " + this.name + " | Price: " + this.priceCoinGold +  " \uD83D\uDCB0 | Hero: " + this.permitedHeroes);
    }

}
