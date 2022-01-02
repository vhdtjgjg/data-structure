package problem.N300.p268;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LostNumTest {

    @Test
    public void missingNumber() {

        LostNum lostNum = new LostNum();
        Assert.assertEquals(2,lostNum.missingNumber(new int[]{3,0,1}));
        Assert.assertEquals(2,lostNum.missingNumber(new int[]{0,1}));
        Assert.assertEquals(8,lostNum.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        Assert.assertEquals(1,lostNum.missingNumber(new int[]{0}));
        Assert.assertEquals(0,lostNum.missingNumber(new int[]{1,2,3}));
        Assert.assertEquals(0,lostNum.missingNumber(new int[]{1}));
    }
}