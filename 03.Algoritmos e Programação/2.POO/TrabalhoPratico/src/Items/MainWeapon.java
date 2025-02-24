package Items;

import Main_Entity.Hero;

import java.util.ArrayList;

public class MainWeapon extends ItemHero {
    //Atributos de instancia
    protected int attack;
    protected int specialAttack;

    //Metodo construtor
    public MainWeapon(String name, int priceCoinGold, int attack, int specialAttack) {
        super(name, priceCoinGold);
        this.attack = attack;
        this.specialAttack = specialAttack;
    }

    //Metodo de Acesso

    public int getAttack() {
        return attack;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }


    //Metodo de Instancia
    public void showStatus(){
        System.out.println("Name: " + name + " | Price: " + priceCoinGold + "\uD83D\uDCB0  | Attack " + attack + "\uD83D\uDDE1\uFE0F | Special Attack " + specialAttack + "\uD83D\uDCA5 | Hero: " + permitedHeroes);

    }

}
