package problem.N100.p16;

import common.ArrayBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosetTest {

    private static final ThreeSumCloset THREE_SUM_CLOSET=new ThreeSumCloset();

    @Test
    public void threeSumClosest() {
        Assertions.assertThat(THREE_SUM_CLOSET.threeSumClosest(ArrayBuilder.ofInt(-1,2,1,-4),1)).isEqualTo(2);
        Assertions.assertThat(THREE_SUM_CLOSET.threeSumClosest(ArrayBuilder.ofInt(1,2,4,8,16,32,64,128),82)).isEqualTo(82);
    }
}