package Game;

import Items.*;
import Main_Entity.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe onde se ocorre o jogo
 */
public class Game {
    static Scanner sc = new Scanner(System.in);

    //Classes de Personagem Disponiveis
    protected Knight knight;
    protected Wizard wizard;
    protected Archer archer;

    //Armas Iniciais
    MainWeapon Sword = new MainWeapon("Blade Sword", 60, 15, 22);
    MainWeapon Wand = new MainWeapon("Funil Wand", 50, 17, 25);
    MainWeapon Bow = new MainWeapon("Simple Bow", 53, 20, 27);

    //Metodo de Instancia
    static int difficulty;
    static Scanner in = new Scanner(System.in);

    /**
     * Criar Personagem
     */
    public Hero createCharacter() {
        Hero hero = null;
        System.out.println("A royal Knight stops you from enter the castle.\n " +
                "- Who are you, traveller?\n" +
                "I'm a...\n" +
                "1- Knight\n" +
                "2- Wizard\n" +
                "3- Archer");

        System.out.print("Choose wisely: ");
        int op = in.nextInt();

        if (op == 1) {
            System.out.println("You choose Knight!");
            hero = knight = new Knight("default", 0, 0, 0, 0, 0, Sword);
        } else if (op == 2) {
            System.out.println("You choose Wizard!");
            hero = wizard = new Wizard("default", 0, 0, 0, 0, 0, Wand);
        } else if (op == 3) {
            System.out.println("You choose Archer!");
            hero = archer = new Archer("default", 0, 0, 0, 0, 0, Bow);
        }

        System.out.println("Difficulty: \n" +
                "1- Easy\n" +
                "2- Hard");

        System.out.print("Choose the difficulty:");
        difficulty = in.nextInt();

        System.out.println("What is your name, traveller?");
        in.nextLine();
        String name = in.nextLine();
        hero.setName(name);//new

        distributePoints(hero);

        return hero;

    }

    /**
     * Metodo de distribuição de pontos de criação para a personagem
     *
     * @param character que vai receber os pontos
     */
    public void distributePoints(Hero character) {
        //1 de vida = 1 ponto criação
        //1 de força = 5 pontos criaçao
        int points = 0;

        if (difficulty == 1) {
            points = 300;
            character.setGold(20);
        }

        if (difficulty == 2) {
            points = 220;
            character.setGold(15);
        }

        System.out.println("Points available: " + points);
        System.out.println("Distribute the creation points to your Hero: ");
        System.out.print("Points of strength: ");
        int strenght = in.nextInt();

        //Validação caso o valor seja 0 ou maior que o permitido
        while (strenght > points || strenght == 0) {
            System.out.println("Invalid value. Try again: ");
            strenght = in.nextInt();
        }

        character.setStrength(strenght);

        //Por casa 5 de criação, 1 de Força
        points -= strenght * 5;
        System.out.println("The " + points + " points available goes to your Max Health.");
        character.setMaxHealth(points);
        character.setCurrentHealth(points);

    }

    /**
     * Encontro do heroi com o vendedor
     * @param hero
     */
    public void sellerEncounter(Hero hero) {
        //Instanciar 14 items para adicionar a uma instancia Seller
        Vendor seller = new Vendor();

        //Herois permitidos

        //Items curaHp
        Consumable potion = new Potion("Life Potion", 10, 5, 0);
        potion.getPermitedHeroes().add("Knight");
        potion.getPermitedHeroes().add("Wizard");
        potion.getPermitedHeroes().add("Archer");

        Consumable knightPotion = new Potion("Dragon Life", 15, 10, 0);
        knightPotion.getPermitedHeroes().add("Knight");
        Consumable archerPotion = new Potion("Pointy Drink", 16, 12, 0);
        archerPotion.getPermitedHeroes().add("Archer");
        Consumable wizardPotion = new Potion("Druid Sip", 10, 8, 0);
        wizardPotion.getPermitedHeroes().add("Wizard");

        //Item aumento força
        Consumable upStrenght = new Potion("Up Strenght", 10, 0, 5);
        upStrenght.getPermitedHeroes().add("Knight");
        upStrenght.getPermitedHeroes().add("Archer");
        Consumable upMana = new Potion("Up Mana", 15, 0, 15);
        upMana.getPermitedHeroes().add("Wizard");
        Consumable upBow = new Potion("Up Bow", 14, 0, 18);
        upBow.getPermitedHeroes().add("Archer");

        //Items Combate
        CombatConsumable bombReckt = new CombatConsumable("Reckt Bomb", 15, 15);
        bombReckt.getPermitedHeroes().add("Knight");
        bombReckt.getPermitedHeroes().add("Archer");
        CombatConsumable megaBomb = new CombatConsumable("Mega Bomb", 25, 25);
        megaBomb.getPermitedHeroes().add("Knight");
        CombatConsumable setaPoison = new CombatConsumable("Venom Arrow", 20, 22);
        setaPoison.getPermitedHeroes().add("Archer");
        CombatConsumable cloudAcid = new CombatConsumable("Cloud Acid", 22, 25);
        cloudAcid.getPermitedHeroes().add("Wizard");

        //Weapons
        MainWeapon sabugueiro = new MainWeapon("Sabugueiro", 100, 120, 150);
        sabugueiro.getPermitedHeroes().add("Wizard");
        MainWeapon excalibur = new MainWeapon("Excalibur", 110, 120, 160);
        excalibur.getPermitedHeroes().add("Knight");
        MainWeapon besta = new MainWeapon("Besta", 130, 120, 170);
        besta.getPermitedHeroes().add("Archer");

        //adiciono objetos ao vendedor
        seller.addItem(potion);
        seller.addItem(knightPotion);
        seller.addItem(archerPotion);
        seller.addItem(wizardPotion);
        seller.addItem(upStrenght);
        seller.addItem(upMana);
        seller.addItem(upBow);
        seller.addItem(bombReckt);
        seller.addItem(megaBomb);
        seller.addItem(setaPoison);
        seller.addItem(cloudAcid);
        seller.addItem(sabugueiro);
        seller.addItem(excalibur);
        seller.addItem(besta);
        //Vendedor mostra catalogo
        seller.buy(hero);
    }

    /**
     * Metodo  para criar o ambiente de jogo
     *
     * @param hero que vai jogar
     */
    public void hauntedCastle(Hero hero) {
        int opcont = 0;
        //Hero baseHero = hero.clone();
        //baseHero.reviveHero(hero);


            //Main Story
            System.out.println("Welcome to the The Haunted Castle Game");
            System.out.println("Villager: - After a terrible monster attacked our city, our people has been terrified.\n" +
                    "- Our beloved King tried to kill the beast to bring peace, but no luck...\n" +
                    "- The beast imprisioned the King and every single knight who tried to beat him.\n" +
                    "- I don't know what to do... Please help us.");
            System.out.println();

            System.out.println("To win the game, you have to beat the the beast and save the king.\n" +
                    "Once you enter the Haunted Castle, you will pass each room by beating the beast's subordinates...\n" +
                    "Be careful, some rooms have others surprises. Good luck!");
            System.out.println();

            //Logo ao inicio temos o vendor
            System.out.println("You found a vendor, they will appear in your quest, you can buy an item from them\n" +
                    "Or you can leave and save money for later on. ");
            sellerEncounter(hero);
            System.out.println();

            //Dentro do Castelo
            System.out.println("You entered the Haunted Castle Game");
            System.out.println("There is a rusty door at your left and a cleaned door at your right. Which one do you choose?\n" +
                    "1- Rusty Door\n" +
                    "2- Cleaned Door");

            int option = sc.nextInt();

            //Caso jogador escolha a PRIMEIRA PORTA encontrará um chest
            if (option == 1) {
                chestRoom(hero);
                chanceEnemy(hero);
                hero.exibirDetalhes();
                checkPotion(hero);
                int doorAction;
                int counterRoom5 = 0;

                do {
                    //USAR AQUI FUNÇAO PARA O HEROI IR AO INVENTARIO OU CURAR-SE
                    System.out.println("As you walk towards the corridor, you heard the noise of bats... you start to shiver... ");
                    System.out.println("there is no source of light near you and the air");
                    System.out.println("seems thinner. You tap the walls, you can feel the coldness even with your gloves.");
                    System.out.println("Finally you touch a door, it seems the only way to go forward. But you felt something behind you and..." +
                            "There is someone there in the mid of the corridor..." +
                            "Should you open the door?\n" +
                            "1- Let's go!");
                    if(counterRoom5 == 0) {
                        System.out.println("2- Try to see who is there.");
                    }


                    doorAction = in.nextInt();

                    if (doorAction == 1) {
                        Room2(hero);
                        hero.exibirDetalhes();
                        checkPotion(hero);
                        System.out.println("You sense that you are very near to your final battle, no easy task until now.");
                        System.out.println("You found a person in the way, very terrified, it seems one of the knights of the King");
                        System.out.println("- Hey, you! Did you come to defeat the beast, I tried to help but I got cold feet and hide in a corner right when we entered... here you can have my money at least...");
                        System.out.println("I will stay here waiting for you when you beat that monster");
                        hero.setGold(+30);
                        System.out.println("You continue and found a breach in the wall and a door at your right, what is your next move?\n" +
                                "1- Sneak to the breach" +
                                "2- Open door");

                        in.nextLine();

                        doorAction = in.nextInt();

                        if (doorAction == 1) {
                            sellerEncounter(hero);
                            chanceEnemy(hero);
                            hero.exibirDetalhes();
                            checkPotion(hero);
                            System.out.println("You go back the room, the smell of blood is fresh and your next move is just to go ahead the door. ");
                            System.out.println("You only have one way to procceed, let's go traveller!");
                            System.out.println("There is a battle ahead, it's the final boss!");
                            Room3(hero);
                            return;//FIM
                        }
                        if (doorAction == 2) {
                            Room3(hero);
                            return;//FIM
                        }
                    }

                    if (doorAction == 2) {
                        counterRoom5++;
                        System.out.println("You follow a shadow and discovered a new corridor... something is not right... you are surprised by a man");
                        Room5(hero);
                        hero.exibirDetalhes();
                        checkPotion(hero);
                        System.out.println("You go back to the door and quickly opened it");
                    }
                }while(doorAction == 2);



            }


            //Caso o Jogador escolha a SEGUNDA PORTA
            if (option == 2) {
                System.out.println("There is a battle ahead, a enemy appeared!");
                Room1(hero);
                hero.exibirDetalhes();
                System.out.println("You never thought that behind that door was a terrible rat monster like that, even now you are frightened with such face, with those big eyes and that red fur all around it." +
                        "You try to forget that image as you continue to investigate the castle, you saw bodies of soldiers near a corridor as you walk... You see at the end of it a big door, maybe it's there that the King is imprisoned." +
                        "You are walking step by step, but you think there is no time to be cautious... you try walk faster towards the door and you you found stairs at your right... Should you go for the door or the stair?\n" +
                        "1- Big Door\n" +
                        "2- Stairs");

                int doorAction;
                doorAction = in.nextInt();
                if (doorAction == 1) {
                    hero.exibirDetalhes();
                    sellerEncounter(hero);
                    System.out.println("Seems that no one is here, the crown of the King was laying down in the throne. Hope that he is okay. We need to save him and the knights as well. Our kingdom relies on us right now." +
                            "You saw a tiny door with some cloth beside, maybe it's from the King... you must hurry!\n" +
                            "You climb a couple stairs, until you found... another monster");
                    Room4(hero);
                    hero.exibirDetalhes();
                    checkPotion(hero);
                    System.out.println("You are feeling the end is coming near, you heard noises behind a red door, some screams as well... you run towards it and suddenly you fell...\n" +
                            "You felt dizzy for a couple seconds, you take a look at the ceiling... there is a hole... now you have to search a way to get out of here\n" +
                            "It seems every door is blocked... you search for boxes to help you get at the ceiling until...");
                    Room6(hero);
                    hero.exibirDetalhes();
                    checkPotion(hero);
                    Room3(hero);//FIM

                }
                if (doorAction == 2) {
                    chestRoom(hero);
                    chanceEnemy(hero);
                    hero.exibirDetalhes();
                    Room3(hero);//FIM
                }
            }
    }

    private void checkPotion(Hero hero) {
        System.out.println("\nWould you like to use a potion?\n" +
                " 1 - Yes" +
                "\n 2-  No");
        try {
            int choice = sc.nextInt();
            if (choice == 1) {
                hero.use();
            }
        } catch (InputMismatchException e) {
            sc.nextLine();
        }
    }

    /**
     * Sala com um báu onde se encontrará um item aleatório
     */
    public void chestRoom(Hero hero) {
        ArrayList<ItemHero> foundItems = new ArrayList<>();
        //Items curaHp
        Consumable potion = new Potion("Life Potion", 10, 5, 0);
        potion.getPermitedHeroes().add("Knight");
        potion.getPermitedHeroes().add("Wizard");
        potion.getPermitedHeroes().add("Archer");
        foundItems.add(potion);

        Consumable knightPotion = new Potion("Dragon Life", 15, 10, 0);
        knightPotion.getPermitedHeroes().add("Knight");
        foundItems.add(knightPotion);
        Consumable archerPotion = new Potion("Pointy Drink", 16, 12, 0);
        archerPotion.getPermitedHeroes().add("Archer");
        foundItems.add(archerPotion);
        Consumable wizardPotion = new Potion("Druid Sip", 10, 8, 0);
        wizardPotion.getPermitedHeroes().add("Wizard");
        foundItems.add(wizardPotion);

        //Item aumento força
        Consumable upStrenght = new Potion("Up Strenght", 10, 0, 5);
        upStrenght.getPermitedHeroes().add("Knight");
        upStrenght.getPermitedHeroes().add("Archer");
        foundItems.add(upStrenght);
        Consumable upMana = new Potion("Up Mana", 15, 0, 15);
        upMana.getPermitedHeroes().add("Wizard");
        foundItems.add(upMana);
        Consumable upBow = new Potion("Up Bow", 14, 0, 18);
        upBow.getPermitedHeroes().add("Archer");
        foundItems.add(upBow);

        //Items Combate
        CombatConsumable bombReckt = new CombatConsumable("Reckt Bomb", 15, 15);
        bombReckt.getPermitedHeroes().add("Knight");
        bombReckt.getPermitedHeroes().add("Archer");
        foundItems.add(bombReckt);
        CombatConsumable megaBomb = new CombatConsumable("Mega Bomb", 25, 25);
        megaBomb.getPermitedHeroes().add("Knight");
        foundItems.add(megaBomb);
        CombatConsumable setaPoison = new CombatConsumable("Venom Arrow", 20, 22);
        setaPoison.getPermitedHeroes().add("Archer");
        foundItems.add(setaPoison);
        CombatConsumable cloudAcid = new CombatConsumable("Cloud Acid", 22, 25);
        cloudAcid.getPermitedHeroes().add("Wizard");
        foundItems.add(cloudAcid);


        System.out.println("There is a chest in the floor. No one is near of it.");
        try {
            File arquivo = new File("src/assets/chest.txt"); // Caminho do arquivo
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) { // Lê linha por linha
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close(); // Fechar o scanner após a leitura
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            e.printStackTrace();
        }

        System.out.println("Open chest?\n" +
                "1- Yes" +
                "2- No");
        int chestOpen = sc.nextInt();
        if (chestOpen == 1) {
            Random rnd = new Random();

            int foundItem = rnd.nextInt(foundItems.size());

            String heroClass = "";
            if (hero instanceof Knight) {
                heroClass = "Knight";
            } else if (hero instanceof Archer) {
                heroClass = "Archer";
            } else if (hero instanceof Wizard) {
                heroClass = "Wizard";
            }

            if (!foundItems.get(foundItem).getPermitedHeroes().contains(heroClass)) {
                System.out.println("Too Bad! Your hero can't use this. You toss " + foundItems.get(foundItem).getName() + " to the floor!");
                return;
            }

            //Checar busca inventario
            if (foundItems.get(foundItem) instanceof Consumable) {
                hero.addToInventory((Consumable) foundItems.get(foundItem));
                System.out.println("You got: " + foundItems.get(foundItem).getName());
            }

        }else if (chestOpen == 2) {
            System.out.println();
        }
    }


    /**
     * Primeira sala (Cleaned Room) onde o Heroi enfrenta o primeiro mob
     *
     * @param hero
     */
    public void Room1(Hero hero) {
        NPC DemiGod = new NPC("Demigod", 60, 60, 15, 10);
        DemiGod.showDetails();
        hero.attack(DemiGod);
    }

    /**
     * Sala a seguir do ChestRoom se o Heroi escolher a (RustyDoor)
     *
     * @param hero
     */
    public void Room2(Hero hero) {
        NPC MagicFox = new NPC("MagicFox", 60, 60, 12, 15);
        MagicFox.showDetails();
        hero.attack(MagicFox);

        System.out.println("You are sense that you are very near to your final battle, no easy task until now. You found...");//VAI PARA A SALA SELLER E OUTRA ROOM 3(FINAL BATTLE)
    }

    /**
     * Batalha Final do Heroi contra o Vitor Sanchez
     *
     * @param hero
     */
    public void Room3(Hero hero) {
        System.out.println("There is a battle ahead, it's the final boss!");
        NPC VitorSanchez = new NPC("VitorSanchez", 40, 50, 35, 35);
        VitorSanchez.showDetails();
        hero.attack(VitorSanchez);

        System.out.println("Congratulations! You saved the day!");
    }

    /**
     * Sala onde o Heroi encontrará o NPC Frodo
     *
     * @param hero
     */
    public void Room4(Hero hero) {
        NPC Frodo = new NPC("Corrupted Frodo", 55, 55, 40, 50);
        Frodo.showDetails();
        hero.attack(Frodo);
    }

    /**
     * Metodo para calhar aleatoriamente um novo inimigo
     * @param hero
     */
    public void chanceEnemy(Hero hero) {
        Random rnd = new Random();
        double random = rnd.nextDouble(0,100);

        if (random < 15){
            System.out.println("2 enemies appeared!");
            NPC mickey = new NPC("Mickey Mouse",100,100,50,80);
            mickey.showDetails();
            hero.attack(mickey);
            System.out.println();
            NPC monaLisa = new NPC("Mona Lisa", 80,80,45,69);
            monaLisa.showDetails();
            hero.attack(monaLisa);
        }else if (random >15 && random < 50){
            System.out.println("An enemy appeared!");
            NPC Snape = new NPC("Severus Snape",120,120,70,70);
            Snape.showDetails();
            hero.attack(Snape);
        }else if(random >50 && random < 75){
            System.out.println("An enemy appeared!");
            NPC stuartLittle = new NPC("Stuart Little",50,50,40,30);
            stuartLittle.showDetails();
            hero.attack(stuartLittle);
        }else{
            System.out.println("You were lucky! No one is here besides you!");
        }
    }

    /**
     * Metodo para surgir o Gollum como NPC
     * @param hero
     */
    public void Room5(Hero hero){
        System.out.println("-Hello stranger, do you want to see what I have in my bag?");
        System.out.println("-TELL ME! DO YOU?! I BET YOU WANT WHAT I HAVE! ADMIT IT!");
        System.out.println("-Depending on your awswer... I may have mercy... so...");
        System.out.println("-What is shine and gold? But doesn't belong to you? It's...");
        System.out.println("1- A coin\n" +
                "2- The Ring\n"+
                "3- A goldeen Teeth\n");

        int item = in.nextInt();

        if(item == 1){
            System.out.println("Oh.. ohh... funny boy...YOU SNITCH! GO AWAY!");
            System.out.println("Smeagol attacked 10DMG.");
            hero.setCurrentHealth(hero.getCurrentHealth() -10);
            System.out.println("I leave you for now");
        }else if(item == 2){
            System.out.println("I KNEW IT! I'M GONNA KILL YOU! IT'S MY PRECIOUSSSSSSS RINGGGG!");
            NPC Gollum = new NPC("Smeagol",100,100,40,40);
            hero.attack(Gollum);
        }else if(item == 3){
            System.out.println("GO AWAYYY!");
        }

    }

    /**
     * Metodo de jogo da Rifa, se calhar 6 ou 12, morres
     * @param hero
     */
    public void Room6(Hero hero){
        System.out.println("-Hello hello... someone is here to play with me today...");
        System.out.println("A big pidgeon appeared... so smelly... and very ugly...");
        System.out.println("-So big boy, let me ask you? Do you like rolling dice?");
        System.out.println("-Let's make this fun, shall we?");
        System.out.println("If you roll well, I'll let you go.. but if you lose... oh boy...");
        System.out.println("I'm in good mood today, I'll let you try 3 times.. if by chance you get a 6 or a 12...");
        System.out.println("Just pray to your gods, boy!");

        System.out.println("Roll Dice? (You have 3 tries)");
        Random random = new Random();

        int numRollDice = 0;
        System.out.println("-1....2....3... let's seee");
        while(numRollDice < 3) {
            int deathPenalty =  random.nextInt(13);
            if(deathPenalty == 6 || deathPenalty == 12){
                hero.setCurrentHealth(0);
                return;//FIM
            }
            numRollDice++;
        }

        System.out.println("You got Lucky!");
        System.out.println("Here, some help for your next battle");

        //New Weapon
        MainWeapon BeastSword = new MainWeapon("Blade Sword", 160, 65, 92);
        MainWeapon DrCane = new MainWeapon("DrCane", 150, 78, 115);
        MainWeapon LegolasBow = new MainWeapon("Simple Bow", 153, 120, 147);

        if(hero instanceof Knight){
            hero.setMainWeapon(BeastSword);
        }
        if(hero instanceof Wizard){
            hero.setMainWeapon(DrCane);
        }
        if (hero instanceof Archer){
            hero.setMainWeapon(LegolasBow);
        }

    }


    /*//REVER
    public void retryAgain(Hero hero){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to try again?\n" +
                "1 - Yes\n" +
                "2 - No");
        System.out.print("Choice: ");

        int choice = in.nextInt();

        if (choice == 1) {
            hauntedCastle(hero); // Reinicia o jogo sem criar um novo herói
        } else {
            System.out.println("Thanks for playing! See you next time.");
            System.exit(0); // Encerra o jogo
        }
    }*/


}
