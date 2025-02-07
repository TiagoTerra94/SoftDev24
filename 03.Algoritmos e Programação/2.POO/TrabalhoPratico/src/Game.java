import Items.MainWeapon;
import Main_Entity.*;

import java.util.Scanner;

public class Game {
    //Classes de Personagem
    protected Knight knight;
    protected Wizard wizard;
    protected Archer archer;

    //Armas
    MainWeapon Sword = new MainWeapon(40,60);
    MainWeapon Wand = new MainWeapon(35,70);
    MainWeapon Bow = new MainWeapon(55,80);

    //Metodo de Instancia
    static int difficulty;
    static Scanner in = new Scanner(System.in);

    /**
     * Criar Personagem
     */
    public Hero createCharacter(){
        Hero hero = null;
        System.out.println("A royal Knight stops you from enter the castle.\n " +
                "- Who are you, traveller?\n" +
                "I'm a...\n" +
                "1- Knight\n" +
                "2- Wizard\n" +
                "3- Archer");

        System.out.print("Choose wisely: ");
        int op = in.nextInt();

        if(op == 1){
            System.out.println("You choose Knight!");
            hero = knight = new Knight("default",0,0,0,0,0, Sword);
        }else if(op == 2){
            System.out.println("You choose Wizard!");
            hero = wizard = new Wizard("default",0,0,0,0,0, Wand);
        }else if(op == 3){
            System.out.println("You choose Archer!");
            hero = archer =  new Archer("default",0,0,0,0,0, Bow);
        }


        System.out.println("Difficulty: \n" +
                "1- Easy\n" +
                "2- Hard");

        System.out.print("Choose the difficulty:");
        difficulty = in.nextInt();

        distributePoints(hero);

        return hero;

    }

    /**
     * Metodo de distribuição de pontos de criação para a personagem
     * @param character que vai receber os pontos
     */
    public void distributePoints(Hero character){
        //1 de vida = 1 ponto criação
        //1 de força = 5 pontos criaçao
        int points = 0;

        if(difficulty == 1){
            points = 300;
            character.setGold(20);
        }

        if(difficulty == 2){
            points = 220;
            character.setGold(15);
        }

        System.out.println("Points available: " + points);
        System.out.println("Distribute the creation points to your Hero: ");
        System.out.print("Points of strength: ");
        int strenght = in.nextInt();

        //Validação caso o valor seja 0 ou maior que o permitido
        while(strenght > points || strenght == 0){
            System.out.println("Invalid value. Try again: ");
            strenght = in.nextInt();
        }

        character.setStrength(strenght);

        //Por casa 5 de criação, 1 de Força
        points -= strenght * 5;
        System.out.println("The " + points + " points available goes to your Max Health");
        character.setMaxHealth(points);

    }

    public void hauntedCastle(Hero hero){

    }
}
