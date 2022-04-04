package problem.N100.p18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1; j < length; j++) {
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l=length-1;
                while (k<l){
                    if(k>j+1&&nums[k]==nums[k-1]){
                        k++;
                        continue;
                    }
                    if(l<length-1&&nums[l]==nums[l+1]){
                        l--;
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    }
                    if(sum<target){
                        k++;
                    }else {
                        l--;
                    }
                }
            }

        }
        return result;
    }
}
