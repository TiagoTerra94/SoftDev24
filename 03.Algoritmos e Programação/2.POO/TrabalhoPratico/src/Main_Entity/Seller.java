package Main_Entity;

import Items.ItemHero;

import java.util.ArrayList;

public class Seller {
    protected ArrayList<ItemHero> loja;

    public void showCatalog(){
        System.out.println("******Catalog Item******");


        for (ItemHero item : loja){
            System.out.println(item);
        }
    }

    public void buy(Hero hero){
        if(hero.getGold() >= this)
    }
}
