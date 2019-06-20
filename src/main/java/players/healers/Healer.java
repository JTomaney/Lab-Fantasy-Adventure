package players.healers;

import items.healingTools.HealingTool;
import players.Player;

public abstract class Healer extends Player {

    private HealingTool healingTool;

    public Healer(String name, int hp, int maxHp, int armourRating, HealingTool healingTool) {
        super(name, hp, maxHp, armourRating);
        this.healingTool = healingTool;
    }

    public void heal(Player player) {
        int heal = this.getHealingTool().getHealValue();
        int newHp = player.getHp() + heal;
        if (newHp > player.getMaxHp()) {
            newHp = player.getMaxHp();
        }
        player.setHp(newHp);
    }

    private HealingTool getHealingTool() {
        return this.healingTool;
    }
}
