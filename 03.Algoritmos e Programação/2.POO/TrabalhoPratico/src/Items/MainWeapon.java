package Items;

public class MainWeapon extends ItemHero {
    //Atributos de instancia
    protected int attack;
    protected int specialAttack;


    //Metodo de Acesso
    public int getAttack() {
        return attack;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    //Metodo construtor
    public MainWeapon(int attack, int specialAttack) {
        this.attack = attack;
        this.specialAttack = specialAttack;
    }

    //Metodo de Instancia

}
