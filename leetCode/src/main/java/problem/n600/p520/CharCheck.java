package problem.n600.p520;

public class CharCheck {

    public boolean detectCapitalUse(String word) {

        char[] chars = word.toCharArray();
        char aChar = chars[0];
        int start= isUpper(aChar) ?1:0;
        return isSame(chars,start);
    }

    private boolean isUpper(char aChar) {
        return aChar >= 'A' && aChar <= 'Z';
    }

    private boolean isSame(char[] chars, int start) {
        if(start>=chars.length){
            return true;
        }
        boolean upper = isUpper(chars[start]);
        for (int i = start+1; i < chars.length; i++) {
            if (upper) {
                if(!isUpper(chars[i])){
                    return false;
                }
            }else {
                if (isUpper(chars[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 'a' ^ 'a';
        System.out.println();
    }
}
