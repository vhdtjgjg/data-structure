package problem.n600.p521;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LUSLengthTest {

    @Test
    public void findLUSlength() {
        Assertions.assertThat(new LUSLength().findLUSlength("aba","cdc")).isEqualTo(3);
        Assertions.assertThat(new LUSLength().findLUSlength("aaa","bbb")).isEqualTo(3);
        Assertions.assertThat(new LUSLength().findLUSlength("horbxeemlgqpqbujbdagizcfairalg","iwvtgyojrfhyzgyzeikqagpfjoaeen")).isEqualTo(30);
    }
}