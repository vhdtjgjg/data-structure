package exec;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContinuousTest {

    private static final Continuous CONTINUOUS=new Continuous();

    @Test
    public void name() {
        Assertions.assertThat(CONTINUOUS.getList(9)).containsExactlyInAnyOrder(Lists.list(4,5),Lists.list(2,3,4));
        Assertions.assertThat(CONTINUOUS.getList(15)).containsExactlyInAnyOrder(
                Lists.list(1,2,3,4,5),
                Lists.list(4,5,6),
                Lists.list(7,8));
    }
}