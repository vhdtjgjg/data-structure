package problem.n600.p530;

import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiffTest {

    @Test
    public void getMinimumDifference() {

        Assertions.assertThat(new MinDiff().getMinimumDifference(TreeNode.of(4,2,6,1,3))).isEqualTo(1);
        Assertions.assertThat(new MinDiff().getMinimumDifference(TreeNode.of(1,0,48,null,null,12,49))).isEqualTo(1);
        Assertions.assertThat(new MinDiff().getMinimumDifference(TreeNode.of(236,104,701,null,227,null,911))).isEqualTo(9);
    }
}