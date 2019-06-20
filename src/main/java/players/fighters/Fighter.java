package players.fighters;

import items.weapons.Weapon;
import players.Player;

public abstract class Fighter extends Player {

    private Weapon weapon;

    public Fighter (String name, int hp, int armourRating, Weapon weapon) {
        super(name, hp, armourRating);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
