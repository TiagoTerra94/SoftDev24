import Items.*;
import Main_Entity.*;

import java.util.Scanner;

public class Game {
    //Classes de Personagem
    protected Knight knight;
    protected Wizard wizard;
    protected Archer archer;

    //Armas
    MainWeapon Sword = new MainWeapon("Blade Sword",60,15,22);
    MainWeapon Wand = new MainWeapon("Funil Wand",50,17,25);
    MainWeapon Bow = new MainWeapon("Simple Bow",53,20,27);

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

    /**
     * Metodo  para criar o ambiente de jogo
     * @param hero que vai jogar
     */
    public void hauntedCastle(Hero hero){
        //Instanciar 14 items para adicionar a uma instancia Seller
        Seller seller = new Seller();

        //Herois permitidos

        //Items
        Consumable potion = new Potion("Life Potion",10,5,0);
        Consumable upStrenght = new Potion("Up Strenght",10,0,5);
        CombatConsumable bombReckt = new CombatConsumable("Reckt Bomb",15,15);
        CombatConsumable megaBomb = new CombatConsumable("Mega Bomb",25,25);
        //Weapons
        MainWeapon sabugueiro = new MainWeapon("Sabugueiro",100,120,150);
        MainWeapon excalibur = new MainWeapon("Excalibur",110,120,160);
        MainWeapon besta = new MainWeapon("Besta",130,120,170);

        potion.addHero("Knight");
        upStrenght.addHero("Wizard");
        sabugueiro.addHero("Archer");

        //Main Story
        System.out.println("Welcome to the The Haunted Castle Game");
        System.out.println("Villager: - After a terrible monster attacked our city, our people has been terrified.\n" +
                "- Our beloved King tried to kill the beast to bring peace, but no luck...\n" +
                "- The beast imprisioned the King and every single knight who tried to beat him.\n" +
                "- I don't know what to do... Please help us.");

        System.out.println("To win the game, you have to beat the the beast and save the king.\n" +
                "Once you enter the Haunted Castle, you will pass each room by beating the beast's subordinates...\n" +
                "Be careful, some rooms have others surprises. Good luck!");




    }
}
