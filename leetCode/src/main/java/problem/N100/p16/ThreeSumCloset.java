package problem.N100.p16;

import java.util.Arrays;

public class ThreeSumCloset {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int bestResult=10001;
        for (int i = 0; i < nums.length; i++) {
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum==target) {
                    return target;
                }
                if (Math.abs(bestResult-target)>Math.abs(sum-target)) {
                    bestResult=sum;
                }
                if (sum>target) {
                    while (right-1>left&&nums[right-1]==nums[right]){
                        right--;
                    }
                    right--;
                }else {
                    while (left+1<right&&nums[left+1]==nums[left]){
                        left++;
                    }
                    left++;
                }
            }
        }
        return bestResult;
    }
}
