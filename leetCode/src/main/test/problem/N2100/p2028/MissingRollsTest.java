package problem.N2100.p2028;

import common.ArrayBuilder;
import common.ArrayUtils;
import org.junit.Test;

public class MissingRollsTest {

    @Test
    public void missingRolls() {
        int[] ints = new MissingRolls().missingRolls(ArrayBuilder.ofInt(3, 2, 4, 3), 4, 2);
        ArrayUtils.show(ints);
    }
}