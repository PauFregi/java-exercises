import org.junit.Test;

import static org.junit.Assert.*;

public class AppleAndOrangeTest {

    @Test
    public void noFruits() throws Exception {
        int[] apples = new int[]{};
        int appleA = 5;
        int houseS = 7;
        int houseT = 11;

        int expected = 0;

        int result = AppleAndOrange.countFruits(apples, appleA, houseS, houseT);

        assertEquals(expected, result);
    }

    @Test
    public void countFruits() throws Exception {
        int[] apples = new int[]{-2, 2, 1};
        int appleA = 5;
        int houseS = 7;
        int houseT = 11;

        int expected = 1;

        int result = AppleAndOrange.countFruits(apples, appleA, houseS, houseT);

        assertEquals(expected, result);
    }
}
