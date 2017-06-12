import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinMaxSumTest {
    @Test
    public void test() {
        int[] input = {254961783, 604179258, 462517083, 967304281, 860273491};
        long minExpected = 2181931615L;
        long maxExpected = 2894274113L;

        long min = MinMaxSum.minSum(input);
        long max = MinMaxSum.maxSum(input);

        assertEquals("min", minExpected, min);
        assertEquals("max", maxExpected, max);
    }
}