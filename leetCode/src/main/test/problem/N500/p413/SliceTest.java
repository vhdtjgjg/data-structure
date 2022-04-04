package problem.N500.p413;

import common.ArrayBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SliceTest {

    private static final Slice SLICE=new Slice();

    @Test
    public void numberOfArithmeticSlices() {
        Assertions.assertThat(SLICE.numberOfArithmeticSlices(ArrayBuilder.ofInt(1,2,3,4))).isEqualTo(3);
        Assertions.assertThat(SLICE.numberOfArithmeticSlices(ArrayBuilder.ofInt(1))).isEqualTo(0);
    }
}