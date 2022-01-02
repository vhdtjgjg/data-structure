package problem.N400.p326;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfThreeTest {

    @Test
    public void isPowerOfThree() {

        assertTrue(PowerOfThree.isPowerOfThree(27));
        assertTrue(PowerOfThree.isPowerOfThree(9));
        assertFalse(PowerOfThree.isPowerOfThree(0));
        assertFalse(PowerOfThree.isPowerOfThree(45));

    }

    @Test
    public void isPowerOfThreeV2() {

        assertTrue(PowerOfThree.isPowerOfThreeV2(27));
        assertTrue(PowerOfThree.isPowerOfThreeV2(9));
        assertFalse(PowerOfThree.isPowerOfThreeV2(0));
        assertFalse(PowerOfThree.isPowerOfThreeV2(45));
        assertTrue(PowerOfThree.isPowerOfThreeV2(1162261467));

    }
}