package items.healingTools;

public abstract class HealingTool {

    private int healValue;

    public HealingTool(int healValue) {
        this.healValue = healValue;
    }

    public int getHealValue() {
        return healValue;
    }
}
