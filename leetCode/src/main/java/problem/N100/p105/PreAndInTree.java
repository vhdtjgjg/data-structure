package problem.N100.p105;

import common.TreeNode;

import java.util.Arrays;

public class PreAndInTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder==null||preorder.length<1){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int inRootIndex=getIndexByValue(inorder,preorder[0]);
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, inRootIndex);
        int[] inorderRight = Arrays.copyOfRange(inorder, inRootIndex+1, inorder.length);
        int[] preorderLeft = Arrays.copyOfRange(preorder, 1, 1 + inorderLeft.length);
        int[] preorderRight = Arrays.copyOfRange(preorder, 1 + inorderLeft.length, preorder.length);
        root.left=buildTree(preorderLeft,inorderLeft);
        root.right=buildTree(preorderRight,inorderRight);
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
