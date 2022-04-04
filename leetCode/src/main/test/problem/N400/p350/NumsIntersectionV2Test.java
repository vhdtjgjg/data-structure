package problem.N400.p350;

import common.ArrayBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumsIntersectionV2Test {

    private static final NumsIntersectionV2 NUMS_INTERSECTION_V_2=new NumsIntersectionV2();

    @Test
    public void intersect() {
        Assertions.assertThat(NUMS_INTERSECTION_V_2.intersect(ArrayBuilder.ofInt(1,2,2,1),ArrayBuilder.ofInt(2,2))).containsExactlyInAnyOrder(2,2);
        Assertions.assertThat(NUMS_INTERSECTION_V_2.intersect(ArrayBuilder.ofInt(4,9,5),ArrayBuilder.ofInt(9,4,9,8,4))).containsExactlyInAnyOrder(9,4);
    }
}