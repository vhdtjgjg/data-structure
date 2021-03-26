package problem.NO27;

import java.util.Arrays;

public class Solution {

    public static int removeElement(int[] nums, int val) {

        int i=0;

        for(int j=0;j<nums.length;j++){

            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }

        }

        return i;
    }

    public static void main(String[] args) {
        int[] ints = {3, 2, 2, 3};

        int i = removeElement(ints,2);

        System.out.println(i);

        System.out.println(Arrays.toString(ints));
    }
}
