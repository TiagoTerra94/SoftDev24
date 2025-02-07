package Main_Entity;

public class NPC extends Entity {
    //Metodo Construtor
    public NPC(String name, int maxHealth, int currentHealth, int strength, int gold) {
        super(name, maxHealth, currentHealth, strength);
        this.gold = gold;
    }

    //Metodos de Acesso


    public int getGold() {
        return gold;
    }

    //Atributos de instancia
    protected int gold;
}
