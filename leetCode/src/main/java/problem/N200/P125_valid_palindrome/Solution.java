package problem.N200.P125_valid_palindrome;

import org.junit.Test;

public class Solution {

    public boolean isPalindrome(String s) {


        if(s==null||s.length()==0){
            return true;
        }

        s=s.toUpperCase();

        int length= s.length();



        for(int i=0;i<length;i++){

            char beforeChar = s.charAt(i);
            if(!Character.isLetterOrDigit(beforeChar)){
                continue;
            }
            char lastChar = s.charAt(length - 1);
            if(!Character.isLetterOrDigit(lastChar)){
                i--;
                length--;
                continue;
            }
            if(beforeChar==lastChar){
                length--;
            }else {
                return false;
            }

        }

        return true;
    }

    @Test
    public void test(){

        String s="0P";
        System.out.println(isPalindrome(s));
    }


}
