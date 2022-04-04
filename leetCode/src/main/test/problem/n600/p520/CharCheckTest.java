package problem.n600.p520;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCheckTest {

    @Test
    public void detectCapitalUse() {
        Assertions.assertThat(new CharCheck().detectCapitalUse("USA")).isTrue();
        Assertions.assertThat(new CharCheck().detectCapitalUse("FlaG")).isFalse();
        Assertions.assertThat(new CharCheck().detectCapitalUse("G")).isTrue();
    }
}