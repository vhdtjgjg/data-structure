package problem.N300.p268;

import java.util.Arrays;

public class LostNum {

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        if(nums[0]!=0){
            return 0;
        }

        int length = nums.length;
        for(int i = length -1; i>0; i--){
            if(nums[i]!=nums[i-1]+1){
                return nums[i-1]+1;
            }
        }
        return length;
    }
}
