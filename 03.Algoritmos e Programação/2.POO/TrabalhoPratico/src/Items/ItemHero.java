package Items;

import java.util.ArrayList;

public abstract class ItemHero {
    protected String name;
    protected int priceCoinGold;
    ArrayList<String> permitedHeroes;

    //Metodo de Acesso
    public int getPriceCoinGold() {
        return priceCoinGold;
    }

    protected void showStatus(){
        System.out.println("*******Item********");
        System.out.println("Name: " + name + " | Price: " + priceCoinGold + " | Heroes: " + permitedHeroes);
    }
}
