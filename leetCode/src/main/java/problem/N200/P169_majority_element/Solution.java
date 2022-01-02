package problem.N200.P169_majority_element;

import java.util.Arrays;

public class Solution {

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length-1];
    }
}
