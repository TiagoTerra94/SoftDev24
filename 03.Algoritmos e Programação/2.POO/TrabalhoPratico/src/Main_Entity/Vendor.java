package Main_Entity;

import Items.Consumable;
import Items.ItemHero;
import Items.MainWeapon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe do Vendedor
 */
public class Vendor {
    static Scanner in = new Scanner(System.in);
    //Atributos de instancia
    protected int MAX_ITEMS = 10;
    protected ArrayList<ItemHero> loja;

    //Metodo Construtor
    public Vendor() {
        this.loja = new ArrayList<ItemHero>();
    }

    //Metodos de Acesso
    public int getMAX_ITEMS() {
        return MAX_ITEMS;
    }

    public ArrayList<ItemHero> getLoja() {
        return loja;
    }

    //Metodos de instancia

    /**
     * Adiciona o item à loja
     *
     * @param item
     */
    public void addItem(ItemHero item) {
        this.loja.add(item);
    }

    /**
     * Mostrar 10 items random ao Heroi
     */
    public ArrayList<ItemHero> imprimirLoja() {
        System.out.println();
        System.out.println("*******Catalog Item******");
        System.out.println();
        ArrayList<ItemHero> bagSeller = new ArrayList<>();
        Random rnd = new Random();
        int counter = 1;

        //Adiciona 10 items aleatoriamente
        for (int i = 0; i < MAX_ITEMS; i++) {
            int random = rnd.nextInt(this.loja.size());

            //Busca um item aleatoriamente e se não estiver na loja adiciona
            if (!bagSeller.contains(this.loja.get(random))) {//rever
                bagSeller.add(this.loja.get(random));
                System.out.print("Item " + counter++ + " | ");
                this.loja.get(random).showStatus();
            } else {
                i--;
            }
        }
        return bagSeller;
    }

    /**
     * Método para imprimir a loja e vender ao Heroi
     *
     * @param hero
     */
    public void buy(Hero hero) {
        int option = -1;
        boolean validInput = false;

        System.out.println();
        System.out.println("Welcome, traveller, how can I help you?");
        ArrayList<ItemHero> bagSeller = imprimirLoja();
        System.out.println("What item do you want to buy?(1-10) | Your Gold: " + hero.getGold());
        System.out.println("0 - Leave");

        //Caso o input seja invalido, ele repete o ciclo
        while(!validInput) {
            try {
                System.out.print("Item Nº: ");
                option = in.nextInt();

                //Validaçao
                if (option < 0 || option > bagSeller.size()) {
                    System.out.println("Invalid option! Try again!");
                } else if (option == 0) {
                    System.out.println("I hope see you again, traveller!");
                    return;
                }else{
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option! Try again!");
                in.nextLine();
            }
        }

            //Busca o item escolhido
            ItemHero selectedItem = bagSeller.get(option - 1);

            String heroClass = "";
            if (hero instanceof Knight) {
                heroClass = "Knight";
            } else if (hero instanceof Archer) {
                heroClass = "Archer";
            } else if (hero instanceof Wizard) {
                heroClass = "Wizard";
            }

            //Inserir loop
            if (!selectedItem.getPermitedHeroes().contains(heroClass)) {
                System.out.println("This item cannot be used by your class!");
                return;
            }

            if (hero.getGold() >= selectedItem.getPriceCoinGold()) {
                if (selectedItem instanceof Consumable) {
                    hero.addToInventory((Consumable) selectedItem);
                    hero.gold -= selectedItem.getPriceCoinGold();
                    System.out.println("You bought: " + selectedItem.getName());
                } else if (selectedItem instanceof MainWeapon) {
                    hero.setMainWeapon((MainWeapon) selectedItem);
                    hero.gold -= selectedItem.getPriceCoinGold();
                    System.out.println("You bought: " + selectedItem.getName());
                }
            } else {
                System.out.println("Stop right there! You don't have enough gold!");
            }
    }

}
