package problem.N400.p303;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {

        int sum = 0;
        for (int i = left, length = nums.length; i < length && i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
