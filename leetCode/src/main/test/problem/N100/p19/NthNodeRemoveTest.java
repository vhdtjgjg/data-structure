package problem.N100.p19;

import common.ListNodeUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthNodeRemoveTest {

    private static final NthNodeRemove NTH_NODE_REMOVE=new NthNodeRemove();

    @Test
    public void removeNthFromEnd() {
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEnd(ListNodeUtils.of(1,2,3,4,5),2)).isEqualTo(ListNodeUtils.of(1,2,3,5));
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEnd(ListNodeUtils.of(1),1)).isEqualTo(ListNodeUtils.of());
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEnd(ListNodeUtils.of(1,2),1)).isEqualTo(ListNodeUtils.of(1));
    }

    @Test
    public void removeNthFromEndVForLoop() {
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVForLoop(ListNodeUtils.of(1,2,3,4,5),2)).isEqualTo(ListNodeUtils.of(1,2,3,5));
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVForLoop(ListNodeUtils.of(1),1)).isEqualTo(ListNodeUtils.of());
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVForLoop(ListNodeUtils.of(1,2),1)).isEqualTo(ListNodeUtils.of(1));
    }

    @Test
    public void removeNthFromEndVStack() {
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVStack(ListNodeUtils.of(1,2,3,4,5),2)).isEqualTo(ListNodeUtils.of(1,2,3,5));
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVStack(ListNodeUtils.of(1),1)).isEqualTo(ListNodeUtils.of());
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVStack(ListNodeUtils.of(1,2),1)).isEqualTo(ListNodeUtils.of(1));
    }

    @Test
    public void removeNthFromEndVDoublePoint() {
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVDoublePoint(ListNodeUtils.of(1,2,3,4,5),2)).isEqualTo(ListNodeUtils.of(1,2,3,5));
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVDoublePoint(ListNodeUtils.of(1),1)).isEqualTo(ListNodeUtils.of());
        Assertions.assertThat(NTH_NODE_REMOVE.removeNthFromEndVDoublePoint(ListNodeUtils.of(1,2),1)).isEqualTo(ListNodeUtils.of(1));
    }
}