package Main_Entity;

public class NPC extends Entity {
    //Atributos de Instancia
    protected int gold;

    //Metodo Construtor
    public NPC(String name, int maxHealth, int currentHealth, int strength, int gold) {
        super(name, maxHealth, currentHealth, strength);
        this.gold = gold;
    }

    //Metodos de Acesso
    public int getGold() {
        return gold;
    }

}
