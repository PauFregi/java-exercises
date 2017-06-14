import org.junit.Test;

import static org.junit.Assert.*;

public class KangarooTest {
    @Test
    public void yep() throws Exception {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        String expected = "YES";

        String result = Kangaroo.kangaroo(x1, v1, x2, v2);

        assertEquals(expected, result);
    }

    @Test
    public void nope() throws Exception {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        String expected = "NO";

        String result = Kangaroo.kangaroo(x1, v1, x2, v2);

        assertEquals(expected, result);
    }

    @Test
    public void yepRic() throws Exception {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        String expected = "YES";

        String result = Kangaroo.kangarooRic(x1, v1, x2, v2);

        assertEquals(expected, result);
    }

    @Test
    public void nopeRic() throws Exception {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        String expected = "NO";

        String result = Kangaroo.kangarooRic(x1, v1, x2, v2);

        assertEquals(expected, result);
    }

}