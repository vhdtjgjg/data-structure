package problem.n600.p557;

public class ReverseString {

    public String reverseWords(String s) {

        char[] chars = s.toCharArray();

        int i=0;

        while (i< chars.length){
            int end = s.indexOf(' ', i);
            if(end==-1){
                end=chars.length-1;
            }else {
                end-=1;
            }
            reverse(chars,i,end);
            if(end==chars.length-1){
                break;
            }
            i=end+2;
        }

        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start<end){
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
    }
}
