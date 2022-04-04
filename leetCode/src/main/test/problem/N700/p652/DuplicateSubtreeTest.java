package problem.N700.p652;

import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DuplicateSubtreeTest {

    private static final DuplicateSubtree DUPLICATE_SUBTREE=new DuplicateSubtree();

    @Test
    public void findDuplicateSubtrees() {
        Assertions.assertThat(DUPLICATE_SUBTREE.findDuplicateSubtrees(TreeNode.of(1,2,3,4,null,2,4,null,null,4))).containsExactlyInAnyOrder(TreeNode.of(2,4),TreeNode.of(4));
        Assertions.assertThat(DUPLICATE_SUBTREE.findDuplicateSubtrees(TreeNode.of(10,2,22,1,12,1,1))).containsExactlyInAnyOrder(TreeNode.of(1));
    }
}