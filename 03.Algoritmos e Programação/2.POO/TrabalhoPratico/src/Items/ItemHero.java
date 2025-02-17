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
     * Metodo para adicionar Herois à lista
     * @param hero nome do Heroi
     */
    public void addHero(String hero){
    this.permitedHeroes.add(hero);
    }

    /**
     * Mostrar detalhes dos items disponiveis
     */
    public void showStatus(){
        System.out.println("*******Item********");
        System.out.println("Name: " + name + " | Price: " + priceCoinGold + " | Heroes: " + permitedHeroes);
    }


    public abstract void use(Hero heroi);
}
