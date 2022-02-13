package problem.N100.p94;

import common.TreeNode;

import java.util.*;

public class TraversalInorder {
    public List<Integer> inorderTraversalVRecursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public List<Integer> inorderTraversalVStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        while (Objects.nonNull(root)||!deque.isEmpty()){
            while (Objects.nonNull(root)){
                deque.push(root);
                root=root.left;
            }
            root = deque.pop();
            result.add(root.val);
            root=root.right;
        }
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (Objects.isNull(node)) {
            return;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}
