package Items;

public abstract class Consumable extends ItemHero {
    //Metodo Construtor
    public Consumable(String name, int priceCoinGold) {
        super(name, priceCoinGold);
    }

    //Metodo de Instancia
    public void showDetails(){
        System.out.println("******Consumable Item******");
        System.out.println("Name: " + name);
        System.out.println("Price: " + priceCoinGold);
    }



}
