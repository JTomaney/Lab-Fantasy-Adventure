package players;

public abstract class Player {

    private String name;
    private int hp;
    private int armourRating;

    public Player(String name, int hp, int armourRating) {
        this.name = name;
        this.hp = hp;
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
        this.hp -= mitigatedDmg;
    }
}
