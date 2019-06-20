package players.fighters;

import items.weapons.Sword;

public class Knight extends Fighter{

    public Knight(String name, Sword sword) {
        super(name, 20, 20, 30, sword);
    }

    public int attack() {
        return this.getWeapon().getDmg();
    }
}
