package problem.N200.P136_single_number;

import org.junit.Test;

public class Solution {

    public int singleNumber(int[] nums) {

        int j=0;
        for(int i=0;i<nums.length;i++){

            j=j^nums[i];
        }

        return j;
    }

    @Test
    public void test(){

        int[] ints = {2,2,1};
        System.out.println(singleNumber(ints));
    }
}
