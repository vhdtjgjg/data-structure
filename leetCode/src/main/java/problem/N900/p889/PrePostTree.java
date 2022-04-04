package problem.N900.p889;

import common.TreeNode;

import java.util.Arrays;

public class PrePostTree {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        if(preorder==null||preorder.length==0){
            return null;
        }
        int rootVal = preorder[0];
        TreeNode treeNode = new TreeNode(rootVal);
        if(preorder.length==1){
            return treeNode;
        }

        int index = getIndexByValue(postorder, preorder[1]);
        int[] postLeft = Arrays.copyOfRange(postorder, 0, index + 1);
        int[] postRight = Arrays.copyOfRange(postorder, index+1, postorder.length-1);
        int[] preLeft = Arrays.copyOfRange(preorder, 1, postLeft.length + 1);
        int[] preRight = Arrays.copyOfRange(preorder, postLeft.length + 1, preorder.length );
        treeNode.left=constructFromPrePost(preLeft,postLeft);
        treeNode.right=constructFromPrePost(preRight,postRight);
        return treeNode;
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
