package problem.n600.p530;

import common.TreeNode;

public class MinDiff {

    private int minDiff=100001;

    private int pre=-1;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return minDiff;
    }

    private void dfs(TreeNode root) {

        if (root==null) {
            return;
        }
        dfs(root.left);
        if(pre!=-1){
            minDiff=Math.min(root.val-pre,minDiff);
        }
        pre=root.val;
        dfs(root.right);
    }
}
