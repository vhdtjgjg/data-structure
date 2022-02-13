package problem.N500.p413;

public class Slice {

    public int numberOfArithmeticSlices(int[] nums) {

        if (nums.length==1) {
            return 0;
        }
        int d = nums[0] - nums[1];
        int td=0;
        int result=0;
        for (int i = 2; i < nums.length; i++) {
            int diff = nums[i-1] - nums[i];
            if(diff ==d){
                td++;
            }else {
                d=diff;
                td=0;
            }
            result+=td;
        }
        return result;
    }
}
