package problem.N200.p106;

import common.ArrayBuilder;
import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class InAndPostTreeTest {

    private static final InAndPostTree IN_AND_POST_TREE = new InAndPostTree();

    @Test
    public void buildTree() {
        Assertions.assertThat(IN_AND_POST_TREE.buildTree(ArrayBuilder.ofInt(9, 3, 15, 20, 7), ArrayBuilder.ofInt(9, 15, 7, 20, 3))).isEqualTo(TreeNode.of(3, 9, 20, null, null, 15, 7));
    }
}