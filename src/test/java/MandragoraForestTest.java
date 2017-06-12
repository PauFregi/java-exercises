import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class MandragoraForestTest {

    @Test
    public void journey() throws Exception {
        long[] input = new long[]{3L, 2L, 2L};
        long maxHP = Arrays.stream(input).sum();

        long expected = 10;

        long result = MandragoraForest.journey(input, maxHP);

        assertEquals(expected, result);
    }
}