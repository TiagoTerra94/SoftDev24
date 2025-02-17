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
    public void mostrarDetalhes(){
        System.out.println("*****Main Weapon*****");
        System.out.println("Name: " + name);
        System.out.println("Price: " + priceCoinGold);
        System.out.println("Attack " + attack);
        System.out.println("Special Attack " + specialAttack);
    }

    @Override
    public void use(Hero heroi) {

    }
}
