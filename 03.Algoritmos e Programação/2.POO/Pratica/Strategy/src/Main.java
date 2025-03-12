public class Main {
    public static void main(String[] args) {
        Unit meeleUnit = new Unit(new MeeleAttackStrategy());
        meeleUnit.performAttack();

        Unit rangedUnit = new Unit(new RangedAttackStrategy());
        rangedUnit.performAttack();

        Unit magicUnit = new Unit(new MagicAttackStrategy());
        magicUnit.performAttack();
    }
}