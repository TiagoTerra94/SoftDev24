package Main_Entity;

import java.util.ArrayList;

public class Hero extends Entity {
    protected int level;
    protected int gold;
    protected mainWeapon(MainWeapon);
    protected ArrayList<Consumable> inventory;

    //Métodos de Acesso
    public int getGold() {
        return gold;
    }

    public abstract void attack(NPC npc) {

    }
}
