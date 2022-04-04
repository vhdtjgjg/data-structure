package problem.N400.p342;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourTest {

    private static final Four FOUR=new Four();

    @Test
    public void isPowerOfFour() {

        Assertions.assertThat(FOUR.isPowerOfFour(16)).isTrue();
        Assertions.assertThat(FOUR.isPowerOfFour(5)).isFalse();
        Assertions.assertThat(FOUR.isPowerOfFour(1)).isTrue();
    }
}