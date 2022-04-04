package problem.N100.p15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> integers;
        for (int first = 0; first < nums.length; first++) {
            if (first != 0 && nums[first - 1] == nums[first]) {
                continue;
            }
            int third=nums.length-1;
            int target=-nums[first];
            for (int second = first+1; second < nums.length; second++) {
                if(second>first+1&&nums[second-1]==nums[second]){
                    continue;
                }
                while (second<third&&nums[second]+nums[third]>target){
                    third--;
                }
                if(second==third){
                    break;
                }
                if(nums[second]+nums[third]==target){
                    integers=new ArrayList<>(4);
                    integers.add(nums[first]);
                    integers.add(nums[second]);
                    integers.add(nums[third]);
                    result.add(integers);
                }
            }
        }
        return result;
    }
}
