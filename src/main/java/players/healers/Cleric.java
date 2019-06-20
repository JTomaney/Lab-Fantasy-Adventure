package players.healers;

import items.healingTools.HealingTool;
import items.healingTools.HolyRelic;

public class Cleric extends Healer {

    public Cleric(String name, HolyRelic holyRelic) {
        super(name, 15, 15, 10, holyRelic);
    }
}
