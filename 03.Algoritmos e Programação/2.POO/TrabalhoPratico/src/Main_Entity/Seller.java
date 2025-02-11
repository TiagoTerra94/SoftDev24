package Main_Entity;

import Items.Consumable;
import Items.ItemHero;
import Items.MainWeapon;

import java.util.ArrayList;
import java.util.Random;

public class Seller {
    //Atributos de instancia
    protected int MAX_ITEMS = 10;
    protected ArrayList<ItemHero> loja;

    //Metodo Construtor
    public Seller() {
        this.loja = new ArrayList<ItemHero>();
    }

    //Metodos de instancia

    /**
     * Adiciona o item à loja
     * @param item
     */
    public void addItem(ItemHero item){
        this.loja.add(item);
    }
    /**
     * Mostrar 10 items random ao Heroi
     *
     */
    public void showCatalog(){
        System.out.println("******Catalog Item******");

        //Adiciona 10 items aleatoriamente
        for (int i = 0; i < MAX_ITEMS; i++) {

            Random rnd = new Random();
            int random = rnd.nextInt(this.loja.size());

            //Busca um item aleatoriamente e se não estiver na loja adiciona
            if(!this.loja.contains(this.loja.get(random))){//rever
                this.loja.add(this.loja.get(random));
                this.loja.get(random).showStatus();
            }else{//caso já estiver na loja, volta um ciclo atrás e randomiza
                i--;
            }

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
                    hero.gold -= item.getPriceCoinGold();
                }else if(item instanceof MainWeapon){
                    hero.mainWeapon = (Items.MainWeapon) item;
                    hero.gold -= item.getPriceCoinGold();
                }
            }else{
                System.out.println("Stop right there! You don't have enough gold!");
            }
        }
    }
}
