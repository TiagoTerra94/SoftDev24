package Items;

import Main_Entity.Hero;

/**
 * Classe das Poções
 */
public class Potion extends Consumable {
    //Atributos de instancia
    protected int cureHp;
    protected int upStrength;

    //Metodo Construtor
    public Potion(String name, int priceCoinGold, int cureHp, int upStrength) {
        super(name, priceCoinGold);
        this.cureHp = cureHp;
        this.upStrength = upStrength;
    }

    //Metodo de Acesso
    public int getCureHp() {
        return cureHp;
    }

    public int getUpStrength() {
        return upStrength;
    }

    //Metodos de instancia

    /**
     * Mostra os detalhes da Poção
     */
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + priceCoinGold);
        if (cureHp > 0) {
            System.out.println("Cure hp: " + cureHp);
        }
        if (upStrength > 0) {
            System.out.println("Up strength: " + upStrength);
        }
        System.out.println("Hero Permitted: " + permitedHeroes);//rever
    }

}
