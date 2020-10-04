package exec;

import java.lang.annotation.Target;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums=new int[]{};
        int target=0;
        searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return 0;
    }
}
