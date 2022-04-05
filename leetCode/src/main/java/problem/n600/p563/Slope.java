package problem.n600.p563;

import common.TreeNode;

public class Slope {

    public int findTilt(TreeNode root) {

        if(root==null){
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftSum=sum(left);
        int rightSum=sum(right);

        return Math.abs(leftSum-rightSum)+findTilt(left)+findTilt(right);
    }


    private int sum(TreeNode node) {
        if(node==null){
            return 0;
        }
        return node.val+sum(node.left)+sum(node.right);
    }
}
