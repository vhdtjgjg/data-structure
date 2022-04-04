package problem.N900.p889;

import common.ArrayBuilder;
import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrePostTreeTest {

    private final static PrePostTree PRE_POST_TREE = new PrePostTree();

    @Test
    public void constructFromPrePost() {
        Assertions.assertThat(PRE_POST_TREE.constructFromPrePost(ArrayBuilder.ofInt(1, 2, 4, 5, 3, 6, 7), ArrayBuilder.ofInt(4, 5, 2, 6, 7, 3, 1))).isEqualTo(TreeNode.of(1, 2, 3, 4, 5, 6, 7));
    }
}