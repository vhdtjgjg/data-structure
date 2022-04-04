package problem.N400.p374;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumTest {

    @Test
    public void guessNumber() {
        GuessNum guessNum = new GuessNum(6);
        Assertions.assertThat(guessNum.guessNumber(10)).isEqualTo(guessNum.getPick());
    }

    @Test
    public void guessNumber2() {
        GuessNum guessNum = new GuessNum(1);
        Assertions.assertThat(guessNum.guessNumber(1)).isEqualTo(guessNum.getPick());
    }
}