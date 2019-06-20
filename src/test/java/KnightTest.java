import items.weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Sword longsword;

    @Before
    public void before() {
        sword = new Sword(10);
        longsword = new Sword(12);
        knight = new Knight("Dunk", sword);
    }

    @Test
    public void getWeapon() {
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void setWeapon() {
        knight.setWeapon(longsword);
        assertEquals(longsword, knight.getWeapon());
    }

    @Test
    public void getName() {
        assertEquals("Dunk", knight.getName());
    }

    @Test
    public void getHp() {
        assertEquals(20, knight.getHp());
    }

    @Test
    public void setHp() {
        knight.setHp(18);
        assertEquals(18, knight.getHp());
    }

    @Test
    public void getArmourRating() {
        assertEquals(30, knight.getArmourRating());
    }

    @Test
    public void setArmourRating() {
        knight.setArmourRating(35);
        assertEquals(35, knight.getArmourRating());
    }

    @Test
    public void takeDmg() {
        knight.takeDmg(40);
        assertEquals(10, knight.getHp());
    }
}
