package problem.N900.p876;

import common.ListNodeUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleNodeTest {

    private static final MiddleNode MIDDLE_NODE=new MiddleNode();

    @Test
    public void middleNode() {
        Assertions.assertThat(MIDDLE_NODE.middleNode(ListNodeUtils.of(1,2,3,4,5))).isEqualTo(ListNodeUtils.of(3,4,5));
    }
}