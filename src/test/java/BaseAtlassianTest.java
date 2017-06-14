import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BaseAtlassianTest {
    @Test
    public void solve() throws Exception {
        long input = 7792875;
        String expected = "atlassian";

        String result = BaseAtlassian.convert(input);

        assertEquals(expected, result);
    }
}
