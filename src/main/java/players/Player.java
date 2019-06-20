package players;

import behaviours.IAttack;
import behaviours.ITakeDmg;

public abstract class Player implements ITakeDmg {

    private String name;
    private int hp;
    private int maxHp;
    private int armourRating;

    public Player(String name, int hp, int maxHp, int armourRating) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.armourRating = armourRating;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmourRating() {
        return armourRating;
    }

    public void setArmourRating(int armourRating) {
        this.armourRating = armourRating;
    }

    public void takeDmg(int dmg) {
        int mitigatedDmg = dmg - this.armourRating;
        if (mitigatedDmg > 0){
        this.hp -= mitigatedDmg;
        }
    }

    public int getMaxHp() {
        return this.maxHp;
    }
}
