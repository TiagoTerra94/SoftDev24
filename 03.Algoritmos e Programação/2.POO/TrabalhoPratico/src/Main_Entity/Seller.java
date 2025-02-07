package Main_Entity;

import Items.Consumable;
import Items.ItemHero;

import java.util.ArrayList;

public class Seller {
    //Atributos de instancia
    protected int maxItems = 10;
    protected ArrayList<ItemHero> loja;

    //Metodo Construtor
    public Seller(int maxItems) {
        this.maxItems = maxItems;
        this.loja = new ArrayList<ItemHero>();
    }

    //Metodos de instancia
    /**
     * Mostrar 10 items random ao Heroi
     *
     */
    public void showCatalog(){
        System.out.println("******Catalog Item******");

        for (ItemHero item : this.loja){
            item.showStatus();
        }
    }

    /**
     * Método para comprar item
     * @param hero
     */
    public void buy(Hero hero){
        for(ItemHero item: loja) {
            if (hero.getGold()>=item.getPriceCoinGold()){
                if (item instanceof Consumable) {
                    hero.inventory.add((Consumable) item);
                }else if(hero.mainWeapon != null){
                    hero.mainWeapon = (Items.MainWeapon) item;
                }
            }else{
                System.out.println("Stop right there! You don't have enough gold!");
            }
        }
    }
}
