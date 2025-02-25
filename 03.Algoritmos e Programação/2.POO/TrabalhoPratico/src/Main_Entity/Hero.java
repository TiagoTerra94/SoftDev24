package Main_Entity;

import Items.Consumable;
import Items.MainWeapon;
import Items.Potion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Heroi
 */
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
    public MainWeapon getMainWeapon() {
        return mainWeapon;
    }
    public ArrayList<Consumable> getInventory() {
        return inventory;
    }
    public void setMainWeapon(MainWeapon mainWeapon) {
        this.mainWeapon = mainWeapon;
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

    public void use(){
        ArrayList<Consumable> potions = new ArrayList<>();
        System.out.println("****************");
        System.out.println("\n\uD83E\uDDEAAvailable Potions:");

        // Find all potions in inventory
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) instanceof Potion) {
                potions.add(inventory.get(i));
                System.out.println((potions.size()) + ". " + inventory.get(i).getName());
            }
        }

        if (potions.isEmpty()) {
            System.out.println("No potions available!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select potion to use (0 to cancel): ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= potions.size()) {
            Potion selectedPotion = (Potion) potions.get(choice - 1);

            //Calcula o heal
            int currentHp = this.getCurrentHealth();
            int maxHp = this.getMaxHealth();
            int healAmount = selectedPotion.getCureHp();
            int excess = 0;

            if (currentHp + healAmount > maxHp) {
                excess = (currentHp + healAmount) - maxHp;
                healAmount = maxHp - currentHp;
            }

            // Se a cura exceder a vida maxima, o utilizador é avisado se quer usar
            if (excess > 0) {
                System.out.println("Warning: " + excess + " HP will be wasted. Continue? (1: Yes, 2: No)");
                int confirm = scanner.nextInt();
                if (confirm != 1) {
                    return;
                }
            }

            // Aplica efeito da poção
            this.setCurrentHealth(currentHp + healAmount);
            this.setStrength(this.getStrength() + selectedPotion.getUpStrength());

            System.out.println("Used " + selectedPotion.getName() + "!");
            System.out.println("Healed " + healAmount + " HP!");
            if (selectedPotion.getUpStrength() > 0) {
                System.out.println("Gained " + selectedPotion.getUpStrength() + " Strength!");
            }

            //Remove a poção do inventário
            inventory.remove(selectedPotion);
            System.out.println("****************");
        }

    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Level: " + this.level + "\uD83C\uDF1F\n" +
                "Gold: " + this.gold + "\uD83D\uDFE1\n" +
                "Main Weapon: " + this.mainWeapon.getName() + "\uD83D\uDDE1\uFE0F");
    }

    public void addToInventory(Consumable item) {
        inventory.add(item);
    }

}
