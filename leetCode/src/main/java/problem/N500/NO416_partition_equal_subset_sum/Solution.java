package problem.N500.NO416_partition_equal_subset_sum;

import org.junit.Test;

public class Solution {

    public boolean canPartition(int[] nums) {

        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }

        sum=sum/2;

        int length = nums.length;

        boolean[][] dp = new boolean[length+1][sum+1];

        for(int i=0;i<length;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<length+1;i++){

            for (int j=1;j<sum+1;j++){

                if(j<nums[i-1]){
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j]|dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[length][sum];
    }

    @Test
    public void test(){

        int[] ints = {1, 5, 11, 5};
        System.out.println(canPartition(ints));
    }
}
