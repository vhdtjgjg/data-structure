package problem.N400.p345;

import java.util.ArrayList;
import java.util.List;

public class VowelReverser {

    private final static List<Character> VOWELS;

    static {
        VOWELS=new ArrayList<>();
        VOWELS.add('a');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('o');
        VOWELS.add('u');
        VOWELS.add('A');
        VOWELS.add('E');
        VOWELS.add('I');
        VOWELS.add('O');
        VOWELS.add('U');
    }

    public String reverseVowels(String s) {

        char[] ints = new char[s.length()];
        char[] chars = s.toCharArray();
        int index=0;

        for (char aChar : chars) {
            if(VOWELS.contains(aChar)){
                ints[index++]=aChar;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(VOWELS.contains(chars[i])){
                chars[i]= ints[--index];
            }
        }
        return String.valueOf(chars);
    }
    public String reverseVowelsV2Swap(String s) {


        char[] chars = s.toCharArray();
        int first=0;
        int last=chars.length-1;
        while (first<last){
            boolean firstContain = VOWELS.contains(chars[first]);
            boolean lastContain = VOWELS.contains(chars[last]);

            if(firstContain&&lastContain){
                swap(chars,first,last);
                first++;
                last--;
            }
            if (!firstContain){
                first++;
            }
            if(!lastContain){
                last--;
            }
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int first, int last) {
        char temp = chars[first];
        chars[first]=chars[last];
        chars[last]=temp;
    }
}
