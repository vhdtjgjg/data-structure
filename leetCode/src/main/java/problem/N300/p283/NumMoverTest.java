package problem.N300.p283;

import common.ArrayBuilder;
import common.ArrayUtils;
import org.junit.Test;

public class NumMoverTest {

    @Test
    public void moveZeroes() {
        NumMover numMover = new NumMover();
        int[] nums = ArrayBuilder.ofInt(0, 1, 0, 3, 12);
        numMover.moveZeroes(nums);
        ArrayUtils.show(nums);

    }

    @Test
    public void moveZeroesV2() {
        NumMover numMover = new NumMover();
        int[] nums = ArrayBuilder.ofInt(0, 1, 0, 3, 12);
        numMover.moveZeroesV2(nums);
        ArrayUtils.show(nums);

    }
}