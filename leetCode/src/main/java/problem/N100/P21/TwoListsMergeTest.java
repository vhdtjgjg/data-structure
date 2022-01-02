package problem.N100.P21;

import common.ListNodeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class TwoListsMergeTest {

    @Test
    public void mergeTwoListsV2() {

        ListNodeUtils.show(TwoListsMerge.mergeTwoListsV2(ListNodeUtils.of(1, 2, 4), ListNodeUtils.of(1, 3, 4)));
        ListNodeUtils.show(TwoListsMerge.mergeTwoListsV2(ListNodeUtils.of(), ListNodeUtils.of()));
        ListNodeUtils.show(TwoListsMerge.mergeTwoListsV2(ListNodeUtils.of(), ListNodeUtils.of(0)));
    }

    @Test
    public void mergeTwoListsV3Recursion() {

        Assert.assertEquals(ListNodeUtils.of(1, 1, 2, 3, 4, 4), TwoListsMerge.mergeTwoListsV3Recursion(ListNodeUtils.of(1, 2, 4), ListNodeUtils.of(1, 3, 4)));
        Assert.assertEquals(ListNodeUtils.of(), TwoListsMerge.mergeTwoListsV3Recursion(ListNodeUtils.of(), ListNodeUtils.of()));
        Assert.assertEquals(ListNodeUtils.of(0), TwoListsMerge.mergeTwoListsV3Recursion(ListNodeUtils.of(), ListNodeUtils.of(0)));
    }

    @Test
    public void mergeTwoListsV4Recursion() {

        Assert.assertEquals(ListNodeUtils.of(1, 1, 2, 3, 4, 4), TwoListsMerge.mergeTwoListsV4Iteration(ListNodeUtils.of(1, 2, 4), ListNodeUtils.of(1, 3, 4)));
        Assert.assertEquals(ListNodeUtils.of(), TwoListsMerge.mergeTwoListsV4Iteration(ListNodeUtils.of(), ListNodeUtils.of()));
        Assert.assertEquals(ListNodeUtils.of(0), TwoListsMerge.mergeTwoListsV4Iteration(ListNodeUtils.of(), ListNodeUtils.of(0)));
    }

    @Test
    public void name() {
        boolean equals = Objects.equals(null, null);
        System.out.println(equals);
    }
}