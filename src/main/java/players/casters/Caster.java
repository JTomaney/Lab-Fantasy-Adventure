package players.casters;

import items.Spell;
import players.Player;

public abstract class Caster extends Player {

    public Caster(String name, int hp, int armourRating, Spell spell) {
        super(name, hp, armourRating);
    }
}
