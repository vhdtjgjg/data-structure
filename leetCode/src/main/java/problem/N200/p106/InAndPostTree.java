package problem.N200.p106;

import common.TreeNode;

import java.util.Arrays;

public class InAndPostTree {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if(postorder==null||postorder.length<1){
            return null;
        }
        int rootValue = postorder[postorder.length - 1];
        int inRootIndex = getIndexByValue(inorder, rootValue);
        int[] inLeft = Arrays.copyOfRange(inorder, 0, inRootIndex);
        int[] inRight = Arrays.copyOfRange(inorder, inRootIndex+1, inorder.length);
        int[] postLeft = Arrays.copyOfRange(postorder, 0, inLeft.length);
        int[] postRight = Arrays.copyOfRange(postorder, inLeft.length, postorder.length-1);
        TreeNode root = new TreeNode(rootValue);
        root.left=buildTree(inLeft,postLeft);
        root.right=buildTree(inRight,postRight);
        return root;
    }

    private int getIndexByValue(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==value){
                return i;
            }
        }
        return -1;
    }
}
