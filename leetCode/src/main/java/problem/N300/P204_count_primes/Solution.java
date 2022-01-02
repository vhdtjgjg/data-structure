package problem.N300.P204_count_primes;

import org.junit.Test;

public class Solution {

    public int countPrimes(int n) {

        int count=0;
        for(int i=2;i<n;i++){

            if(isPrimeNum(i)){
                count++;
            }

        }

        return count;
    }

    private boolean isPrimeNum(int i) {

        for(int j=2;j<i/2+1;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){

        System.out.println(countPrimes(10));
    }
}
