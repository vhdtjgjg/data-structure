package problem.N100.NO67;

import org.junit.Test;

/**
 * @Author: Xie
 * @Date: 2020/12/9 15:22
 */
public class Solution {

    public static void main(String[] args) {
        String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {

        return Integer.toBinaryString(
                Integer.parseInt(a,2)+Integer.parseInt(b,2)
        );
    }

    @Test
    public void test(){
        int i = '9' - '7';
        String i1 = (char)(1 + '0')+"";
        System.out.println(i1);
    }

}
