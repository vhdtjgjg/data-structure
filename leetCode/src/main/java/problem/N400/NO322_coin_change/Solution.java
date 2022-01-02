package problem.N400.NO322_coin_change;

import org.junit.Test;

public class Solution {

    public int coinChange(int[] coins, int amount) {

        int[] dp=new int[amount+1];

        for(int i=0;i<amount+1;i++){

            if(i!=0){
                dp[i]=amount+1;
            }

            for (int coin : coins) {

                if((i-coin)<0){
                    continue;
                }
                dp[i]=Math.min(dp[i],1+dp[i-coin]);
            }
        }

        return dp[amount]==amount+1?-1:dp[amount];
    }

    @Test
    public void test(){

        
    }

}
