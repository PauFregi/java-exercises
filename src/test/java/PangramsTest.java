import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PangramsTest {

    @Test
    public void pangrams() throws Exception {
        String input = "We promptly judged antique ivory buckles for the next prize";
        String expected  = "pangram";

        String result = Pangrams.pangram(input);

        assertEquals(expected, result);
    }

    @Test
    public void noPangrams() throws Exception {
        String input = "We promptly judged antique ivory buckles for the prize";
        String expected  = "not pangram";

        String result = Pangrams.pangram(input);

        assertEquals(expected, result);
    }

}