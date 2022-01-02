package problem.N200.P168_excel_sheet_column_title;

import org.junit.Test;

public class Solution {

    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();
        while (columnNumber>0){

            columnNumber--;

            result.append((char) columnNumber%26+'A');

            columnNumber=columnNumber/26;
        }

        return result.reverse().toString();
    }

    @Test
    public void test(){

        char c=89;
        System.out.println(convertToTitle(702));
    }
}
