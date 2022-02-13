package problem.N300.P226_invert_binary_tree;

import common.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return null;
        }

        TreeNode temp = root.left;

        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);


        return root;
    }
}
