package problem.N300.P219_contains_duplicate_ii;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=k+i&&j<nums.length;j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean containsNearbyDuplicateHash(int[] nums, int k) {

        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(length);

        for(int i=0;i<length;i++){
            boolean b = map.containsKey(nums[i]);
            if(b){
                Integer integer = map.get(nums[i]);
                if(i-integer<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }

        return false;
    }

    @Test
    public void test(){

        int[] nums={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicateHash(nums, k));
    }
}
