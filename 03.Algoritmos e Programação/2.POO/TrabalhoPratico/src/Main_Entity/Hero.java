package Main_Entity;

import Items.Consumable;
import Items.MainWeapon;
import Items.Potion;

import java.util.ArrayList;

public abstract class Hero extends Entity {
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

    /**
     * Metodo para usar Poção (curar/add força)
     */
    public void usePotion(){
        for(Consumable item: this.inventory){
            if (item instanceof Potion){
                item.showStatus();
            }
        }

        System.out.println("Which one do you want to use, Hero?");

    }

}
