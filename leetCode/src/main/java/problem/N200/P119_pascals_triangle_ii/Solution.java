package problem.N200.P119_pascals_triangle_ii;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> listList = new ArrayList<List<Integer>>();

        ArrayList<Integer> integerList = new ArrayList<Integer>(1);
        integerList.add(1);
        listList.add(integerList);

        for(int i=1;i<=rowIndex;i++){

            List<Integer> integerMidList = new ArrayList<Integer>();
            integerMidList.add(1);
            for (int j=1;j<i;j++){
                List<Integer> integerPerList = listList.get(i-1);
                integerMidList.add(integerPerList.get(j-1)+integerPerList.get(j));
            }
            integerMidList.add(1);
            listList.add(integerMidList);
        }

        return listList.get(rowIndex);
    }

    @Test
    public void test(){

        List<Integer> row = getRow(3);

        for (Integer integer : row) {
            System.out.print(integer+" ");
        }
    }
}
