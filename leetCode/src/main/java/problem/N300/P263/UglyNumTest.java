package problem.N300.P263;


import org.junit.Assert;
import org.junit.Test;

public class UglyNumTest {

    @Test
    public void isUgly() {
        UglyNum uglyNum = new UglyNum();
        Assert.assertTrue(uglyNum.isUgly(6));
        Assert.assertTrue(uglyNum.isUgly(8));
        Assert.assertFalse(uglyNum.isUgly(14));
        Assert.assertTrue(uglyNum.isUgly(1));
    }
}