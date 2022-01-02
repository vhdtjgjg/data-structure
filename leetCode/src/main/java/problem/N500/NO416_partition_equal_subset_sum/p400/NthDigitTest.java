package problem.N500.NO416_partition_equal_subset_sum.p400;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthDigitTest {

    private final static NthDigit NTH_DIGIT=new NthDigit();

    @Test
    public void findNthDigit() {
        Assert.assertEquals(3,NTH_DIGIT.findNthDigit(3));
        Assert.assertEquals(0,NTH_DIGIT.findNthDigit(11));
        Assert.assertEquals(5,NTH_DIGIT.findNthDigit(100));
        Assert.assertEquals(1,NTH_DIGIT.findNthDigit(1000000000));
    }
}