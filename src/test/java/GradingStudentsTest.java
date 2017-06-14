import org.junit.Test;

import static org.junit.Assert.*;

public class GradingStudentsTest {
    @Test
    public void solve() throws Exception {
        int[] input = new int[]{73, 67, 38, 33};
        int[] expected = new int[]{75, 67, 40, 33};

        int[] result = GradingStudents.solve(input);

        assertArrayEquals(expected, result);
    }
}
