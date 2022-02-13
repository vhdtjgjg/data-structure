package problem.N100.p94;

import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class TraversalInorderTest {

    private static final TraversalInorder TRAVERSAL_INORDER = new TraversalInorder();

    @Test
    public void inorderTraversalVRecursive() {

        Assertions.assertThat(TRAVERSAL_INORDER.inorderTraversalVRecursive(TreeNode.of(1, null, 2, 3))).isEqualTo(Lists.list(1, 3, 2));
        Assertions.assertThat(TRAVERSAL_INORDER.inorderTraversalVRecursive(TreeNode.of())).isEqualTo(Lists.list());
        Assertions.assertThat(TRAVERSAL_INORDER.inorderTraversalVRecursive(TreeNode.of(1))).isEqualTo(Lists.list(1));
    }

    @Test
    public void inorderTraversalVStack() {

        Assertions.assertThat(TRAVERSAL_INORDER.inorderTraversalVStack(TreeNode.of(1, null, 2, 3))).isEqualTo(Lists.list(1, 3, 2));
        Assertions.assertThat(TRAVERSAL_INORDER.inorderTraversalVStack(TreeNode.of())).isEqualTo(Lists.list());
        Assertions.assertThat(TRAVERSAL_INORDER.inorderTraversalVStack(TreeNode.of(1))).isEqualTo(Lists.list(1));
    }
}