import Main_Entity.Hero;
import Main_Entity.NPC;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Hero hero = game1.createCharacter();
        System.out.println("You have chosen: " + hero.getClass().getSimpleName());
    }

}