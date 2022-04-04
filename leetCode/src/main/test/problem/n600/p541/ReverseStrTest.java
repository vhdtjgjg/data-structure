package problem.n600.p541;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStrTest {

    @Test
    public void reverseStr() {
        Assertions.assertThat(new ReverseStr().reverseStr("abcdefg",2)).isEqualTo("bacdfeg");
        Assertions.assertThat(new ReverseStr().reverseStr("abcd",2)).isEqualTo("bacd");
    }
}