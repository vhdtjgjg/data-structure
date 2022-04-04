package problem.N700.p652;

import common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateSubtree {

    private final HashMap<String,Integer> freq=new HashMap<>();

    private final List<TreeNode> result=new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        freq.clear();
        result.clear();
        traverse(root);
        return result;
    }

    private String traverse(TreeNode root) {
        if(root==null){
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String treeStr="*"+left+"*"+right+"*"+root.val+"*";
        Integer count = freq.getOrDefault(treeStr, 0);
        if(count==1){
            result.add(root);
        }
        freq.put(treeStr,count+1);
        return treeStr;
    }
}
