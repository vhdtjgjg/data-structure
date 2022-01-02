package problem.N200.P171_excel_sheet_column_number;

import org.junit.Test;

public class Solution {

    public int titleToNumber(String columnTitle) {

        int sum=0;
        int j=1;
        for(int i=columnTitle.length()-1;i>=0;i--){


            char c = columnTitle.charAt(i);
            int i1 = c - 'A'+1;

            sum+=i1*j;
            j*=26;

        }

        return sum;
    }

    @Test
    public void test(){

        String s="ZY";
        System.out.println(titleToNumber(s));
    }
}
