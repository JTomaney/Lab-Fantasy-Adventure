package familiars;

public abstract class Familiar {

    private String name;
    private int dmgShare;

    public Familiar(String name, int dmgShare) {
        this.name = name;
        this.dmgShare = dmgShare;
    }

    public String getName() {
        return name;
    }

    public int getDmgShare() {
        return dmgShare;
    }
}
