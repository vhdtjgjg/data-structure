package problem.N300.P205_isomorphic_strings;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {

        int length = s.length();

        Map<Character, Character> map = new HashMap<Character, Character>();

        for(int j=0;j<length;j++){


            char sChar = s.charAt(j);
            char tChar = t.charAt(j);

            boolean b = map.containsKey(sChar);
            if(b){
                boolean equals = map.get(sChar).equals(tChar);
                if(!equals){
                    return false;
                }
                continue;
            }

            if(map.containsValue(tChar)){
                return false;
            }

            map.put(sChar, tChar);

        }

        return true;
    }

    @Test
    public void test(){

        String s="badc";
        String t="baba";

        boolean isomorphic = isIsomorphic(s, t);
        System.out.println(isomorphic);
    }
}
