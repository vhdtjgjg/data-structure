package problem.N300.p283;

public class NumMover {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        int nonZeroIndex = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        for (int i = nonZeroIndex; i < length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesV2(int[] nums) {
        if (nums == null) {
            return;
        }
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        int firstZeroIndex = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                int temp=nums[i];
                nums[i]=nums[firstZeroIndex];
                nums[firstZeroIndex++]=temp;

            }
        }

    }
}
