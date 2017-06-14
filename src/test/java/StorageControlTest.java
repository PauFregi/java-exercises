import jdk.nashorn.internal.runtime.StoredScript;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StorageControlTest {
    @Test
    public void compute() throws Exception {
        String input = "PLPLPLPLPLPLPLPLPLPL";
        String expected = "A000000000";
        String result = StorageControl.compute(input);

        assertEquals(expected, result);
    }
}
