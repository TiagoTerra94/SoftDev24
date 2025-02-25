package Main_Entity;

import Items.CombatConsumable;
import Items.Consumable;
import Items.MainWeapon;
import Items.Potion;

import java.util.Scanner;

/**
 * Classe Feiticeiro
 */
public class Wizard extends Hero {
    static Scanner in = new Scanner(System.in);

    public Wizard(String name, int maxHealth, int currentHealth, int strength, int level, int gold, MainWeapon mainWeapon) {
        super(name, maxHealth, currentHealth, strength, level, gold, mainWeapon);
    }

    @Override
    public void attack(NPC npc) {
        int counter = 0;
        int op;
        int attack = this.mainWeapon.getAttack() + this.strength;

        do {
            //Turno do Heroi
            System.out.println("Choose an attack:\n" +
                    "1- Normal\n" +
                    "2- Special\n" +
                    "3- Combat Consumable");

            System.out.print("Opção: ");

            try {
                op = in.nextInt();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            //Normal Attack
            if(op==1){
                System.out.println(this.name + " used Normal Attack!" + "Attack Dmg: " + attack + "\uD83D\uDCA5");
                npc.currentHealth -= attack;
                npc.currentHP();
            }else if(op==2 && counter == 0){
                counter++;
                System.out.println(this.name + "used Special Attack!" + "Attack Dmg: " + this.mainWeapon.getSpecialAttack() + "\uD83D\uDCA5");
                npc.currentHealth -= this.mainWeapon.getSpecialAttack();
                npc.currentHP();
            }else{//Caso não conseguir
                System.out.println("Can't use that.");
            }

            //Item de Combate
            if(op==3){
                System.out.println("Consumable available:");
                for (Consumable item : this.inventory){
                    if(item instanceof CombatConsumable) {
                        System.out.println(++counter + ":");
                        item.showStatus();
                    }else{
                        System.out.println("No combat consumable not available");
                        return;
                    }
                }


                int option;
                do {
                    System.out.println("Which do you want to use?\n" +
                            "0- Back");

                    option = in.nextInt();

                    if (option == 0) break;

                    if (option < 1 && option > this.inventory.size()) {
                        System.out.println("Not available. Pick another: ");
                    } else {
                        // Consumir o item escolhido
                        if(inventory.get(option-1) instanceof CombatConsumable){
                            CombatConsumable selectedItem = (CombatConsumable) inventory.get(option - 1);
                            npc.currentHealth -= selectedItem.getInstaAttack();//checkar vida
                            this.inventory.remove(selectedItem);
                            System.out.println("You used " + selectedItem.getName() + "!");
                        }
                    }
                }while(option !=0);
            }

            //Turno NPC
            System.out.println("The enemy has attacked!" + "Attack Dmg: " + npc.strength + "\uD83D\uDCA5");
            System.out.print("Hero HP ❤\uFE0F");
            System.out.print(this.currentHealth -= npc.strength);
            System.out.print("/");
            System.out.println(this.maxHealth);


        }while(npc.currentHealth > 0 && this.currentHealth > 0);

        if (npc.currentHealth <= 0) {
            System.out.println("You won!");
            this.level ++;
            this.maxHealth += 10;
            this.strength += 1;
            this.gold += npc.gold;
            System.out.println("Player Level: " + this.level);
        }
    }


}

