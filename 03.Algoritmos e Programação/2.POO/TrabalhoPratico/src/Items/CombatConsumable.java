package Items;

import Main_Entity.Hero;

public class CombatConsumable extends Consumable {
    //Atributos de instancia
    protected int instaAttack;

    //Metodo Construtor
    public CombatConsumable(String name, int priceCoinGold, int instaAttack) {
        super(name, priceCoinGold);
        this.instaAttack = instaAttack;
    }

    /**
     * Retorna o dano o item
     * @return instaAttack
     */
    public int getInstaAttack() {
        return instaAttack;
    }

    //Metodos de instancia
    public void mostrarDetalhes(){
        System.out.println("*******Combat Consumable*******");
        System.out.println("Name: " + name);
        System.out.println("Price: " + priceCoinGold);
    }

    @Override
    public void use(Hero hero){
        System.out.println("You used " + this.name + "!");
        System.out.println("Caused DMG: " + this.instaAttack);
    }
}
