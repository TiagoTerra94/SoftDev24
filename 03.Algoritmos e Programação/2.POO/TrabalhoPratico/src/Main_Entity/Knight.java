package Main_Entity;

import Items.Consumable;
import Items.MainWeapon;
import Items.Potion;

import java.util.Scanner;

public class Knight extends Hero {
    static Scanner in = new Scanner(System.in);

    //Metodo Construtor
    public Knight(String name, int maxHealth, int currentHealth, int strength, int level, int gold, MainWeapon mainWeapon) {
        super(name, maxHealth, currentHealth, strength, level, gold, mainWeapon);
    }


    @Override
    public void attack(NPC npc) {
        double shield = npc.strength * 0.8;
        int attack = this.mainWeapon.getAttack() + this.strength;
        int counter = 0;
        int op;

        do {
            //Turno do NPC
            System.out.println("The enemy has attacked!" + "DMG: " + shield);
            this.currentHealth -= (int) (npc.strength - shield);

            this.exibirDetalhes();

            //Turno do Heroi
            System.out.println("Choose an attack:\n" +
                    "1- Normal\n" +
                    "2- Special\n" +
                    "3- Combat Consumable");

            System.out.println("Opção: ");

            try {
                op = in.nextInt();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            if (op == 1) {
                System.out.println(this.name + "used Normal Attack!" + "DMG: " + attack);
                npc.currentHealth -= attack;
                npc.currentHP();
            }
            if (op == 2 && counter == 0) {
                counter++;
                System.out.println(this.name + "used Special Attack!" + "DMG: " + this.mainWeapon.getSpecialAttack());
                npc.currentHealth -= this.mainWeapon.getSpecialAttack();
                npc.currentHP();
            } else {
                System.out.println("Can't use that.");
            }
            if (op == 3) {
                for (Consumable item : this.inventory) {
                    item.showStatus();
                }

                int option;
                do {
                    System.out.println("Which do you want to use?\n" +
                            "0- Back");
                    option = in.nextInt();
                    if (option == 0) break;
                    while (!this.inventory.contains(option)) {//rever
                        System.out.print("Not available. Pick another: ");
                        option = in.nextInt();
                    }
                } while (option != 0);
            }
        } while (npc.currentHealth > 0 && this.currentHealth > 0);


        if (npc.currentHealth <= 0) {
            System.out.println("You won!");
            this.level ++;
            this.maxHealth += 10;
            this.strength += 1;
            this.gold += npc.gold;
            System.out.println("Player Level: " + this.level);
        } else {
            System.out.println("Game Over! You lost!");
        }
    }

    @Override
    public void use(Hero hero) {
        for(Consumable item: this.inventory){
            if (item instanceof Potion){
                item.showStatus();
            }
        }

        if(this.inventory.isEmpty()){
            System.out.println("No potions available");
        }else{
            System.out.println("Which one do you want to use, Hero?");

            int op = in.nextInt();

            for(int i = 0; i < this.inventory.size(); i++){
                if(i+1 == op ){
                    System.out.println("You used: " + this.inventory.get(i).getName());
                    this.inventory.remove(i);
                    System.out.println("Status applied: " + this.inventory.get(i).getName());
                }
            }

        }
    }


}
