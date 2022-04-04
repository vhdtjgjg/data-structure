package problem.N500.p404;

import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftLeafSumTest {

    private static final LeftLeafSum LEFT_LEAF_SUM=new LeftLeafSum();

    @Test
    public void sumOfLeftLeaves() {
        Assertions.assertThat(LEFT_LEAF_SUM.sumOfLeftLeaves(TreeNode.of(3,9,20,null,null,15,7))).isEqualTo(24);
    }
}