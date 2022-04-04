package problem.N100.p105;

import common.ArrayBuilder;
import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PreAndInTreeTest {

    private static final PreAndInTree PRE_AND_IN_TREE=new PreAndInTree();

    @Test
    public void buildTree() {
        Assertions.assertThat(PRE_AND_IN_TREE.buildTree(ArrayBuilder.ofInt(3,9,20,15,7),ArrayBuilder.ofInt(9,3,15,20,7))).isEqualTo(TreeNode.of(3,9,20,null,null,15,7));
    }
}