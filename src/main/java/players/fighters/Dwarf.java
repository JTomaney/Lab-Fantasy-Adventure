package players.fighters;

import items.weapons.Axe;

public class Dwarf extends Fighter{

    public Dwarf(String name, Axe axe) {
        super (name, 30, 30, 30, axe);
    }

    public int attack() {
        return this.getWeapon().getDmg();
    }
}
