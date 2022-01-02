package problem.N200.P190_reverse_bits;

import org.junit.Test;

public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        return Integer.reverse(n);
    }

    @Test
    public void test(){

        System.out.println(reverseBits(1001010101));
    }
}
