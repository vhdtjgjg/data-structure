package problem.N400.NO300_longest_increasing_subsequence;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        int max=0;

        for(int i=0;i<nums.length;i++){

            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }

            max=Math.max(dp[i],max);
        }

        return max;
    }

    @Test
    public void test(){

        int[] ints = {7,7,7,7,7,7};
        int i = lengthOfLIS(ints);
        System.out.println(i);
    }
}
