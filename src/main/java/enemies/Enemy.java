package enemies;

import behaviours.IAttack;
import behaviours.ITakeDmg;
import items.Loot;

public abstract class Enemy implements IAttack, ITakeDmg {

    private int hp;
    private int dmg;
    private Loot loot;

    public Enemy(int hp, int dmg, Loot loot) {
        this.hp = hp;
        this.dmg = dmg;
        this.loot = loot;
    }

    public int attack() {
        return this.dmg;
    }

    public void takeDmg(int dmg) {
        this.hp -= dmg;
    }


    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public Loot getLoot() {
        return loot;
    }
}
