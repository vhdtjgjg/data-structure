package problem.N200.P100_same_tree;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null&&q==null){
            return true;
        }

        if(p==null||q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }

        return isSameTree(p.right,p.right)&&isSameTree(p.left,q.left);
    }
}