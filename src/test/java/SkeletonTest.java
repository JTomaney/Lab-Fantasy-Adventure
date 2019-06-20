import familiars.Skeleton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkeletonTest {

    Skeleton skeleton;

    @Before
    public void before() {
        skeleton = new Skeleton("Dug");
    }

    @Test
    public void getName() {
        assertEquals("Dug", skeleton.getName());
    }

    @Test
    public void getDmgShare() {
        assertEquals(1, skeleton.getDmgShare());
    }
}
