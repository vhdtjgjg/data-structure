package problem.N200.P101_symmetric_tree;

import common.TreeNode;
import org.junit.Test;

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode t1,TreeNode t2) {
        
        if(t1==null&&t2==null){
            return true;
        }
        
        if(t1==null||t2==null){
            return false;
        }
        
        return t1.val==t2.val&&isMirror(t1.left,t2.right)&&isMirror(t1.left,t2.right);
    }

    @Test
    public void test(){


    }
}
