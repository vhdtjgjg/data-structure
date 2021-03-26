package dynamic;

public class MaxSubArray {

    public static int maxSubArray(int[] nums){

        int length = nums.length;
        int[] dp = new int[length];

        dp[0]=nums[0];

        int result=dp[0];

        for(int i=1;i<length;i++){
            dp[i]=Math.max(dp[i-1],0)+nums[i];
            result=Math.max(dp[i],result);
        }

        return result;
    }
}
