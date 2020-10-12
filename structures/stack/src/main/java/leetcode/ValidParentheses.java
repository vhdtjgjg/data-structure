package leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {

        String s="()";
        ValidParentheses validParentheses = new ValidParentheses();

        boolean valid = validParentheses.isValid(s);

        System.out.println(valid);
    }


    public boolean isValid(String s) {

        if(s==null||s.length()==0){
            return true;
        }

        Map<Character, Character> charMap = new HashMap<>();

        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');


        List<Character> characterList = new ArrayList<>();

        int size = 0;

        for(int i=0;i<s.length();i++){

            Character c = s.charAt(i);


            if(charMap.containsValue(c)){
                characterList.add(c);
            }

            if(charMap.containsKey(c)){
                if(size==0){
                    return false;
                }
                Character value = charMap.get(c);
                if(!characterList.get(size-1).equals(value)){
                    return false;
                }else {
                    characterList.remove(size-1);
                }
            }
            size = characterList.size();
        }
        if(size==0){
            return true;
        }else {
            return false;
        }

    }

    public boolean isValid1(String s) {

        if(s==null||s.length()==0){
            return true;
        }

        Map<Character, Character> charMap = new HashMap<>();



        List<Character> characterList = new ArrayList<>();
        int size = characterList.size();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);

            switch (c){
                case '(' : characterList.add(c);  break;
                case '[' : characterList.add(c);  break;
                case '{' : characterList.add(c);  break;

                case '}' :
                    if(size==0){
                        return false;
                    }

                    if(!characterList.get(size-1).equals('{')){
                        return false;
                    }else {
                        characterList.remove(size-1);
                        break;
                    }
                case ']' :
                    if(size==0){
                        return false;
                    }
                    if(!characterList.get(size-1).equals('[')){
                        return false;
                    }else {
                        characterList.remove(size-1);
                        break;
                    }
                case ')' :
                    if(size==0){
                        return false;
                    }
                    if(!characterList.get(size-1).equals('(')){
                        return false;
                    }else {
                        characterList.remove(size-1);
                        break;
                    }
            }
            size = characterList.size();
        }
        if(size==0){
            return true;
        }else {
            return false;
        }

    }
}
