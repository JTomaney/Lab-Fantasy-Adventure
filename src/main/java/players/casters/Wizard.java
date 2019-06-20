package players.casters;

import familiars.Familiar;
import items.Spell;

public class Wizard extends Caster {
    public Wizard(String name, Spell spell, Familiar familiar) {
        super(name, 15, 15, 5, spell, familiar);
    }

    public int attack() {
        return this.getSpell().getDmg();
    }
}
