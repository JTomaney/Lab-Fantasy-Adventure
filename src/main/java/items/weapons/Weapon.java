package items.weapons;

public abstract class Weapon {

    private int dmg;

    public Weapon(int dmg) {
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }
}
