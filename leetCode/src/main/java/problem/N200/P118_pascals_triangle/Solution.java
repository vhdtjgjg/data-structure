package problem.N200.P118_pascals_triangle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> listList = new ArrayList<List<Integer>>();

        ArrayList<Integer> integerList = new ArrayList<Integer>(1);
        integerList.add(1);
        listList.add(integerList);

        for(int i=1;i<numRows;i++){

            List<Integer> integerMidList = new ArrayList<Integer>();
            integerMidList.add(1);
            for (int j=1;j<i;j++){
                List<Integer> integerPerList = listList.get(i-1);
                integerMidList.add(integerPerList.get(j-1)+integerPerList.get(j));
            }
            integerMidList.add(1);
            listList.add(integerMidList);
        }

        return listList;
    }

    @Test
    public void test(){

        List<List<Integer>> generate = generate(5);
        for (List<Integer> integers : generate) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }

    }
}
