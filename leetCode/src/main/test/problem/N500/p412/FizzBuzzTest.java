package problem.N500.p412;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class FizzBuzzTest {

    private static final FizzBuzz FIZZ_BUZZ=new FizzBuzz();

    @Test
    public void fizzBuzz() {
        Assertions.assertThat(FIZZ_BUZZ.fizzBuzz(3)).isEqualTo(Arrays.asList("1","2","Fizz"));
        Assertions.assertThat(FIZZ_BUZZ.fizzBuzz(5)).isEqualTo(Arrays.asList("1","2","Fizz","4","Buzz"));
        Assertions.assertThat(FIZZ_BUZZ.fizzBuzz(15)).isEqualTo(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));
    }
}