package problem.N200.P108_convert_sorted_array_to_binary_search_tree;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {

        return buildBstTree(nums,0,nums.length-1);
    }

    private TreeNode buildBstTree(int[] nums, int left, int right) {

        if(left>right){
            return null;
        }

        int mid=(left+right+1)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left=buildBstTree(nums,left,mid-1);
        root.right=buildBstTree(nums,mid+1,right);


        return root;
    }
}
