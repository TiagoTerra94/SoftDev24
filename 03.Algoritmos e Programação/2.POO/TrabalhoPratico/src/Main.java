import Game.Game;
import Main_Entity.Hero;

/**
 * Classe da Main, onde corre o Jogo
 */
public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Hero hero = game1.createCharacter();
        //Inicio do jogo
        game1.hauntedCastle(hero);
    }

}