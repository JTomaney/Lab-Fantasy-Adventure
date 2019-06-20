package players.casters;

import familiars.Dragon;
import familiars.Familiar;
import familiars.Skeleton;
import items.Spell;
import players.Player;

public abstract class Caster extends Player {

    private Spell spell;
    private Familiar familiar;

    public Caster(String name, int hp, int armourRating, Spell spell, Familiar familiar) {
        super(name, hp, armourRating);
        this.spell = spell;
        this.familiar = familiar;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Familiar getFamiliar() {
        return this.familiar;
    }

    public  void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }
}
