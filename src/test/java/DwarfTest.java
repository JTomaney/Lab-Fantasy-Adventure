import items.weapons.Axe;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Axe axe;
    Axe greatAxe;
    Dwarf dwarf;

    @Before
    public void before() {
        axe = new Axe(8);
        greatAxe = new Axe(12);
        dwarf = new Dwarf("Balin", axe);
    }


    @Test
    public void getWeapon() {
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void setWeapon() {
        dwarf.setWeapon(greatAxe);
        assertEquals(greatAxe, dwarf.getWeapon());
    }

    @Test
    public void getName() {
        assertEquals("Balin", dwarf.getName());
    }

    @Test
    public void getHp() {
        assertEquals(30, dwarf.getHp());
    }

    @Test
    public void setHp() {
        dwarf.setHp(35);
        assertEquals(35, dwarf.getHp());
    }

    @Test
    public void getArmourRating() {
        assertEquals(30, dwarf.getArmourRating());
    }

    @Test
    public void setArmourRating() {
        dwarf.setArmourRating(40);
        assertEquals(40, dwarf.getArmourRating());
    }

    @Test
    public void takeDmg() {
        dwarf.takeDmg(50);
        assertEquals(10, dwarf.getHp());
    }
}
