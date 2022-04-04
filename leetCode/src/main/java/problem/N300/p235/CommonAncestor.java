package problem.N300.p235;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pPath=getPath(root,p);
        List<TreeNode> qPath=getPath(root,q);
        TreeNode ancestor = null;
        for (int i = 0; i < pPath.size() && i < qPath.size(); i++) {
            if(pPath.get(i).val==qPath.get(i).val){
                ancestor=pPath.get(i);
            }else {
                break;
            }
        }

        return ancestor;
    }

    private List<TreeNode> getPath(TreeNode root, TreeNode target) {

        List<TreeNode> path = new ArrayList<>();
        while (root.val!=target.val){
            path.add(root);
            if(root.val<target.val){
                root=root.right;
            }else {
                root=root.left;
            }
        }
        path.add(root);

        return path;
    }
}
