package problem.N200.P112_path_sum;

public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {


        if(root==null){
            return false;
        }

        targetSum = addValue(root, targetSum);

        return targetSum==0&&root.left==null&&root.right==null||hasPathSum(root.left,targetSum)||hasPathSum(root.right,targetSum);
    }

    private int addValue(TreeNode root,int targetSum) {

        if(root==null){
            return targetSum;
        }

        return targetSum-root.val;
    }
}
