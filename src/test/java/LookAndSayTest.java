import org.junit.Test;

import static org.junit.Assert.*;

public class LookAndSayTest {
    @Test
    public void lookAndSayN() throws Exception {
        int n = 3;
        String start = "1";
        String expected = "1211";

        String result = LookAndSay.lookAndSay(n, start);

        assertEquals(expected, result);
    }
}
