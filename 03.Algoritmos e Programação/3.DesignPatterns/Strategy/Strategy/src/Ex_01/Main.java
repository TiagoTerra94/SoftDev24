package Ex_01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Unit vitor = new Unit("Vitor",100,100,new MagicAttackStrategy());

        vitor.performAttack();

        vitor.setSelectedAttackStrategy(new RangedAttackStrategy());
        vitor.performAttack();
    }
}