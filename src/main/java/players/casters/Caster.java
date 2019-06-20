package players.casters;

import behaviours.IAttack;
import familiars.Familiar;
import items.Spell;
import players.Player;

public abstract class Caster extends Player implements IAttack {

    private Spell spell;
    private Familiar familiar;

    public Caster(String name, int hp, int maxHp, int armourRating, Spell spell, Familiar familiar) {
        super(name, hp, maxHp, armourRating);
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

    public void takeDmg(int dmg) {
        dmg -= this.familiar.getDmgShare();
        int mitigatedDmg = dmg - this.getArmourRating();
        if (mitigatedDmg > 0){
            int newHp = this.getHp() - mitigatedDmg;
            this.setHp(newHp);
        }
    }
}
