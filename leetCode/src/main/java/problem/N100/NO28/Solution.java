package problem.N100.NO28;

public class Solution {

    public static int strStr(String haystack, String needle) {

        if(needle==null||needle.length()==0){
            return 0;
        }

        if(haystack==null||haystack.length()==0){
            return -1;
        }



        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        String haystack="xieweic";
        String needle="mwei";

        System.out.println(strStr(haystack,needle));
    }
}
