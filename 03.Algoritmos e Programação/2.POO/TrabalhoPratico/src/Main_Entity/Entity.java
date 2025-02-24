package Main_Entity;

public abstract class Entity {
    //Atributos de instancia
    protected String name;
    protected int maxHealth = 0;
    protected int currentHealth = 0;
    protected int strength;

    //Metodo Construtor
    public Entity(String name, int maxHealth, int currentHealth, int strength) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.strength = strength;
    }

    //Metodos de Acesso
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void exibirDetalhes() {
        System.out.println("*********Hero Status**********");
        System.out.println("Name: " + this.name);
        System.out.println("Max Health: " + this.maxHealth);
        System.out.println("Current Health: " + this.currentHealth);
        System.out.println("Strength: " + this.strength);
    }
}
