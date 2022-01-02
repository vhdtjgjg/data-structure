package problem.N200.P121_best_time_to_buy_and_sell_stock;

import org.junit.Test;

public class Solution {



    public int maxProfit(int[] prices) {

        int length = prices.length;


        int unHold=0;
        int hold=-prices[0];

        for(int i=1;i<length;i++){
            unHold=Math.max(unHold,hold+prices[i]);
            hold=Math.max(hold,-prices[i]);
        }

        return unHold;
    }

    public int maxProfit1(int[] prices){

        int length = prices.length;
        if(length<2){
            return 0;
        }

        int[][] dp = new int[length][2];

        dp[0][0]=0;
        dp[0][1]=-prices[0];

        for(int i=1;i<length;i++){

            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }

        return dp[length-1][0];
    }

    @Test
    public void test(){

        int[] ints = {7,1,5,3,6,4};
        System.out.println(maxProfit(ints));
        System.out.println(maxProfit1(ints));
    }
}
