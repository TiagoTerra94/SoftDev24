package Items;

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

}
