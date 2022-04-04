package problem.N100.p17;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PhoneNumMapTest {

    private static final PhoneNumMap PHONE_NUM_MAP=new PhoneNumMap();

    @Test
    public void letterCombinations() {
        Assertions.assertThat(PHONE_NUM_MAP.letterCombinations("23")).containsExactlyInAnyOrder("ad","ae","af","bd","be","bf","cd","ce","cf");
        Assertions.assertThat(PHONE_NUM_MAP.letterCombinations("2")).containsExactlyInAnyOrder("a","b","c");
    }
}