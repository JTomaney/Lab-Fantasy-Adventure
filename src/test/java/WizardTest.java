import familiars.Dragon;
import familiars.Familiar;
import familiars.Skeleton;
import items.Spell;
import org.junit.Before;
import org.junit.Test;
import players.casters.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Spell spell1;
    Spell spell2;
    Skeleton skeleton;
    Dragon dragon;
    Wizard wizard;

    @Before
    public void before() {
        spell1 = new Spell("The Burning Head", 16);
        spell2 = new Spell("The Leg Snapper", 12);
        skeleton = new Skeleton("Dug");
        dragon = new Dragon("Parthunaax");
        wizard = new Wizard("Rincewind", spell1, skeleton);
    }


    @Test
    public void getSpell() {
        assertEquals(spell1, wizard.getSpell());
    }

    @Test
    public void setSpell() {
        wizard.setSpell(spell2);
        assertEquals(spell2, wizard.getSpell());
    }

    @Test
    public void getName() {
        assertEquals("Rincewind", wizard.getName());
    }

    @Test
    public void getHp() {
        assertEquals(15, wizard.getHp());
    }

    @Test
    public void setHp() {
        wizard.setHp(16);
        assertEquals(16, wizard.getHp());
    }

    @Test
    public void getArmourRating() {
        assertEquals(5, wizard.getArmourRating());
    }

    @Test
    public void setArmourRating() {
        wizard.setArmourRating(7);
        assertEquals(7, wizard.getArmourRating());
    }

    @Test
    public void canGetFamiliar() {
        assertEquals(skeleton, wizard.getFamiliar());
    }

    @Test
    public void canSetFamiliar() {
        wizard.setFamiliar(dragon);
        assertEquals(dragon, wizard.getFamiliar());
    }

    @Test
    public void takeDmg() {
        wizard.takeDmg(10);
        assertEquals(10, wizard.getHp());
    }
}
