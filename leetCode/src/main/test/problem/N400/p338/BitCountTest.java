package problem.N400.p338;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitCountTest {

    private final static BitCount  BIT_COUNT=new BitCount();

    @Test
    public void countBits() {
        Assertions.assertThat(BIT_COUNT.countBits(2)).containsExactly(0,1,1);
        Assertions.assertThat(BIT_COUNT.countBits(5)).containsExactly(0,1,1,2,1,2);

    }
}