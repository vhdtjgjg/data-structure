package problem.N400.p367;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectSquareTest {

    private static final PerfectSquare PERFECT_SQUARE=new PerfectSquare();

    @Test
    public void isPerfectSquare() {
        Assertions.assertThat(PERFECT_SQUARE.isPerfectSquare(16)).isTrue();
        Assertions.assertThat(PERFECT_SQUARE.isPerfectSquare(14)).isFalse();
    }

    @Test
    public void isPerfectSquareV2Mid() {
        Assertions.assertThat(PERFECT_SQUARE.isPerfectSquareV2Mid(16)).isTrue();
        Assertions.assertThat(PERFECT_SQUARE.isPerfectSquareV2Mid(14)).isFalse();
    }
}