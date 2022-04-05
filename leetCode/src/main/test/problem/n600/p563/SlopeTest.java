package problem.n600.p563;

import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlopeTest {

    @Test
    public void findTilt() {
        Assertions.assertThat(new Slope().findTilt(TreeNode.of(1,2,3))).isEqualTo(1);
        Assertions.assertThat(new Slope().findTilt(TreeNode.of(4,2,9,3,5,null,7))).isEqualTo(15);
    }
}