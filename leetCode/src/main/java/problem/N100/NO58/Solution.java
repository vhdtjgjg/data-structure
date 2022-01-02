package problem.N100.NO58;

import java.sql.SQLOutput;

/**
 * @Author: Xie
 * @Date: 2020/12/8 14:56
 */
public class Solution {

    public static void main(String[] args) {
        String s=" ";
        System.out.println(lengthOfLastWord2(s));
    }

    public static int lengthOfLastWord(String s) {

        if(s==null||s.length()==0){
            return 0;
        }

        s=s.trim();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '||i==0){
                if(i==0){
                    return s.length()-i;
                }
                return s.length()-i-1;
            }
        }

        return 0;
    }

    public static int lengthOfLastWord2(String s) {

        if(s==null||s.length()==0){
            return 0;
        }

        String[] s1 = s.split(" ");

        if(s1.length==0){
            return 0;
        }

        return s1[s1.length-1].length();
    }
}
