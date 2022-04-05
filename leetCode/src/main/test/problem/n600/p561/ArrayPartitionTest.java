package problem.n600.p561;

import common.ArrayBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArrayPartitionTest {

    @Test
    public void arrayPairSum() {
        Assertions.assertThat(new ArrayPartition().arrayPairSum(ArrayBuilder.ofInt(1,4,3,2))).isEqualTo(4);
    }
}