package problem.N300.p242;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {

    public boolean isAnagramV2(String s, String t){
        int[] arr=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=s.length()-1;i>=0;i--){
            int sIndex = s.charAt(i) - 'a';
            int tIndex = t.charAt(i) - 'a';
            arr[sIndex]=arr[sIndex]-1;
            arr[tIndex]=arr[tIndex]+1;
        }
        for (int i : arr) {
            if(i==0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> sHashMap = getMap(s);
        Map<Character, Integer> tHashMap = getMap(t);
        Set<Map.Entry<Character, Integer>> entries = sHashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if(!tHashMap.containsKey(entry.getKey())){
                return false;
            }
            if(!tHashMap.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> getMap(String s) {
        Map<Character, Integer> map = new HashMap<>(s.length()*4/3);
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                continue;
            }
            Integer integer = map.get(s.charAt(i));
            integer++;
            map.put(s.charAt(i),integer);
        }
        return map;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("anagram", "nagaram"));
        System.out.println(anagram.isAnagramV2("anagram", "nagaram"));
        System.out.println(anagram.isAnagramV2("car", "cat"));
        System.out.println(anagram.isAnagram("anagram", "nagaam"));
        System.out.println(anagram.isAnagram("anagram", "sdfssdf"));
    }
}
