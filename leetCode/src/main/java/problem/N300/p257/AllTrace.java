package problem.N300.p257;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllTrace {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();
        binaryTreePaths(root,result,new StringBuilder());
        return result;
    }

    private void binaryTreePaths(TreeNode root, List<String> result,StringBuilder stringBuilder) {

        if(root==null){
            return;
        }
        stringBuilder.append(root.val);
        if(root.left==null&&root.right==null){
            result.add(stringBuilder.toString());
        }else {
            stringBuilder.append("->");
            binaryTreePaths(root.left,result,new StringBuilder(stringBuilder));
            binaryTreePaths(root.right,result,new StringBuilder(stringBuilder));
        }



    }
}
