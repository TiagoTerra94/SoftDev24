package Main_Entity;

public abstract class Entity {
    protected String name;
    protected int maxHealth = 0;
    protected int currentHealth = 0;
    protected int strength;

    public void exibirDetalhes(){
        System.out.println("*********Hero Status**********");
        System.out.println("Name: " + this.name);
        System.out.println("Max Health: " + this.maxHealth);
        System.out.println("Current Health: " + this.currentHealth);
        System.out.println("Strength: " + this.strength);
    }
}
