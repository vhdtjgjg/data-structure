package problem.n600.p557;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseWords() {
        Assertions.assertThat(new ReverseString().reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }
}