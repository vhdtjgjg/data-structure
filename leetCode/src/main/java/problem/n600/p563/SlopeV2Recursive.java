package problem.n600.p563;

import common.TreeNode;

public class SlopeV2Recursive {

    int result=0;

    public int findTilt(TreeNode root) {

        sum(root);
        return result;
    }

    private int sum(TreeNode root) {
        if(root ==null){
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftSum=sum(left);
        int rightSum=sum(right);
        result+=Math.abs(leftSum-rightSum);
        return root.val+leftSum+rightSum;
    }
}
