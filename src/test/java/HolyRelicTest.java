
import items.healingTools.HolyRelic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HolyRelicTest {

    HolyRelic holyRelic;

    @Before
    public void before() {
        holyRelic = new HolyRelic(5);
    }

    @Test
    public void canGetHealValue() {
        assertEquals(5, holyRelic.getHealValue());
    }
}
