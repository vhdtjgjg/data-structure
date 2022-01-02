package problem.N200.P172_factorial_trailing_zeroes;

import org.junit.Test;

public class Solution {

    public int trailingZeroes(int n) {

        int factor=1;
        int result = 0;

        while (n>factor){

            factor*=5;
            result+=n/factor;
        }


        return result;
    }

    @Test
    public void test(){

        System.out.println(trailingZeroes(30));
    }
}
