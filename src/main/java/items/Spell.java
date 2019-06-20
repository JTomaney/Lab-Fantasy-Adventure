package items;

public class Spell {

    private String name;
    private int dmg;

    public Spell(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public int getDmg() {
        return dmg;
    }
}
