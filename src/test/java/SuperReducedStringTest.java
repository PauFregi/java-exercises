import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperReducedStringTest {

    @Test
    public void reduce() throws Exception {
        String input = "aaabccddd";

        String expected = "abd";

        String result = SuperReducedString.reduce(input);

        assertEquals(expected, result);
    }

    @Test
    public void emptyString() throws Exception {
        String input = "baab";

        String expected = "Empty String";

        String result = SuperReducedString.reduce(input);

        assertEquals(expected, result);
    }

}
