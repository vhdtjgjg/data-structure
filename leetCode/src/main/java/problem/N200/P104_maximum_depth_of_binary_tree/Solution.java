package problem.N200.P104_maximum_depth_of_binary_tree;

import common.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        int hLeft = maxDepth(root.left);
        int hRight= maxDepth(root.right);

        return Math.max(hLeft,hRight)+1;
    }
}
