package players.fighters;

import behaviours.IAttack;
import items.weapons.Weapon;
import players.Player;

public abstract class Fighter extends Player implements IAttack {

    private Weapon weapon;

    public Fighter (String name, int hp, int maxHp, int armourRating, Weapon weapon) {
        super(name, hp, maxHp, armourRating);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
