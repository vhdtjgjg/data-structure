package problem.NO26;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static int removeDuplicates(int[] nums) {

        int len=nums.length;

        if(len==0){
            return 0;
        }

        int j=0;

        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }

        return j+1;
    }

    public static void main(String[] args) {
        int[] ints = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int i = removeDuplicates(ints);

        System.out.println(i);

        System.out.println(Arrays.toString(ints));
    }

}
