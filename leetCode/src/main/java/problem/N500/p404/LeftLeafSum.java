package problem.N500.p404;

import common.TreeNode;

public class LeftLeafSum {

    private int sum;

    public int sumOfLeftLeaves(TreeNode root) {

        sum = 0;
        traverser(root);
        return sum;
    }

    private int traverser(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        sum += traverser(root.left);
        traverser(root.right);
        return 0;
    }
}
