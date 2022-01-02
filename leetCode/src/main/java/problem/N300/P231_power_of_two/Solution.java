package problem.N300.P231_power_of_two;

import org.junit.Test;

public class Solution {

    public boolean isPowerOfTwo(int n) {

        if(n==0){
            return false;
        }

        while (n>0){
            if(n%2!=0){
                if(n!=1){
                    return false;
                }

            }
            n=n/2;

        }

        return true;
    }

    @Test
    public void test(){

        boolean powerOfTwo = isPowerOfTwo(-16);
        System.out.println(powerOfTwo);
    }
}
