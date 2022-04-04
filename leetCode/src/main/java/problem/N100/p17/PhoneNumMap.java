package problem.N100.p17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumMap {

    private static final Map<Character, String> DIGIT_MAP;

    private final List<String> result=new ArrayList<>();

    static {
        DIGIT_MAP = new HashMap<>();
        DIGIT_MAP.put('2', "abc");
        DIGIT_MAP.put('3', "def");
        DIGIT_MAP.put('4', "ghi");
        DIGIT_MAP.put('5', "jkl");
        DIGIT_MAP.put('6', "mno");
        DIGIT_MAP.put('7', "pqrs");
        DIGIT_MAP.put('8', "tuv");
        DIGIT_MAP.put('9', "xwyz");

    }

    public List<String> letterCombinations(String digits) {

        result.clear();
        if (digits.length() == 0) {
            return result;
        }
        letterCombinations(digits,new StringBuilder());
        return result;
    }

    private void letterCombinations(String digits, StringBuilder combination) {

        int index = combination.length();
        if(digits.length()==index){
            result.add(combination.toString());
            return;
        }
        char c = digits.charAt(index);
        String s = DIGIT_MAP.get(c);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            combination.append(aChar);
            letterCombinations(digits, combination);
            combination.deleteCharAt(index);
        }
    }
}
