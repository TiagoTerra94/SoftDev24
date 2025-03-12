public class Unit {
    private AttackStrategy attackStrategy;

    public Unit(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack(){
        attackStrategy.attack();
    }
}
