package problem.N400.p303;

public class NumArrayV2 {

    int[] preNums;

    public NumArrayV2(int[] nums) {
        preNums=new int[nums.length+1];
        for(int i=0,len=nums.length;i<len;i++){
            preNums[i+1]=preNums[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {

        return preNums[right+1]-preNums[left];
    }
}
