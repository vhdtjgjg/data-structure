package problem.N500.p401;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BinaryWatchTest {

    private static final BinaryWatch BINARY_WATCH=new BinaryWatch();

    @Test
    public void readBinaryWatch() {
        Assertions.assertThat(BINARY_WATCH.readBinaryWatch(1)).containsExactlyInAnyOrder("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00");
    }
}