package problem.N100.p18;

import common.ArrayBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class FourSumTest {

    private static final FourSum FOUR_SUM=new FourSum();

    @Test
    public void fourSum() {
        Assertions.assertThat(FOUR_SUM.fourSum(ArrayBuilder.ofInt(1,0,-1,0,-2,2),0))
                .containsExactlyInAnyOrder(
                        Arrays.asList(-2,-1,1,2),
                        Arrays.asList(-2,0,0,2),
                        Arrays.asList(-1,0,0,1));

        Assertions.assertThat(FOUR_SUM.fourSum(ArrayBuilder.ofInt(2,2,2,2,2),8))
                .containsExactlyInAnyOrder(Arrays.asList(2,2,2,2));
    }

}