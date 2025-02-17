package Main_Entity;

import Items.Consumable;
import Items.MainWeapon;
import Items.Potion;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Hero extends Entity {
    Scanner in = new Scanner(System.in);
    //Atributos de instancia
    protected int level;
    protected int gold;
    protected MainWeapon mainWeapon;
    protected ArrayList<Consumable> inventory;

    //Metodo Construtor
    public Hero(String name, int maxHealth, int currentHealth, int strength, int level, int gold, MainWeapon mainWeapon) {
        super(name, maxHealth, currentHealth, strength);
        this.level = level;
        this.gold = gold;
        this.mainWeapon = mainWeapon;
        this.inventory = new ArrayList<Consumable>();
    }

    //Métodos de Acesso
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    //Metodos de Instancia
    /**
     * Metodo para o Heroi atacar o npc
     * @param npc
     */
    public abstract void attack(NPC npc);

    public abstract void use(Hero hero);


}
