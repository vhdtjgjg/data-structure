package problem.N300.P202_happy_number;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {

        Set<Integer> integerSet = new HashSet<Integer>();

        while (true) {

            int sum=0;
            while (n>0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            if(sum==1){
                return true;
            }
            if(!integerSet.add(sum)){
                return false;
            }
            n=sum;


        }

    }

    @Test
    public void test(){

        System.out.println(isHappy(190));
    }

}
