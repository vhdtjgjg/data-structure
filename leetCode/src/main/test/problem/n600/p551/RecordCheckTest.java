package problem.n600.p551;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordCheckTest {

    @Test
    public void checkRecord() {
        Assertions.assertThat(new RecordCheck().checkRecord("PPALLP")).isTrue();
        Assertions.assertThat(new RecordCheck().checkRecord("PPALLL")).isFalse();
    }
}