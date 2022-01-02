package problem.N400.p345;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelReverserTest {

    private final static VowelReverser VOWEL_REVERSER=new VowelReverser();

    @Test
    public void reverseVowels() {
        Assert.assertEquals("holle",VOWEL_REVERSER.reverseVowels("hello"));
        Assert.assertEquals("leotcede",VOWEL_REVERSER.reverseVowels("leetcode"));
    }

    @Test
    public void reverseVowelsV2Swap() {
        Assert.assertEquals("holle",VOWEL_REVERSER.reverseVowelsV2Swap("hello"));
        Assert.assertEquals("leotcede",VOWEL_REVERSER.reverseVowelsV2Swap("leetcode"));
    }
}