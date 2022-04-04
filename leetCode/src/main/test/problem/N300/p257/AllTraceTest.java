package problem.N300.p257;

import common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllTraceTest {

    private static final AllTrace ALL_TRACE=new AllTrace();

    @Test
    public void test(){
        Assertions.assertThat(ALL_TRACE.binaryTreePaths(TreeNode.of(1,2,3,null,5))).containsExactlyInAnyOrder("1->2->5","1->3");
    }

}