package problem.N400.p349;

import common.ArrayBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NumsIntersectionTest {

    private static final NumsIntersection NUMS_INTERSECTION=new NumsIntersection();

    @Test
    public void intersection() {
        Assertions.assertThat(NUMS_INTERSECTION.intersection(ArrayBuilder.ofInt(1,2,2,1),ArrayBuilder.ofInt(2,2))).containsExactlyInAnyOrder(2);
        Assertions.assertThat(NUMS_INTERSECTION.intersection(ArrayBuilder.ofInt(4,9,5),ArrayBuilder.ofInt(9,4,9,8,4))).containsExactlyInAnyOrder(9,4);
    }
}