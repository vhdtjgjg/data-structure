package problem.N200.P167_two_sum_ii_input_array_is_sorted;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int length = numbers.length;

        int i=0;
        int j=length-1;

        int sum;

        int[] ints = new int[2];

        while (i<j){

            sum=numbers[i]+numbers[j];

            if(sum<target){
                i++;
                continue;
            }

            if(sum>target){
                j--;
                continue;
            }
            ints[0]=i;
            ints[1]=j;
            return  ints;

        }

        return ints;
    }
}
