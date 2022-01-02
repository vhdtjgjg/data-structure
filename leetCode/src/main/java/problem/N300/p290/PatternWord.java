package problem.N300.p290;

import java.util.HashMap;
import java.util.Map;

public class PatternWord {

    public static boolean wordPattern(String pattern, String s) {

        String[] strings = s.split(" ");
        int length = strings.length;
        if(pattern.length()!= length){
            return false;
        }
        Map<Character, String> map = new HashMap<>(length / 3 * 2 + 1);
        for(int i=0;i<length;i++){
            char c = pattern.charAt(i);
            if(map.get(c)==null){
                String string = strings[i];
                if(map.containsValue(string)){
                    return false;
                }
                map.put(c, string);
                continue;
            }
            if(!map.get(c).equals(strings[i])){
                return false;
            }
        }

        return true;
    }
}
