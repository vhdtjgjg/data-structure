package problem.NO38;

public class Solution {

    public static String countAndSay(int n) {

        StringBuffer pre ;
        StringBuffer cur = new StringBuffer("1");



        for(int i=1;i<n;i++ ){

            int start =0;
            int end=0;

            pre=cur;
            cur=new StringBuffer();




            while (end<pre.length()){
                while (end<pre.length()&&pre.charAt(start)==pre.charAt(end)){
                    end++;
                }
                cur.append(end-start).append(pre.charAt(start));
                start=end;
            }




        }

        return cur.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

}
