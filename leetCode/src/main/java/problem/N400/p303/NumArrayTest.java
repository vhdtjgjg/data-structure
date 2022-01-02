package problem.N400.p303;

import common.ArrayBuilder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumArrayTest {

    @Test
    public void sumRange() {


        NumArray obj = new NumArray(ArrayBuilder.of(-2, 0, 3, -5, 2, -1));
        Assert.assertEquals(1,obj.sumRange(0, 2));
    }

    @Test
    public void sumRangeV2() {


        NumArrayV2 obj = new NumArrayV2(ArrayBuilder.of(-2, 0, 3, -5, 2, -1));
        Assert.assertEquals(1,obj.sumRange(0, 2));
    }
}